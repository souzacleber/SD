/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cleber
 */
public class ConexaoSrvDois extends Thread{
    
    public void conexao() {
    
        try {
            
            ServerSocket srv = new ServerSocket(54321);
            Socket cliente = srv.accept();
            Scanner sc = new Scanner(cliente.getInputStream());
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            System.out.println("Conexao com "+cliente.getInetAddress().getHostAddress());
        } catch (IOException ex) {
            Logger.getLogger(ConexaoSrvDois.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
     
}
