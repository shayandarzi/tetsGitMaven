package ir.entities;

import ir.dto.TeacherDto;

public class Teacher extends Entity {
    public Teacher(TeacherDto teacherDto) {
        this.setId(teacherDto.getId());
        this.setName(teacherDto.getName());
        this.setDepartmant(teacherDto.getDepartmant());
    }

    public Teacher(){

    }
}
