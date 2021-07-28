package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

public class LocalizationServiceTest {
    @Test
    public void testLocalizationService() {
       LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
       Country country = Country.RUSSIA;

       String actual = localizationService.locale(country);

       String expected = "Добро пожаловать";

       Assertions.assertEquals(expected, actual);
    }
}
