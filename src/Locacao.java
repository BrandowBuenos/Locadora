import java.util.Date;

import Cliente.java;
import Veiculos.java;

/**
 * Locacao
 */
public class Locacao {
    static int codigodalocacao;
    boolean seguro;
    float valordadiaria;
    Date datainicio;
    Date datafinal;

    Public Locacao() {

    }

    public setValorDaDiaria(float valordadiaria) {
        this.valordadiaria = valordadiaria;
    }

    public getValorDaDiaria() {
        return this.valordadiaria;
    }

    public void setDataInicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public Date getDataInicio() {
        return this.datainicio;
    }

    public void setDataFinal(Date datafinal) {
        this.datafinal = datafinal;
    }

    public Date getDataFinal() {
        return this.datafinal;
    }

    public boolean verificaSeguro(boolean seguro) {
        return this.seguro;
    }

}