package utils;

import java.time.LocalDate;

import model.Empresa;

public class EmpresaFacilitador extends Empresa{
    
    public EmpresaFacilitador(String razaoSocial, String cnpj, String dataAbertura) {
        super(razaoSocial, cnpj, LocalDate.parse(dataAbertura));
    }

}
