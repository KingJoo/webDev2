package com.sist.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sist.model.*;
import java.util.*;

@WebServlet("*.do")//URL Pattern -> 해당 서블릿(컨트롤러)을 찾는 경우 프로그래머가 지정
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map clsMap=new HashMap();
	String[] strCmd= {
			"list.do",
			"update.do",
			"insert.do",
			"delete.do"
	};
	String[] strCls= {
			"com.sist.model.ListModel",
			"com.sist.model.UpdateModel",
			"com.sist.model.InsertModel",
			"com.sist.model.DeleteModel"
	};
	
	public void init() throws ServletException {
		try {
			for(int i=0;i<strCmd.length;i++) {
				//Model클래스를 메모리에 할당
				Class clsName=Class.forName(strCls[i]);
				//리플렉션 -> 클래스 이름으로 메모리 할당
				Object obj=clsName.getConstructor().newInstance(); //new
				clsMap.put(strCmd[i], obj);
			}
		} catch (Exception e) {}
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 사용자가 요청한 클래스 찾기 -> 요청처리 -> jsp로 request전송 -> jsp실행 결과를 컨트롤러가 읽어서 출
		String cmd=request.getRequestURI();
		cmd=cmd.substring(request.getContextPath().length()+1);
		Model model=(Model)clsMap.get(cmd);
		String jsp=model._jspService(request);
		RequestDispatcher rd=request.getRequestDispatcher(jsp);
		rd.forward(request,response);
	}

}
