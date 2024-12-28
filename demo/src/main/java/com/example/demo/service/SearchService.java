package com.example.demo.service;

import com.example.demo.model.Document;
import com.example.demo.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SearchService {
    @Autowired
    private DocumentRepository documentRepository;

    public Document addDocument(Document document) {
        return documentRepository.save(document);
    }

    public List<Document> search(String keyword) {
        return documentRepository.search(keyword);
    }
}