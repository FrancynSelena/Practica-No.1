package practica;

import practica.Cuenta;

public class CuentaApp {
	    
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Cuenta cuenta_1 = new Cuenta("Francyn Frías");
			Cuenta cuenta_2 = new Cuenta("Selena Vásquez", 800);
			
			//Ingresa dinero en las cuentas
			cuenta_1.ingresar(400);
			cuenta_2.ingresar(100);
			
			//Retira dinero en las cuentas
			cuenta_1.retirar(0);
			cuenta_2.retirar(100);
			
			//Muestra la informacion de las cuentas
			System.out.println(cuenta_1); //400 Dólares
			System.out.println(cuenta_2); //800 Dólares
		}
	}