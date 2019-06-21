package com.bookmymovies.locatetheatre.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Theatres")
public class Theatre {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	@Column(name = "theatre_name", nullable = false)
	private String theatreName;
	@Column(name = "franchisee")
	private String franchisee;
	@Column(name = "address")
	private String address;
	@ManyToOne
	@JoinColumn(name = "region")
	private Region region;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getFranchisee() {
		return franchisee;
	}
	public void setFranchisee(String franchisee) {
		this.franchisee = franchisee;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	
	
}
