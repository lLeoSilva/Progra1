package proyecto_leo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Nivel_Medio extends JFrame {

    public JButton vBoton = new JButton("LEVEL 1");
    public JButton vBoton1 = new JButton("LEVEL 2");
    public JButton vBoton2 = new JButton("LEVEL 3");
    public JButton vBoton5 = new JButton("LEVEL 4");
    public JButton vBoton4 = new JButton("Back");
    public JButton vBoton6 = new JButton("EXIT");

    public Nivel_Medio() {
        super("MEDIUM");
        setResizable(false);
        JLabel vEtiqueta1 = new JLabel("MEDIUM LEVEL");
        JLabel vFondo = new JLabel();
        Font fuente = new Font("COURIER", Font.BOLD, 24);
        Panel Panel1 = new Panel();
        Panel1.setLayout(null);

        vBoton.setBackground(Color.WHITE);
        vBoton1.setBackground(Color.LIGHT_GRAY);
        vBoton2.setBackground(Color.GRAY);
        vBoton4.setBackground(Color.WHITE);
        vBoton5.setBackground(Color.LIGHT_GRAY);
        vBoton5.addActionListener(new Manejador4());
        vBoton.addActionListener(new Manejador4());
        vBoton1.addActionListener(new Manejador4());
        vBoton2.addActionListener(new Manejador4());
        vBoton4.addActionListener(new Manejador4());
        vBoton4.setBounds(40, 40, 100, 70);
        vBoton.setBounds(270, 200, 200, 60);
        vBoton1.setBounds(270, 300, 200, 60);
        vBoton2.setBounds(270, 400, 200, 60);
        vBoton5.setBounds(270, 500, 200, 60);
        Font fuente2 = new Font("Courier", Font.BOLD, 15);
        vBoton6.addActionListener(new Manejador4());
        vBoton6.setFont(fuente2);
        vBoton6.setBackground(Color.gray);
        vBoton6.setForeground(Color.white);
        vBoton6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        vBoton6.setBounds(650, 0, 50, 30);
        vEtiqueta1.setBounds(290, 50, 200, 60);
        vBoton.setFont(fuente);
        vBoton1.setFont(fuente);
        vBoton2.setFont(fuente);
        vBoton4.setFont(fuente);
        vBoton5.setFont(fuente);
        vEtiqueta1.setFont(fuente);
        vBoton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vBoton1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vBoton2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vBoton4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vBoton5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vFondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/medio.jpg")));
        vFondo.setSize(750, 750);
        Panel1.add(vBoton);
        Panel1.add(vBoton1);
        Panel1.add(vBoton2);
        Panel1.add(vEtiqueta1);
        Panel1.add(vBoton4);
        Panel1.add(vBoton5);
        Panel1.add(vBoton6);
        Panel1.add(vFondo);

        add(Panel1);
        setSize(700, 720);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    class Manejador4 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(vBoton)) {
                Medio_1 vInterfaz = new Medio_1();
                vInterfaz.setVisible(true);
                dispose();

            } else if (e.getSource().equals(vBoton1)) {
                Medio_2 vInterfaz = new Medio_2();
                vInterfaz.setVisible(true);
                dispose();

            } else if (e.getSource().equals(vBoton2)) {
                Medio_3 vInterfaz = new Medio_3();
                vInterfaz.setVisible(true);
                dispose();
            } else if (e.getSource().equals(vBoton4)) {
                Ventana1 vInterfaz = new Ventana1();
                vInterfaz.setVisible(true);
                dispose();

            } else if (e.getSource().equals(vBoton5)) {
                Medio_4 vInterfaz = new Medio_4();
                vInterfaz.setVisible(true);
                dispose();

            } else if (e.getSource().equals(vBoton6)) {

                System.exit(0);

            }

        }

    }

}
