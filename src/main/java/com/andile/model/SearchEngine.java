package com.andile.model;

import java.util.List;

public interface SearchEngine {
     List<Document> findByType(Type documentType);
     List<Document> listAll();
}
