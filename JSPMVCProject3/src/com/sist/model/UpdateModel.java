package com.sist.model;

import javax.servlet.http.HttpServletRequest;

public class UpdateModel implements Model {
	public String _jspService(HttpServletRequest request) {
		//request에 값을 실어줌 -> JSP에서 출력 -> 컨트롤러가 출력된 결과를 화면에 출력
		String msg="<center><h1>update</h1></center>";
		request.setAttribute("msg", msg);
		return "view/update.jsp";
	}
}
