/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;
import java.util.Scanner;
/**
 *
 * @author ice
 */
public class Jogador {
    String nome;
    int idade;
    int palpite;
    
    Jogador(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    void darPalpite(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu palpite: ");
        int palpite = scan.nextInt();
        this.palpite = palpite;
    }
    int getPalpite(){
        return palpite;
    }
}
