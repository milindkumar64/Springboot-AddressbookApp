package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookData;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class AddressBookService implements IAddressBookService{

    public List<AddressBookData> getAllAddressBookContacts(){
        List<AddressBookData> contactList = new ArrayList<>();
        contactList.add(new AddressBookData(1,new AddressBookDTO("Milind","Gupta","Rewa","Gurh",486001)));
        return contactList;
    }
    public AddressBookData getAddressBookDataById(int id){
        AddressBookData addressBookData = new AddressBookData(id, new AddressBookDTO("Milind","Gupta","Rewa","Gurh",486001));
        return addressBookData;
    }

    public AddressBookData createNewContacts(AddressBookDTO addressBookDTO){
       AddressBookData addressBookData = new AddressBookData(1,addressBookDTO);
       return addressBookData;
    }

    public AddressBookData updateContacts(AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = new AddressBookData(1,addressBookDTO);
        return addressBookData;
    }
    public void deleteContact(int id){
    }
}
