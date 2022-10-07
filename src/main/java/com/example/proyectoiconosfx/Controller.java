package com.example.proyectoiconosfx;

import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;

public class Controller implements Initializable {

    private TextFieldName name;




    public void setName(ActionEvent actionEvent ) {
        try {
            URL enlace = new URL(enlaceFijo + enlaceDinamico);
            ObjectMapper mapa = new ObjectMapper();
            Response respuesta = mapa.getResults().stream().forEach(System.out::println);
        }catch (IOException e){
            System.out.println(e);
        }

    }



}
