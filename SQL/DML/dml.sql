CREATE SEQUENCE permission_seq
  START WITH 1
  INCREMENT BY 1;
/

CREATE SEQUENCE boardusers_seq
  START WITH 1
  INCREMENT BY 1;
/
CREATE SEQUENCE history_seq
  START WITH 1
  INCREMENT BY 1;
/
CREATE SEQUENCE lane_seq
  START WITH 1
  INCREMENT BY 1;
/
CREATE SEQUENCE action_seq
  START WITH 1
  INCREMENT BY 1;
/
CREATE SEQUENCE story_seq
  START WITH 1
  INCREMENT BY 1;
/
CREATE SEQUENCE task_seq
  START WITH 1
  INCREMENT BY 1;
/
CREATE SEQUENCE users_seq
  START WITH 1
  INCREMENT BY 1;
  /
CREATE SEQUENCE board_seq
  START WITH 1
  INCREMENT BY 1;
  /
create or replace trigger board_seq_trigg
  BEFORE INSERT on board
  FOR EACH ROW
  BEGIN
    IF :new.B_ID is NULL THEN
      SELECT board_seq.nextval INTO :new.B_ID FROM dual;
    END IF;
  END;
/
create or replace trigger permission_seq_trigg
  BEFORE INSERT on PERMISSION
  FOR EACH ROW
  BEGIN
    IF :new.P_ID is NULL THEN
      SELECT permission_seq.nextval INTO :new.P_ID FROM dual;
    END IF;
  END;
/
create or replace trigger boardusers_seq_trigg
  BEFORE INSERT on BOARDUSERS
  FOR EACH ROW
  BEGIN
    IF :new.B_ID is NULL THEN
      SELECT boardusers_seq.nextval INTO :new.B_ID FROM dual;
    END IF;
  END;
/
create or replace trigger history_seq_trigg
  BEFORE INSERT on history
  FOR EACH ROW
  BEGIN
    IF :new.H_ID is NULL THEN
      SELECT history_seq.nextval INTO :new.H_ID FROM dual;
    END IF;
  END;
/
create or replace trigger lane_seq_trigg
  BEFORE INSERT on lane
  FOR EACH ROW
  BEGIN
    IF :new.L_ID is NULL THEN
      SELECT lane_seq.nextval INTO :new.L_ID FROM dual;
    END IF;
  END;
/
create or replace trigger action_seq_trigg
  BEFORE INSERT on action
  FOR EACH ROW
  BEGIN
    IF :new.a_ID is NULL THEN
      SELECT action_seq.nextval INTO :new.a_ID FROM dual;
    END IF;
  END;
/
create or replace trigger story_seq_trigg
  BEFORE INSERT on story
  FOR EACH ROW
  BEGIN
    IF :new.S_ID is NULL THEN
      SELECT story_seq.nextval INTO :new.S_ID FROM dual;
    END IF;
  END;
/
create or replace trigger task_seq_trigg
  BEFORE INSERT on task
  FOR EACH ROW
  BEGIN
    IF :new.T_ID is NULL THEN
      SELECT task_seq.nextval INTO :new.T_ID FROM dual;
    END IF;
  END;
/
create or replace trigger users_seq_trigg
  BEFORE INSERT on users
  FOR EACH ROW
  BEGIN
    IF :new.U_ID is NULL THEN
      SELECT users_seq.nextval INTO :new.U_ID FROM dual;
    END IF;
  END;
/
insert into board(B_TITLE, B_DESC)
    VALUES ('Test Board Title', 'Test Board Description');
/
insert into lane(L_NAME, B_ID)
    VALUES ('Test Lane', 1)
/
insert into story(S_TITLE, s_desc, s_points, l_id)
    values('Test Story', 'Test Description', 1, 1)
/
insert into task(t_desc,t_status,s_id)
    values('Test task', 0, 1)
/
commit;