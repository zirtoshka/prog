import java.util.concurrent.Callable;
import java.util.function.Consumer;

public class Story {

    public static void main(String[] args) {
        Human julio = new Human("Жулио", Place.GROUND);
        Human spruts = new Human("Спрутс", Place.GROUND);

        Object a = new Object();

        Box box = new Box("ящик", Place.GROUND, true);


        julio.setStatus(Status.WAIT);
        julio.setStatus(Status.CHECKING);
        julio.said("?????");

        spruts.setStatus(Status.GROAN);
        spruts.moveTo(Place.FENCE, Actions.GETUP);
        spruts.moveTo(Place.GROUND, Actions.JUMPDOWN);

        julio.rise(box);
        julio.transferred(box, spruts);

        spruts.setStatus(Status.HANDSUP);
        spruts.setStatus(Status.TRY);





    }
}
