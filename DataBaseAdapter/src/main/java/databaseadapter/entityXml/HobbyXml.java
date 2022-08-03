package databaseadapter.entityXml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement(name = "hobby")
@XmlAccessorType(XmlAccessType.FIELD)
public class HobbyXml {
    @XmlElement(name = "title")
    String title;
    @XmlElement(name = "description")
    String description;

    public HobbyXml(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public HobbyXml() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HobbyXml hobby = (HobbyXml) o;
        return title.equals(hobby.title) && description.equals(hobby.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description);
    }

    @Override
    public String toString() {
        return "HobbyXml{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
