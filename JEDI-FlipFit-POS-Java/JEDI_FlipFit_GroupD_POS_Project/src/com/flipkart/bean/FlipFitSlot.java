package com.flipkart.bean;

public class FlipFitSlot {
	private String slotId;
	private String startTime;
	private String endTime;
	private int numOfSeats;
	private String trainer;

	// Constructor
	public FlipFitSlot(String slotId, String startTime, String endTime, int numOfSeats, String trainer) {
		this.slotId = slotId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.numOfSeats = numOfSeats;
		this.trainer = trainer;
	}

	// Getters and Setters
	public String getSlotId() {
		return slotId;
	}

	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
}
