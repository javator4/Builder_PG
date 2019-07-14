package pl.sda.builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user = new User.Builder()
                .lastname("TEST")
                .active(true)
                .name("TEST2")
                .city("Katowice")
                .password("Abrakadabra")
                .postalCode("41-100")
                .build();
        System.out.println(user);
    }
}
