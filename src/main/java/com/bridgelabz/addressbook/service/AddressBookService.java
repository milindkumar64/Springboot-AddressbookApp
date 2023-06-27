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

    private List<AddressBookData> contactList = new ArrayList<>();
    public List<AddressBookData> getAllAddressBookContacts(){
//        List<AddressBookData> contactList = new ArrayList<>();
//        contactList.add(new AddressBookData(1,new AddressBookDTO("Milind","Gupta","Rewa","Gurh",486001)));
        return contactList;
    }
    public AddressBookData getAddressBookDataById(int id){
        //AddressBookData addressBookData = new AddressBookData(id, new AddressBookDTO("Milind","Gupta","Rewa","Gurh",486001));
        return contactList.get(id-1);
    }

    public AddressBookData createNewContacts(AddressBookDTO addressBookDTO){
       AddressBookData addressBookData = new AddressBookData(contactList.size()+1,addressBookDTO);
       contactList.add(addressBookData);
       return addressBookData;
    }

    public AddressBookData updateContacts(int id ,AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = this.contactList.get(id-1);
        addressBookData.setFirstName(addressBookDTO.getFirstName());
        addressBookData.setLastName(addressBookDTO.getLastName());
        addressBookData.setCity(addressBookDTO.getCity());
        addressBookData.setAddress(addressBookDTO.getAddress());
        addressBookData.setPinCode(addressBookDTO.getPinCode());
        return addressBookData;
    }
    public void deleteContact(int id){
        contactList.remove(id-1);
    }
}
