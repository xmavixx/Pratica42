
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Victor
 */
public class Pratica42 {

    private static final Circulo c = new Circulo(5);
    private static final Elipse e = new Elipse(5, 5);

    public static void main(String[] args) {
        System.out.println("Area da Elipse: " + e.getArea());
        System.out.println("Perimetro da Elipse: " + e.getPerimetro());
        System.out.println("Area do Circulo: " + c.getArea());
        System.out.println("Perimetro do Cirulo: " + c.getPerimetro());

    }
}
