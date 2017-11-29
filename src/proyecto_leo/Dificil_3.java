package proyecto_leo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Dificil_3 extends JFrame {

    JButton[][] vMatrix7x7 = new JButton[7][7];
    public JButton vBoton = new JButton("Back");
    int vColor = 0;
    int vResul[][] = new int[7][7];//Para ir rellenando una matriz para si luego compararla con la matriz buena
    public JLabel vResult1 = new JLabel("0");

    public Dificil_3() {
        super("LEVEL 3");
        setResizable(false);
        JPanel vPanel = new JPanel();
        vPanel.setLayout(new GridLayout(7, 7));
        JPanel vPanel1 = new JPanel();
        JPanel vPanel2 = new JPanel();
        vPanel1.setLayout(null);
        vPanel2.setLayout(null);
        JLabel vFondo = new JLabel();
        JLabel vResult = new JLabel("/ 100%");
        Font fuente = new Font("Courier", Font.BOLD, 20);
        Font fuent1 = new Font("Courier", Font.BOLD, 30);
        vBoton.setBounds(10, 25, 100, 50);
        vBoton.setBackground(Color.black);
        vBoton.setForeground(Color.WHITE);
        vBoton.setFont(fuente);
        vResult.setBounds(10, 250, 100, 50);
        vResult.setBackground(Color.black);
        vResult.setForeground(Color.WHITE);
        vResult.setFont(fuent1);
        vResult1.setBounds(10, 180, 100, 50);
        vResult1.setBackground(Color.black);
        vResult1.setForeground(Color.WHITE);
        vResult1.setFont(fuent1);
        vBoton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        vBoton.addActionListener(new Manejador9());
        vFondo.setSize(910, 910);
        vFondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/nebulosa.jpg")));

        vResul[2][2] = 0;
        vResul[5][3] = 0;
        vResul[0][2] = 0;
        vResul[6][0] = 0;
        vResul[0][1] = 0;
        vResul[4][1] = 0;
        vResul[5][0] = 0;
        vResul[5][5] = 0;
        vResul[1][5] = 0;
        vResul[4][5] = 0;

        for (int i = 0; i < vMatrix7x7.length; i++) {

            for (int j = 0; j < vMatrix7x7.length; j++) {

                vMatrix7x7[i][j] = new JButton();

                if (!(vMatrix7x7[i][j] == vMatrix7x7[2][2]) && !(vMatrix7x7[i][j] == vMatrix7x7[5][3])//rojo//
                        && !(vMatrix7x7[i][j] == vMatrix7x7[0][1]) && !(vMatrix7x7[i][j] == vMatrix7x7[4][1])//verde//
                        && !(vMatrix7x7[i][j] == vMatrix7x7[0][2]) && !(vMatrix7x7[i][j] == vMatrix7x7[6][0])//azul//
                        && !(vMatrix7x7[i][j] == vMatrix7x7[5][0]) && !(vMatrix7x7[i][j] == vMatrix7x7[5][5])//amarillo//
                        && !(vMatrix7x7[i][j] == vMatrix7x7[1][5]) && !(vMatrix7x7[i][j] == vMatrix7x7[4][5])) {//naranja//

                    vMatrix7x7[i][j].addActionListener(new ManejadorColores6());
                    vMatrix7x7[i][j].addMouseListener(new ManejadorMouse6());
                    vMatrix7x7[i][j].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg")));

                } else if (vMatrix7x7[i][j] == vMatrix7x7[2][2]) {
                    vMatrix7x7[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[i][j].addActionListener(new Manejador9());

                } else if (vMatrix7x7[i][j] == vMatrix7x7[5][3]) {
                    vMatrix7x7[5][3].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[i][j].addActionListener(new Manejador9());

                } else if (vMatrix7x7[i][j] == vMatrix7x7[0][1]) {
                    vMatrix7x7[0][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[i][j].addActionListener(new Manejador9());
                } else if (vMatrix7x7[i][j] == vMatrix7x7[4][1]) {
                    vMatrix7x7[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[i][j].addActionListener(new Manejador9());
                } else if (vMatrix7x7[i][j] == vMatrix7x7[0][2]) {
                    vMatrix7x7[0][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[i][j].addActionListener(new Manejador9());
                } else if (vMatrix7x7[i][j] == vMatrix7x7[6][0]) {
                    vMatrix7x7[6][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[i][j].addActionListener(new Manejador9());
                } else if (vMatrix7x7[i][j] == vMatrix7x7[5][0]) {
                    vMatrix7x7[5][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[i][j].addActionListener(new Manejador9());
                } else if (vMatrix7x7[i][j] == vMatrix7x7[5][5]) {
                    vMatrix7x7[5][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[i][j].addActionListener(new Manejador9());
                } else if (vMatrix7x7[i][j] == vMatrix7x7[1][5]) {
                    vMatrix7x7[1][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vMatrix7x7[i][j].addActionListener(new Manejador9());
                } else if (vMatrix7x7[i][j] == vMatrix7x7[4][5]) {
                    vMatrix7x7[i][j].addActionListener(new Manejador9());
                    vMatrix7x7[4][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));

                }

                vPanel.add(vMatrix7x7[i][j]);

            }

        }
        vPanel.setBounds(120, 40, 700, 700);
        vPanel1.add(vPanel);
        vPanel1.add(vPanel2);
        vPanel1.add(vBoton);
        vPanel1.add(vResult);
        vPanel1.add(vResult1);
        vPanel1.add(vFondo);

        add(vPanel1);
        setSize(850, 800);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public int[][] Matriz_Buena() {
        int vMatriz[][] = new int[7][7];
        //Color azul correcto
        vMatriz[0][2] = 0;
        vMatriz[0][3] = 2;
        vMatriz[0][4] = 2;
        vMatriz[0][5] = 2;
        vMatriz[0][6] = 2;
        vMatriz[1][6] = 2;
        vMatriz[2][6] = 2;
        vMatriz[3][6] = 2;
        vMatriz[4][6] = 2;
        vMatriz[5][6] = 2;
        vMatriz[6][6] = 2;
        vMatriz[6][5] = 2;
        vMatriz[6][4] = 2;
        vMatriz[6][3] = 2;
        vMatriz[6][2] = 2;
        vMatriz[6][1] = 2;
        vMatriz[6][0] = 0;
        //COlor verde correcto
        vMatriz[0][1] = 0;
        vMatriz[0][0] = 1;
        vMatriz[1][0] = 1;
        vMatriz[2][0] = 1;
        vMatriz[3][0] = 1;
        vMatriz[4][0] = 1;
        vMatriz[4][1] = 0;

        //COlor Rojo correcto
        vMatriz[2][2] = 0;
        vMatriz[2][3] = 3;
        vMatriz[3][3] = 3;
        vMatriz[4][3] = 3;
        vMatriz[5][3] = 0;

        //COlor Amarillo correcto
        vMatriz[5][0] = 0;
        vMatriz[5][1] = 4;
        vMatriz[5][2] = 4;
        vMatriz[4][2] = 4;
        vMatriz[3][2] = 4;
        vMatriz[3][1] = 4;
        vMatriz[2][1] = 4;
        vMatriz[1][1] = 4;
        vMatriz[1][2] = 4;
        vMatriz[1][3] = 4;
        vMatriz[1][4] = 4;
        vMatriz[2][4] = 4;
        vMatriz[3][4] = 4;
        vMatriz[4][4] = 4;
        vMatriz[5][4] = 4;
        vMatriz[5][5] = 0;

        //COlor Naranja correcto
        vMatriz[1][5] = 0;
        vMatriz[2][5] = 5;
        vMatriz[3][5] = 5;
        vMatriz[4][5] = 0;

        return vMatriz;
    }

    class Manejador9 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(vBoton)) {
                Nivel_Dificil vInterfaz = new Nivel_Dificil();
                vInterfaz.setVisible(true);
                dispose();
            }
            if (e.getSource().equals(vMatrix7x7[0][1]) || e.getSource().equals(vMatrix7x7[4][1])) {//Verde//

                if (vColor == 0) {
                    vColor = 1;
                    vMatrix7x7[0][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[6][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[5][3].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[5][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[5][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[1][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vMatrix7x7[4][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vMatrix7x7[0][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Verde.jpg")));
                    vMatrix7x7[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Verde.jpg")));

//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);
                } else if (vColor != 0) {
                    vMatrix7x7[0][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[6][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[5][3].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[0][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[5][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[5][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[1][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vMatrix7x7[4][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vColor = 0;
//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);
                }
            }
            if (e.getSource().equals(vMatrix7x7[0][2]) || e.getSource().equals(vMatrix7x7[6][0])) {//Azul//
                if (vColor == 0) {
                    vMatrix7x7[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[5][3].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[0][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[5][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[5][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[1][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vMatrix7x7[4][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vMatrix7x7[0][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Azul1.jpg")));
                    vMatrix7x7[6][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Azul1.jpg")));

                    vColor = 2;
//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);
                } else if (vColor != 0) {
                    vColor = 0;
                    vMatrix7x7[0][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[6][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[5][3].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[0][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[5][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[5][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[1][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vMatrix7x7[4][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);

                }
            }
            if (e.getSource().equals(vMatrix7x7[2][2]) || e.getSource().equals(vMatrix7x7[5][3])) {//Rojo//

                if (vColor == 0) {
                    vMatrix7x7[0][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[6][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[0][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[5][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[5][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[1][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vMatrix7x7[4][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vMatrix7x7[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Rojo.jpg")));
                    vMatrix7x7[5][3].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Rojo.jpg")));
                    vColor = 3;
//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);
                } else if (vColor != 0) {
                    vMatrix7x7[0][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[6][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[5][3].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[0][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[5][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[5][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[1][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vMatrix7x7[4][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vColor = 0;
//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);
                }
            }
            if (e.getSource().equals(vMatrix7x7[5][0]) || e.getSource().equals(vMatrix7x7[5][5])) {//Amarillo//

                if (vColor == 0) {
                    vMatrix7x7[0][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[6][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[5][3].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[0][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[1][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vMatrix7x7[4][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vMatrix7x7[5][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Amarillo.jpg")));
                    vMatrix7x7[5][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Amarillo.jpg")));

                    vColor = 4;
//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);
                } else if (vColor != 0) {
                    vMatrix7x7[0][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[6][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[5][3].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[0][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[5][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[5][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[1][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vMatrix7x7[4][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vColor = 0;
//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);
                }

            }
            if (e.getSource().equals(vMatrix7x7[1][5]) || e.getSource().equals(vMatrix7x7[4][5])) {//Naranja//
                if (vColor == 0) {
                    vMatrix7x7[0][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[6][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[5][3].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[0][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[5][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[5][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[1][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Naranja.jpg")));
                    vMatrix7x7[4][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Naranja.jpg")));

                    vColor = 5;
//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);
                } else if (vColor != 0) {
                    vMatrix7x7[0][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[6][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix7x7[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[5][3].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix7x7[0][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix7x7[5][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[5][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAmarillo1.jpg")));
                    vMatrix7x7[1][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vMatrix7x7[4][5].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesNaranja1.jpg")));
                    vColor = 0;
//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);
                }

            }

        }

    }

    class ManejadorMouse6 implements MouseListener {

        public void mouseClicked(MouseEvent evento) {

            for (int i = 0; i < vMatrix7x7.length; i++) {
                for (int j = 0; j < vMatrix7x7.length; j++) {

                    if (evento.getButton() == MouseEvent.BUTTON3) {
                        if (evento.getSource().equals(vMatrix7x7[i][j])) {
                            int vTotal1 = 0;
                            vMatrix7x7[i][j].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg")));
                            vResul[i][j] = 0;
                            for (int k = 0; k < vResul.length; k++) {
                                for (int l = 0; l < vResul.length; l++) {

                                    if (vResul[k][l] == 0) {
                                        vTotal1 = vTotal1 + 1;

                                    } else {
                                    }

                                }

                            }

                            int vTotalCantidad = 39 - (vTotal1 - 10);
//                            JOptionPane.showMessageDialog(null, vTotalCantidad);
                            double vResultado = vTotalCantidad * 2.5;
                            DecimalFormat df = new DecimalFormat("#.0");
                            if (vResultado > 97) {

                                vResult1.setText("100%");
                            } else if (vResultado == 0) {
                                vResult1.setText("0");

                            } else {
                                vResult1.setText(String.valueOf(df.format(vResultado)));
                            }
                            vTotal1 = 0;

                        }
                    }
                    if (evento.getButton() == MouseEvent.BUTTON1) {

                        if (evento.getSource().equals(vMatrix7x7[i][j])) {
                            if (evento.getSource().equals(vMatrix7x7[i][j])) {
//                                JOptionPane.showMessageDialog(null, "Selecciono:" + i + j);
                                int vTotal1 = 0;
                                boolean vBandera = false;

                                int[][] Correcto = Matriz_Buena();

                                for (int k = 0; k < vResul.length; k++) {
                                    for (int l = 0; l < vResul.length; l++) {

                                        if (vResul[k][l] != Correcto[k][l]) {
                                            vBandera = true;

                                        }

                                        if (vResul[k][l] == 0) {
                                            vTotal1 = vTotal1 + 1;

                                        }

                                    }

                                }
                                int vTotalCantidad = 39 - (vTotal1 - 10);
                                double vResultado = vTotalCantidad * 2.5;
                                DecimalFormat df = new DecimalFormat("#.0");

                                if (vResultado > 97) {

                                    vResult1.setText("100%");
                                } else if (vResultado == 0) {
                                    vResult1.setText("0");

                                } else {
                                    vResult1.setText(String.valueOf(df.format(vResultado)));
                                }

                                if (vBandera == false) {
                                    JOptionPane.showMessageDialog(null, "    !! LEVEL COMPLETED !!");

                                    int ax = JOptionPane.showConfirmDialog(null, "You want to continue?");
                                    if (ax == JOptionPane.YES_OPTION) {
//                                        JOptionPane.showMessageDialog(null, "Has seleccionado SI.");
                                        Dificil_4 vInterfaz = new Dificil_4();
                                        vInterfaz.setVisible(true);
                                        dispose();
                                    } else if (ax == JOptionPane.NO_OPTION) {
//                                        JOptionPane.showMessageDialog(null, "Has seleccionado NO.");
                                        Nivel_Dificil vInterfaz = new Nivel_Dificil();
                                        vInterfaz.setVisible(true);
                                        dispose();
                                    } else if (ax == JOptionPane.CANCEL_OPTION) {

                                    }
                                }

                            }
                        }

                    }

                }

            }

        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    class ManejadorColores6 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < vMatrix7x7.length; i++) {
                for (int j = 0; j < vMatrix7x7.length; j++) {

                    if (e.getSource().equals(vMatrix7x7[i][j])) {

                        switch (vColor) {
                            case 1:
                                vResul[i][j] = 1;
                                vMatrix7x7[i][j].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Verde.jpg")));
                                break;
                            case 2:
                                vResul[i][j] = 2;
                                vMatrix7x7[i][j].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Azul.jpg")));
                                break;
                            case 3:
                                vResul[i][j] = 3;
                                vMatrix7x7[i][j].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Rojos.jpg")));
                                break;
                            case 4:
                                vResul[i][j] = 4;
                                vMatrix7x7[i][j].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Amarillo.jpg")));
                                break;
                            case 5:
                                vResul[i][j] = 5;
                                vMatrix7x7[i][j].setIcon(new ImageIcon(getClass().getResource("/Imagenes/naranja.jpg")));
                                break;
                            default:
                                break;
                        }
                    }

                }

            }
        }
    }
}
