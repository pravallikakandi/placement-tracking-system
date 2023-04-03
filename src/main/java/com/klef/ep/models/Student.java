package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_table")
public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="student_name")
	private String sname;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSpwd() {
		return spwd;
	}
	public void setSpwd(String spwd) {
		this.spwd = spwd;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}
	public String getSdob() {
		return sdob;
	}
	public void setSdob(String sdob) {
		this.sdob = sdob;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getSprogram() {
		return sprogram;
	}
	public void setSprogram(String sprogram) {
		this.sprogram = sprogram;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	public String getSphonenum() {
		return sphonenum;
	}
	public void setSphonenum(String sphonenum) {
		this.sphonenum = sphonenum;
	}
	@Column(name="student_password")
	private String spwd;
	@Column(name="student_gender")
	private String sgender;
	@Column(name="student_dateofBirth")
	private String sdob;
	@Column(name="student_address")
	private String saddress;
	@Column(name="student_program")
	private String sprogram;
	@Column(name="student_department")
	private String sdept;
	@Column(name="student_phoneNumber")
	private String sphonenum;
}
