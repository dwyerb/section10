package com.digitalglobe;

import java.util.HashMap;

/**
 * Created by Brendan on 2/6/2019.
 */
public class MapProgram {
    public static void main(String[] args) {
        java.util.Map<String, String> languages = new HashMap<>();
        languages.put("Java","Compiled, high level, object oriented");
        languages.put("Python", "Interpreted, high level, dynamic semantics");
        languages.put("Basic", "Beginers all purpose symbolic instruction code");
        languages.put("LISP","Therein lies madness");

        System.out.println(languages.get("Java"));
    }
}
