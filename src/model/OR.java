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
public class OR extends Element {

    @Override
    public boolean getValue() {
        System.out.println("Getting value for OR element.");
        
        if(this.getInput().isEmpty()) return false;
        
        for(Element element: this.getInput()){
            if(element.getValue()) return true;
        }
        
        return false;
    }

}
