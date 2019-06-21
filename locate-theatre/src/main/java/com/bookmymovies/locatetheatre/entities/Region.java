package com.bookmymovies.locatetheatre.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "region")
public class Region {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "region_name")
	private String regionName;
	@Column(name = "region_desc")
	private String regionDesc;
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Region parentId;
	@OneToMany(mappedBy = "parentId")
	private List<Region> subRegions;
	@OneToMany(mappedBy = "theatres")
	private List<Region> theatres;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public String getRegionDesc() {
		return regionDesc;
	}
	public void setRegionDesc(String regionDesc) {
		this.regionDesc = regionDesc;
	}
	
	public Region getParentId() {
		return parentId;
	}
	public void setParentId(Region parentId) {
		this.parentId = parentId;
	}
	public List<Region> getSubRegions() {
		return subRegions;
	}
	public void setSubRegions(List<Region> subRegions) {
		this.subRegions = subRegions;
	}
	public List<Region> getTheatres() {
		return theatres;
	}
	public void setTheatres(List<Region> theatres) {
		this.theatres = theatres;
	}
	
	
}
