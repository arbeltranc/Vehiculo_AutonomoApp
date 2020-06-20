/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo_autonomoapp;

/**
 *
 * @author USUARIO
 */
class Vehiculo_Autonomo {
    
    /*Atributos*/
    private int codigo;
    private String sensor;
    private String control;
    private int numEstacion;
    
    /*Constructores*/
    public Vehiculo_Autonomo(int pCodigo, String pSensor, String pControl, int pNumEstacion){
    
        codigo=pCodigo;
        sensor=pSensor;
        control=pControl;
        numEstacion=pNumEstacion;
    }

    /*Metodos*/
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo; /*this puntero invoca al atributo private coigo*/
    }
    public String getSensor(){
        return sensor;
    }
    public void setSensor(String sensor){
    this.sensor=sensor;
    }
    public String getControl(){
    return control;
    }
    public void setControl(String control){
    this.control=control;
    }
    public int getNumEstacion(){
    return numEstacion;
    }
    public void setNumEstacion(int numEstacion){
    this.numEstacion=numEstacion;
    }
    @Override
    public String toString(){
    return "El sensor del Vehiculo Autonomo "+sensor+" con Codigo: "+codigo+ "--"
            +"Inspeccionado por el Area de "+control
            + " tiene registrado: "+numEstacion+" estaciones";
    }}

    

     class Vehiculo_AutonomoApp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos los objetos
        Vehiculo_Autonomo manual1=new Vehiculo_Autonomo(1,"Sensor1","Control1",3);
        Vehiculo_Autonomo manual2=new Vehiculo_Autonomo(2,"sensor2","Control2",5);
        //Mostramos su estado
        System.out.println(manual1.toString());
        System.out.println(manual2.toString());
        //Modificamos el atributo NumMantenimiento del manual1
        manual1.setNumEstacion(70);
        
        //Comparamos quien tiene mas mantenimientos
        if(manual1.getNumEstacion()<manual2.getNumEstacion()){
            System.out.println(manual1.getControl()+"tiene mas estaciones");
        }else{
        System.out.println(manual2.getControl()+" tiene más estaciones");
        
    }
}}