package com.management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
	
	@Id
	@Column(name = "company_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "company_name")
	private String name;
	@Column(name = "company_founding_date")
	private String foundingDate;
	
	/**
	 * Default Constrcutor
	 */
	public Company() {
		
	}

	/**
	 * @param name
	 * @param foundingDate
	 */
	public Company(String name, String foundingDate) {
		super();
		this.name = name;
		this.foundingDate = foundingDate;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the foundingDate
	 */
	public String getFoundingDate() {
		return foundingDate;
	}

	/**
	 * @param foundingDate the foundingDate to set
	 */
	public void setFoundingDate(String foundingDate) {
		this.foundingDate = foundingDate;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", foundingDate=" + foundingDate + "]";
	}
	
}
