package learning.vladdubceac.design_patterns.behavioral.command.example_1;

public final class FileSystemReceiverUtil {
    private static final String WINDOWS_OS = "windows";
    private FileSystemReceiverUtil(){}

    public static FileSystemReceiver getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is : "+osName);
        if(osName.toLowerCase().contains(WINDOWS_OS)){
            return new WindowsFileSystemReceiver();
        }else{
            return new UnixFileSystemReceiver();
        }
    }
}
