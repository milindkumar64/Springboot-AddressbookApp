package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.dto.ResponseDTO;
import com.bridgelabz.addressbook.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getAddressBook(@PathVariable int id){
        AddressBookData addressBookData = new AddressBookData(id,new AddressBookDTO("Milind","Gupta","Rewa","Gurh",486001));
        ResponseDTO responseDTO = new ResponseDTO("get Contacts for id",addressBookData);
        return  new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAddressBook(@RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = new AddressBookData(1,addressBookDTO);
        ResponseDTO responseDTO= new ResponseDTO("Created Contact Sucessfully: ", addressBookData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddressBook(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1,addressBookDTO);
        ResponseDTO responseDTO= new ResponseDTO("Contact updated Sucessfully : ", addressBookData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressBook(@PathVariable int id){
        ResponseDTO responseDTO  = new ResponseDTO("deleted Successfuly contact of id : ",id);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
}
