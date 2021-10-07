class Main {
    public static void main(String[] args){
   KeyboardInput in=new KeyboardInput();
   while(true){
     System.out.print("Escriba un digito: ");
     int n=in.readInteger();
     if(n==5){
       System.out.print("Escribio un 5. Termina");
       break;
     }
   }}}
