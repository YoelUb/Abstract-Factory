package com.Patrones.abstractfactory;


import com.Patrones.productos.button.Button;
import com.Patrones.productos.button.MacButton;
import com.Patrones.productos.checkbox.CheckBox;
import com.Patrones.productos.checkbox.MacCheckBox;


import java.awt.*;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckBox();
    }
}
