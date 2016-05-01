package oop2.lab.converter;

public class ConverterApp {
	public static void main(String[] args) {
		UnitConverter uc = new UnitConverter();
		ConverterUI converter = new ConverterUI(uc);
	}
}
