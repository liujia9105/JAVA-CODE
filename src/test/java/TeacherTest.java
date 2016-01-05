import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by liujia on 1/5/16.
 */
public class TeacherTest {
    @Test
    public void should_introduce_teacher_name_age_and_class(){
        String name="Tom";
        int age=21;
        int klass=2;
        Teacher teacher=new Teacher(name,age,klass);
        assertThat(teacher.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2."));
    }
    @Test
    public void should_introduce_teacher_when_klass_is_null(){
        String name="Tom";
        int age=21;
        Teacher teacher=new Teacher(name,age);
        assertThat(teacher.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach No Class."));
    }
}