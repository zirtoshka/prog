
public enum Actions {

    GETUP("залез на"),

    FALL("падает на"),

    MOVE("перемещается к"),
    JUMPDOWN("спрыгивает на");

    private String action;

    Actions(String action) {
        this.action = action;
    }

    public String getActions() {
        return action;
    }

    @Override
    public String toString() {
        return this.toString();
    }

}
