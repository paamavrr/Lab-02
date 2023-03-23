
package labb02;
import java.util.Scanner;
public class Labb02 {

    public static void main(String[] args) {
        int x;
        Plan p = new Plan("Preferencial",15000,80);
        Plan n = new Plan("Normal",7000,120);
        do{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese su nombre:");
            String nom= leer.nextLine();
            System.out.println("Ingrese su Cantidad de mins que desea:");
            int mins= leer.nextInt();

            int plan;
            do{
                System.out.println("ingrese 1 para el plan preferencial 2 para normal:");
                plan = leer.nextInt();
            }while ((plan<1)||(plan>2));
            if (plan == 1){
                System.out.println("---------------------");
                p.setCantCliente((p.getCantCliente()+1));
                
                Cliente c = new Cliente(nom,p,mins);
                System.out.println("Valor total de su plan:ARS "+c.Calculo());
            }
            else{
                System.out.println("----------------------");
                n.setCantCliente((n.getCantCliente()+1));
                
                Cliente c = new Cliente(nom,n,mins);
                System.out.println("Valor total de su plan:ARS "+c.Calculo());
                }
            System.out.println("0 para seguir 1 para salir");
            x = leer.nextInt();
        }while(x==0);
        System.out.println("Cantidad de clientes de plan normal: "+n.getCantCliente());
        System.out.println("Cantidad de clientes de plan preferencial: "+p.getCantCliente());
    }   
}
