package com.tesis2utp.hosplima.service;

import com.tesis2utp.hosplima.dto.HospitalMapa;
import com.tesis2utp.hosplima.model.Hospital;

import java.util.List;

public interface HospitalService {

    List<HospitalMapa> getAllHospitalMapa(Integer page);

    Hospital getHospitalByIpress(String ipress);

    List<String> getAllInstitucionByUbigeo(String ubigeo);
}
