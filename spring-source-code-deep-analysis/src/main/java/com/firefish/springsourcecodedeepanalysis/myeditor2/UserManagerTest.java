package com.firefish.springsourcecodedeepanalysis.myeditor2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class UserManagerTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/firefish/springsourcecodedeepanalysis/myeditor2/application.xml");
		UserManager bean = (UserManager) context.getBean("userManager");
		System.out.println(bean);
	}
}
