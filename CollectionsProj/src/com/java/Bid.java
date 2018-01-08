package com.java;

public class Bid {

	private int id;
	private float bidAmount;
	
	public Bid() {
		// TODO Auto-generated constructor stub
	}

	public Bid(int id, float bidAmount) {
		this.id = id;
		this.bidAmount = bidAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(float bidAmount) {
		this.bidAmount = bidAmount;
	}
		
}