import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Get{
  public static void distance(){
    In in = new In("routeEWG.txt");
    EdgeWeightedGraph G = new EdgeWeightedGraph(in);
    StdOut.println(G);
  }
  public static void price(){
    In in = new In("priceEWG.txt");
    EdgeWeightedGraph_price G = new EdgeWeightedGraph_price(in);
    StdOut.println(G);
  }
  public static void PrimDistance(){
    In in = new In("routeEWG.txt");
    EdgeWeightedGraph G = new EdgeWeightedGraph(in);
    PrimMST mst = new PrimMST(G);
    for (Edge e : mst.edges()) {
        StdOut.println(e);
    }
    StdOut.printf("%.5f\n", mst.weight());
  }
  public static void PrimPrice(){
    In in = new In("priceEWG.txt");
    EdgeWeightedGraph G = new EdgeWeightedGraph(in);
    PrimMST mst = new PrimMST(G);
    for (Edge e : mst.edges()) {
        StdOut.println(e);
    }
    StdOut.printf("%.5f\n", mst.weight());
  }
}
