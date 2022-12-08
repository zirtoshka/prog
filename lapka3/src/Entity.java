

public abstract class Entity implements IMovable, INamable {
    private final String name;
    private Place place;


    public Entity(String name, Place place) {
        this.name = name;
        this.place = place;

    }


    public String getName() {
        return name;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
        System.out.println(name + " " + place.getPhrase());
    }

    @Override
    public void moveTo(Place place, Actions action) {

        System.out.println(this.getName() + " " + action.getActions() + " " + place.getPhrase());
    }

    public void moveTo(Entity entity, Actions action) {

        System.out.println(this.getName() + " " + action.getActions() + " " + entity.getName());
    }

    @Override
    public String toString() {
        return "name: " + name + "place:" + place;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 10*place.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }

        Entity check = (Entity) o;
        return hashCode() == check.hashCode();
    }


}
