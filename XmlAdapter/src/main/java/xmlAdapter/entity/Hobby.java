package xmlAdapter.entity;

import java.util.Objects;

public class Hobby {
    String title;
    String description;

    public Hobby(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Hobby() {
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
        Hobby hobby = (Hobby) o;
        return title.equals(hobby.title) && description.equals(hobby.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description);
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
