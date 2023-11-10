package br.com.arthurrmenezes.projetojavaweb.entity;

import java.math.BigDecimal;

public class Salarios {

    private BigDecimal meuSalarioDeProgramador = BigDecimal.ZERO;
    private BigDecimal meuSalarioDeStreamer = BigDecimal.ZERO;

    public Salarios() {

    }

    public Salarios(BigDecimal meuSalarioDeProgramador) {
        this.meuSalarioDeProgramador = meuSalarioDeProgramador;
    }

    public Salarios(BigDecimal meuSalarioDeProgramador, BigDecimal meuSalarioDeStreamer) {
        this.meuSalarioDeProgramador = meuSalarioDeProgramador;
        this.meuSalarioDeStreamer = meuSalarioDeStreamer;
    }

    public BigDecimal getMeuSalarioDeProgramador() {
        return meuSalarioDeProgramador;
    }

    public void setMeuSalarioDeProgramador(BigDecimal meuSalarioDeProgramador) {
        this.meuSalarioDeProgramador = meuSalarioDeProgramador;
    }

    public BigDecimal getMeuSalarioDeStreamer() {
        return meuSalarioDeStreamer;
    }

    public void setMeuSalarioDeStreamer(BigDecimal meuSalarioDeStreamer) {
        this.meuSalarioDeStreamer = meuSalarioDeStreamer;
    }

    @Override
    public String toString() {
        return "Salarios{" +
                "meuSalarioDeProgramador=" + meuSalarioDeProgramador +
                ", meuSalarioDeStreamer=" + meuSalarioDeStreamer +
                '}';
    }
}
