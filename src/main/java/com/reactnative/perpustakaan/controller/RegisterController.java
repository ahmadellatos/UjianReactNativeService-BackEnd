package com.reactnative.perpustakaan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactnative.perpustakaan.entity.Register;
import com.reactnative.perpustakaan.repository.RegisterRepository;

@RestController
@RequestMapping("/register")
public class RegisterController {

	
	@Autowired
	RegisterRepository regisRepo;
	
	@GetMapping("/")
	public List<Register> getLstRegister() {
		
		return (List<Register>) regisRepo.findAll();
		
	}
	
	@PostMapping("/adduser")
	public String addUser(@RequestBody Register reg) {
		regisRepo.save(reg);
		return "Insert Berhasil";
	}
	
	@GetMapping("/username/{title}")
	public List<Register> getUserByUsername(@PathVariable String title) {
		return regisRepo.findByUsername(title);
	}
	
	@GetMapping("/email/{title}")
	public List<Register> getUserByEmail(@PathVariable String title) {
		return regisRepo.findByEmail(title);
	}
	
	@GetMapping("/phone/{title}")
	public List<Register> getUserByPhone(@PathVariable String title) {
		return regisRepo.findByPhone(title);
	}
	
	@GetMapping("/address/{title}")
	public List<Register> getUserByAddress(@PathVariable String title) {
		return regisRepo.findByAddress(title);
	}
}
