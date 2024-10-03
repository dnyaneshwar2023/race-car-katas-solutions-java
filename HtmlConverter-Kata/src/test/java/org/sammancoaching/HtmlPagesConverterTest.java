package org.sammancoaching;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HtmlPagesConverterTest {

    @Test
    public void getHtmlPage() throws IOException {
        HtmlPagesConverter converter = new HtmlPagesConverter("/Users/dnyaneshwarw/katas/HtmlConverter-Kata/Java/test_file.txt");

        String expectedPage = "The intention is to use it for a manual test of HtmlConverter.<br />" +
                "The following lines have some characters that need escaping<br />";

        String result = converter.getHtmlPage(1);

        assertEquals(expectedPage, result);
    }

}
