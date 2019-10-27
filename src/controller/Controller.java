package controller;

import util.Info;
import util.Input;
import util.Instruction;
import util.Validator;
import model.Model;
import service.Service;

public class Controller {

    private Input input = new Input();
    private Info info = new Info();
    private Service service = new Service();
    private Instruction instruction = new Instruction();
    private Validator validator = new Validator();


    public int getNumber(String param) {
        info.getCount(param);
        int number = input.getNumber();
        while (!validator.isPositiveNumber(number)) {
            instruction.getInstruction();
            number = new Input().getNumber();
        }
        return number;
    }

    public void result() {
        Model number = new Model(getNumber("number"), getNumber("power"));
        info.getResult(service.power(number.getNumber(), number.getPow()));
    }
}
