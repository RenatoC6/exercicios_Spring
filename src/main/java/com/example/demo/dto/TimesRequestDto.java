package com.example.demo.dto;

import java.time.LocalDate;

public record TimesRequestDto(String nome, String pais, LocalDate fundacao) {
}
