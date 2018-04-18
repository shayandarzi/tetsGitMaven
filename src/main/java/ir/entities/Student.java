package ir.entities;

import ir.dto.StudentDto;

public class Student extends Entity {

    private Integer teacherId;
    public Student(){

    }

    public Student(Integer id, String name, String departmant, Integer teacherId) {
        super(id, name, departmant);
        this.teacherId = teacherId;
    }

    public Student(StudentDto studentDto){
        this.setId(studentDto.getId());
        this.setName(studentDto.getName());
        this.setDepartmant(studentDto.getDepartmant());
        this.setTeacherId(studentDto.getTeacherId());
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}
