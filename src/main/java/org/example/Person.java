package org.example;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Person {
    String name;
    String email;
    String imageSrc;
    String role;
}
