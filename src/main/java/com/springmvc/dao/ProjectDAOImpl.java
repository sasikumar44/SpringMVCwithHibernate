package com.springmvc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.model.Project;

@Repository
public class ProjectDAOImpl implements ProjectDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(project);
		
	}

	@SuppressWarnings("unchecked")
	public List<Project> getAllProjects() {
		return sessionFactory.getCurrentSession().createQuery("from Project")
				.list();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProject(Integer projectId) {
		Project project = (Project) sessionFactory.getCurrentSession().load(
				Project.class, projectId);
		if (null != project) {
			this.sessionFactory.getCurrentSession().delete(project);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public Project updateProject(Project project) {
		// TODO Auto-generated method stub
		
		sessionFactory.getCurrentSession().update(project);
		return project;
	}

	@Override
	public Project getProject(int proid) {
		// TODO Auto-generated method stub
		return (Project) sessionFactory.getCurrentSession().get(
				Project.class, proid);
	}


}




