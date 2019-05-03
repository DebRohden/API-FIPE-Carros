/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exportacao;

import Objetos.Marca;
import Objetos.Modelo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author debor
 */
public class ExportacaoJson implements exporta{

    @Override
    public boolean exportaMarca(String destino, List<Marca> marcas) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        FileWriter writer = new FileWriter(destino + "/MarcaFIPE.json");
        writer.write(gson.toJson(marcas));
        writer.close();
        return true;
    }
    @Override
    public boolean exportaModelo(String destino,List<Modelo> modelos, String marca) throws IOException{
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        FileWriter writer = new FileWriter(destino + "/Modelo-"+marca+"FIPE.json");
        writer.write(gson.toJson(modelos));
        writer.close();
        return true;
    }

}
