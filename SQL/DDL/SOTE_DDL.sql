--DROP Tables
DROP TABLE boardusers;
DROP TABLE permission;
DROP TABLE users;
DROP TABLE history;
DROP TABLE action;
DROP TABLE board;
DROP TABLE story;
DROP TABLE task;
DROP TABLE lane;

--CREATE board TABLE
CREATE TABLE board(
  b_id INT,
  b_title VARCHAR2(50) NOT NULL,
  b_desc VARCHAR2(200),
  PRIMARY KEY(b_id)
);
--CREATE lane TABLE
CREATE TABLE lane(
  l_id INT,
  l_name VARCHAR2(30) NOT NULL,
  b_id INT NOT NULL,
  PRIMARY KEY(l_id),
  FOREIGN KEY (b_id) REFERENCES board(b_id)
);
--CREATE story TABLE
CREATE TABLE story(
  s_id INT,
  s_title VARCHAR2(50) NOT NULL,
  s_desc VARCHAR2(200),
  s_points INT NOT NULL,
  l_id INT NOT NULL,
  PRIMARY KEY(s_id),
  FOREIGN KEY(l_id) REFERENCES lane(l_id)
);
--CREATE task TABLE
CREATE TABLE task(
  t_id INT,
  t_desc VARCHAR2(200) NOT NULL,
  t_status NUMBER(1) NOT NULL, --No BOOLEAN datatype in SQL (but exists in PL/SQL)
  s_id INT NOT NULL,
  PRIMARY KEY(t_id),
  FOREIGN KEY(s_id) REFERENCES story(s_id)
);
--CREATE users TABLE
CREATE TABLE users(
  u_id INT,
  u_email VARCHAR2(30) UNIQUE NOT NULL,
  u_password VARCHAR2(30) NOT NULL,
  u_fName VARCHAR2(30) NOT NULL,
  u_lName VARCHAR(30) NOT NULL,
  PRIMARY KEY(u_id)
);

--CREATE action TABLE
CREATE TABLE action(
  a_id INT,
  a_name VARCHAR2(30),
  PRIMARY KEY(a_id)
);

--CREATE history TABLE
CREATE TABLE history(
  h_id INT,
  u_id INT,
  a_id INT,
  h_desc VARCHAR2(200),
  h_time TIMESTAMP,
  PRIMARY KEY(h_id),
  FOREIGN KEY(u_id) REFERENCES users(u_id),
  FOREIGN KEY(a_id) REFERENCES action(a_id)
);

--CREATE permission TABLE
CREATE TABLE permission(
  p_id INT,
  p_type VARCHAR(30),
  PRIMARY KEY(p_id)
);

--CREATE boardusers JOIN TABLE
CREATE TABLE boardusers(
  b_id INT,
  u_id INT,
  p_id INT,
  PRIMARY KEY(b_id, u_id, p_id)
);