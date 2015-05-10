/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Victor
 */
public class Circulo extends Elipse{

    public Circulo(double r){
        super(r, r);
      
    }
    
    @Override
    public double getArea(){
        
        double Area = Math.PI*Math.pow(getEixoMaior(),2);
        return(Area);
    }
    
   
    @Override
    public double getPerimetro(){
       
       double Perimetro = 2*Math.PI*getEixoMaior();
        return(Perimetro);
       
    }
}
