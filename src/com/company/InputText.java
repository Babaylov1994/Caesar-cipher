package com.company;


public class InputText {
    char[] abc = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м',
            'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};

    void test(String str, int shift) {
        String toLowerCase = str.toLowerCase();
        StringBuilder resultText = new StringBuilder();
        char[] inChar = toLowerCase.toCharArray();
        for (int i = 0; i < inChar.length; i++) {
            for (int j = 0; j < abc.length - 1; j++) {
                if (inChar[i] == abc[j]) {
                    if ((shift + j) >= abc.length) {
                        int superShift = (shift + j) - (abc.length);
                        inChar[i] = abc[superShift];
                        break;
                    }
                    inChar[i] = abc[j + shift];
                    break;
                }
            }
            resultText.append(inChar[i]);
        }
        System.out.println(resultText);
    }
}
