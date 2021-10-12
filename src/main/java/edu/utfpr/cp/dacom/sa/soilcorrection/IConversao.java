package edu.utfpr.cp.dacom.sa.soilcorrection;

public interface IConversao<T, R> {

    public R converte(T valor);
}
