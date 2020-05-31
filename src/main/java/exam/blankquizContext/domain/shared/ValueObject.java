package exam.blankquizContext.domain.shared;

public interface ValueObject<T> {
    boolean sameValues(T other);
}
