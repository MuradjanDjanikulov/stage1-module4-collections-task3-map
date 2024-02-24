package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        sentence = sentence.toLowerCase();
        String[] splitted = sentence.split("\\s+|\\p{Punct}");
        for (String s : splitted) {
            if(!Pattern.matches("(^$|^\"$|^_$|^\\.$)", s)) {
                result.put(s, result.getOrDefault(s, 0) + 1);
            }
        }
        return result;
    }
}
