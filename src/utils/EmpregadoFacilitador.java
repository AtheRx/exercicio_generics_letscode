package utils;

import java.time.LocalDate;

import model.Empregado;

public class EmpregadoFacilitador extends Empregado{
    
    public EmpregadoFacilitador(String nome, String cpf, String dataNasimento) {
        super(nome, cpf, LocalDate.parse(dataNasimento));
    }

}
