package com.luiza;

public class App {
    public static void main(String[] args) throws Exception {
    
        String texto = "Não se pode pisar duas vezes no mesmo rio";
        System.out.println("Texto original: "+texto);

        Codificador luiza = new CodificadorLuiza();
        Codificador ana = new CodificadorAna();
        Codificador julia = new CodificadorJulia();
        String codificado = luiza.codifica(texto);
        String codificado1 = ana.codifica(texto);
        String codificado2 = julia.codifica(texto);
        String decodificado = luiza.decodifica(codificado);
        String decodificado1 = ana.decodifica(codificado1);
        String decodificado2 = julia.decodifica(codificado2);
        
        System.out.println("Codificador: "+luiza.getNome());
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);
        System.out.println();

        System.out.println("Codificador: "+ana.getNome());
        System.out.println("Texto codificado: "+codificado1);
        System.out.println("Texto decodificado: "+decodificado1);
        System.out.println();

        System.out.println("Codificador: "+julia.getNome());
        System.out.println("Texto codificado: "+codificado2);
        System.out.println("Texto decodificado: "+decodificado2);
        
    }
}
