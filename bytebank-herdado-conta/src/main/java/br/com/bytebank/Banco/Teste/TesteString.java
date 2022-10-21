package br.com.bytebank.Banco.Teste;

public class TesteString {

    public static void main(String[] args) {

        String nome = "Gabriel";//object literal //quando uma String é declarada dessa forma ela se torna imutável
        //Considerado má pratica
        //String outro = new String("Gabriel");

        String vazio = " Gabriel ";
        String outroVazio = vazio.trim(); //o método trim() retira os espaços no início e fim de uma String

        System.out.println(vazio.contains("Gab")); //o método contains() mostra se está contido na String
        System.out.println(outroVazio); //o método isEmpty() mostra se a String está vazia

//        System.out.println(nome.length()); //mostra qual o tamanho da String
//
//        for(int i = 0; i < nome.length(); i++){
//            System.out.println(nome.charAt(i));
//        }

        //String sub = nome.substring(1); //inicia a String da posição indicada
        //System.out.println(sub);

        //int pos = nome.indexOf("ur"); //pega a posição da String
        //System.out.println(pos);

        //char c = nome.charAt(0); //pega a posição específica do char
        //System.out.println(c);

        //um char é sempre representado em aspas simples
        //char c = 'G';
        //char d = 'g';
        //substitui um objeto por outro //como uma String é imutável é necessário criar outra String para receber as alterações
        //String outra = nome.replace(c, d);

        //transforma todas as letras em minúsculo
        //String outra = nome.toLowerCase();

        //System.out.println(nome);
        //System.out.println(outra);

    }
}
