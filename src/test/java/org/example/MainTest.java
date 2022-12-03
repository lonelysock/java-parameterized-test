package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


// Напиши аннотацию для параметризованных тестов
@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) { // Инициализируй поля класса в конструкторе
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters // Пометь метод аннотацией для параметров
    public static Object[][] getTextData() {
        return new Object[][]
                {
                        {17, false},
                        {18, true},
                        {19, true},
                        {21, true}
                };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        //int age =
        boolean isAdult = program.checkIsAdult(age);
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals("Что-то не в порядке", result,isAdult);
    }
}