class Alumno{
  //ATRIBUTOS
String nombre;
String apellidos;
int edad;
int numerocuenta;
boolean calificacion;
public Alumno(){}
 //Constructores
 public Alumno(String nombre,String apellidos, int edad, int numerocuenta, boolean calificacion){
   this.nombre=nombre;
   this.apellidos=apellidos;
   this.edad=edad;
   this.numerocuenta=numerocuenta;
   this.calificacion=calificacion;
 }
 //metodos
 public void Matematicas(int promedio){
   if(promedio>6){
     System.out.println("El alumno:"+nombre+apellidos+"aprobo la materia de matematicas con"+promedio);
     }else{
       System.out.println("El alumno: "+nombre+apellidos+" reprobo la materia de matematicas con "+promedio);
     }
   }
   public void incripcion(int numeroins){
     System.out.println("El alumno con n° de cuenta: "+numerocuenta+" tiene el numero de incripcion: "+numeroins);
   }
   public void ingreso(int dia,String mes,int ano){
     System.out.println(nombre+" "+apellidos+" ingreso a prepa 7 el "+dia+" de "+mes+" del "+ano);
   }
  public void semestre(boolean con){
  System.out.println("El alumno "+nombre+" "+apellidos+" completo su registro al semestre 2021 "+con);
  }  
  public void asistenciaMat(float clases,float clasesvistas){
    float asis=(clasesvistas/clases)*100;
    if(asis>70){
    System.out.println("El alumno "+nombre+" "+apellidos+" tuvo un "+asis+"% de asistencia, tiene derecho a examen final");
    }else{
        System.out.println("El alumno "+nombre+" "+apellidos+" tuvo un "+asis+"% de asistencia, no tiene derecho a examen final");
    }
  }
  public String toString(){
  return "El alumno: "+nombre+" "+apellidos+" de "+edad+" años, con numero de cuenta "+numerocuenta+ " ¿Reprobo la materia de matematicas? "+calificacion+"";
 }
}
