package tacos;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) // provee un test runner (SpringRunner) que guía a JUnit en la ejecución del test
@SpringBootTest // bootstrapping del test en entorno Spring Boot
class TacoCloudApplicationTests {

	@Test
	void contextLoads() {
		// Asegura que el Spring Application Context sea cargado
	}

}
