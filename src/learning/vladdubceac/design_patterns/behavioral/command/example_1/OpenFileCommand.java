package learning.vladdubceac.design_patterns.behavioral.command.example_1;

public class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        // save previous state, in case undo called someState = ... ;
        this.fileSystem.openFile();
    }
}
