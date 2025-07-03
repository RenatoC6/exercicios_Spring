package com.example.demo.service;

import com.example.demo.Exception.EntidadeNaoEncontradaException;
import com.example.demo.dto.AtletasTimeUpdateRequestDto;
import com.example.demo.model.AtletasModel;
import com.example.demo.model.TimesModel;
import com.example.demo.repository.AtletasRepository;
import com.example.demo.repository.TimesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtletasService {

    @Autowired
    private AtletasRepository atletaRepository;

    @Autowired
    private TimesRepository timeRepository;


    public void associarTimeAoAtleta(Long idAtleta, Long idTime) {
        AtletasModel atleta = atletaRepository.findById(idAtleta)
                .orElseThrow(() -> new EntidadeNaoEncontradaException("Atleta não encontrado"));
        TimesModel time = timeRepository.findById(idTime)
                .orElseThrow(() -> new EntidadeNaoEncontradaException("Time não encontrado"));

        atleta.setTime(time);   // ou atleta.setIdTime(idTime) se for só o ID
        atletaRepository.save(atleta);
    }


}
