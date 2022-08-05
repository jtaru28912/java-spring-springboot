package com.jdbc.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	/* 
    	 *spring jdbc
    	 *insert operation
        */
    	
    	
      System.out.println( "My program started!" );
      ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
      //say hi to jdbcTemplate
      JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
      //insert querey
      String query = "insert into student(id, name, city) values(???)";
      int result = template.update(query, 172, "Tripti", "Kolkata");
      System.out.println("Number of record inserted.."+ result);
      
      ((ClassPathXmlApplicationContext) context).close();
      
    }
}
