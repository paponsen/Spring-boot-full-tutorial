package com.example.game2play.springtutorial;

import com.example.game2play.springtutorial.dao.StudentDao;
import com.example.game2play.springtutorial.dao.StudentDaoImpl;
import com.example.game2play.springtutorial.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication(scanBasePackages = {"com.example.game2play.springtutorial",
		"com.example.game2play.util"})
public class SpringtutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringtutorialApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner->{
			System.out.println("Hello command line runner");
			//createStudent(studentDao);
			//getStudent(studentDao, 1);
			//getAllStudent(studentDao);
			//getByLastName(studentDao, "sen");
			//update(studentDao);
			deleteByLastName(studentDao, "Sen");
		};
	}

	public void createStudent(StudentDao studentDao){

		System.out.println("Creating new student object........");
		Student theStudent = new Student("Papon", "Sen", "papon@gmail.com");
		System.out.println("Saving the student....");
		studentDao.save(theStudent);
		System.out.println("Student is saved successfully. Id is:"+theStudent.getId());
	}

	public void getStudent(StudentDao studentDao, int id){
		Student student = studentDao.findById(id);
		System.out.println(student.toString());
	}

	public void getAllStudent(StudentDao studentDao){
		List<Student> listStudent = studentDao.findAll();
		for(Student student:listStudent){
			System.out.println(student.toString());
		}
	}

	public void getByLastName(StudentDao studentDao, String lastName){
		List<Student> studentList = studentDao.findByLastName(lastName);
		for(Student student:studentList){
			System.out.println(student.getFirstName()+" "+student.getLastName());
		}

	}

	public void update(StudentDao studentDao){
		Student student = studentDao.findById(2);
		student.setLastName("shil");
		studentDao.update(student);
		System.out.println("update is successfull!!!");
	}

	public void deleteByLastName(StudentDao studentDao, String lastName){
		studentDao.deleteByLastName(lastName);
		System.out.println("Deleted SuccessDully!!!");
	}

}
