package org.slim.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class StreamsJ8 {


    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer,Integer> freq = new HashMap();

        arr.forEach(elem -> {
            if(freq.containsKey(elem)) freq.put(elem, freq.get(elem) + 1);
            else freq.put(elem, 1);
        });

//        Map.Entry<Integer, Integer> maxFrequencyMapEntry = freq.entrySet().stream().
//                sorted((x,y) -> {
//                    return x.getValue() - y.getValue();
//                }).
//                max((x,y) -> {
//                    return x.getValue() - y.getValue();
//                }).orElseGet(null);


        //better version
        Map.Entry<Integer, Integer> maxFrequencyMapEntry = freq.entrySet().stream().
                sorted(Comparator.comparing(Map.Entry::getValue)).
                max(Comparator.comparing(Map.Entry::getValue)).orElseGet(null);

        return maxFrequencyMapEntry.getKey();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));


        /*
        * Sample input
        * 6
        * 1 4 4 4 5 3
        * */

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}