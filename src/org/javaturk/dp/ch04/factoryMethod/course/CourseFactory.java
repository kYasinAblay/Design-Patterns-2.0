
package org.javaturk.dp.ch04.factoryMethod.course;

public interface CourseFactory {
	Course createCourse();
	ClassRoom createClassRoom();
	Professor createProfessor();
	Time createTime();
}
