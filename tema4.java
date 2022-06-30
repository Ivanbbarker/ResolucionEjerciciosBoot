Public class main {
  
  public static void main(String [] args){
    
    //IFS
    
    int numero = 0;
    
    if(numero<0){
      System.out.println("La variable es un numero negativo");
    }else if(numero>0){
      System.out.println("La variable es un numero positivo");
    }else{
      System.out.println("La variable es igual a 0");
    }
    
    //parte WHILE
    
       int numeroW = 1;

        while(numeroW < 3){
            numeroW++;
            System.out.println("La variable se ha incrementado");
            System.out.println(numeroW);
        }
        System.out.println("Fin del Bucle, valor: "+ numeroW);
        
    //parte DO WHILE
    
      int numeroDWh = 3;
       
       do{
            numeroDW ++;
            System.out.println("La variable se ha incrementado");
            System.out.println(numeroDW);
        }while(numeroDW < 3);
        
    //parte FOR
    
         for(int numeroF = 0; numeroF <= 5; numeroF ++)
            System.out.println("numeroF: " + numeroFor);
        }
    
    //parte SWITCH
    
      String estacion = "otoño";
        switch(estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("No es una estación");
      
    }

  }
