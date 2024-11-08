package main.java.org.lld.Step_36_CommandPattern.Solution;

public interface ICommand {
    void execute();

    // To support undo command
    void undo();
}
