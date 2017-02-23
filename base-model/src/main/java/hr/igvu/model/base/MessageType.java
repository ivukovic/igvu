package hr.igvu.model.base;

public enum MessageType {

    SUCCESS(1), ERROR(2), NO_DATA(3);

    private int type;

    MessageType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
