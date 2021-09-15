package com.msr.better.domain;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-07-15 23:41
 **/
public class Student {

	private String sName;
	private Integer sAge;

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Integer getsAge() {
		return sAge;
	}

	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student{" +
				"sName='" + sName + '\'' +
				", sAge=" + sAge +
				'}';
	}
}
