package controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.UserDao;
import pojo.User;
import pojo.Login;
import pojo.Register;
import service.UserService;

@Controller 
@RequestMapping ("/user")
public class UserController {

	private static final Log logger= LogFactory.getLog(UserController.class); 
	
	@Autowired 
	private UserService userService;
	
	@Autowired 
	private UserDao userdao;
	
	@RequestMapping(value="/login")
	public String loginUser(Model model) {
		
		model.addAttribute ("login", new Login()) ;
		return "login";
	}
	@RequestMapping(value="/valid") 
	public String valid(@Valid @ModelAttribute Login login,BindingResult result, Model model,HttpSession session) {
		if (result.hasErrors()) {
			return "login";
		}
		User map = userdao.selectUserByid(login.getUserName());
		if(userService.valid(login, map)) {
			return "login";
		}
		model.addAttribute("user", map);
		session.setAttribute("username", login.getUserName());
		return "index";
	}
	@RequestMapping(value="/loginUser") 
	public String login(Model model,HttpSession session) {
		
		User mapx = userdao.selectUserByid(session.getAttribute("username").toString());
		model.addAttribute("user", mapx);
		return "index";
	}
	@RequestMapping(value="/register") 
	public String inputUser(Model model) { 
		HashMap<String,String> hobbys = new HashMap<String, String>(); 
		hobbys.put("篮球","篮球 ");
		hobbys.put("乒乓球","乒乓球 ");
		hobbys.put("电玩", "电玩 ");
		hobbys.put("游泳","游泳 ");
		
		model.addAttribute ("register", new Register()) ; 
		model.addAttribute ("hobbys" , hobbys) ; 
		model.addAttribute ("carrers" , new String[]{"教师 ","学生 ","搬运工 ","IT民工 " ,"其他 " });
		model.addAttribute ("houseRegisters", new String[] {"北京 ","上海 ","广州 ","深圳 ","其他 "});
		return "register";
	}
	@RequestMapping(value="/save") 
	public String addUser(@Valid @ModelAttribute Register register,BindingResult result, Model model) { 
		if (result.hasErrors()) {
			logger.info("失败");
			HashMap<String, String> hobbys = new HashMap<String, String>() ; 
			hobbys.put ("篮球","篮球 ");
			hobbys.put ("乒乓球","乒乓球 "); 
			hobbys.put ("电玩","电玩 ");
			hobbys.put ("游泳","游泳 ");
			model.addAttribute ("hobbys", hobbys); 
			model.addAttribute ("carrers", new String[]{"教师 ","学生 ","搬运工 ","IT民工 ","其他 "});
			model.addAttribute ("houseRegisters", new String[] {"北京 ","上海 " ," 广州  "," 深圳 ","其他 "}) ; 
			return "register";
		}
		User maps = userdao.selectUserByid(register.getUserName());
		if(maps==null) {
			String string="";
			String temp="";
			for(String s:register.getHobby())
				string=string+s+",";
			for(String st:register.getFriends())
				temp=temp+st+",";
			User user=new User();
			user.setUser(register.getUserName());
			user.setPass(register.getPassWord());
			user.setHob(string);
			user.setFri(temp);
			user.setCar(register.getCarrer());
			user.setHouse(register.getHouseRegister());
			user.setRem(register.getRemark());
			Integer i=userdao.addUser(user);
			if(i>0)	{
				JOptionPane.showMessageDialog(null,"注册成功","注册！",JOptionPane.PLAIN_MESSAGE);
				return "redirect:/user/login";
				}
			else {
				JOptionPane.showMessageDialog(null,"导入数据库时失败！","注册",JOptionPane.PLAIN_MESSAGE);
				return "redirect:/user/register";
				}
		}
		else {
			JOptionPane.showMessageDialog(null,"用户名已存在，请重新注册！","注册",JOptionPane.PLAIN_MESSAGE);
			return "redirect:/user/register";
		}
	}
	@RequestMapping(value ="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		JOptionPane.showMessageDialog(null,"注销成功！","用户",JOptionPane.PLAIN_MESSAGE);
		return "redirect:/user/login";
	}
	
	
}
