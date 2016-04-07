/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9_12;

import java.util.Scanner;

/**
 *
 * @author osvaldo
 */
public class Exercise9_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
//        while(input.next().equals("-1")){
//            input
//        }

int x = 0;
int y = 0;
int r = 0;
int height = 0;
int width = 0;

        String data = input.next();
        if(data.length() == 5){
            x = Integer.parseInt(data.substring(0, 1));
            y = Integer.parseInt(data.substring(2, 4));
            r = Integer.parseInt(data.substring(4, 5));
            
           height = 2*r;
           width  = 2*r;
        }
        
        else if(data.length() == 7){
            x = Integer.parseInt(data.substring(0, 1));
            y = Integer.parseInt(data.substring(2, 3));
            r = Integer.parseInt(data.substring(3, 4));
            
           height = Integer.parseInt(data.substring(4, 5));
           width  = Integer.parseInt(data.substring(5, 6));
        }
        
    }
    
}

class Rectangle{
    
    double xp;
    double yp;
    double width;
    double height;
    
    Rectangle(){
    
    }
    
    Rectangle(double xc, double yc, double widthC, double heightC){
        xp = xc;
        yp = yc;
        
        width = widthC;
        height = heightC;
    }
    
    double getArea(){
     
       return width * height;
   }
    
    double getPerimeter(){
        return width*2 + height*2;
    }
}
