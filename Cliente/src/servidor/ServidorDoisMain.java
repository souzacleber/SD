/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import cliente.Conexao;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author cleber
 */
public class ServidorDoisMain {
    
    public static void main(String[] args) {
        
      
        
        ConexaoSrvDois conexao = new ConexaoSrvDois();
            conexao.conexao();
        
    }
    
}
