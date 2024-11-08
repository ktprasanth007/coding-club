package main.java.org.lld.Step_36_CommandPattern.Solution;

import java.util.Stack;

public class RemoteControl {

    Stack<ICommand> acCommandHistory = new Stack<>();
    ICommand iCommand;

    public void setICommand(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    public void pressButton() {
        iCommand.execute();
        acCommandHistory.add(iCommand);
    }

    public void pressUndoButton() {
        if (!acCommandHistory.empty()) {
            ICommand lastCommand = acCommandHistory.pop();
            lastCommand.undo();
        }
    }
}
