package com.klef.ep.models;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="irpadmin_table")
public class IRPAdmin implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="username")
	private String iname;
	@Column(name="password")
	private String ipwd;
}
