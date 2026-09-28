/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
/**
 *
 * @author mirel
 */
public class Videojuegos {
    //aquí van los ATRIBUTOS
    private String titulo;  private String genero;    private int precio;    
    //aquí el CONSTRUCTOR
    public Videojuegos(){}    
    //aquí GET-SET
    public String   getTitulo()               {return titulo;}
    public void     setTitulo(String titulo)  {this.titulo = titulo;}
    public String   getGenero()               {return genero;}
    public void     setGenero(String genero)  {this.genero = genero;}
    public int      getPrecio()               {return precio;}
    public void     setPrecio(int precio)     {this.precio = precio;}    
    //aquí van los MÉTODOS
    //método para calcular 
    public int calPreWeb(){
        int preWeb;
        preWeb = precio * 2;
        return preWeb;    }    
    //método para enviar los datos a la JTable
    public Object[] Registrar(){
        Object[] fila={titulo, genero, precio, calPreWeb()};
        return fila;    }                
}
