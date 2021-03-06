package com.jasofalcon.designpatterns.behavioral.command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void applyCommand() {
        command.execute();
    }
}
