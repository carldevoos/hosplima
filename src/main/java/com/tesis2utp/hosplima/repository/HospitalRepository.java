package com.tesis2utp.hosplima.repository;

import com.tesis2utp.hosplima.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    Optional<Hospital> findByIpress(String ipress);
}
