mysql> explain class;
+---------------+-------------+------+-----+---------+----------------+
| Field         | Type        | Null | Key | Default | Extra          |
+---------------+-------------+------+-----+---------+----------------+
| id            | int(11)     | NO   | PRI | NULL    | auto_increment |
| class_name    | varchar(50) | YES  |     | NULL    |                |
| instructor_id | int(11)     | YES  | MUL | NULL    |                |
+---------------+-------------+------+-----+---------+----------------+
3 rows in set (0.05 sec)

mysql> explain assignment;
+----------------+---------+------+-----+---------+----------------+
| Field          | Type    | Null | Key | Default | Extra          |
+----------------+---------+------+-----+---------+----------------+
| id             | int(11) | NO   | PRI | NULL    | auto_increment |
| assignment_nbr | int(11) | YES  |     | NULL    |                |
| class_id       | int(11) | YES  | MUL | NULL    |                |
+----------------+---------+------+-----+---------+----------------+
3 rows in set (0.00 sec)

mysql> explain instructor;
+--------------+-------------+------+-----+---------+----------------+
| Field        | Type        | Null | Key | Default | Extra          |
+--------------+-------------+------+-----+---------+----------------+
| id           | int(11)     | NO   | PRI | NULL    | auto_increment |
| first_name   | varchar(30) | YES  |     | NULL    |                |
| last_name    | varchar(30) | YES  |     | NULL    |                |
| major_id     | int(11)     | YES  | MUL | NULL    |                |
| years_of_exp | int(11)     | YES  |     | NULL    |                |
| is_tenured   | tinyint(4)  | YES  |     | NULL    |                |
+--------------+-------------+------+-----+---------+----------------+
6 rows in set (0.00 sec)


mysql> explain major;
+----------------------------+--------------+------+-----+---------+----------------+
| Field                      | Type         | Null | Key | Default | Extra          |
+----------------------------+--------------+------+-----+---------+----------------+
| id                         | int(11)      | NO   | PRI | NULL    | auto_increment |
| major_name                 | varchar(100) | YES  |     | NULL    |                |
| minimum_required_sat_score | int(11)      | YES  |     | NULL    |                |
+----------------------------+--------------+------+-----+---------+----------------+
explain major_class_relationship;
+----------+---------+------+-----+---------+-------+
| Field    | Type    | Null | Key | Default | Extra |
+----------+---------+------+-----+---------+-------+
| id       | int(11) | NO   | PRI | NULL    |       |
| major_id | int(11) | NO   | MUL | NULL    |       |
| class_id | int(11) | NO   | MUL | NULL    |       |
+----------+---------+------+-----+---------+-------+



+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| id         | int(11)      | NO   | PRI | NULL    | auto_increment |
| first_name | varchar(30)  | YES  |     | NULL    |                |
| last_name  | varchar(30)  | YES  |     | NULL    |                |
| major_id   | int(11)      | YES  | MUL | NULL    |                |
| sat        | int(11)      | YES  |     | NULL    |                |
| gpa        | decimal(5,0) | YES  |     | NULL    |                |
+------------+--------------+------+-----+---------+----------------+
6 rows in set (0.00 sec)

mysql> explain student_class_relationship;
+------------+---------+------+-----+---------+-------+
| Field      | Type    | Null | Key | Default | Extra |
+------------+---------+------+-----+---------+-------+
| id         | int(11) | NO   | PRI | NULL    |       |
| student_id | int(11) | NO   | MUL | NULL    |       |
| class_id   | int(11) | NO   | MUL | NULL    |       |
+------------+---------+------+-----+---------+-------+
