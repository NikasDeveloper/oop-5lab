/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author LebedenkoN
 */
public class Schema {

    ArrayList<Element> elements = new ArrayList<>();

    public ArrayList<Element> getElements() {
        return elements;
    }
    
    public void addInput() {
        this.elements.add(new Input());
    }

    public void addNotElement() {
        this.elements.add(new NOT());
    }

    public void addOrElement() {
        this.elements.add(new OR());
    }

    public void addAndElement() {
        this.elements.add(new AND());
    }

    public void addXorElement() {
        this.elements.add(new XOR());
    }

    public void concatElements(int from, int to) {
        Element elementFrom = null;
        Element elementTo = null;

        for (Element element : this.elements){
            if(element.getId() == from) elementFrom = element;
            if(element.getId() == to) elementTo = element;
        }
        
        if(elementFrom != null && elementTo != null){
            elementTo.addInput(elementFrom);
        }
    }
    
    public void deconcatElements(int from, int to){
        Element elementFrom = null;
        Element elementTo = null;

        for (Element element : this.elements){
            if(element.getId() == from) elementFrom = element;
            if(element.getId() == to) elementTo = element;
        }
        
        if(elementFrom != null && elementTo != null){
            elementTo.removeInput(elementFrom);
        }
    }
    
    public boolean getElementValue(int id) {
        for (Element element : this.elements) {
            if (element.getId() == id) return element.getValue();
        }
        return false;
    }
    
    public void setElementValue(int id, boolean value){
        for (Element element : this.elements) {
            if (element.getId() == id) element.setValue(value);
        }
    }
    
    public void removeElement(int id){
        Element input = null;

        for (Element element : this.elements) {
            if (element.getId() == id) input = element;
        }

        if (input != null) {
            elements.remove(input);
            for (Element element : this.elements)
                element.getInput().remove(input);
        }
    }
    
    public void print(){
        for (Element element : this.elements) {
            System.out.println("ID:"
                    + element.getId() + " "
                    + element.getClass() + " "
                    + "Output " + element.getValue()
                    + " concatinated with"
            );

            if (element.getInput().size() > 0) {
                for (Element input : element.getInput()) {
                    System.out.println(
                        "\t" + "ID:" + input.getId() + " " + input.getClass()
                    );
                }
            } else {

                System.out.println("NOT FOUND");
            }
        }
    }

}
