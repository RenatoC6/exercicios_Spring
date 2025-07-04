package com.example.demo.controller;

import com.example.demo.dto.AtletasTimeUpdateRequestDto;
import com.example.demo.model.AtletasModel;
import com.example.demo.service.AtletasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("atletas")
public class AtletasController {

    @Autowired
    private AtletasService atletasService;

    @PutMapping("/associar-time")
    public ResponseEntity<?> associarTimeAoAtleta(@RequestBody AtletasTimeUpdateRequestDto atletasTimeUpdateRequestDto) {
            AtletasModel atletasModel = atletasService.associarTimeAoAtleta(atletasTimeUpdateRequestDto.getIdAtleta(), atletasTimeUpdateRequestDto.getIdTime());

            return ResponseEntity.status(HttpStatus.OK).body("Atleta " + atletasModel.getNome() + " atualizado para time do " + atletasModel.getTime().getNome() + " com sucesso!");



    }
}
