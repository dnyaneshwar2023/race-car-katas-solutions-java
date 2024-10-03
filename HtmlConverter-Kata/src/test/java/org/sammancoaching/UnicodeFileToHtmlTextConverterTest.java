package org.sammancoaching;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnicodeFileToHtmlTextConverterTest {

    @Test
    public void foo() throws IOException {
        UnicodeFileToHtmlTextConverter converter = new UnicodeFileToHtmlTextConverter("/Users/dnyaneshwarw/katas/HtmlConverter-Kata/Java/test_file.txt");

        String expected = "This is a test file.<br />" +
                "PAGE_BREAK<br />" +
                "The intention is to use it for a manual test of HtmlConverter.<br />" +
                "The following lines have some characters that need escaping<br />" +
                "PAGE_BREAK<br />" +
                "    &quot;This is quoted&quot; &amp; &lt;this has brackets&gt;<br />";


        assertEquals(expected, converter.convertToHtml());
    }

}
