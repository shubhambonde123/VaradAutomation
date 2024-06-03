package com.VaradAutomation.Repo_Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.VaradAutomation.model.Varad_Auto_Client_Info;

@Repository
public interface Client_repo extends CrudRepository<Varad_Auto_Client_Info, Long>{

}
