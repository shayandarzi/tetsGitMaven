package ir.service;

import ir.dto.StudentDto;
import ir.entities.Entity;
import ir.entities.Student;
import ir.manager.StudentManager;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;


@Path("/student")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StudentService {
    @Path("/add")
    @POST
    public void addStudent(StudentDto studentDto) throws Exception {
        Student student = new Student(studentDto);

        StudentManager.getInstance().save(student);
    }


    @Path("/delete")
    @GET
    public void delete(@QueryParam("id") int id) throws Exception {
        StudentManager.getInstance().delete(id);
    }

    @Path("/update")
    @POST
    public void update(StudentDto studentDto) throws Exception {
        Student student = new Student(studentDto);

        StudentManager.getInstance().update(student);
    }

    @Path("/getAll")
    @GET
    public List<StudentDto> getAll() throws Exception {
        List<StudentDto> list = new ArrayList<>();
        List<Entity> students = StudentManager.getInstance().getAll();

        for (Entity student : students) {
            Student student1 = (Student) student;
            StudentDto studentDto = new StudentDto(student1);
            list.add(studentDto);
        }

        return list;
    }
}
