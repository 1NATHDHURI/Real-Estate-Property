package com.learn.springboot.servcies;

import java.util.List;

import com.learn.springboot.entity.Register;

public interface RegService {
	
	public String regSave(Register register);
	
	public List<Register> viewReg();
	
	public boolean checkR(String email, String name);
}
