/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FINALPROJECT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;
/**
 *
 * @author nayra
 */
/*Codifica un programa Java que visualice en pantalla una calculadora
Dispondrá de las cuatro operaciones básicas y la posibilidad de transformar un número decimal a su correspondiente binario (tecla “BIN”).
Admite el uso de decimales.
El botón “CE” borra los datos actualmente en pantalla y comienza una nueva operación.
El botón “=” completa la operación matemática, salvo la transformación a binario, que se realiza directamente sin necesidad de pulsar “=”.
*/
public class Calculadora {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCalculadora miMarco = new MarcoCalculadora();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}
}
class MarcoCalculadora extends JFrame {

            private JButton pantalla;
            private boolean principio = true;
            private double resultado;
            private String ultimaOperacion;
            Color colorPurple=new Color(206, 160, 228);

            public MarcoCalculadora() {

                    setTitle("Calculadora");
                    setBounds(500, 300, 450, 370);

                    LaminaCalculadora1 milamina = new LaminaCalculadora1();
                    LaminaCalculadora2 milamina2 = new LaminaCalculadora2();
                    LaminaCalculadora3 milamina3 = new LaminaCalculadora3();

                    add(milamina, BorderLayout.NORTH);
                    add(milamina2, BorderLayout.CENTER);
                    add(milamina3, BorderLayout.EAST);
            }

    class LaminaCalculadora1 extends JPanel {

        public LaminaCalculadora1() {

            setLayout(new GridLayout(1, 1, 2, 2));

            setBackground(colorPurple);

            pantalla = new JButton("0");

            pantalla.setEnabled(false);

            add(pantalla);

            ultimaOperacion = "=";

        }
    }

    class LaminaCalculadora2 extends JPanel {

        public LaminaCalculadora2() {

            setBackground(colorPurple);
            setLayout(new GridLayout(4, 4, 2, 2));

            ActionListener insertar = new InsertaNumero();
            ActionListener orden = new AccionOrden();
            ActionListener conBinario = new Binario();

            ponerBoton("7", insertar);
            ponerBoton("8", insertar);
            ponerBoton("9", insertar);
            ponerBoton("+", orden);
            ponerBoton("4", insertar);
            ponerBoton("5", insertar);
            ponerBoton("6", insertar);
            ponerBoton("-", orden);
            ponerBoton("1", insertar);
            ponerBoton("2", insertar);
            ponerBoton("3", insertar);
            ponerBoton("X", orden);
            ponerBoton("BIN", conBinario);
            ponerBoton("0", insertar);
            ponerBoton(".", orden);
            ponerBoton("/", orden);
        }

        private void ponerBoton(String rotulo, ActionListener oyente) {

            JButton boton = new JButton(rotulo);

            boton.addActionListener(oyente);
            boton.setBorder(new RoundedBorder(20));
            boton.setBackground(colorPurple);
            boton.setForeground(Color.WHITE);

            add(boton);
        }
    }

    class LaminaCalculadora3 extends JPanel {

        public LaminaCalculadora3() {

            setLayout(new GridLayout(2, 1, 2, 2));
            setBackground(colorPurple);

            ActionListener borrado = new AccionBorrar();
            ActionListener orden = new AccionOrden();

            JButton borrar = new JButton("CE");
            JButton igual = new JButton("=");

            borrar.addActionListener(borrado);
            igual.addActionListener(orden);

            add(borrar);
            borrar.setBackground(colorPurple);
            borrar.setForeground(Color.WHITE);
            borrar.setBorder(getBorder());
            borrar.setBorder(new RoundedBorder(20));

            add(igual);
            igual.setBackground(colorPurple);
            igual.setForeground(Color.WHITE);
            igual.setBorder(new RoundedBorder(20));
        }
    }

    class InsertaNumero implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String entrada = e.getActionCommand();

            if (principio == true) {

                pantalla.setText("");

                principio = false;
            }

            pantalla.setText(pantalla.getText() + entrada);
        }
    }

    class AccionOrden implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String operacion = e.getActionCommand();

            calcular(Double.parseDouble(pantalla.getText()));

            ultimaOperacion = operacion;

            principio = true;
        }

    }

    class AccionBorrar implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            pantalla.setText("0");

            principio = true;
        }

    }

    class Binario implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int numeroCon = Integer.parseInt(pantalla.getText());

            String binario = Integer.toBinaryString(numeroCon);

            pantalla.setText(binario);

        }
    }


    public void calcular(double x) {

            if (ultimaOperacion.equals("+")) {

                resultado += x;
            }

            else if (ultimaOperacion.equals("-")) {

                resultado -= x;
            }

            else if (ultimaOperacion.equals("X")) {

                resultado *= x;
            }

            else if (ultimaOperacion.equals("=")) {

                resultado = x;
            }

            else if (ultimaOperacion.equals("/")) {

                if (ultimaOperacion.equals("/") && x == 0) {

                    String error = "NO ES POSIBLE DIVIDIR ENTRE 0";

                    Toolkit.getDefaultToolkit().beep();

                    JOptionPane.showMessageDialog(null, error);

                    pantalla.setText("0");
                }

                resultado /= x;
            }

            pantalla.setText("" + resultado);
    }

    class RoundedBorder implements Border {

        private int radius;

            RoundedBorder(int radius) {
                this.radius = radius;
            }

            public Insets getBorderInsets(Component c) {
                return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
            }

            public boolean isBorderOpaque() {
                 return false;
            }

            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                 g.drawRoundRect(x, y, width-1, height-1, radius, radius);
            }
    }
}