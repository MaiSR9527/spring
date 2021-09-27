package com.msr.better.ch1_xml_bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-09-27 20:10:25
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
	public MyBeanPostProcessor() {
		System.out.println("BeanPostProcessor 的实现类初始化");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("person".equalsIgnoreCase(beanName)){
			System.out.println("BeanPostProcessor 实现类 postProcessBeforeInitialization 执行中...");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("person".equalsIgnoreCase(beanName)){
			System.out.println("BeanPostProcessor 实现类 postProcessAfterInitialization 执行中...");
		}
		return bean;
	}
}
