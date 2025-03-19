package com.Patrones.productos.button;

import com.Patrones.productos.checkbox.CheckBox;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Creaste un MacOSButton.");
    }
}
