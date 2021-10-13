package edu.utfpr.cp.dacom.sa.soilcorrection.Controle.Correcao;

import edu.utfpr.cp.dacom.sa.soilcorrection.Controle.Fonte.FonteCalcioMagnesio;
import edu.utfpr.cp.dacom.sa.soilcorrection.Modelo.Correcao.ICorrecaoNutriente;

public class CorrecaoCalcioMagnesio 
        implements ICorrecaoNutriente<FonteCalcioMagnesio> {

    public double calculaQuantidadeAplicar(
        double qtdeFonteAdicionar, 
        double prntPercent) {

        if (qtdeFonteAdicionar <= 0) {
            throw new IllegalArgumentException();
        }

        if (prntPercent <= 0) {
            throw new IllegalArgumentException();
        }

        return qtdeFonteAdicionar / prntPercent;
    }
}
