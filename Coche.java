class Coche{
//Seleción de atributos 
String color;
String marca;
int numPuerta;
int aniomod;
int potencia;
boolean automatico;
//Sección de constructores
public Coche(){
}
public Coche(String marca, int aniomod, String color, int numPuerta, boolean automatico, int potencia){
this.marca=marca;
this.aniomod=aniomod;
this.color=color;
this.numPuerta=numPuerta;
this.automatico=automatico;
this.potencia=potencia;
}
//Selección de metodos
public void encender(){
  System.out.println("Soy el coche de la marca "+marca+"y estoy encendiendo");
}
public void avanzar(boolean avanza){
  if(avanza){
    System.out.println("Estoy avanzando a 10 km/h");
  }else{
    System.out.println("Voy a 0 km/h");
  }
}
public void apagar(){
  System.out.println("Soy el coche de "+marca+" y estoy apagandome");
}
public void frenar(boolean frena){
  if(frena){
    System.out.println("Estoy frenando");
  }else{
    System.out.println("No estoy frenando");
  }
}
public void abrirpuertas(int numPuertaAbir){
if(numPuertaAbir>numPuerta){
  System.out.println("El numero de puertas a abrir es mayor al numero de puertas del coche");
}else{
  System.out.println("Abriendo "+ numPuertaAbir+" Puertas");
}
}


//override
public String toString(){
  return "Coche{"+"+marca="+marca+", año="+aniomod+", color="+color+", numPuerta="+numPuerta+", automatico="+automatico+", potencia="+potencia+"}";
}
}