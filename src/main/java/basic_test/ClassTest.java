package basic_test;

import javax.print.DocFlavor;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ClassTest {
    class A{

    }
    static class B{

    }
    public static void main(String[] args) throws IOException {
//        Cat cat =  new Cat();
//
//        System.out.println(cat.name);
//        changeName(cat);
//        System.out.println(cat.name);
//        Stream.iterate(new int[]{0,1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
//                .limit(6)
//                .map(y -> y[0])
//                .forEach(x -> System.out.println(x));

        String str1 = "C:/Users/mrhan/Desktop/Learn/java_streams/first.txt";
        String str2 = "C:/Users/mrhan/Desktop/Learn/java_streams/second.txt";
        B b = new B();
    }

    /*
     *
    File f = null;
    final PipedOutputStream output = new PipedOutputStream();
    final PipedInputStream input = new PipedInputStream(output);
    Thread thread1 = new Thread(new Runnable() {
    @Override
    public void run() {
    try {
    output.write("Hello world, pipe!".getBytes(StandardCharsets.UTF_8));
    } catch (IOException e){
    }
    }
    });

    Thread thread2 = new Thread(new Runnable() {
    @Override
    public void run() {
    try {
    int data = input.read();
    while(data != -1){
    System.out.print((char) data);
    data = input.read();
    }
    }catch (IOException e){

    }
    }
    });
    thread1.start();
    thread2.start();

    };//end of main method
     */


    public static double[] tribonacci(double[] s, int n) {
        double[] result = new double[n];
        double temp = 0;
        ArrayList<Double> resultList = new ArrayList<>(); //Init dynamic arraylist
        for (double entry: s) { //add all elements from s-array
            resultList.add(entry);
        }
        if(n == 0){ //dummy-check
            return result;
        }else{
            for (int x = 0; x < n; x++){
                for (double entry: resultList //all members of fibo iteration
                     ) {
                    temp = entry + temp; //sum all members of iteration
                }
                resultList.add(temp); //adding new iteration to result array
            }
        }
        double[] returnResult = resultList.stream().mapToDouble(i -> i).toArray();
        return returnResult;
    }

    public static String spinFiveSizedWords(String sentence) {
        String[] words = sentence.split(" "); //Splitting a string into a String array
        for (int i=0; i<words.length; i++) {        //parsing through an array
            if (words[i].length() >= 5) {           //conditional by the task
                words[i] = new StringBuilder(words[i]).reverse().toString();    //during parsing, we find chonky words
            }
        }
        return String.join(" ",words);
    }

    public static boolean checkIfFibo(int a){ //checks if n is a Fibonacchi number
        if(a == 0){
            return true;
        }else{
            int fibOne = 0;
            int fibTwo = 1;
            int temp;
            do{
                temp = fibOne;
                fibOne = fibTwo;
                fibTwo = fibOne + temp;
            }while (fibTwo < a);
            if(fibTwo == a)
                return true;
            else
                return false;
        }

    }

    public static int fibo(int n){ //returns n'th element in a Fibonacchi row
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 1];
    }

    public static void changeName(Cat cat) {
        cat.name = "Jerry";
    }

    public static class Cat {
        String name = "Tom";
    }

    public static String troll(String str){
        Character vowels[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Character> list = Arrays.asList(vowels);
        StringBuilder sb = new StringBuilder(str);
        for (int x = 0; x < sb.length(); x++){
            if(list.contains(sb.charAt(x))){
                sb.replace(x, x+1, "");
                x--;
            }
        }
        return sb.toString();
    }


}
