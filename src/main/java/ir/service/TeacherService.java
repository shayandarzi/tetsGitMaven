package ir.service;

import ir.dao.TeacherDao;
import ir.dto.TeacherDto;
import ir.entities.Entity;
import ir.entities.Teacher;
import ir.manager.StudentManager;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/teacher")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TeacherService {
    @Path("/add")
    @POST
    public void addTeacher(TeacherDto teacherDtoDto) throws Exception {
        Teacher teacher = new Teacher(teacherDtoDto);

        StudentManager.getInstance().save(teacher);
    }
    
    
    @Path("/delete")
    @POST
    public void deleteTeacher(Integer id) throws Exception {
        StudentManager.getInstance().delete(id);
    }
    
    @Path("/update")
    @POST
    public void updateTeacher(TeacherDto teacherDto) throws Exception {
        Teacher teacher = new Teacher(teacherDto);
        TeacherDao.getInstance().update(teacher);
    }
    
    
    @Path("/getAll")
    @GET
    public List<TeacherDto> getAll() throws Exception {
        List<TeacherDto> list = new ArrayList<>();
        List<Entity> teachers = new ArrayList<>();
        teachers = TeacherDao.getInstance().get();

        for (Entity teacher : teachers) {
            Teacher teacher1 = (Teacher) teacher;
            TeacherDto teacherDto = new TeacherDto(teacher1);
            list.add(teacherDto);
        }
        return list;
    }

}
