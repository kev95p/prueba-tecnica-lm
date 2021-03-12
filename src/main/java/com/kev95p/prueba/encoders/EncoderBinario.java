package com.kev95p.prueba.encoders;

import com.kev95p.prueba.intefaces.Encoder;

public class EncoderBinario implements Encoder {

    public String decimalToBinary(int decimal){
        if(decimal <= 0){
            return "0";
        }
        String binary = "";
        while (decimal > 0){
            short remain = (short) (decimal % 2);
            decimal = decimal / 2;
            binary = String.valueOf(remain) + binary;
        }
        return "0" + binary;
    }

    @Override
    public void encode(String text) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<text.length();i++){
            char current = text.charAt(i);
            String binary = decimalToBinary(current);
            result.append(binary).append(" ");
        }
        System.out.println(result);
    }
}
