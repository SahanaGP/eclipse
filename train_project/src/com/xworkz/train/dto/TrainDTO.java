package com.xworkz.train.dto;

import java.io.Serializable;

public class TrainDTO implements Serializable{

	private int trainID;
	private int trainNo;
	private float boardingTime;
	private float destinationTime;
	private int seatNo;
	private double price;
	private String className;
	private String Name;
	
	
	public TrainDTO(int trainID, int trainNo, float boardingTime, float destinationTime, int seatNo, double price,
			String className, String name) {
		super();
		this.trainID = trainID;
		this.trainNo = trainNo;
		this.boardingTime = boardingTime;
		this.destinationTime = destinationTime;
		this.seatNo = seatNo;
		this.price = price;
		this.className = className;
		Name = name;
	}


	@Override
	public String toString() {
		return "TrainDTO [trainID=" + trainID + ", trainNo=" + trainNo + ", boardingTime=" + boardingTime
				+ ", destinationTime=" + destinationTime + ", seatNo=" + seatNo + ", price=" + price + ", className="
				+ className + ", Name=" + Name + "]";
	}


	public int getTrainID() {
		return trainID;
	}


	public int getTrainNo() {
		return trainNo;
	}


	public float getBoardingTime() {
		return boardingTime;
	}


	public float getDestinationTime() {
		return destinationTime;
	}


	public int getSeatNo() {
		return seatNo;
	}


	public double getPrice() {
		return price;
	}


	public String getClassName() {
		return className;
	}


	public String getName() {
		return Name;
	}


	
}
