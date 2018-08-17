/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

import java.util.Random;

/**
 *
 * @author ice
 */
public class Navio {
    int[] localizacao = new int[3];
    int contAcertos;
    boolean isDestroyed;
    String nome;
    
    Navio(String nome){
        Random rand = new Random();
        int posicao = rand.nextInt(17) + 1;
        localizacao[0] = posicao;
        //System.out.println(localizacao[0]);
        for(int i = 1; i <= 2; i++){
            posicao++;
            localizacao[i] = posicao;
            //System.out.println(localizacao[i]);
        }
        this.nome = nome;
    }
    boolean verificaAcerto(int palpite){
        for(int i = 0; i < 3; i++){
            if(palpite == localizacao[i]){
                localizacao[i] = 0;
                contAcertos++;
                return true;
            }
        }
        return false;
    }
    boolean estaDestruido(){
        if(contAcertos == 3)
            return true;
        else
            //System.out.println("O navio não foi destruido nessa rodada.");
        return false;
    }
    String getNomeNavio(){
        return nome;
    }
    
}
