package com.example.demo.Url;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class UrlController {
	@Autowired
	private UrlService urlService;
	
	@RequestMapping(method=RequestMethod.POST,value="/shorten")
	public String shortenValue(@RequestBody String url) {
		return urlService.shortenValue(url);
	}
	
	@RequestMapping("/{hash}")
	public RedirectView redirectToPage(@PathVariable String hash)
	{
		RedirectView rd = new RedirectView();
		rd.setUrl("http://"+urlService.redirectToPage(hash));
		return rd;
	}

}
