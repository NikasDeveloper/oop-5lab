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
public class XOR extends Element {

    @Override
    public boolean getValue() {
        System.out.println("Getting value for XOR element.");

        if (this.getInput().isEmpty()) return false;

        int trueCounter = 0;
        
        for (Element element : this.getInput()) {
            if (element.getValue()) trueCounter++;
        }

        return trueCounter % 2 != 0;
    }
    
}
