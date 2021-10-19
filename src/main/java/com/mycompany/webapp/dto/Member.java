package com.mycompany.webapp.dto;

import lombok.Data;

@Data
public class Member {
	private String mid;
	private String mname;
	private String mpassword;
	private boolean menabled; // boolean으로 바꾸면mybatis에서 자동으로 1은 true, 0은 false로 매핑해줌.
	private String mrole;
	private String memail;
}
