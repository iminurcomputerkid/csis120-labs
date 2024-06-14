import java.util.Scanner;
public class AsciiArt {
    public static void main(String[] args){
    printRectangle(3,3);

    }
    public static void printRectangle(int width, int height){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printTriangle(int size){
        for(int i = 1; i <= size; i++){
            for(int j = 0; j < i; j++){
              System.out.print(i + " ");  
            }
            System.out.println();
        }
    }

    public static void printPyramid(int size){
     for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size-i; j++){
              System.out.print(" ");  
            }
            for(int j = 1; j<=2 * i - 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}
