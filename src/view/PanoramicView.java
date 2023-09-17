package view;

import javax.swing.*;
import java.awt.*;

public class PanoramicView extends JFrame {
    public PanoramicView() {
        initializeWindow();
        createMainPanel();
    }

    private void initializeWindow() {
        // Configurar la ventana principal
        setTitle("Panoramic View");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1024, 700);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createMainPanel() {
        // Crear el panel principal con disposición BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        getContentPane().add(mainPanel);
        createBlackPanel(mainPanel);
        createButtonPanel(mainPanel);
    }

    private void createBlackPanel(JPanel mainPanel) {
        // Panel para el área negra
        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.BLACK); // Cambia el fondo según tus necesidades
        mainPanel.add(blackPanel, BorderLayout.CENTER);
    }

    private void createButtonPanel(JPanel mainPanel) {
        // Panel para los botones en la parte inferior
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0)); // Establecer espacios horizontal y vertical a 0
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        JButton btnArriba = createButton("\u2191");
        JButton btnAbajo = createButton("\u2193");
        JButton btnIzquierda = createButton("\u2190");
        JButton btnDerecha = createButton("\u2192");

        buttonPanel.add(btnArriba);
        buttonPanel.add(btnAbajo);
        buttonPanel.add(btnIzquierda);
        buttonPanel.add(btnDerecha);
    }

    private JButton createButton(String text) {
        Font buttonFont = new Font("Arial", Font.PLAIN, 30); // Cambia "Arial" y 24 al tamaño deseado

        // Crear botones con fondo blanco y texto negro
        JButton button = new JButton(text);
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);

        button.setFont(buttonFont); // Establecer la fuente personalizada

        // Establecer el tamaño del botón
        button.setPreferredSize(new Dimension(70, 50)); // Cambia el tamaño según tus necesidades

        return button;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PanoramicView view = new PanoramicView();
            view.setVisible(true);
        });
    }
}