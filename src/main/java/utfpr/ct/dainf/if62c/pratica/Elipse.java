/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

/**
 *
 * @author Victor
 */
public class Elipse {
    private double eixo1, eixo2;
    
    public Elipse(double r, double s){
        eixo1 = r/2;
        eixo2 = s/2;
    }
    
    public double getArea(){
        double area;
        
        area = eixo1 * eixo2 * PI;
        
        return area;
    }
    
    public double getPerimetro(){
        double perimetro;
        
        perimetro = PI * (3*(eixo1+eixo2) - sqrt((3*eixo1+eixo2)*(eixo1+3*eixo2)));
        
        return perimetro;
    }
    
}
