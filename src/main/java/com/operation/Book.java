package com.operation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book{
	@Id
	int bId;
	String bName;
	String bAuthor;
	int bPrice;
	
	public Book(int bId, String bName, String bAuthoor, int bPrice) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bAuthor = bAuthoor;
		this.bPrice = bPrice;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbAuthoor() {
		return bAuthor;
	}

	public void setbAuthoor(String bAuthoor) {
		this.bAuthor = bAuthoor;
	}

	public int getbPrice() {
		return bPrice;
	}

	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", bAuthoor=" + bAuthor + ", bPrice=" + bPrice + "]";
	}

}
