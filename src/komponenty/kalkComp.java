/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komponenty;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author trile
 */
public class kalkComp extends JPanel{

    public kalkComp() {
   
        JButton plus  = new javax.swing.JButton();
       JButton minus = new javax.swing.JButton();
       JButton mnoz = new javax.swing.JButton();
       JButton dziel  = new javax.swing.JButton();
       plus.setText("na farenhajt");      minus.setText("-");      mnoz.setText("*");      dziel.setText("/");
       JTextField liczba1 = new javax.swing.JTextField("liczba a");
     JTextField liczba2 = new javax.swing.JTextField("liczba b");
       JLabel liczba3 = new javax.swing.JLabel("wynik");
       
        setLayout(new BorderLayout());
        add(plus, BorderLayout.CENTER);
         
                add(liczba1, BorderLayout.LINE_START);
            
                  add(liczba3, BorderLayout.AFTER_LINE_ENDS);
       plus.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              double wynik;
            wynik =  32+1.8* Double.parseDouble(liczba1.getText());
            liczba3.setText(Double.toString(wynik));
                      
           }
       });
         minus.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              double wynik;
              wynik = Double.parseDouble(liczba1.getText())- Double.parseDouble(liczba2.getText());
              liczba3.setText(Double.toString(wynik));
                      
           }
       });
       
           mnoz.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              double wynik;
              wynik = Double.parseDouble(liczba1.getText())* Double.parseDouble(liczba2.getText());
              liczba3.setText(Double.toString(wynik));
                      
           }
       });
       
            dziel.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              double wynik;
              wynik = Double.parseDouble(liczba1.getText())/Double.parseDouble(liczba2.getText());
              liczba3.setText(Double.toString(wynik));
                      
           }
       });
    
    }

   
   
 
}
    
    
    

