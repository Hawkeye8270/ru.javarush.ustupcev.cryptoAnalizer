package ru.javarush.ustupcev.cryptoAnalizer;

import ru.javarush.ustupcev.cryptoAnalizer.entity.Result;

public class ConsoleRunner {

    public static void main(String[] args) {
        // encode text.txe encode.txt 12

        Application application = new Application();
        Result result = application.run(args);

        System.out.println(result);

    }
}
