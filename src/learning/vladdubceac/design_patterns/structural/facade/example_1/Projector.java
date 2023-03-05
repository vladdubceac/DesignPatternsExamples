package learning.vladdubceac.design_patterns.structural.facade.example_1;

public class Projector {
    String description;
    DvdPlayer dvdPlayer;

    public Projector(String description, DvdPlayer dvdPlayer) {
        this.description = description;
        this.dvdPlayer = dvdPlayer;
    }

    public void on(){
        System.out.println(description+" on");
    }

    public void off(){
        System.out.println(description+" off");
    }

    public void wideScreenMode(){
        System.out.println(description+" in widescreen mode (16x9 aspect ratio)");
    }

    public void tvMode(){
        System.out.println(description+" in TV mode (4x3 aspect ratio)");
    }

    @Override
    public String toString() {
        return description;
    }
}
