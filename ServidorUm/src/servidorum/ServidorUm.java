/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorum;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cleber
 */
public class ServidorUm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
    ServerSocket srv = new ServerSocket(12345);
            Socket cliente = srv.accept();
            Scanner sc;
            sc = new Scanner(cliente.getInputStream());
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException ex) {
            Logger.getLogger(ServidorUm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}