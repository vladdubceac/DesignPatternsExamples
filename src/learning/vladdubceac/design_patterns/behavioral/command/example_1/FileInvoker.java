package learning.vladdubceac.design_patterns.behavioral.command.example_1;

public class FileInvoker {
    Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute(){
        command.execute();
    }
}
