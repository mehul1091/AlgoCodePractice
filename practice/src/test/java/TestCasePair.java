import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class TestCasePair {
    int[] a;
    int[] b;
    int result;
}
