package guru.springframework.sfgdi.services;

public class I18nChineseGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "世界你好 - CN";
    }
}
