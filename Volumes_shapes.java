import java.util.*;
import java.math.*;
public class Volumes_shapes{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       
        int r = sc.nextInt();
        int a = sc.nextInt();
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        float pi = 3.14f;
        System.out.println("Enter Your Choice!");
        int value = sc.nextInt();

        switch(value){
            case 1:
                System.out.println("The Volume of Sphere is: " + 4/3 * pi * Math.pow(r,3));
                break;
            case 2:
                System.out.println("The Area of the Sphere is: " + 4 * pi * Math.pow(r,2));
                break;
            case 3:
                System.out.println("The Volume of the Cylinder is: " + pi * Math.pow(r,2) * h);
                break;
            case 4:
                System.out.println("The Area of the Cylinder is: " + 2 * pi * r * (r+h));
                break;
            case 5:
                System.out.println("The Volume of Cube is: " + Math.pow(a,3));
                break;
            case 6:
                System.out.println("The Area of the Cube is: " + 6 * Math.pow(a,2));
                break;
            case 7:
                System.out.println("The Volume of Cuboid is: " + 2 * ((l*b) + (b*h) + (h*l)));
                break;
            case 8:
                System.out.println("The Area of Cuboid is : " + l * b * h);
                break;
            case 9:
                System.out.println("Exit.!!!");
        default:
            System.out.println("Invalid Value");

        }
    }
}
