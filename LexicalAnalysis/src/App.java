
import Lexico.Lexico;
import Lexico.TipoToken;
import Lexico.Token;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XorNote
 */
public class App {
    public static void main(String[] args) {
        Lexico lexico = new Lexico("programa.txt");
        Token token = null;

        while((token = lexico.proximoToken()).nome != TipoToken.Fim){
            System.out.println(token);
        }
        
    }
}

/*

Para ver o andamento do buffer remover o comentario da linha 83, do arquivo LeitorDeArquivosTexto.java

*/
