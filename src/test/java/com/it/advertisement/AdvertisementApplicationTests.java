package com.it.advertisement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.it.advertisement.entity.User;
import com.it.advertisement.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
//相当于  --spring.profiles.active=dev  
@ActiveProfiles(value="dev")  
public class AdvertisementApplicationTests {

	  	@Autowired  
	    private UserMapper mapper;  
	      
	    @Test  
	    public void testInsert(){  
	        User user = new User();  
	        user.setUserName("宋亚君");  
	        user.setAge(23);  
	        mapper.save(user);  
	        System.out.println("插入用户信息"+user.getUserName());  
	    }  

}
