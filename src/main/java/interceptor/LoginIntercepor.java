package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import po.Employee;
import service.impl.EmployeeService;

public class LoginIntercepor implements HandlerInterceptor {
	@Autowired
	private EmployeeService employeeService;
	/**
	 *用户登录
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession httpSession=request.getSession();
		String username=(String) httpSession.getAttribute("username");
		String password=(String) httpSession.getAttribute("password");
		if(username!=null){
			try {
				if(employeeService.check(username, password)){
					return true;
				}
				
			} catch (Exception e) {
				//记录日志
				request.getRequestDispatcher("/WEB-INF/jsp/login2.jsp").forward(request, response);
				return false;
			}
		
		}
		request.getRequestDispatcher("/WEB-INF/jsp/login2.jsp").forward(request, response);
		return false;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
