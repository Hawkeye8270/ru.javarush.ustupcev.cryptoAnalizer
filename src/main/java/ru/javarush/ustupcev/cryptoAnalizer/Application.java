package ru.javarush.ustupcev.cryptoAnalizer;

import ru.javarush.ustupcev.cryptoAnalizer.controllers.MainController;
import ru.javarush.ustupcev.cryptoAnalizer.entity.Result;
import ru.javarush.ustupcev.cryptoAnalizer.exceptions.AppException;

import java.util.Arrays;

public class Application {

    private final MainController mainController;

    public Application() {
        mainController = new MainController();
    }

    public Result run(String[] args) {
        // encode text.txe encode.txt 12
        if (args.length > 0) {
            String action = args[0];        // action => encode
            String[] parametrs = Arrays.copyOfRange(args, 1, args.length);  // parameters  => text.txe encode.txt 12
        return mainController.doAction(action, parametrs); }

        else {
            throw new AppException("no args");
        }
    }
}

