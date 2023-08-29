package Project_Akhir.Interface.src;
import java.util.Scanner;

public class Main2 {
   public static void main(String[] args) {
       Graph graph = new Graph();
       Scanner input = new Scanner(System.in);
       String[][] wilayah = new String[100][100];
       System.out.print("Masukkan jumlah semua wilayah secara keseluruhan: ");
       int jumlah = input.nextInt();
       for (int i = 0; i < jumlah; i++) {
           System.out.print("Wilayah " + (i + 1) + ": ");
           wilayah[i][0] = input.next();
           graph.addVertex(wilayah[i][0]);
       }
       for (int i = 0; i < jumlah; i++) {
           System.out.print("Jumlah Tetangga Wilayah " + wilayah[i][0] + ": ");
           int tetangga = input.nextInt();
           for (int j = 1; j <= tetangga; j++) {
               System.out.print("Tetangga Wilayah " +j+ ": ");
               wilayah[i][j] = input.next();
               graph.addEdge(wilayah[i][0], wilayah[i][j]);
           }
       }
       graph.printVertex();
       System.out.println();
       graph.printEdge();
       System.out.println();
       graph.coloring();
       graph.printColors();
       System.out.println();
   }
}
