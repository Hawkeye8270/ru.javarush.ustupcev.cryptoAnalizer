package ru.javarush.ustupcev.cryptoAnalizer.controllers;

import ru.javarush.ustupcev.cryptoAnalizer.commands.Action;
import ru.javarush.ustupcev.cryptoAnalizer.commands.Decoder;
import ru.javarush.ustupcev.cryptoAnalizer.commands.Encoder;
import ru.javarush.ustupcev.cryptoAnalizer.exceptions.AppException;

public enum Actions {

    ENCODE(new Encoder()), DECODE(new Decoder());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String actionName) {
       try {
           Actions value = Actions.valueOf(actionName.toUpperCase());
           return value.action;
       } catch (IllegalArgumentException e) {
           throw new AppException("not found " + actionName, e);
       }


    }
}
