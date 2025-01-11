package com.softpro.SITP.Dto;

import org.springframework.web.multipart.MultipartFile;

public class StudentInfoDto {
	
	private String testname;
	
	private String enrollmentno;
	
	private String name;
	
	private String contactno;
	
	private String whatsappno;
	
	private String email;
	
	private String password;
	
	private String collegename;
	
	private String course;
	
	private String branch;
	
	private String year;
	
	private String highschoolp;
	
	private String highboard;
	
	private String highpassoutyear;
	
	private String intermediatep;
	
	private String intermediateboard;
	
	private String intermediatepassoutyear;
	
	private String aggregatemarks;
	
	private String status;
	
	private MultipartFile profilepic;

	private String regdate;

	public String getTestname() {
		return testname;
	}

	public void setTestname(String testname) {
		this.testname = testname;
	}

	public String getEnrollmentno() {
		return enrollmentno;
	}

	public void setEnrollmentno(String enrollmentno) {
		this.enrollmentno = enrollmentno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getWhatsappno() {
		return whatsappno;
	}

	public void setWhatsappno(String whatsappno) {
		this.whatsappno = whatsappno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getHighschoolp() {
		return highschoolp;
	}

	public void setHighschoolp(String highschoolp) {
		this.highschoolp = highschoolp;
	}

	public String getHighboard() {
		return highboard;
	}

	public void setHighboard(String highboard) {
		this.highboard = highboard;
	}

	public String getHighpassoutyear() {
		return highpassoutyear;
	}

	public void setHighpassoutyear(String highpassoutyear) {
		this.highpassoutyear = highpassoutyear;
	}

	public String getIntermediatep() {
		return intermediatep;
	}

	public void setIntermediatep(String intermediatep) {
		this.intermediatep = intermediatep;
	}

	public String getIntermediateboard() {
		return intermediateboard;
	}

	public void setIntermediateboard(String intermediateboard) {
		this.intermediateboard = intermediateboard;
	}

	public String getIntermediatepassoutyear() {
		return intermediatepassoutyear;
	}

	public void setIntermediatepassoutyear(String intermediatepassoutyear) {
		this.intermediatepassoutyear = intermediatepassoutyear;
	}

	public String getAggregatemarks() {
		return aggregatemarks;
	}

	public void setAggregatemarks(String aggregatemarks) {
		this.aggregatemarks = aggregatemarks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public MultipartFile getProfilepic() {
		return profilepic;
	}

	public void setProfilepic(MultipartFile profilepic) {
		this.profilepic = profilepic;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
}
