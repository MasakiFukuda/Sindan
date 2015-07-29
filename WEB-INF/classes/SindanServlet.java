import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Bean;

public class SindanServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		req.setCharacterEncoding("Windows-31J");
		String name=req.getParameter("name");
		int point=Integer.parseInt(req.getParameter("point"));
		
		
		int number=Judge.doJudge(point);
		
		Selector os=new OracleSelector();
		os.createConnector();
		Bean b=new Bean();
		b=os.getSelect(number,name);
		req.setAttribute("bean",b);
		RequestDispatcher dispatcher=req.getRequestDispatcher("show.jsp");
		dispatcher.forward(req,res);
	}
}