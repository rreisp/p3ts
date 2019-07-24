package com.meta.p3ts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.meta.p3ts.services.S3Service;

@SpringBootApplication
public class Main implements CommandLineRunner {

	@Autowired
	private S3Service s3Service;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("/home/ufop/Imagens/Slideshow/58423603_441137296697378_111774533170995132_n.jpg");
	}
}