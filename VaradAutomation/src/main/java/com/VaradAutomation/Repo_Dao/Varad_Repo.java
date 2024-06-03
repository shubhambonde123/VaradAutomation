package com.VaradAutomation.Repo_Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.VaradAutomation.model.V_Automation;

@Repository
public interface Varad_Repo extends CrudRepository<V_Automation, Long>{

}
