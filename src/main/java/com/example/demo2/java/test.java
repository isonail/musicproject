package com.example.demo2.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class test {

    public enum Students{
        taotao(1),jiji(2),doudou(3);
        private int code;
        private Students(int code){
            this.code=code;
        }
        public int getCode(){
            return code;
        }
    }

    static List<Integer> list=new ArrayList<>();

    static Stream stream=list.stream();



    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        Collections.addAll(list,11,22,33,44);
        for(int e: list){
            System.out.print(e);
        }

    }

}
