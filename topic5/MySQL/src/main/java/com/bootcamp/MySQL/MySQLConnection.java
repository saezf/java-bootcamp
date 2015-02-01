/**
 * 
 */
package com.bootcamp.MySQL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

/**
 * @author RoDoX
 *
 */
public class MySQLConnection {



	
		private Connection connect = null;

		/*
		 * private Statement statement = null; private PreparedStatement
		 * preparedStatement = null; private ResultSet resultSet = null;
		 */

		public Connection connectDatabase() throws Exception {
			try {
				// this will load the MySQL driver, each DB has its own driver
				Class.forName("com.mysql.jdbc.Driver");
				connect = DriverManager
						.getConnection("jdbc:mysql://localhost/high_school?"
								+ "user=root&password=thewolf82");
				return connect;

				// statements allow to issue SQL queries to the database
			} catch (Exception e) {
				throw e;
			}
		}

		public void closeDatabase() throws Exception {
			try {
				connect.close();
			} catch (Exception e) {
				throw e;
			}
		}

		public void getStudensTeachersForCourse(ResultSet resultSet)
				throws SQLException {
			// resultSet is initialised before the first data set
			if (resultSet.next()) {
				//Print the first line
				System.out.println("Results ------ Query 4");
				String course = resultSet.getString(1);
				String teacher_first = resultSet.getString(2);
				String teacher_last = resultSet.getString(3);
				System.out.println("Course: " + course);
				System.out.println("Teacher: " + teacher_last + ", "
						+ teacher_first);
				System.out.println("Students: ");
				System.out.println(resultSet.getString(4) + " , "
						+ resultSet.getString(5));
				while (resultSet.next()) {
					// it is possible to get the columns via name
					// also possible to get the columns via the column number
					// which starts at 1
					// e.g., resultSet.getSTring(2);
					String student_last = resultSet.getString(4);
					String student_first = resultSet.getString(5);
					System.out.println(student_last + " , " + student_first);
				}
			}
		}

		public void getFinalCourseNoteStudent(ResultSet resultSet)
				throws SQLException {
			if (resultSet.next()) {
				//print the firts line
				System.out.println("Results ------ Query 5");
				String student_first = resultSet.getString(1);
				String student_last = resultSet.getString(2);
				System.out.println("Student: " + student_last + " , "
						+ student_first);
				System.out.println("Course: " + resultSet.getString(3));
				System.out.println("Final Note: " + resultSet.getInt(4));
				while (resultSet.next()) {
					// it is possible to get the columns via name
					// also possible to get the columns via the column number
					// which starts at 1
					// e.g., resultSet.getSTring(2);
					student_last = resultSet.getString(1);
					student_first = resultSet.getString(2);
					String name_course = resultSet.getString(3);
					int final_note = resultSet.getInt(4);
					System.out.println("Course: " + name_course);
					System.out.println("Final Note: " + final_note);
				}
			}
		}
		
		public void getCourseResults(ResultSet resultSet, int total_student_in_course)
				throws SQLException {
			if (resultSet.next()) {
				//print the firts line
				System.out.println("Results ------ Query 6");
				String name_course = resultSet.getString(2);
				int total = resultSet.getInt(3);
				System.out.println("Course: " + name_course);
				System.out.println("Student passed: " + total);
				System.out.println("Student failed: " + (total_student_in_course - total));
				}
			}
		
		public void getTeacherSchedule(ResultSet resultSet)
				throws SQLException {
			if (resultSet.next()) {
				//print the firts line
				System.out.println("Results ------ Query 7");
				String teacher_first = resultSet.getString(3);
				String teacher_last = resultSet.getString(2);
				System.out.println("Teacher: " + teacher_last + " , "
						+ teacher_first);
				System.out.println(resultSet.getString(4) + "  " + resultSet.getString(5) + "  "
						+ resultSet.getString(6) + "  " + resultSet.getString(7));
				while (resultSet.next()) {
					// it is possible to get the columns via name
					// also possible to get the columns via the column number
					// which starts at 1
					// e.g., resultSet.getSTring(2);
					System.out.println(resultSet.getString(4) + "  " + resultSet.getString(5) + "  "
							+ resultSet.getString(6) + "  " + resultSet.getString(7));
				}
			}
		}

		// public void closeDatabase() throws Exception { try { close(); } catch
		// (Exception e) { throw e; } }

		public void close(ResultSet resultSet, Statement statement,
				Connection connect) throws SQLException {
			resultSet.close();
			statement.close();
			connect.close();
		}
}
