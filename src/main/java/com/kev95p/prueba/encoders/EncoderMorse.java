package com.kev95p.prueba.encoders;

import com.kev95p.prueba.intefaces.Encoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EncoderMorse implements Encoder {

    HashMap<String,String> codigo = new HashMap<String, String>();
    List<Encoder> additionalEncoders;

    public EncoderMorse(){
        additionalEncoders = new ArrayList<Encoder>();
        setup();
    }

    public EncoderMorse addEncoder(Encoder e){
        additionalEncoders.add(e);
        return this;
    }

    private void setup(){
        codigo.put("A", ".-");
        codigo.put("B", "-...");
        codigo.put("C", "-.-.");
        codigo.put("CH", "----");
        codigo.put("D", "-..");
        codigo.put("E", ".");
        codigo.put("F", "..-.");
        codigo.put("G", "--.");
        codigo.put("H", "....");
        codigo.put("I", "..");
        codigo.put("J", ".---");
        codigo.put("K", "-.-");
        codigo.put("L", ".-..");
        codigo.put("M", "--");
        codigo.put("N", "-.");
        codigo.put("Ñ", "--.--");
        codigo.put("O", "---");
        codigo.put("P", ".--.");
        codigo.put("Q", "--.-");
        codigo.put("R", ".-.");
        codigo.put("S", "...");
        codigo.put("T", "-");
        codigo.put("U", "..-");
        codigo.put("V", "...-");
        codigo.put("W", ".--");
        codigo.put("X", "-..-");
        codigo.put("Y", "-.--");
        codigo.put("Z", "--..");
    }

    private String executeAlgorithm(String text){

        StringBuilder result = new StringBuilder();
        for(int i = 0; i< text.length(); i++){
            String character = String.valueOf(text.charAt(i)).toUpperCase();
            String charEncoded = codigo.get(character);
            if(charEncoded != null)
                result.append(charEncoded).append(" ");
        }
        return result.toString();
    }

    @Override
    public void encode(String text) {
        System.out.println(executeAlgorithm(text));
        additionalEncoders.forEach(e->e.encode(text));
    }
}
