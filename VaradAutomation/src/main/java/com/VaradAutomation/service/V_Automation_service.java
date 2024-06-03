package com.VaradAutomation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.VaradAutomation.Repo_Dao.Varad_Repo;
import com.VaradAutomation.model.V_Automation;

public interface V_Automation_service{

	public V_Automation getdataAdmin(@RequestBody V_Automation v_Automation);
	
	public Optional<V_Automation> getbyid(@PathVariable Long id);
}
