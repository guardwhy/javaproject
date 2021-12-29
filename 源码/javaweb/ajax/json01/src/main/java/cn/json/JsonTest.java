package cn.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class JsonTest {
    // 创建Mapper对象
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void test01() throws Exception {
        // 对象转json
        User user1 = new User("curry", 10);
        String json = mapper.writeValueAsString(user1);
        System.out.println("user字符串:" + json);

        // json转对象
        User user2 = mapper.readValue(json, User.class);
        System.out.println("user对象:" + user2);
    }

    @Test
    public void test02() throws Exception{
        // Map转json
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("用户名", "curry");
        map1.put("性别","男");
        String json = mapper.writeValueAsString(map1);
        System.out.println("user字符串：" + json);

        // json转map
        HashMap<String, String> map2 = mapper.readValue(json, HashMap.class);
        System.out.println("user对象:" +map2);
    }

    @Test
    public void test03() throws Exception{
        // Map转json
        HashMap<String, User> map1 = new HashMap<>();
        map1.put("东部联盟", new User("curry", 10));
        map1.put("西部联盟", new User("字母哥", 29));
        String json = mapper.writeValueAsString(map1);
        System.out.println("user字符串：" + json);

        // json转map
        HashMap<String, User> map2 = mapper.readValue(json, new TypeReference<HashMap<String, User>>(){});
        System.out.println("user对象:" +map2);
    }

    @Test
    public void test04() throws Exception{
        // List转json
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("curry");
        list1.add("james");
        String json = mapper.writeValueAsString(list1);
        System.out.println("user字符串:" + json);

        // json转List<String>
        ArrayList<String> list2 = mapper.readValue(json, ArrayList.class);
        System.out.println("user对象:" +list2);
    }

    @Test
    public void test05() throws Exception{
        // List转json
        ArrayList<User> list1 = new ArrayList<>();
        list1.add(new User("curry", 10));
        list1.add(new User("字母哥", 10));
        String json = mapper.writeValueAsString(list1);
        System.out.println("user字符串:" + json);

        // json转List<String>
        ArrayList<User> list2 = mapper.readValue(json, new TypeReference<ArrayList<User>>() {});
        System.out.println("user对象:" +list2);
    }
}
