package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.ServletException;

public class UrlErrorFilter implements Filter{
	public void init(FilterConfig config)throws ServletException{}
	public void destroy(){}
	
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws ServletException,IOException{
		String flag = req.getParameter("flag");
		
		if(flag==null){
			RequestDispatcher dis = req.getRequestDispatcher("/e.html");
			dis.forward(req,res);
		}else{
			chain.doFilter(req.res);
		}
	}
}