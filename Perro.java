class Perro{
  String nombre;
  float peso;
  int edadanio;
  int edadmeses;
  String raza;
  boolean macho;

public Perro(){}

public Perro(String nombre,float peso, int edadanio,int edadmeses, String raza, boolean macho){
  this.nombre=nombre;
  this.peso=peso;
  this.edadanio=edadanio;
  this.edadmeses=edadmeses;
  this.raza=raza;
  this.macho=macho;
}
public void comer(String comida){
  System.out.println("Soy "+nombre+" y estoy comiendo "+comida);
} 
public void ladrar(boolean ladrar){
  if(ladrar){
    System.out.println(nombre+" Esta ladrando");
  }else{
    System.out.println(nombre+" No estoy ladrando");
  }
}
public void jugar(String juego){
  System.out.println("Estoy jugando a "+juego);
}
public void dormir(int minutos){
  System.out.println("He estado durmiendo por "+minutos+ "minutos");
}
public void pasear(String Lugar){
  System.out.println("Estoy paseando por "+Lugar);
}

@Override
public String toString(){
  return "Perro{nombre="+nombre+", peso="+peso+", edadanios="+edadanio+", edadmeses="+edadmeses+", raza="+raza+" Es masculino?="+macho+"";
}
}
