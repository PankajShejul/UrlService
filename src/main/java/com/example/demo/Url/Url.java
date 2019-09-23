package com.example.demo.Url;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Url {
	@Id
	@GeneratedValue()
	private Long Id;
	private String hash;
	private String givenUrl;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDateTime;
	
	//private Date expirationDateTime;
	
	private Integer clicks;

	public Url() {
		
	}
	public Url(String givenUrl, String createdUrl) {
		super();
		
		this.givenUrl = givenUrl;
		this.hash = createdUrl;
		//this.creationDateTime = creationDateTime;
		//this.expirationDateTime = expirationDateTime;
		this.clicks = 0;
	}
	public String getGivenUrl() {
		return givenUrl;
	}
	public void setGivenUrl(String givenUrl) {
		this.givenUrl = givenUrl;
	}
	public String getCreatedUrl() {
		return hash;
	}
	public void setCreatedUrl(String createdUrl) {
		this.hash = createdUrl;
	}
	public Integer getClicks() {
		return clicks;
	}
	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}
	@Override
	public String toString() {
		return "Url [hash=" + hash + ", givenUrl=" + givenUrl + ", creationDateTime=" + creationDateTime + ", clicks="
				+ clicks + "]";
	}
	
	
	
}
