package com.andile;

import com.andile.model.Document;
import com.andile.model.MySearchEngine;
import com.andile.model.SearchEngine;
import com.andile.model.Type;
import org.junit.Test;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

import static org.junit.Assert.*;

@SpringBootConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MyDocumentsTest {

    private SearchEngine engine = new MySearchEngine();

    @Test
    public void test_findByType_method(){
        Type documentType = new Type();
        documentType.setName("WEB");
        documentType.setDesc("Web Link");
        documentType.setExtension(".url");

        List<Document> documents = engine.findByType(documentType);
        assertNotNull(documents);
        assertTrue(documents.size() == 1);
        assertEquals(documentType.getName(), documents.get(0).getType().getName());

        assertEquals(documentType.getName(), documents.get(0).getType().getDesc());

        assertEquals(documentType.getName(), documents.get(0).getType().getExtension());

    }
    @Test
    public void test_listAll_method(){
        List<Document> documents = engine.listAll();
        assertNotNull(documents);
        assertTrue(documents.size() == 4);
    }

}
