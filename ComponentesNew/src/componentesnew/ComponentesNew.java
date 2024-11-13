/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentesnew;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
/**
 *
 * @author Alumno
 */
public class ComponentesNew extends JFrame{
    private JTextArea textArea = new JTextArea();
    private ButtonGroup botonGrupo1 = new ButtonGroup();
    private JRadioButton radio1 = new JRadioButton();
    private JRadioButton radio2 = new JRadioButton();
    private JCheckBox check1 = new JCheckBox();
    private JCheckBox check2 = new JCheckBox();
    
    public ComponentesNew(){
        setTitle("Copiar Pegar");
        setSize(350,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void AddComponentes(JPanel panel1){
        textArea.setBounds(10, 20, 300, 100);
        panel1.add(textArea);
        
        botonGrupo1.add(radio1);
        botonGrupo1.add(radio2);
        
        radio1.setBounds(10,130,80,30);
        radio1.setText("Radio 1");
        panel1.add(radio1);
        
        radio2.setBounds(10,130,80,30);
        radio2.setText("Radio 2");
        panel1.add(radio2);
    }

    
    public static void main(String[] args) {
        ComponentesNew ventana = new ComponentesNew();
        panel1.setlayout(null);
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        
        ventana.getContentPane().add(panel1);
        ventana.AddComponentes(panel1);
        
        ventana.setVisible(true);
    }
    
}
