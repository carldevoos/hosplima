package com.tesis2utp.hosplima.repository;

import com.tesis2utp.hosplima.model.Hospital;
import com.tesis2utp.hosplima.model.Upss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UpssRepository extends JpaRepository<Upss, Long> {

    @Query(value = "select distinct a.* from upss a" +
            " left join hospital_upss b on b.upss = a.upss" +
            " left join hospital c on c.ipress = b.ipress" +
            " where c.ubigeo = :ubigeo", nativeQuery = true)
    List<Upss> findAllUpssByUbigeo(@Param("ubigeo") String ubigeo);

    @Query(value = "select a.* from upss a" +
            " inner join hospital_upss b on b.upss = a.upss" +
            " where b.ipress = :ipress", nativeQuery = true)
    List<Upss> findAllUpssByIpress(@Param("ipress") String ipress);
}
