package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="deptadmin_table")
public class DeptAdmin implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="username")
	private String dname;
	@Column(name="password")
	private String dpwd;
}
