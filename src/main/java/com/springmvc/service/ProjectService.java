package com.springmvc.service;
//package com.jwt.service;

import java.util.List;

import com.springmvc.model.Project;



//import com.jwt.model.Employee;

public interface ProjectService {
	
	public void addProject(Project project);

	public List<Project> getAllProjects();

	public void deleteProject(Integer projectId);

	public Project getProject(int projectid);

	public Project updateProject(Project project);
}
