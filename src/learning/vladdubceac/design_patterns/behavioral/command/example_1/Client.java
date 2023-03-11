package learning.vladdubceac.design_patterns.behavioral.command.example_1;

public class Client {

    public static void main(String[] args) {
        // creating the receiver
        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        // create the command with the associating receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);

        // creating invoker and associate it with the command
        FileInvoker file = new FileInvoker(openFileCommand);

        // perform action on invoker object
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fileSystemReceiver);
                file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystemReceiver);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
