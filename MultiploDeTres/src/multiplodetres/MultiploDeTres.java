package multiplodetres;

import java.util.Scanner;

public class MultiploDeTres {
    private int multiplo;
    
    public static void main(String[] args) {
        int multiplo;
        
        multiplo = (int) LeNumero();
        MultiploDeTres m = new MultiploDeTres(multiplo);
        m.calculo();
    }
    public static int LeNumero(){ // Lê o numero
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com a número: ");
        num = entrada.nextInt();
        return num;        
    }
    public MultiploDeTres(int multiplo){ // define número
        this.multiplo = multiplo;
    }
    public MultiploDeTres(MultiploDeTres m){ //get numero
        multiplo = m.getMultiplo();
    }
    public int getMultiplo(){
        return multiplo;
    }
    public void setMultiplo(int multiplo){
        this.multiplo = multiplo;
    }
    public void calculo(){ // calcula o número
        if(multiplo % 3 == 0){
            System.out.println("É multiplo de 3!");
        }
        else{
            System.out.println("Não é multiplo de 3!");
        }
    }
    public int obterMultiplo(){ //obtem o valor do número
        return multiplo;
    }
}
