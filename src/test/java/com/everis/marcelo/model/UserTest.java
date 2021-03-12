package com.everis.marcelo.model;


import org.junit.Assert;
import org.junit.Test;


public class UserTest {
	
	
	User user = new User(1L,"Marcelo",33);

	@Test
	public void testGetId() {
		Assert.assertEquals(user.getId(), Long.valueOf(1L));
	}

	@Test
	public void testSetId() { 
		user.setId(2L);
		Assert.assertEquals(user.getId(), Long.valueOf(2L));
	}

	@Test
	public void testGetName() {
		Assert.assertTrue(user.getName().equalsIgnoreCase("Marcelo"));
	}

	@Test
	public void testSetName() {
		user.setName("Teste");
		Assert.assertTrue(user.getName().equalsIgnoreCase("teste"));
	}

	@Test
	public void testGetAge() {
		Assert.assertEquals(user.getAge(), Integer.valueOf(33));
	}

	@Test
	public void testSetAge() {
		user.setAge(43);
		Assert.assertEquals(user.getAge(), Integer.valueOf(43));
	}

}
