package com.softpro.SITP.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "testresult")
public class TestResult {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 60, nullable = false)
	private String email;
	
	@Column(length = 50, nullable = false)
	private String name;
	
	@Column(length = 500, nullable = false)
	private String collegename;
	
	@Column(length = 100, nullable = false)
	private String course;
	
	@Column(length = 100, nullable = false)
	private String branch;
	
	@Column(length = 100, nullable = false)
	private String year;
	
	@Column(length = 15, nullable = false)
	private String contactno;
	
	@Column(length = 15, nullable = false)
	private String whatsappno;
	
	@Column(nullable = false)
	private int totalmarks;
	
	@Column(nullable = false)
	private int getmarks;
	
	@Column(length = 10)
	private String status;
	
	@Column(length = 200, nullable = false,name = "testname")
	private String testname;

	
	@Column(nullable = false, length = 10)
	private String highschoolp;
	
	@Column(nullable = false, length = 100)
	private String highboard;
	
	@Column(nullable = false, length = 20)
	private String highpassoutyear;
	
	@Column(nullable = false, length = 10)
	private String intermediatep;
	
	@Column(nullable = false, length = 100)
	private String intermediateboard;
	
	@Column(nullable = false, length = 20)
	private String intermediatepassoutyear;
		
	@Column(nullable = true, length = 50)
	private String aggregatemarks;
		
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}

	public int getGetmarks() {
		return getmarks;
	}

	public void setGetmarks(int getmarks) {
		this.getmarks = getmarks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTestname() {
		return testname;
	}

	public void setTestname(String testname) {
		this.testname = testname;
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
	
}
