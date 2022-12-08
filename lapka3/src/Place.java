public enum Place {
    GROUND("земля"),
    FENCE("забор");

    private String place;

    Place(String place) {
        this.place = place;
    }


    public String getPhrase() {
        return place;
    }
}
