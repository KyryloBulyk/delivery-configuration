package kyrylo.delivery.com.deliveryconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DeliveryConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryConfigurationApplication.class, args);
	}

}
