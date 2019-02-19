/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojava;

/**
 *
 * @author Estudiante
 */
public class EjemploJava {
    static boolean esVocal(char letra){
        if(letra == 'A' || letra == 'E' || letra == 'I'
        || letra == 'O' || letra == 'U'){
        return true; 
    }
        return false;
} 
    public static void main(String[] args) {
        char [][] letras = {{ 'A', 'B', 'C'},
                            { 'D', 'F', 'H'},
                            { 'Z', 'N', 'G'},
                            { 'R', 'P', 'W'}};
        
       for(int i=0; i<4; i++){
           for(int j=0; j<3; j++){
               if(esVocal(letras[i][j])){
                   System.out.println("["+letras[i][j]+"]");
               }
           }
       }
       for(int i=0; i<letras.length; i++){
           for(int j=0; j<letras[i].length; j++){
              if(esVocal(letras[i][j])){
                   System.out.println("["+letras[i][j]+"]");
               }
           }
       }
    }
 }
 
