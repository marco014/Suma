package Suma.models;

import java.util.ArrayList;
public class Operaciones {
    ArrayList<LecturaDatos> listanumero = new ArrayList<LecturaDatos>();
    public Operaciones(){}
    public void añadir(int num){
        int numer = num;
        listanumero.add(new LecturaDatos(num));
    }
    public void suma(){
        int suma =0;
        for (LecturaDatos lecturaDatos: listanumero) {
            suma += lecturaDatos.getNumero();
        }
        Impresion impresion= new Impresion();
        impresion.resultado(suma);
    }
    public void vizualizar(){
        for (LecturaDatos lecturaDatos: listanumero) {
            System.out.println(lecturaDatos.getNumero());
        }
    }
}
