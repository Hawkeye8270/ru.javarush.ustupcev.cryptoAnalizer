package ru.javarush.ustupcev.cryptoAnalizer;

import exceptions.AppException;
import ru.javarush.ustupcev.cryptoAnalizer.controllers.MainController;
import ru.javarush.ustupcev.cryptoAnalizer.entity.Result;

import java.util.Arrays;

public class Application {

    private MainController mainController;

    public Application() {
        mainController = new MainController();
    }

    public Result run(String[] args) {
        if (args.length > 0) {
            String action = args[0];
            String[] parametrs = Arrays.copyOfRange(args, 1, args.length);
        Result result = mainController.doAction(action, parametrs); }

        throw new AppException();
    }
}

