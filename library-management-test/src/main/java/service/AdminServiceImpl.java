package service;

import java.util.List;

import dao.AdminDao;
import dao.AdminDaoDBImpl;
import exception.EmptyCatelogException;
import exception.SystemException;
import model.AdminPojo;

public class AdminServiceImpl implements AdminService {

	AdminDao adminDao;
	
	
	public AdminServiceImpl() {
		
		adminDao= new AdminDaoDBImpl();
	}

	public AdminDao getAdminDao() {
		return adminDao;
	}
	
	public void setAdminDao() {
		this.adminDao =adminDao;
	}
	public AdminPojo addBook(AdminPojo adminPojo) throws SystemException {
		return adminDao.addBook(adminPojo);
	}

	public AdminPojo updateBook(AdminPojo adminPojo) throws SystemException {
		return adminDao.updateBook(adminPojo);
	}

	public void deleteBook(int bookId) throws SystemException {
		adminDao.deleteBook(bookId);
		
	}

	public List<AdminPojo> getAllBooks() throws EmptyCatelogException, SystemException {
		return adminDao.getAllBooks();
		}

	public AdminPojo getABook(int bookId) throws SystemException {
		return adminDao.getABook(bookId);
	}

	
}
