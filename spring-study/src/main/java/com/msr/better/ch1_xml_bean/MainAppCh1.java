package com.msr.better.ch1_xml_bean;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-06-03 23:50
 **/
public class MainAppCh1 {

	/**
	 * bean的生命周期
	 * 构造器、初始化方法执行、Bean的后置处理器的before方法、Bean的后置处理器的after方法：AbstractApplicationContext#refresh#finishBeanFactoryInitialization
	 * BeanFactory后置处理器初始化、方法执行：AbstractApplicationContext#refresh#invokeBeanFactoryPostProcessors
	 * Bean的后置处理器初始化：AbstractApplicationContext#refresh#registerBeanPostProcessors
	 *
	 * BeanFactoryPostProcessor并调用实现的方法--->BeanPostProcessor初始化--->Bean的构造方法--->ApplicationContextAware的实现方法
	 * --->BeanPostProcessor的before方法--->InitializingBean的实现方法--->BeanPostProcessor的after方法
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		System.out.println("");
	}
}
