package com.luiza;

import java.time.LocalDate;

public class CodificadorLuiza implements Codificador {
    public String getNome() {
        return "Luiza";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 13);
    }

    public int getNivelSeguranca(){
        return 1;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        char chave = 'z';
        for (char c : str.toCharArray()) {
            encoded.append((char) (c ^ chave)); 
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();
        
        char chave = 'z';
        for (char c : str.toCharArray()) {
            encoded.append((char) (c ^ chave)); 
        }
        
        return encoded.toString();
    }
}