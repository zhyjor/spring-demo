package com.zhyj.demo;

import com.zhyj.demo.controller.HelloWorldController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerTestApplicationTests {

	private MockMvc mvc;

	@Before
	public void befor(){
		this.mvc = MockMvcBuilders.standaloneSetup((new HelloWorldController())).build();
	}
	@Test
	public void contextLoads() throws Exception{
		RequestBuilder req = get("/index/");
		mvc.perform(req).andExpect(status().isOk()).
				andExpect(content().string("Hello world"));
	}

}
