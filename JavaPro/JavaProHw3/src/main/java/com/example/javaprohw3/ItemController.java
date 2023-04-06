package com.example.javaprohw3;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ItemController {
    private Map<Integer, String> items = new HashMap<>();

    {
        items.put(0, "Wise men speak because they have something to say fools because they have to say something.");
        items.put(1, "Chop your own wood and it will warm you twice.");
        items.put(2, "Life is far too important a thing ever to talk seriously about.");
        items.put(3, "Keep smiling, because life is a beautiful thing and there's so much to smile about");
        items.put(4, "Life is a series of choices.");
        items.put(5, "The purpose of life is to live correctly, think correctly, and act correctly.");
        items.put(6, "The first thing you learn in life is you're a fool. The last thing you learn in life is you're the same fool. ");
        items.put(7, "In the middle of difficulty lies opportunity.");
        items.put(8, "And if you gaze long into an abyss, the abyss also gazes into you. ");
        items.put(9, "My mom always said life was like a box of chocolates. You never know what you're gonna get.");
        items.put(10, "Chop your own wood and it will warm you twice.");
    }

    private Integer id = items.size();

    @GetMapping("/items")

    public Map<Integer, String> getItems() {
        return items;
    }

    @GetMapping("/item/{id}")
    public String getItem(@PathVariable Integer id) {
        if (!items.containsKey(id)) {
            return "item not found";
        }
        return items.get(id);
    }

    @PostMapping("/item")
    public Integer postItem(@RequestBody @Validated Item postItem) {
        items.put(id++, postItem.getItem());
        return id - 1;
    }



    @PostMapping("/items")
    public List<Integer> postItems(@RequestBody  Item[] item) {
        List<Integer> result = new ArrayList<>();
        Arrays.stream(item).forEach(it -> {
            items.put(id++, it.getItem());
            result.add(id);
        });



        return result;

    }

  @PutMapping("/item")
    public ResponseEntity <Boolean> updateItem(@RequestBody @Validated Item item){
      items.put(Integer.valueOf(item.getId()), item.getItem());
      if (items.get(Integer.valueOf(item.getId())).equals(item.getItem())) {
          return ResponseEntity.ok(true);
      }
      return ResponseEntity.ok(false);
  }

  @DeleteMapping("/item/{id}")
    public  ResponseEntity<Boolean> deleteItem(@PathVariable Integer id){
      items.remove(id);
      return ResponseEntity.ok(true);
  }





}

/*

Домашнее задание:
 1. Сделать все операции для цитат(прочитать все, прочитать по ид, добавить одну, добавить множество, обновить, удалить).
 2. Создать html файл в папочке static. Создать новій контроллер и предоставить доступ клиенту к html.
 3. Настроить валидацию:
 3.1 Добавить зависимость в pom.xml.
 3.2. Добавить @Validated аннотацию параметру контроллера
 3.3 Добавить валидационное правило модели.
 3.4 Добавить настроечку в application.properties чтобі біло відно сообщение ошибки в ответе:
server.error.include-message=always





 */