package com.tesis2utp.hosplima.service.impl;

import com.tesis2utp.hosplima.model.UbigeoDistrito;
import com.tesis2utp.hosplima.repository.UbigeoDistritoRepository;
import com.tesis2utp.hosplima.service.UbigeoDistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbigeoDistritoServiveImpl implements UbigeoDistritoService {

    @Autowired
    private UbigeoDistritoRepository ubigeoDistritoRepository;

    @Override
    public List<UbigeoDistrito> getAllUbigeoDistrito() {

        List<UbigeoDistrito> ubigeoDistritoList = this.ubigeoDistritoRepository.findAll();

        return ubigeoDistritoList;
    }
}
