package com.akms.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akms.app.model.*;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
