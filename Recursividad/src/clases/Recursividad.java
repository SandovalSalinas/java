package clases;

public class Recursividad {
    public void Imprimir(int x){
        if(x <= 8){
            System.out.print(x + " ");
            Imprimir(x + 1);
        }
    }
}
