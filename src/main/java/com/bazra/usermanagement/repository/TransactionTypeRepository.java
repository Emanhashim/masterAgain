package com.bazra.usermanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bazra.usermanagement.model.Transactiontype;
@Repository
public interface TransactionTypeRepository extends JpaRepository<Transactiontype, Integer> {
	Optional<Transactiontype> findBytransactionType(String name);

}
