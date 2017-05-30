package member.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.dao.MemberDAO;
import model.Member;

public class MemberLoginAttemptAction implements MemberAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO mDao = MemberDAO.getInstance();
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String hashPass = mDao.getHashPassword(pass);
		
		Member member = mDao.selectMember(id);
		String url = "/showMsg.jsp";
		if(member != null && hashPass.equals(member.getM_pass())){
			request.getSession().setAttribute("MEMBER", id);
			url = "/main.jsp";
		}else{
			request.setAttribute("msg", "아이디와 비밀번호를 확인하세요");
			request.setAttribute("loc", "javascript:history.back()");
		}
		
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
