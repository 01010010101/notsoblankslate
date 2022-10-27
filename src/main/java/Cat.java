public class Cat {

    private String name;
    private CatColour colour;

    public Cat() {
        colour = CatColour.values()[(int) Math.floor(CatColour.values().length * Math.random())];
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public CatColour getColour() {
        return colour;
    }

}
