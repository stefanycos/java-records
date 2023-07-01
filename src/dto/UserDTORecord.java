package dto;

public record UserDTORecord(String name, int age) {

    public static final boolean STATUS = true;

    public String getUpperName() {
        return name().toUpperCase();
    }
}
