package ru.liga;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.liga.model.Anketa;
import ru.liga.repository.AnketaRepository;
import ru.liga.repository.impl.AnketaImpl;

import java.util.List;

public class AppTest 
{  @Autowired
 AnketaImpl anketaImpl;
/*    @Test
    void saveTestWithNullOrZeroId() {
        Anketa object = new Anketa();
        object.setPerson_name("АХАХАХ");

        var savedObject = anketaImpl.save(object);
        assertThat(savedObject).isNotNull();
        assertThat(savedObject.getId()).isNotNull();
    }*/
/*    @Test
    public void countTest()
    {
        AnketaImpl anketaImpl = new AnketaImpl();
        System.out.println(anketaImpl.countRate());
    }*/
/*    @Test
    public void shouldAnswerWithTrue()
    {
        List<Anketa> all = anketaRepository.findPeople("all");
        all.forEach(System.out::println);
    }*/
}
