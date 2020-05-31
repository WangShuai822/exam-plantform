package exam.blankquizContext.domain.model.blankquiz;


import exam.blankquizContext.domain.shared.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public class BlankQuizId implements ValueObject<BlankQuizId> {
    private String id;

    @Override
    public boolean sameValues(BlankQuizId other) {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || !(obj instanceof BlankQuizId)) return false;
        BlankQuizId other = (BlankQuizId) obj;
        return Objects.equals(id, other);
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
