package com.kh.ajax;

public class AjaxDTO {
	
	private int idx;
	private String name;
	private int age;
	private String gender;
	private String email;
	
	// 인덱스는 자동으로 저장 되기떄문에 실제 데이터만 들어가는 생성자 
	public AjaxDTO(String name, int age, String gender, String email) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	
	// 데이터를 꺼내올때 인덱스저장을 위한 생성자 
	public AjaxDTO(int idx, String name, int age, String gender, String email) {
		super();
		this.idx = idx;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	public AjaxDTO() {
		super();
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "AjaxDTO [idx=" + idx + ", name=" + name + ", age=" + age + ", gender=" + gender + ", email=" + email
				+ "]";
	}
	
	// 기본생성자, 매개변수 받는 생성자 두개 !
	
}
