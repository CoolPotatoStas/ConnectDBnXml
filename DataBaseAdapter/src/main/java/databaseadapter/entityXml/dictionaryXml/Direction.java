package databaseadapter.entityXml.dictionaryXml;

public enum Direction {

    ProgramEng("Программная инженерия", "Выпускает программистов"),
    CyberSec("Кибербезопасность", "Выпускает кибербезопасников"),
    MathSec("Математическое обеспечение", "Выпускает математиков");

    private String title;
    private String description;


    Direction(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
