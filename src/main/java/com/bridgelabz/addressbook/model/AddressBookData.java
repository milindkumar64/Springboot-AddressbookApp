package com.bridgelabz.addressbook.model;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookData {

    int id;
    String firstName;
    String lastName;
    String city;
    String state;
    String address;
    int pinCode;

    public AddressBookData(int id, AddressBookDTO addressBookDTO){
        this.id = id;
        this.firstName=addressBookDTO.getFirstName();
        this.lastName=addressBookDTO.getLastName();
        this.city=addressBookDTO.getCity();
        this.address=addressBookDTO.getAddress();
        this.pinCode=addressBookDTO.getPinCode();
    }
}
