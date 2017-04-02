package com.whayer.wx.spring;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.whayer.wx.base.UnitTestBase;

public class SpringResourceTest extends UnitTestBase{
	
	public SpringResourceTest() {
		super("classpath:test/spring-resource.xml");
	}
	
	@Test
	public void testResource() {
		SpringResource resource = super.getBean("springResource");
		try {
			resource.getResource();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}