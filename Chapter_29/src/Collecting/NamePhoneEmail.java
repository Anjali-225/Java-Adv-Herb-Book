package Collecting;
// Use collect() to create a List and a Set from a stream.

import java.util.*;
import java.util.stream.*;

public class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    NamePhoneEmail(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}