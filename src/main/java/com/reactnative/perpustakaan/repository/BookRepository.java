package com.reactnative.perpustakaan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.reactnative.perpustakaan.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
	@Query(value = "select * from book where judul_buku like %?1%", nativeQuery=true)
	List<Book> findByJudulBuku(String judulBuku);
}
