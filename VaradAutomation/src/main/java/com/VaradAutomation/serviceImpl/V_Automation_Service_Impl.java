package com.VaradAutomation.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.VaradAutomation.Repo_Dao.Varad_Repo;
import com.VaradAutomation.model.V_Automation;
import com.VaradAutomation.service.V_Automation_service;

@Service
public class V_Automation_Service_Impl implements V_Automation_service {
	@Autowired Varad_Repo varad_Repo;

	@Override
	public V_Automation getdataAdmin(V_Automation v_Automation) {
		V_Automation v_Automation2=varad_Repo.save(v_Automation);
		return v_Automation2;
	}

	@Override
	public Optional<V_Automation> getbyid(Long id) {
		Optional<V_Automation> v= varad_Repo.findById(id);
		return v;
	}



	
	

}
