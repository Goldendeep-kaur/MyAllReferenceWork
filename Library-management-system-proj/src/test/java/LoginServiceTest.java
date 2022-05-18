import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import Pojo.UserPojoo;
import dao.UserDao;
import exception.SystemException;
import service.UserService;
import service.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
public class LoginServiceTest {

	@Mock
	private UserDao daoMock;
	
	@InjectMocks
	private UserService service=new UserServiceImpl();
	
	@Test
	public void testValidate() {
		UserService loginService= new UserServiceImpl();
		UserPojoo expectedPojo= new UserPojoo(8,"Goldendeep","kaur","kaurgold","admin@","Admin");
		UserPojoo actualPojo=null;
		try {
			actualPojo= loginService.validateLogin(expectedPojo);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expectedPojo,actualPojo);
	}
}
