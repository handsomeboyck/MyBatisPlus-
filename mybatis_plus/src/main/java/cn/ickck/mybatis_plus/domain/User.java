package cn.ickck.mybatis_plus.domain;

/**
 * @ClassName User
 * @Description TODO
 * @Author ck
 * @Date 2020/1/8 11:26
 * @Version 1.0
 **/
public class User {
    private int id;
    private  String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
