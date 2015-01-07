package com.xing.netty.interfaces;

import java.io.Serializable;

public class SubcribeReq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int subReqID;

	private String userName;

	private String produceName;

	private String phoneNumber;

	private String address;

	public int getSubReqID() {
		return subReqID;
	}

	public void setSubReqID(int subReqID) {
		this.subReqID = subReqID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getProduceName() {
		return produceName;
	}

	public void setProduceName(String produceName) {
		this.produceName = produceName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "SubcribeReq [subReqID=" + subReqID + ", userName=" + userName + ", produceName=" + produceName
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
	
}
