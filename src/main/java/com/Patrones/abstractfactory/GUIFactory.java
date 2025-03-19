package com.Patrones.abstractfactory;

import com.Patrones.productos.button.Button;
import com.Patrones.productos.checkbox.CheckBox;

public interface GUIFactory {

    Button createButton();
    CheckBox createCheckbox();

}
