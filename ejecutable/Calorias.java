package ejecutable;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Calorias{

    public static void main(String[] args) {
        
        int[] calorias;
        int pro;
        int dias = 0;
        calorias = new int [7];

        for (int i =0; i< calorias.length; i++){
            
            dias = dias + 1;

            calorias [i] = Integer.parseInt(JOptionPane.showInputDialog("Dijite las calorias del dia "+ dias));


        }
        JOptionPane.showMessageDialog(null,"\nCalorias de la semana: "+"\n Lunes: "+ calorias[0] + "\n Martes: "
        + calorias[1] +"\n Miercoles: "+ calorias[2]+"\n Jueves: "+ calorias[3]+ "\n Viernes: "+ calorias[4] 
        +"\n Sabado: "+ calorias[5]+ "\n Domingo: "+ calorias[6]);

        // Promedio
        pro = (calorias[0]+calorias[1]+calorias[2]+calorias[3]+calorias[4]+calorias[5]+calorias[6])/7;

        
        

        // Mayor
        int mayorCalorias = calorias[0];
        int diaMayorCalorias = 0;
        for (int i = 1; i < 7; i++) {
            if (calorias[i] > mayorCalorias) {
                mayorCalorias = calorias[i];
                diaMayorCalorias = i;
    }

}    String[] diasSemanaMayor = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    String mensaje = "\n El día con más calorías es el: " + diasSemanaMayor[diaMayorCalorias] + " con " + mayorCalorias + " calorías.";
    //JOptionPane.showMessageDialog(null, mensaje);

        // Menor
        int menorCalorias = calorias[0];
        int diaMenorCalorias = 0;
        for (int i = 1; i < 7; i++) {
            if (calorias[i] < menorCalorias) {
                menorCalorias = calorias[i];
                diaMenorCalorias = i;
    }

}    String[] diasSemanaMenor = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
String mensaje2 = "\n El día con menos calorías es el: " + diasSemanaMenor[diaMenorCalorias] + " con " + menorCalorias + " calorías.";
    

    JOptionPane.showMessageDialog(null," Datos extras: "+"\n El promedio fue de : "+pro+ mensaje
    + mensaje2);    

    // Orden ascendente de calorias
    Arrays.sort(calorias);

    String caloriasAscendente = "Calorias en orden ascendente:\n";
    for (int i = 0; i < calorias.length; i++) {
        caloriasAscendente += diasSemanaMenor[i] + ": " + calorias[i] + "\n";
    }
    JOptionPane.showMessageDialog(null, caloriasAscendente);

    // Orden descendente de calorias
    String caloriasDescendente = "Calorias en orden descendente:\n";
    for (int i = calorias.length - 1; i >= 0; i--) {
        caloriasDescendente += diasSemanaMenor[i] + ": " + calorias[i] + "\n";
    }
    JOptionPane.showMessageDialog(null, caloriasDescendente);


    }

}