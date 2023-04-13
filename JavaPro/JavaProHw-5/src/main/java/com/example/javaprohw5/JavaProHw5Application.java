package com.example.javaprohw5;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JavaProHw5Application {

    public static void main(String[] args) {


         var context =SpringApplication.run(JavaProHw5Application.class, args);
         var bean =context.getBean("@bean");
         var bean1 =context.getBean(Message.class);
         var bean2 =context.getBean(MyService.class);
         var bean3 =context.getBean(MyController.class);
         var bean4 =context.getBean(MyRepo.class);



    }



}


/*

. Создать разніе біні с помощью каждой из аннотаций: @Bean, @Component, @Controller, @Repository, @Service.
 Получить к ним доступ через контекст.
. Подстроить конфликт имен и запомнить характерную ошибку.
. Разрешить конфликт имен с помощью явного указания имени одного из бинов.
. Логгировать(System.out.println()) создание всех созданніх бінов на єтапе @PostConstruct.
 */