package com.tesis2utp.hosplima.service;

import com.tesis2utp.hosplima.dto.HospitalMapa;
import com.tesis2utp.hosplima.model.Hospital;
import com.tesis2utp.hosplima.repository.HospitalRepository;
import com.tesis2utp.hosplima.service.impl.HospitalService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    HospitalRepository hospitalRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<HospitalMapa> getAllHospitalMapa() {

        List<Hospital> hospitalList = hospitalRepository.findAll();
        if (!hospitalList.isEmpty()) {
            List<HospitalMapa> hospitalBasicList = hospitalList
                    .stream()
                    .map(hospital -> modelMapper.map(hospital, HospitalMapa.class))
                    .collect(Collectors.toList());

            return hospitalBasicList;
        }

        return null;
    }
}
