package com.spring.jdbc.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    
    	ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
    	StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
    	Student student = new Student(172,"Tripti","Kolkata");
    	int r = studentDao.insert(student);
    	System.out.println("done record inserted!");
    	((ClassPathXmlApplicationContext)context).close();
    }
}
