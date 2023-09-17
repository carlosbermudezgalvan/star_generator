package model.flyweight;

import javax.swing.*;
import java.awt.*;

public class StarFlyweight {
    private JLabel label;  // Características intrínsecas compartidas
    private ImageIcon icon;

    public StarFlyweight(String iconPath) {
        // Crear instancias compartidas de JLabel e ImageIcon con el path del icono
        this.label = new JLabel();

        // COnfiguracion para prueba
        this.label.setText("E");
        this.label.setForeground(Color.white);

        this.icon = new ImageIcon(iconPath);
        // Configurar el JLabel con el ImageIcon
        this.label.setIcon(this.icon);
    }

    public JLabel getLabel() {
        return label;
    }
}
