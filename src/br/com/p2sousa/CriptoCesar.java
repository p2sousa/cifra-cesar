package br.com.p2sousa;

public class CriptoCesar {

    private String text;
    private Integer key;

    public CriptoCesar(String text, Integer key) {
        this.text = text;
        this.key = key;
    }

    public String getText() {
        return text;
    }

    public Integer getKey() {
        return key;
    }

    public String encrypt() {
        String textEncrypt = "";
        Integer keyEncrypt = getKey();
        char ascii;
        char x, y;

        while (keyEncrypt >= 26) {
            keyEncrypt = keyEncrypt - 26;
        }

        for (int i = 0; i < getText().length(); i++) {
            if (getText().charAt(i) >= 97 && getText().charAt(i) <= 122) {
                if ((int) (getText().charAt(i) + keyEncrypt) > 122) {
                    x = (char) (getText().charAt(i) + keyEncrypt);
                    y = (char) (x - 122);
                    ascii = (char) (96 + y);
                    textEncrypt = textEncrypt + ascii;
                } else {
                    ascii = (char) (getText().charAt(i) + keyEncrypt);
                    textEncrypt = textEncrypt + ascii;
                }
            } else {
                textEncrypt = textEncrypt + getText().charAt(i);
            }
        }

        return textEncrypt;
    }

    public String decrypt() {
        String textDecrypt = "";
        Integer keyEncrypt = getKey();
        char ascii;
        char x, y;

        while (keyEncrypt >= 26) {
            keyEncrypt = keyEncrypt - 26;
        }

        for (int i = 0; i < getText().length(); i++) {
            if (getText().charAt(i) >= 97 && getText().charAt(i) <= 122) {
                if ((int) (getText().charAt(i) - keyEncrypt) > 122) {
                    x = (char) (getText().charAt(i) - keyEncrypt);
                    y = (char) (x - 122);
                    ascii = (char) (96 + y);
                    textDecrypt = textDecrypt + ascii;
                } else {
                    ascii = (char) (getText().charAt(i) - keyEncrypt);
                    textDecrypt = textDecrypt + ascii;
                }
            } else {
                textDecrypt = textDecrypt + getText().charAt(i);
            }
        }

        return textDecrypt;
    }
}
