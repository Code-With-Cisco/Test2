/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;

/**
 *
 * @author mtsguest
 */
public class Square extends Rectangle{
	public Square(String color, double length) {
		super(color, length, length);
	}
	@Override
	public String toString() {
		return "Square of length " + width + " and color " + color;
	}
}
