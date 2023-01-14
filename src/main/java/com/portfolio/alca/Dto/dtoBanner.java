/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.alca.Dto;

import javax.validation.constraints.NotBlank;

public class dtoBanner {
    @NotBlank
    private String imgB;

    public dtoBanner() {
    }

    public dtoBanner(String imgB) {
        this.imgB = imgB;
    }

    public String getImgB() {
        return imgB;
    }

    public void setImgB(String imgB) {
        this.imgB = imgB;
    }
}