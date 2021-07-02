package com.tesis2utp.hosplima.controller;

import com.tesis2utp.hosplima.model.Upss;
import com.tesis2utp.hosplima.service.UpssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/upss")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class UpssController {

    @Autowired
    private UpssService upssService;

    @GetMapping("/especialidad/{ubigeo}")
    public ResponseEntity<List<Upss>> getAllUpssByUbigeo(@PathVariable String ubigeo) {
        return ResponseEntity.ok().body(this.upssService.findAllUpssByUbigeo(ubigeo));
    }
}
