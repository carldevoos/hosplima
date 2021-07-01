package com.tesis2utp.hosplima.controller;

import com.tesis2utp.hosplima.dto.HospitalMapa;
import com.tesis2utp.hosplima.model.UbigeoDistrito;
import com.tesis2utp.hosplima.service.UbigeoDistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/ubigeos")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
public class UbigeoDistritoController {

    @Autowired
    private UbigeoDistritoService ubigeoDistritoService;

    @GetMapping("/distritos")
    public ResponseEntity<List<UbigeoDistrito>> getAllUbigeoDistrito() {
        return ResponseEntity.ok().body(this.ubigeoDistritoService.getAllUbigeoDistrito());
    }
}
