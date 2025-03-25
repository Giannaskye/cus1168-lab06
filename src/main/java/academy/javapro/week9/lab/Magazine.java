package academy.javapro.week9.lab;

/**
 * Represents a magazine in the library system.
 */
public class Magazine implements LibraryItem {
    private final String title;
    private final int issueNumber;
    private final String publicationDate;

    /**
     * Creates a new magazine with the specified details.
     * 
     * @param title           the title of the magazine
     * @param issueNumber     the issue number
     * @param publicationDate the publication date as a string
     */
    public Magazine(String title, int issueNumber, String publicationDate) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        if (issueNumber <= 0) {
            throw new IllegalArgumentException("Issue number must be positive.");
        }
        if (publicationDate == null || publicationDate.trim().isEmpty()) {
            throw new IllegalArgumentException("Publication date cannot be null or empty.");
        }

        this.title = title;
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    /**
     * Gets the issue number of the magazine.
     * 
     * @return the issue number
     */
    public final int getIssueNumber() {
        return issueNumber;

    }

    /**
     * Gets the publication date of the magazine.
     * 
     * @return the publication date
     */
    public final String getPublicationDate() {
        return publicationDate;

    }

    @Override
    public final String getTitle() {
        return title;
    }

    @Override
    public final String getItemType() {
        return "Magazine";
    }

    @Override
    public final String getUniqueIdentifier() {
        return title + "-" + issueNumber;
    }

    @Override
    public final String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                ", issueNumber=" + issueNumber +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Magazine magazine = (Magazine) o;
        return issueNumber == magazine.issueNumber && title.equals(magazine.title);
    }

    @Override
    public final int hashCode() {
        int result = title.hashCode();

        result = (result * 31) + issueNumber;

        return result;
    }
}
