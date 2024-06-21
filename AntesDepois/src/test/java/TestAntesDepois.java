import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAntesDepois {
    @BeforeEach
    public void beforeEach(){
        System.out.println("@Before");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("@After");
    }

    @Test
    public void test1(){
        System.out.println("Teste 1");
    }

    @Test
    public void test2(){
        System.out.println("Teste 2");
    }

    @Test
    public void test3(){
        System.out.println("Teste 3");
    }
}
