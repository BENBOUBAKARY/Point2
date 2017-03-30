/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package point2;

import java.awt.Point;

/**
 *
 * @author user
 */
public class Point2 {
    float y;
    float x;
    
    public void afficherCoordonnée(){
        System.out.print("abscice \n" + y);
        System.out.print("ordonnéé \n"+ x);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float Point;
        Point P = new Point(); 
        P.x=2;
        P.y=3;
        P.afficherCoordonnée();
        P.CalculDistance(P.x, P.y);
                }
    
}
