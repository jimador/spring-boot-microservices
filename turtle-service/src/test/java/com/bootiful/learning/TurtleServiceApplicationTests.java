package com.bootiful.learning;

import com.bootiful.learning.config.TurtleServiceApplicationTestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {TurtleServiceApplication.class,
		TurtleServiceApplicationTestConfig.class})
@WebAppConfiguration
public class TurtleServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
