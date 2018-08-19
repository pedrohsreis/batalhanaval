/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ice
 */
public class Jogador {
    String nome;
    int idade;
    int palpite;
    int ordemPlayer;
    
    Jogador(String nome, int idade, int ordemPlayer){
        this.nome = nome;
        this.idade = idade;
        this.ordemPlayer = ordemPlayer;
    }
    void darPalpite(){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println(nome + " digite o seu palpite: ");
        //int palpite = scan.nextInt();
        palpite = rand.nextInt(37) + 1;
        this.palpite = palpite;
    }
    int getPalpite(){
        return palpite;
    }
    int getOrdemPlayer(){
        return ordemPlayer;
    }
}
