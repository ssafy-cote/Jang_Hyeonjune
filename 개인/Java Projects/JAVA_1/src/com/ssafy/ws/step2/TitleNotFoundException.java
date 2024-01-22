package com.ssafy.ws.step2;

public class TitleNotFoundException extends Exception{
	private String title;
	
	public TitleNotFoundException(String title) {
		super(title + " 이런 제목의 영화는 존재하지 않습니다.");
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
