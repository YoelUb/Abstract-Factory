package com.Patrones;

import com.Patrones.abstractfactory.GUIFactory;
import com.Patrones.abstractfactory.WindowsFactory;
import com.Patrones.abstractfactory.MacFactory;
import com.Patrones.productos.button.Button;
import com.Patrones.productos.checkbox.CheckBox;

public class Main {
    public static void main(String[] args) {
        String os = "Windows"; // Simulación de detección del sistema operativo
        GUIFactory factory;

        if (os.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else if (os.equalsIgnoreCase("Mac")) {
            factory = new MacFactory();
        } else {
            throw new RuntimeException("Error! Unknown operating system.");
        }


        // Crear productos a partir de la fábrica
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckbox();

        // Mostrar productos en pantalla
        button.paint();
        checkBox.paint();
    }
}