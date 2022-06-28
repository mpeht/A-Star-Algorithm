/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mpeht
 */
public class Node {

    private final String name;
    private double valueFunctionF;
    private double valueFunctionG;
    private final double valueFunctionH;
    private Node previous;
    private Edge[] adjacents;
    private String color;

    public Node(String name, double valueFunctionH) {
        this.name = name;
        this.valueFunctionH = valueFunctionH;
        this.color = "White";
        this.valueFunctionF = 0;
    }

    public String getName() {
        return name;
    }

    public double getValueFunctionF() {
        return valueFunctionF;
    }

    public double getValueFunctionG() {
        return valueFunctionG;
    }

    public double getValueFunctionH() {
        return valueFunctionH;
    }

    public Node getPrevious() {
        return previous;
    }

    public Edge[] getAdjacents() {
        return adjacents;
    }

    public String getColor() {
        return color;
    }

    public void setValueFunctionF(double valueFunctionF) {
        this.valueFunctionF = valueFunctionF;
    }

    public void setValueFunctionG(double valueFunctionG) {
        this.valueFunctionG = valueFunctionG;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setAdjacents(Edge[] adjacents) {
        this.adjacents = adjacents;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
