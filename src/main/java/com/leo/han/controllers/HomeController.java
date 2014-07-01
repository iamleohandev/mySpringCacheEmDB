package com.leo.han.controllers;

import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.leo.han.beans.CacheBean;
import com.leo.han.services.ListItemService;

@Controller
public class HomeController {

	@Autowired
	private ListItemService listItemService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goHome() {

		return "home";
	}

	@RequestMapping(value = "/control", method = RequestMethod.GET)
	public String goControl(HttpServletRequest request, Model model) {
		Locale locale = RequestContextUtils.getLocale(request);

		Map<String, String> item1 = listItemService.getList1Items(locale.toString(), listItemService);
		Map<String, String> item2 = listItemService.getList2Items(locale.toString(), listItemService);
		Map<String, String> item3 = listItemService.getList3Items(locale.toString(), listItemService);
		Map<String, String> item4 = listItemService.getList4Items(locale.toString(), listItemService);
		
		CacheBean cacheBean = new CacheBean();
		model.addAttribute("item1", item1);
		model.addAttribute("item2", item2);
		model.addAttribute("item3", item3);
		model.addAttribute("item4", item4);
		model.addAttribute("cacheBean", cacheBean);
		
		CacheBean bb= new CacheBean();
		
		bb.setItem1_content("hanxu");
		
		model.addAttribute("mytest", "i am leo han");

		

		
		HttpSession session = request.getSession();
		
		
		session.setAttribute("bb", bb);
		session.setAttribute("cc", "I am leo han hanhan ");
		
		

		return "control";
	}

	
	@RequestMapping(value = "/controlresult", method = RequestMethod.POST)
	public String goControlResult(CacheBean cacheBean, HttpServletRequest request) {

	
		

		HttpSession session = request.getSession();
		
		CacheBean bb= (CacheBean)session.getAttribute("bb");
		String cc = (String)session.getAttribute("cc");
		
		return "controlresult";
	}
}
