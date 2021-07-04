package com.tesis2utp.hosplima.service;

import com.tesis2utp.hosplima.model.Upss;

import java.util.List;

public interface UpssService {

    List<Upss> findAllUpssByUbigeo(String ubigeo);

    List<Upss> findAllUpssByIpress(String ipress);
}
