package Project_Akhir.Interface.src;

public class Main {
   public static void main(String[] args) {
      Graph project = new Graph();
      
      project.addVertex("Lombok Barat");
      project.addVertex("Ampenan");
      project.addVertex("Cakranegara");
      project.addVertex("Mataram");
      project.addVertex("Sandubaya");
      project.addVertex("Sekarbela");
      project.addVertex("Selaparang");
      project.addVertex("Lautan");
      
      project.addEdge("Lombok Barat", "Ampenan");
      project.addEdge("Lombok Barat", "Cakranegara");
      project.addEdge("Lombok Barat", "Mataram");
      project.addEdge("Lombok Barat", "Sandubaya");
      project.addEdge("Lombok Barat", "Sekarbela");
      project.addEdge("Lombok Barat", "Selaparang");
      project.addEdge("Lombok Barat", "Lautan"); 
      project.addEdge("Ampenan", "Sekarbela");
      project.addEdge("Ampenan", "Selaparang");
      project.addEdge("Ampenan", "Lautan");
      project.addEdge("Ampenan", "Lombok Barat");
      project.addEdge("Cakranegara", "Mataram");
      project.addEdge("Cakranegara", "Sandubaya");
      project.addEdge("Cakranegara", "Selaparang");
      project.addEdge("Cakranegara", "Lombok Barat");
      project.addEdge("Mataram", "Sekarbela");
      project.addEdge("Mataram", "Selaparang");
      project.addEdge("Mataram", "Sandubaya");
      project.addEdge("Mataram", "Cakranegara");
      project.addEdge("Mataram", "Lombok Barat");
      project.addEdge("Sandubaya", "Mataram");
      project.addEdge("Sandubaya", "Cakranegara");
      project.addEdge("Sandubaya", "Lombok Barat");
      project.addEdge("Sekarbela", "Ampenan");
      project.addEdge("Sekarbela", "Mataram");
      project.addEdge("Sekarbela", "Selaparang");
      project.addEdge("Sekarbela", "Lautan");
      project.addEdge("Sekarbela", "Lombok Barat");
      project.addEdge("Selaparang", "Ampenan");
      project.addEdge("Selaparang", "Mataram");
      project.addEdge("Selaparang", "Sekarbela");
      project.addEdge("Selaparang", "Lombok Barat");
      project.addEdge("Lautan", "Ampenan");
      project.addEdge("Lautan", "Sekarbela");
      project.addEdge("Lautan", "Lombok Barat");
      
      project.printVertex();
      System.out.println();
      project.printEdge();
      System.out.println();
              
      project.coloring();
      project.printColors();
      System.out.println();
   
      
      
      
      
      
   }
}
