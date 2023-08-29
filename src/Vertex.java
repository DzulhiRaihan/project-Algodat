package Project_Akhir.Interface.src;

public class Vertex {
   String name;
   Vertex next;
   int routeCount = 0;
   int color = 0;
   Edge route;
   Edge Endroute;
   boolean visited = false;
   String [] colors = {"Kuning","Merah","Hijau","Biru","Oranye","Ungu"};
   
   Vertex (String name){
      this.name = name;
   }
}