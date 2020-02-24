package com.douzone.guestbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuestbookController {

	@RequestMapping("")
	public String index() {
		return "/WEB-INF/views/index.jsp";
	}
}
