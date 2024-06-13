package com.mubin.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface fraudRepository extends JpaRepository<fraudChecker,Integer> {
}
