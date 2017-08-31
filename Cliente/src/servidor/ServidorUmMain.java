/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

/**
 *
 * @author cleber
 */
public class ServidorUmMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConexaoSrvUm conecta = new ConexaoSrvUm();
        conecta.conexao();
    }
    
}
