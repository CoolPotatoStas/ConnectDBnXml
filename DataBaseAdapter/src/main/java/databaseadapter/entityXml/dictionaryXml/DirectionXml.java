package databaseadapter.entityXml.dictionaryXml;

public enum DirectionXml {

    ProgramEng("Программная инженерия", "Выпускает программистов"),
    CyberSec("Кибербезопасность", "Выпускает кибербезопасников"),
    MathSec("Математическое обеспечение", "Выпускает математиков");

    private String title;
    private String description;


    DirectionXml(String title, String description) {
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
