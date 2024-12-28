package com.example.demo.controller;

import com.example.demo.model.Document;
import com.example.demo.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SearchController {
    @Autowired
    private SearchService searchService;

    @PostMapping("/documents")
    public Document addDocument(@RequestBody Document document) {
        return searchService.addDocument(document);
    }

    @GetMapping("/search")
    public List<Document> search(@RequestParam String keyword) {
        return searchService.search(keyword);
    }
}