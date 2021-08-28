package com.sist.model;

import javax.servlet.http.HttpServletRequest;

public class MainModel implements Model{

	@Override
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		request.setAttribute("main_jsp", "../main/default.jsp");//include되는 파일전송 
		return "main/main.jsp";
	}

}
