package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

/*
 * Represents a dummy Storage for testing purposes
 */
public class StorageStub extends Storage {
    
    private AddressBook addressBook = null;

    @Override
    public AddressBook load() throws StorageOperationException {
        // TODO Auto-generated method stub
        return addressBook;
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        // TODO Auto-generated method stub
        this.addressBook = addressBook;
    }

    @Override
    public String getPath() {
        // TODO Auto-generated method stub
        return null;
    }

}
