package model;
import java.time.LocalDate;

public class Empresa {

    private String razaoSocial;
    private String cnpj;
    private LocalDate dataAbertura;
    
    public Empresa(String razaoSocial, String cnpj, LocalDate dataAbertura) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataAbertura = dataAbertura;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public LocalDate getDataAbertura() {
        return dataAbertura;
    }
    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    @Override
    public String toString() {
        return "Empresa [cnpj=" + cnpj + ", dataAbertura=" + dataAbertura + ", razaoSocial=" + razaoSocial + "]";
    }

    
}
