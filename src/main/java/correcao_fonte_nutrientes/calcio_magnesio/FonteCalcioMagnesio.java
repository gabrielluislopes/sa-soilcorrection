package correcao_fonte_nutrientes.calcio_magnesio;

import correcao_fonte_nutrientes.IFonteNutriente;
import correcao_fonte_nutrientes.NomeNutrienteAdicional;
import correcao_fonte_nutrientes.NutrienteAdicional;
import java.util.Set;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum FonteCalcioMagnesio 
        implements IFonteNutriente {

    CALCARIO_DOLOMITICO(30.4, Set.of()),
    CALCARIO_CALCITICO(56.0, Set.of()),
    CALCARIO_CONCHA(54.0, Set.of()),
    GESSO_AGRICOLA(29.0, Set.of(new NutrienteAdicional(NomeNutrienteAdicional.ENXOFRE, 0.15))),
    HIDROXIDO_CALCIO(75.7, Set.of()),
    CALCARIO_MAGNESIANO(35.0, Set.of());

    private final double teorFonte;
    private final Set<NutrienteAdicional> nutrientesAdicionais;

}
