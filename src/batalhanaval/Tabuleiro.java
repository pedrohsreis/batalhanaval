/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

/**
 *
 * @author ice
 */
public class Tabuleiro {
    Navio[] navio = new Navio[5];
    Jogador jogador;
    int numDestroyed = 0;
    boolean tabuleiroLimpo = false;
    
    Tabuleiro(){
        String nome = "Nome-navio";
        for(int i = 0; i < 5; i++){
            if(i == 0)
                nome = "Submarino";
            if(i == 1)
                nome = "Porta-aviões";
            if(i == 2)
                nome = "Transportador";
            if(i == 3)
                nome = "Navio-tanque";
            if(i == 4)
                nome = "Contra torpedo";
            navio[i] = new Navio(nome);
        }
    }
    
    boolean acertouNavio(int posicao){
        int navioAcertado = -1;
        for(int i = 0; i < 5; i++){
            if(!navio[i].estaDestruido()){
                if(navio[i].verificaAcerto(posicao)){
                    System.out.println("Você acertou!");
                    navioAcertado = i;
                    break;
                }else{
                    System.out.println("Você errou!");
                    break;
                }
            }
        }
        if(navioAcertado != -1 && navio[navioAcertado].estaDestruido()){
            System.out.println("Você conseguiu destruir o navio: " + navio[navioAcertado].getNomeNavio());
            numDestroyed++;
        }
        if(navioAcertado != -1){
            return true;
        }else {
            return false;
        }
    }
    boolean isTabuleiroLimpo(){
        if(numDestroyed == 4)
            return true;
        else
            return false;
    }
    
    
}
