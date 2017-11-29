package proyecto_leo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Nivel_Dificil extends JFrame {

    public JButton vBoton = new JButton("LEVEL 1");
    public JButton vBoton1 = new JButton("LEVEL 2");
    public JButton vBoton2 = new JButton("LEVEL 3");
    public JButton vBoton4 = new JButton("LEVEL 4");
    public JButton vBoton6 = new JButton("EXIT");
    public JButton vBoton3 = new JButton("Back");

    public Nivel_Dificil() {
        super("HARD");
        setResizable(false);
        JLabel vEtiqueta1 = new JLabel("HARD LEVEL");
        JLabel vFondo = new JLabel();
        Font fuente = new Font("COURIER", Font.BOLD, 24);
        Panel Panel1 = new Panel();
        Panel1.setLayout(null);
        Font fuente2 = new Font("Courier", Font.BOLD, 15);
        vBoton6.addActionListener(new Manejador5());
        vBoton6.setFont(fuente2);
        vBoton6.setBackground(Color.gray);
        vBoton6.setForeground(Color.white);
        vBoton6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        vBoton6.setBounds(690, 0, 50, 30);
        vBoton.addActionListener(new Manejador5());
        vBoton1.addActionListener(new Manejador5());
        vBoton2.addActionListener(new Manejador5());
        vBoton4.setBackground(Color.LIGHT_GRAY);
        vBoton4.addActionListener(new Manejador5());
        vBoton.setBackground(Color.WHITE);
        vBoton1.setBackground(Color.LIGHT_GRAY);
        vBoton2.setBackground(Color.GRAY);
        vBoton3.setBackground(Color.white);
        vBoton3.addActionListener(new Manejador5());
        vBoton3.setBounds(40, 40, 100, 50);
        vBoton.setBounds(270, 200, 200, 60);
        vBoton1.setBounds(270, 300, 200, 60);
        vBoton2.setBounds(270, 400, 200, 60);
        vBoton4.setBounds(270, 500, 200, 60);
        vEtiqueta1.setBounds(310, 50, 200, 60);
        vBoton.setFont(fuente);
        vBoton1.setFont(fuente);
        vBoton2.setFont(fuente);
        vBoton3.setFont(fuente);
        vBoton4.setFont(fuente);
        vEtiqueta1.setFont(fuente);
        vBoton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vBoton1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vBoton2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vBoton3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vBoton4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vFondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/dificil.jpg")));
        vFondo.setSize(750, 750);
        Panel1.add(vBoton);
        Panel1.add(vBoton1);
        Panel1.add(vBoton2);
        Panel1.add(vBoton4);
        Panel1.add(vEtiqueta1);
        Panel1.add(vBoton6);
        Panel1.add(vBoton3);
        Panel1.add(vFondo);

        add(Panel1);
        setSize(750, 750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Manejador5 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(vBoton)) {
                Dificil_1 vInterfaz = new Dificil_1();
                vInterfaz.setVisible(true);
                dispose();

            } else if (e.getSource().equals(vBoton1)) {
                Dificil_2 vInterfaz = new Dificil_2();
                vInterfaz.setVisible(true);
                dispose();

            } else if (e.getSource().equals(vBoton2)) {
                Dificil_3 vInterfaz = new Dificil_3();
                vInterfaz.setVisible(true);
                dispose();

            } else if (e.getSource().equals(vBoton3)) {
                Ventana1 vInterfaz = new Ventana1();
                vInterfaz.setVisible(true);
                dispose();

            } else if (e.getSource().equals(vBoton4)) {
                Dificil_4 vInterfaz = new Dificil_4();
                vInterfaz.setVisible(true);
                dispose();

            } else if (e.getSource().equals(vBoton6)) {
                System.exit(0);

            }

        }

    }
}
