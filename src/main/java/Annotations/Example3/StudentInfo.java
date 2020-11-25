package Annotations.Example3;

import java.lang.annotation.*;

public interface StudentInfo {

    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE) // works on class level
    public @interface StudentInfor {
        int studentAge();
        String studentName();
    }


}
