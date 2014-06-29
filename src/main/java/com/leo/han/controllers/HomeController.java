package com.leo.han.controllers;

import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.leo.han.beans.CacheBean;
import com.leo.han.services.CacheService;

@Controller
public class HomeController {

	@Autowired
	private CacheService cacheService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goHome() {

		return "home";
	}

	@RequestMapping(value = "/control", method = RequestMethod.GET)
	public String goControl(HttpServletRequest request, Model model) {
		Locale locale = RequestContextUtils.getLocale(request);

		Map<String, String> items = cacheService.getItems(locale.toString());
		Map<String, String> persons = cacheService.getPersons(locale.toString());
		
		CacheBean cacheBean = new CacheBean();
		
		model.addAttribute("items", items);
		model.addAttribute("persons", persons);
		model.addAttribute("cacheBean", cacheBean);

		return "control";
	}

}
