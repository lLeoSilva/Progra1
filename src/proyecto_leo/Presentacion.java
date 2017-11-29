package proyecto_leo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Presentacion extends JFrame {
    
    public JButton vBoton = new JButton("PLAY");
    public JButton vBoton1 = new JButton("EXIT");
    
    public Timer t;
    public ActionListener ac;
    public int x = 0;
    JProgressBar vProg = new JProgressBar();
    JLabel vEti = new JLabel("Cargando...");
    
    public Presentacion() {
        super("Start");
        setResizable(false);
        JLabel vFondo = new JLabel();
        JLabel vEtiqueta = new JLabel("FLOW");
        Panel Panel1 = new Panel();
        Panel1.setLayout(null);
        Font fuente = new Font("COURIER", Font.BOLD, 28);
        Font fuente1 = new Font("Algerian", Font.BOLD, 35);
        
        
        vEtiqueta.setFont(fuente1);
        vEtiqueta.setForeground(Color.WHITE);
        vEtiqueta.setBounds(280, 90, 400, 80);
        vEti.setBounds(260, 410, 200, 35);
        vEti.setFont(fuente);
        vEti.setBackground(Color.black);
        vEti.setForeground(Color.WHITE);
        
        Font fuente2 = new Font("Courier", Font.BOLD, 15);
        vBoton1.addActionListener(new Manejador1());
        vBoton1.setFont(fuente2);
        vBoton1.setBackground(Color.gray);
        vBoton1.setForeground(Color.white);
        vBoton1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        vBoton1.setBounds(650, 0, 50, 30);
        
        vBoton.addActionListener(new Manejador1());
        vBoton.setFont(fuente);
        vBoton.setBackground(Color.gray);
        vBoton.setForeground(Color.white);
        vBoton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        vBoton.setBounds(260, 350, 150, 50);
        vBoton.setVisible(false);
        vFondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/principal2.jpg")));
        
        vProg.setBounds(260, 350, 150, 40);
        vProg.setMaximum(100);
        vProg.setFont(fuente);
        
        vFondo.setSize(750, 750);
        
        Panel1.add(vEti);
        Panel1.add(vBoton);
        Panel1.add(vBoton1);
        
        Panel1.add(vProg);
        Panel1.add(vEtiqueta);
        Panel1.add(vFondo);
        add(Panel1);
        setSize(700, 720);
        setLocationRelativeTo(null);
        
        ac = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                vProg.setStringPainted(true);
                x = x + 1;
                vProg.setValue(x);
                
                if (vProg.getValue() == 100) {
                    t.stop();
                    vBoton.setVisible(true);
                    vProg.setVisible(false);
                    vEti.setVisible(false);
                    
                }
            }
        };
        t = new Timer(50, ac);
        t.start();
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public class Manejador1 implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (e.getSource().equals(vBoton)) {
                
                Ventana1 vInterfaz = new Ventana1();
                vInterfaz.setVisible(true);
                dispose();
                
            } else if (e.getSource().equals(vBoton1)) {
                
                System.exit(0);
                
            }
            
        }
        
    }
    
}
