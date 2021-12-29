package cn.guardwhy_01;

import org.junit.*;

/**
Junit是什么
     * Junit是Java语言编写的第三方单元测试框架(工具类)
     * Junit框架的方案可以帮助我们方便且快速的测试我们的代码的正确性。

单元测试概念
     * 单元：在Java中，一个类就是一个单元
     * 单元测试：程序猿用Junit编写的一小段代码，用来对某个类中的某个方法进行功能测试或业务逻辑测试。

Junit单元测试框架的作用
     * 用来对类中的方法功能进行有目的的测试，以保证程序的正确性和稳定性。
     * 能够独立的测试某个方法或者所有方法的预期正确性。

Junit框架的使用步骤:
 （1）下载这个框架。框架一般是jar包的形式，jar包里面都是class文件。class文件就是我们调用的核心代码。
 （2）直接用Junit测试代码即可

b.写测试类
     测试类的命名规范：以Test开头，以业务类类名结尾，使用驼峰命名法
     业务名称是：UserService,测试这个业务类的测试类：TestUserService
c.在测试类中写测试方法
     测试方法的命名规则：以test开头，以业务方法名结尾
     比如被测试业务方法名为：login，那么测试方法名就应该叫：testLogin

d.测试方法注意事项
    必须是public修饰的，没有返回值，没有参数必须使注解@Test修饰

如何运行测试方法
     *选中方法名 --> 右键 --> Run '测试方法名'  运行选中的测试方法
     *选中测试类类名 --> 右键 --> Run '测试类类名'  运行测试类中所有测试方法
     *选中模块名 --> 右键 --> Run 'All Tests'  运行模块中的所有测试类的所有测试方法

如何查看测试结果
     *绿色：表示测试通过
     *红色：表示测试失败，有问题

Junit常用注解(Junit4.xxxx版本)
     * @Test 测试方法！
     * @Before：用来修饰实例方法，该方法会在每一个测试方法执行之前执行一次。
     * @After：用来修饰实例方法，该方法会在每一个测试方法执行之后执行一次。
     * @BeforeClass：用来静态修饰方法，该方法会在所有测试方法之前只执行一次。
     * @AfterClass：用来静态修饰方法，该方法会在所有测试方法之后只执行一次。

初始化资源：开始执行的方法。
释放资源：执行完之后的方法。

Junit常用注解(Junit5.xxxx版本)
     * @Test 测试方法！
     * @BeforeEach：用来修饰实例方法，该方法会在每一个测试方法执行之前执行一次。
     * @AfterEach：用来修饰实例方法，该方法会在每一个测试方法执行之后执行一次。
     * @BeforeAll：用来静态修饰方法，该方法会在所有测试方法之前只执行一次。
     * @AfterAll：用来静态修饰方法，该方法会在所有测试方法之后只执行一次。
 */
public class TestUserService {
    private static  UserService userService;
    // 测试方法
    @Before // 修饰实例方法。在每个单元测试方法执行之前执行一次
    public void before(){

        System.out.println("----before执行-----");
    }

    @After // 修饰实例方法。在每个单元测试方法执行之后执行一次
    public void after(){
        System.out.println("----after执行-----");
    }

    @BeforeClass // 修饰静态方法。在每个单元测试方法执行之前执行一次
    public static void beforeClass(){
        userService = new UserService();
        System.out.println("----beforeClass执行-----");
    }

    @AfterClass // 修饰静态方法。在每个单元测试方法执行之后执行一次
    public static void afterClass(){
        System.out.println("----afterClass执行-----");
    }
    /**
     * 测试方法注意事项
     必须是public修饰的，没有返回值，没有参数
     必须使注解@Test修饰
     */
    @Test
    public void testLogin(){
        // UserService userService = new UserService();
        String rs = userService.login("admin", "003197");
        /**
         * 参数一：期望值与真实结果不一样的时候爆出的错误提示
         * 参数二：期望值
         * 参数三：真实结果值（实际结果）
         */
        Assert.assertEquals("期望值和实际值不一致.方法出了问题","success",rs);
    }

    @Test
    public void testChu(){
        // UserService userService = new UserService();
        userService.chu();
    }
}
