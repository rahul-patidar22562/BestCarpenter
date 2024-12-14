package com.rp.SubjectRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.rp.CustData.CustData;



public interface SubjectRepository extends CrudRepository<CustData,Integer> {
	
	 @Query(value = "SELECT c FROM CustData c WHERE c.unm =?1 AND c.pw= ?2")
	    public List<CustData> search(String keyword,String pw);
}
