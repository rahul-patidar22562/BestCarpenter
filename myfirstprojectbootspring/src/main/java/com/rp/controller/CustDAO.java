package com.rp.controller;

import java.util.List;

//import org.hibernate.criterion.DetachedCriteria;
//import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


//@Repository

/*public class CustDAO {
@Autowired
private HibernateTemplate hibernateTemplate;
@Transactional
public int saveCust(CustData data)
  {
   int x=(Integer)this.hibernateTemplate.save(data);	
   return x;	
  }*/
	/*
	 * public List<CustData> checkUser(CustData user) { DetachedCriteria
	 * dt=(DetachedCriteria)DetachedCriteria.forClass(CustData.class);
	 * dt.add(Restrictions.eq("unm",user.getUnm()));
	 * dt.add(Restrictions.eq("pw",user.getPw())); List<CustData>
	 * lt=(List<CustData>) this.hibernateTemplate.findByCriteria(dt);
	 * 
	 * return lt; }
	 */	
//}