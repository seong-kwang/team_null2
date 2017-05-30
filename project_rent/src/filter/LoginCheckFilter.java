package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCheckFilter implements Filter{

	@Override
	public void init(FilterConfig config) throws ServletException {
		
	}
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest)request).getSession();
		//요청이 들어오면 여기서 로그인 확인
		//session에 MEMBER가 있으면 게시판으로 이동.
		boolean isLogin = false;
		
		if(session != null && session.getAttribute("MEMBER") != null){
			//로그인 상태이다.
			isLogin = true;
		}
		
		if(isLogin){
			chain.doFilter(request, response);
		}else{
			//로그인x
			((HttpServletResponse)response).sendRedirect("HelloServlet?command=hello");
		}
	}
}
