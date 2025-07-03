package com.example.demo.dto;

import com.example.demo.model.AtletasModel;
import org.springframework.stereotype.Repository;

@Repository
public class AtletasTimeUpdateRequestDto {

    private Long idAtleta;
    private Long idTime;

    public Long getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(Long idAtleta) {
        this.idAtleta = idAtleta;
    }

    public Long getIdTime() {
        return idTime;
    }

    public void setIdTime(Long idTime) {
        this.idTime = idTime;
    }




}