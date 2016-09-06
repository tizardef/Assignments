mysql> select first_name, last_name from student;
+------------+-----------+
| first_name | last_name |
+------------+-----------+
| Eric       | Ephram    |
| Greg       | Gould     |
| Adam       | Ant       |
| Howard     | Hess      |
| Charles    | Caldwell  |
| James      | Joyce     |
| Doug       | Dumas     |
| Kevin      | Kraft     |
| Frank      | Fountain  |
| Brian      | Biggs     |
+------------+-----------+
10 rows in set (0.00 sec) 


mysql> select * from student where years_of_experience < 8;
+-----+------------+-----------+---------------------+------------+
| id  | first_name | last_name | years_of_experience | start_date |
+-----+------------+-----------+---------------------+------------+
| 100 | Eric       | Ephram    |                   2 | 2016-03-31 |
| 110 | Greg       | Gould     |                   6 | 2016-09-30 |
| 120 | Adam       | Ant       |                   5 | 2016-06-02 |
| 130 | Howard     | Hess      |                   1 | 2016-02-28 |
| 140 | Charles    | Caldwell  |                   7 | 2016-05-07 |
| 170 | Kevin      | Kraft     |                   3 | 2016-04-15 |
| 190 | Brian      | Biggs     |                   4 | 2015-12-25 |
+-----+------------+-----------+---------------------+------------+
7 rows in set (0.01 sec)


mysql> select last_name, first_name, id from student order by last_name asc;
+-----------+------------+-----+
| last_name | first_name | id  |
+-----------+------------+-----+
| Ant       | Adam       | 120 |
| Biggs     | Brian      | 190 |
| Caldwell  | Charles    | 140 |
| Dumas     | Doug       | 160 |
| Ephram    | Eric       | 100 |
| Fountain  | Frank      | 180 |
| Gould     | Greg       | 110 |
| Hess      | Howard     | 130 |
| Joyce     | James      | 150 |
| Kraft     | Kevin      | 170 |
+-----------+------------+-----+
10 rows in set (0.00 sec)

mysql> select * from student where first_name = 'Adam' or first_name = 'James' o
r first_name = 'Frank' order by last_name desc;
+-----+------------+-----------+---------------------+------------+
| id  | first_name | last_name | years_of_experience | start_date |
+-----+------------+-----------+---------------------+------------+
| 150 | James      | Joyce     |                   9 | 2016-08-27 |
| 180 | Frank      | Fountain  |                   8 | 2016-01-31 |
| 120 | Adam       | Ant       |                   5 | 2016-06-02 |
+-----+------------+-----------+---------------------+------------+
3 rows in set (0.00 sec)

mysql> select * from student where start_date between '2016-01-01' and '2016-06-
30' order by start_date desc;
+-----+------------+-----------+---------------------+------------+
| id  | first_name | last_name | years_of_experience | start_date |
+-----+------------+-----------+---------------------+------------+
| 120 | Adam       | Ant       |                   5 | 2016-06-02 |
| 140 | Charles    | Caldwell  |                   7 | 2016-05-07 |
| 170 | Kevin      | Kraft     |                   3 | 2016-04-15 |
| 100 | Eric       | Ephram    |                   2 | 2016-03-31 |
| 130 | Howard     | Hess      |                   1 | 2016-02-28 |
| 180 | Frank      | Fountain  |                   8 | 2016-01-31 |
+-----+------------+-----------+---------------------+------------+
6 rows in set (0.05 sec)

