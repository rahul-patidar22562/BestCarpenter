package com.rp.UserService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.rp.CustData.CustData;
import com.rp.SubjectRepository.SubjectRepository;






@Service
public class UserService {
	@Autowired
	public SubjectRepository subjectRepo;

	public List<CustData> getAllSubjects()
	{
		List<CustData> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}

    public boolean search(String unm,String pw)
    {
    	List<CustData> logindata = new ArrayList<>();
    	String id=new String();
    	String pw1=new String();
    	id=unm;
    	pw1=pw;
    	logindata=subjectRepo.search(id,pw1);
    if(logindata.isEmpty())	
    return false;
    else
    return true;
    }
	public void addSubject(CustData subject) {
		subjectRepo.save(subject);
		
	}

	public void updateSubject(String id, CustData subject) {
		subjectRepo.save(subject);
		
	}

	public void deleteSubject(Integer id) {
		subjectRepo.deleteById(id);
		
	}
}