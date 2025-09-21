package com.example.clinicms;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class ClinicManagementSystemApplicationTests {

	@Test
	void contextLoads() {
	}

    @Test
    void createApplicationModuleModel() {
        ApplicationModules modules = ApplicationModules.of(ClinicManagementSystemApplication.class);
        modules.forEach(System.out::println);
    }

}
