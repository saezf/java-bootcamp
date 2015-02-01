package com.bootcamp;

//import static org.junit.Assert.*;

import com.bootcamp.MySQLAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assume;

import java.sql.Statement;

public class DbTest {

	static MySQLAccess dao = new MySQLAccess();
	private static Connection connect;
	private static Statement statement;
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet;

	@BeforeClass
	public static void setUp() throws Exception {
		connect = dao.connectDatabase();
		connect.setAutoCommit(false); // begin transaction
		statement = null;
		resultSet = null;
		preparedStatement = connect
				.prepareStatement("DELETE FROM  high_school.course");
		preparedStatement.executeUpdate();
		preparedStatement = connect
				.prepareStatement("DELETE FROM  high_school.teacher");
		preparedStatement.executeUpdate();
		preparedStatement = connect
				.prepareStatement("DELETE FROM  high_school.student");
		preparedStatement.executeUpdate();
		preparedStatement = connect
				.prepareStatement("DELETE FROM  high_school.schedule");
		preparedStatement.executeUpdate();
		preparedStatement = connect
				.prepareStatement("DELETE FROM  high_school.student_x_course");
		preparedStatement.executeUpdate();
		statement = connect.createStatement();
		// Add Students
		preparedStatement = connect
				.prepareStatement("INSERT INTO high_school.student "
						+ "(id_student, first_name_student, last_name_student, birth_day_student) "
						+ "VALUES (default, 'Carlos', 'Perez', '1973-07-22'),"
						+ "(default, 'Fernando', 'Perez', '1980-10-08'),"
						+ "(default,'Rinah','Mccall','1955-07-21'),"
						+ "(default,'James','Bond','1978-02-13'),"
						+ "(default,'Romina','Leland','1953-02-15'),"
						+ "(default,'Lynn','Mccann','1963-11-17'),"
						+ "(default,'Harper','Velazquez','1952-06-01'),"
						+ "(default,'Elizabeth','Crane','1952-03-04'),"
						+ "(default,'Marcia','Watts','1976-05-18'),"
						+ "(default,'Anne','Rivers','1978-02-13'),"
						+ "(default,'Maya','Sawyer','1983-12-07'),"
						+ "(default,'Sasha','Herrera','1954-07-30'),"
						+ "(default,'Denise','Melendez','1947-05-31'),"
						+ "(default,'Maia','Vaughn','1948-01-30'),"
						+ "(default,'Kelly','Abbott','1977-04-03'),"
						+ "(default,'Jaime','Salinas','1972-08-16'),"
						+ "(default,'Ralph','Dunn','1961-07-18'),"
						+ "(default,'Kenneth','Sharp','1960-03-29'),"
						+ "(default,'Andrew','Noel','1963-10-28'),"
						+ "(default,'Vincent','Medina','1955-08-07'),"
						+ "(default,'Arthur','Baxter','1969-09-07'),"
						+ "(default,'Tyrone','Baird','1972-10-24'),"
						+ "(default,'Conan','Morris','1961-07-09'),"
						+ "(default,'Dustin','Jarvis','1957-01-18'),"
						+ "(default,'Oliver','Parker','1960-09-26'),"
						+ "(default,'Keith','Garcia','1946-07-22'),"
						+ "(default,'Denton','Chan','1966-06-28'),"
						+ "(default,'Christian','Maynard','1964-07-26'),"
						+ "(default,'Colin','Espinoza','1970-08-26'),"
						+ "(default,'Salvador','Walton','1951-02-22')");
		preparedStatement.executeUpdate();
		// Add Teachers
		preparedStatement = connect
				.prepareStatement("INSERT INTO high_school.teacher "
						+ "(id_teacher, first_name_teacher, last_name_teacher, birth_date_teacher) "
						+ "VALUES(default, 'Phill', 'Collins', '1945-11-06'),"
						+ "(default, 'Michael', 'Hutchense', '1976-06-07'),"
						+ "(default, 'Jane', 'Johnson', '1986-02-01')");
		preparedStatement.executeUpdate();
		// Add Courses
		preparedStatement = connect
				.prepareStatement("INSERT INTO high_school.course "
						+ "(id_course, name_course, hours_per_week, id_teacher) "
						+ "VALUES(default, 'Computer Programming 101', 6, (SELECT id_teacher FROM high_school.teacher WHERE last_name_teacher='Collins')),"
						+ "(default, 'Biology 101', 5, (SELECT id_teacher FROM high_school.teacher WHERE last_name_teacher='Johnson')),"
						+ "(default, 'European History', 3, (SELECT id_teacher FROM high_school.teacher WHERE last_name_teacher='Hutchense')),"
						+ "(default, 'Anatomy 101', 8, (SELECT id_teacher FROM high_school.teacher WHERE last_name_teacher='Hutchense')),"
						+ "(default, 'Chemistry', 7, (SELECT id_teacher FROM high_school.teacher WHERE last_name_teacher='Johnson'))");
		preparedStatement.executeUpdate();
		// Add Schedules
		preparedStatement = connect
				.prepareStatement("INSERT INTO high_school.schedule "
						+ "(id_schedule, `day`, time_from, time_to) "
						+ "VALUES(default, 'Lunes', '18:00:00', '20:00:00'),"
						+ "(default, 'Viernes', '20:00:00', '22:00:00'),"
						+ "(default, 'Martes', '15:00:00', '19:00:00'),"
						+ "(default, 'Jueves', '16:00:00', '20:00:00'),"
						+ "(default, 'Miercoles', '17:30:00', '18:30:00')");
		preparedStatement.executeUpdate();
		// Add Students to a Course
		preparedStatement = connect
				.prepareStatement("INSERT INTO high_school.student_x_course "
						+ "(id_student, id_course, note_1, note_2, note_3, final_note) "
						+ "VALUES((SELECT id_student FROM high_school.student WHERE last_name_student='Walton'),(SELECT id_course FROM high_school.course WHERE name_course='Biology 101'), 7, 7, 7, 7),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Espinoza'),(SELECT id_course FROM high_school.course WHERE name_course='Biology 101'), 7, 6, 6, 6),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Garcia'),(SELECT id_course FROM high_school.course WHERE name_course='Biology 101'), 8, 8, 8, 8),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Maynard'),(SELECT id_course FROM high_school.course WHERE name_course='Biology 101'), 9, 8, 7, 8),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Chan'),(SELECT id_course FROM high_school.course WHERE name_course='Biology 101'), 6, 6, 6, 6),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Parker'),(SELECT id_course FROM high_school.course WHERE name_course='Biology 101'), 7, 7, 7, 7),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Jarvis'),(SELECT id_course FROM high_school.course WHERE name_course='Biology 101'), 5, 5, 5, 5),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Baird'),(SELECT id_course FROM high_school.course WHERE name_course='Biology 101'), 4, 4, 4, 4),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Baxter'),(SELECT id_course FROM high_school.course WHERE name_course='Biology 101'), 3, 3, 6, 4),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Medina'),(SELECT id_course FROM high_school.course WHERE name_course='Biology 101'), 2, 2, 2, 2),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Jarvis'),(SELECT id_course FROM high_school.course WHERE name_course='Computer Programming 101'), 7, 7, 7, 7),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Baird'),(SELECT id_course FROM high_school.course WHERE name_course='Computer Programming 101'), 6, 5, 7, 6),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Baxter'),(SELECT id_course FROM high_school.course WHERE name_course='Computer Programming 101'), 8, 8, 8, 8),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Medina'),(SELECT id_course FROM high_school.course WHERE name_course='Computer Programming 101'), 7, 7, 7, 7),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Sharp'),(SELECT id_course FROM high_school.course WHERE name_course='Computer Programming 101'), 6, 6, 6, 6),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Herrera'),(SELECT id_course FROM high_school.course WHERE name_course='Computer Programming 101'), 5, 5, 5, 5),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Sawyer'),(SELECT id_course FROM high_school.course WHERE name_course='Computer Programming 101'), 4, 4, 4, 4),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Rivers'),(SELECT id_course FROM high_school.course WHERE name_course='Computer Programming 101'), 3, 3, 3, 3),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Melendez'),(SELECT id_course FROM high_school.course WHERE name_course='Computer Programming 101'), 2, 2, 2, 2),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Abbot'),(SELECT id_course FROM high_school.course WHERE name_course='Computer Programming 101'), 1, 1, 1, 1),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Dunn'),(SELECT id_course FROM high_school.course WHERE name_course='European History'), 7, 7, 7, 7),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Salinas'),(SELECT id_course FROM high_school.course WHERE name_course='European History'), 6, 6, 6, 6),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Abbot'),(SELECT id_course FROM high_school.course WHERE name_course='European History'), 6, 7, 5, 6),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Vaughn'),(SELECT id_course FROM high_school.course WHERE name_course='European History'), 8, 8, 8, 8),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Melendez'),(SELECT id_course FROM high_school.course WHERE name_course='European History'), 9, 9, 9, 9),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Mccann'),(SELECT id_course FROM high_school.course WHERE name_course='European History'), 7, 7, 7, 7),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Garcia'),(SELECT id_course FROM high_school.course WHERE name_course='European History'), 3, 3, 3, 3),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Maynard'),(SELECT id_course FROM high_school.course WHERE name_course='European History'), 1, 1, 1, 1),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Chan'),(SELECT id_course FROM high_school.course WHERE name_course='European History'), 3, 5, 4, 4),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Parker'),(SELECT id_course FROM high_school.course WHERE name_course='European History'), 5, 7, 6, 6),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Herrera'),(SELECT id_course FROM high_school.course WHERE name_course='Anatomy 101'), 6, 6, 6, 6),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Sawyer'),(SELECT id_course FROM high_school.course WHERE name_course='Anatomy 101'), 7, 7, 7, 7),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Rivers'),(SELECT id_course FROM high_school.course WHERE name_course='Anatomy 101'), 6, 6, 6, 6),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Watts'),(SELECT id_course FROM high_school.course WHERE name_course='Anatomy 101'), 6, 7, 5, 6),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Crane'),(SELECT id_course FROM high_school.course WHERE name_course='Anatomy 101'), 8, 8, 8, 8),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Velazquez'),(SELECT id_course FROM high_school.course WHERE name_course='Anatomy 101'), 7, 7, 7, 7),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Mccall'),(SELECT id_course FROM high_school.course WHERE name_course='Anatomy 101'), 6, 6, 6, 6),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Mccann'),(SELECT id_course FROM high_school.course WHERE name_course='Anatomy 101'), 6, 6, 6, 6),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Leland'),(SELECT id_course FROM high_school.course WHERE name_course='Anatomy 101'), 2, 2, 2, 2),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Bond'),(SELECT id_course FROM high_school.course WHERE name_course='Anatomy 101'), 1, 1, 1, 1),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Velazquez'),(SELECT id_course FROM high_school.course WHERE name_course='Chemistry'), 9, 9, 9, 9),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Mccall'),(SELECT id_course FROM high_school.course WHERE name_course='Chemistry'), 7, 7, 7, 7),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Mccann'),(SELECT id_course FROM high_school.course WHERE name_course='Chemistry'), 6, 6, 6, 6),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Leland'),(SELECT id_course FROM high_school.course WHERE name_course='Chemistry'), 6, 7, 5, 6),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Bond'),(SELECT id_course FROM high_school.course WHERE name_course='Chemistry'), 8, 8, 8, 8),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Parker'),(SELECT id_course FROM high_school.course WHERE name_course='Chemistry'), 9, 9, 9, 9),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Salinas'),(SELECT id_course FROM high_school.course WHERE name_course='Chemistry'), 1, 1, 1, 1),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Dunn'),(SELECT id_course FROM high_school.course WHERE name_course='Chemistry'), 2, 2, 2, 2),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Rivers'),(SELECT id_course FROM high_school.course WHERE name_course='Chemistry'), 5, 5, 5, 5),"
						+ "((SELECT id_student FROM high_school.student WHERE last_name_student='Garcia'),(SELECT id_course FROM high_school.course WHERE name_course='Chemistry'), 1, 1, 1, 1)");
		preparedStatement.executeUpdate();
		// Assign schedules to courses
		preparedStatement = connect
				.prepareStatement("INSERT INTO high_school.course_x_schedule "
						+ "(id_course, id_schedule, total_hours) "
						+ "VALUES((SELECT id_course FROM high_school.course WHERE name_course='Chemistry'), (SELECT id_schedule FROM high_school.schedule WHERE day='Martes'), 4),"
						+ "((SELECT id_course FROM high_school.course WHERE name_course='Chemistry'), (SELECT id_schedule FROM high_school.schedule WHERE day='Jueves'), 2),"
						+ "((SELECT id_course FROM high_school.course WHERE name_course='Biology 101'), (SELECT id_schedule FROM high_school.schedule WHERE day='Martes'), 4),"
						+ "((SELECT id_course FROM high_school.course WHERE name_course='Biology 101'), (SELECT id_schedule FROM high_school.schedule WHERE day='Miercoles'), 1),"
						+ "((SELECT id_course FROM high_school.course WHERE name_course='European History'), (SELECT id_schedule FROM high_school.schedule WHERE day='Viernes'), 2),"
						+ "((SELECT id_course FROM high_school.course WHERE name_course='European History'), (SELECT id_schedule FROM high_school.schedule WHERE day='Miercoles'), 1),"
						+ "((SELECT id_course FROM high_school.course WHERE name_course='Anatomy 101'), (SELECT id_schedule FROM high_school.schedule WHERE day='Martes'), 4),"
						+ "((SELECT id_course FROM high_school.course WHERE name_course='Anatomy 101'), (SELECT id_schedule FROM high_school.schedule WHERE day='Jueves'), 4),"
						+ "((SELECT id_course FROM high_school.course WHERE name_course='Computer Programming 101'), (SELECT id_schedule FROM high_school.schedule WHERE day='Lunes'), 2),"
						+ "((SELECT id_course FROM high_school.course WHERE name_course='Computer Programming 101'), (SELECT id_schedule FROM high_school.schedule WHERE day='Jueves'), 4)");
		preparedStatement.executeUpdate();
	}

	@Test
	public void TestConnection() {
		Assume.assumeNotNull(dao);
	}

	@Test
	public void TestQuery_key4() throws SQLException {
		// Testing Query Key 4. For a given course
		// List students and teachers
		// For this test we give the argument 'Biology 101'
		// resultSet = null;
		preparedStatement = connect
				.prepareStatement("SELECT T1.name_course, T2.last_name_teacher, T2.first_name_teacher, T4.last_name_student, T4.first_name_student "
						+ "FROM high_school.course AS T1 "
						+ "INNER JOIN high_school.teacher AS T2 ON T1.id_teacher = T2.id_teacher "
						+ "INNER JOIN high_school.student_x_course AS T3 ON T1.id_course = T3.id_course "
						+ "INNER JOIN high_school.student AS T4 ON T3.id_student = T4.id_student "
						+ "WHERE T1.name_course =? "
						+ "ORDER BY T4.last_name_student");
		preparedStatement.setString(1, "Biology 101");
		resultSet = preparedStatement.executeQuery();
		dao.writeResultSetQueryKey4(resultSet);
	}

	@Test
	public void TestQuery_key5() throws SQLException {
		// Testing Query Key 5. For a given student
		// List notes and courses, ordered by them
		// For this test we give the argument 'Mccann'
		preparedStatement = connect
				.prepareStatement("SELECT T1.id_student, T1.last_name_student, T1.first_name_student, T3.name_course, T2.final_note, T2.note_1, T2.note_2, T2.note_3 "
						+ "FROM high_school.student AS T1 "
						+ "INNER JOIN high_school.student_x_course AS T2 ON T1.id_student = T2.id_student "
						+ "INNER JOIN high_school.course AS T3 ON T2.id_course = T3.id_course "
						+ "WHERE T1.last_name_student =? "
						+ "ORDER BY T2.final_note DESC, T3.name_course ASC");
		preparedStatement.setString(1, "Mccann");
		resultSet = preparedStatement.executeQuery();
		dao.writeResultSetQueryKey5(resultSet);
	}

	@Test
	public void TestQuery_key6() throws SQLException {
		// Testing Query Key 6.
		// Percentage of students that passed/failed a given course
		// For this test we give the argument 'Chemistry'
		// The passing grade is 6 or more
		preparedStatement = connect
				.prepareStatement("SELECT T1.id_course, T1.name_course, COUNT(*) AS total "
						+ "FROM high_school.course AS T1 "
						+ "INNER JOIN high_school.student_x_course AS T2 ON T1.id_course = T2.id_course "
						+ "WHERE T1.name_course = 'Chemistry'" + "HAVING total");
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			int total = resultSet.getInt(3);
			//System.out.println(total);
			preparedStatement = connect
					.prepareStatement("SELECT T1.id_course, T1.name_course, COUNT(*) AS total "
							+ "FROM high_school.course AS T1 "
							+ "INNER JOIN high_school.student_x_course AS T2 ON T1.id_course = T2.id_course "
							+ "WHERE (T2.final_note >= 6) AND (T1.name_course =?)"
							+ "GROUP BY T1.id_course " + "HAVING total");
			preparedStatement.setString(1, "Chemistry");
			resultSet = preparedStatement.executeQuery();
			dao.writeResultSetQueryKey6(resultSet, total);
		}
	}

	 @Test
	 public void TestQuery_key7() throws SQLException{
	 //Testing Query Key 7.
	 //For a given teacher, list the timeline for each course that he is assigned to (ordered by date), and the course name
	 //For this test we give the argument 'Johnson'
	 preparedStatement =
	 connect.prepareStatement("SELECT T1.id_teacher, T1.last_name_teacher, T1.first_name_teacher, T4.`DAY`, T4.time_from, T4.time_to, T2.name_course "
	 		+ "FROM high_school.teacher AS T1"
	 		+ " INNER JOIN high_school.course AS T2 ON T1.id_teacher = T2.id_teacher "
	 		+ "INNER JOIN high_school.course_x_schedule AS T3 ON T2.id_course = T3.id_course "
	 		+ "INNER JOIN high_school.schedule AS T4 ON T3.id_schedule = T4.id_schedule "
	 		+ "WHERE T1.last_name_teacher =? "
	 		+ "ORDER BY T4.`DAY`,T2.name_course");
	 preparedStatement.setString(1, "Johnson");
	 resultSet = preparedStatement.executeQuery();
	 dao.writeResultSetQueryKey7(resultSet);
	 }
}
