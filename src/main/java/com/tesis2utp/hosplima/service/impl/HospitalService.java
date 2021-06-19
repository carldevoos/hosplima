package com.tesis2utp.hosplima.service.impl;

import com.tesis2utp.hosplima.dto.HospitalMapa;
import com.tesis2utp.hosplima.model.Hospital;

import java.util.List;

public interface HospitalService {

    List<HospitalMapa> getAllHospitalMapa();

    Hospital getHospitalByIpress(String ipress);
}
