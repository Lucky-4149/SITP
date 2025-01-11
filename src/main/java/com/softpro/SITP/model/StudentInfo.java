package com.softpro.SITP.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "studentinfoes", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class StudentInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	////////////
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
//////////////
	@Column(nullable = false, length = 200)
	private String testname;
	
	@Column(nullable = false, length = 20)
	private String enrollmentno;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(nullable = false, length = 13)
	private String contactno;
	
	@Column(nullable = false, length = 13)
	private String whatsappno;
	

	@Column(length = 100, name = "email", unique = true, nullable = false)
	private String email;
	
	@Column(nullable = false, length = 50)
	private String password;
	
	@Column(nullable = false, length = 150)
	private String collegename;
	
	@Column(nullable = false, length = 50)
	private String course;
	
	@Column(nullable = false, length = 50)
	private String branch;
	
	@Column(nullable = false, length = 30)
	private String year;
	
	@Column(nullable = false, length = 10)
	private String highschoolp;
	
	@Column(nullable = false, length = 100)
	private String highboard;
	
	@Column(nullable = false, length = 20)
	private String highpassoutyear;
	
	
	@Column(nullable = false, length = 20)
	private String intermediatep;
	
	@Column(nullable = false, length = 100)
	private String intermediateboard;
	
	@Column(nullable = false, length = 20)
	private String intermediatepassoutyear;
	
	
	
	@Column(nullable = true, length = 50)
	private String aggregatemarks;
	
	@Column(nullable = false, length = 10)
	private String status;
	
	@Column(nullable = true, length = 1000)
	private String profilepic;
	
	@Column(nullable = false, length = 25)
	private String regdate;

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

	public String getIntermediatep() {
		return intermediatep;
	}

	public void setIntermediatep(String intermediatep) {
		this.intermediatep = intermediatep;
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

	public String getProfilepic() {
		return profilepic;
	}

	public void setProfilepic(String profilepic) {
		this.profilepic = profilepic;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getTestname() {
		return testname;
	}

	public void setTestname(String testname) {
		this.testname = testname;
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
	

}
