import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.io.IOException;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void getLinkstest() throws java.io.IOException{
        String content = Files.readString(Path.of("test-file.md"));
        ArrayList<String> explinks = new ArrayList<String>();
        explinks.add("https://something.com");
        explinks.add("some-thing.html");
        assertEquals(explinks, MarkdownParse.getLinks(content));
    }
    @Test
    public void getLinkstest_ex1() throws java.io.IOException{
        String content = Files.readString(Path.of("example.md"));
        ArrayList<String> explinks = new ArrayList<String>();

        assertEquals(explinks, MarkdownParse.getLinks(content));
    }
    @Test
    public void getLinkstest_ex2() throws java.io.IOException{
        String content = Files.readString(Path.of("example2.md"));
        ArrayList<String> explinks = new ArrayList<String>();
        explinks.add("hello.com");
        explinks.add("school.edu");
        assertEquals(explinks, MarkdownParse.getLinks(content));
    }
}