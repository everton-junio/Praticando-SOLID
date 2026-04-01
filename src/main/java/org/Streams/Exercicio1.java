package org.Streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercicio1 {
    void main() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);
        //Use stream() + filter() para retornar apenas os pares.
        List<Integer> pares = numeros.stream()
                .filter(n -> n%2 == 0)
                .toList();

        System.out.println(pares);

    }
}

class Exercicio2{
    void main(){
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);
        //Use map() para gerar uma nova lista com os valores dobrados.
        List<Integer> valoresDobrados = numeros.stream()
                .map(n -> n*2)
                .toList();

        System.out.println(valoresDobrados);
    }
}

class Exercicio3{
    void main(){
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);
        //Use reduce() para somar todos os números.
        int numeroSomados = numeros.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(numeroSomados);
    }
}

class Exercicio4{
    void main(){
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);
        //Use filter() + count() Contar elementos maiores que 3

        long contagem = numeros.stream()
                .filter(n -> n>3)
                .count();
        System.out.println(contagem);
    }
}

class Exercicio5{
    static void main() {
        List<String> nomes = List.of("Carlos", "Ana", "Bruno", "Daniel");
        //Use sorted() para ordenar alfabeticamente.
        List<String> nomesOrdenados = nomes.stream()
                .sorted().toList();
        System.out.println(nomesOrdenados);
    }
}

class Exercicio6{
    static void main() {
        List<String> nomes = List.of("Carlos", "Ana", "Bruno", "Daniel");
        //Use map() para transformar todos os nomes em uppercase.

        List<String> nomesMaiusculos = nomes.stream()
                .map(n -> n.toUpperCase())
                .toList();
        System.out.println(nomesMaiusculos);
    }
}

class Exercicio7{
    static void main(){
        List<Integer> numeros = List.of(10, 2, 3, 4, 5, 6);

        //Use max() com Comparator, maior numero.
        int maiorNum = numeros.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(maiorNum);
    }
}

class Exercicio8{
    static void main() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);
        //Verificar se todos são positivos Use allMatch().

        boolean isPositivcs = numeros.stream()
                .allMatch(n -> n > 0);
        System.out.println(isPositivcs);
    }
}


class Exercicio9{
    static void main() {
        List<Integer> numeros = List.of(1, -22, 3, 4, 5, 6);
        //Verificar se existe número negativo Use anyMatch().

        boolean isPositivcs = numeros.stream()
                .anyMatch(n -> n < 0);
        System.out.println(isPositivcs);
    }
}

class Exercicio10{
    static void main() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);
        //Pegar o primeiro elemento maior que 4 Use filter() + findFirst().

        Optional<Integer> maiorQue4 = numeros.stream()
                .filter(n -> n > 4)
                .findFirst();
        maiorQue4.ifPresent(System.out::println);
    }
}


class Exercicio11{
    static void main() {
        List<Integer> numeros = List.of(1, 2, 2, 3, 4, 4, 5);
        //Use distinct()

        List<Integer> unicops = numeros.stream()
                .distinct().toList();
        System.out.println(unicops);
    }
}

class Exercicio12{
    static void main() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Everton", 23));
        pessoas.add(new Pessoa("Anajulia", 21));
        pessoas.add(new Pessoa("Sapo", 40));
        pessoas.add(new Pessoa("gato", 12));
        //somar idades Use map() + reduce() ou Collectors.summingDouble().

        int somaIdades1 = pessoas.stream()
                .map(Pessoa::getIdade)
                .reduce(0, (a,b) -> a+b);

        int somaIdades2 = pessoas.stream().mapToInt(Pessoa::getIdade).sum();

        System.out.println(somaIdades1);
        System.out.println(somaIdades2);
    }
}

class Exercicio13{
    static void main() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Everton", 23));
        pessoas.add(new Pessoa("Anajulia", 21));
        pessoas.add(new Pessoa("Sapo", 40));
        pessoas.add(new Pessoa("Gato", 12));
        //somar idades Use map() + reduce() ou Collectors.summingDouble().

        Map<String, Integer> chaveValor = pessoas
                .stream().
                collect(Collectors
                        .toMap(Pessoa::getNome,
                                Pessoa::getIdade
                        ));
        System.out.println(chaveValor);
    }
}

class Exercicio14{
    static void main() {
        List<String> nomes = List.of("Ana", "Bruno", "Carlos");
        //Fazer um join
        String nome = nomes.stream().collect(Collectors.joining(", "));
        String nome2 = String.join(", ",nomes);
        System.out.println(nome);
        System.out.println(nome2);

    }
}

class Exercicio15{
    static void main() {
        List<List<Integer>> lista = List.of(
                List.of(1, 2),
                List.of(3, 4, 5),
                List.of(6)
        );
        //fazer virar [1, 2, 3, 4, 5]

        List<Integer> listaCorrida = lista.stream()
                .flatMap(l -> l.stream()).toList();
        System.out.println(listaCorrida);

    }
}




class Pessoa {
    public Pessoa(String nome, int idade){
        this.idade =idade;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    String nome;
    int idade;

}