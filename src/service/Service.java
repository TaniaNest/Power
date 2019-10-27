package service;

import model.Model;

import java.util.ArrayList;
import java.util.List;

public class Service {


    public int power(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        if (pow == 1) {
            return num;
        }
        if (pow == 2) {
            return num * num;
        }
        if (pow % 2 == 0) {
            return power(power(num, pow / 2), 2);
        } else {
            return num * (power(num, pow - 1));
        }
    }

}
