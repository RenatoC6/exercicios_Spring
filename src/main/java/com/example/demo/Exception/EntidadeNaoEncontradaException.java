package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class EntidadeNaoEncontradaException extends RuntimeException {
    public EntidadeNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
}
