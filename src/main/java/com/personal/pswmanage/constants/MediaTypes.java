package com.personal.pswmanage.constants;

import java.util.Map;

import org.springframework.http.MediaType;

public class MediaTypes {
	
	private Map<String, MediaType> mediaTypes;

	public Map<String, MediaType> getMediaTypes(){
		this.mediaTypes.put("html", MediaType.TEXT_HTML);
		this.mediaTypes.put("xml", MediaType.APPLICATION_XML);
		this.mediaTypes.put("json", MediaType.APPLICATION_JSON);
		
		return this.mediaTypes;
		
	}
}