package utfpr.ct.dainf.if62c.pratica;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Victor
 */
public class Elipse implements FiguraComEixos{
    public double r;
    public double s;
    
    @Override
    public double getEixoMaior(){
        
        return r; 
    }
    @Override
    public double getEixoMenor(){
        return s;
    }
    
    public Elipse(double r, double s){
        this.r = r;
        this.s = s;
        
    }

    public double getArea(){
        double Area;
        Area = Math.PI*getEixoMaior()*getEixoMenor();
        return (Area);
    }
       
    public double getPerimetro(){
        double Perimetro;
        Perimetro = Math.PI*((3*(getEixoMaior()+getEixoMenor()))- (Math.sqrt((3*getEixoMaior()+getEixoMenor())*(getEixoMaior()+3*getEixoMenor()))));
        return (Perimetro);
    }    

}
