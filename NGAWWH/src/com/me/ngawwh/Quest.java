package com.me.ngawwh;

public class Quest {
	private String Nombre;
	private String Contenido;
	
	public Quest(){}
	
	public void set_Nombre(String n){
		Nombre = n;
	}
	
	public void set_Contenido(String c){
		Contenido = c;
	}
	
	public String get_Nombre(){
		return Nombre;
	}
	
	public String get_Contenido(){
		return Contenido;
	}

}
