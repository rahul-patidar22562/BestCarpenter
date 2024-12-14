package com.rp.CustData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CustData")
public class CustData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int cid;
    String name,cadd,city,mob,email,unm,pw;
	public CustData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustData(int cid, String name, String cadd, String city, String mob, String email, String unm, String pw) {
		super();
		this.cid = cid;
		this.name = name;
		this.cadd = cadd;
		this.city = city;
		this.mob = mob;
		this.email = email;
		this.unm = unm;
		this.pw = pw;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUnm() {
		return unm;
	}
	public void setUnm(String unm) {
		this.unm = unm;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

}
