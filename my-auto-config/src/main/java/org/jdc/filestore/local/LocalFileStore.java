package org.jdc.filestore.local;

import org.jdc.filestore.FileStore;

public class LocalFileStore implements FileStore {
    @Override
    public void printFileStoreInfo() {
        System.out.println("Local File Store.");
    }
}
