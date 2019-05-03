/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 *
 * @author debor
 */
public class WebService {

    /**
     * @param args the command line arguments
     */
    private final String USER_AGENT = "";

    public static String inicia(String url) throws Exception{
        WebService http = new WebService(); 
        String lista = http.sendGet(url);     
        return lista;
    }
    
    // HTTP GET request
    private String sendGet(String url) throws Exception {

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

       // System.out.println("\nSending 'GET' request to URL : " + url);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        //print result
        return response.toString();

    }
}
