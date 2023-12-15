package utils;

import interfaces.Command;

public class Invoker {
    Command[] commands;

    public Invoker () {
        this.commands = new Command[2];
        commands[0] = null;
        commands[1] = null;
    }

    public void setCommand(int slot, Command command) {
        this.commands[slot] = command;
    }

    public void pressButton(int slot) {
        commands[slot].execute();
    }
}
