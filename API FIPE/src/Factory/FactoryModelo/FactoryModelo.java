/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory.FactoryModelo;

import Objetos.Modelo;
import Objetos.Marca;
import WebService.WebService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author debor
 */
public class FactoryModelo implements IFactoryModelo{
  
    @Override
    public List<Modelo> criaModelo(int id) {
        WebService web = new WebService();
        String json = null;
        try {
            json = web.inicia("http://fipeapi.appspot.com/api/1/carros/veiculos/"+id+".json");
        } catch (Exception ex) {
            Logger.getLogger(FactoryModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<Modelo> lista = new ArrayList<Modelo>();
        Type listType = new TypeToken<ArrayList<Modelo>>() {}.getType();
        lista = new Gson().fromJson(json, listType);
        
        return lista;
       
    }
   
}
