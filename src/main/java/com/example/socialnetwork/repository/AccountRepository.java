package com.example.socialnetwork.repository;

import com.example.socialnetwork.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
