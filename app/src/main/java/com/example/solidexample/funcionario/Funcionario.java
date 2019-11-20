package com.example.solidexample.funcionario;

enum TIPO_FUNCIONARIO{ANALISTA, ARQUITETO}

public class Funcionario {
    public TIPO_FUNCIONARIO tipoFuncionario;

    public TIPO_FUNCIONARIO getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TIPO_FUNCIONARIO tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }
}

class CalculaSalario{
    private double fValorSalario;

    public CalculaSalario(Funcionario pFuncionario){
        if(pFuncionario.tipoFuncionario == TIPO_FUNCIONARIO.ANALISTA){
            this.fValorSalario = 5000;
        }else if(pFuncionario.tipoFuncionario == TIPO_FUNCIONARIO.ARQUITETO){
            this.fValorSalario = 7000;
        }
    }

    public double getfValorSalario() {
        return this.fValorSalario;
    }
}
