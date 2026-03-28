package org.example;


public class SingleResponsability {
    static void main(String[] args){
        Aluno aluno = new Aluno("20211125006", "Everton Junio Batista Paulino");
        System.out.println(aluno);
    }
}

class Aluno{
    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nome: ");
        stringBuilder.append(nome);
        stringBuilder.append("\n");
        stringBuilder.append("Matricula: ");
        stringBuilder.append(matricula);
        return stringBuilder.toString();
    }
}