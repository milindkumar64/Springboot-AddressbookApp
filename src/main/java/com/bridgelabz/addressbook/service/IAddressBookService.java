package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    public List<AddressBookData> getAllAddressBookContacts();

    public AddressBookData getAddressBookDataById(int id);
    public AddressBookData createNewContacts(AddressBookDTO addressBookDTO);
    public AddressBookData updateContacts(int id, AddressBookDTO addressBookDTO);
    public void deleteContact(int id);

}
