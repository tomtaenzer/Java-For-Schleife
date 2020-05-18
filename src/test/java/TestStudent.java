import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStudent {

    @Test
    public void WhichStudent(){
        //Given
        String name = null;

        // When
        Student Student1 = new Student();
        String result = Student1.getName();

        // Then
        assertEquals(name, result);


    }

}
