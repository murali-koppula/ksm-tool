package io.quantis;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerBean implements CommandLineRunner {

    @Autowired
    private KeystoreManagerConfig ksmConfig;

    public void run(String... args) throws Exception {
        KeystoreManager ksm = new KeystoreManager();
        ksm.setKsmConfig(ksmConfig);
        ksm.process();

        // Thread.currentThread().setDaemon(true);
        Thread.currentThread().join();
    }
}

