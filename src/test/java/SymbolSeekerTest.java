import org.junit.Assert;
import org.junit.Test;

public class SymbolSeekerTest {
    private static final String EXAMPLE = "The Tao gave birth to machine language. "
            + "Machine language gave birth to the assembler. "
            + "The assembler gave birth to the compiler. Now there are ten thousand "
            + "languages. Each language has its purpose, however humble. "
            + "Each language expresses the Yin and Yang of software. "
            + "Each language has its place within the Tao. "
            + "But do not program in COBOL if you can avoid it. "
            + "Geoffrey James, \"The Tao of Programming\"";
    private static final String TEST_TEXT = "C makes it easy for you to shoot yourself in the foot. "
            + "C++ makes that harder, but when you do, it blows away your whole leg. "
            + "(с) Bjarne Stroustrup\n";
    private final SymbolSeeker symbolSeeker = new SymbolSeeker();

    @Test
    public void shouldReturnUniqueSymbol() {
        Assert.assertEquals('s', symbolSeeker.findUniqueSymbol(EXAMPLE));
        Assert.assertEquals('e', symbolSeeker.findUniqueSymbol(TEST_TEXT));
    }
}