/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.alca.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String linkP;
    
    //Constructor

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String linkP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.linkP = linkP;
        
    }
    
    //Getters & Setters

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getLinkP() {
        return linkP;
    }

    public void setLinkP(String linkP) {
        this.linkP = linkP;
    }
}
