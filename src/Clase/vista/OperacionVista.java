package Clase.vista;

import Clase.impl.Operacionesimpl;
import Clase.interfaz.Operaciones;
import javax.swing.*;

public class OperacionVista extends JFrame {
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JButton btnSumar;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JTextPane lblResultado;
    private JLabel Texto1;
    private JLabel Texto2;
    private JButton limpiar;

    public OperacionVista() {
        // Configuración de la ventana
        setTitle("Calculadora");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Instanciar la clase que contiene las operaciones
        Operaciones op = new Operacionesimpl();

        // Etiquetas
        Texto1 = new JLabel("Ingrese el primer valor");
        Texto1.setBounds(30, 20, 160, 30);
        add(Texto1);

        Texto2 = new JLabel("Ingrese el segundo valor");
        Texto2.setBounds(30, 60, 160, 30);
        add(Texto2);

        // Campos de texto para ingresar valores
        txtNumero1 = new JTextField();
        txtNumero1.setBounds(200, 20, 150, 30);
        add(txtNumero1);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(200, 60, 150, 30);
        add(txtNumero2);

        // Botones
        btnSumar = new JButton("Sumar");
        btnSumar.setBounds(30, 110, 100, 30);
        add(btnSumar);

        btnRestar = new JButton("Restar");
        btnRestar.setBounds(140, 110, 100, 30);
        add(btnRestar);

        btnMultiplicar = new JButton("Multiplicar");
        btnMultiplicar.setBounds(250, 110, 120, 30);
        add(btnMultiplicar);

        btnDividir = new JButton("Dividir");
        btnDividir.setBounds(30, 160, 100, 30);
        add(btnDividir);

        limpiar = new JButton("Limpiar");
        limpiar.setBounds(140, 160, 100, 30);
        add(limpiar);

        // Resultado
        lblResultado = new JTextPane();
        lblResultado.setEditable(false);  // para no perminitir que se edite
        lblResultado.setBounds(30, 210, 320, 40);
        add(lblResultado);

        // Action listeners para los botones
        btnSumar.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(txtNumero1.getText());
                double num2 = Double.parseDouble(txtNumero2.getText());
                double resultado = op.sumar(num1, num2);
                lblResultado.setText("Resultado: " + resultado);
            } catch (NumberFormatException ex) {
                lblResultado.setText("Error: Entrada inválida");
            }
        });

        btnRestar.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(txtNumero1.getText());
                double num2 = Double.parseDouble(txtNumero2.getText());
                double resultado = op.restar(num1, num2);
                lblResultado.setText("Resultado: " + resultado);
            } catch (NumberFormatException ex) {
                lblResultado.setText("Error: Entrada inválida");
            }
        });

        btnMultiplicar.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(txtNumero1.getText());
                double num2 = Double.parseDouble(txtNumero2.getText());
                double resultado = op.multiplicar(num1, num2);
                lblResultado.setText("Resultado: " + resultado);
            } catch (NumberFormatException ex) {
                lblResultado.setText("Error: Entrada inválida");
            }
        });

        btnDividir.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(txtNumero1.getText());
                double num2 = Double.parseDouble(txtNumero2.getText());
                if (num2 != 0) {
                    double resultado = op.dividir(num1, num2);
                    lblResultado.setText("Resultado: " + resultado);
                } else {
                    lblResultado.setText("Error: División por cero");
                }
            } catch (NumberFormatException ex) {
                lblResultado.setText("Error: Entrada inválida");
            } catch (ArithmeticException ex) {
                lblResultado.setText("Error: División por cero");
            }
        });

        limpiar.addActionListener(e -> {
            txtNumero1.setText("");
            txtNumero2.setText("");
            lblResultado.setText("");
        });
    }

    public static void main(String[] args) {
        // Crear la ventana y mostrarla
        OperacionVista ventana = new OperacionVista();
        ventana.setVisible(true);
    }
}


