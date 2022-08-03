package databaseadapter.entityXml.dictionaryXml;

public enum CourseXml {

    FIRST("Первый"),
    SECOND("Второй"),
    THIRD("Третий"),
    FOURTH("Четвертый"),
    FIFTH("Пятый");

    private final String title;

    CourseXml(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
