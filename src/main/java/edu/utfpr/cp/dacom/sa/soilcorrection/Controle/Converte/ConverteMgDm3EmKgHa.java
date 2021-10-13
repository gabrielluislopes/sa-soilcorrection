package edu.utfpr.cp.dacom.sa.soilcorrection.Controle.Converte;

import edu.utfpr.cp.dacom.sa.soilcorrection.Modelo.Converte.IConversao;
import lombok.NonNull;

public class ConverteMgDm3EmKgHa implements IConversao<Double, Double> {

    @Override
    public Double converte(@NonNull Double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException();
        }

        return valor * 2;
    }
}