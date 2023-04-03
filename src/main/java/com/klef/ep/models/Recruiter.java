package com.klef.ep.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recruiter_table")
public class Recruiter {
public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRpwd() {
		return rpwd;
	}
	public void setRpwd(String rpwd) {
		this.rpwd = rpwd;
	}
	public String getRcompany() {
		return rcompany;
	}
	public void setRcompany(String rcompany) {
		this.rcompany = rcompany;
	}
	public String getRexp() {
		return rexp;
	}
	public void setRexp(String rexp) {
		this.rexp = rexp;
	}
@Id
@Column(name="recruiter_name")
private String rname;
@Column(name="recruiter_password")
private String rpwd;
@Column(name="recruiter_company")
private String rcompany;
@Column(name="recruiter_experience")
private String rexp;
}
