package com.tesis2utp.hosplima.repository;

import com.tesis2utp.hosplima.model.Hospital;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {

    @Query(value = "SELECT * FROM hospital", nativeQuery = true)
    List<Hospital> findAllWithLimit(Pageable pageable);

    Optional<Hospital> findByIpress(String ipress);
}
