package learning.vladdubceac.design_patterns.structural.proxy.example_1;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading file "+ fileName +" from disk");
    }

    @Override
    public void display() {
        System.out.println("Displaying "+fileName);
    }
}
