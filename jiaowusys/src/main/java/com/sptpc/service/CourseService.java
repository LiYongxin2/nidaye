package com.sptpc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sptpc.domain.Course;
import com.sptpc.domain.Student;
import com.sptpc.persistence.CourseMapper;


@Service
public class CourseService {
	@Autowired
	private CourseMapper courseMapper;
	//得到所有的课程信息
	public List<Course> getAllCourse(){		
		return courseMapper.findAllCourse();
	}
}
