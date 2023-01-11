package pro.sky.java.course1.lesson2;

import java.util.Objects;

public class Author {
    private String firstNameAuthor;
    private String familyNameAuthor;

    public Author(String firstNameAuthor, String familyNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.familyNameAuthor = familyNameAuthor;
    }

    public String getFirstNameAuthor() {
        return this.firstNameAuthor;
    }

    public String getFamilyNameAuthor() {
        return this.familyNameAuthor;
    }

    public void setFirstNameAuthor(String firstNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
    }

    public void setFamilyNameAuthor(String familyNameAuthor) {
        this.familyNameAuthor = familyNameAuthor;
    }

    @Override
    public String toString() {
        return getFamilyNameAuthor() + " " + getFirstNameAuthor();
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return Objects.equals(firstNameAuthor, author.firstNameAuthor) && Objects.equals(familyNameAuthor, author.familyNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameAuthor, familyNameAuthor);
    }
}
