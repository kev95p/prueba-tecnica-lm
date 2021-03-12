package com.kev95p.prueba.encoders;

import com.kev95p.prueba.intefaces.Encoder;

import java.util.HashMap;

public class EncoderMurcielago implements Encoder {

    HashMap<String,String> codigo = new HashMap<String, String>();

    public EncoderMurcielago(){
        setup();
    }

    public void setup(){
        codigo.put("M", "0");
        codigo.put("U", "1");
        codigo.put("R", "2");
        codigo.put("C", "3");
        codigo.put("I", "4");
        codigo.put("E", "5");
        codigo.put("L", "6");
        codigo.put("A", "7");
        codigo.put("G", "8");
        codigo.put("O", "9");
    }

    @Override
    public void encode(String text) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i< text.length(); i++){
            String character = String.valueOf(text.charAt(i));
            String charEncoded = codigo.get(character);
            if(charEncoded != null) {
                result.append(charEncoded);
            }else{
                result.append(character);
            }
        }
        System.out.println(result);
    }
}
