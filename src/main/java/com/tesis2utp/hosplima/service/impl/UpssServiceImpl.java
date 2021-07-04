package com.tesis2utp.hosplima.service.impl;

import com.tesis2utp.hosplima.model.Upss;
import com.tesis2utp.hosplima.repository.UpssRepository;
import com.tesis2utp.hosplima.service.UpssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpssServiceImpl implements UpssService {

    @Autowired
    private UpssRepository upssRepository;

    @Override
    public List<Upss> findAllUpssByUbigeo(String ubigeo) {

        List<Upss> upssList = this.upssRepository.findAllUpssByUbigeo(ubigeo);

        return upssList;
    }

    @Override
    public List<Upss> findAllUpssByIpress(String ipress) {
        List<Upss> upssList = this.upssRepository.findAllUpssByIpress(ipress);

        return upssList;
    }
}
