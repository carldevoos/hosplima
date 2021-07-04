package com.tesis2utp.hosplima.controller;

import com.tesis2utp.hosplima.dto.HospitalMapa;
import com.tesis2utp.hosplima.dto.HospitalUpss;
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
    public ResponseEntity<HospitalUpss> getHospitalByIpress(@PathVariable String ipress) {
        return ResponseEntity.ok().body(this.hospitalService.getHospitalByIpress(ipress));
    }

    @GetMapping("/institucion/{ubigeo}")
    public ResponseEntity<List<String>> getAllInstitucionByUbigeo(@PathVariable String ubigeo) {
        return ResponseEntity.ok().body(this.hospitalService.getAllInstitucionByUbigeo(ubigeo));
    }

    @GetMapping("/hospital")
    public ResponseEntity<List<Hospital>> getAllInstitucionByUbigeoInstitucionEspecialidad(@RequestParam(required = false) String ubigeo,
                                                                    @RequestParam(required = false) String institucion,
                                                                    @RequestParam(required = false) String especialidad) {
        return ResponseEntity.ok().body(this.hospitalService.getAllHospitalsByParameters(ubigeo, institucion, especialidad));
    }
}
