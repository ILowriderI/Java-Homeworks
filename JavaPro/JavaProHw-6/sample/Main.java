package sample;


import java.util.Hashtable;

@ComponentScan(value = "sample")
@Configuration
public class Main {

    @Component
    @Bean
    @Autowired

    public static void main(String[] args) {

        Context context = new Context();
        Hashtable beans = context.getBean();

        System.out.println(beans);

    }
}
