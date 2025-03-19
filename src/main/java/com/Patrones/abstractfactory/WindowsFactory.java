package com.Patrones.abstractfactory;

import com.Patrones.productos.button.Button;
import com.Patrones.productos.button.WinButton;
import com.Patrones.productos.checkbox.CheckBox;
import com.Patrones.productos.checkbox.WinCheckBox;

public class WindowsFactory implements GUIFactory {


    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WinCheckBox();
    }
}
