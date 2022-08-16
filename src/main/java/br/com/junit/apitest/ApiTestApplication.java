package br.com.junit.apitest;

import br.com.junit.apitest.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiTestApplication.class, args);
    }

    User user = new User(1, "Ricardo", "email@email.com", "123");
}
