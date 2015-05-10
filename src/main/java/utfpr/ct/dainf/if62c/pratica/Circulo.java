/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import static java.lang.Math.PI;

/**
 *
 * @author Victor
 */
public class Circulo extends Elipse {

    private double raio;

    public Circulo(double r, double s) {
        super(r, s);
        raio = r/2;
    }

    @Override
    public double getArea() {
        double area;

        area = raio * raio * PI;

        return area;
    }

    @Override
    public double getPerimetro() {
        double perimetro;

        perimetro = 2 * PI * raio;

        return perimetro;
    }

}
