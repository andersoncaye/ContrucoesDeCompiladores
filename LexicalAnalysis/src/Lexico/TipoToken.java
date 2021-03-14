package Lexico;

/* @author @andersoncaye */
public enum TipoToken {
    //Palavras Chaves
    PCDeclaracoees, PCAlgoritmo, PCInteiro, PCReal, PCAtribuir, PCA, 
    PCLer, PCImprimir, PCSe, PCEntao, PCEnquanto, PCInicio, PCFim,
    //Operador Aritmético
    OpAriMult, OpAritDiv, OpAritSoma, OpAritSub, 
    //Operador Relacional
    OpRelMenor, OpRelMenorIgual, OpRelMaiorIgual, OpRelMaior, OpRelIgual, OpRelDif, 
    //Operador Boolean
    OpBoolE, OpBoolOu, 
    //
    Delim, AbrePar, FechaPar, Var, NumInt, NumReal, Cadeia, Fim
}
