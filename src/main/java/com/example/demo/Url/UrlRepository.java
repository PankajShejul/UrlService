package com.example.demo.Url;

import org.springframework.data.repository.CrudRepository;

public interface UrlRepository extends CrudRepository<Url,Long> {
	public Url findByHash(String hash);
	
}
