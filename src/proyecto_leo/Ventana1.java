package proyecto_leo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana1 extends JFrame {

    public JButton vBoton = new JButton("EASY");
    public JButton vBoton1 = new JButton("MEDIUM");
    public JButton vBoton2 = new JButton("HARD");
    public JButton vBoton6 = new JButton("EXIT");

    public Ventana1() {
        super("Menú");
        setResizable(false);
        JLabel vEtiqueta1 = new JLabel("Menu");
        JLabel vFondo = new JLabel();
        Panel Panel1 = new Panel();
        Panel1.setLayout(null);
        Font fuente = new Font("COURIER", Font.BOLD, 24);
        Font fuente2 = new Font("Courier", Font.BOLD, 15);
        vBoton6.addActionListener(new Manejador2());
        vBoton6.setFont(fuente2);
        vBoton6.setBackground(Color.gray);
        vBoton6.setForeground(Color.white);
        vBoton6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        vBoton6.setBounds(655, 0, 50, 30);
        vBoton.setBackground(Color.yellow);
        vBoton1.setBackground(Color.orange);
        vBoton2.setBackground(Color.pink);
        vBoton.setBounds(250, 200, 200, 60);
        vBoton1.setBounds(250, 300, 200, 60);
        vBoton2.setBounds(250, 400, 200, 60);
        vEtiqueta1.setBounds(310, 50, 200, 100);
        vEtiqueta1.setForeground(Color.white);
        vBoton.addActionListener(new Manejador2());
        vBoton1.addActionListener(new Manejador2());
        vBoton2.addActionListener(new Manejador2());
        vBoton.setFont(fuente);
        vBoton1.setFont(fuente);
        vBoton2.setFont(fuente);
        vEtiqueta1.setFont(fuente);
        vBoton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vBoton1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vBoton2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vFondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/ventana1.jpg")));
        vFondo.setSize(750, 750);
        Panel1.add(vBoton);
        Panel1.add(vBoton1);
        Panel1.add(vBoton2);
        Panel1.add(vEtiqueta1);
        Panel1.add(vBoton6);
        Panel1.add(vFondo);
        add(Panel1);
        setSize(700, 720);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel1.add(vBoton1);
        Panel1.add(vBoton2);
        Panel1.add(vEtiqueta1);
        Panel1.add(vFondo);
        add(Panel1);
    }

    class Manejador2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource().equals(vBoton)) {
                Nivel_Facil vInterfaz = new Nivel_Facil();
                vInterfaz.setVisible(true);
                dispose();
            } else if (e.getSource().equals(vBoton1)) {
                Nivel_Medio vInterfaz = new Nivel_Medio();
                vInterfaz.setVisible(true);
                dispose();

            } else if (e.getSource().equals(vBoton2)) {
                Nivel_Dificil vInterfaz = new Nivel_Dificil();
                vInterfaz.setVisible(true);
                dispose();

            } else if (e.getSource().equals(vBoton6)) {
                System.exit(0);

            }

        }

    }

}
