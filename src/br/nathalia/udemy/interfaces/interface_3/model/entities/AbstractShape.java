package br.nathalia.udemy.interfaces.interface_3.model.entities;

import br.nathalia.udemy.interfaces.interface_3.model.enums.Color;

public abstract class AbstractShape implements Shape {
    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
