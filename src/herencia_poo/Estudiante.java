/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_poo;



public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float Notafinal;
    
    public Estudiante(String Nombre,String Apellido,int Edad,int codigoEstudiante,float Notafinal){
    super(Nombre,Apellido,Edad);
    this.codigoEstudiante=codigoEstudiante;
    this.Notafinal=Notafinal;
    
    }
    
    public void mostrarDatos(){
    System.out.println("Nombre: "+getNombre()+
            "\nApellido: "+getApellido()+
            "\nEdad: "+getEdad()+
            "\nCodigo: "+codigoEstudiante+
            "\nNota Final: "+Notafinal );
    }
    
}
