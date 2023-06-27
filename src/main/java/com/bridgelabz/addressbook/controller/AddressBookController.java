package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @GetMapping("/get/{id}")
    public ResponseEntity<String> getAddressBook(@PathVariable int id){
        return new ResponseEntity<>("Get Call success for id "+id, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<String> createAddressBook(@RequestBody AddressBookDTO addressBookDTO){
        return new ResponseEntity<>("Created new contact : "+addressBookDTO,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<String> updateAddressBook(@RequestBody AddressBookDTO addressBookDTO){
        return new ResponseEntity<String>("Updated contact: "+addressBookDTO,HttpStatus.OK);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteAddressBook(@PathVariable int id){
        return new ResponseEntity<String>("deleted contact : "+id,HttpStatus.OK);
    }
}
