package com.qingshixun.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Category;
import com.spring.beans.Product;
import com.spring.service.ProductService;
import com.spring.service.Vehicle;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
		
//		Category category = (Category) context.getBean("c");
//		
//		ProductService product = (ProductService) context.getBean("s");
//		
//		System.out.println(category.getName());
//		
//		product.doSomeService();
		
		Vehicle vehicle = (Vehicle) context.getBean("vehicle");
		vehicle.go();
	}
}
