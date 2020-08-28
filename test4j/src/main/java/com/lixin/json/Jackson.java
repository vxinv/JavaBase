package com.lixin.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.lixin.json.pojo.Cat;
import com.lixin.json.pojo.Money;
import com.lixin.json.pojo.Person;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

public class Jackson {

    Person person;

    @Before
    public void init(){
        person = new Person<Money>();
        person.setAge(12);
        person.setName("lixin");
        ArrayList<Cat> cats = new ArrayList<>();
        Cat cat1 = new Cat("cat1",3,"black");
        Cat cat2 = new Cat("cat2",3,"red");
        Cat cat3 = new Cat("cat3",3,"white");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        Money money = new Money(10);
        person.setOther(money);
        person.setCats(cats);
    }

    @Test
    public void testSerialization() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(person);
        System.out.println(s);

    }

    /**
     * 测试结论
     * @throws IOException
     */
    @Test
    public void testDeserialization() throws IOException {
        String pm = "{\"name\":\"lixin\",\"age\":12,\"unHaveInt\":0,\"unHaveString\":\"hello\",\"cats\":[{\"name\":\"cat1\",\"age\":3,\"color\":\"black\"},{\"name\":\"cat2\",\"age\":3,\"color\":\"red\"},{\"name\":\"cat3\",\"age\":3,\"color\":\"white\"}],\"other\":{\"value\":10}}";

        String json = "{\"name\":\"lixin\",\"age12\":12,\"age\":12,\"cats\":[{\"name\":\"cat1\",\"age\":3,\"color\":\"black\"},{\"name\":\"cat2\",\"name2\":\"cat2\",\"age\":3,\"color\":\"red\"},{\"name\":\"cat3\",\"age\":3,\"color\":\"white\"}]}";
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);

        Person<Money> person = objectMapper.readValue(pm, new TypeReference<Person<Money>>(){});

        person.getOther().cost(3);
        System.out.println(person.toString());
    }

    /**
     * 测试jsonNode
     */

    @Test
    public void testJsonNode() throws IOException {

        String pm = "{\"name\":\"lixin\",\"age\":12,\"unHaveInt\":0,\"unHaveString\":\"hello\",\"cats\":[{\"name\":\"cat1\",\"age\":3,\"color\":\"black\"},{\"name\":\"cat2\",\"age\":3,\"color\":\"red\"},{\"name\":\"cat3\",\"age\":3,\"color\":\"white\"}],\"other\":{\"value\":10}}";

        String json = "{\"name\":\"lixin\",\"age12\":12,\"age\":12,\"cats\":[{\"name\":\"cat1\",\"age\":3,\"color\":\"black\"},{\"name\":\"cat2\",\"name2\":\"cat2\",\"age\":3,\"color\":\"red\"},{\"name\":\"cat3\",\"age\":3,\"color\":\"white\"}]}";
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);

        ObjectNode on = objectMapper.readValue(json, ObjectNode.class);
        on.put("jsonObject","test");

        String s = objectMapper.writeValueAsString(on);
        System.out.println(s);


    }

}

