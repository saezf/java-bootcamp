/**
 * 
 */
package com.bootcamp.MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 * @author RoDoX
 *
 */
public class TestMySQL {

	static MySQLConnection dao = new MySQLConnection();
	private static Connection connect;
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet;

	@BeforeClass
	public static void setUp() throws Exception {
		connect = dao.connectDatabase();
	
	}

	@Test
	public void TestConnection() {
		Assume.assumeNotNull(dao);
	}

	/*@Test
	public void Test2() throws SQLException
	{
		  preparedStatement = connect
		          .prepareStatement("SELECT * from high_school.course");
		      resultSet = preparedStatement.executeQuery();
		      dao.getStudensTeachersForCourse(resultSet);
	}*/
	
	@Test
	public void TestQuery_key4() throws SQLException {
		// Testing Query Key 4. For a given course
		// List students and teachers
		// For this test we give the argument 'Biology 101'
		// resultSet = null;
		preparedStatement = connect
				.prepareStatement("SELECT C.name ,T.last_name,T.first_name , S.last_name , S.first_name "
						+ "FROM (high_school.course C , high_school.teacher T, high_school.student S, high_school.student_course SC)"
						+ "WHERE (S.id = SC.student_id) and (T.id = C.teacher_id) and (C.id = SC.course_id) and (C.name =?) "
						+ "ORDER BY S.last_name");
		preparedStatement.setString(1, "Biology");
		resultSet = preparedStatement.executeQuery();
		dao.getStudensTeachersForCourse(resultSet);
	}

	@Test
	public void TestQuery_key5() throws SQLException {
		// Testing Query Key 5. For a given student
		// List notes and courses, ordered by them
		// For this test we give the argument 'Winters'
		preparedStatement = connect
				.prepareStatement("SELECT S.last_name, S.first_name, C.name, SC.finalnote "
						+ "FROM (high_school.student S, high_school.course C, high_school.student_course SC)"
						+ "WHERE (S.id = SC.student_id) and (C.id = SC.course_id) and (S.last_name=?) "
						+ "ORDER BY SC.finalnote DESC, C.name ASC");
		preparedStatement.setString(1, "Winters");
		resultSet = preparedStatement.executeQuery();
		dao.getFinalCourseNoteStudent(resultSet);
	}

	
	
	@Test
	public void TestQuery_key6() throws SQLException {
		// Testing Query Key 6.
		// Percentage of students that passed/failed a given course
		// For this test we give the argument 'Biology'
		// The passing grade is 6 or more
		preparedStatement = connect
				.prepareStatement("SELECT C.id, C.name, SC.course_id, COUNT(*) total "
						+ "FROM (high_school.course C, high_school.student_course SC)"
						+ "WHERE (C.id = SC.course_id) and (C.name = 'Biology') HAVING total");
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			int total = resultSet.getInt(3);
			//System.out.println(total);
			preparedStatement = connect
					.prepareStatement("SELECT C.id, C.name, SC.course_id, COUNT(*) total "
							+ "FROM (high_school.course C,  high_school.student_course SC) "
							+ "WHERE (C.id = SC.course_id) and (SC.finalnote >= 6) AND (C.name =?) GROUP BY C.id HAVING total");
			preparedStatement.setString(1, "Biology");
			resultSet = preparedStatement.executeQuery();
			dao.getCourseResults(resultSet, total);
		}
	}
	
	
	
	 @Test
	 public void TestQuery_key7() throws SQLException{
	 //Testing Query Key 7.
	 //For a given teacher, list the timeline for each course that he is assigned to (ordered by date), and the course name
	 //For this test we give the argument 'David'
	 preparedStatement =
	 connect.prepareStatement("SELECT T.id, T.last_name, T.first_name, C.teacher_id, SCH.day, SCH.start_hour, SCH.finish_hour,CSCH.course_id1, C.name  "
	 		+ "FROM (high_school.teacher T, high_school.student_course SC,high_school.schedule SCH, high_school.course_schedule CSCH ,high_school.course C) "
	 		+ " WHERE (T.id = C.teacher_id) and (C.id = CSCH.course_id1) and (CSCH.course_id1 = SCH.id) and (T.last_name=?) ORDER BY SCH.day,C.name");
	 preparedStatement.setString(1, "David");
	 resultSet = preparedStatement.executeQuery();
	 dao.getTeacherSchedule(resultSet);
	 }
	
	
	
}

