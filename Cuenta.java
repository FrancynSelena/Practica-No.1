package practica;

public class Cuenta {
	
	//Atributos
    public String titular;
    public double cantidad;
 
    //Constructores
    public Cuenta(String titular) {
        this(titular, 0); //Sobrecarga
    }
 
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        //Si la cantidad es menor que cero, lo ponemos a cero
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }   
    }
    
    //Metodos
    public String getTitular() {
    return titular;
    }
    
    public void setTitular(String titular) {
    this.titular = titular;
    }
    
    public double getCantidad() {
    return cantidad;
    }
    
    public void setCantidad(double cantidad) {
    this.cantidad = cantidad;
    }
    
    public void ingresar(double cantidad) {
        if(cantidad > 0){
            this.cantidad += cantidad;  
        }
    }
    
    public void retirar(double cantidad) {
        if (this.cantidad - Math.abs(cantidad) < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }
    
    public String toString() {
    return"El titular: " + titular + " tiene: " + cantidad + " dolares en la cuenta";
    }
}