package com.msr.better;

import com.msr.better.domain.Student;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-07-15 23:40
 **/
public class AppMain {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("beans.xml");

		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

		BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
		beanDefinitionReader.loadBeanDefinitions(resource);

		Student student = (Student) beanFactory.getBean("student");
		System.out.println(student);
	}
}
