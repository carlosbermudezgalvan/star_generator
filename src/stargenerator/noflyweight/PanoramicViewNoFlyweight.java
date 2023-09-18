package stargenerator.noflyweight;

import javax.swing.*;
import java.awt.*;

public class PanoramicViewNoFlyweight extends JFrame {
    private StarPanelNoFlyweight starPanel; // Usaremos un nuevo panel personalizado

    public PanoramicViewNoFlyweight() {
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
        createStarPanel(mainPanel); // Usamos el nuevo StarPanel en lugar del blackPanel
        createButtonPanel(mainPanel);
    }

    private void createStarPanel(JPanel mainPanel) {
        // Panel para mostrar las estrellas
        starPanel = new StarPanelNoFlyweight();
        starPanel.setBackground(Color.black);
        starPanel.setLayout(null);
        mainPanel.add(starPanel, BorderLayout.CENTER);
    }

    private void createButtonPanel(JPanel mainPanel) {
        // Panel para los botones en la parte inferior
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0)); // Establecer espacios horizontal y vertical a 0
        buttonPanel.setBackground(Color.black);
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
        // Crear botones con fondo blanco y texto negro
        JButton button = new JButton(text);
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);

        Font buttonFont = new Font("Arial", Font.PLAIN, 28); // Cambia "Arial" y 24 al tamaño deseado
        button.setFont(buttonFont); // Establecer la fuente personalizada
        button.setFocusPainted(false); // Desactivar el efecto de enfoque
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE)); // Establecer un borde personalizado (rojo)

        // Establecer el tamaño del botón
        button.setPreferredSize(new Dimension(65, 40)); // Cambia el tamaño según tus necesidades

        return button;
    }

    public StarPanelNoFlyweight getStarPanel() {
        return starPanel; // Método para obtener el panel de estrellas desde otras partes del código
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PanoramicViewNoFlyweight view = new PanoramicViewNoFlyweight();
            view.setVisible(true);
        });
    }
}