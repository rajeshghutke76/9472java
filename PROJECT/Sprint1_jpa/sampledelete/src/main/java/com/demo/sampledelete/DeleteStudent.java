package com.demo.sampledelete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.sampledelete.entity.StudentEntity;

public class DeleteStudent 
{
    public static void main( String[] args )
    {
      
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
    		    EntityManager em=emf.createEntityManager();  
    		em.getTransaction().begin();  
    	 
    	   StudentEntity s=em.find(StudentEntity.class,101);  
    	em.remove(s);  
    		em.getTransaction().commit();  
    		emf.close();  
    		em.close();  
    		  
    	    }  
    	}

