package com.tesis2utp.hosplima.service;

import com.tesis2utp.hosplima.dto.HospitalMapa;
import com.tesis2utp.hosplima.exception.ResourceNotFoundException;
import com.tesis2utp.hosplima.model.Hospital;
import com.tesis2utp.hosplima.repository.HospitalRepository;
import com.tesis2utp.hosplima.service.impl.HospitalService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    HospitalRepository hospitalRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<HospitalMapa> getAllHospitalMapa() {

        List<HospitalMapa> hospitalBasicList = new ArrayList<>();
        List<Hospital> hospitalList = hospitalRepository.findAll();

        if (!hospitalList.isEmpty()) {
            hospitalBasicList = hospitalList
                    .stream()
                    .map(hospital -> modelMapper.map(hospital, HospitalMapa.class))
                    .collect(Collectors.toList());
        }

        return hospitalBasicList;
    }

    @Override
    public Hospital getHospitalByIpress(String ipress) {

        Optional<Hospital> hospitalOptional = this.hospitalRepository.findByIpress(ipress);

        if (hospitalOptional.isPresent()) {
            return hospitalOptional.get();
        } else {
            throw new ResourceNotFoundException("Hospital no encontrado");
        }
    }

}
