package ru.javarush.ustupcev.cryptoAnalizer;

import ru.javarush.ustupcev.cryptoAnalizer.entity.Result;

public class ConsoleRunner {

    public static void main(String[] args) {


     Application application = new Application();

     Result result = application.run(args);

        System.out.println(result);

    }
}
