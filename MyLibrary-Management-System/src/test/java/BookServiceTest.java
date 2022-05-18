import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import Pojo.BooksPojo;
import dao.BooksDao;
import exception.SystemException;
import service.BookService;
import service.BookServiceImpl;

public class BookServiceTest {

	@Mock
	private BooksDao daoMock;
	
	@InjectMocks
	private BookService service= new BookServiceImpl();
	
	@Test
	public void testGetABook() {
		BookService bookService= new BookServiceImpl();
		
		BooksPojo expectedPojo= new BooksPojo(23,4517,"Education","World",8,"");
		BooksPojo actualPojo=null;
		try {
			actualPojo=bookService.getABook(23);
		} catch (SystemException e) {
			
			e.printStackTrace();
		}
		assertEquals(expectedPojo,actualPojo);
	}
	

	
}
