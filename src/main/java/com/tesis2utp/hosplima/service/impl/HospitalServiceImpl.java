package com.tesis2utp.hosplima.service.impl;

import com.tesis2utp.hosplima.dto.HospitalMapa;
import com.tesis2utp.hosplima.dto.HospitalUpss;
import com.tesis2utp.hosplima.exception.ResourceNotFoundException;
import com.tesis2utp.hosplima.model.Hospital;
import com.tesis2utp.hosplima.model.Upss;
import com.tesis2utp.hosplima.repository.HospitalRepository;
import com.tesis2utp.hosplima.repository.UpssRepository;
import com.tesis2utp.hosplima.service.HospitalService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    @Autowired
    private UpssRepository upssRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<HospitalMapa> getAllHospitalMapa(Integer page) {

        List<HospitalMapa> hospitalBasicList = new ArrayList<>();
        try {
            List<Hospital> hospitalList = this.hospitalRepository.findAllWithLimit(PageRequest.of(0, page));
            if (!hospitalList.isEmpty()) {
                hospitalBasicList = hospitalList
                        .stream()
                        .map(hospital -> modelMapper.map(hospital, HospitalMapa.class))
                        .collect(Collectors.toList());
            }

        } catch (IllegalArgumentException e) {
            return hospitalBasicList;
        }
        return hospitalBasicList;
    }

    @Override
    public HospitalUpss getHospitalByIpress(String ipress) {

        Optional<Hospital> hospitalOptional = this.hospitalRepository.findByIpress(ipress);

        if (hospitalOptional.isPresent()) {
            List<Upss> upssList = this.upssRepository.findAllUpssByIpress(ipress);
            HospitalUpss hospitalUpss = modelMapper.map(hospitalOptional.get(), HospitalUpss.class);
            hospitalUpss.setUpssList(upssList);
            return hospitalUpss;
        } else {
            throw new ResourceNotFoundException("Hospital no encontrado");
        }
    }

    @Override
    public List<String> getAllInstitucionByUbigeo(String ubigeo) {

        return this.hospitalRepository.getAllInstitucionByUbigeo(ubigeo);
    }

    @Override
    public List<Hospital> getAllHospitalsByParameters(String ubigeo, String institucion, String especialidad) {
        return this.hospitalRepository.getAllHospitalsByUbigeoAndInstitucionAndEspecialidad(ubigeo, institucion, especialidad);
    }

}
