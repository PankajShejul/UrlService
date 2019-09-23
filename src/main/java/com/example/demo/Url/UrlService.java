package com.example.demo.Url;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
	@Autowired
	private UrlRepository urlRepository;
	
	

	public String shortenValue(String str) {
		Integer hash = Math.abs(str.hashCode());
		
		urlRepository.save(new Url(str,hash.toString()));
		return hash.toString();
	}



	public String redirectToPage(String hash) {
		Url url=urlRepository.findByHash(hash);
		System.out.println(url);
		String str = url.getGivenUrl();
		return str;
	}

}
