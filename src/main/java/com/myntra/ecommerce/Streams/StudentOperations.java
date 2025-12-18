package com.myntra.ecommerce.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentOperations {

    public  void printAllStudentsNames(Student[] students){
        Arrays.stream(students)
                .map(Student::getName)
                .forEach(System.out::println);
    }

    public void printAllStudentMarks(Student[] students ){
        Arrays.stream(students)
                .map(Student::getMarks)
                .forEach(System.out::println);
    }
    public int totalStudents(Student[] students ){
        return students.length;
    }
    public double averageMarksOfStudents(Student[] students){
        return Arrays.stream(students)
                .mapToDouble(Student::getMarks)
                .average().orElse(0.0);
    }

    public double maximumMark(Student[] students){
        return Arrays.stream(students)
                .mapToDouble(Student::getMarks)
                .max()
                .orElse(0.0);
    }

    public double minumumMark(Student[] students){
        return Arrays.stream(students)
                .mapToDouble(Student::getMarks)
                .min()
                .orElse(0.0);
    }

    public long more60(Student[] students){
        return Arrays.stream(students)
                .filter(student -> student.getMarks()>60)
                .count();
    }
    public void passed(Student[] students){
        Arrays.stream(students)
                .filter(student -> student.getMarks()>=40)
                .map(Student::getName)
                .forEach(System.out::println);
    }
    public void failed(Student[] students){
        Arrays.stream(students)
                .filter(student -> student.getMarks()<40)
                .map(Student::getName)
                .forEach(System.out::println);
    }

    public void covertToMap(Student[] students){

        Map<String,Double> stringMap=
                Arrays.stream(students)
                .collect(Collectors.toMap(Student::getName,Student::getMarks));

        System.out.println(stringMap);
    }

    public Long aboveAverage(Student[] students){
        return Arrays.stream(students)
                .filter(student -> student.getMarks()>averageMarksOfStudents(students))
                .count();
    }
    public void aboveAverageName(Student[] students){
         Arrays.stream(students)
                .filter(student -> student.getMarks()>averageMarksOfStudents(students))
                 .map(Student::getName)
                 .forEach(System.out::println);
    }

    public void topper(Student[] students){

        System.out.println("Topper Student : "+
                Arrays.stream(students)
                        .max(Comparator.comparingDouble(Student::getMarks))
                        .map(Student::getName)
                        .orElse("no Student")
        );
    }

    public void secondTopper(Student[] students){

        System.out.println("Second Topper Student : "+
                Arrays.stream(students)
                        .sorted(Comparator.comparingDouble(Student::getMarks).reversed())
                        .skip(1)
                        .map(Student::getName)
                        .findFirst()
                        .orElse("no student "));
    }

    public void score (Student[] students){
        Arrays.stream(students)
                .filter(student -> student.getMarks()>70)
                .filter(student -> student.getMarks()<90)
                .map(Student::getName)
                .forEach(System.out::println);
    }

    public boolean isPassed(Student[] students){

        return Arrays.stream(students)
                .allMatch(student -> student.getMarks()>40);
    }

    public boolean centum(Student[] students){

        return Arrays.stream(students)
                .anyMatch(student -> student.getMarks()==100);
    }

    public void first80 (Student[] students){

        System.out.println( Arrays.stream(students)
                .filter(student -> student.getMarks()>=80)
                .map(Student::getName)
                .findFirst().orElse("no person"));

    }

    public long dist(Student[] students){

       return Arrays.stream(students)
               .filter(student -> student.getMarks()>=75)
               .count();
    }

    public void distName(Student[] students){

        Arrays.stream(students)
                .filter(student -> student.getMarks()>=75)
                .sorted(Comparator.comparingDouble(Student::getMarks)
                        .reversed())
                .map(Student::getName)
                .forEach(System.out::println);
    }


    public static void main(String[] args) {

        Student[] students = {
                new Student("John", 5),
                new Student("Michael", 100),
                new Student("David", 92),
                new Student("Joseph", 88),
                new Student("Paul", 81),
                new Student("Peter", 90),
                new Student("Daniel", 76),
                new Student("Matthew", 84),
                new Student("Thomas", 89),
                new Student("Andrew", 73)
        };


        StudentOperations studentOperations=new StudentOperations();

        studentOperations.printAllStudentsNames(students);
        studentOperations.printAllStudentMarks(students);
        System.out.println("Total No of Students : "+studentOperations.totalStudents(students));
        System.out.println("Averagge of all marks : "+studentOperations.averageMarksOfStudents(students));
        System.out.println("Maximum marks : "+studentOperations.maximumMark(students));
        System.out.println("Minimum marks : "+studentOperations.minumumMark(students));
        System.out.println("Greater than 60 : "+studentOperations.more60(students));
        System.out.println("Passed students ----------------------------------");
        studentOperations.passed(students);
        System.out.println("Failed Students ----------------------------------");
        studentOperations.failed(students);
        studentOperations.covertToMap(students);
        System.out.println("Above average : "+studentOperations.aboveAverage(students));
        studentOperations.aboveAverageName(students);

        studentOperations.topper(students);
        studentOperations.secondTopper(students);
        studentOperations.score(students);
        System.out.println("All passed :"+ studentOperations.isPassed(students));
        System.out.println("All 100 :"+ studentOperations.centum(students));
        studentOperations.first80(students);
        System.out.println("Students who scored distinction (≥ 75) : "+ studentOperations.dist(students));
        studentOperations.distName(students);

    }
}
