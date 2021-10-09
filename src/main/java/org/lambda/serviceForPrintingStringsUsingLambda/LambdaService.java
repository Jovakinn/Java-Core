package org.lambda.serviceForPrintingStringsUsingLambda;

public class LambdaService {
    public static void def(Joinable joinable) {
        System.out.println(joinable.function("hello"));
    }

    public static void main(String[] args) {
        def(String::length);
    }
}
