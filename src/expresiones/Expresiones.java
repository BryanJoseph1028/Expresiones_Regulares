/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresiones;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author 24DD018LA
 */
public class Expresiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String cadena = null;
        System.out.println("ingrese la hora exacta");
       cadena = sc.nextLine();
        //Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");   
        //Pattern pat = Pattern.compile("^[a-zA-Z0-9]*$");
        //Pattern pat = Pattern.compile("^[a-zA-Z0-9]*$");
        //Pattern pat = Pattern.compile("(?=(.*[0-9]))");
        //Pattern pat = Pattern.compile("^[a-z0-9_-]{3,16}$");
       Pattern pat = Pattern.compile("^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$");
       //attern pat = Pattern.compile("https?:\\/\\/(www\\.)?[-a-zA-z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-z0-9@:%_\\+.~#()?&//=]*)");
       //Pattern pat = Pattern.compile("https?:\\/\\/(www\\.)?");
       //Pattern pat = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
       Matcher mat = pat.matcher(cadena);                                                                           
          if (mat.matches()) {
            System.out.println("SI");
                } else {
             System.out.println("NO");                                                                                
                         }
                      }
    
                 }
