package com.example.springdataJPA;

import com.example.springdataJPA.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringdataJpaApplicationTests {

	@Autowired
	private ProductRepository studRepo;
	@Test
	void testSaveStudent(){
		assertNotNull(true);
	}

}
