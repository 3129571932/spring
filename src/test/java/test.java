import com.hxc.demo.service.PersonService;
import com.hxc.demo.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class test {

    @Resource
    private PersonService personService ;

    @Test
    public void test01(){

        personService.insertIntoPerson(new Person(1,"dhg"));

    }

}
