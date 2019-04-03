package main.java.com.lt.core.constructors;

/**
 * Created by Lhotse Team on 4/3/2019.
 */
public class Schools {
    private String name;
    private String standered;
    private int papulation;

    public Schools(){

    }


    public Schools(String name, String standered, int papulation){
        this.name = name;
        this.standered = standered;

        this.papulation = papulation;
    }

    public String getName() {
        return name;
    }

    public String getStandered() {
        return standered;
    }

    public int getPapulation() {
        return papulation;
    }
}
