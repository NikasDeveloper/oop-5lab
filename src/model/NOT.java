/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LebedenkoN
 */
public class NOT extends Element {

    @Override
    public void addInput(Element element) {
        if (this.getInput().size() == 0) {
            super.addInput(element);
        }
    }

    @Override
    public boolean getValue() {
        System.out.println("Getting value for NOT element.");
        return this.getInput().isEmpty()
                ? true
                : !this.getInput().get(0).getValue();
    }

}
