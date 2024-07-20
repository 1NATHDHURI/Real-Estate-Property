package com.learn.springboot.servcies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.springboot.entity.Register;
import com.learn.springboot.repository.RegRepo;

@Service
public class RegServiceImplimantion implements RegService{

	@Autowired
	RegRepo rr;
	
	public RegServiceImplimantion(RegRepo rr) {
		super();
		this.rr = rr;
	}

	@Override
	public String regSave(Register register) {
		rr.save(register);
		return "save";
	}

	@Override
	public List<Register> viewReg() {
		List<Register> rlist=rr.findAll();
		
		return rlist;
	}

	@Override
	public boolean checkR(String email, String name) {
		Register register=rr.findByEmail(email);
		String db=register.getName();
		if(db.equals(name))
		{
			return true;
		}
		else {
		return false;
		}
	}

}
