package com.msr.better.source;

import com.msr.better.ch1xmlbean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-09-19 15:48:28
 */
@Configuration
public class MainConfig {

	@Bean
	public Person person() {
		return new Person();
	}
}
