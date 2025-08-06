package com.luiza;

import java.time.LocalDate;

public class CodificadorJulia implements Codificador{
    public String getNome() {
        return "Julia";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 04);
    }

    public int getNivelSeguranca(){
        return 1;
    }
    
    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char) (c * 15));
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            encoded.append((char) (c / 15));
        }
        
        return encoded.toString();
    }
}