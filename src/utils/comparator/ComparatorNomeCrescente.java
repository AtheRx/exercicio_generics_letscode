package utils.comparator;

import java.util.Comparator;

import model.Empregado;
import model.Empresa;

public class ComparatorNomeCrescente<T> implements Comparator<T>{

    @Override
    public int compare(T t1, T t2){

        if(!(t1 instanceof Empregado &&  t2 instanceof Empregado) && !(t1 instanceof Empresa &&  t2 instanceof Empresa)){
            try {
                throw new Exception("Objeto de Classe ainda nao suportadada, ordenamento nao ralizado.");
            } catch (Exception e) {
                System.err.println(e);
            }

        }

        if (t1 instanceof Empregado && t2 instanceof Empregado){
            Empregado empregado1 = (Empregado) t1;
            Empregado empregado2 = (Empregado) t2;

            if (empregado1.getNome().compareTo(empregado2.getNome()) > 0){
                return 1;
            }
            return -1;
        }

        if (t1 instanceof Empresa && t2 instanceof Empresa){
            Empresa empresa1 = (Empresa) t1;
            Empresa empresa2 = (Empresa) t2;

            if (empresa1.getRazaoSocial().compareTo(empresa2.getRazaoSocial()) > 0){
                return 1;
            }
            return -1;
        }

        return 0;
    }

}