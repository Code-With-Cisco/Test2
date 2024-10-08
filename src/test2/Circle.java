/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;

/**
 *
 * @author mtsguest
 */
public class Circle extends TwoDShape {
	private double radius;
	public double getRadius() {
		return radius;
	}
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2.0);
	}
	public String toString() {
		return "Circle of radius " + radius + " and color " + color;
	}
}
