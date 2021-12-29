package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TacoCloudApplication {

	public static void main(String[] args) {
		// Hace el bootstrapping de la aplicación, creando el Spring Application Context. 
		SpringApplication.run(TacoCloudApplication.class, args);
	}

}
