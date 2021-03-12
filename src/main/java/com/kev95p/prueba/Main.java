package com.kev95p.prueba;

import com.kev95p.prueba.encoders.EncoderBinario;
import com.kev95p.prueba.encoders.EncoderMorse;
import com.kev95p.prueba.encoders.EncoderMurcielago;
import com.kev95p.prueba.intefaces.Encoder;

public class Main {
    public static void main(String[] args){
        Encoder encoder = new EncoderMorse()
                .addEncoder(new EncoderBinario())
                .addEncoder(new EncoderMurcielago());
        encoder.encode("Kennia");
    }
}
