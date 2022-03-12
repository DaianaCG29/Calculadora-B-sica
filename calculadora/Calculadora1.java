import javax.swing.*;
import java.awt.event.*;

public class Calculadora1 extends JFrame{
   JLabel Letrero, lblNum1, lblNum2, lblRes;
   JButton btnSuma, btnResta, btnMultiplicacion, btnDivision, btnSalir;
   JTextField txtNum1, txtNum2, txtRes;
   JPanel panel;
   
   public Calculadora1(){
   initComponents();
   }
   
   private void initComponents(){
      setSize(350,180);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      txtNum1 = new JTextField(10);
      txtNum2 = new JTextField(10);
      txtRes = new JTextField(10);
      txtRes.setEditable(false);
      
      Letrero = new JLabel("CALCULADORA BÁSICA");
      lblNum1 = new JLabel("Número 1: ");
      lblNum2 = new JLabel("\nNúmero 2: ");
      
      btnSuma = new JButton("SUMA");
      btnSuma.setMnemonic('s');
      btnResta = new JButton("RESTA");
      btnResta.setMnemonic('R');
      btnMultiplicacion = new JButton("MULTIPLICACION");
      btnMultiplicacion.setMnemonic('M');
      btnDivision = new JButton("DIVISION");
      btnDivision.setMnemonic('D');
      btnSalir = new JButton("SALIR");
      btnSalir.setMnemonic('S');
      
      btnSuma.addMouseListener(new Suma());
      btnResta.addMouseListener(new Resta());
      btnMultiplicacion.addMouseListener(new Multiplicacion());
      btnDivision.addMouseListener(new Division());
      btnSalir.addMouseListener(new MyListener());
      
      panel = new JPanel();
      panel.add(Letrero);
      panel.add(lblNum1);
      panel.add(txtNum1);
      panel.add(lblNum2);
      panel.add(txtNum2);
      panel.add(txtRes);
      panel.add(btnSuma);
      panel.add(btnResta);
      panel.add(btnMultiplicacion);
      panel.add(btnDivision);
      panel.add(btnSalir);
      
      setTitle("CALCULADORA BÁSICA_Daiana Coret Guzmán Hernández");
      setContentPane(panel);
      setVisible(true);           
   }
   
   //Operacion SUMA
   private class Suma extends MouseAdapter{
      float n1=0, n2=0, suma;
      
      public void mouseClicked(MouseEvent event){
         String x1 = txtNum1.getText();
         n1 = Integer.parseInt(x1);
         String x2 = txtNum2.getText();
         n2 = Integer.parseInt(x2);
         try{
            suma = n1 + n2;
            txtRes.setText(String.valueOf(suma));
         }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor no es correto");
            txtNum1.setText(" ");
            txtNum1.requestFocus();
            txtNum2.setText(" ");
            txtNum2.requestFocus();
            txtRes.setText("0.00");
         }
      }
   }
   
   //Operacion RESTA
   private class Resta extends MouseAdapter{
      float n1=0, n2=0, resta;
      
      public void mouseClicked(MouseEvent event){
         String x1 = txtNum1.getText();
         n1 = Integer.parseInt(x1);
         String x2 = txtNum2.getText();
         n2 = Integer.parseInt(x2);
         try{
            resta = n1 - n2;
            txtRes.setText(String.valueOf(resta));
         }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor no es correto");
            txtNum1.setText(" ");
            txtNum1.requestFocus();
            txtNum2.setText(" ");
            txtNum2.requestFocus();
            txtRes.setText("0.00");
         }
      }
   }
      
   //Operacion Multiplicacion 
   private class Multiplicacion extends MouseAdapter{
      float n1=0, n2=0, multiplicacion;
      
      public void mouseClicked(MouseEvent event){
         String x1 = txtNum1.getText();
         n1 = Integer.parseInt(x1);
         String x2 = txtNum2.getText();
         n2 = Integer.parseInt(x2);
         try{
            multiplicacion = n1 * n2;
            txtRes.setText(String.valueOf(multiplicacion));
         }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor no es correto");
            txtNum1.setText(" ");
            txtNum1.requestFocus();
            txtNum2.setText(" ");
            txtNum2.requestFocus();
            txtRes.setText("0.00");
         }
      }
   }   
   
   //Operacion DIVISION
   private class Division extends MouseAdapter{
      float n1=0, n2=0, division;
      
      public void mouseClicked(MouseEvent event){
         String x1 = txtNum1.getText();
         n1 = Integer.parseInt(x1);
         String x2 = txtNum2.getText();
         n2 = Integer.parseInt(x2);
         try{
            division = n1 / n2;
            txtRes.setText(String.valueOf(division));
         }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor no es correto");
            txtNum1.setText(" ");
            txtNum1.requestFocus();
            txtNum2.setText(" ");
            txtNum2.requestFocus();
            txtRes.setText("0.00");
         }
         if (txtNum2.getText().equals("0")) {
            
             JOptionPane.showMessageDialog(null, "NO es posible dividir entre 0",
             "Error",JOptionPane.ERROR_MESSAGE);
             txtNum2.setText(null);
             txtNum2.requestFocus();

            }
      }
   }
   
   private class MyListener extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         System.exit(0);
      }
   }   
 }  