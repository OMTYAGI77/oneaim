package com.one.aim.rq;

import com.one.vm.core.BaseVM;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRq extends BaseVM {

	private static final long serialVersionUID = 1L;
	
	private String docId;

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
