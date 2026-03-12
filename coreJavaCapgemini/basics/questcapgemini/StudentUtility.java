package questcapgemini;

import java.util.*;
import java.util.stream.*;

public class StudentUtility {
	private List<Student> studentList;
	
	public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
	
    public Stream<Student> convertToStream() {
        return studentList.stream();
    }
	
    public double averageMarks(Stream<Student> stream) {
        return stream
                .mapToInt(Student::getMarks)
                .average()
                .orElse(0.0);
    }
    
    public Student findTopper(Stream<Student> stream) {
        return stream
                .max((s1, s2) -> s1.getMarks() - s2.getMarks())
                .orElse(null);
    }


}
