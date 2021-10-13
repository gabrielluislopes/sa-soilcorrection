package edu.utfpr.cp.dacom.sa.soilcorrection.Modelo.Fonte;

import edu.utfpr.cp.dacom.sa.soilcorrection.Modelo.Nutriente.NutrienteAdicional;
import java.util.Set;

public interface IFonteNutriente {
    
    public double getTeorFonte();
    public Set<NutrienteAdicional> getNutrientesAdicionais();
}
