/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EA01_FANI.controller;

import com.example.EA01_FANI.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author USUARIO
 */
@Controller
public class ProductoController {
    
    
    @GetMapping("/formulario")    
    public String showForm(Model model){
        model.addAttribute("producto", new Producto());
        return "formulario";
    }
    
    @PostMapping("/guardar")
    public String submitForm(@ModelAttribute Producto producto, Model model){
        model.addAttribute("producto", producto);
        return "resultado";
    }
    
    
}
