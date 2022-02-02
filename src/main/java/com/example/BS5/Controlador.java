package com.example.BS5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controlador {

    public Controlador() {
        log.error("hola desde controlador 1");
        log.warn("hola desde controlador 1");
        log.info("hola desde controlador 1");

    }
}
