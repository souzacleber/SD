/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidordois;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author cleber
 */
public class ServidorDois extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     try {
            
            ServerSocket srv = new ServerSocket(54321);
            Socket cliente = srv.accept();
            Scanner sc;
            sc = new Scanner(cliente.getInputStream());
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException ex) {
            Logger.getLogger(ServidorDois.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
   
