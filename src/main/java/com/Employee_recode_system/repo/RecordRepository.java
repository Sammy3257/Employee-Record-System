package com.Employee_recode_system.repo;

import com.Employee_recode_system.model.Records;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.Map;
import java.util.Optional;

public interface RecordRepository extends JpaRepository<Records, Long>{

    Optional<Records> findByEmail(String email);

}
