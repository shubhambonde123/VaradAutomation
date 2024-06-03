package com.VaradAutomation.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.VaradAutomation.model.V_Automation;
import com.VaradAutomation.serviceImpl.V_Automation_Service_Impl;
import com.mysql.cj.x.protobuf.Mysqlx.Ok;

@RestController("/Admin_Controller")
public class Varad_Automation_Controller {
	@Autowired 
	V_Automation_Service_Impl v_Automation_Service_Impl;
	
	@PostMapping("/admin_post")
	public ResponseEntity<V_Automation> getdataEntity(@RequestBody V_Automation v_Automation){
		V_Automation v=v_Automation_Service_Impl.getdataAdmin(v_Automation);
		return ResponseEntity.ok().body(v);
	}
	
	@GetMapping("/getbyId")
	public ResponseEntity<Optional<V_Automation>> findById(@PathVariable Long id){
		Optional<V_Automation> v=v_Automation_Service_Impl.getbyid(id);
		return ResponseEntity.ok().body(v);
	}

}
