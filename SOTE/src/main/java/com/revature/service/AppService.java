package com.revature.service;

import com.revature.dao.*;
import com.revature.dao.impl.UserDaoImpl;
import com.revature.pojo.*;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value="AppService")
@Transactional
public class AppService {

    @Autowired
    private BoardDao boardDao;

    @Autowired
    private LaneDao laneDao;

    @Autowired
    private StoryDao storyDao;

    @Autowired
    private TaskDao taskDao;

    @Autowired
    private UserDao userDao;
    
    /**
     * Service method for updating a board with a given id
     * this method will update all parameters belonging to this board
     * 
     * @author Dillon Tuck
     * @param id
     * @param board
     * @return
     */
    @Transactional
	public Board updateBoard(int id, Board board) {
    	
		board.setBoardId(id);
		return boardDao.updateBoard(board);
	}
    
    @Transactional
    public User getUserById(int id){
    	System.out.println("hit AppService.getUserById(int{id})");
    	User user = new User();
    	user.setUserId(id);
    	System.out.println(user);
    	return userDao.getUserById(user);
    }
    
   

    

//        	public User authenticateUser(User user){
//
//        		UserDao dao = new UserDaoImpl();
//
//        		User TrUser = dao.getUserByEmail(user);
//
//        		
//
//        		if(TrUser != null && TrUser.getUserEmail().equals(user.getUserEmail())
//
//        				&& TrUser.getUserPassword().equals(user.getUserPassword())){
//
//        			return TrUser;
//
//        		}
//
//    			return user;
//
//        		
//
//        		
//
//        	}

        

    @Autowired
    private BoardUserDao boardUserDao;

    public void saveUser(User user){ userDao.createUser(user);}
    public void updateUser(User user){userDao.updateUser(user);}
    public void deleteUser(User user){userDao.deleteUser(user);}

    public void saveTask(Task task){taskDao.createTask(task);}
    public void updateTask(Task task){taskDao.updateTask(task);}
    public void deleteTask(Task task){taskDao.deleteTask(task);}

    public void saveStory(Story story){storyDao.createStory(story);}
    public void updateStory(Story story){storyDao.updateStory(story);}
    public void deleteStory(Story story){storyDao.deleteStory(story);}

    public void saveLane(Lane lane){laneDao.createLane(lane);}
    public void updateLane(Lane lane){laneDao.updateLane(lane);}
    public void deleteLane(Lane lane){laneDao.deleteLane(lane);}

    public void saveBoard(Board board){boardDao.createBoard(board);}
    public void updateBoard(Board board){boardDao.updateBoard(board);}
    public void deleteBoard(Board board){boardDao.deleteBoard(board);}

    public void saveBoardUser(BoardUser boardUser){boardUserDao.createBoardUser(boardUser);}
    public void updateBoardUser(BoardUser boardUser){boardUserDao.updateBoardUser(boardUser);}
    public void deleteBoardUser(BoardUser boardUser){boardUserDao.deleteBoardUser(boardUser);}


    public User getUserById(User user){ return userDao.getUserById(user);}
    public User getUserByEmail(User user){ return userDao.getUserByEmail(user);}

    public Board getBoardById(Board board){return boardDao.getBoardById(board);}

    public Lane getLaneById(Lane lane){return laneDao.getLaneById(lane);}

    public Task getTaskById(Task task){return taskDao.getTaskById(task);}

    public Story getStoryById(Story story){return storyDao.getStoryById(story);}

    public BoardUser getBoardId(BoardUser boardUser){ return boardUserDao.getBoardUserByUserId(boardUser);}

	public Set<Board> getAllBoards() {
		
		return boardDao.getAllBoards();
	}

}
