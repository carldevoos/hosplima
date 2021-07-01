package com.tesis2utp.hosplima.repository;

import com.tesis2utp.hosplima.model.UbigeoDistrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbigeoDistritoRepository extends JpaRepository<UbigeoDistrito, Long> {
}
