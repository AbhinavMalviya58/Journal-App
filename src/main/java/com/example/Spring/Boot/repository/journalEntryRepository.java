package com.example.Spring.Boot.repository;

import com.example.Spring.Boot.entity.journalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

public interface journalEntryRepository extends MongoRepository<journalEntry, String> {


}
