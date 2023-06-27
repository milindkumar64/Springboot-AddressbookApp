package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.dto.ResponseDTO;
import com.bridgelabz.addressbook.model.AddressBookData;
import com.bridgelabz.addressbook.service.AddressBookService;
import com.bridgelabz.addressbook.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<ResponseDTO> getAllAddressBookContacts(){
        List<AddressBookData> contactList = addressBookService.getAllAddressBookContacts();
        ResponseDTO responseDTO = new ResponseDTO("All contacts are : ",contactList);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getAddressBook(@PathVariable int id){
        AddressBookData addressBookData = addressBookService.getAddressBookDataById(id);
        ResponseDTO responseDTO = new ResponseDTO("get Contacts for id",addressBookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAddressBook(@RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = addressBookService.createNewContacts(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created Contact Sucessfully: ", addressBookData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddressBook(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = addressBookService.updateContacts(addressBookDTO);
        ResponseDTO responseDTO= new ResponseDTO("Contact updated Sucessfully : ", addressBookData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressBook(@PathVariable int id){
        addressBookService.deleteContact(id);
        ResponseDTO responseDTO  = new ResponseDTO("deleted Successfully contact of id : ",id);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
}
