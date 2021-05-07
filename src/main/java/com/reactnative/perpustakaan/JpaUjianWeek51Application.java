package com.reactnative.perpustakaan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reactnative.perpustakaan.entity.Book;
import com.reactnative.perpustakaan.entity.Register;
import com.reactnative.perpustakaan.repository.BookRepository;
import com.reactnative.perpustakaan.repository.RegisterRepository;

@SpringBootApplication
public class JpaUjianWeek51Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JpaUjianWeek51Application.class, args);
	}

	@Autowired
	BookRepository bookRepo;
	
	@Autowired
	RegisterRepository registerRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Book buku = new Book();
//		
//		buku.setJudulBuku("Ensiklopedia");
//		buku.setHalaman(300);
//		buku.setNamaPengarang("Ahmad Alatas");
//		
//		bookRepo.save(buku);
		
//		Register reg = new Register();
//		reg.setUsername("ahmadellatos");
//		reg.setEmail("ahmad.086d@gmail.com");
//		reg.setPhone("089666012878");
//		reg.setAddress("Jakarta Timur");
//		
//		registerRepo.save(reg);
		
		
		
	}

}
