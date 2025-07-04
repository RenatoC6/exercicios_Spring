package com.example.demo.service;

import com.example.demo.Exception.EntidadeNaoEncontradaException;
import com.example.demo.dto.AtletasTimeUpdateRequestDto;
import com.example.demo.model.AtletasModel;
import com.example.demo.model.TimesModel;
import com.example.demo.repository.AtletasRepository;
import com.example.demo.repository.TimesRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AtletasService {

    @Autowired
    private AtletasRepository atletaRepository;

    @Autowired
    private TimesRepository timeRepository;


    public String associarTimeAoAtleta(Long idAtleta, Long idTime) {
        AtletasModel atleta = atletaRepository.findById(idAtleta)
                .orElseThrow(() -> new EntidadeNaoEncontradaException("Atleta não encontrado"));
        TimesModel time = timeRepository.findById(idTime)
                .orElseThrow(() -> new EntidadeNaoEncontradaException("Time não encontrado"));

        atleta.setTime(time);
        atletaRepository.save(atleta);

        return "Atleta " + atleta.getNome() + " atualizado para time do " + time.getNome() + " com sucesso!";
    }


}
