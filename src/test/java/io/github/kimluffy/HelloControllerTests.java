package io.github.kimluffy;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import io.github.kimluffy.controller.HelloController;
import io.github.kimluffy.domain.HelloVO;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerTests {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void hello() throws Exception {
		
		//mockMvc.perform(get("/hello")).andExpect(content().string("Hello 9090"));
		
		MvcResult result = mockMvc.perform(get("/hello"))
				.andExpect(status().isOk())
				.andExpect(content().string("Hello 9090"))
				.andReturn();
		System.out.println(result.getResponse().getContentAsString());
	}
	
	@Test
	public void hello2() throws Exception {
		
		HelloVO vo = new HelloVO();
		vo.setComment("Hello");
		vo.setName("kimluffy");
		
		MvcResult result = mockMvc.perform(get("/hello2"))
				.andExpect(status().isOk()).andReturn();
		System.out.println(result);
	}
}
