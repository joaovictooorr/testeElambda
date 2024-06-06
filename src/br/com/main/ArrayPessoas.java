package br.com.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ArrayPessoas {

    public static List<String> filtrarMulheres(String pessoas) {
        List<String> listasemvirgula = Arrays.asList(pessoas.split(","));

        List<String> mulheres = listasemvirgula.stream()
                .filter(pessoa -> pessoa.split("-")[1].trim().equals("f"))
                .collect(Collectors.toList());

        System.out.println(mulheres);

        return mulheres;
    }

}
