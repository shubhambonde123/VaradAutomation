package com.VaradAutomation.Repo_Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.VaradAutomation.model.Address;
@Repository
public interface V_Address_Repo extends CrudRepository<Address, Long>{

}
