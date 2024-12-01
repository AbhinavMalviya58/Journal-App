package com.example.Spring.Boot.controller;

import com.example.Spring.Boot.entity.journalEntry;
import com.example.Spring.Boot.service.journalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class journalEntryController {
//        private Map<Long, journalEntry> longjournalEntryMap = new HashMap<>();

        @Autowired
        private journalEntryService journalEntryService;

        @GetMapping
        private List<journalEntry> getAll(){
//            return new ArrayList<>(longjournalEntryMap.values());
                return journalEntryService.getAll();
        }
        @PostMapping
        public boolean createEntry(@RequestBody journalEntry myJournalEntry){
                myJournalEntry.setDate(LocalDateTime.now());
                journalEntryService.saveEntry(myJournalEntry);
//                longjournalEntryMap.put(myJournalEntry.getId(), myJournalEntry);
                return true;
        }
        @GetMapping("id/{myID}")
        private journalEntry getJournalEntryByID (@PathVariable Long myID){
//                return longjournalEntryMap.get(myID);
                return null;
        }
        @DeleteMapping("id/{myID}")
        private  journalEntry deleteJournalEntryID(@PathVariable Long myID){
//                return longjournalEntryMap.remove(myID);
                return null;
        }

        @PutMapping("id/{id}")
        private  journalEntry putJournalEntryID(@PathVariable Long id, @RequestBody journalEntry myJournalEntry){
//                return longjournalEntryMap.put(id, myJournalEntry);
                return null;
        }
}