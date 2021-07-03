package com.tesis2utp.hosplima.repository;

import com.tesis2utp.hosplima.model.Hospital;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {

    @Query(value = "SELECT * FROM hospital", nativeQuery = true)
    List<Hospital> findAllWithLimit(Pageable pageable);

    Optional<Hospital> findByIpress(String ipress);

    @Query(value = "SELECT DISTINCT a.institucion FROM hospital a WHERE a.ubigeo = :ubigeo", nativeQuery = true)
    List<String> getAllInstitucionByUbigeo(@Param("ubigeo") String ubigeo);

    @Query(value = "select a.* from hospital a" +
            " inner join hospital_upss b on b.ipress = a.ipress" +
            " inner join upss c on c.upss = b.upss" +
            " where (:ubigeo is null or a.ubigeo = :ubigeo) " +
            " and (:institucion is null or a.institucion = :institucion) " +
            " and (:upss is null or c.upss = :upss) ", nativeQuery = true)
    List<Hospital> getAllHospitalsByUbigeoAndInstitucionAndEspecialidad(@Param("ubigeo") String ubigeo,
                                                                        @Param("institucion") String institucion,
                                                                        @Param("upss") String especialidad);
}
