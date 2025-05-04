package com.library.Books.controller;

import com.library.Books.entity.bookEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/book")
public class bookEntryController {
    public HashMap<Integer, bookEntry> bookEntries = new HashMap<>();
    @PostMapping("/CreateBook")
    public boolean CreateBook (@RequestBody bookEntry myEntry){
        bookEntries.put(myEntry.id, myEntry);
        return true;
    }
    @GetMapping("/GetBook")
    public List<bookEntry>getAll(){
        return new ArrayList<>(bookEntries.values());
    }
    @GetMapping("/GetBook/id/{myID}")
    public bookEntry bookbyid(@PathVariable int myID){
        return bookEntries.get(myID);
    }
    @PutMapping("/UpdateBook/id/{myID}")
        public boolean updateBook(@PathVariable int myID, @RequestBody bookEntry myEntry) {
        bookEntries.put(myEntry.id, myEntry);
        return true;
    }
    @DeleteMapping("/DeleteBook/id/{myID}")
    public boolean deleteBook(@PathVariable int myID){
        bookEntries.remove(myID);
        return true;
    }

}
