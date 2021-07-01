package com.tesis2utp.hosplima.controller;

import com.tesis2utp.hosplima.dto.HospitalMapa;
import com.tesis2utp.hosplima.model.Hospital;
import com.tesis2utp.hosplima.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/hospitals")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping("/hospitalMapa")
    public ResponseEntity<List<HospitalMapa>> getAllHospitalMapa() {
        Integer page = 500;
        return ResponseEntity.ok().body(this.hospitalService.getAllHospitalMapa(page));
    }

    @GetMapping("/hospitalMapa/{page}")
    public ResponseEntity<List<HospitalMapa>> getAllHospitalMapaLimit(@PathVariable Integer page) {
        return ResponseEntity.ok().body(this.hospitalService.getAllHospitalMapa(page));
    }

    @GetMapping("/hospital/{ipress}")
    public ResponseEntity<Hospital> getHospitalByIpress(@PathVariable String ipress) {
        //Hospital hospital = this.hospitalService.getHospitalByIpress(ipress);
        return ResponseEntity.ok().body(this.hospitalService.getHospitalByIpress(ipress));
    }
}
