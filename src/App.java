import java.util.ArrayList;
import java.util.List;

import model.Empregado;
import model.Empresa;
import model.Teste;
import utils.EmpregadoFacilitador;
import utils.EmpresaFacilitador;
import utils.MyOwnLists;
import utils.comparator.ComparatorNomeCrescente;

public class App{

    public static void main(String[] args) {
    
    List<Empregado> empregados = criaListaEmpregado();
    List<Empresa> empresas = criaListaEmpresas();
    List<Teste> testes = criaListaTestes();

    List<Empregado> empregadosList = MyOwnLists.asListedSorted(empregados, new ComparatorNomeCrescente<Empregado>());   
    printList(empregadosList);

    System.out.println("\n\n");
    
    List<Empresa> empresasList = MyOwnLists.asListedSorted(empresas, new ComparatorNomeCrescente<Empresa>());   
    printList(empresasList);

    System.out.println("\n\n");
    
    List<Teste> testesList = MyOwnLists.asListedSorted(testes, new ComparatorNomeCrescente<Teste>());   
    printList(testesList);

    }


    public static void printList(List<?> lista){
        for (Object item: lista){
            System.out.println(item);
        }
    }


    public static List<Empregado> criaListaEmpregado(){

        List<Empregado> empregados = new ArrayList<>();

        Empregado empregado1 = new EmpregadoFacilitador("Jose", "11111111111", "2000-01-01");
        Empregado empregado2 = new EmpregadoFacilitador("Maria", "22222222222", "2012-01-10");
        Empregado empregado3 = new EmpregadoFacilitador("Joao", "33333333333", "2000-01-02");
        Empregado empregado4 = new EmpregadoFacilitador("Pedro", "44444444444", "1998-05-05");        

        empregados.add(empregado1);
        empregados.add(empregado2);
        empregados.add(empregado3);
        empregados.add(empregado4);
    
        return empregados;        
    }


    public static List<Empresa> criaListaEmpresas(){

        List<Empresa> empresas = new ArrayList<>();

        Empresa empresa1 = new EmpresaFacilitador("Banco do Brasil", "000000000000191", "1808-10-12");
        Empresa empresa2 = new EmpresaFacilitador("Bradesco", "60746948000112", "1943-03-10");
        Empresa empresa3 = new EmpresaFacilitador("Itau", "60872504000123", "1945-01-02");
        Empresa empresa4 = new EmpresaFacilitador("Santander", "90400888000142", "1857-01-01");
    
        empresas.add(empresa1);
        empresas.add(empresa2);
        empresas.add(empresa3);
        empresas.add(empresa4);
    
        return empresas;        
    }


    public static List<Teste> criaListaTestes(){

        List<Teste> testes = new ArrayList<>();
    
        testes.add(new Teste());
        testes.add(new Teste());
        testes.add(new Teste());
        testes.add(new Teste());
    
        return testes;        
    }
}
