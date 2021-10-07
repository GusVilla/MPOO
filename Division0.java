class Main {
    public static void main(String[] args){
      KeyboardInput in=new KeyboardInput();
      int n=0;
      for(int i=0; i<10; i++){
        System.out.print("Escriba un digito: ");
        n=in.readInteger();
        if(n==0){
          System.out.println("Division entre cero");
          continue;}
   }}}
    
