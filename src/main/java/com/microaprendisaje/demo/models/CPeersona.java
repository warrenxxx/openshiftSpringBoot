package com.microaprendisaje.demo.models;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CPeersona {
    @RequestMapping("/pruebaa")
    public String nombre(){
        return "nombre";
    }
}
