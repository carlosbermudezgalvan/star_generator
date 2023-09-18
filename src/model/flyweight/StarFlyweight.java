package model.flyweight;

import javax.swing.*;

public class StarFlyweight {
    private ImageIcon icon;

    public StarFlyweight(String iconPath) {
        this.icon = new ImageIcon(iconPath);
    }

    public ImageIcon getIcon() {
        return icon;
    }
}