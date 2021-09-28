package com.msr.better.ch1xmlbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-06-03 23:50
 **/
public class Person implements InitializingBean, ApplicationContextAware {

	private Animal animal;

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Person() {
        System.out.println("person construct");
    }

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean 的实现方法被调用");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext 的实现方法被调用....");
	}
}
