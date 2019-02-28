package ru.ifmo.rain.dolgikh.student;

import info.kgeorgiy.java.advanced.student.Student;
import info.kgeorgiy.java.advanced.student.StudentQuery;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentDB implements StudentQuery {

    private List<String> getMappedList(List<Student> students, Function<Student, String> mapper) {
        return students.stream().map(mapper).collect(Collectors.toList());
    }

    @Override
    public List<String> getFirstNames(List<Student> students) {
        return getMappedList(students, Student::getFirstName);
    }

    @Override
    public List<String> getLastNames(List<Student> students) {
        return getMappedList(students, Student::getLastName);
    }

    @Override
    public List<String> getGroups(List<Student> students) {
        return getMappedList(students, Student::getGroup);
    }

    @Override
    public List<String> getFullNames(List<Student> students) {
        return getMappedList(students, student -> student.getFirstName() + " " + student.getLastName());
    }

    @Override
    public Set<String> getDistinctFirstNames(List<Student> students) {
        return students.stream().map(Student::getFirstName).collect(Collectors.toSet());
    }

    @Override
    public String getMinStudentFirstName(List<Student> students) {
        return students.stream().min(Student::compareTo).map(Student::getFirstName).get();
    }

    @Override
    public List<Student> sortStudentsById(Collection<Student> students) {
        return null;
    }

    @Override
    public List<Student> sortStudentsByName(Collection<Student> students) {
        return null;
    }

    @Override
    public List<Student> findStudentsByFirstName(Collection<Student> students, String name) {
        return null;
    }

    @Override
    public List<Student> findStudentsByLastName(Collection<Student> students, String name) {
        return null;
    }

    @Override
    public List<Student> findStudentsByGroup(Collection<Student> students, String group) {
        return null;
    }

    @Override
    public Map<String, String> findStudentNamesByGroup(Collection<Student> students, String group) {
        return null;
    }
}
