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
public class Element {

    public static int counter = 1;
    private int id;
    private boolean value;
    private int x;
    private int y;
    private ArrayList<Element> input = new ArrayList();

    public Element() {
        this.id = counter++;
        System.out.println("Element with id " + this.id + " has been created");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void addInput(Element element){
        this.input.add(element);
    }
    
    public void removeInput(Element element){
        this.input.remove(element);
    }

    public ArrayList<Element> getInput() {
        return input;
    }
    
}
