package data.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import data.demo.repo.IDataRepository;

@SpringBootTest
class DemoApplicationTests {
 @Autowired
 IDataRepository repo;
 
 @Test
 public void check_datasize_is_greater_than_zero(){
	 
	 var data = repo.getMessage("success");
	 assertNotNull(data);
	 
 }
 
 @Test
 public void check_that_status_isSuccess(){
	 
	 var data = repo.getMessage("success");
	 assertEquals(data.status,"success");
	 
 }

	

}
