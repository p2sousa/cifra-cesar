package br.com.p2sousa;

public class Main {

    public static void main(String[] args) {
        String text = "1a.a";
        Integer key = 3;
	    CriptoCesar criptoCesar = new CriptoCesar(text, key);

	    String textEncrypt = criptoCesar.encrypt();

        System.out.println("texto a ser encriptado: " + text);
        System.out.println("texto encriptado: " + textEncrypt);
    }
}
