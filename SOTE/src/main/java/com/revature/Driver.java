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

        //
//        User testUser = new User();
//        testUser.setUserEmail("ram@ram.ram");
//
//        User dbUser = app.getUserByEmail(testUser);
//        System.out.println(dbUser);

        //ADMIN = can do everything, USER = cannot do very much
//        User dbUser = new User("ram@ram.ram", "123", "ADMIN", "Ramses", "Sanchez");
//        app.saveUser(dbUser);
        //Creating a board
//        Board dbBoard = new Board("My First Board", "My little board ");
//        app.saveBoard(dbBoard);

//        User testUser = new User();
//        testUser.setUserId(1);
//
//        Board testBoard = new Board();
//        testBoard.setBoardId(1);
//
//        BoardUserCompositeKey dbBoardUserCompositeKey = new BoardUserCompositeKey();
//        dbBoardUserCompositeKey.setBoard(testBoard);
//        dbBoardUserCompositeKey.setUser(testUser);
//
//        BoardUser boardUser = new BoardUser();
//        boardUser.setBoardUserCompositeKey(dbBoardUserCompositeKey);
//
//        app.saveBoardUser(boardUser);

        User testUser = new User();
        testUser.setUserEmail("ram@ram.ram");
        System.out.println(app.getUserByEmail(testUser));



}
}