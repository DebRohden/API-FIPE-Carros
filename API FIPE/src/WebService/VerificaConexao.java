/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author debor
 */
public class VerificaConexao {

    public static boolean consegueConectar(String address) {
        try {
            URL url = new URL(address);
            URLConnection connection = url.openConnection();
            connection.connect();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

}
