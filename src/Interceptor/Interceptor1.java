package Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class Interceptor1 implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response , Object handler) throws Exception { 
			System.out.println(" Interceptor1 preHandle ����ִ��");
			response.setContentType("text/html; charset=UTF-8");
			HttpSession session =request.getSession();
			if(session.getAttribute("username")==null) {
				return true;
			}
			response.getWriter().print("<script type='text/javascript'>alert('���ѵ�¼�����ȷ����ת���û�����');window.location.href='http://localhost:3380/loginSpringMVC/user/loginUser'</script>");
			return false ;
	}
}
