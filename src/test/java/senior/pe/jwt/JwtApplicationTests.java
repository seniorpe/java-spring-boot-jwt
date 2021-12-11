/*
 * package senior.pe.jwt;
 * 
 * import static org.junitAssert.assertEquals; import static
 * org.mockito.ArgumentMatchers.any; import static
 * org.mockito.ArgumentMatchers.anyString; import static
 * org.mockito.MockitoAnnotations.initMocks;
 * 
 * import org.aspectj.lang.annotation.Before; import org.junit.jupiter.api.Test;
 * import org.mockito.Mock; import org.mockito.Mockito; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * 
 * import senior.pe.jwt.entities.User; import
 * senior.pe.jwt.repositories.RoleRepository; import
 * senior.pe.jwt.repositories.UserRepository; import
 * senior.pe.jwt.services.UserService;
 * 
 * @SpringBootTest public class JwtApplicationTests {
 * 
 * @Mock private UserRepository mockUserRepository;
 * 
 * @Mock private RoleRepository mockRoleRepository;
 * 
 * @Mock private BCryptPasswordEncoder mockBCryptPasswordEncoder;
 * 
 * private UserService userServiceUnderTest; private User user;
 * 
 * @Before public void setUp() { initMocks(this); userServiceUnderTest = new
 * UserService(mockUserRepository, mockRoleRepository,
 * mockBCryptPasswordEncoder); user =
 * User.builder().id(1).name("Gustavo").lastName("Ponce").email("test@test.com")
 * .build();
 * 
 * Mockito.when(mockUserRepository.save(any())).thenReturn(user);
 * Mockito.when(mockUserRepository.findByEmail(anyString())).thenReturn(user); }
 * 
 * @Test public void testFindUserByEmail() { // Setup final String email =
 * "test@test.com";
 * 
 * // Run the test final User result =
 * userServiceUnderTest.findUserByEmail(email);
 * 
 * // Verify the results assertEquals(email, result.getEmail()); }
 * 
 * @Test public void testSaveUser() { // Setup final String email =
 * "test@test.com";
 * 
 * // Run the test User result =
 * userServiceUnderTest.saveUser(User.builder().build());
 * 
 * // Verify the results assertEquals(email, result.getEmail()); } }
 */