package io.quantis;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KeystoreManager {
    @Getter @Setter
    private KeystoreManagerConfig ksmConfig;

    private final Logger logger = LoggerFactory.getLogger(KeystoreManager.class);

    void process() {
        logger.info("keystore location: " + ksmConfig.getLocation());
        logger.info("keystore type: " + ksmConfig.getType());
        logger.info("keytore password: " + ksmConfig.getPassword());

    }
}
