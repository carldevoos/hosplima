package com.tesis2utp.hosplima.controller;

import com.tesis2utp.hosplima.dto.HospitalMapa;
import com.tesis2utp.hosplima.model.Hospital;
import com.tesis2utp.hosplima.service.impl.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/hospitals")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping("/hospitalMapa")
    public ResponseEntity<List<HospitalMapa>> getAllHospitalMapa (){
        return ResponseEntity.ok().body(this.hospitalService.getAllHospitalMapa());
    }

    @GetMapping("/hospital/{ipress}")
    public ResponseEntity<Hospital> getHospitalByIpress (@PathVariable String ipress){
        //Hospital hospital = this.hospitalService.getHospitalByIpress(ipress);
        return ResponseEntity.ok().body(this.hospitalService.getHospitalByIpress(ipress));
    }
}
