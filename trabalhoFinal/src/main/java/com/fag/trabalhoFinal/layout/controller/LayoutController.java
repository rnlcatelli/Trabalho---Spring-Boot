/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.trabalhoFinal.layout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class LayoutController {

    @GetMapping("/create-layout")
    public String showLayout() {
        // você deseja retornar
        return "newhtml";
    }

}
