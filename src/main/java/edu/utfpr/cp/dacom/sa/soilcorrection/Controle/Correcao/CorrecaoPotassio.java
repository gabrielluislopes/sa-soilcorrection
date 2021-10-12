package edu.utfpr.cp.dacom.sa.soilcorrection.Controle.Correcao;

import edu.utfpr.cp.dacom.sa.soilcorrection.FontePotassio;
import edu.utfpr.cp.dacom.sa.soilcorrection.Modelo.Correcao.ICorrecaoNutriente;
import edu.utfpr.cp.dacom.sa.soilcorrection.Modelo.Correcao.ICorrecaoNutrienteQuantidadeAplicar;

public class CorrecaoPotassio 
        implements 
            ICorrecaoNutriente<FontePotassio>,
            ICorrecaoNutrienteQuantidadeAplicar<FontePotassio> {

    public double calculaNecessidadeAdicionarCMolcDm3 (
        double teorSolo,
        double participacaoCTCExistente,
        double participacaoCTCDesejada) {

            if (teorSolo <= 0) {
                throw new IllegalArgumentException();
            }

            if (participacaoCTCExistente <= 0) {
                throw new IllegalArgumentException();
            }

            if (participacaoCTCDesejada <= 0) {
                throw new IllegalArgumentException();
            }

            return (teorSolo 
                    * participacaoCTCDesejada 
                    / participacaoCTCExistente) 
                    - teorSolo;
    }

}
