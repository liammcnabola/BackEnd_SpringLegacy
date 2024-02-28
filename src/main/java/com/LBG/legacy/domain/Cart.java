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
	private String customer;
//	private double calcTotal;
	@JsonManagedReference
	@OneToMany(mappedBy = "cart")
	private List<Item> item;

	public Cart() {
		super();
	}

//	public double getCalcTotal() {
//		return calcTotal;
//	}
//
//	public void setCalcTotal(double calcTotal) {
//		this.calcTotal = calcTotal;
//	}

//	public Cart(List<Item> item) {
//		this.item = item;
//	}
//
//	public double calcTotal() {
//		double total = 0.0;
//		for (Item i : item) {
//			total += i.getPrice();
//		}
//		return total;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

//	@Override
//	public String toString() {
//		return "Cart [customer=" + customer + "]";
//	}

}
