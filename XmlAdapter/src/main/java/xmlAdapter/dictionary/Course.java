package xmlAdapter.dictionary;

public enum Course {

    FIRST("Первый"),
    SECOND("Второй"),
    THIRD("Третий"),
    FOURTH("Четвертый"),
    FIFTH("Пятый");

    private final String title;

    Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
