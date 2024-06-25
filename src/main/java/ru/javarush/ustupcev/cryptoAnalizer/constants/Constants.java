package ru.javarush.ustupcev.cryptoAnalizer.constants;

public class Constants {

    private static final String RUS = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЬЫЪЭЮЯ";
    private static final String ENG = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUM = "0123456789";
    private static final String SPEC = "~!@#$%^&*()_+{}:\"<>?-=[];'.,/";

    public static final String ALPHABET = RUS + ENG + RUS.toLowerCase() + ENG.toLowerCase() + NUM + SPEC;



//        final String[] RUS = {"А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П",
//                "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ь", "Ы", "Ъ", "Э", "Ю", "Я",};
//        final String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
//                "S", "T", "U", "V", "W", "X", "Y", "Z"};
//        final String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",};
//        final String[] spec = {"~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "-", "=", "{", "}", ":",
//                "\"", "<", ">", "?", ",", ".", "/"};


}
