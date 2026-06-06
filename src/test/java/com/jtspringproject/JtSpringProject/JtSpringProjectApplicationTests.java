package com.jtspringproject.JtSpringProject;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JtSpringProjectApplicationTests {

	@Disabled("Requires MySQL connection — skipped in CI")
	@Test
	void contextLoads() {
	}

}
