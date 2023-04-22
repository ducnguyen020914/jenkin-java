package com.example.demodockerfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDockerFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDockerFileApplication.class, args);
	}

	@GetMapping()
	public ResponseEntity<?> hello(){
		return ResponseEntity.ok("Xin chao duc hoc docker");
	}
	@GetMapping("/hello")
	public ResponseEntity<?> hello2(){
		return ResponseEntity.ok("Xin chao duc hoc docker 2");
	}
}
