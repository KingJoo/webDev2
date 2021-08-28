package com.sist.model;

import javax.servlet.http.HttpServletRequest;
import java.util.*;
import com.sist.dao.*;
public class MusicGenieModel implements Model{

	@Override
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		MusicDAO dao=new MusicDAO();
		List<MusicVO> list=dao.musicListData("genie_cjw");
		request.setAttribute("list", list);
		request.setAttribute("main_jsp", "../music/genie.jsp");
		return "main/main.jsp";//메뉴/footer
	}

}
