
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
public class AStar {
    
    private ArrayList<Node> list;

    public void search(Node start, Node end) {
      
        list = new ArrayList();
        start.setValueFunctionG(0);

        if (start != end) {

            list.add(start);

            boolean match = false;
            while (!list.isEmpty() && !match) {
               
                Node actual = list.remove(0);

                actual.setColor("Black");
                
                if (actual == end) {
                    match = true;
                } else {
                    
                    for (Edge edge : actual.getAdjacents()) {
                       
                        Node son = edge.getTarget();

                        double tempG = actual.getValueFunctionG() + edge.getCost();
                        double tempF = tempG + son.getValueFunctionH();

                        if (!(son.getColor().equals("Black")
                                && actual.getValueFunctionF() < tempF)) {

                            if (!list.contains(son) || son.getValueFunctionF() > tempF) {
                               
                                son.setPrevious(actual);
                                son.setValueFunctionG(tempG);
                                son.setValueFunctionF(tempF);

                                if (list.contains(son)) {
                              
                                    list.remove(son);
                                }

                                addList(son);
                            }

                        }

                    }

                }

            }
        }
    }

    private void addList(Node son) {
        if (list.isEmpty()) {
            list.add(son);
        } else {
            int cont = 0;
            while (cont < list.size()
                    && list.get(cont).getValueFunctionF() 
                    < son.getValueFunctionF()) {
                cont++;
            }
            list.add(cont, son);
        }
    }
}
