
public class CalculadoraUsandoWhile{

    public void multiplosDeCinco(){        
        int multiplo = 5;
        while(multiplo < (95 - 5)){            
            System.out.println(multiplo + 5);
            multiplo = multiplo + 5;
        }
    }
    
    public void sumaDeValores(){
        int numero = 0;
        int suma = 0;
        while (numero <= 10){
            suma = suma + numero;
            numero ++;
        }
        System.out.println(suma);    
    }
    
    public int sumaDeValoresEnElIntervalo(int a, int b){
        int resultado = 0; 
        int valorA = a;
        if (a >= 0 && b >= 0){   
            if (a == b){
                resultado = a;
            }
            else{                
                int contador = 0;
                if (b < a){
                    a = b;
                    b = valorA;                    

                }
                int intervalo = b - a;
                while (contador <= intervalo){
                    resultado = resultado + a;
                    a ++;
                    contador ++;
                }
            }
        }     
        else{
            System.out.println("Introduce un número positivo");
            resultado = -1;
        }
        return resultado;
    }
}
