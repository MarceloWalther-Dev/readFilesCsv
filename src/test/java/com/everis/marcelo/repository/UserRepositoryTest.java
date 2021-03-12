package com.everis.marcelo.repository;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.everis.marcelo.model.User;

@RunWith(SpringRunner.class)
public class UserRepositoryTest {
	
	@MockBean
	private UserRepository mockRepository;

	@Test
	public void save() {
		User user = new User(1L,"Marcelo", 33);
		
		when(mockRepository.save(user)).thenReturn(user);
	}

}
