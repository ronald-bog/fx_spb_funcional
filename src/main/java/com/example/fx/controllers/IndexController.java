package com.example.fx.controllers;

import com.example.fx.Repository.Repository;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import com.example.fx.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

@Component
public class IndexController implements Initializable {

    public javafx.scene.control.Label lblTitular;
    @Autowired
    @Qualifier("lblTitulo")
    private String titulo;

    @Autowired
    private Repository repo;

    @FXML
    private Label lblTitulo;

    @FXML
    private TextField txtNombre;


    private long Id = 1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblTitulo.setText(titulo);
    }
    @FXML
    public void save(){
        long id = 1;
        Persona per = repo.findById(id).get();
        //Persona per = new Persona();
        per.setNombre(txtNombre.getText());
        repo.save(per);
    }
}
