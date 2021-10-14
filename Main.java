class Main {
  public static void main(String[] args) {
    Coche coche1 = new Coche();
    coche1.aniomod=2020;
    coche1.automatico=true;
    coche1.color="Blanco";
    coche1.marca="Nissan";
    coche1.numPuerta=5;
    coche1.potencia=150;
  
   
    System.out.println("#####################");
    Coche coche2=new Coche("Mazda",2021,"negro",3,false,200);
      coche1.encender();
      coche2.encender();
    coche1.avanzar(true);
    coche2.avanzar(false);
    coche1.frenar(true);
    coche2.frenar(false);
    coche1.apagar();
     coche2.apagar();
      coche1.abrirpuertas(4);
    coche2.abrirpuertas(5);
     System.out.println("#####################");
    System.out.println(coche1);
    System.out.println(coche2);
     System.out.println("#####################");
     Perro perro1=new Perro("Firulais",(float) 5.80,2,6,"Chihuahua",false);//casteo
     Perro perro2=new Perro("Juan",6.4f,6,10,"Puddle",true);
     perro1.comer("Jamon");
     perro2.comer("Croquetas");
     perro1.ladrar(true);
     perro2.ladrar(false);
     perro1.jugar("Pelota");
     perro2.jugar("Cuerda");
     perro1.dormir(15);
     perro2.dormir(6);
     perro1.pasear("Plaza");
     perro2.pasear("Playa");
      System.out.println(perro1);
       System.out.println(perro2);
    System.out.println("#####################");
    Alumno alumno1=new Alumno("Sebastian","Varela Vazquez", 19, 12345, true);
    alumno1.Matematicas(4);
    alumno1.incripcion(1299);
    alumno1.ingreso(5,"Octubre",2017);
    alumno1.semestre(true);
    alumno1.asistenciaMat(20f,15f);
    System.out.println(alumno1);
  }
}