import java.util.Scanner;
import java.lang.Math;

public class CityDistancesProgram 
{
   public static void main(String[] args)
   {
     Scanner keyboard = new Scanner(System.in);

     //x and y coordinates of each city
     int x1, y1, x2, y2, x3, y3, x4, y4;

     //Variable for the distances of each route
     double route1, route2, route3, route4, route5, route6; 

   
     double city1city2, city2city3, city3city4, city4city1, city2city4, city3city1;
     double city2city1, city3city2, city4city3, city1city4, city4city2, city1city3;

     double shortestRoute;

     System.out.println("Enter the value of each city's x-coordinate and y-coordinate");
     System.out.println(" ");

     //First city
     System.out.println("City 1's x-coordinate:");
     x1 = keyboard.nextInt();
     System.out.println("City 1's y-coordinate:"); 
     y1 = keyboard.nextInt();

     //Second city
     System.out.println("City 2's x-coordinate:");
     x2 = keyboard.nextInt();
     System.out.println("City 2's y-coordinate:"); 
     y2 = keyboard.nextInt();

     //Third city
     System.out.println("City 3's x-coordinate:");
     x3 = keyboard.nextInt();
     System.out.println("City 3's y-coordinate:"); 
     y3 = keyboard.nextInt();

     //Fourth city
     System.out.println("City 4's x-coordinate:");
     x4 = keyboard.nextInt();     
     System.out.println("City 4's y-coordinate:"); 
     y4 = keyboard.nextInt();

     System.out.println(" ");
     System.out.println("City 1's coordinates are: (" +  x1 + ", "  +  y1 +")");
     System.out.println("City 2's coordinates are: (" +  x2 + ", "  +  y2 +")");
     System.out.println("City 3's coordinates are: (" +  x3 + ", "  +  y3 +")");
     System.out.println("City 4's coordinates are: (" +  x4 + ", "  +  y4 +")");

       //Computing all possible combinations of distance between each city
       city1city2 = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2)); //city1 to city2 
       city3city1 = Math.sqrt((x1 - x3)*(x1 - x3) + (y1 - y3)*(y1 - y3)); //city1 to city3 
       city4city1 = Math.sqrt((x1 - x4)*(x1 - x4) + (y1 - y4)*(y1 - y4)); //city4 to city1
       city2city3 = Math.sqrt((x2 - x3)*(x2 - x3) + (y2 - y3)*(y2 - y3)); //city2 to city3 
       city3city4 = Math.sqrt((x3 - x4)*(x3 - x4) + (y3 - y4)*(y3 - y4)); //city3 to city4 
       city2city4 = Math.sqrt((x2 - x4)*(x2 - x4) + (y2 - y4)*(y2 - y4)); //city2 to city4 

       city2city1 = city1city2; //city2 to city1
       city3city2 = city2city3; //city3 to city2
       city4city3 = city3city4; //city4 to city3
       city1city4 = city4city1; //city1 to city4
       city4city2 = city2city4; //city4 to city2
       city1city3 = city3city1; //city1 to city3

    
       route1 = city1city2 + city2city3 + city3city4 + city4city1;
       route2 = city1city2 + city2city4 + city4city3 + city3city1;
       route3 = city1city3 + city3city2 + city2city4 + city4city1;
       route4 = city1city3 + city3city4 + city4city2 + city2city1;
       route5 = city1city4 + city4city2 + city2city3 + city3city1;
       route6 = city1city4 + city4city3 + city3city2 + city2city1;

       System.out.println(" ");
       System.out.println("The first route has a total distance of " + route1 + " km");
       System.out.println("The second route has a total distance of " + route2 + " km");
       System.out.println("The third route has a total distance of " + route3 + " km");
       System.out.println("The fourth route has a total distance of " + route4 + " km");
       System.out.println("The fifth route has a total distance of " + route5 + " km");
       System.out.println("The sixth route has a total distance of " + route6 + " km");

       shortestRoute = Math.min(Math.min(route1, Math.min(route2,route3)), Math.min(route4,Math.min(route5,route6)));
       System.out.println(" ");

       boolean r1 = shortestRoute == route1 || shortestRoute == route6;
       boolean r2 = shortestRoute == route2 || shortestRoute == route4;
       boolean r3 = shortestRoute == route3 || shortestRoute == route5;

       if(r1 && r2 && r3) 
       {
         System.out.println("Every route has the same distance, there is no best route");
       }
       else if(r1 && r2)
       {
         System.out.println("route1, route2, route4 and route6 are the best routes");
       }
       else if(r1 && r3)
       {
         System.out.println("route1, route3, route5 and route6 are the best routes");
       }
       else if(r2 && r3)
       {
         System.out.println("route2, route3, route4 and route5 are the best routes");
       }
       else if(r1)
       {
         System.out.println("route1 and route6 are the best routes");
       }
       else if(r2)
       {
         System.out.println("route2 and route4 are the best routes");
       }
       else
       {
         System.out.println("route3 and route5 are the best routes");
       }
   }
