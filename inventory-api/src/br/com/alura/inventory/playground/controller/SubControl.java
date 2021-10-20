package br.com.alura.inventory.playground.controller;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SubControl extends Control {

    private SubControl(String s) {
    }

    public void firstSubControlMethod() {
        System.out.println("Executando método SubControle.firstSubControlMethod()");
    }

    private String secondSubControlMethod() {
        System.out.println("Executando método SubControle.secondSubControlMethod()");
        return "retorno do método SubControle.secondSubControlMethod()";
    }
}
