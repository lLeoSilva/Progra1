package proyecto_leo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Nivel_Facil extends JFrame {

    public JButton vBoton1 = new JButton("LEVEL 1");
    public JButton vBoton2 = new JButton("LEVEL 2");
    public JButton vBoton3 = new JButton("LEVEL 3");
    public JButton vBoton5 = new JButton("LEVEL 4");
    public JButton vBoton6 = new JButton("EXIT");
    public JButton vBoton4 = new JButton("Back");

    public Nivel_Facil() {
        super("EASY");
        setResizable(false);
        JLabel vEtiqueta1 = new JLabel("EASY LEVEL");
        JLabel vFondo = new JLabel();
        Panel Panel = new Panel();
        Panel.setLayout(null);
        Font fuente = new Font("COURIER", Font.BOLD, 24);
        Font fuente2 = new Font("Courier", Font.BOLD, 15);
        vBoton6.addActionListener(new Manejador3());
        vBoton6.setFont(fuente2);
        vBoton6.setBackground(Color.gray);
        vBoton6.setForeground(Color.white);
        vBoton6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        vBoton6.setBounds(690, 0, 50, 30);
        vBoton1.addActionListener(new Manejador3());
        vBoton1.setBackground(Color.WHITE);
        vBoton2.addActionListener(new Manejador3());
        vBoton2.setBackground(Color.LIGHT_GRAY);
        vBoton3.setBackground(Color.GRAY);
        vBoton3.addActionListener(new Manejador3());
        vBoton5.setBackground(Color.LIGHT_GRAY);
        vBoton5.addActionListener(new Manejador3());
        vBoton4.setBackground(Color.white);
        vBoton4.addActionListener(new Manejador3());
        vBoton4.setBounds(40, 40, 100, 50);
        vBoton1.setBounds(270, 200, 200, 60);
        vBoton2.setBounds(270, 300, 200, 60);
        vBoton3.setBounds(270, 400, 200, 60);
        vBoton5.setBounds(270, 500, 200, 60);
        vEtiqueta1.setBounds(305, 50, 200, 60);
        vBoton1.setFont(fuente);
        vBoton2.setFont(fuente);
        vBoton5.setFont(fuente);
        vBoton3.setFont(fuente);
        vBoton4.setFont(fuente);
        vEtiqueta1.setFont(fuente);
        vBoton1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vBoton2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vBoton3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vBoton4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vBoton5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vFondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/facil.jpg")));
        vFondo.setSize(750, 750);
        Panel.add(vBoton1);
        Panel.add(vBoton2);
        Panel.add(vBoton3);
        Panel.add(vEtiqueta1);
        Panel.add(vBoton4);
        Panel.add(vBoton5);
        Panel.add(vBoton6);
        Panel.add(vFondo);
        add(Panel);
        setSize(750, 750);
        setLocationRelativeTo(null);
        setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    class Manejador3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(vBoton1)) {
                Facil_1 vInterfaz = new Facil_1();
                vInterfaz.setVisible(true);
                dispose();
            } else if (e.getSource().equals(vBoton2)) {
                Facil_2 vInterfaz = new Facil_2();
                vInterfaz.setVisible(true);
                dispose();
            } else if (e.getSource().equals(vBoton3)) {
                Facil_3 vInterfaz = new Facil_3();
                vInterfaz.setVisible(true);
                dispose();
            } else if (e.getSource().equals(vBoton4)) {
                Ventana1 vInterfaz = new Ventana1();
                vInterfaz.setVisible(true);
                dispose();

            } else if (e.getSource().equals(vBoton5)) {
                Facil_4 vInterfaz = new Facil_4();
                vInterfaz.setVisible(true);
                dispose();

            }else if (e.getSource().equals(vBoton6)){
            System.exit(0);
            
            }

        }
    }

}
