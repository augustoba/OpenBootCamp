package com.company;

public class Main {



    public static void main(String[] args) {

        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int Suma (int a, int b,int c){
        int Resultado = a+b+c;
        return Resultado;
    }

    static class Coche {
        public int puertas =0;

        public void SumarPuertas(){
            this.puertas++;
        }

    }
