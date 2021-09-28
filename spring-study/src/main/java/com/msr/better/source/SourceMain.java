package com.msr.better.source;

import com.msr.better.ch1xmlbean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-09-19 15:47:31
 */
public class SourceMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		Person person = context.getBean(Person.class);
		System.out.println(person.getClass().getName());
	}
}
