package com.example.prova_03_06_2022;

public class Gabarito {
    public static final String Q2 = "Cite pelo menos 3 situações onde a referência this pode ser usada. E onde não pode ser usada? (1,00)";
    public static final String Q3 = "Quais detalhes importantes podem ser observados na declaração de uma classe Java? (1,00)";
    public static final String Q4 = "Explique o conceito de escopo presente na linguagem Java. (1,00)";
    public static final String Q5 = "Como funciona a sobrecarga (overload) de métodos no Java?";
    public static final String Q6 = "Explique o conceito de cast. Quais os tipos existentes? (1,00)";
    public static final String R2 = "Operador this serve para exclarecer redundâncias entre atributos de classe e variáveis de lista de argumentos, e não deve ser usado quando não houver redundância.";
    public static final String R3 = "PrimeiraLetraMaiúscula de cada palavra, sem espaço em branco entre as palavras do nome da classe.";
    public static final String R4 = "Corpo da classe, ou do método. É o nome que se dá a responsbilidade da classe ou do método, devendo somente ser escrito dentro dele, o que se deseja codar. O inicio do escopo é descrito por abre chaves {, e o final do corpo por fecha chaves }. ";
    public static final String R5 = "Possibilita vários métodos com o mesmo nome detro da mesma classe, com lista de argumentos diferente obrigatóriamente diferentes, para esclarecimento de qual método o sistema deve usar";
    public static final String R6 = "O cast consiste em converter números ou classes. Existe o downcasting que se trata da 'conversão para baixo' que torna mais especifico, como por exemplo uma construtor da classe Motocicleta recebe a mensagem Yamaha 150 2022. E o upcasting ou 'conversão para cima' que torna o torna mais genérico, como exemplo um número float que converte para int";

    Gabarito(){}
    public String exibirQuestao(int questao){
        if(questao == 2){
            return Q2;
        } else if(questao == 3 ){
            return Q3;
        } else if(questao == 4 ){
            return Q4;
        }else if(questao == 5 ){
            return Q5;
        } else{
            return Q6;
        }
    }
    public String exibirResposta(int questao){
        if(questao == 2){
            return R2;
        } else if(questao == 3 ){
            return R3;
        } else if(questao == 4 ){
            return R4;
        }else if(questao == 5 ){
            return R5;
        } else{
            return R6;
        }
    }




//botoes 48x48


}
