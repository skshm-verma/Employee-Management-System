package com.skshm_crud_emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com/skshm_crud_emp/Repository", "com/skshm_crud_emp/Controller", "com/skshm_crud_emp"})
public class EmpCurdMApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpCurdMApplication.class, args);
	}

}
