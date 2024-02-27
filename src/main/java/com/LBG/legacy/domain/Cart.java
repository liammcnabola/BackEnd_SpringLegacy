package com.LBG.legacy.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String shopper;
	@JsonManagedReference
	@OneToMany(mappedBy = "cart")
	private List<Item> item;


	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Item> getItem() {
		return item;
	}

	public String getShopper() {
		return shopper;
	}

	public void setShopper(String shopper) {
		this.shopper = shopper;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Cart [shopper=" + shopper + "]";
	}



}