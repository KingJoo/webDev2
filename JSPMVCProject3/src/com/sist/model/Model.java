package com.sist.model;

import javax.servlet.http.HttpServletRequest;

public interface Model {
	//jsp에 출력할 수 있는 기능
	public String _jspService(HttpServletRequest request);
}
