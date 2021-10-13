package edu.utfpr.cp.dacom.sa.soilcorrection.Fontes;

import edu.utfpr.cp.dacom.sa.soilcorrection.Nutrientes.NutrienteAdicional;
import java.util.Set;

public interface IFonteNutriente {
    
    public double getTeorFonte();
    public Set<NutrienteAdicional> getNutrientesAdicionais();
}
