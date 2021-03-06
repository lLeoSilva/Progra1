package proyecto_leo;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class Facil_2 extends JFrame {

    public JButton[][] vMatrix5x5 = new JButton[5][5];
    public JButton vBoton = new JButton("Back");
    int vColor = 0;
    int vResul[][] = new int[5][5];//Para ir rellenando una matriz para si luego compararla con la matriz buena
    public JLabel vResult1 = new JLabel("0");

    public Facil_2() {
        super("LEVEL 2");

        setResizable(false);
        JPanel vPanel = new JPanel();
        vPanel.setLayout(new GridLayout(5, 5));
        JPanel vPanel1 = new JPanel();
        JPanel vPanel2 = new JPanel();
        vPanel1.setLayout(null);
        vPanel2.setLayout(null);
        JLabel vFondo = new JLabel();
        JLabel vResult = new JLabel("/ 100%");
        Font fuente = new Font("Courier", Font.BOLD, 20);
        Font fuent1 = new Font("Courier", Font.BOLD, 30);
        vBoton.setBounds(25, 25, 100, 50);
        vBoton.setBackground(Color.black);
        vBoton.setForeground(Color.WHITE);
        vBoton.setFont(fuente);
        vResult.setBounds(400, 25, 100, 50);
        vResult.setBackground(Color.black);
        vResult.setForeground(Color.WHITE);
        vResult.setFont(fuent1);
        vResult1.setBounds(270, 25, 100, 50);
        vResult1.setBackground(Color.black);
        vResult1.setForeground(Color.WHITE);
        vResult1.setFont(fuent1);
        vBoton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        vBoton.addActionListener(new Manejador7());
        vFondo.setSize(710, 710);
        vFondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/nebulosa1.jpg")));

        vResul[0][0] = 0;
        vResul[4][1] = 0;
        vResul[1][2] = 0;
        vResul[2][2] = 0;
        vResul[0][4] = 0;
        vResul[4][4] = 0;
        for (int i = 0; i < vMatrix5x5.length; i++) {

            for (int j = 0; j < vMatrix5x5.length; j++) {

                vMatrix5x5[i][j] = new JButton();

                if (!(vMatrix5x5[i][j] == vMatrix5x5[0][0]) && !(vMatrix5x5[i][j] == vMatrix5x5[4][1])//rojo//
                        && !(vMatrix5x5[i][j] == vMatrix5x5[1][2]) && !(vMatrix5x5[i][j] == vMatrix5x5[2][2])//verde//
                        && !(vMatrix5x5[i][j] == vMatrix5x5[0][4]) && !(vMatrix5x5[i][j] == vMatrix5x5[4][4])) {//azul// 

                    vMatrix5x5[i][j].addActionListener(new ManejadorColores2());
                    vMatrix5x5[i][j].addMouseListener(new ManejadorMouse2());
                    vMatrix5x5[i][j].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg")));

                } else if (vMatrix5x5[i][j] == vMatrix5x5[0][0]) {
                    vMatrix5x5[0][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix5x5[i][j].addActionListener(new Manejador7());
                } else if (vMatrix5x5[i][j] == vMatrix5x5[4][1]) {
                    vMatrix5x5[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix5x5[i][j].addActionListener(new Manejador7());
                } else if (vMatrix5x5[i][j] == vMatrix5x5[1][2]) {
                    vMatrix5x5[1][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix5x5[i][j].addActionListener(new Manejador7());
                } else if (vMatrix5x5[i][j] == vMatrix5x5[2][2]) {
                    vMatrix5x5[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix5x5[i][j].addActionListener(new Manejador7());
                } else if (vMatrix5x5[i][j] == vMatrix5x5[0][4]) {
                    vMatrix5x5[0][4].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix5x5[i][j].addActionListener(new Manejador7());
                } else if (vMatrix5x5[i][j] == vMatrix5x5[4][4]) {
                    vMatrix5x5[4][4].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix5x5[i][j].addActionListener(new Manejador7());
                }

                vPanel.add(vMatrix5x5[i][j]);
            }

        }
        vPanel.setBounds(100, 100, 500, 500);
        vPanel1.add(vPanel);
        vPanel1.add(vPanel2);
        vPanel1.add(vBoton);
        vPanel1.add(vResult);
        vPanel1.add(vResult1);
        vPanel1.add(vFondo);

        add(vPanel1);
        setSize(700, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public int[][] Matriz_Buena() {
        int vMatriz[][] = new int[5][5];
        //Color azul correcto
        vMatriz[0][4] = 0;
        vMatriz[1][4] = 2;
        vMatriz[2][4] = 2;
        vMatriz[3][4] = 2;
        vMatriz[4][4] = 2;
        vMatriz[4][4] = 0;

        //COlor verde correcto
        vMatriz[1][2] = 0;
        vMatriz[0][2] = 1;
        vMatriz[0][3] = 1;
        vMatriz[1][3] = 1;
        vMatriz[2][3] = 1;
        vMatriz[3][3] = 1;
        vMatriz[3][2] = 1;
        vMatriz[4][2] = 1;
        vMatriz[4][3] = 1;
        vMatriz[2][2] = 0;
        //COlor Rojo correcto
        vMatriz[0][0] = 0;
        vMatriz[0][1] = 3;
        vMatriz[1][0] = 3;
        vMatriz[1][1] = 3;
        vMatriz[2][0] = 3;
        vMatriz[2][1] = 3;
        vMatriz[3][0] = 3;
        vMatriz[3][1] = 3;
        vMatriz[4][0] = 3;
        vMatriz[4][1] = 0;

        return vMatriz;
    }

    class Manejador7 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource().equals(vBoton)) {
                Nivel_Facil vInterfaz = new Nivel_Facil();
                vInterfaz.setVisible(true);
                dispose();
            }
            if (e.getSource().equals(vMatrix5x5[1][2]) || e.getSource().equals(vMatrix5x5[2][2])) {//Verde//

                if (vColor == 0) {
                    vColor = 1;
                    vMatrix5x5[0][4].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix5x5[4][4].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix5x5[0][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix5x5[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix5x5[1][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Verde.jpg")));
                    vMatrix5x5[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Verde.jpg")));

//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);
                } else if (vColor != 0) {
                    vMatrix5x5[0][4].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix5x5[4][4].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix5x5[0][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix5x5[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix5x5[1][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix5x5[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vColor = 0;
//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);
                }
            }
            if (e.getSource().equals(vMatrix5x5[0][4]) || e.getSource().equals(vMatrix5x5[4][4])) {//Azul//
                if (vColor == 0) {
                    vMatrix5x5[0][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix5x5[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix5x5[1][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix5x5[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix5x5[0][4].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Azul1.jpg")));
                    vMatrix5x5[4][4].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Azul1.jpg")));

                    vColor = 2;
//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);
                } else if (vColor != 0) {
                    vColor = 0;
                    vMatrix5x5[0][4].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix5x5[4][4].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix5x5[0][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix5x5[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix5x5[1][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix5x5[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);

                }
            }
            if (e.getSource().equals(vMatrix5x5[0][0]) || e.getSource().equals(vMatrix5x5[4][1])) {//Rojo//

                if (vColor == 0) {
                    vMatrix5x5[1][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix5x5[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix5x5[0][4].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix5x5[4][4].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix5x5[0][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Rojo.jpg")));
                    vMatrix5x5[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Seleccion_Rojo.jpg")));
                    vColor = 3;
//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);
                } else if (vColor != 0) {
                    vMatrix5x5[0][4].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix5x5[4][4].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesAzul1.jpg")));
                    vMatrix5x5[0][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix5x5[4][1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesRojo1.jpg")));
                    vMatrix5x5[1][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vMatrix5x5[2][2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/DiamantesVerde1.jpg")));
                    vColor = 0;
//                    JOptionPane.showMessageDialog(null, "Numero es:" + vColor);
                }
            }

        }
    }

    class ManejadorMouse2 implements MouseListener {

        public void mouseClicked(MouseEvent evento) {

            for (int i = 0; i < vMatrix5x5.length; i++) {
                for (int j = 0; j < vMatrix5x5.length; j++) {

                    if (evento.getButton() == MouseEvent.BUTTON3) {
                        if (evento.getSource().equals(vMatrix5x5[i][j])) {
                            int vTotal1 = 0;
//                            System.out.println("Derecho");
                            vMatrix5x5[i][j].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg")));
                            vResul[i][j] = 0;
                            for (int k = 0; k < vResul.length; k++) {
                                for (int l = 0; l < vResul.length; l++) {

                                    if (vResul[k][l] == 0) {
                                        vTotal1 = vTotal1 + 1;

                                    } else {
                                    }

                                }

                            }

                            int vTotalCantidad = 19 - (vTotal1 - 6);
//                            JOptionPane.showMessageDialog(null, vTotalCantidad);
                            double vResultado = vTotalCantidad * 5.3;
                            DecimalFormat df = new DecimalFormat("#.00");
                            if (vResultado > 98.7) {

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

                        if (evento.getSource().equals(vMatrix5x5[i][j])) {
                            if (evento.getSource().equals(vMatrix5x5[i][j])) {
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
                                int vTotalCantidad = 19 - (vTotal1 - 6);
                                double vResultado = vTotalCantidad * 5.3;
                                DecimalFormat df = new DecimalFormat("#.00");

                                if (vResultado > 98.7) {

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
                                        Facil_3 vInterfaz = new Facil_3();
                                        vInterfaz.setVisible(true);
                                        dispose();
                                    } else if (ax == JOptionPane.NO_OPTION) {
//                                        JOptionPane.showMessageDialog(null, "Has seleccionado NO.");
                                        Nivel_Facil vInterfaz = new Nivel_Facil();
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

    class ManejadorColores2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < vMatrix5x5.length; i++) {
                for (int j = 0; j < vMatrix5x5.length; j++) {

                    if (e.getSource().equals(vMatrix5x5[i][j])) {

                        if (vColor == 1) {

                            vMatrix5x5[i][j].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Verde.jpg")));
                            vResul[i][j] = 1;
                        } else if (vColor == 2) {

                            vMatrix5x5[i][j].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Azul.jpg")));
                            vResul[i][j] = 2;
                        } else if (vColor == 3) {

                            vMatrix5x5[i][j].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Rojos.jpg")));
                            vResul[i][j] = 3;
                        }
                    }

                }

            }
        }

    }

}
