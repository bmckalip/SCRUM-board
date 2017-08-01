package com.revature;


import com.revature.pojo.*;
import com.revature.service.AppService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {

        System.out.println("Hello Spring ORM");

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        AppService app = (AppService) ac.getBean("AppService");

        /*Permission permission = new Permission("BoardCreator");
        System.out.println(permission);*/

        Board testBoard = new Board();
        testBoard.setBoardId(1);

        Lane testLane = new Lane();
        testLane.setLaneId(1);

        Story testStory = new Story();
        testStory.setStoryId(1);

        Board board = app.getBoardById(testBoard);
        Story story = app.getStoryById(testStory);
        Lane lane = app.getLaneById(testLane);


    }
}