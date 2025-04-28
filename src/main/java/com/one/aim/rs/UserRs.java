package com.one.aim.rs;

import java.io.Serializable;

import com.one.constants.StringConstants;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

////this data for front-end person
@Getter
@Setter
@NoArgsConstructor
public class UserRs implements Serializable {

	private static final long serialVersionUID = 1L;

	private String docId = StringConstants.EMPTY;

	private String userName;

	private String email;

	private String phoneNo;
	
	private String company; 

	private String service;

	private String message;
	
	private String url;
	
	private String date;
<<<<<<< HEAD
	
=======

>>>>>>> 5d64f8d57e3fce7ec763847c0e2d0fb7ecd5efcf
	private String timeSlot;
	
	private String timezone;
}
