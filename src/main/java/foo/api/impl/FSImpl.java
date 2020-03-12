package foo.api.impl;

import foo.api.FS;
import org.springframework.stereotype.Component;

@Component
public class FSImpl implements FS {
    @Override
    public void copy() {
        System.out.println("Em FS copy!");
    }
}
