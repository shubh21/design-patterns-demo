package org.example.creationalPattern.Prototype;

public abstract class Shape implements Cloneable {
    private String type;

    public Shape(String type) {
        System.out.println("Super class");
        this.type = type;
    }

    public void setType(String type) { this.type = type; }
    public String getType() { return type; }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Circle prototype = new Circle();
        Circle clone = (Circle) prototype.clone();
        System.out.println("Original: " + prototype); // Circle
        System.out.println("Clone: " + clone);       // Circle
    }
}