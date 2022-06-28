/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mpeht
 */
public class Principal {

    public static void main(String[] args) {
        Node Oradea = new Node("Oradea", 380);
        Node Zerind = new Node("Zerind", 374);
        Node Arad = new Node("Arad", 366);
        Node Timisoara = new Node("Timisoara", 329);
        Node Lugoj = new Node("Lugoj", 244);
        Node Mehadia = new Node("Mehadia", 241);
        Node Dobreta = new Node("Dobreta", 242);
        Node Craiova = new Node("Craiova", 160);
        Node Sibiu = new Node("Sibiu", 253);
        Node Rimnicu_Vilcea = new Node("Rimnicu Vilcea", 193);
        Node Fagaras = new Node("Fagaras", 176);
        Node Pitesti = new Node("Pitesti", 100);
        Node Giurgiu = new Node("Giurgiu", 77);
        Node Bucharest = new Node("Bucharest", 0);
        Node Urziceni = new Node("Urziceni", 80);
        Node Neamt = new Node("Neamt", 234);
        Node Iasi = new Node("Iasi", 226);
        Node Vaslui = new Node("Vaslui", 199);
        Node Hirsova = new Node("Hirsova", 151);
        Node Eforie = new Node("Eforie", 161);

        Oradea.setAdjacents(new Edge[]{
            new Edge(Zerind, 71),
            new Edge(Sibiu, 151)
        });

        Zerind.setAdjacents(new Edge[]{
            new Edge(Arad, 75),
            new Edge(Oradea, 71)
        });

        Arad.setAdjacents(new Edge[]{
            new Edge(Zerind, 75),
            new Edge(Timisoara, 118),
            new Edge(Sibiu, 140)
        });

        Timisoara.setAdjacents(new Edge[]{
            new Edge(Arad, 118),
            new Edge(Lugoj, 111)
        });

        Lugoj.setAdjacents(new Edge[]{
            new Edge(Timisoara, 111),
            new Edge(Mehadia, 70)
        });

        Mehadia.setAdjacents(new Edge[]{
            new Edge(Lugoj, 70),
            new Edge(Dobreta, 75)
        });

        Dobreta.setAdjacents(new Edge[]{
            new Edge(Mehadia, 75),
            new Edge(Craiova, 120)
        });

        Craiova.setAdjacents(new Edge[]{
            new Edge(Dobreta, 120),
            new Edge(Rimnicu_Vilcea, 146),
            new Edge(Pitesti, 138)
        });

        Sibiu.setAdjacents(new Edge[]{
            new Edge(Oradea, 151),
            new Edge(Fagaras, 99),
            new Edge(Rimnicu_Vilcea, 80),
            new Edge(Arad, 140)
        });

        Rimnicu_Vilcea.setAdjacents(new Edge[]{
            new Edge(Sibiu, 80),
            new Edge(Craiova, 146),
            new Edge(Pitesti, 97)
        });

        Fagaras.setAdjacents(new Edge[]{
            new Edge(Sibiu, 99),
            new Edge(Bucharest, 211)
        });

        Pitesti.setAdjacents(new Edge[]{
            new Edge(Rimnicu_Vilcea, 97),
            new Edge(Bucharest, 101),
            new Edge(Craiova, 138)
        });

        Giurgiu.setAdjacents(new Edge[]{
            new Edge(Bucharest, 90)
        });

        Bucharest.setAdjacents(new Edge[]{
            new Edge(Fagaras, 211),
            new Edge(Pitesti, 101),
            new Edge(Giurgiu, 90),
            new Edge(Urziceni, 85)
        });

        Urziceni.setAdjacents(new Edge[]{
            new Edge(Bucharest, 85),
            new Edge(Vaslui, 142),
            new Edge(Hirsova, 98)
        });

        Neamt.setAdjacents(new Edge[]{
            new Edge(Iasi, 87)
        });

        Iasi.setAdjacents(new Edge[]{
            new Edge(Neamt, 87),
            new Edge(Vaslui, 92)
        });

        Vaslui.setAdjacents(new Edge[]{
            new Edge(Urziceni, 142),
            new Edge(Iasi, 92)
        });

        Hirsova.setAdjacents(new Edge[]{
            new Edge(Urziceni, 98),
            new Edge(Eforie, 86)
        });

        Eforie.setAdjacents(new Edge[]{
            new Edge(Hirsova, 86)
        });

        AStar star = new AStar();
        star.search(Oradea, Neamt);
        System.out.println(run(Neamt));
    }

    private static String run(Node end) {
        Node temp = end;
        String way = "}";
        while (temp != null) {
            way = temp.getName() + "->" + way;
            temp = temp.getPrevious();
        }
        way = "{" + way;
        return way;
    }
}
