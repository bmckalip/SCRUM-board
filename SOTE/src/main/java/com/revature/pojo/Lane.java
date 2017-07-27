package com.revature.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="task")
public class Lane implements Serializable{
    @Id
    @Column(name="l_id")
    private int id;
    @Column(name = "l_name")
    private String name;

    private Story story;

    public Lane(){}

    public Lane(int id, String name){
        super();
        this.id = id;
        this.name = name;
    }

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

    @ManyToMany(mappedBy = "lane")
    public Story getStory(){
        return story;
    }

    public void setStory(Story story){
        this.story = story;
    }

    @Override
    public String toString() {
        return "Lane{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", story=" + story +
                '}';
    }
}
