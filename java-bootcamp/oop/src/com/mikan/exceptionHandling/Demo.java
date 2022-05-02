package com.mikan.exceptionHandling;

public class Demo {
    public static void main(String[] args) {
        Main.divide(3,0);
//    output
//            /usr/lib/jvm/jdk-16.0.2/bin/java -javaagent:/snap/intellij-idea-community/345/lib/idea_rt.jar=44977:/snap/intellij-idea-community/345/bin -Dfile.encoding=UTF-8 -classpath /home/mikan/DSA/java-bootcamp/oop/out/production/oop com.mikan.exceptionHandling.Demo
//        Exception in thread "main" java.lang.ArithmeticException: please do no divide by zero
//        at com.mikan.exceptionHandling.Main.divide(Main.java:28)
//        at com.mikan.exceptionHandling.Demo.main(Demo.java:5)
//
//        Process finished with exit code 1
//
//


    }
}
