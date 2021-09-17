package com.atividadeindividual.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;


@RestController
public class Exercicio1 {
    @GetMapping("/reverte")
    public String reverteString(String nome){
        String resultado = "";
        for (int x = nome.length() - 1; x >= 0; x--) {
            resultado += nome.charAt(x);
        }

        String segundaP;
        segundaP = new StringBuffer(nome).reverse().toString();
        if (nome.equalsIgnoreCase(segundaP)) {
            segundaP="  é palindromo";
        } else {
            segundaP=" Não é Palindromo";
        }

        return(resultado.toUpperCase() +" ----- "+segundaP);
    }



}
