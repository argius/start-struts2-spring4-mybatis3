package net.argius.myapp.services;

import org.springframework.stereotype.Service;

@Service
public final class MyMessageService {

    public String getMessage() {
        return "This is MyMessageService";
    }

}
