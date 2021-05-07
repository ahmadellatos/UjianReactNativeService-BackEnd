package com.reactnative.perpustakaan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactnative.perpustakaan.entity.Book;
import com.reactnative.perpustakaan.repository.BookRepository;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookRepository bookRepo;
	
	@GetMapping("/")
	public List<Book> getAll() {
		return (List<Book>) bookRepo.findAll();
	}
	
	@GetMapping("/{title}")
	public List<Book> getBookByJudulBuku(@PathVariable String title) {
		return bookRepo.findByJudulBuku(title);
	}
	
	@PostMapping("/addbook")
	public String addBook(@RequestBody Book book) {
		bookRepo.save(book);
		return "Insert Berhasil";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable String id) {
		bookRepo.deleteById(Long.parseLong(id));
		return "Delete Berhasil";
	}
	
	@PutMapping("/update/{id}")
	public String updateBook(@PathVariable String id, @RequestBody Book book) {
		book.setId(Long.parseLong(id));
		bookRepo.save(book);
		return "Update Berhasil";
		
	}
}
