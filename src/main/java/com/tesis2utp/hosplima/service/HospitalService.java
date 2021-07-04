package com.tesis2utp.hosplima.service;

import com.tesis2utp.hosplima.dto.HospitalMapa;
import com.tesis2utp.hosplima.dto.HospitalUpss;
import com.tesis2utp.hosplima.model.Hospital;

import java.util.List;

public interface HospitalService {

    List<HospitalMapa> getAllHospitalMapa(Integer page);

    HospitalUpss getHospitalByIpress(String ipress);

    List<String> getAllInstitucionByUbigeo(String ubigeo);

    List<Hospital> getAllHospitalsByParameters(String ubigeo, String institucion, String especialidad);
}
