package com.example.springboot.dtos;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

// iniciar dentro do parenteses como argumento todos os produtos que será iniciado
public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {


}
