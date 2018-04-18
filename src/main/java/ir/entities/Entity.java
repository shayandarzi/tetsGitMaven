package ir.entities;

public class Entity {
    private Integer id;
    private String name;
    private String departmant;

    public Entity(Integer id, String name, String departmant) {
        this.id = id;
        this.name = name;
        this.departmant = departmant;
    }

    public Entity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }
}
