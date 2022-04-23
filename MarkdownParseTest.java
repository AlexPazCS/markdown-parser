import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinks1() throws IOException{
        ArrayList<String> str = new ArrayList<String>();
        str.add("https://something.com");
        str.add("some-thing.html" );
        Path fileName = Path.of("C:/Users/redli/OneDrive/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(str, links);
    }

    @Test
    public void getLinks2() throws IOException{
        ArrayList<String> str = new ArrayList<String>();
        str.add("https://something.com");
        str.add("some-page.html" );
        Path fileName = Path.of("C:/Users/redli/OneDrive/Documents/GitHub/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(str, links);
    }

    @Test
    public void getLinks3() throws IOException{
        ArrayList<String> str = new ArrayList<String>();
        Path fileName = Path.of("C:/Users/redli/OneDrive/Documents/GitHub/markdown-parser/test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(str, links);
    }

    @Test
    public void getLinks4() throws IOException{
        ArrayList<String> str = new ArrayList<String>();
        Path fileName = Path.of("C:/Users/redli/Downloads/markdown-parser/test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(str, links);
    }

    @Test
    public void getLinks5() throws IOException{
        ArrayList<String> str = new ArrayList<String>();
        str.add("page.com");
        Path fileName = Path.of("C:/Users/redli/Downloads/markdown-parser/test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(str, links);
    }
    
    @Test
    public void getLinks6() throws IOException{
        ArrayList<String> str = new ArrayList<String>();
        Path fileName = Path.of("C:/Users/redli/Downloads/markdown-parser/test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(str, links);
    }

    @Test
    public void getLinks7() throws IOException{
        ArrayList<String> str = new ArrayList<String>();
        Path fileName = Path.of("C:/Users/redli/Downloads/markdown-parser/test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(str, links);
    }
    
    @Test
    public void getLinks8() throws IOException{
        ArrayList<String> str = new ArrayList<String>();
        Path fileName = Path.of("C:/Users/redli/Downloads/markdown-parser/test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(str, links);
    }
}