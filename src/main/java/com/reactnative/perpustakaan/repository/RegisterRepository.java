package com.reactnative.perpustakaan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.reactnative.perpustakaan.entity.Register;

public interface RegisterRepository extends CrudRepository<Register, Long>{
	@Query(value = "select * from register where username like %?1%", nativeQuery=true)
	List<Register> findByUsername(String username);

	@Query(value = "select * from register where email like %?1%", nativeQuery=true)
	List<Register> findByEmail(String email);
	
	@Query(value = "select * from register where phone like %?1%", nativeQuery=true)
	List<Register> findByPhone(String phone);
	
	@Query(value = "select * from register where address like %?1%", nativeQuery=true)
	List<Register> findByAddress(String address);
	
}
