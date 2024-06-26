package ru.javarush.ustupcev.cryptoAnalizer.commands;

import ru.javarush.ustupcev.cryptoAnalizer.entity.Result;
import ru.javarush.ustupcev.cryptoAnalizer.entity.ResultCode;

public class Encoder implements Action {
    @Override
    public Result execute(String[] parametrs) {
        // TODO Something do

        return new Result("Encode allRight", ResultCode.Ok);
    }
}
