package com.example.organizze.helper;

import java.text.SimpleDateFormat;

public class DateCuston {

    public static String dataAtual(){

        long date = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d/M/yyyy");
        String dataString = simpleDateFormat.format(date);
        return  dataString;

    }
    public static  String mesAnoDataEscolhida(String data){
        String retornoData[] = data.split("/");
        String dia = retornoData[0];
        String mes = retornoData[1];
        String ano = retornoData[2];

        String mesano = mes+ano;
        return mesano;
    }
}

