package service;

import java.util.List;

import dao.AdmViewDao;
import dao.AdminDao;
import dao.AdminDaoDBImpl;
import dao.UserDao;
import dao.UserDaoImpl;
import dao.admViewDaoImpl;
import exception.EmptyCatelogException;
import exception.SystemException;
import model.AdminPojo;
import model.AdminViewPojo;
import model.UserPojoo;

public class AdminViewServiceImpl implements AdminViewService{

	
	UserDao userDao;
	AdminDao adminDao;
	AdmViewDao adminVDao;
	public AdminViewServiceImpl() {
		adminDao= new AdminDaoDBImpl();
		userDao=  new UserDaoImpl();
		adminVDao= new admViewDaoImpl();
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public List<AdminViewPojo> getAllUsers() throws SystemException {
		return adminVDao.getAllUsers();
	}

	@Override
	public AdminPojo addBook(AdminPojo adminPojo) throws SystemException {
		return adminDao.addBook(adminPojo);
	}

	@Override
	public AdminPojo updateBook(AdminPojo adminPojo) throws SystemException {
		return adminDao.updateBook(adminPojo);
	}

	@Override
	public void deleteBook(int bookId) throws SystemException {
		adminDao.deleteBook(bookId);
		
	}

	@Override
	public List<AdminPojo> getAllBooks() throws EmptyCatelogException, SystemException {
		return adminDao.getAllBooks();
	}

	@Override
	public AdminPojo getABook(int bookId) throws SystemException {
		return adminDao.getABook(bookId);
	}

}
