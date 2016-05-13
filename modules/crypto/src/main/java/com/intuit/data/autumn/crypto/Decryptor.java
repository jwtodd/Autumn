package com.intuit.data.autumn.crypto;

import com.google.inject.Inject;

import java.io.Serializable;
import java.util.Map;

/**
 * This class takes in a Map of version number & its associated Encryptor and calls the appropriate Encryptor to
 * decrypt the message.
 */

public class Decryptor implements Serializable {

    private Map<String, Encryptor> encryptors;

    @Inject
    public Decryptor(final Map<String, Encryptor> encryptors) {
        this.encryptors = encryptors;
    }

    /**
     * Decrypt the message for the given version.
     *
     * @param version          encryptor versions
     * @param encryptedMessage encrypted data
     * @return Decrypted message
     */
    public String decrypt(String version, String encryptedMessage) {
        return encryptors.get(version).decrypt(encryptedMessage);
    }
}
