package ru.javarush.ustupcev.cryptoAnalizer.controllers;
import ru.javarush.ustupcev.cryptoAnalizer.commands.Action;
import ru.javarush.ustupcev.cryptoAnalizer.entity.Result;

public class MainController {

    public Result doAction(String actionName, String[] parametrs) {
        // action == encode
        // parametrs == [text.txe, encode.txt, 12]

        Action action = Actions.find(actionName);
        Result result = action.execute(parametrs);
        return result;
    }
}
