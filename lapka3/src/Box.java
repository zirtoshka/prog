

public class Box extends Entity {

    private final boolean flag;

    public Box(String name, Place place, boolean flag) {
        super(name, place);
        this.flag = flag; //тяжелый ли ящик

    }

    public void tryKeep(Human human) {
        if (flag) {
            System.out.println(getName() + " очень тяжелый");
            human.setStatusQuiet(Status.NOTBEABLE);
            System.out.println(human.getName() + " " + human.getStatus().getPhrase() + " " + getName());
            this.moveTo(Place.GROUND, Actions.FALL);
            human.moveTo(Place.GROUND, Actions.FALL);


        } else {
            System.out.println(getName() + " легкий");
            human.setStatusQuiet(Status.BEABLE);
            System.out.println(human.getName() + " " + human.getStatus().getPhrase() + " " + getName());
            this.moveTo(human, Actions.MOVE);
        }


    }

    @Override
    public String toString() {
        return "name: " + this.getName() + "place: " + this.getPlace() + "flag: " + flag;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }

        Box check = (Box) o;
        return hashCode() == check.hashCode();
    }


}
