
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mpeht
 */
public class Edge {

    private final double cost;
    private Node target;

    public Edge(Node target, double cost) {
        this.cost = cost;
        this.target = target;
    }

    public double getCost() {
        return cost;
    }

    public Node getTarget() {
        return target;
    }

}
