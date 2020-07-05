/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7_avaliativo;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Exercicio7_avaliativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner result = new Scanner (System.in);
        float fat = 1;
        float a = 1;
        float i = 0;
        
        while(a >= 0)
        {
        System.out.println("Digite um valor: ");
        a = result.nextInt();
        fat += a;
        i++;
        }
        System.out.println("A média é"+fat/(i-1));
    }
    
}
