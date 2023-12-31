
public class Human implements Comparable<Human>{

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }
    
    
    public int compareTo(Human compared){
        if(this.getWage() == compared.getWage()){
            return 0;
        }
        return compared.getWage() - this.getWage();
    }
}
