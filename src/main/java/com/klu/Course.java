package com.klu;

import org.springframework.stereotype.Component;

@Component
public class Course {
    private final int id = 3001;
    private final String course = "Spring Core Subject";
    private final String dateOfCompletion = "30-Jan-2026";

    @Override
    public String toString() {
        return "Course [id=" + id + ", course=" + course + ", dateOfCompletion=" + dateOfCompletion + "]";
    }
}
