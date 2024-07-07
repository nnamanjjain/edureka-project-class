package com.njcodeing.CHallenge94;

import java.util.*;

public class PriorityQueueChallenge {
    public static void main(String[] args) {
        System.out.println("Welcome to Priority Queue of Student by Alphabets\n");

        Queue<Student> queue= new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade()-o2.getGrade();
            }
        });
        queue.offer(new Student("Milind",'D'));
        queue.offer(new Student("Radha",'A'));
        queue.offer(new Student("Mohan",'B'));
        queue.offer(new Student("Shyam",'C'));
        queue.offer(new Student("Ram",'A'));

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
