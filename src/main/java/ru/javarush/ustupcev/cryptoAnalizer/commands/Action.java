package ru.javarush.ustupcev.cryptoAnalizer.commands;

import ru.javarush.ustupcev.cryptoAnalizer.entity.Result;

public interface Action {

    Result execute(String[] parametrs);
}
