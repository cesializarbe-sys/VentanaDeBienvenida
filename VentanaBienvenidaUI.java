package vallegrtande.edu.pe.Visual;

import vallegrt
ande.edu.pe.Model.Usuario;

import javax.swing.*;
import java.awt.*;

public class VentanaBienvenidaUI {

    private JFrame ventana;
    private JPanel panel;
    private JButton botonSaludo;
    private Usuario usuario;

    public VentanaBienvenidaUI() {
        usuario = new Usuario();

        // Crear ventana
        ventana = new JFrame("Bienvenid@");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 150);
        ventana.setLocationRelativeTo(null); // Centrar en pantalla

        // Crear panel y botón
        panel = new JPanel();
        panel.setBackground(new Color(230, 240, 255)); // Color de fondo personalizado

        botonSaludo = new JButton("Mostrar saludo");
        botonSaludo.setBackground(new Color(70, 130, 180)); // Azul
        botonSaludo.setForeground(Color.WHITE);

        // Acción al presionar el botón
        botonSaludo.addActionListener(e -> {
            String nombre = JOptionPane.showInputDialog(ventana, "¿Cuál es tu nombre?");
            usuario.setNombre(nombre);

            if (usuario.nombreValido()) {
                JOptionPane.showMessageDialog(ventana, "¡Hola, " + usuario.getNombre() + "! ¡Haz realizado un buen trabajo!");
            } else {
                JOptionPane.showMessageDialog(ventana, "Nombre inválido. Intenta de nuevo.");
            }
        });

        // Agregar botón al panel y panel a la ventana
        panel.add(botonSaludo);
        ventana.add(panel);
    }

    public void mostrar() {
        ventana.setVisible(true);
    }
}