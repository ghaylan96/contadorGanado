package ar.edu.unlam.pb2.practicas;

public class Contador {

//	Modelar un Cuentaganado con:
//	� Caracter�sticas (atributos): contador.

	Integer contador;
	
//	� Sabe hacer (m�todos): contar, mostrar y reiniciarse.
	
	
	public Contador() {
		
	}
	
	public Integer getContador() {
		return contador;
	}

	public void setContador(Integer contador) {
		this.contador = contador;
	}
	
	
	public void reinciar() {
		contador=0;
	}

}
