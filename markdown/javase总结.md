## 第1章Java概述

### 1.1 什么是程序

程序：计算机执行某些操作或解决某个问题而编写的一系列有序指令的集合。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211105214111.png" style="zoom:80%;" />	

### 1.2 Java 简介

`Java` 是由 `Sun Microsystems` 公司于 1995 年 5 月推出的`Java` 面向对象程序设计语言和` Java `平台的总称。由 `James Gosling`和同事们共同研发，并在 1995 年正式推出。后来 `Sun` 公司被` Oracle` （甲骨文）公司收购，`Java` 也随之成为` Oracle` 公司的产品。

Java分为三个体系：

- `JavaSE(J2SE)`：(`Java2 Platform Standard Edition`，`java`平台标准版）
- `JavaEE(J2EE)`：(`Java 2 Platform,Enterprise Edition`，`java`平台企业版)
- `JavaME(J2ME)`: (`Java 2 Platform Micro Edition`，`java`平台微型版)。

2005 年 6 月，`JavaOne` 大会召开，`SUN` 公司公开 `Java SE 6`。`Java` 的各种版本已经更名，以取消其中的数字` "2"`：`J2EE` 更名为 `Java EE`，`J2SE` 更名为`Java SE`，`J2ME` 更名为 `Java ME`。

### 1.3 Java 重要特点

-  `Java` 语言是面向对象的`(oop)`

- `Java` 语言是健壮的，`Java` 的强类型机制、异常处理、垃圾的自动收集等是` Java` 程序健壮性的重要保证。

- `Java` 语言是跨平台性的，即: 一个编译好的`.class` 文件可以在多个系统下运行，这种特性称为跨平台。

  ![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210822103933.png)	

- Java 语言是解释型的，解释性语言：`javascript,PHP, java `，编译性语言: `c / c++`。区别是：解释性语言，编译后的代码，不能直接被机器执行,需要解释器来执行, 编译性语言, 编译后的代码, 可以直接被机器执行, `c /c++`。

### 1.4 Java 的开发工具

Java 语言尽量保证系统内存在`1G` 以上，其他工具如下所示：

- `Linux` 系统、`Mac OS` 系统、`Windows 95/98/2000/XP`，`WIN 7/8`系统。
- [Java JDK 7、8……](http://www.oracle.com/technetwork/cn/java/javase/downloads/index.html)
- [vscode](https://code.visualstudio.com/) 编辑器或者其他编辑器。
- `IDE`：[Eclipse](http://www.eclipse.org/downloads/)、 [IntelliJ IDEA](https://www.jetbrains.com/idea/)。

安装好以上的工具后，就可以输出Java的第一个程序 "Hello World"

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

### 1.5 Java 运行机制及运行过程

1、`Java`语言的特点：跨平台性

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210822105408.png" style="zoom: 50%;" />

2、Java 核心机制`-Java` 虚拟机 `[JVM java virtual machine]`

- `JVM` 是一个虚拟的计算机，具有指令集并使用不同的存储区域。负责执行指令，管理数据、内存、寄存器，包含在`JDK` 中。
- 对于不同的平台，有不同的虚拟机。
- `Java` 虚拟机机制屏蔽了底层运行平台的差别，实现了“==一次编译，到处运行==” 。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210822105730.png" style="zoom:67%;" />

### 1.6 什么是JDK, JRE

#### 1.6.1 JDK 基本介绍

- JDK 的全称(Java Development Kit Java 开发工具包)，JDK = JRE + java 的开发工具 [java, javac,javadoc,javap 等]
- JDK 是提供给 Java 开发人员使用的，其中包含了 java 的开发工具，也包括了 JRE。所以安装了 JDK，就不用在单独安装 JRE 了。

#### 1.6.2 JRE 基本介绍

- JRE(`Java Runtime Environment Java`运行环境)，JRE = JVM + Java 的核心类库[类]。
- 包括 Java 虚拟机(`JVM Java Virtual Machine`)和 Java 程序所需的核心类库等，如果想要运行一个开发好的 Java 程序，计算机中只需要安装 JRE 即可。

#### 1.6.3 JDK JRE 和 JVM 的包含关系

- `JDK = JRE` +  开发工具集（例如 `Javac,java` 编译工具等)。
- `JRE = JVM + Java SE ` 标准类库（`java` 核心类库)。
- 如果只想运行开发好的 `.class` 文件 只需要 JRE。

#### 1.6.4 下载、安装 JDK

1、**下载jdk地址**:[https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210822121127.png)

2、**配置步骤**

==1、此电脑--->属性--->高级系统==

![](https://img-blog.csdnimg.cn/img_convert/efba474a788e3e65d95860ff5e2d6720.png)

==2、新建系统变量==

	变量名：JAVA_HOME   
	
	变量值：JDK的安装目录（到bin目录的上一层）

![](https://img-blog.csdnimg.cn/img_convert/ef9af03a04bca73402bd7dee0f4e5680.png)	


==3、将   %JAVA_HOME%\bin   添加到Path变量中。   %环境变量名% 引用某指定的环境变量==

![](https://img-blog.csdnimg.cn/img_convert/f4948ddf86ff3e3acede92e788b3dd93.png)	


==4、打开DOS系统，输入javac，验证是否配置成功。==

![](https://img-blog.csdnimg.cn/img_convert/95046b9cd8901d10e583d6f2a6b8b7db.png)	

5、查看jdk的版本

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210822122536.png)

###  1.7 Java 快速入门

#### 1.7.1 开发步骤

- 基本要求: 要求开发一个 Hello.java 程序，可以输出` hello,world!`
-  将 Java 代码编写到扩展名为 Hello.java 的文件中。
- 通过 **javac** 命令对该 java 文件进行编译，生成` .class` 文件。
- 通过 **java** 命令对生成的 class 文件进行运行。

#### 1.7.2 运行原理示意图

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210822130031.png)

#### 1.7.3 代码示例

```java
//对代码的相关说明
//1. public class Hello 表示Hello是一个类,是一个public公有的类
//2. Hello{ } 表示一个类的开始和结束
//3. public static void main(String[] args) 表示一个主方法,即程序的入口
//4. main() {} 表示方法的开始和结束
//5. System.out.println("hello,world~"); 表示输出"hello,world~"到屏幕
//6. ;表示语句结束
public class Hello {

	//编写一个main方法
	public static void main(String[] args) {
		System.out.println("hello java");
	}

}
```

运行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210822132843.png)	

#### 1.7.5 Java 开发注意事项和细节

1、Java源文件以`.java`，为扩展名。源文件的基本组成部分是类`(class)`,如本类中的Hello类。

2、Java应用程序的执行入口是main()方法。Java语言严格区分大小写。

3、java方法由一条条语句构成，每个语句以`;`结束！！大括号都是成对出现的，缺一不可。

4、一个源文件中最多只能有一个`public`类，其他类的个数不限。

5、如果源文件中包含一个`public`类，==则文件名必须按照该类名命名==。

6、一个源文件中最多只能有一个`public`类，其他类的个数不限，也可以将`main`方法写在非`public`类中，然后指定运行非`public`类，这样的入口方法就是非`public`的`main`方法。

###  1.8 Java 转义字符

#### 1.8.1常用的转义字符

在控制台，输入 tab 键，可以实现命令补全

| 转义字符 | 具体作用                   |
| -------- | -------------------------- |
| `\t`     | 一个制表位，实现对齐的功能 |
| `\n`     | 换行符                     |
| `\\`     | 表示一个\                  |
| `\"`     | 表示一个"                  |
| `\'`     | 表示一个'                  |
| `\r`     | 表示一个回车               |

代码示例

```java
package cn.guardwny.demo01;
// 1、添加转义字符
public class ChangeChar {
    public static void main(String[] args) {
        // 1.1 \t:一个制表位，实现对齐的功能
        System.out.println("kobe\tjames\tcurry");
        // 1.2 \n:换行符
        System.out.println("kobe\njames\ncurry");
        // 1.3 输出一个\
        System.out.println("C:\\Windows\\System32\\cmd.exe");
        // 1.4 \r: 表示回车
        System.out.println("中山大学\r 广州");
    }
}
```

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210819174506.png" style="zoom:80%;" />

### 1.9 注释(comment)

用于注解说明解释程序的文字就是注释，注释提高了代码的阅读性(可读性)。

注释是一个程序员必须要具有的良好编程习惯，将自己的思想通过注释先整理出来，再用代码去体现。

####  1.9.1 Java 中的注释类型

- 单行注释 `//`
- 多行注释 `/* */`
- 文档注释 `/** */`

1、代码示例

```java
public class Comment01 {

	//编写一个main方法
	public static void main(String[] args) {

		//单行注释
		
		//多行注释
		/* 	示意 => 可读性很好
			下面代码完成 两个数相加
			定义变量 

			注释
			注释
			int n1 = 10;... 
			System.out.println("ok~~");
			*/
		int n1 = 10;
		int n2 = 30;
		//求和
		int sum = n1 + n2;
		//输出结果
		System.out.println("结果=" + sum);
	}
}
```

2、文档注释

```java
/**
 * @author  guardwhy
 * @version  1.0
 */
public class Comment02 { 

	//编写一个main方法
	public static void main(String[] args) {
		System.out.println("hello java");
	}
}
```

3、生成文档命令: `javadoc -d 文件夹名 -xx -yy z.java`

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210822152013.png" style="zoom:67%;" />

4、打开文档文件

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210822163122.png" style="zoom: 80%;" />

## 第2章 Java变量

### 2.1 变(变化)量(值)的介绍

#### 2.1.1 基本概念

变量是程序的基本组成单位，变量相当于内存中一个数据存储空间的表示，你可以把变量看做是一个房间的门牌号，通过 门牌号我们可以找到房
间，而通过变量名可以访问到变量(值)。

#### 2.1.2 变量使用基本步骤

1、代码示例

```java
/**
 * @author  guardwhy
 * @version  1.0
 */
public class Test { 

	//编写一个main方法
	public static void main(String[] args) {
		// 声明变量
        int a;
        // 赋值操作
        a = 60; //应该这么说: 把 60 赋给 a

        //也可以一步到位[int a = 60; 通常是一步完成
        System.out.println(a);  
	}
}
```

2、变量的基本原理

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210822164527.png" style="zoom: 67%;" />

#### 2.1.3 变量使用注意事项

1、变量表示内存中的一个存储区域【不同的变量，类型不同，占用的空间大小不同】。

2、该区域有自己的名称【变量名】和类型【数据类型】。

3、变量必须先声明，后使用变量。该区域的数据/值可以在同一类型范围内不断变化。

4、变量在同一个作用域不能重名，变量=变量名+值+数据类型，变量三要素！！！

#### 2.1.4 程序中+号的使用

1、代码示例

```java
/**
 * @author  guardwhy
 * @version  1.0
 */
public class Test { 

	//编写一个main方法
	public static void main(String[] args) {
		System.out.println(100 + 98); // 198
        System.out.println("100" + 98); // 10098

        System.out.println(100 + 3 + "hello");  // 103hello
        System.out.println("hello" + 100 + 3); // hello1003
	}
}
```

2、小结

1、当左右两边都是数值型时，则做加法运算。

2、当左右两边有一方为字符串，则做拼接运算。运算顺序，是从左到右的。

### 2.2 数据类型

1、每一种数据都定义了明确的数据类型，在内存中分配了不同大小的内存空间(字节)。 java 数据类型分为两大类 ：【基本数据类型， 引用类型】

 2、基本数据类型有 8 中 中 型 数值型【byte , short , int , long , float ,double] char , boolean】。

 3、引用类型 【类，接口, 数组】。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210822210920.png)

### 2.3 整数类型

#### 2.3.1 基本介绍

Java 的整数类型就是用于存放整数值的，比如 12 , 30, 346 等

| 类型      | 占用空间 | 范围                                                         |
| --------- | -------- | ------------------------------------------------------------ |
| **byte**  | 1字节    | byte 数据类型是8位、有符号的，以二进制补码表示的整数。<br/> 最小值是 **-128（-2^7)**， 最大值是 **127（2^7-1)**，默认值是 **0**。 |
| **short** | 2字节    | short 数据类型是 16 位、有符号的以二进制补码表示的整数。<br/>最小值是 **-32768（-2^15), 最大值是 **32767（2^15 - 1)。<br/>**Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一， 默认值是 **0**。 |
| **int**   | 4字节    | int 数据类型是32位、有符号的以二进制补码表示的整数。<br/>最小值是 **-2,147,483,648（-2^31）**； 最大值是 **2,147,483,647（2^31 - 1）**。<br/> 一般地整型变量默认为 int 类型，默认值是 **0** 。 |
| **long**  | 8字节    | long 数据类型是 64 位、有符号的以二进制补码表示的整数。<br/> 最小值是 **-9,223,372,036,854,775,808（-2^63)**, 最大值是 **9,223,372,036,854,775,807（2^63 -1)**。<br/>这种类型主要使用在需要比较大整数的系统上，默认值是 **0L**。 |

#### 2.3.2 整型细节

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210823003637.png)

1、Java各整数类型有固定的范围和字段长度，不受具体`OS`的影响，以保证java程序的可移植性。

2、Java的整体常量默认为`int`类型，声明`long`型常量须后加`l`或者`L`。

3、java程序中变量常常声明为`int`类型，除非不足以表示大数，才使用`long`。

4、`bit`：计算机中的最小存储单位，byte是计算机中基本存储单元，【1byte = 8 bit】。

### 2.4 浮点类型

#### 2.4.1 基本类型

Java 的浮点类型可以表示一个小数，比如 123.4 ，7.8 ，0.12 等。

#### 2.4.2 浮点型的分类

| 类型             | 占用存储空间 | 范围                                                         |
| ---------------- | ------------ | ------------------------------------------------------------ |
| **单精度float**  | 4字节        | float 数据类型是单精度、32位、符合IEEE 754标准的浮点数。<br/> float 在储存大型浮点数组的时候可节省内存空间，默认值是 **0.0f**； |
| **双精度double** | 8字节        | double 数据类型是双精度、64 位、符合 IEEE 754 标准的浮点数。<br/>浮点数的默认类型为 double 类型， double类型同样不能表示精确的值，如货币默认值是 **0.0d**； |

#### 2.4.3 注意事项

1、与整数类型类似，Java浮点类型也有固定的范围和字段长度，不受具体OS的影响。

2、Java的浮点型常量，默认为`double`型，声明`float`型常量，后面须加`f`或者`F`。

### 2.5 字符类型

字符类型可以表示单个字符,字符类型是 char，char 是两个字节(可以存放汉字)，多个字符字符串 String。

#### 2.5.1 字符型使用

1、代码示例

```java
package cn.guardwny.demo02;
/**
 * 字符型使用
 */
public class CharDetail01 {
    public static void main(String[] args) {
        // 1.1 定义变量
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '何';
        char c4 = 97; // 字符类型可以直接存放一个数字

        // 1.2 输出结果
        System.out.println("c1的值:" + c1);	// c1的值:a
        System.out.println("c2的值:" + c2);	// c2的值:
        System.out.println("c3的值:" + c3);	// c3的值:何
        System.out.println("c4的值:" + c4);	// c4的值:a
    }
```

2、注意事项

- 字符常量是用单引号`(' ')`括起来的单个字符。
- Java中还允许使用转义字符`\`来将其后的字符转变为特殊字符型常量。
- 在java中,char的本质是一个整数，在输出时是`unicode`码对应的字符。

#### 1.3.2 字符型细节

1、字符型存储到计算机中，需要将字符对应的码值(整数)找出来。

```java
存储: 'a' ==> 码值97 ==> 二进制(110 0001) ==> 存储
读取: 二进制(110 0001) => 97 ====> 'a' => 显示
```

2、字符和码值的对应关系是通过字符编码表决定的(是规定好的)

代码示例

```java
package cn.guardwny.demo02;
/**
 * 字符型细节
 */
public class CharDetail02 {
    public static void main(String[] args) {
        // 1.1 注意:在java中，char的本质是一个整数，在默认输出时，是unicode码对应的字符。
        char c1 = 97;
        System.out.println("c1的值:" + c1);   // c1的值:a
        // 1.2 要输出对应的数字，可以使用(int)字符转换
        char c2 = 'a';
        System.out.println("c2的值:" + (int)c2); // c2的值:97

        char c3 = '和';
        System.out.println("c3的值:" + (int)c3); // c3的值:21644
        char c4 = 21644;
        System.out.println("c4的值:" + c4);   // c4的值:和

        // 2.1 char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码
        System.out.println("字符a+10的值:" + 'a' + 10); // 字符a+10的值:a10

        char c5 = 'b' + 1;
        System.out.println("c5的值:" + (int)c5);  // c5的值:99
        // 2.2 输出c5对应的ASCII值
        System.out.println("c5对应的值:" + c5); // c5对应的值:c

    }
}
```

#### 1.3.3 字符编码表

1、ASCII：上个世纪60年代，USA制定了一套字符编码(使用一个字节)，对英语字符与二进制之间的关系，做了统一的规定。这套编码称为ASCII码，(ASCII编码表一个字节表示一个128个字符，实际上一个字节可以表示256个字符，只用128个)。

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210823120046.png)

2、Unicode(Unicode 编码表 固定大小的编码，使用两个字节来表示字符，字母和汉字统一都是占用两个字节)，将世界上的所有符号都纳入其中，每个符号都给予一个独一无二的编码，使用`Unicode`没有乱码的问题！！！

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210823122454.png)

3、UTF-8 编码特点

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210823122524.png)

### 2.6 布尔类型

#### 2.6.1 基本概念

1、布尔类型也叫`boolean`类型，`boolean`类型数据只允许取值`true`和`false`,没有`null`。

2、`boolean`类型占用一个字节，`boolean`类型适于逻辑运算，一般用于程序流程控制。

#### 2.6.2 代码示例

```java
package cn.guardwny.demo02;
/**
 * 演示判断成绩是否通过的案例
 */
public class Boolean01 {
    public static void main(String[] args) {
        //定义一个布尔变量
        boolean isPass = true;
        if(isPass == true) {
            System.out.println("考试通过，恭喜");  // 考试通过，恭喜
        } else {
            System.out.println("考试没有通过，下次努力");
        }
    }
}
```

### 2.7 数据类型转换

#### 2.7.1 自动类型转换

当`java`程序进行赋值或者运算时，精度小的类型自动转换为精度大的数据类型，这个就是自动类型转换。数据类型按照精度大小排序。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210823133549.png)

#### 2.7.2 自动类型转换细节

1、有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。

2、当我们把精度(容量)大的数据类型赋值给精度(容量)小的数据类型时，就会报错，反之就会进行自动类型转换。

3、`byte`,`short`和`char`之间不会相互自动转换。

4、`byte`，`short`， `char`它们三者可以计算，在计算时首先转换为`int`类型。

#### 2.7.3 代码示例

代码示例1

```java
package cn.guardwny.demo02;
/**
 * 1、自动类型转换
 */
public class AutoConvertDetail03 {
    public static void main(String[] args) {

        /**
         * 1.1 多种类型的数据混合运算时，系统首先自动将数据转换成大的数据类型，再进行计算
         */
        int n1 = 10; // ok
        // float d1 = n1 + 1.1; // 错误 n1 + 1.1 ==> 结果类型是double
        float d1 = n1 + 1.1F; // n1 + 1.1F ==> 结果类型是float

        /**
         * 2.1 当把精度大的数据类型赋值给精度小的数据类型时，就会报错。
         * 反之就会进行自动类型转换。
         */
        // int n2 = 1.1; // 错误 double == > int

        /**
         *3.1 byte, short,char之间不会相互自动转换。
         * 当把具体数据赋值给byte时，应该先判断该数是否在byte范围内，如果是就可以
         */
        byte b1 = 100; // 正确, -128-127
        int n2 = 1; // n2 是int
        // char c1 = b1; // 错误，原因是byte不能自动转成char。
    }
}
```

代码示例2

```java
package cn.guardwny.demo03;
/**
 * 1、自动类型转换
 */
public class AutoConvertDetail02 {
    public static void main(String[] args) {
        // 1、byte,short,char 它们三者都可以计算，在计算的时候首先转换为int类型
        byte b2 = 1;
        byte b3 = 2;
        short s1 = 1;

        // 2、相加操作
        // short s2 = b2 + s1;  // 错误，b2 + s1 => int
        int s2 = b2 + s1; // 正确，b2 + s1 ==> int
        // byte b4 = b2 + b3; // 错误: b2 + b3 ==> int

        // 3、boolean不参与转换
        boolean d1 = true;
        // int f1 = d1; // boolean不参与类型的自动转换。

        // 4、自动提升原则，表达式结果的类型自动提升为操作数中的最大的类型
        byte b4 = 1;
        short s3 = 100;
        int d2 = 10;
        float d3 = 1.23F;
        // 相加操作
        double a2 = b4 + s3 + d2 + d3; // float -> double
        System.out.println("a2的值:" + a2); // 结果为=> a2的值:112.2300033569336
    }
}
```

#### 2.7.4 强制类型转换

自动类型转换的逆过程， 将容量大的数据类型转换为容量小的数据类型。使用时要加上强制转换符`()`，但可能造成精度降低或溢出,格外要注意。

1、代码示例

```java
package cn.guardwny.demo03;
/**
 *  强制类型转换
 */
public class ForceConvert {
    public static void main(String[] args) {
        int i = (int) 1.9;
        // 输出结果
        System.out.println("i的值:" + i);	// i的值:1

        // 定义变量j
        int j = 100;
        byte b1 = (byte) j;
        System.out.println("b1的值:" + b1);	// b1的值:100
    }
}
```

2、强制类型转换细节

- 当进行数据的大小从大===>小，就需要使用到强制转换。
- 强制符号只针对于最近的操作数有效，往往会使用小括号提升优先级。

```java
// int a = (int)10*3.5 + 6*1.5;
int b = (int)(10*3.5 + 6*1.5);
// 输出结果
System.out.println("y的值:" + y);
```

- `char`类型可以保存`int`的常量值，但是不能保存`int`的变量值，需要强转。

```java
char c1 = 100; // true
int m = 100; // true
char c2 = m; // false
char c3 = (char)m; // true
// 输出100对应的字符
System.out.println("c3的值:" + c3);
```

- `byte`和`short`，`char`类型在进行运算时，当做`int`类型处理。

3、代码示例

```java
package cn.guardwny.demo03;
/*
* 强制类型转换 
*/
public class ForceConvertDetail {
    public static void main(String[] args) {
        // 1.1 定义变量s
        short s = 12; // true;
        // s = s-9; // 错误: int -->short

        // 1.2 定义变量b
        byte b = 10;
        // b = b + 11;  // 错误: int -> byte
        b = (byte)(b+11); // 正确，使用强转
        System.out.println("变量b的值:" + b);   // 变量b的值:21

        char c = 'a'; // true
        int i = 16; // true
        float d = .314F; // true
        double result = c + i + d;
        System.out.println("result结果:" + result);   // result结果:113.31400299072266

        byte a1 = 16; // true
        short t = 15; // true
        // short b1 = a1 + t; //错误 int -> short
        int b1 = a1 + t;
        System.out.println("b1的值:" + b1);   // b1的值:31
    }
}
```

### 2.8 String 类型的转换

#### 2.8.1 基本类型转String类型

语法：将基本类型的值 `+""`

```java
package cn.guardwny.demo04;
/*
* 基本数据类型转String类型
*/
public class StringToBasic01 {
    public static void main(String[] args) {
        // 1、基本数据类型 ===>String
        int n1 = 10;
        float f1 = 1.1F;
        double d1 = 4.5;
        boolean b1 = true;
        String s1  = n1 +"";
        String s2  = f1 +"";
        String s3  = d1 +"";
        String s4  = b1 +"";
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4); // 10 1.1 4.5 true
    }
}
```

#### 2.8.2 String类型转基本类型

通过基本类型的包装类调用`parseXX`方法即可。

```java
package cn.guardwny.demo04;

public class StringToBasic02 {
    public static void main(String[] args) {
        // String --> 对应的基本数据类型
        String s5 = "123";
        // 使用基本数据类型对应的包装类的相应方法，得到基本数据类型
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        long num4 = Long.parseLong(s5);
        byte num5 = Byte.parseByte(s5);
        boolean num6 = Boolean.parseBoolean(s5);
        short num7 = Short.parseShort(s5);

        // 输出结果
        System.out.println(num1); // 123
        System.out.println(num2); // 123.0
        System.out.println(num3); // 123.0
        System.out.println(num4); // 123
        System.out.println(num5); // 123
        System.out.println(num6); // false
        System.out.println(num7); // 123
    }
}
```

## 第3章 Java运算符

### 3.1 算术运算符

算术运算符是对数值类型的变量进行运算的，在 Java 程序中使用的非常多。

#### 3.1.1 常用的算术运算符

| 运算符          | 运算                                              | 案例说明                              | 结果                                |
| --------------- | ------------------------------------------------- | ------------------------------------- | ----------------------------------- |
| +               | 正号                                              | + 6                                   | 7                                   |
| -               | 负号                                              | b = 11; `-b`                          | -11                                 |
| +               | 加                                                | 8 + 8                                 | 16                                  |
| -               | 减                                                | 10 - 1                                | 9                                   |
| *               | 乘                                                | 7 * 4                                 | 28                                  |
| /               | 除                                                | 9 / 3                                 | 3                                   |
| %               | 取模(取余)                                        | 11 % 9                                | 2                                   |
| `+ +`<br/>`+ +` | 自增(前)：先运算后取值<br/>自增(后)：先取值后运算 | `a = 2; b= ++a;`<br/>`a = 2; b= a++;` | `a = 3; b = 3;`<br/>`a = 3; b = 2;` |
| `- -`<br/>`- -` | 自减(前)：先运算后取值<br/>自减(后)：先取值后运算 | `a = 2; b= --a;`<br/>`a = 2; b= a--;` | `a = 1; b = 1;`<br/>`a = 1; b = 2;` |
| +               | 字符串相加                                        | `"curry" + "小学生"`                  | `curry 小学生`                      |

#### 3.1.2 代码示例

```java
package cn.guardwhy.demo01;
/**
 * 算术运算符
 */
public class ArithmeticOperator01 {
    public static void main(String[] args) {
        // 1、++的使用
        int i = 10;
        // 1.2 自增，等价于i = i + 1; ==> i = 11
        i++;
        System.out.println("i=" + i);
        // 1.3 自增 等价于 i = i+1; i==> 12
        ++i;
        System.out.println("i=" + i);

        System.out.println("=================");

        // 2.1 前++ : ++i先自增后赋值
        int j =8;
        int k = ++j; // 等价于j = j+1; 然后将j赋值给k, k=j.
        System.out.println("k=" + k + " "+ "j=" + j);   // k=9, j=9

        // 2.2 后++ : i++先赋值后自增
        int a = 10;
        int b = a++; // 等价于b=a; a=a+1;
        System.out.println("a=" + a + " "+ "b=" + b); // a = 11, b = 10
    }
}
```

#### 3.1.3 常见面试题

```java
package cn.guardwhy.demo01;

public class ArithmeticOperator02 {
    public static void main(String[] args) {
        /**
         *案例1:
         * int i =1;
         * i = i++;
         * System.out.println(i),结果是啥？
         */
        int i = 1; // i==>1
        i = i++; // ==>规则使用临时变量:(1)temp = i;(2) i=i+1;(3)i = temp;
        // 输出结果
        System.out.println("i的值:" + i);  // i的值:1

        /**
         * 案例2:
         * int k = 1; k = ++k;
         * System.out.println(k)
         */
        int k = 1;
        // 使用临时变量,(1) k = k+1; (2) temp = k; (3)k = temp;
        k = ++k;
        // 输出结果
        System.out.println("k的值:" + k); // k的值:2
        
        /**
         * 案例3:求出c和c2的值
         */
        // 定义变量
        int c1 = 10;
        int c2 = 20;
        // 执行++操作
        int c = c1++;
        // 输出结果
        System.out.println("c=" + c); // c=10;
        System.out.println("c2=" + c2); // c2 = 20;

        // 执行--操作
        c = --c2;
        System.out.println("c=" +c);    // c=19
        System.out.println("c2=" +c2); // c2 = 19
    }
}
```

### 3.2 比较运算符

#### 3.2.1 基本概念

- 关系运算符的结果都是` boolean`型，也就是要么是 `true`，要么是 `false`。
- 关系表达式 经常用在` if `结构的条件中或循环结构的条件中。

#### 3.2.2 关系运算符一览

| 运算符 | 运算     | 案例说明 | 最终结果 |
| ------ | -------- | -------- | -------- |
| ==     | 相等于   | 8==7     | false    |
| !=     | 不等于   | 8!=7     | true     |
| <      | 小于     | 8 < 7    | false    |
| >      | 大于     | 8 > 7    | true     |
| <=     | 小于等于 | 8 <= 7   | false    |
| >=     | 大于等于 | 8> = 7   | true     |

1、代码示例

```java
package cn.guardwny.demo03;

public class RelationalOperator {
    public static void main(String[] args) {
        int a = 9; 
        int b = 8;
        System.out.println(a > b); //   true
        System.out.println(a >= b); //  true
        System.out.println(a <= b); //  false
        System.out.println(a < b);//    false
        System.out.println(a == b); //  false
        System.out.println(a != b); //  false
        boolean flag = a > b; 
        System.out.println("flag=" + flag); // flag = true
    }
}
```

#### 3.2.3 细节说明

- 关系运算符的结果都是`boolean`型，也就是要么是`true`，要么是`false`。
- 关系运算符组成的表达式，称为关系表达式。 a > b
- 比较运算符`"=="`不能误写成`"="`。

### 3.3 逻辑运算符

#### 3.3.1 基本介绍

用于连接多个条件（多个关系表达式），最终的结果也是一个 boolean 值。

#### 3.3.2 逻辑运算符一览

- 短路与 `&&` ， 短路或 `||`，取反 `!`
- 逻辑与 `&`，逻辑或 `|`， 逻辑异或 `^`

| 变量a | 变量b | a  & b(逻辑与) | a && b(短路与) | a \| b(逻辑或) | a\|\|b(短路或) | !a(取反) | a ^b(逻辑异或) |
| ----- | ----- | -------------- | -------------- | -------------- | -------------- | -------- | -------------- |
| true  | true  | true           | true           | true           | true           | false    | false          |
| true  | false | false          | false          | true           | true           | false    | true           |
| false | false | false          | false          | true           | true           | true     | true           |
| false | false | false          | false          | false          | false          | true     | true           |

**逻辑运算规则**

- `a&b` : `&` 叫逻辑与：规则：当 a 和 b 同时为 `true `,则结果为 `true`, 否则为 `false`。
- `a&&b` : `&&` 叫短路与：规则：当 a 和 b 同时为 `true` ,则结果为 `true`,否则为 `false`。
- `a|b` : `|` 叫逻辑或，规则：当 a 和 b ，有一个为`true` ,则结果为`true`,否则为 `false`。
- `a||b` : `||` 叫短路或，规则：当 a 和 b ，有一个为`true` ,则结果为 `true`,否则为 `false`。
- `!a` : 叫取反，或者非运算。当 a 为 `true`, 则结果为`false`, 当 a 为`false` 是，结果为 `true`。
- `a^b`: 叫逻辑异或，当 a 和 b 不同时，则结果为 `true`, 否则为 `false`。

#### 3.3.3 && 和 & 基本规则

| 名称        | 语法             | 特点                                            |
| ----------- | ---------------- | ----------------------------------------------- |
| 短路与`&& ` | 条件 1`&&`条件 2 | 两个条件都为`true`，结果为 `true`,否则 `false`  |
| 逻辑与`&`   | 条件 1`&`条件 2  | 两个条件都为 `true`，结果为 `true`,否则 `false` |

#### 3.3.4 && 和 &  代码示例

```java
package cn.guardwny.demo05;
/**
 *  &&短路与和&逻辑与
 */
public class LogicOperator01 {
    public static void main(String[] args) {
       // 1.1 定义变量
        int a1 = 4;
        int b1 = 9;
        // 1.2 对于&&短路与来说,如果第一个条件为false，后面的条件不在判断
        if(a1 < 1 && ++b1 < 50){
            System.out.println("====");
        }
        System.out.println("a1=" + a1 + " b1=" + b1);// a1=4 b1=9

        // 2.1 定义变量
        int a2 = 4;
        int b2 = 9;

        // 1.2 对于&&短路与来说,如果第一个条件为false，后面的条件不在判断
        if(a2 < 1 & ++b2 < 50){
            System.out.println("====");
        }
        System.out.println("a2=" + a2 + " b2=" + b2);// a2=4 b2=10
    }
}
```

#### 3.3.5 && 和 & 使用区别

- `&&`短路与：如果第一个条件为 `false`，则第二个条件不会判断，最终结果为 `false`，效率高。
- `&` 逻辑与：不管第一个条件是否为`false`，第二个条件都要判断，效率低，开发中，使用的基本是使用短路与`&&`, 效率高。

#### 3.3.6 || 和 | 基本规则

| 名称       | 语法             | 特点                                               |
| ---------- | ---------------- | -------------------------------------------------- |
| 短路或`||` | 条件 1`||`条件 2 | 两个条件中只要有一个成立，结果为 true,否则为 false |
| 逻辑或 `|` | 条件 1`|`条件 2  | 只要有一个条件成立，结果为 true,否则为 false       |

#### 3.3.7 || 和 | 代码示例

```java
package cn.guardwny.demo05;
/**
 * 短路或(||)和逻辑或(|)
 */
public class LogicOperator02 {
    public static void main(String[] args) {
        // 1.0 定义变量
        int age = 50;
        // 1.1 ||: 两个条件中只要有一个成立，结果为 true,否则为 false
        if(age > 20 || age < 30) {
            System.out.println("ok100"); // OK100
        }
        // 1.2 |: 两个条件中只要有一个成立，结果为 true,否则为 false
        if(age > 20 | age < 30) {
            System.out.println("ok200"); // ok200
        }

        // 2.1 短路或(||):如果第一个条件为true,则第二个条件不会判断，最终结果为true,效率高
        int a1 = 4;
        int b1 = 9;
        // 2.2 条件判断
        if(a1 > 1 || ++b1 > 4){
            System.out.println("=======");
        }
        System.out.println("a1=" + a1 + " b1=" + b1); // a1=4 b1=9


        // 3.1 逻辑或(|):不管第一个条件是否为true,第二个条件都要判断。
        int a2 = 4;
        int b2 = 9;
        // 2.2 条件判断
        if(a1 > 1 | ++b1 > 4){
            System.out.println("=======");
        }
        System.out.println("a1=" + a1 + " b1=" + b1); // a1=4 b1=10
    }
}
```

#### 3.3.8 ! 和 ^ 基本规则

| 名称         | 语法            | 特点                                          |
| ------------ | --------------- | --------------------------------------------- |
| `! `非(取反) | !条件           | 如果条件本身成立，结果为 false，否则为 true   |
| 逻辑异或 `^` | 条件 1`^`条件 2 | 当 a 和 b 不同时，则结果为 true, 否则为 false |

#### 3.3.9 ! 和 ^ 代码示例

```java
package cn.guardwny.demo05;
/*
*  ! 和 ^ 的操作
*/
public class InverseOperator {
    public static void main(String[] args) {
        // 1.1 ！操作时取反
        System.out.println(60 > 20);    // true
        System.out.println(!(60 > 20)); // false

        // 1.2 a^b：叫逻辑异或， 当a和b不同时，则结果为true,否则为false
        boolean b = (10 > 1) ^ (3 < 5);
        System.out.println("b的值:" + b); // b的值:false

        boolean a = (10 > 1) ^ (3 > 5);
        System.out.println("a的值是:" + a);  // a的值是:true
    }
}
```

#### 3.3.10 常见面试题

```java
package cn.guardwny.demo05;
/**
 * 逻辑运算符面试题
 */
public class Test {
    public static void main(String[] args) {
        // 1.1 &逻辑与：不管第一个条件是否为false，第二个条件都要判断，效率低
        int x1 = 5;
        int y1 = 5;
        // 条件判断
        if(x1++==6 & ++y1==6){
            x1 = 11;
        }
        // 输出结果
        System.out.println("x1="+x1+",y1=" + y1);   // x1=6,y1=6

        // 1.2 &&短路与：如果第一个条件为false，则第二个条件不会判断，最终结果为false，效率高。
        int x2 = 5;
        int y2 = 5;
        // 条件判断
        if(x2++==6 && ++y2==6){
            x2 = 11;
        }
        // 输出结果
        System.out.println("x2="+x2+",y2=" + y2);   // x2=6,y2=5

        //1.3 短路或(||):如果第一个条件为true,则第二个条件不会判断，最终结果为true,效率高
        int x3 = 5;
        int y3 = 5;
        // 条件判断
        if(x3++==5 || ++y3==5){
            x3 = 11;
        }
        // 输出结果
        System.out.println("x3="+x3+",y3=" + y3);   // x3=11,y3=5

        //1.4 逻辑或(|):不管第一个条件是否为true,第二个条件都要判断。
        int x4 = 5;
        int y4 = 5;
        // 条件判断
        if(x4++==5 | ++y4==5){
            x4 = 11;
        }
        // 输出结果
        System.out.println("x4="+x4+",y4=" + y4);   // x4=11,y4=6
    }
}
```

### 3.4 赋值运算符

#### 3.4.1 赋值运算符分类

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210824143157.png)

#### 3.4.2 赋值运算符特点

- 运算顺序从右往左 

```java
int num = a + b + c;
```

-  赋值运算符的左边 只能是变量,右边 可以是变量、表达式、常量值

```java
int num = 20; int num2= 78 * 34 - 10; int num3 = a;
```

- 
  复合赋值运算符等价于下面的效果

```java
比如：a+=3;等价于 a=a+3; 其他类推
```

- 复合赋值运算符会进行类型转换。

```java
byte b = 2; b+=3; b++;
```

#### 3.4.3 赋值运算符代码示例

```java
package cn.guardwny.demo05;
/*
* 赋值运算符
*/
public class AssignOperator {
    public static void main(String[] args) {
        // 1.1 定义变量
        int n1 = 10;
        n1 += 4; // n1 = n1 + 4;
        System.out.println("n1的值:" + n1);   // n1的值:14
        n1 /= 3; // n1 = n1 /3
        System.out.println("n1的值:" + n1);   // n1的值:4

        // 1.2 复合赋值运算符进行类型转换
        byte b = 3;
        b += 2;  // 等价 b=(byte)(b+2);
        // b++; // b = (byte)(b+1);
        // 输出b的值
        System.out.println("b的值:" + b); // b的值:5
    }
}
```

### 3.5 三元运算符

#### 3.5.1 基本介绍

`条件表达式 ? 表达式 1: 表达式 2;`

运算规则

1. 如果条件表达式为 `true`，运算后的结果是表达式 1；
2. 如果条件表达式为` false`，运算后的结果是表达式 2；

#### 3.5.2 代码示例

```java
package cn.guardwny.demo06;
/**
 * 三元运算符
 */
public class TernaryOperatorDetai {
    public static void main(String[] args) {
        // 1.1 定义变量
        int a = 10;
        int b = 90;
        /**
         * 条件判断:
         * 1. a > b 为false
         * 2. 返回b--, 先返回b的值，然后再b-1
         * 3.返回的结果是99
         */
        int result = a < b ? a++ : b--;
        System.out.println("result的值:" + result);   // result的值:10
        System.out.println("a的值:" + a); // a的值:11
        System.out.println("b的值:" + b); // b的值:90

        // 1.2 案例:实现三个数的最大值
        int n1 = 55;
        int n2 = 33;
        int n3 = 110;

        /**
         * 1、先得到n1和n2中的最大数，保存到max1
         * 2、然后再求出max1和n3的最大数，保存到max2
         */
        int max1 = n1 > n2 ? n1 : n2;
        int max2 = max1 > n3 ? max1 : n3;
        // 输出结果
        System.out.println("最大数:" + max2); // 最大数:110
    }
}
```

### 3.6 其他点

#### 3.6.1 运算符优先级

1、运算符有不同的优先级，所谓优先级就是表达式运算中的运算顺序。如下表，上一行运算符总优先于下一行。
2、只有单目运算符、赋值运算符是从右向左运算的。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210824200157.png" style="zoom:80%;" />

#### 3.6.2 标识符命名规则

1、基本介绍

Java对各种变量、方法和类等命名时使用的字符序列称为标识符。凡是自己可以起名字的地方都叫标识符。

2、标识符的命名规则。

- 由26个英文字母大小写，`0~9`，`_`或者`$`组成。
- 数字不可以开头(`int 3a = 1; // 错误`)。
- 不可以使用关键字和保留字，但是能包含关键字和保留字。
- Java中严格区分大小写，长度无限制。
- 标识符不能包含空格。

3、判断下面变量名是否正确

```java
package cn.guardwny.demo06;

public class TernaryOperatorDetai02 {
    public static void main(String[] args) {
        // 判断下面变量名是否正确
        String guardwhy; // true
        String curry10; // true
        // int 1curry; // false,数字不能开头
        // String h-s; // false不能有 -
        // String x h; // false， 有空格
        
        String h$4; // true
        // String class; //false，class 关键字
        // String int; // false,int 是关键字
        
        // String public; //false,public 是关键字
        // String static; //false ,static 是关键字
        // String goto; //错误, goto 是保留字
        String stu_name; //ok
    }
}
```

#### 3.6.3 标识符命名规范

1、==包名：多单词组成时所有字母都小写==。

```java
aaa.bbb.ccc //比如 com.guardwhy.crm
```

2、==类名、接口名：多单词组成时，所有单词的首字母大写==：XxxYyyZzz 【大驼峰】

```java
比如:TankShotGame
```

3、==变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写==：xxxYyyZzz 【小驼峰， 简称 驼峰法】

```java
比如: tankShotGame
```

4、==常量名：所有字母都大写，多单词时每个单词用下划线连接==：【XXX_YYY_ZZZ】

```java
比如:定义一个所得税率 TAX_RATE
```

#### 3.6.4 关键字

定义：被 Java 语言赋予了特殊含义，用做专门用途的字符串（单词）
特点：==关键字中所有字母都为小写==。

1、用于定义数据类型的关键字

| class | interface | enum   |
| ----- | --------- | ------ |
| byte  | short     | int    |
| long  | float     | double |
| char  | boolean   | void   |

2、用于定义数据类型值的关键字

| true | false | null |
| ---- | ----- | ---- |

3、用于定义流程控制的关键字

| if       | else    | switch |
| -------- | ------- | ------ |
| case     | default | while  |
| do       | for     | break  |
| continue | return  |        |

4、用于定义访问权限修饰符的关键字

| private | protected | public |
| ------- | --------- | ------ |

5、用于定义类，函数，变量修饰符的关键字

| abstract | final | static | synchronized |
| -------- | ----- | ------ | ------------ |

6、用于定义类与类之间关系的关键字

| extends | implements |
| ------- | ---------- |

7、用于定义建立实例及引用实例，判断实例的关键字

| new  | this | super | instanceof |
| ---- | ---- | ----- | ---------- |

8、用于异常处理的关键字

| try  | catch | finally | throw | throws |
| ---- | ----- | ------- | ----- | ------ |

9、用于包的关键字

| package | import |
| ------- | ------ |

10、其他修饰符关键字

| native | strictfp | transient | volatile | assert |
| ------ | -------- | --------- | -------- | ------ |

#### 3.6.5 键盘输入语句

1、基本介绍

在编程中，需要接收用户输入的数据，就可以使用键盘输入语句来获取。`Input.java` , 需要一个 扫描器(对象), 就是`Scanner`。

2、使用步骤

- 导入该类的所在包, `java.util.*`。
- 创建该类对象（声明变量)，调用里面的功能。

3、代码示例

```java
package cn.guardwny.demo06;

//Scanner类 表示 简单文本扫描器，在java.util包,引入/导入 Scanner类所在的包.
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //1.1.创建 Scanner对象 , new创建一个对象。
        Scanner myScanner = new Scanner(System.in);
        //1.2 接收用户输入了， 使用相关的方法
        System.out.println("请输入名字");
        //1.3 当程序执行到 next 方法时，会等待用户输入
        String name = myScanner.next();
        //1.4 接收用户输入字符串
        System.out.println("请输入年龄");
        //1.5 接收用户输入int
        int age = myScanner.nextInt(); 
        System.out.println("请输入薪水");
        //1.6 接收用户输入double
        double sal = myScanner.nextDouble();
        System.out.println("人的信息如下:");
        System.out.println("名字=" + name
                + " 年龄=" + age + " 薪水=" + sal);
    }
}
```

### 3.7 进制

#### 3.7.1 进制介绍

1、对于整数，有四种表示方式：

- 二进制：`0,1` ，满 `2` 进 `1`，以 `0b` 或 `0B` 开头。
- 十进制：`0-9` ，满 `10` 进 `1`。
- 八进制：`0-7` ，满 `8` 进 `1`，以数字 `0 `开头表示。
- 十六进制：`0-9` 及 `A(10)-F(15)`，满 `16 `进 `1`，以 `0x` 或 或 `0X `开头表示，此处的 `A-F `不区分大小写。

2、代码示例

```java
package cn.guardwny.demo06;
/**
 * 进制转换
 */
public class BinaryTest {
    public static void main(String[] args) {
        //n1 二进制
        int n1 = 0b1010;
        //n2 10进制
        int n2 = 1010;
        //n3 8进制
        int n3 = 01010;
        //n4 16进制
        int n4 = 0X10101;
        // 输出结果
        System.out.println("n1=" + n1); // n1=10
        System.out.println("n2=" + n2); // n2=1010
        System.out.println("n3=" + n3); // n3=520
        System.out.println("n4=" + n4); // n4=65793
    }
}
```

#### 3.7.2 进制的图示

| 十进制 | 十六进制 | 八进制 | 二进制 |
| ------ | -------- | ------ | ------ |
| 0      | 0        | 0      | 0      |
| 1      | 1        | 1      | 1      |
| 2      | 2        | 2      | 10     |
| 3      | 3        | 3      | 11     |
| 4      | 4        | 4      | 100    |
| 5      | 5        | 5      | 101    |
| 6      | 6        | 6      | 110    |
| 7      | 7        | 7      | 111    |
| 8      | 8        | 10     | 1000   |
| 9      | 9        | 11     | 1001   |
| 10     | A        | 12     | 1010   |
| 11     | B        | 13     | 1011   |
| 12     | C        | 14     | 1100   |
| 13     | D        | 15     | 1101   |
| 14     | E        | 16     | 1110   |
| 15     | F        | 17     | 1111   |
| 16     | 10       | 20     | 10000  |

#### 3.7.3 二进制转十进制

1、基本规则: 从最低位【右边】开始，将每个位上的数提取出来，==乘以2的【位数-1】次方==，然后求和。

2、案例实现: 将`0b1011`转换成十进制的数。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210825183637.jpg)

#### 3.7.4 八进制转十进制

1、基本规则: 从最低位(右边)开始，将每个位上的数据提取出来，==乘以8的(位数-1)次方==，然后再求和！！！

2、案例实现: 将`0234`转成十进制的数。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210825193411.jpg)

#### 3.7.5 十六进制转十进制

1、基本规则：从最低位(右边)开始，将每个位上的数提取出来，乘==以 16 的(位数-1)次方==，然后求和。
2、案例实现：将 `0x23A` 转成十进制的数。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210825193800.jpg)

####  3.7.6 十进制转二进制

1、基本规则：==将该数不断除以 2，直到商为 0 为止==，然后将每步得到的余数倒过来，就是对应的二进制。
2、案例实现：将 34 转成二进制 = 0B00100010

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210825194041.jpg)

#### 3.7.7 十进制转八进制

1、基本规则：==将该数不断除以 8，直到商为 0 为止==，然后将每步得到的余数倒过来，就是对应的八进制。
2、案例实现：将 131 转成八进制 => 0203

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210825194242.jpg)

#### 3.7.8 十进制转十六进制

1、基本规则：==将该数不断除以 16，直到商为 0 为止==，然后将每步得到的余数倒过来，就是对应的十六进制。
2、案例实现：将 237 转成十六进制 => 0xED

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210825194534.jpg)

#### 3.7.9 二进制转八进制

1、基本规则：==从低位开始,将二进制数每三位一组，转成对应的八进制数即可==。
2、案例实现：将 ob11010101 转成八进制

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210825200035.jpg)

#### 3.7.10 二进制转十六进制

1、基本规则：==从低位开始，将二进制数每四位一组，转成对应的十六进制数即可==。
2、案例实现：请将 `ob11010101` 转成十六进制

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210825200922.jpg)

#### 3.7.11 八进制转二进制

1、基本规则：==将八进制数每 1 位，转成对应的一个 3 位的二进制数即可==。
2、案例实现：请将 0237 转成二进制

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210825201854.jpg)

#### 3.7.12 十六进制转二进制

1、基本规则：==将十六进制数每 1 位，转成对应的 4 位的一个二进制数即可==。
2、案例实现：请将 0x23B 转成二进制。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210825202655.jpg)

### 3.8 位运算

#### 3.8.1 二进制在运算中的说明

1、二进制是逢2进位的进位制，0、1是基本算符。

2、现代电子计算机技术全部采用的是二进制，因为它只使用0、1两个数字符号，非常简单方便，易于用电子方式实现，计算机内部处理信息，都是采用二进制数来表示。二进制(Binary)数用0和1两个数字及其组合来表示任何数。==进位规则是"逢2进1"==，数字1在不同的位上代表不同的值，按从右至左次序，这个值以二倍递增。

#### 3.8.2 原码，反码，补码

- 二进制的最高位是符号位: 0表示正数，1表示负数(0->0，1-> -)。
- 正数的原码，反码，补码都是一样的(三码合一)。
- 负数的反码 = 它的原码符号位不变，其他位取反(0->1，1-> 0)。
- 负数的补码 = 它的反码 + 1，负数的反码 = 负数的补码 - 1。
- 0的反码，补码都是0。
- Java没有无符号数，换言之，Java中的数都是有符号的。
- ==在计算机运算的时候，都是以补码的方式来运算的==。
- ==当看运算结果的时候，要看它的源码==。

#### 3.8.3 位运算符

java 中有 7 个位运算(`&`、`|`、`^`、`~`、`>>`、`<<`和 `>>>`)

| 位运算符                     | 运算规则                                     |
| ---------------------------- | -------------------------------------------- |
| &(按位与)                    | 两位全为1，结果为1，否则为0。                |
| \|(按位或)                   | 两位有一个为1，结果为1，否则为0。            |
| ^(按位异或)                  | 两位一个为0，一个为1，结果为1,否则为0        |
| ~(按位取反)                  | 0 -》1， 1-》0                               |
| >> (算术右移)                | 低位溢出,符号位不变,并用符号位补溢出的高位。 |
| << (算术左移 )               | 符号位不变,低位补 0                          |
| >>> (逻辑右移也叫无符号右移) | 低位溢出，高位补 0                           |

1、代码示例

```java
package cn.guardwny.demo07;
/**
 * 位运算
 */
public class BitOperator {
    public static void main(String[] args) {

        /**
         * 1.1 2的原码 00000000 00000000 00000000 00000010
         * 1.2 2的补码 00000000 00000000 00000000 00000010
         * 1.3 3的原码 00000000 00000000 00000000 00000011
         * 1.4 3的补码 00000000 00000000 00000000 00000011
         * 按位&
         * 1.5 00000000 00000000 00000000 00000010
         * 1.6 00000000 00000000 00000000 00000011
         * 1.7 00000000 00000000 00000000 00000010 (& 运算后的补码)
         * 1.8 运算后的原码也是 00000000 00000000 00000000 00000010 ===> 2
         */
        System.out.println(2&3);//2

        /**
         * 2.1 -2的原码 10000000 00000000 00000000 00000010
         * 2.2 -2的反码 11111111 11111111 11111111 11111101
         * 2.3 -2的补码 11111111 11111111 11111111 11111110
         * 2.4 ~-2操作  00000000 00000000 00000000 00000001【运算后的补码】
         * 2.5 运算后的原码就是 00000000 00000000 00000000 00000001 => 1
         */
        System.out.println(~-2);//1

        /**
         * 3.1 得到2的补码 00000000 00000000 00000000 00000010
         * 3.2 ~2操作     11111111 11111111 11111111 11111101【运算后的补码】
         * 3.3 运算后的反码 11111111 11111111 11111111 11111100
         * 3.4 运算后的原码 10000000 00000000 00000000 00000011=>-3
         */
        System.out.println(~2); //-3
    }
}
```

2、代码示例

```java
public class BitOperator02 { 

	//编写一个main方法
	public static void main(String[] args) {
		System.out.println(1 >> 2); // 1 => 00000001 => 00000000 本质 1 / 2 / 2 =0
		System.out.println(1 << 2); // 1 => 00000001 => 00000100 本质 1 * 2 * 2 = 4
		System.out.println(4 << 3); // 4 * 2 * 2 * 2 = 32
		System.out.println(15 >> 2); // 15 / 2 / 2 = 3
	}
}
```

## 第4章 Java程序控制结构

### 4.1 程序流程控制

在程序中，程序运行的流程控制决定程序是如何执行的，目前主要有三大流程控制语句。

- 顺序控制
- 分支控制
- 循环控制

### 4.2 顺序控制

程序从上到下逐行地执行，中间没有任何判断和跳转。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210826105206.png" style="zoom:80%;" />

#### 4.2.1 代码示例

```java
package cn.guardwhy.demo01;

public class Test01 {
    public static void main(String[] args) {
        // 定义变量
        int num1 = 13;
        int num2 = num1 + 1;
        // 输出结果
        System.out.println("num2的值:" + num2);
    }
}
```

### 4.3 分支控制

让程序有选择的的执行,分支控制有三种

1、单分支` if`
2、双分支 `if-else`
3、 多分支 `if-else if -....-else`

#### 4.3.1 单分支结构

1、基本语法

```java
if(条件表达式){
    执行代码块；【可以有多条语句】
}
```

2、单分支流程图

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210826152335.png" style="zoom:80%;" />

**注意**：当条件表达式为`true`时，就会执行`{}`的代码。如果为`false`就不执行。

3、案例实现

编写一个程序，可以输入人的年龄，如果该同志的年龄大于`18`岁，则要输出”你的年龄大于18，要好好学习“

```java
package cn.guardwhy.demo01;

import java.util.Scanner;
/**
 * 思路分析
 * 1.接收输入的年龄, 应该定义一个Scanner对象
 * 2.把年龄保存到一个变量 int age
 * 3.使用 if 判断，输出对应信息
 */
public class Iftest01 {
    public static void main(String[] args) {
        //定义一个Scanner 对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        //把年龄保存到一个变量 int age
        int age = myScanner.nextInt();
        //使用 if 判断，输出对应信息
        if(age > 18) {
            System.out.println("你年龄大于18,要好好学习！！！");
        }
        System.out.println("程序继续...");
    }
}
```

#### 4.3.2 双分支结构

1、基本语法

```java
if(条件表达式){
    执行代码块1;
}else{
    执行代码块2;
}
```

2、双分支结构流程图	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210826153844.png" style="zoom:80%;" />

**注意**：当条件表达式成立，即执行代码块1，否则执行代码块2，如果执行代码只有一条语句，则`{}`可以省略。

3、案例实现

编写一个程序，可以输入人的年龄，如果该同志的年龄大于`18`岁，则要输出”你的年龄大于18，要好好学习“，否则输出"年龄不大，可以好好的玩耍！！"

```java
package cn.guardwhy.demo01;

import java.util.Scanner;

/**
 * 双分支
 */
public class Iftest02 {
    public static void main(String[] args) {
        /**
         * 思路分析
         * 1.1 接收输入的年龄, 应该定义一个Scanner对象
         * 1.2 把年龄保存到一个变量 int age
         * 1.3 使用 if-else 判断，输出对应信息
         */
        //应该定义一个Scanner 对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        //把年龄保存到一个变量 int age
        int age = myScanner.nextInt();
        //使用 if-else 判断，输出对应信息
        if(age > 18) {
            System.out.println("你年龄大于18,要好好学习");
        } else {//双分支
            System.out.println("年龄不大，可以好好的玩耍！！");
        }

        System.out.println("程序继续...");
    }
}
```

#### 4.3.3 多分支结构

1、基本语法

```java
if(条件表达式1){
    执行代码块1;
}else if(条件表达式2){
    执行代码块2;
}.....
else{
    执行代码块n;
}
```

2、多分支结构流程图

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210826164957.png" style="zoom:80%;" />

**注意**：

- 当条件表达式1成立时，即执行代码块1。
- 如果表达式1不成立，才去判断表达式2是否成立。
- 如果表达式2成立，就执行代码块2。
- 以此类推，如果所有的表达式都不成立，则执行`else`的代码块，注意只能有一个执行入口。

3、案例实现

输入小学生`Curry`同志的芝麻信用分，如果：信用分为100分时，输出信用极好；信用分为(80，99]时，输出 信用优秀；信用分为[60,80]时，输出 信用一般；

其它情况 ，输出信用 不及格，请从键盘输入保国的芝麻信用分，并加以判断。

```java
package cn.guardwhy.demo01;

import java.util.Scanner;

/**
 * 多分支
 */
public class Iftest03 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        //接收用户输入
        System.out.println("请输入信用分(1-100):");
        int grade = myScanner.nextInt();

        //先对输入的信用分，进行一个范围的有效判断 1-100, 否则提示输入错误
        if(grade >=1 && grade <= 100) {
            //因为有4种情况，所以使用多分支
            if(grade == 100) {
                System.out.println("信用极好");
                //信用分为(80，99]时，输出 信用优秀；
            } else if (grade > 80 && grade <= 99) {
                System.out.println("信用优秀");
                //信用分为[60,80]时，输出 信用一般
            } else if (grade >= 60 && grade <= 80) {
                System.out.println("信用一般");
            } else {//其它情况 ，输出 信用 不及格
                System.out.println("信用不及格");
            }

        } else {
            System.out.println("信用分需要在1-100,请重新输入:)");
        }
    }
}
```

#### 4.3.4 嵌套分支

1、基本介绍

在一个分支结构中又完整的嵌套了另一个完整的分支结构，里面的分支的结构称为内层分支外面的分支结构称为外层分支。

2、基本语法

```java
if(条件表达式1){
    if(条件表达式2){
        if-else....
    }else{
        if-else...
    }
}
```

3、案例实现

参加歌手比赛，如果初赛成绩大于 8.0 进入决赛，否则提示淘汰。并且根据性别提示进入男子组或女子组。 输入成绩和性别，进行判断和输出信息。

```java
package cn.guardwhy.demo01;

import java.util.Scanner;
/**
 *思路分析
 * 1. 创建Scanner对象，接收用户输入
 * 2. 接收 成绩保存到 double score
 * 3. 使用 if-else 判断 如果初赛成绩大于8.0进入决赛，否则提示淘汰。
 * 4. 如果进入到决赛，再接收 char gender, 使用 if-else 输出信息
 */
public class NestedIf {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入该歌手的成绩");
        double score = myScanner.nextDouble();
        if( score > 8.0 ) {
            System.out.println("请输入性别");
            char gender = myScanner.next().charAt(0);
            if( gender == '男' ) {
                System.out.println("进入男子组");
            } else if(gender == '女') {
                System.out.println("进入女子组");
            } else {
                System.out.println("你的性别有误，不能参加决赛~");
            }
        } else {
            System.out.println("sorry ,你被淘汰了~");
        }
    }
}
```

#### 4.4 switch 分支结构

1、基本语法

```java
switch(expression){
    case value :
       //语句
       break; //可选
    case value :
       //语句
       break; //可选
    //你可以有任意数量的case语句
    default : //可选
       //语句
}
```

2、switch分支结构流程图

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210826202143.png" style="zoom:80%;" />

3、案例实现

编写一个程序，该程序可以接收一个字符，比如:`a,b,c,d,e,f,g`，a 表示星期一，b 表示星期二 …根据用户的输入显示相应的信息，要求使用`switch`语句完成。

```java
package cn.guardwhy.demo02;
import java.util.Scanner;
/**
 *思路分析
 * 1. 接收一个字符 , 创建Scanner对象
 * 2. 使用switch 来完成匹配,并输出对应信息
 */
public class Switch01 {
    public static void main(String[] args) {
        //定义一个Scanner 对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个字符(a-g)");
        char c1 = myScanner.next().charAt(0);
        //在java中，只要是有值返回，就是一个表达式
        switch(c1) {
            case 'a' :
                System.out.println("今天星期一,写Java代码");
                break;
            case 'b' :
                System.out.println("今天星期二,写C++代码");
                break;
            case 'c' :
                System.out.println("今天星期三,写PHP代码");
                break;
            //.....
            default:
                System.out.println("不想写了，累死了。。");
        }
        System.out.println("退出了switch ,继续执行程序");
    }
}
```

4、注意事项

- 表达式数据类型应和`case`后的常量类型一致，或者是可以自动转成可以相互比较的类型，比如输入的是字符而常量是`int`。
- `switch`(表达式)中表达式的返回值必须是：`(byte,short,int,char,enum[枚举],String)`。
- `case`子句中的值必须是常量`(1,'a')`或者是常量表达式,而不能是变量。
- `default`子句是可选的，当没有匹配的`case`时执行`default`，如果没有`default`子句有没有匹配任何常量，则没有输出。
- `break`语句用来在执行完一个`case`分支后使程序跳出`switch`语句块，如果没有写`break`，程序会顺序执行到`switch`结尾,除非执行到`break`。

#### 4.5 switch和if的比较

1、如果判断的具体数值不多，而且符合`byte、 short 、int、 char, enum[枚举], String`这 6 种类型，虽然两个语句都可以使用建议使用`swtich`语句。

2、对区间判断，对结果为 boolean 类型判断，使用 if，if 的使用范围更广。

### 4.4 循环控制

#### 4.4.1 for 循环控制

1、基本语法

for关键字，表示循环控制。

- for有四要素：(1)循环变量初始化(2)循环条件(3)循环操作(4)循环变量迭代。
- 循环操作，这里可以有多条语句，也就是要循环执行的代码。
- 如果循环操作(语句)只有一条语句，可以省略`{}`,建议不要省略。

```java
for(循环变量初始化; 循环条件; 循环变量迭代){
    循环操作(可以多条语句)
}
```

2、for 循环流程图

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210827090824.png" style="zoom:80%;" />

3、for循环案例实现

打印 1~100 之间所有是 9 的倍数的整数，统计个数及总和

```java
package cn.guardwhy.demo02;
/**
 * 思路分析
 * 1、打印1~100之间所有是9的倍数的整数，统计个数  及 总和
 * 化繁为简
 * 1.1 完成 输出 1-100的值
 * 1.2 在输出的过程中，进行过滤，只输出9的倍数  i % 9 ==0
 * 1.3 统计个数 定义一个变量 int count = 0; 当 条件满足时 count++;
 * 1.4 总和 , 定义一个变量 int sum = 0; 当条件满足时累积 sum += i;
 * 2、先死后活
 * 2.1 为了适应更好的需求，把范围的开始的值和结束的值，做出变量
 * 2.2 还可以更进一步9倍数也做成变量 int t = 9;
 */
public class ForExercise02 {
    public static void main(String[] args) {
        // 1.1 定义计数器
        int count = 0;
        // 1.2 定义总和 sum
        int sum = 0;
        // 1.3 定义开始值和结束值
        int start = 1;
        int end = 100;
        // 1.4 定义倍数
        int t = 9;
        // 1.5 遍历条件
        for (int i=start; i<=end; i++){
            // 1.6 条件判断
            if(i % t == 0){
                System.out.println("i=" + i);
                count++;
                // 累加操作
                sum += i;
            }
        }
        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
    }
}
```

3、增强for循环

```java
package cn.enum_.demo02;

public class For {
    public static void main(String[] args) {
        // 1.1 定义数组
        int[] nums = {1, 2, 9};
        //普通的for循环
        System.out.println("=====普通的for=====");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i=" + nums[i]);
        }
        System.out.println("=====增强的for=====");
        //执行流程是 依次从nums数组中取出数据，赋给i, 如果取出完毕，则退出for
        for(int i : nums) {
            System.out.println("i=" + i);
        }
    }
}
```

#### 4.4.2 while 循环控制

1、基本语法

`while`循环需要有四要素，只是四要素放的位置和for不一样。

```java
循环变量初始化
while(循环条件){
    循环体(语句)
    循环变量迭代;
}
```

2、while循环流程图

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210827115741.png" style="zoom:80%;" />

**细节说明**:循环条件是返回一个布尔值的表达式，while 循环是先判断再执行语句。

3、案例实现

打印 `1—100 `之间所有能被 3 整除的数，打印 `40—200` 之间所有的偶数。

```java
package cn.guardwhy.demo02;

public class WhileExercise03 {
    public static void main(String[] args) {
        // 1.1 打印1—100之间所有能被3整除的数
        int i =1;
        // 定义end值
        int endNum = 100;
        // 条件判断
        while (i < endNum){
            if(i % 3 == 0){
                System.out.println("i=" + i);
            }
            // 变量自增
            i++;
        }

        // 2.1 打印40—200之间所有的偶数
        System.out.println("++++++++++");
        // 变量初始化
        int j =40;
        while (j <= 200){
            // 条件判断
            if (j % 2 == 0){
                System.out.println("j=" + j);
            }
            // 循环变量的迭代
            j++;
        }
    }
}
```

#### 4.4.3 do-while 循环控制

1、基本语法

`do-while`是关键字，也有循环四要素，只是位置不一样。

先执行，再判断，也就是说，一定会至少执行一次。

最后有一个分号`;`。

```java
循环变量初始化;
do{
    循环体(语句);
    循环变量迭代;
}while(循环条件);
```

2、do...while 循环流程图

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210827155357.png" style="zoom: 80%;" />

3、案例实现

统计 `1---200`之间能被 5 整除但不能被 3 整除的个数。

```java
package cn.guardwhy.demo02;
/**
 *1、使用do-while输出 1-200
 *1.2 过滤能被5整除但不能被3整除的数 %
 *1.3 统计满足条件的个数 int count = 0;
 *2、先死后活
 *2.1 范围的值 1-200 你可以做出变量
 *2.2 能被5整除但不能被3整除的,5和3可以改成变量
 */
public class DoWhileExercise01 {
    public static void main(String[] args) {
        // 定义变量
        int i = 1;
        //统计满足条件的个数
        int count = 0;
        do {
            if( i % 5 == 0 && i % 3 != 0 ) {
                System.out.println("i=" + i);
                count++;
            }
            i++;
        }while(i <= 200);

        System.out.println("count=" + count);
    }
}
```

4、注意事项

 循环条件是返回一个布尔值的表达式，`do..while` 循环是先执行，再判断， 因此它至少执行一次。

#### 4.4.5 多重循环控制

1、基本介绍

- 将一个循环放在另一个循环体内，就形成了嵌套循环。其中，`for ,while ,do-while` 均可以作为外层循环和内层循环。【建议一般使用两层，最多不要超过 3 层, 否则，代码的可读性很差】
- 实质上，嵌套循环就是把内层循环当成外层循环的循环体。当只有内层循环的循环条件为`false`时，才会完全跳出内层循环，才可结束外层的当次循环，开始下一次的循环。
- 设外层循环次数为`m`次，内层为 `n` 次，则内层循环体实际上需要执行 `m * n` 次。

```java
for(int i=1; i<= 7; i++){ // 第一层循环为7
    for(int j=1; j <= 2; j++){ // 第二层循环为2
        System.out.println("hello java!!!"); // 7 * 2 = 14
    }
}
```

2、案例实现

统计3个班成绩情况，每个班有 5 名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。

```java
package cn.guardwhy.demo03;

import java.util.Scanner;

/**
 * 思路分析:
 * (1) 先计算一个班 , 5个学生的成绩和平均分 , 使用for
 * 1.1 创建 Scanner 对象然后，接收用户输入
 * 1.2 得到该班级的平均分 , 定义一个double sum 把该班级5个学生的成绩累积。
 * (2) 统计3个班(每个班5个学生)平均分
 * (3) 所有班级的平均分
 * 3.1 定义一个变量，double totalScore 累积所有学生的成绩。
 * 3.2 当多重循环结束后，totalScore / (3 * 5)
 * (4) 统计三个班及格人数
 * 4.1 定义变量 int passNum = 0; 当有一个学生成绩>=60, passNum++
 * 4.2 如果 >= 60 passNum++
 */
public class MulForExercise01 {
    public static void main(String[] args) {
        // 1.1 创建myScanner对象
        Scanner myScanner = new Scanner(System.in);
        //1.2 定义所有学生的成绩
        double totalScore = 0;
        //1.3 定义及格人数
        int passNum = 0;
        // 1.4 班级个数
        int classNum = 3;
        // 1.5 学生个数
        int stuNum = 5;
        for( int i = 1; i <= classNum; i++) {
            //1.6 一个班级的总分
            double sum = 0;
            for( int j = 1; j <= stuNum; j++) {//j 表示学生
                System.out.println("请数第"+i+"个班的第"+j+"个学生的成绩");
                double score = myScanner.nextDouble();
                //1.7 当有一个学生成绩>=60, passNum++
                if(score >= 60) {
                    passNum++;
                }
                // 1.8 累积和
                sum += score;
                System.out.println("成绩为" + score);
            }
            //1.9 班级学生的总成绩
            System.out.println("sum=" + sum + " 平均分=" + (sum / stuNum));
            //1.10 把 sum 累积到 totalScore
            totalScore += sum;

        }
        System.out.println("三个班总分="+ totalScore
                + " 平均分=" + totalScore / (classNum*stuNum));
        System.out.println("及格人数=" + passNum);
    }
}
```

3、经典面试题

编写一个程序，可以接收一个整数,表示层数（totalLevel），打印出金字塔。

```java
package cn.guardwhy.demo03;
/*
思路分析

1.先打印一个矩形
    *****
    *****
    *****
    *****
    *****
2. 打印半个金字塔
    *    	//第1层 有 1个*
    **   	//第2层 有 2个*
    ***		//第3层 有 3个*
    ****    //第4层 有 4个*
    *****   //第5层 有 5个*

3.打印整个金字塔
		*       //第1层 有 1个*   2 * 1 -1   有4=(总层数-1)个空格
	   ***      //第2层 有 3个*   2 * 2 -1   有3=(总层数-2)个空格
	  *****     //第3层 有 5个*   2 * 3 -1   有2=(总层数-3)个空格
	 *******    //第4层 有 7个*   2 * 4 -1   有1=(总层数-4)个空格
	*********   //第5层 有 9个*   2 * 5 -1   有0=(总层数-5)个空格

4.打印空心的金字塔 [最难的]
	    *       //第1层 有 1个*   当前行的第一个位置是*,最后一个位置也是*
	   * *      //第2层 有 2个*   当前行的第一个位置是*,最后一个位置也是*
	  *   *     //第3层 有 2个*   当前行的第一个位置是*,最后一个位置也是*
	 *     *    //第4层 有 2个*   当前行的第一个位置是*,最后一个位置也是*
	*********   //第5层 有 9个*   全部输出*
*/
public class MulForExercise02 {
    public static void main(String[] args) {
        // 1.1 定义层数
        int totalLevel = 5;
        // 1.2 i 表示层数
        for(int i = 1; i <= totalLevel; i++) {
            //1.3 在输出*之前，还有输出 对应空格 = 总层数-当前层
            for(int k = 1; k <= totalLevel - i; k++ ) {
                System.out.print(" ");
            }
            //1.4 控制打印每层的*个数
            for(int j = 1;j <= 2 * i - 1;j++) {
                //1.5 当前行的第一个位置是*,最后一个位置也是*, 最后一层全部 *
                if(j == 1 || j == 2 * i - 1 || i == totalLevel) {
                    System.out.print("*");
                } else {
                    //1.7 其他情况输出空格
                    System.out.print(" ");
                }
            }
            //1.8 每打印完一层的*后，就换行 println本身会换行
            System.out.println("");
        }
    }
}
```

### 4.5 跳转控制

#### 4.5.1 break关键字

1、基本语法

`break` 语句用于终止某个语句块的执行，一般使用在`switch` 或者循环`[for , while , do-while]`中。

break使用场景:
    1、在switch中，用于结束switch结构。
    2、在循环中，用于结束break所在循环。
    3、多层循环时，可以为循环加上标签，让break结束指定循环。

**注意**：break语句后面不能直接跟其他语句，否则会编译报错。

2、while 使用 break语句流程图

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210827200511.png" style="zoom: 80%;" />

3、案例示例

实现登录验证，有3次机会，如果用户名为`guardwhy` ,密码`666`提示登录成功，否则提示还有几次机会。

```java
package cn.guardwhy.demo03;

import java.util.Scanner;

/**
 * 思路分析
 * 1. 创建Scanner对象接收用户输入
 * 2. 定义 String name , String passwd 保存用户名和密码
 * 3. 最多循环3次[登录3次]，如果 满足条件就提前退出
 * 4. 定义一般变量 int chance 记录还有几次登录机会
 */
public class BreakExercise01 {
    public static void main(String[] args) {
        // 1.1 定义myScanner对象
        Scanner myScanner  = new Scanner(System.in);
        String name = "";
        String passwd = "";
        //1.2 登录一次 ，就减少一次
        int chance = 3;
        for( int i = 1; i <= 3; i++) {
            System.out.println("请输入名字");
            name = myScanner.next();
            System.out.println("请输入密码");
            passwd = myScanner.next();
            //1.3 比较输入的名字和密码是否正确
            if("guardwhy".equals(name) && "123".equals(passwd)) {
                System.out.println("恭喜你，登录成功~");
                break;
            }
            //1.4 登录的机会就减少一次
            chance--;
            System.out.println("你还有" + chance + "次登录机会");
        }
    }
}
```

#### 4.5.2 continue关键字

1、基本介绍

- continue只能在循环中使用，用于跳过一次循环，开始下一次循环。
- continue后面不能直接跟其他语句，否则会编译报错。
- 当有循环嵌套时，continue也可配合标签使用，跳到指定循环继续执行。

2、while 使用continue语句流程图

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210827205837.png" style="zoom:80%;" />

3、案例实现

打印`1~10`之间的整数，遇到`6`时跳过不打印。

```java
package cn.guardwhy.demo03;

public class Continue01 {
    //编写一个main方法
    public static void main(String[] args) {
        //代码
        int i = 1;
        while( i < 10) {
            i++;
            if( i == 6) {
                continue;
            }
            System.out.println("i=" + i);
        }
    }
}
```

#### 4.5.3 break和continue区别

- **break**：结束整个循环。
- **continue**：跳过本次循环，继续下一次循环。

### 4.6 经典案例

#### 4.6.1 案例一

某人有100,000元,每经过一次路口，需要交费规则如下:当现金`>50000`时每次交`5%`，当现金`<=50000`时每次交`1000`，计算该人可以经过多少次路口？要求: 使用 `while + break`方式完成。

```java
package cn.guardwhy.demo04;
/**
 思路分析
    1. 定义 double money 保存 100000
    2. 根据题的要求，我们分析出来有三种情况
        money > 50000
        money >=1000 && money <= 50000
        money < 1000
    3. 使用多分支 if-elseif-else
    4. while+break[money < 1000], 同时使用一个变量count来保存通过路口。
 */
public class MultipleDemo01 {
    public static void main(String[] args) {
        // 1.1 定义money变量
        double money = 100000;
        // 1.2 定义路口计算器
        int count = 0;
        while(true) {
            //1.3 过路口
            if(money > 50000) {
                //money = money -  money * 0.05;
                // 1.4过了这个路口后，还有多少钱
                money *= 0.95;
                count++;
            } else if(money >=1000) {
                money -= 1000;
                count++;
                // 1.5 钱不够1000,不能过路口
            } else {
                break;
            }
        }
        System.out.println("100000可以过" + count + "个路口");
    }
}
```

#### 4.6.2 案例二

判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。例如： 153 = 1* 1 * 1 + 3 * 3 * 3 + 5 \* 5* 5

```java
package cn.guardwhy.demo04;

import java.util.Scanner;
/**
 * 思路分析
 * 1. 比如 int n = 153;
 * 2. 先得到 n的百位，十位，各位的数字,使用 if 判断他们的立方和是否相等
 * 3. n的百位 = n / 100
 * 4. n的十位 = n % 100 / 10
 * 5. n的各位 = n % 10
 */
public class MultipleDemo02 {
    public static void main(String[] args) {
        // 1.1 创建scanner对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入3位数整数:");
        // 1.2 定义变量
        int num = scanner.nextInt();
        int n1 = num / 100;
        int n2 = num % 100 / 10;
        int n3 = num % 10;
        if(n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == num) {
            System.out.println(num + "是水仙花数");
        } else {
            System.out.println(num + "不是水仙花数");
        }
    }
}
```

#### 4.6.3 案例三

输出1-100之间的不能被5整除的数，每5个一行

```java
package cn.guardwhy.demo04;
/**
 * 思路分析
 * 1. 先输出1-100的所有数
 * 2. 然后过滤输出不能被5整除的数 i % 5 !=0
 * 3. 每5个一行,使用 int count 统计输出的个数当,count%5=0就说明输出了5个，这时输出一个换行即可控制
 */
public class MultipleDemo03 {
    public static void main(String[] args) {
        //1.1 统计输出的个数
        int count = 0;
        // 1.2 遍历代码
        for(int i = 1; i <= 100; i++) {
            if(i % 5 != 0) {
                count++;
                System.out.print(i + "\t");

                //1.3 判断, 每满5个，就输出一个换行
                if(count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
```

#### 4.6.4 案例四

输出小写的`a-z`以及大写的`Z-A`

```java
package cn.guardwhy.demo04;
/**
 * 思路分析
 * 1.'b' = 'a' + 1 c = 'a' + 2
 * 2.使用for搞定
 */
public class MultipleDemo04 {
    public static void main(String[] args) {
        for(char c1 = 'a'; c1 <= 'z'; c1++) {
            System.out.print(c1 +" ");
        }
        System.out.println("\n============");

        for(char c1 = 'Z'; c1 >= 'A'; c1--) {
            System.out.print(c1 +" ");
        }
    }
}
```

#### 4.6.5 案例五

求出1-1/2+1/3-1/4…..1/100的和

```java
package cn.guardwhy.demo04;
/**
 思路分析
 1. 1-1/2+1/3-1/4…..1/100 = (1/1)-(1/2)+(1/3)-(1/4)...1/100
 2. 从上面的分析可以看到
 2.1 一共有100数分子为1,分母从1-100
 2.2 还发现当分母为奇数时，前面是+,当分母是偶数时，前面是-
 3. 我们可以使用 for + 判断即可完成
 4. 把结果存放到double sum
 5. 这里有一个隐藏的陷阱，要把公式分子1写出1.0才能得到精确的小数
 */
public class MultipleDemo05 {
    public static void main(String[] args) {
        // 1.1 定义sum值
        double sum = 0;
        // 1.2 条件遍历
        for(int i = 1; i <= 100; i++) {
            //1.3 判断是奇数还是偶数，然后做不同的处理
            if( i % 2 != 0) {
                //1.4 分母为奇数
                sum += 1.0/i;
            } else {
                //1.5 分母我偶数
                sum -= 1.0/i;
            }
        }

        System.out.println("sum=" + sum);
    }
}
```

#### 4.6.6 案例六

求(1)+（1+2）+（1+2+3）+（1+2+3+4）+...+(1+2+3+..+100)的结果

```java
package cn.guardwhy.demo04;
/**
 * 思路分析
 * 1. 一共有100项相加
 * 2. 每一项的数字在逐渐增加
 * 3. 很像一个双层循环,i 可以表示是第几项,同时也是当前项的最后一个数,使用 sum 进行累计即可.
 */
public class MultipleDemo06 {
    public static void main(String[] args) {
        // 定义sum值
        int sum = 0;
        // 遍历条件
        for(int i = 1; i <= 100; i++) {
            //内层对1-i进行循环
            for(int j = 1;j <= i; j++) {
                sum += j;
            }
        }
        System.out.println("sum=" + sum);
    }
}
```

## 第5章 Java数组相关操作

### 5.1 数组基本介绍

**作用**：数组可用于存储同一类型的==多个数据==，是一个java的数据容器，数组也是一种数据类型，是引用类型。

**特点**：==数组长度固定，所存数据类型一致==。

### 5.2 数组快速入门

案例需求: 院子里面有六只鸡，它们的体重分别是`3kg`，`5kg`，`1kg`，`3.4kg`，`2kg`，`50kg` ,请问这六只鸡的总体重是多少?平均体重是多少?

```java
package cn.guardwhy.demo01;
/**
 * 思路分析
 * 1. 定义六个变量 double , 求和 得到总体重
 * 2. 平均体重 = 总体重 / 6
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        // 1.0 定义数组
        double[] array = {3, 5, 1, 3.4, 8};
        // 1.1 定义总体重变量
        double totalWeight = 0;

        /**
         *1.1 可以通过array[下标] 来访问数组的元素。
         *1.2 下标是从0开始编号的比如第一个元素就是array[0],第2个元素就是array[1],依次类推。
         *1.3 通过for就可以循环的访问 数组的元素/值,使用一个变量 totalWeight 将各个元素累积。
         */

        // 2.1 通过数组名.length，得到数组的大小/长度
        for (int i=0; i<array.length; i++){
            totalWeight += array[i];
        }
        // 2.2 输出
        System.out.println("总体重:" + totalWeight + ", 平均重量:" + totalWeight / array.length);
    }
}
```

### 5.3 数组的使用

#### 5.3.1 动态初始化

1、数组的定义

==数据类型 数组名[] = new 数据类型[大小]==

```java
int[] array = new int[3];
```

2、内存图分析

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210901104353.png)

3、代码实现

```java
public class ArrayDemo {
    public static void main(String[] args) {
        int array[] = new int[3];

        //输出数组名
        System.out.println(arr); //[I@880ec60

        //输出数组中的元素
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
```

#### 5.3.2 静态初始化

1、数组基本语法

==数据类型 数组名[] = {元素值, 元素值.....}==

2、代码实现

```java
public class ArrayDemo {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3};

        //输出数组名
        System.out.println(arr);

        //输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
```

#### 5.3.3 数组元素访问

1、什么是索引

每一个存储到数组的元素，都会自动的拥有一个编号，从0开始。这个自动编号称为数组索引(index)，可以通过数组的索引访问到数组中的元素。 	

2、案例实现

循环输入5个成绩，保存到`double`数组中，然后在通过索引输出。

```java
package cn.guardwhy.demo01;

import java.util.Scanner;

public class ArrayDemo02 {
    public static void main(String[] args) {

        //1.1 第一种动态分配方式
        double scores[] = new double[5];

        //1.2 第2种动态分配方式， 先声明数组，再 new 分配空间
        //double scores[] ; //声明数组， 这时 scores 是 null
        // scores = new double[5]; // 分配内存空间，可以存放数据

        // 1.3 创建myScanner对象
        Scanner scanner = new Scanner(System.in);
        for( int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+ (i+1) +"个元素的值");
            scores[i] = scanner.nextDouble();
        }

        //1.4 输出，遍历数组
        System.out.println("==数组的元素===");
        for( int i = 0; i < scores.length; i++) {
            System.out.println("第"+ (i+1) +"个元素的值=" + scores[i]);
        }
    }
}
```

#### 5.3.4 数组使用细节

1、注意事项

- 数组是多个相同类型数据的组合，实现对这些数据的统一管理
- 数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用。
- 数组创建后，如果没有赋值，有默认值。

```java
int 0，short 0, byte 0, long 0, float 0.0,double 0.0，char 0000，boolean false，String null
```

- 使用数组的步骤：(a)、声明数组并开辟空间 。(b)、给数组各个元素赋值。(c)、使用该声明数组。
- 数组的从 下标是从 0  开始的。
- 数组下标必须在指定范围内使用，否则报：下标越界异常，比如

```java
int [] arr=new int[5]; // 有效下标为 0-4
```

- 数组属引用类型，数组型数据是对象`(object)`

2、代码实现

```java
package cn.guardwhy.demo01;

public class ArrayDetail {
    public static void main(String[] args) {
        //1.1 数组是多个相同类型数据的组合，实现对这些数据的统一管理
        //int[] arr1 = {1, 2, 3, 60,"hello"};//String ->int
        double[] arr2 = {1.1, 2.2, 3.3, 60.6, 100};//int ->double

        //1.2数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用
        String[] arr3 = {"广州","guardwhy","milan"};

        //1.3数组创建后，如果没有赋值，有默认值
        short[] arr4 = new short[3];
        System.out.println("=====数组arr4=====");
        for(int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        //1.4 数组下标必须在指定范围内使用，否则报：下标越界异常，比如 
        //int [] arr=new int[5]; 则有效下标为 0-4 
        //即数组的下标/索引 最小 0 最大 数组长度-1(4)
        int [] arr = new int[5];
        //System.out.println(arr[5]);//数组越界

    }
}
```

### 5.4 数组应用案例

#### 5.4.1 数组应用案例1

创建一个`char`类型的 26 个元素的数组，分别 放置`'A'-'Z'`。使用 for 循环访问所有元素并打印出来。

```java
package cn.guardwhy.demo01;
/*
    思路分析
    1. 定义一个 数组  char[] chars = new char[26]
    2. 因为 'A' + 1 = 'B' 类推，所以老师使用for来赋值
    3. 使用for循环访问所有元素
*/
public class ArrayExercise01 {
    public static void main(String[] args) {
        // 1.1 定义chars数组
        char[] chars = new char[26];
        //1.2 遍历循环26次
        for( int i = 0; i < chars.length; i++) {
            //1.3 'A' + i 是int , 需要强制转换
            chars[i] = (char)('A' + i);
        }

        //1.4 循环输出
        System.out.print("chars数组:" + "[");
        for( int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.print("]");
    }
}
```

#### 5.4.2 数组应用案例2

请求出一个数组`int[]`的最大值 `{4,-1,9, 10,23}`，并得到对应的下标

```java
package cn.guardwhy.demo01;
/**思路分析
 * 1. 定义一个int数组 int[] array = {9,11,6,31,23};
 * 2. 假定max=array[0]是最大值, maxIndex=0;
 * 3. 从下标1开始遍历array，如果max < 当前元素,说明max不是真正的最大值,则max=当前元素; maxIndex=当前元素下标
 * 4. 当遍历这个数组array后, max就是真正的最大值，maxIndex最大值,对应的下标。
 */
public class ArrayExercise02 {
    public static void main(String[] args) {
        // 1.1 定义数组
        int[] array = {9,11,6,31,23};
        // 1.2 假定第一个元素就是最大值
        int max = array[0];
        // 1.3 设置最大值的索引
        int maxIndex = 0;

        //1.4 从下标 1 开始遍历数组
        for(int i = 1; i < array.length; i++) {
            //1.5 如果max < 当前元素
            if(max < array[i]) {
                //1.6 把max设置成 当前元素
                max = array[i];
                maxIndex = i;
            }
        }
        //1.5 当遍历这个数组array后 , max就是真正的最大值，maxIndex最大值下标
        System.out.println("最大值:" + max + ", 最大值索引:" + maxIndex);
    }
}
```

### 5.5 数组赋值机制

#### 5.5.1 基本概念

1、基本类型赋值

==基本数据类型赋值，这个值就是具体的数据，而且相互不影响==。

```java
int n1 = 2;
int n2 = n;
```

2、引用类型赋值

==数组在默认情况下是引用传递，赋的值是地址==。

```java
int[] array1 = {1,2,3}
int[] array2 = array1;
```

3、代码示例

```java
package cn.guardwhy.demo01;

import java.util.Arrays;

/**
 * 数组赋值机制
 */
public class ArrayAssign {
    public static void main(String[] args) {

        //1.1 基本数据类型赋值, 赋值方式为值拷贝
        int n1 = 10;
        int n2 = n1;
        n2 = 80;
        // 1.2 n2的变化，不会影响到n1的值
        System.out.println("n1=" + n1);//10
        System.out.println("n2=" + n2);//80

        /**
         * 2.1 数组在默认情况下是引用传递，赋的值是地址，赋值方式为引用赋值。
         * 2.2 引用赋值是一个地址, arr2变化会影响到 arr1
         */
        int[] arr1 = {1, 2, 3};
        //2.3 把 arr1赋给 arr2
        int[] arr2 = arr1;
        arr2[0] = 10;

        // 3.1 打印数组arr1元素的值
        System.out.print("arr1:" + "[" + arr1[0]);
        for(int i = 1; i < arr1.length; i++) {
            System.out.print(", " + arr1[i]);
        }
        System.out.println("]");    // arr1:[10, 2, 3]
        // 3.2 方式二
        // System.out.println("arr1:"+ Arrays.toString(arr1));

        // 3.3打印数组arr2元素
        System.out.println("arr2:" + Arrays.toString(arr2));    // arr2:[10, 2, 3]

    }
}
```

#### 5.5.2 内存分析

1、基本类型赋值内存图解

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210901174245.png" style="zoom:80%;" />

2、引用类型赋值内存图解

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210901174407.png" style="zoom:80%;" />

### 5.6 数组相关操作

#### 5.6.1 数组拷贝

1、代码示例

将`int[] arr1 = {10,20,30};` 拷贝到` arr2` 数组, 要求数据空间是独立的。

```java
package cn.guardwhy.demo01;
/*
* 数组拷贝
*/
public class ArrayCopyDemo01 {
    public static void main(String[] args) {
        // 1.1 定义arr1数组
        int[] arr1 = {10,20,30};

        //1.2 创建一个新的数组arr2,开辟新的数据空间大小为arr1.length
        int[] arr2 = new int[arr1.length];

        //1.3 遍历arr1，把每个元素拷贝到arr2对应的元素位置
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        //1.4 修改数组arr2，不会对arr1有影响.
        arr2[0] = 100;

        //1.5 输出数组arr1元素
        System.out.print("arr1:" + "[" + arr1[0]);
        for(int i = 1; i < arr1.length; i++) {
            System.out.print(", " + arr1[i]);
        }
        System.out.println("]");    // arr1:[10, 20, 30]

        //1.6 输出数组arr2元素
        System.out.print("arr2:" + "[" + arr2[0]);
        for(int i = 1; i < arr2.length; i++) {
            System.out.print(", " + arr2[i]);
        }
        System.out.println("]");    // arr2:[100, 20, 30]
    }
}
```

2、数组拷贝内存分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210901201441.png" style="zoom:80%;" />

#### 5.6.2 数组反转

需求：把数组`int[] arr = {11, 22, 33, 44, 55, 66};`的元素内容进行反转。

方式 1：通过找规律反转

```java
package cn.guardwhy.demo01;
/**
 * 1.把arr[0]和arr[5]进行交换{66,22,33,44,55,11}
 * 2.把arr[1]和arr[4]进行交换{66,55,33,44,22,11}
 * 3.把arr[2]和arr[3]进行交换{66,55,44,33,22,11}
 * 4.一共要交换3次=arr.length / 2
 * 5.每次交换时,对应的下标是arr[i]和arr[arr.length - 1 -i]
 */
public class ArrayReverse01 {
    public static void main(String[] args) {
        //1.1 定义数组
        int[] arr = {11, 22, 33, 44, 55, 66};
        System.out.println("===翻转前数组===");

        System.out.print("arr:" + "[" + arr[0]);
        // 1.2 遍历数组
        for(int i = 1; i < arr.length; i++) {
            System.out.print(", " + arr[i]);
        }
        System.out.println("]");    // arr:[11, 22, 33, 44, 55, 66]

        // 1.3 定义临时变量
        int temp = 0;
        //1.4 计算数组的长度
        int len = arr.length;
        // 1.5 遍历数组
        for( int i = 0; i < len / 2; i++) {
            temp = arr[len - 1 - i];
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }

        System.out.println("===翻转后数组===");
        System.out.print("arr:" + "[" + arr[0]);
        // 1.2 遍历数组
        for(int i = 1; i < arr.length; i++) {
            System.out.print(", " + arr[i]);
        }
        System.out.println("]");    // arr:[66, 55, 44, 33, 22, 11]
    }
}
```

2、使用逆序赋值方式

```java
package cn.guardwhy.demo01;
/*
* 逆序赋值方式
 */
public class ArrayReverse02 {
    public static void main(String[] args) {
        //1.1定义数组arr1
        int[] arr1 = {11, 22, 33, 44, 55, 66};
        System.out.println("===arr1数组逆序前===");

        System.out.print("arr1:" + "[" + arr1[0]);
        // 1.2 遍历数组
        for(int i = 1; i < arr1.length; i++) {
            System.out.print(", " + arr1[i]);
        }
        System.out.println("]");

        // 1.3 声明arr2数组长度
        int[] arr2 = new int[arr1.length];
        //1.4 逆序遍历数组，当for循环结束，arr2就是一个逆序的数组 {66, 55, 44,33, 22, 11}
        for(int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = arr1[i];
        }
        //1.5 让arr1指向arr2数据空间, 此时arr1原来的数据空间就没有变量引用会被当做垃圾，销毁
        arr1 = arr2;

        System.out.println("====arr1数组逆序后========");
        System.out.print("arr1:" + "[" + arr1[0]);
        // 1.6 遍历数组
        for(int i = 1; i < arr1.length; i++) {
            System.out.print(", " + arr1[i]);
        }
        System.out.println("]");

    }
}
```

运行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210902025048.png)

#### 5.6.3 数组添加/扩容

1、需求实现: 

- 实现动态的给数组添加元素效果，实现对数组扩容。原始数组使用静态分配 `int[] arr1 = {1,2,3}`
- 增加的元素 4，直接放在数组的最后 `arr1 = {1,2,3,4}`
- 用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？`y/n`

```java
package cn.guardwhy.demo01;

import java.util.Scanner;
/**
 * 1.1. 创建一个 Scanner可以接受用户输入
 * 1.2 定义初始数组 int[] arr1 = {1,2,3}//下标0-2
 * 1.3 定义一个新的数组 int[] arrNew = new int[arr.length+1];
 * 1.4 遍历arr1数组，依次将arr的元素拷贝到 arrNew数组
 * 1.5 将addNum赋给arrNew[arrNew.length-1]=addNum;把addNum赋给arrNew最后一个元素。
 * 1.6 让arr1指向arrNew;arr1 = arrNew;原来arr1数组就被销毁
 */
public class ArrayAdd01 {
    public static void main(String[] args) {
        // 1.1 创建scanner对象
        Scanner scanner = new Scanner(System.in);
        // 1.2 初始化数组
        int[] arr1 = {1, 2, 3};

        do{
            // 1.3 创建一个新数组
            int[] arrNew = new int[arr1.length + 1];
            //1.4 遍历arr1数组，依次将arr1的元素拷贝到arrNew数组
            for (int i=0; i<arr1.length; i++){
                arrNew[i] = arr1[i];
            }
            System.out.println("请输入要添加的元素:");
            int addNum = scanner.nextInt();

            // 1.5 将addNum赋值给arrNew最后一个元素
            arrNew[arrNew.length-1] = addNum;
            // 1.6 将arrNew数组赋值给arr1
            arr1 = arrNew;
            // 1.7 遍历数组
            System.out.print("arr1数组(扩容):" + "[" + arr1[0]);
            for(int i = 1; i < arr1.length; i++) {
                System.out.print(", " + arr1[i]);
            }
            System.out.println("]");
            // 1.8 问用户是否继续
            System.out.println("是否继续添加 y/n");
            char key = scanner.next().charAt(0);
            // 1.9 条件判断
            if(key == 'n'){
                break;
            }
        }while (true);

        System.out.println("退出了添加...");
    }
}
```

2、内存分析

```java
// 1.1 定义数组
int[] arr1 = {1,2,3};
// 1.2 创建新数组
int[] arrNew = new int[arr1.length + 1];
// 1.3 遍历arr1数组，依次将arr1的元素拷贝到arrNew数组
for(int i=0; i<arr1.length; i++){
    arrNew[i] = arr1[i];
}
// 1.4 将4赋值给arrNew最后一个元素
arrNew[arrNew.length-1] = 4;
// 1.5 让arr1指向arrNew
arr1 = arrNew;
```

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210902124502.png)

### 5.7 二维数组

#### 5.7.1 二维数组入门

1、基本介绍

Java支持多维数组。多维数组声明的一般形式如下：

```java
type name[size1][size2]...[sizeN];
```

例如，下面的声明创建了一个三维 5 . 10 . 4 整型数组

```java
int threedim[5][10][4];
```

一个二维数组可以被认为是一个带有 x 行和 y 列的表格。下面是一个二维数组，包含 3 行和 4 列：

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210902131426.jpg)

多维数组最简单的形式是二维数组。一个二维数组，在本质上，是一个一维数组的列表。

```java
// 声明一个 3行 4列的二维整型数组，形式如下：
int a[3][4] = {  
 {0, 1, 2, 3} ,   /*  初始化索引号为 0 的行 */
 {4, 5, 6, 7} ,   /*  初始化索引号为 1 的行 */
 {8, 9, 10, 11}   /*  初始化索引号为 2 的行 */
};
```

2、案例实现

请用二维数组输出如下图形

​      0 0 0 0 0 0

​      0 0 1 0 0 0

​      0 2 0 3 0 0

​      0 0 0 0 0 0

```java
package cn.guardwhy.demo02;
/**
 * 二维数组快速入门 
 */
public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        // 1.1 定义二维数组
        int[][] arr = { {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0,2,  0, 3, 0, 0},
                {0, 0, 0, 0, 0, 0} };

        // 1.2 二维数组的个数
        System.out.println("二维数组元素个数:" + arr.length);

        // 1.3 二维数组的每个元素是一维数组, 所以如果需要得到每个一维数组的值还需要再次遍历
        // 如果要访问第 (i+1)个一维数组的第j+1个值 arr[i][j];
        System.out.println("第3个一维数组的第4个值是:" + arr[2][3]);

        // 1.4 输出二维图形
        for (int i=0; i<arr.length; i++){
            //1.5 arr[i]表示二维数组的第i+1个元素比如arr[0]：二维数组的第一个元素
            //1.6 arr[i].length得到对应的每个一维数组的长度
            for(int j=0; j<arr[i].length; j++){
                // 1.7 输出一维数组
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210902150110.png" style="zoom:80%;" />

#### 5.7.2 动态初始化

1、基本介绍

基本语法: ==类型[][] 数组名=new 类型[大小] [大小]==

```java
int[][] arr1 = new int[2][3];
```

2、代码示例

```java
package cn.guardwhy.demo02;
/**
 * 二维数组遍历
 */
public class TwoDimensionalArray02 {
    public static void main(String[] args) {
        // 1.1 声明二维数组，并且初始化
        int arr1[][] = new int[2][3];
        // 1.2 赋值操作
        arr1[1][1] = 6;

        //1.3 遍历arr1数组
        for(int i = 0; i < arr1.length; i++) {
            //1.4 对每个一维数组遍历
            for(int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] +" ");
            }
            System.out.println();//换行
        }
    }
}
```

3、二维数组内存分析

```java
// 1.1 定义二维数组
int arr1[][] = new int[2][3];
// 1.2 赋值操作
arr1[1][1] = 6;
```

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210902170350.png" style="zoom:80%;" />

#### 5.7.3 静态初始化

1、基本介绍

==类型 数组名[][] = {{值 1,值 2..},{值 1,值 2..},{值 1,值 2..}}==

```java
int[][] arr = {{1,1,1}, {8,8,9}, {100}};
```

2、案例代码实现

定义数组`int arr[][]={{4,6},{1,4,5,7},{-2}}; `遍历该二维数组，并求出该数组元素的和？

```java
package cn.guardwhy.demo02;
/**
 * 思路分析
 * 遍历二维数组，并将各个值累计到 int sum
 */
public class TwoDimensionalArray03 {
    public static void main(String[] args) {
        // 1.1 定义二维数组
        int arr[][]= {{4,6},{1,4,5,7},{-2}};
        // 1.2 定义sum值
        int sum = 0;
        // 1.3 遍历数组
        for(int i = 0; i < arr.length; i++) {
            //遍历每个一维数组
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("sum=" + sum);	// sum = 25
    }
}
```

#### 5.7.4 二维数组的应用案例

1、使用二维数组打印一个6行杨辉三角。

```java
package cn.guardwhy.demo02;
/*
使用二维数组打印一个6行杨辉三角
1
1 1
1 2 1
1 3 3  1
1 4 6  4  1
1 5 10 10 5 1

二维数组规律
 1.第一行有 1 个元素, 第 n 行有 n 个元素
 2.每一行的第一个元素和最后一个元素都是 1
 3.从第三行开始, 对于非第一个元素和最后一个元素的元素的值. arr[i][j]
  arr[i][j]  =  arr[i-1][j] + arr[i-1][j-1]; //必须找到这个规律
*/
public class TwoDimensionalArray03 {
    public static void main(String[] args) {
        // 1.1 定义二维数组
        int[][] array = new int[6][];
        // 1.2 遍历array的每个元素
        for (int i=0; i<array.length; i++){
            // 1.3 给每个一维数组开空间
            array[i] = new int[i+1];
            // 1.4 给每个一维数组赋值
            for(int j=0; j<array[i].length; j++){
                //1.5 每一行的第一个元素和最后一个元素都是1
                if(j ==0 || j == array[i].length - 1){
                    array[i][j] = 1;
                }else {
                    // 1.6 中间的元素
                    array[i][j]  =  array[i-1][j] + array[i-1][j-1];
                }
            }
        }

        // 2.1 输出杨辉三角
        for(int i=0; i < array.length; i++){
            // 2.2 遍历输出该行
            for(int j=0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            // 2.3 换行对象
            System.out.println();
        }
    }
}
```

#### 5.8 二维数组使用细节

- 一维数组的声明方式有

```java
int[] x 或者 int x[]
```

- 二维数组的声明方式有

```java
int[][] y  或者 int[] y[] 者 或者 int y[][]
```

- 二维数组实际上是由多个一维数组组成的，它的各个一维数组的长度可以相同，也可以不相同。

```java
map[][]是一个二维数组,int map [][] = {{1,2},{3,4,5}};
map[0]是一个含有两个元素的一维数组 ，map[1] 是一个含有三个元素的一维数组构成，也称为列数不等的二维数组
```

### 5.8 经典案例

#### 5.8.1 案例一

1、已知有个升序的数组，要求键盘插入一个元素，该数组顺序依然是升序。比如数组`arr ={10,12,45,90};`添加23 后, 数组`arr={10,12,23,45,90};`

```java
package cn.guardwhy.demo02;

import java.util.Scanner;

/**
 * 思路 本质数组扩容+定位
 * 1. 先确定 添加数应该插入到哪个索引
 * 2. 然后扩容
 */
public class TwoDimensionalArray04 {
    public static void main(String[] args) {
        // 1.0 定义原数组
        int[] array = {10, 12, 45, 90};
        // 1.1 创建scanner对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组元素: ");

        // 1.2 输入元素
        int insertNum = scanner.nextInt();
        // 1.3 定义索引要插入的位置
        int index = -1;

        System.out.println("====array(插入前)========");
        System.out.print("array:" + "[" + array[0]);
        // 1.4 遍历数组
        for(int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println("]");
        
        /**
         * 1.5 思路分析
         * 遍历array数组，如果发现insertNum<=array[i],说明 i 就是要插入的位置,使用index保留 index = i;
         * 如果遍历完后，没有发现 insertNum<=array[i]， 说明 index = arr.length，即：添加到array的最后。
         */
        for(int i=0; i< array.length; i++){
            if(insertNum <= array[i]){
                // 将i的值赋值给index
                index = i;
                // 找到位置后，就退出
                break;
            }
        }
        // 1.6 判断index的值
        if(index == -1){
            index = array.length;
        }

        // 1.7 扩容操作，先创建一个新的数组，大小为array.length + 1
        int[] arrayNew = new int[array.length + 1];

        /**
         * 1.8 将array的元素拷贝到arrayNew,并且要跳过index位置
         * 分析:
         * int[] array = {10, 12, 45, 90};
         * arrayNew = { };
        */
        //i 控制arrayNew的下标  , j用来控制array数组的下标
        for (int i=0, j=0; i<arrayNew.length; i++){
            // 1.9 将array数组元素拷贝到arrayNew元素
            if(i != index){
                arrayNew[i] = array[j];
                j++;
            }else{
                // 1.10 i这个位置就是要插入的数
                arrayNew[i] = insertNum;
            }
        }
        // 1.11 让array指向arrayNew,原来的数组，就成为垃圾，被销毁
        array = arrayNew;

        System.out.println("====array(插入后)========");
        System.out.print("array:" + "[" + array[0]);
        // 1.12 遍历数组
        for(int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println("]");
    }
}
```

2、执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210903132818.png" style="zoom:80%;" />

#### 5.8.2 案例二

1、随机生成10个整数(1~100的范围)保存到数组，并倒序打印以及求平均值、求最大值和最大值的下标，并查找里面是否有 8。

```java
package cn.guardwhy.demo02;

public class ArrayExercise02 {
    public static void main(String[] args) {
        // 1.1 定义arr数组
        int[] arr = new int[10];
        // 1.2 遍历数组
        for(int i = 0; i < arr.length; i++) {
            //1.3 生产 随机数 1-100
            arr[i] = (int)(Math.random() * 100) + 1;
        }

        System.out.println("====arr的元素情况=====");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("\n====arr的元素情况(倒序)=====");
        for(int i = arr.length -1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(" ");

        // 1.4 定义sum值
        double sum = arr[0];
        // 1.5 定义max值
        int max = arr[0];
        // 1.6 定义最大值的索引
        int maxIndex = 0;
        for(int i = 1; i < arr.length; i++ ) {
            //1.7 累积和
            sum += arr[i];
            //1.8 说明max不是最大值，就变化
            if( max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("===平均值 最大值 最大值的下标===");
        System.out.println("最大值：" + max + "，最大值索引:" + maxIndex);
        System.out.println("平均值=" + (sum / arr.length));

        //1.9 查找数组中是否有8
        System.out.println("===查找数组中是否有8===");
        int findNum = 8;
        //1.10 如果找到，就把下标记录到index
        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            if(findNum == arr[i]) {
                System.out.println("该数组元素:" + findNum + "该元素下标:" + i);
                index = i;
                break;
            }
        }
        // 1.11 条件判断
        if(index == -1) {
            System.out.println("数组中不存在:" + findNum + "元素" );
        }
    }
}
```

## 第6章 Java面向对象编程(入门)

### 6.1 类和对象

#### 6.1.1 看一个学生信息问题

学校管理系统里面有几个学生信息:第一个学生名字叫小明,今年18岁，成绩是88分。第一个学生名字叫小红,今年19岁，成绩是78分。编写一个程序，当输入学生的名字时，就显示该学生的名字，年龄，分数。如果输入的学生姓名错误，则显示学校不存在这个学生。

#### 6.1.2 使用现有技术解决

1、解决方案

- 单独的定义变量解决。
- 使用数组解决。

2、现有技术解决的缺点

- 不利于数据的管理。、
- 效率低===> 引出新知识点 类与对象(OOP) ，根本原因就是现有的技术，不能完美的解决新的新的需求.

#### 6.1.3 类与对象示意图

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210903203729.png)

#### 6.1.4 快速入门-面向对象

```java
package cn.guardwhy.demo01;

// 1.1 定义一个学生类
class Student{
    String userName; // 姓名
    int userAge; // 年龄
    int score; // 分数
}

public class Object1 {
    public static void main(String[] args) {
        // 1.2 创建stu1对象
        Student stu1 = new Student();
        stu1.userName = "小明";
        stu1.userAge = 18;
        stu1.score = 88;

        // 1.2 创建stu2对象
        Student stu2 = new Student();
        stu2.userName = "小红";
        stu2.userAge = 19;
        stu2.score = 78;

        // 1.3 访问对象元素
        System.out.println("学生姓名:" + stu1.userName + ",年龄:" +stu1.userAge + ",分数:" + stu1.score);
        System.out.println("学生姓名:" + stu2.userName + ",年龄:" +stu2.userAge + ",分数:" + stu2.score);
    }
}
```

#### 6.1.5 类和对象的区别

1) 类是抽象的，概念的，代表一类事物,比如人类,猫类......即它是数据类型。
2) ==对象是具体的，实际的，代表一个具体事物, 即是实例==。
3) ==类是对象的模板，对象是类的一个个体，对应一个实例==。

#### 6.1.6 对象在内存中存在形式

1、代码示例

```java
// 1.2 创建stu1对象
Student stu1 = new Student();
stu1.userName = "小明";
stu1.userAge = 18;
stu1.score = 88;
```

2、注意：==字符串是引用数据类型，它会把数据类型放在方法区中的常量池中！！！==

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210903214813.png" style="zoom:80%;" />

#### 6.1.7 属性/成员变量/字段

1、基本介绍

- 从概念上看：`成员变量 = 属性 = field(字段)` (即成员变量是用来表示属性的，统一叫属性)

```java
package cn.guardwhy.demo01;

// 1.1定义Car类
class Car{
    String brandName;//属性, 成员变量, 字段 field
    double price;
    String color;
    String[] master;//属性可以是基本数据类型，也可以是引用类型(对象，数组)
}

public class Object02 {
    public static void main(String[] args) {
        /**
        	1.1 car1是对象名(对象引用)
        	1.2 new Car() 创建的对象空间(数据)，才是真正的对象！！
        */
        Car car1 = new Car();
    }
}
```

- 属性是类的一个组成部分，一般是基本数据类型,也可是引用类型(对象，数组)。

2、注意事项

- 属性的定义语法同变量，示例：==访问修饰符 属性类型 属性名;==【访问修饰符:  控制属性的访问范围】,有四种访问修饰符`public`, `proctected`, 默认, `private`
- 属性的定义类型可以为任意类型，包含基本类型或引用类型，属性如果不赋值，有默认值，规则和数组一致。

#### 6.1.8 如何创建对象和访问属性

1、如何创建对象

- 先声明再创建

```java
Student stu ; //声明对象 cat
stu = new Student(); //创建
```

- 直接创建

```java
Student stu = new Student();
```

2、如何访问属性

- 基本语法 ：`对象名.属性名;`

```java
package cn.guardwhy.demo01;

// 1.1 定义一个学生类
class Student{
    String userName; // 姓名
    int userAge; // 年龄
    int score; // 分数
}

public class Object1 {
    public static void main(String[] args) {
        // 1.2 创建stu1对象
        Student stu1 = new Student();
        stu1.userName = "小明";
        stu1.userAge = 18;
        stu1.score = 88;
        
        // 1.3 访问对象元素
        System.out.println("学生姓名:" + stu1.userName + ",年龄:" +stu1.userAge + ",分数:" + stu1.score);
    }
}
```

#### 6.1.9 类和对象的内存分配机制

1、定义一个人类(Person)(包括 名字,年龄)，获取访问属性，并且画出对应的内存图

```java
package cn.guardwhy.demo02;

// 创建Person对象
class Person {
    String name;
    int age;
}

public class Object1 {
    public static void main(String[] args) {
        // 创建对象
        Person p1 = new Person();
        // 给属性名赋值
        p1.age = 10;
        p1.name = "Curry";
        // 把p1赋值给p2,让p2指向p1
        Person p2 = p1;
        // 输出年龄
        System.out.println(p2.age); // 10
    }
}
```

2、代码执行流程

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210904013617.png" style="zoom:80%;" />

3、Java 内存的结构分析

1) 栈： 一般存放基本数据类型(局部变量)。
2) 堆： 存放对象(Student stu , 数组等)。
3) 方法区：常量池(常量，比如字符串)， 类加载信息。

4、常见面试题

下面一段代码，会出现什么信息？

```java
package cn.guardwhy.demo02;

// 创建Person对象
class Person {
    String name;
    int age;
}

public class Object1 {
    public static void main(String[] args) {
        // 创建对象
        Person p1 = new Person();
        // 1.2 给属性赋值
        p1.age = 12;
        p1.name = "Curry";

        // 1.3 赋值操作
        Person p2;
        // p2指向p1
        p2 = p1;
        System.out.println(p2.name);    // Curry
        p2.age = 32;

        // 置空操作
        p2 = null;
        // 输出年龄
        System.out.println(p1.age); // 32
        // System.out.println(p2.age); // 异常
    }
}
```

内存分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210904015106.png" style="zoom:80%;" />

### 6.2 成员方法

#### 6.2.1 基本介绍

在某些情况下，要需要定义成员方法(简称方法)。比如人类:除了有一些属性外( 年龄，姓名..)，人类还有一些行为比如:可以说话、跑步、学习这些属性，这时就要用成员方法才能完成。

#### 6.2.2 成员方法快速入门

1、需求实现

- 添加`study` 成员方法,输出 `“我爱学习Java”`。
- 添加`cal01`成员方法,可以计算从`1+..+1000` 的结果。
- 添加`cal02`成员方法,该方法可以接收一个数` n`，计算从`1+..+n` 的结果。
- 添加`getSum`成员方法，计算两个数的和

2、代码实现

```java
package cn.guardwhy.demo02;

// 创建Person对象
class Student {
    String name; // 姓名属性
    int age; // 年龄属性

    /**
     * 1.1 思路分析
     * public 表示方法是公开,void:表示方法没有返回值。
     * study():study是方法名，() 形参列表
     * {} 方法体，可以写我们要执行的代码
     * System.out.println("我爱学习Java"); 表示我们的方法就是输出一句话
     */
    public void study() {
        System.out.println("我爱学习Java");
    }

    /**
     * 1.2 添加cal01 成员方法,可以计算从 1+..+1000的结果
     */
    public void cal01() {
        //定义res变量
        int res = 0;
        for(int i = 1; i <= 1000; i++) {
            res += i;
        }
        System.out.println("cal01方法(计算和):" + res);
    }

    /**
     * 1.3 添加cal02成员方法,该方法可以接收一个数n，计算从 1+..+n 的结果
     * (int n) 形参列表， 表示当前有一个形参 n, 可以接收用户输入
     */
    public void cal02(int n) {
        //循环完成
        int res = 0;
        for(int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("cal02方法(计算和):" + res);
    }

    /**
     * 1.4 思路分析
     * 添加getSum成员方法,可以计算两个数的和
     * public表示方法是公开的,int:表示方法执行后，返回一个int值
     * getSum 方法名(int num1, int num2)形参列表，2个形参可以接收用户传入的两个数。
     * return res; 表示把res的值返回。
     */
    public int getSum(int num1, int num2) {
        // 定义结果值
        int result = num1 + num2;
        return result;
    }
}

public class Method01 {
    public static void main(String[] args) {
        //2.1 先创建对象 ,然后调用方法即可
        Student stu = new Student();
        // 2.2 对象调用方法
        stu.study();
        stu.cal01();
        // 2.2 调用cal02方法，同时给n = 5
        stu.cal02(5);

        /**
         * 调用getSum方法，同时num1=10, num2=20,把方法getSum 返回的值，赋给变量sum
         */
        int sum = stu.getSum(10, 20);
        System.out.println("sum值:" + sum);
    }
}
```

#### 6.2.3 方法调用机制原理

1、代码示例

```java
package cn.guardwhy.demo02;

// 创建Person对象
class Student {
    String name; // 姓名属性
    int age; // 年龄属性

    /**
     * 1.1 思路分析
     * 添加getSum成员方法,可以计算两个数的和
     * public表示方法是公开的,int:表示方法执行后，返回一个int值
     * getSum 方法名(int num1, int num2)形参列表，2个形参可以接收用户传入的两个数。
     * return res; 表示把res的值返回。
     */
    public int getSum(int num1, int num2) {
        // 定义结果值
        int result = num1 + num2;
        return result;
    }
}

public class Method01 {
    public static void main(String[] args) {
        //2.1 先创建对象 ,然后调用方法即可
        Student stu = new Student();
        /**
         * 调用getSum方法，同时num1=10, num2=20,把方法getSum 返回的值，赋给变量sum
         */
        int sum = stu.getSum(10, 20);
        System.out.println("sum值:" + sum);
    }
}
```

2、内存分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210904125556.png" style="zoom:80%;" />

当程序执行到方法时，就会开辟一个独立的空间【栈空间】。

当方法执行完毕，或者执行到`return`语句时，就会返回。返回到调用方法的地方。

返回后，继续执行方法后面的代码，当`main方法(栈)`执行完毕，整个程序退出。

3、成员方法的好处

- 提高代码的复用性。
- 可以将实现的细节封装起来，然后供其他用户来调用即可。

#### 6.2.4 成员方法的定义

1、基本语法

```java
访问修饰符 返回数据类型 方法名（形参列表..） {//方法体
    语句；
    return 返回值;
}
```

- **形参列表**：表示成员方法输入`cal(int n) ， getSum(int num1, int num2)`。
- **返回数据类型**：表示成员方法输出, `void` 表示没有返回值
- **方法主体**：表示为了实现某一功能代码块，`return` 语句不是必须的。

#### 6.2.5 注意事项

1、返回数据类型

- 一个方法最多有一个返回值。
- 返回类型可以为任意类型，包含基本类型或引用类型(数组，对象)。
- 如果方法要求有返回数据类型，则方法体中最后的执行语句必须为`return` 值; 而且要求返回值类型必须和`return`的值类型一致或兼容。
- 如果方法是`void`则方法体中可以没有 return 语句或者只写 return ;

2、方法名

- 遵循驼峰命名法，最好见名知义，表达出该功能的意思即可, 比如 得到两个数的和`getSum`, 开发中按照规范。

3、形参列表

- 一个方法可以有0个参数，也可以有多个参数，中间可以用逗号`(,)`隔开。比如`getSum(int n1, int n2)`。
- 参数类型可以任意类型，包含基本类型或者引用类型，比如`printArray(int[][] list)`
- 调用带参数的方法时，一定对应着参数列表传入相同类型或者兼容类型的参数
- 方法定义时的参数称为形式参数，简称形参。方法调用时的传入参数称为实际参数，简称实参。实参和形参的类型要求一致或兼容、个数、顺序必须一致。

4、方法体

里面写完成功能的具体的语句，可以为输入、输出、变量、运算、分支、循环、方法调用，但是里面不能再定义方法!(==即:方法不能嵌套定义==)

```java
package cn.guardwhy.demo02;
// 1 定义number类
class Number{
    /**
     * 1.1 一个方法最多有一个返回值
     */
    public int[] getSumAndSub(int n1, int n2) {
        // 创建数组对象
        int[] array = new int[2];
        array[0] = n1 + n2;
        array[1] = n1 - n2;
        return array;
    }

    /**
     * 1.2返回类型可以为任意类型，包含基本类型或引用类型(数组,对象)
     * 具体看 getSumAndSub
     */

    /**
     * 1.3 如果方法要求有返回数据类型，则方法体中最后的执行语句必须为return值;
     * 而且要求返回值类型必须和return的值类型一致或兼容。
     */
    public double method01() {
        // 定义变量d1
        double d1 = 1.1 * 3;
        int n = 100;
        return n; // int ->double
        //return d1; //ok? double -> int
    }

    /**
     * 1.4 如果方法是void，则方法体中可以没有return语句，或者只写 return ;
     */
    public void method02() {
        System.out.println("hello Java");
        System.out.println("hello Java");
        System.out.println("hello Java");
        int n = 10;
        //return ;
    }

    /**
     * 1.5 定义方法method03
     */
    public void method03(String str, int n){

    }

    // 1.6 方法不能嵌套
    public void  method04(){
        // 错误
        // public void method05(){}
    }
}

public class MethodDetail01 {
    public static void main(String[] args) {
        // 2.1 创建对象
        Number nb = new Number();
        // 2.2 调用方法
        int[] result = nb.getSumAndSub(1, 6);
        System.out.println("sum(+):=" + result[0]);
        System.out.println("sum(-):=" + result[1]);

        //2.3 调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型的参数
        byte b1 = 1;
        byte b2 = 2;
        nb.getSumAndSub(b1, b2); // byte -> int

        // 2.4 细节: 实参和形参的类型要一致或兼容、个数、顺序必须一致
        //nb.getSumAndSub(1.1, 1.8);//double ->int(×)

        // 2.5 调用method03方法
        nb.method03("guardwhy", 11);
        // 实际参数和形式参数顺序不对
        // nb.method03("11", "string");
    }
}
```

5、方法调用细节

同一个类中的方法调用: 直接调用即可。

跨类中的方法A类调用B类的方法，需要通过对象名调用，比如(对象名.方法名(参数))

```java
package cn.guardwhy.demo03;

// 1.定义Number01类
class Student{
    // 1.1 定义打印方法
    public void print(int n){
        System.out.println("print()方法被调用 n= " + n);
    }
    // 1.2 定义say方法
    public void say(){
        //say调用 print方法(直接调用即可)
        print(11);
        System.out.println("继续执行say方法");
    }

    //1.3 跨类中的方法Student类调用Person类方法：需要通过对象名调用
    public void study(){
        //创建Person对象, 然后在调用方法即可
        System.out.println("Student类中的study()方法被调用！！！");
        // 创建p1对象
        Person p1 = new Person();
        // 对象调用方法
        p1.teach();
        System.out.println("Student类中的study()方法继续执行！！！");
    }
}

// 2.定义Number02类
class Person{
    public void teach(){
        System.out.println("Person类中的teach()方法被执行！！！");
    }
}

public class MethodDetail02 {
    public static void main(String[] args) {
        // 1.创建Student对象
        Student stu = new Student();
        // 2.对象调用方法
        stu.study();
        // stu.print(10);
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210904212830.png)

### 6.3 成员方法传参机制

#### 6.3.1 基本数据类型

1、代码示例

```java
package cn.guardwhy.demo04;

// 1、创建AA类
class AA{
    public void swap(int a,int b){
        System.out.println("交换前的值\na="+ a +",b="+ b);//a=10 b=20

        //1.1 执行a和b的交换
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("交换后的值\na="+a+ ",b=" + b);//a=20 b=10
    }
}

public class MethodParameter01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //2.1 创建AA对象 名字 obj
        AA obj = new AA();
        //2.2 调用swap
        obj.swap(a, b);
        // 2.3 输出结果
        System.out.println("main(方法)a=" + a + ",b=" + b); // main(方法)a=10,b=20
    }
}
```

2、内存分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210905123530.jpg" style="zoom: 33%;" />

3、结论

==基本数据类型，传递的是值【值拷贝】，形参的任何改变不影响实参==！！！

#### 6.3.2 引用数据类型(数组)

1、案例需求

`B` 类中编写一个方法`method01`，可以接收一个数组，在方法中修改该数组，看看原来的数组是否变化？

```java
package cn.guardwhy.demo04;

// 1、创建B对象
class B {
    //1.1 B类中编写一个方法method01，可以接收一个数组，在方法中修改该数组，看看原来的数组是否变化
    public void method01(int[] array) {
        //1.2 修改元素
        array[0] = 200;
        //1.3 遍历数组
        System.out.print("array数组(method01方法):" + "[" + array[0]);
        for(int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println("]");    // array数组(method01方法):[200, 2, 3]
    }
}

public class MethodParameter02 {
    public static void main(String[] args) {
        //2.1 创建b对象
        B b = new B();
        // 2.2 创建array数组
        int[] array = {1, 2, 3};
        //2.3 调用方法method01方法
        b.method01(array);

        //2.4 遍历数组
        System.out.print("array数组(main方法):" + "[" + array[0]);
        for(int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println("]");    // array数组(main方法):[200, 2, 3]
    }
}
```

2、数组(引用类型)内存分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210905124805.jpg" style="zoom: 33%;" />

3、结论

==引用类型(数组)传递的是地址，(传递的也是值，但是值是地址)，可以通过形参影响实参==。

#### 6.3.3 引用数据类型(对象)

1、需求实现

`Student`类中编写一个方法 `method02`，可以接收一个 `Person(name, age)`对象，在方法中修改该对象属性，看看原来的对象是否变化？

```java
package cn.guardwhy.demo04;
// 1.创建Person类
class Person {
    String name; // 姓名
    int age; // 年龄
}
// 2、创建Student类
class Student {
    // 2.1 创建method02方法
    public void method02(Person p) {
        // 2.2 修改对象属性
        p.age = 33;
    }
}
public class MethodParameter03 {
    public static void main(String[] args) {
        // 创建stu对象
        Student stu = new Student();
        // 创建p对象
        Person p = new Person();
        p.name = "Curry";
        p.age = 10;
        stu.method02(p);
        // 输出结果
        System.out.println("age(main方法):" + p.age);	// age(main方法):33
    }
}
```

2、对象(引用类型)内存分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210905150952.jpg" style="zoom:33%;" />

3、结论

==引用类型(对象)传递的是地址，(传递的也是值，但是值是地址)，可以通过形参影响实参==。

#### 6.3.4 引用数据类型(案例实现)

1、需求实现

`Student`类中编写一个方法 `method03`，可以接收一个 `Person(name, age)`对象，如果method03方法中，执行的是`p = null`，看看原来的对象是否变化？

```java
package cn.guardwhy.demo5;
// 1.创建Person类
class Person {
    String name; // 姓名
    int age; // 年龄
}

// 2、创建Student类
class Student {
    // 2.1 创建method03方法
    public void method03(Person p) {
        // 2.2 修改对象属性
        p = null;
    }
}

public class MethodParameter01 {
    public static void main(String[] args) {
        // 创建stu对象
        Student stu = new Student();
        // 创建p对象
        Person p = new Person();
        p.name = "Curry";
        p.age = 10;
        stu.method03(p);
        // 输出结果
        System.out.println("age(main方法):" + p.age); // age(main方法):10
    }
}
```

2、对象(引用类型)内存分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210905155722.jpg" style="zoom: 33%;" />

3、需求实现

`Student`类中编写一个方法 `method04`，可以接收一个Person对象，如果`method03`方法中，执行的是`p = new Person();`看看原来的对象是否变化？

```java
package cn.guardwhy.demo5;
// 1.创建Person类
class Person {
    String name; // 姓名
    int age; // 年龄
}

// 2、创建Student类
class Student {
    // 2.1 创建method04方法
    public void method04(Person p) {
        // 2.2 创建对象
        p = new Person();
        // 2.2 修改对象属性
        p.name = "guardwhy";
        p.age = 27;
    }
}

public class MethodParameter01 {
    public static void main(String[] args) {
        // 创建stu对象
        Student stu = new Student();
        // 创建p对象
        Person p = new Person();
        p.name = "Curry";
        p.age = 10;
        stu.method04(p);
        // 输出结果
        System.out.println("age(main方法):" + p.age); // age(main方法):10
    }
}
```

4、对象(引用类型)内存分析

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210905174414.jpg)

#### 6.3.5 克隆对象

1、需求实现

编写一个方法`copyPerson`可以复制一个`Person`对象，返回复制的对象。要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同。

```java
package cn.guardwhy.demo06;
// 1.创建Person类
class Person {
    String name; // 姓名
    int age; // 年龄
}

/**
 *2.1 方法的返回类型Person，方法的名字copyPerson
 *2.2 方法的形参(Person p)方法体, 创建一个新对象并复制属性，返回即可。
 */
class MyTools{
    public Person copyPerson(Person p){
        // 创建一个新的对象
        Person p2 = new Person();
        // 把原来对象的名字赋值给p2.name
        p2.name = p.name;
        // 将原来的对象年龄赋值p2.age
        p2.age = p.age;
        // 返回对象
        return p2;
    }
}

public class MethodExercise01 {
    public static void main(String[] args) {
        // 3.1 创建p1对象
        Person p1 = new Person();
        // 3.2 给属性赋值
        p1.name = "guardwhy";
        p1.age = 27;
        // 3.3 创建tools
        MyTools tools = new MyTools();
        Person p2 = tools.copyPerson(p1);
        // 3.4 到此p和p2是person对象，但是这是两个独立的对象，属性相同
        System.out.println("对象p1(name):" + p1.name + ", 对象p1(age):" + p1.age ); // 对象p1(name):guardwhy, 对象p1(age):27
        System.out.println("对象p2(name):" + p2.name + ", 对象p2(age):" + p2.age ); // 对象p2(name):guardwhy, 对象p2(age):27
        //3.5 可以同对象比较看看是否为同一个对象
        System.out.println(p1 == p2);//false
    }
}
```

### 6.4 方法递归调用

#### 6.4.1 基本概念

简单的说:  递归就是方法自己调用自己,每次调用时传入不同的变量。递归有助于编程者解决复杂问题,同时可以让代码变得简洁。

#### 6.4.2 递归实现

1、打印问题

```java
package cn.guardwhy.demo06;

// 1.创建T类
class T{
    // 1.1 思路分析
    public void method01(int n){
        // 1.2 条件判断
        if(n > 2){
            method01(n -1);
        }
        System.out.println("n的值:" + n); // n的值:2 n的值:3 n的值:4
    }
}

public class Recursion01 {
    public static void main(String[] args) {
        // 2.1 创建t1对象
        T t1 = new T();
        // 2.2 对象调用方法
        t1.method01(4);
    }
}
```

2、内存分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210906101807.jpg" style="zoom: 33%;" />

3、阶乘实现

```java
package cn.guardwhy.demo06;
// 1.1 阶乘
class A{
    public int factorial(int n){
        if(n == 1){
            return 1;
        }else {
            return factorial(n -1) * n;
        }
    }
}

public class Recursion02 {
    public static void main(String[] args) {
        // 2.1 创建a1对象
        A a1 = new A();
        // 2.2 对象调用方法
        int result = a1.factorial(5);
        System.out.println("5的阶乘:" + result);   // 5的阶乘:120
    }
}
```

4、内存分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210906100838.jpg" style="zoom: 33%;" />

5、递归重要规则

- 执行一个方法时，就创建一个新的受保护的独立空间【==栈空间==】。
- 方法的局部变量时独立的，不会相互影响，比如`n`变量。
- 如果方法中使用的是引用类型变量【==比如数组，对象==】，就会共享该引用类型的数据。
- 递归必须向退出递归的条件逼近，否则就是无限递归，出现【==StackOverflowError==】
- 当一个方法执行完毕，或者遇到`return`，就会返回，遵守谁调用，就将结果返回给谁。同时当方法执行完毕或者返回时，该方法也就执行完毕。

#### 6.4.3 经典案例

1、案例一

请使用递归的方式求出斐波那契数`1,1,2,3,5,8,13...`给你一个整数`n`，求出它的值是多少？

```java
package cn.guardwhy.demo07;
/**
 * 1、思路分析
 * 1.1 当n=1斐波那契数是1,当n=2斐波那契数是1。
 * 1.2 当n>=3斐波那契数是前两个数的和，这里就是一个递归的思路。
 */
class Number{
    // 1.1 定义fibMethod方法
    public int fibMethod(int n){
        // 1.2条件判断
        if(n >=1){
            if(n ==1 || n == 2){
                return 1;
            }else {
                return fibMethod(n-1) + fibMethod(n - 2);
            }
        }else {
            System.out.println("输入的整数n必须大于1");
            return -1;
        }
    }
}

public class RecursionExercise01 {
    public static void main(String[] args) {
        // 2.1 创建nb对象
        Number nb = new Number();
        // 2.2 定义变量n
        int n = 7;
        // 2.3 对象调用方法
        int result = nb.fibMethod(7);
        // 2.4 条件判断
        if(result != -1){
            System.out.println("当n=" + n + "时，对应的斐波那契数=" + result);	// 当n为:7时，对应的斐波那契数为:13
        }
    }
}
```

2、案例二

有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后每天猴子都吃其中的一半，然后再多吃一个。当到第10天时想再吃时(即还没吃)，发现只有1个桃子了。问题：最初共多少个桃子？

```java
package cn.guardwhy.demo07;

import java.util.Scanner;

/**
 * 1.思路分析 逆推
 * 1.1 day = 10 时有1个桃子,day=9时有(day10 + 1)*2 = 4
 * 1.2 day = 8 时  有 (day9 + 1) * 2 = 10
 * 1.3 规律：就是前一天的桃子=(后一天的桃子 + 1) *2
 */
// 2、创建T类
class T{
    // 2.1 定义peach方法
    public int peach(int day){
        // 2.2 第10天，只有一个桃
        if (day == 10){
            return 1;
        }else if(day >= 1 && day <=9){
            return (peach(day + 1) + 1) * 2;
        }else {
            System.out.println("day在1-10");
            return -1;
        }
    }
}

public class RecursionExercise02 {
    public static void main(String[] args) {
        // 3.0 创建t1对象
        T t1 = new T();
        // 3.1 创建scanner对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入天数: ");
        // 3.2 day初始化
        int day = scanner.nextInt();
        // 3.3 对象调用方法
        int peachNum = t1.peach(day);
        // 3.4 条件判断
        if(peachNum != -1){
            System.out.println("第" + day + "天有" + peachNum + "个桃子");
        }
    }
}
```

执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210906142042.png" style="zoom: 80%;" />

3、案例三: 汉诺塔问题

汉诺塔（又称河内塔）问题是源于印度一个古老传说的益智玩具。大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序摞着 n 片圆盘。大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上。并且规定，在小圆盘上不能放大圆盘，在三根柱子之间一次只能移动一个圆盘假如每秒钟移动一次，共需多长时间呢？

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210906175035.png)

```java
package cn.guardwhy.demo07;

import java.util.Scanner;

class Tower {
    public void move(int num , char a, char b ,char c) {
        //1.1 如果只有一个盘 num = 1
        if(num == 1) {
            System.out.println(a + "->" + c);
        } else {
            //1.2 如果有多个盘可以看成两个 , 最下面的和上面的所有盘(num-1)先移动上面所有的盘到 b, 借助 c
            move(num - 1 , a, c, b);
            //1.3 把最下面的这个盘，移动到 c
            System.out.println(a + "->" + c);
            //1.4 再把 b塔的所有盘，移动到c ,借助a
            move(num - 1, b, a, c);
        }
    }
}
public class HanoiTower {
    public static void main(String[] args) {
        // 2.1创建tower对象
        Tower tower = new Tower();
        // 2.2 创建scanner对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要移动的个数: ");
        //定义num表示要移动的个数, a, b, c 分别表示A塔，B 塔, C 塔
        int num = scanner.nextInt();
        // 2.3 对象调用方法
        tower.move(num, 'A', 'B', 'C');
    }
}
```

### 6.5 方法重载(OverLoad)

#### 6.5.1 基本介绍

1、重载定义

`java`中允许同一个类中，多个同名方法的存在，但要求形参列表不一致！

2、重载的好处

- 减轻了起名的麻烦。
- 减轻了记名的麻烦。

#### 6.5.2 入门案例

1、案例需求

- 两个整数的和，一个整数，一个`double`的和。
- 一个`double` ,一个`Int` 和，三个`int`的和。

2、代码示例

```java
package cn.guardwhy.demo07;
/**
 * calculate方法构成了重载
 */
class MyCalculator  {
    //1.1 两个整数的和
    public int calculate(int n1, int n2)  {
        System.out.print("两个整数(int)和:");
        return n1 + n2;
    }

    //1.2 一个整数，一个double的和
    public double calculate(int n1, double n2) {
        System.out.print("一个整数(int),一个整数(double)和:");
        return n1 + n2;
    }
    //1.3 一个double ,一个Int和
    public double calculate(double n1, int n2) {
        System.out.print("一个整数(double),一个整数(Int)和:");
        return n1 + n2;
    }
    //1.4 三个int的和
    public int calculate(int n1, int n2,int n3) {
        System.out.print("三个整数(int)和:");
        return n1 + n2 + n2;
    }
}

public class OverLoad01 {
    public static void main(String[] args) {
        // 2.1 创建mc对象
        MyCalculator mc = new MyCalculator();
        // 2.2 调用方法(重载)，输出结果
        System.out.println(mc.calculate(1, 2));
        System.out.println(mc.calculate(1.1, 2));
        System.out.println(mc.calculate(1, 4.1));
        System.out.println(mc.calculate(2, 3, 11));
    }
}
```

3、执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210906184100.png" style="zoom:80%;" />

#### 6.5.3 注意事项

1、使用细节

- 方法名：必须相同。
- 形参列表：必须不同(形参类型或者个数或者顺序，至少有一样不同，参数名无要求)。
- 返回类型：无需求。

2、重载方法判断

```java
class Test{
    // 1.1 定义show()方法
    public void show(int a, char b, double c){}

    // 1.2 不构成重载
    public void show(int x, char y, double z){}

    // 1.3 构成重载
    public int show(int a, double c, char b){
        return 0;
    }
    // 1.4 构成重载
    public void show(int a, double c, char b){
        return 0;
    }

    // 1.5 构成重载
    public boolean show(int c, char b){
        return 0;
    }

    // 1.6 构成重载
    public void show(double c){
        return 0;
    }

    // 1.7 不构成重载
    public double show(int x, char y, double z){
        return 0;
    }
    
    // 1.8 不构成重载
    public void shows(){}
}
```

#### 6.5.4 案例实现

1、案例一

类`Number`中定义三个重载方法并调用，方法名为method。三个方法分别接收一个`int`参数、两个`int`参数、一个字符串参数。分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。在主类的`main ()方法`中分别用参数区别调用三个方法。

```java
package cn.guardwhy.demo08;

class Number{
    /**
     * 1.1 方法名 method() 形参(int) void
     */
    public void method(int n) {
        System.out.println("整数平方=" + (n * n));
    }

    /**
     * 1.2 方法名 method() 形参(int, int) void
     */
    public void method(int n1, int n2) {
        System.out.println("两数相乘=" + (n1 * n2));
    }

    /**
     * 1.1 方法名 method() 形参(String) void
     */
    public void method(String str) {
        System.out.println("字符串:" + str);
    }
}

public class OverLoadExercise01 {
    public static void main(String[] args) {
        // 2.1 创建nb对象
        Number nb = new Number();
        // 2.2 对象调用方法method()
        nb.method(10);
        nb.method(10, 20);
        nb.method("hello Java!!!");
    }
}
```

2、案例二

定义三个重载方法`max()`，第一个方法，返回两个`int`值中的最大值，第二个方法返回两个`double`值中的最大值，第三个方法，返回三个`double`值中的最大值，并分别调用三个方法。

```java
package cn.guardwhy.demo08;

class Number{
    /**
     * 2.1 方法名 max 形参 (int,int)
     */
    public int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    /**
     * 2.2 方法名 max 形参 (double,double)
     */
    public double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    /**
     * 2.3 方法名 max形参 (double,double,double)
     */
    public double max(double n1, double n2, double n3) {
        //求出n1 和  n2的最大值
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;
    }

    /**
     * 2.3 方法名 max 形参 (double,double,int)
     */
    public double max(double n1, double n2, int n3) {
        //求出n1 和  n2的最大值
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;
    }
}

public class OverLoadExercise01 {
    public static void main(String[] args) {
        // 1.1 创建nb对象
        Number nb = new Number();

        // 1.3 对象调用方法
        System.out.println("两整数(int)较大值:" + nb.max(10, 24)); // 两整数(int)较大值:24
        System.out.println("两整数(double)较大值:" + nb.max(10.0, 24.11));	// 两整数(double)较大值:24.11
        System.out.println("三整数(double)较大值:" + nb.max(10.0, 14.11,1.7)); // 三整数(double)较大值:14.11
    }
}
```

### 6.6 可变参数

#### 6.6.1基本概念

java 允许将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法，就可以通过可变参数实现。

#### 6.6.2 基本语法

```java
访问修饰符 返回类型 方法名(数据类型... 形参名) {
    
}
```

#### 6.6.3 快速入门案例

1、定义一个类`Method`，方法`sum()`，计算 2 个数的和，3 个数的和 。

```java
package cn.guardwhy.demo08;

// 1.定义Method类
class Method{
    /**
     public int sum(int n1, int n2) {//2个数的和
     	return n1 + n2;
     }
     public int sum(int n1, int n2, int n3) {//3个数的和
     	return n1 + n2 + n3;
     }
     public int sum(int n1, int n2, int n3, int n4) {//4个数的和
     	return n1 + n2 + n3 + n4;
     }
     */
    // 上面的三个方法名称相同，功能相同, 参数个数不同-> 使用可变参数优化

    /**
     * 1.1 思路分析
     * int... 表示接受的是可变参数，类型是int ,即可以接收多个int(0-多)
     * 使用可变参数时，可以当做数组来使用 即nums可以当做数组,遍历nums求和即可。
     */
    public int sum(int... nums){
        // 定义result值
        int result = 0;
        // 遍历sums和
        for(int i=0; i<nums.length; i++){
            result += nums[i];
        }
        // 返回结果
        return result;
    }
}

public class VarParameter01 {
    public static void main(String[] args) {
        // 2.1 创建m1对象
        Method m1 = new Method();
        // 2.2 对象调用方法
        System.out.println(m1.sum(1, 5, 22));   // 28
        System.out.println(m1.sum(1,33)); // 34
    }
}
```

#### 6.6.4 注意事项

1、使用细节

可变参数的实参可以为0个或者任意个数。

可变参数的实参可以为数组，可变参数的本质就是数组。

可变参数可以和普通类型的参数一起放在形参列表，但是必须保证可变参数在最后。

一个形参列表中只能出现一个可变参数。

2、代码示例

```java
package cn.guardwhy.demo08;
// 1.定义T类
class T{
    // 1.1 定义method1方法
    public void method1(int... nums){
        System.out.println("nums长度:" + nums.length);
    }
    //1.2 定义method2方法，可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
    public void method2(String str, double... nums){

    }

    // 1.3 个形参列表中只能出现一个可变参数
    /**public void method3(int... nums1, double... nums2){

    }*/
}

public class VarParameter02 {
    public static void main(String[] args) {
        //2.1 定义arr数组，可变参数的实参可以为数组
        int[] arr = {1, 2, 3};
        // 2.2 创建t1对象
        T t1 = new T();
        // 2.3 对象调用方法
        t1.method1(arr);
    }
}
```

#### 6.6.5 案例实现

定义一个`showScore`方法，分别实现返回姓名和两门课成绩(总分)，返回姓名和三门课成绩(总分)，返回姓名和五门课成绩(总分)，封装成一个可变参数的方法。

```java
package cn.guardwhy.demo08;

// 1.创建Test类
class Test{
    // 1.1 方法名 showScore() 形参(String ,double... ) 返回String
    public String showScore(String name, double... scores){
        // 1.2 初始化totalScore
        double totalScore = 0;
        // 1.3 遍历score
        for(int i = 0; i < scores.length; i++) {
            totalScore += scores[i];
        }
        return name + "的" + scores.length + "门课成绩总分:" + totalScore;
    }
}
public class VarParameter03 {
    public static void main(String[] args) {
        // 2.1 创建test对象
        Test test = new Test();
        // 2.2 对象调用方法
        System.out.println(test.showScore("Curry", 90.45, 89.90));  // Curry的2门课成绩总分:180.35000000000002
        System.out.println(test.showScore("Kobe", 90.4, 89.90,88.46,96.98)); // Kobe的4门课成绩总分:365.74
    }
}
```

### 6.7 作用域

#### 6.7.1 基本使用

1、基本使用

- 在Java编程中，主要的变量就是属性(成员变量)和局部变量。
- 局部变量一般是指在成员方法中定义的变量。

- `java`中作用域的分类
  - 全局变量：也就是属性，作用域为整个类体`Student`类：`eat()`和`study()`等方法使用属性。
  - 局部变量: 除了属性之外的其他变量，作用域为定义它的代码块中。

- 全局变量(属性)可以不赋值，直接使用因为有默认值。局部变量必须赋值后，才能使用，因为没有默认值。

2、代码示例

```java
package cn.guardwhy.demo09;

// 1.1 创建Student类
class Student{

    //1.2 全局变量：也就是属性，作用域为整个类体,属性在定义时，可以直接赋值.
    int age = 10; //指定的值是 10

    //1.3 全局变量(属性)可以不赋值，直接使用，因为有默认值，
    double weight;  //默认值是0.0

    public void method01() {
        //局部变量必须赋值后，才能使用，因为没有默认值
        int num = 1;
        String address = "广州";
        System.out.println("num=" + num);
        System.out.println("address=" + address);
        System.out.println("weight=" + weight);
    }

    // 1.5 局部变量一般是指在成员方法中定义的变量 ,n和name的作用域在method02方法中
    public void method02() {
        // n和 name就是局部变量
        int n = 10;
        String name = "guardwhy";
        System.out.println("在method02中使用属性age=" + age);
    }

    public void method03() {
        System.out.println("在method03中使用属性 age=" + age);
        //System.out.println("在method03中使用method02的变量 name=" + name);//错误
    }
}

public class VarScope {
    public static void main(String[] args) {
        // 创建对象
        Student stu = new Student();
    }
}
```

#### 6.7.2 使用细节

1、属性和局部变量可以重名，访问时遵循就近原则。

```java
package cn.guardwhy.demo09;

// 1.创建Person类
class Person{
    String name = "guardwhy";

    public void say() {
        //1.1 属性和局部变量可以重名，访问时遵循就近原则
        String name = "Curry";
        System.out.println("姓名:" + name);   // 姓名:Curry
    }
}
public class VarScope02 {
    public static void main(String[] args) {
        // 2.1 创建p1对象
        Person p1 = new Person();
        // 2.2 对象调用方法
        p1.say();
    }
}
```

2、在同一作用域中，比如在同一个成员方法中，两个局部变量不能重名。

```java
package cn.guardwhy.demo09;

// 1.创建Person类
class Person{
    String name = "guardwhy";
    
    public void method2(){
        String address = "广州";
        // String address = "上海"; // 重复定义变量
    }
}
public class VarScope02 {
    public static void main(String[] args) {
        // 2.1 创建p1对象
        Person p1 = new Person();
        // 2.2 对象调用方法
        p1.method2();
    }
}
```

3、属性生命周期较长，伴随着对象的创建而创建，伴随着对象的销毁而销毁。局部变量，生命周期较短，伴随着它的代码块的执行而创建，伴随着代码块的结束而销毁。

```java
package cn.guardwhy.demo09;

// 1.创建Person类
class Person{
    String name = "guardwhy";

    public void method1() {
        //1.1 属性和局部变量可以重名，访问时遵循就近原则
        String name = "Curry";
        System.out.println("姓名:" + name);   // 姓名:Curry
    }
}
public class VarScope02 {
    public static void main(String[] args) {
        // 2.1 创建p1对象
        Person p1 = new Person();
        // 2.2 执行method1方法时，method1方法的局部变量比如name,会创建，当method1执行完毕后name局部变量就销毁,但是属性(全局变量)仍然可以使用
        p1.method1();
    }
}
```

4、作用域范围不同

全局变量/属性：可以被本类使用，或者其他类使用(通过对象调用)

局部变量：只能在本类中对应的方法中使用。

```java
package cn.guardwhy.demo09;

// 1.创建Person类
class Person{
    String name = "guardwhy";
}

// 2、创建T类
class T{
    //2.1 全局变量/属性：可以被本类使用，或其他类使用（通过对象调用)
    public void method2(){
        Person p1 = new Person();
        System.out.println("用户名:" + p1.name);
    }

    public void method3(Person p){
        System.out.println("用户名:"+ p.name);
    }
}
public class VarScope02 {
    public static void main(String[] args) {
        // 3.1 创建p1对象
        Person p1 = new Person();
        // 3.2 创建t1对象
        T t1 = new T();
        // 3.3 对象调用方法
        t1.method2();   // 第一种跨类访问对象属性的方式
        t1.method3(p1); // 第二种跨类访问对象属性的方式
    }
}
```

5、修饰符不同

全局变量、属性可以加修饰符，局部变量不可以加修饰符。

```java
package cn.guardwhy.demo09;

// 1.创建Person类
class Person{
    String name = "guardwhy";
    // 1.1 属性可以加修饰符(public protected private..)
    public int age = 20;

    public void method1() { 
        // 1.2 局部变量不能加修饰符
        // public int score = 88;
    }
}

public class VarScope02 {
    public static void main(String[] args) {
        // 3.1 创建p1对象
        Person p1 = new Person();
      // 3.2 执行method1方法时，method1方法的局部变量比如name,会创建，当method1执行完毕后name局部变量就销毁,但是属性(全局变量)仍然可以使用
        p1.method1();
}

```

### 6.8 构造方法/构造器

#### 6.8.1 基本语法

```java
[修饰符] 方法名(形参列表){
	方法体;
}
```

注意点

1) 构造器的修饰符可以默认， 也可以是 public protected private
2) 构造器没有返回值
3) 方法名 和类名字必须一样
4) 参数列表 和 成员方法一样的规则
5) 构造器的调用, 由系统完成

#### 6.8.2 基本介绍

构造方法又叫构造器(constructor)，是类的一种特殊的方法，它的主要作用是完成对新对象的初始化。它有几个特点：

- 方法名和类名相同
- 没有返回值
- 在创建对象时，系统会自动的调用该类的构造器完成对象的初始化。

#### 6.8.3 快速入门

1、在创建人类的对象时，就直接指定这个对象的年龄和姓名。

```java
package cn.guardwhy.demo10;
/**
 * 构造器没有返回值, 也不能写void,构造器的名称和类Person一样
 * (String pName, int pAge) 是构造器形参列表，规则和成员方法一样
 */
class Person {
    String name;
    int age;

    public  Person(String pName, int pAge) {
        System.out.println("构造器被调用,完成对象的属性初始化");
        name = pName;
        age = pAge;
    }
}
public class Constructor01 {
    public static void main(String[] args) {
        // 创建p1对象
        Person p1 = new Person("curry", 10);
        System.out.println("p1的信息如下");
        System.out.println("username:" + p1.name);//username:curry
        System.out.println("userage:" + p1.age);// userage:10
    }
}
```

#### 6.8.4 注意事项和使用细节

1、一个类可以定义多个不同的构造器，即构造器重载。

2、构造器名和类名要相同，构造器没有返回值。

3、构造器是完成对象的初始化，并不是创建对象。在创建对象时，系统自动的调用该类的构造方法。

4、如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器(也叫默认构造器)

5、一旦定义了自己的构造器，默认的构造器就覆盖了，就不能再使用默认的无参构造器。

```java
package cn.guardwhy.demo10;

// 1.创建Person对象
class Person {
    String name;
    int age;
    //1.1 第1个构造器
    public Person(String pName, int pAge) {
        name = pName;
        age = pAge;
    }
    //1.2 第2个构造器, 只指定人名，不需要指定年龄
    public Person(String pName) {
        name = pName;
    }
}

// 2、创建Student对象
class Student{
    //2.1 如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器(也叫默认构造器)
	/*
	Student(){

    }
    */
    //2.2 一旦定义了自己的构造器,默认的构造器就覆盖了，就不能再使用默认的无参构造器，
    public Student(String dName) {
        //...
    }

    //2.3 显式的定义一下 无参构造器
    Student() {

    }
}

public class Constructor01 {
    public static void main(String[] args) {
        //3.1 第1个构造器
        Person p1 = new Person("guardwhy", 21);
        //3.2 第2个构造器
        Person p2 = new Person("curry");
        //3.3 使用的是默认的无参构造器
        Student stu = new Student();
    }
}
```

#### 6.8.5 案例分析

定义的`Person`类中添加两个构造器，第一个无参构造器：利用构造器设置所有人的`age`属性初始值都为18。第二个带`pName`和`pAge`两个参数的构造器，使得每次创建`Person`对象的同时初始化对象的`age`属性值和`name`属性值。

```java
package cn.guardwhy.demo11;

// 1.创建Person对象
class Person{
    String name;//默认值 null
    int age;//默认 0
    //第一个无参构造器：利用构造器设置所有人的age属性初始值都为18
    public Person() {
        age = 18;//
    }
    //第二个带pName和pAge两个参数的构造器
    public Person(String pName, int pAge) {
        name = pName;
        age = pAge;
    }
}

public class ConstructorExercise {
    public static void main(String[] args) {
        // 2.1 创建p1对象
        Person p1 = new Person();
        System.out.println("用户(p1)name:" + p1.name + ", age=" + p1.age);
        // 2.2 创建p2对象
        Person p2 = new Person("guardwhy", 27);
        System.out.println("用户(p2)name:" + p2.name + ",age:" + p2.age);
    }
}
```

#### 6.8.6 对象创建流程分析

1、案例代码

```java
package cn.guardwhy.demo11;

// 1.创建Person对象
class Person{
    String name;
    int age = 10;
    // 构造器
    Person(String userName, int userAge){
        name = userName;
        age = userAge;
    }
}

public class ConstructorExercise {
    public static void main(String[] args) {
        // 2.1 创建p1对象
        Person p1 = new Person("guardwhy", 26);
        System.out.println("用户名:" + p1.name + ",年龄:" + p1.age);
    }
}
```

2、流程分析

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210908121710.jpg)

- 加载Person类信息(Person.class)，只会加载一次。
- 在堆中分配空间(地址)。
- 完成对象初始化
  - 默认初始化 age = 0; name = null ;
  - 显示初始化age = 10; name = null;
  - 构造器的初始化 age=26; name = guardwhy;
- 在对象在堆中的地址，返回给P1(P1是对象名，也可以理解成是对象的引用)

### 6.9 this 关键字

#### 6.9.1 什么是this

1、this关键字的引出，代码如下

```java
package cn.guardwhy.demo11;

// 1.创建Student对象
class Student{
    String name;//默认值 null
    int age;//默认 0
    // 构造器
    Student(String userName, int userAge){
        name = userName;
        age = userAge;
    }
}

public class ConstructorExercise {
    public static void main(String[] args) {
        // 2.1 创建stu对象
        Student stu = new Student("curry", 10);
        System.out.println("用户名:" + stu.name + ",年龄:" + stu.age);
    }
}
```

存在问题: 构造方法的输入参数名不是非常的好，如果能够将`userName`改成`name`就好了，但是就会发现按照变量的作用域原则，`name`的值就是`null`===>从而引出`this`。

2、`this`基本介绍

`Java`虚拟机会给每个对象分配`this`，代表当前对象。

```java
package cn.guardwhy.demo11;

// 1、创建Person对象
class Person{
    String name;
    int age;

    /**
     * 存在问题:根据变量的作用域原则,构造器的name 是局部变量，而不是属性
     * 构造器的age  是局部变量，而不是属性,引出this关键字来解决.
     */
    public Person(String name, int  age){//构造器
        //this.name 就是当前对象的属性name
        this.name = name;
        //this.age 就是当前对象的属性age
        this.age = age;
        System.out.println("当前对象【this】(hashcode):" + this.hashCode());
    }

    public void method(){//成员方法,输出属性x信息
        System.out.println("成员方法(hashcode):" + this.hashCode());
        System.out.println("用户名:" + name + ", 年龄:"+ age);
    }
}
public class ThisExercise01 {
    public static void main(String[] args) {
        // 2.1 创建p1对象
        Person p1 = new Person("curry", 10);
        System.out.println("p1(hashcode):" + p1.hashCode());
        //p1调用了 method()方法
        p1.method();

        System.out.println("+++++++++++++++++++++++");
        Person p2 = new Person("james", 9);
        System.out.println("p2(hashcode):" + p2.hashCode());
        //p1调用了 method()方法
        p2.method();
    }
}
```

执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210908143031.png" style="zoom: 80%;" />

#### 6.9.2 深入理解 this

1、源码示例

```java
package cn.guardwhy.demo11;

// 1、创建Person对象
class Person{
    String name;
    int age;

    public Person(String name, int  age){//构造器
        //this.name 就是当前对象的属性name
        this.name = name;
        //this.age 就是当前对象的属性age
        this.age = age;
    }
}
public class ThisExercise01 {
    public static void main(String[] args) {
        // 2.1 创建p1对象
        Person p1 = new Person("curry", 10);
        System.out.println("用户名:" + p1.name +", 年龄:" + p1.age);	// 用户名:curry, 年龄:10
        System.out.println("+++++++++++++++++++++++");
        Person p2 = new Person("james", 9);
        System.out.println("用户名:" + p2.name +", 年龄:" + p2.age);	// 用户名:james, 年龄:9
    }
}
```

2、流程分析

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210908164546.jpg)

#### 6.9.3 this 注意事项

1、`this` 关键字可以用来访问本类的属性、方法、构造器，`this` 用于区分当前类的属性和局部变量。

2、访问成员方法的语法：`this`.方法名(参数列表);

```java
package cn.guardwhy.demo11;

// 1、创建对象T
class T{
    // 1.1 访问成员方法的语法：this.方法名(参数列表)
    public void method01(){
        System.out.println("method01()方法.....");
    }

    public void method02(){
        System.out.println("method02()方法...");
        // 1.2 调用本类的method01()方法
        // 方式1
        method01();
        // 方式二
        this.method01();
    }
}
public class ThisExercise02 {
    public static void main(String[] args) {
        // 2.1 创建t1对象
        T t1 = new T();
        // 2.2 对象调用方法
        t1.method02();
    }
}
```

3、访问构造器语法：`this`(参数列表); 注意只能在构造器中使用(==即只能在构造器中访问另外一个构造器, 必须放在第一条语句==)

```java
package cn.guardwhy.demo11;

// 1、创建对象T
class T{
    // 1.1 无参构造器
    public T(){
        //这里去访问 T(String name, int age) 构造器
        this("guardwhy", 10);
        System.out.println("T() 构造器");
    }
    
    // 1.2 代参构造器
    public T(String name, int age) {
        System.out.println("T(String name, int age) 构造器");
    }
}
public class ThisExercise02 {
    public static void main(String[] args) {
        // 2.1 创建t1对象
        T t1 = new T();
    }
}
```

4、`this` 不能在类定义的外部使用，只能在类定义的方法中使用，`this`关键字可以用来访问本类的属性。

```java
package cn.guardwhy.demo11;

// 1、创建对象T
class T{
    // 定义成员变量
    String userName = "curry";
    int userAge = 10;

    public void method(){
        // 定义局部变量
        String userName = "guardwhy";
        //传统方式
        System.out.println("用户名:"+ userName+",年龄:" + userAge);  // 用户名:guardwhy,年龄:10
        //也可以使用this访问属性
        System.out.println("用户名:"+ this.userName+",年龄:" + this.userAge); // 用户名:curry,年龄:10
    }
}
public class ThisExercise02 {
    public static void main(String[] args) {
        // 2.1 创建t1对象
        T t1 = new T();
        t1.method();
    }
}
```

#### 6.9.4 案例示例

1、定义`Person`类里面有`name、age`属性，并提供`compareTo`比较方法用于判断是否和另一个人相等，提供测试类`TestPerson`用于测试名字和年龄完全一样，就返回`true`否则返回`false`。

```java
package cn.guardwhy.demo11;

class Teacher {
    // 定义成员变量
    String name;
    int age;

    //构造器
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //compareTo比较方法
    public boolean compareTo(Teacher p) {
        //名字和年龄完全一样
        // if(this.name.equals(p.name) && this.age == p.age) {
        // 	return true;
        // } else {
        // 	return false;
        // }
        return this.name.equals(p.name) && this.age == p.age;
    }
}

public class TestTeacher {
    public static void main(String[] args) {
        // 创建t1对象
        Teacher t1 = new Teacher("curry", 10);
        // 创建t2对象
        Teacher t2 = new Teacher("guardwhy", 28);
        // 用户名比较
        System.out.println("t1(对象)compareTo t2(对象): " + t1.compareTo(t2));	// false
    }
}
```

### 6.10 经典案例

#### 6.10.1 案例一

编写类`Number`，定义方法`max`，实现求某个`double`数组的最大值，并返回

```java
package cn.guardwhy.demo12;
/**
 * 思路分析
 * 1. 类名 Number
 * 2. 方法名 max
 * 3. 形参 (double[])
 * 4. 返回值 double
 */
class Number {
    public Double max(double[] arr) {
        //1.1先判断arr是否为null,然后再判断 length 是否>0
        if( arr!= null && arr.length > 0 ) {
            //保证arr至少有一个元素,假定第一个元素就是最大值
            double max = arr[0];
            for(int i = 1; i < arr.length; i++) {
                if(max < arr[i]) {
                    max = arr[i];
                }
            }

            return max;
        } else {
            return null;
        }
    }
}

public class TestDemo01 {
    public static void main(String[] args) {
        // 2.1 创建number对象
        Number number = new Number();
        // 2.2 定义arr数组
        double[] arr = {1, 1.4, -1.3, 89.8, 123.8 , 66}; //;{};
        // 2.3 对象调用方法
        Double res = number.max(arr);
        // 2.4 条件判断
        if(res != null) {
            System.out.println("arr数组最大元素=" + res);
        } else {
            System.out.println("arr的输入有误, 数组不能为null, 或者{}");
        }
    }
}
```

#### 6.10.2 案例二

编写类`T`，定义方法`find()`，实现查找某字符串是否在字符串数组中。

```java
package cn.guardwhy.demo12;
/**
 * 思路分析
 * 1. 类名T1
 * 2. 方法名find
 * 3. 返回值int
 * 4. 形参(String , String[])
 */
class T1 {
    public int find(String findStr, String[] strs) {
        //1.1 直接遍历字符串数组，如果找到，则返回索引
        for(int i = 0; i < strs.length; i++) {
            if(findStr.equals(strs[i])) {
                return i;
            }
        }
        //1.2 如果没有，就返回-1
        return -1;
    }
}
public class TestDemo02 {
    public static void main(String[] args) {
        // 2.1 定义strs数组
        String[] strs = {"jack", "guardwhy", "james","kobe"};
        // 2.2 创建t1对象
        T1 t1 = new T1();
        // 2.3 对象调用方法
        int index = t1.find("guardwhy", strs);
        // 2.4 查找index
        System.out.println("查找索引(index):" + index);
    }
}
```

#### 6.10.3 案例三

编写类`Book` 定义方法`updatePrice`实现更改某本书的价格，具体：如果价格>150,则更改为150，如果价格>100,更改为100，否则不变。

```java
package cn.guardwhy.demo12;
/**
 * 思路分析
 * 1. 类名 Book
 * 2. 属性 price, name
 * 3. 方法名 updatePrice
 * 4. 形参 ()
 * 5. 返回值 void
 * 6. 提供一个构造器
 */
class Book {
    // 1.1 成员方法
    String name;
    double price;
    // 1.2 构造方法
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void updatePrice() {
        //1.3 如果方法中，没有price局部变量, this.price 等价 price
        if(price > 150) {
            price = 150;
        } else if(price > 100 ) {
            price = 100;
        }
    }

    //1.4 显示书籍情况
    public void info() {
        System.out.println("书名:" + this.name + ",价格:" + this.price);
    }
}

public class TestDemo03 {
    public static void main(String[] args) {
        // 2.1 创建book对象
        Book book = new Book("Java从入门到精通", 300);
        book.info();
        book.updatePrice();//更新价格
        book.info();
    }
}
```

#### 6.10.4 案例四

编写类T2, 实现数组的复制功能`copyArr`，输入旧数组，返回一个新数组，元素和旧数组一样。

```java
package cn.guardwhy.demo12;

class T2 {
    public int[] copyArray(int[] oldArray) {
        //1.1 在堆中，创建一个长度为 oldArray.length 数组
        int[] newArray = new int[oldArray.length];
        //1.2 遍历 oldArray,将元素拷贝到 newArray
        for(int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        // 1.3 返回newArray数组
        return newArray;
    }
}

public class TestDemo04 {
    public static void main(String[] args) {
        // 2.1 创建oldArray数组
        int[] oldArray = {10, 30, 50};
        //2.2 遍历oldArray
        System.out.print("oldArray:" + "[" + oldArray[0]);
        for(int i = 1; i < oldArray.length; i++) {
            System.out.print(", " + oldArray[i]);
        }
        System.out.println("]");
        // 2.3 创建t2对象
        T2 t2 = new T2();
        // 2.4 对象调用方法
        int[] newArray = t2.copyArray(oldArray);
        //2.6 遍历newArray
        System.out.print("newArray:" + "[" + newArray[0]);
        for(int i = 1; i < newArray.length; i++) {
            System.out.print(", " + newArray[i]);
        }
        System.out.print("]");
    }
}
```

#### 6.10.5 案例五

给定一个`Java`程序的代码如下所示，查看编译运行后，输出运行的结果。

```java
package cn.guardwhy.demo12;

// 1.1 创建Test类
class Test{
    // 1.2 定义count值
    int count = 9;
    // 1.3 Test类的成员方法
    public void method01(){
        // 1.4 将属性修改成10
        count = 10;
        System.out.println("count:" + count);
    }
    // 1.5 Test类的成员方法
    public void method02(){
        System.out.println("count:" + count++);
    }
}

public class TestDemo05 {
    public static void main(String[] args) {
        // 2.1 new Test()是匿名对象，匿名对象使用后，就不能使用
        // 2.2 new Test().method01() 创建好匿名对象后，就调用method01()
        new Test().method01();  // count1:10
        // 2.3 创建t1对象
        Test t1 = new Test();
        // 2.4 对象调用方法
        t1.method02();  // count:9
        t1.method02();  // count:10
    }
}
```

## 第7章 Java面向对象编程(基础)

### 7.1 包的概述

#### 7.1.0 包的引出

两个程序员共同开发一个`Java`项目，码农a希望定义一个类取名`User`，码农`b`也想定义一个类也叫`User` ,因此从而引出===>包(`package`)产生！！

#### 7.1.1 包的三大作用

1、区分相同名字的类。

2、当类很多时候，可以很好的管理类。

3、控制访问访问。

#### 7.1.2 包的基本属性

1、包的基本语法

`package cn.guardwhy`

具体说明

- `package` 关键字，表示打包。
- `cn.guardwhy` :表示包名。

2、包的本质分析

==包的本质:实际上就是创建不同的文件夹/目录来保存类文件==。

3、包的命名

- 命名规则
  - 只能包含数字，字母，下划线，小圆点。。但是不能用数字开头，不能是关键字或者保留字。
  - `demo.class.exec1`，错误，【`class`是关键字】。
  - `demo.12a`，错误【因为`12a`是数字开头】
  - `demo.ab12.oa`【正确】
- 命名规范
  - 一般就是小写字母 + 小圆点
  - 一般就是【com.公司名.项目名.业务模块名】，比如`com.guardwhy.oa.controller`

4、注意事项和使用细节

- `package`的作用是声明当前类所在的包，需要放在类的最上面，一个类中最多只有一句`package`。
- `import`指令位置放在`package`的下面，在类定义前面，可以有多句且没有顺序要求。

```java
package cn.guardwhy.demo12;
import java.util.Arrays;

public class Import01 {

    public static void main(String[] args) {

        //使用系统提供 Arrays 完成 数组排序
        int[] arr = {-1, 20, 2, 13, 3};
        Arrays.sort(arr);
        //输出排序结果
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
```

### 7.2 访问修饰符

#### 7.2.1 基本介绍

`Java` 提供四种访问控制修饰符号，用于控制方法和属性(成员变量)的访问权限（范围）:

- 公开级别:用`public` 修饰,对外公开。
- 受保护级别:用`protected`修饰,对子类和同一个包中的类公开。
- 默认级别:没有修饰符号，向同一个包的类公开。
- 私有级别:用`private`修饰，只有类本身可以访问，不对外公开。

#### 7.2.2 修饰符访问范围

| 访问级别 | 访问控制修饰符 | 同类 | 同包 | 子类 | 不同包 |
| -------- | -------------- | ---- | ---- | ---- | ------ |
| 公开     | public         | √    | √    | √    | √      |
| 受保护   | protected      | √    | √    | √    | x      |
| 默认     | 没有修饰符     | √    | √    | x    | x      |
| 私有     | private        | √    | x    | x    | x      |

#### 7.2.3 注意事项

修饰符可以用来修饰类的属性，成员方法以及类。

只有默认的和公开的（`public`）才能修饰符，并且遵循上述访问权限的特点。

成员方法的访问规则和属性完全一样。

1、创建类`A`

```java
package cn.guardwhy.demo01;

public class A {
    //1.1 分别使用不同的访问修饰符来修饰
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void method1(){
        //1.2 在同一类中，可以访问public protected 默认 private 修饰属性和方法
        System.out.println( "类(A):" + "n1=" + n1 + ",n2=" + n2 + ",n3=" + n3 + ",n4=" + n4);
    }
    protected void method2() {

    }
    void method3() {

    }

    private void method4() {

    }

    // 1.3 定义say方法
    public void say(){
        //1.4 在同一类中，可以访问public protected 默认 private 修饰属性和方法
        method1();
        method2();
        method3();
        method4();
    }
}
```

2、创建类`B`

```java
package cn.guardwhy.demo01;

public class B {
    public void say() {
        A a = new A();
        //1.1 在同一个包下，可以访问 public , protected 和 默认修饰属性或方法,不能访问private 属性或方法
        System.out.println("类(B):" + "n1=" + a.n1 + ",n2=" + a.n2 + ",n3=" + a.n3 );

        a.method1();
        a.method2();
        a.method3();
        // a.method4(); // 错误的,无法访问！！！
    }
}
```

3、创建类`Test`

```java
package cn.guardwhy.demo01;

public class Test {
    public static void main(String[] args) {
        // 1.1 创建a对象
        A a = new A ();
        // 1.2 对象调用方法
        a.method1();

        // 1.3 创建b对象
        B b = new B();
        // 1.4 对象调用B类中的say()方法
        b.say();
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210909184044.png)

4、创建类`Test`，跨包(package)访问`method1()`方法

```java
package cn.guardwhy.demo02;

import cn.guardwhy.demo01.A;

public class Test {
    public static void main(String[] args) {
        //1.1 在不同包下，可以访问public修饰的属性或方法但是不能访问【protected，默认，private】修饰的属性或方法
        A a = new A();

        System.out.println("n1的值:" + a.n1);
        //1.2 不能访问 a.method2() a.method3() a.method4()
        a.method1();
        
        // 1.3 不能访问其他方法
        // a.method2();
        // a.method3();
        // a.method4();
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210910081232.png)

### 7.3 面向对象编程特征(封装)

#### 7.3.1 基本介绍

封装(`encapsulation`)就是把抽象出的数据【属性】和对数据的操作【方法】封装在一起，数据被保护在内部，程序的其他部分只有通过被授权的操作【方法】，才能对数据进行操作。

#### 7.3.2 封装的好处

隐藏实现细节: 方法(连接数据库) <--调用(传入参数...)

可以对数据进行验证，保证安全合理。

#### 7.3.3 封装的实现步骤

- 将属性进行私有化`private`(不能直接修改属性)。
- 提供一个公共的(`public`)set方法，同于对属性判断并且赋值。

```java
public void setXxx(类型 参数名){ // Xxx表示某个属性
    // 加入数据验证的业务逻辑
    属性 = 参数名;
}
```

- 提供一个公共的(`public`)get方法，用于获取属性的值

```java
public 数据类型 getXxx(){ // 权限判断，Xxx某个属性
    return xx;
}
```

#### 7.3.4 快速入门

案例需求: 不能随便查看用户的年龄,工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认年龄必须在 1-90, 年龄， 工资不能直接查看 ， `name`的长度在`2-6`字符之间。

```java
package cn.encap.demo01;

// 1.1 创建Person
class Person {
    public  String name; // 成员name
    private int age; // 成员age
    private double salary; // 成员salary

    //1.2 无参构造器
    public Person() {

    }

    //1.3 代参构造器
    public Person(String name, int age, double salary) {
        //1.4 将set方法写在构造器中，这样仍然可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    // 1.5 设置setXxx/getXxx方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        //1.6 条件判断，加入对数据的校验
        if(name.length() >= 2 && name.length() <=6 ) {
            this.name = name;
        }else {
            System.out.println("名字的长度不对，需要(2-6)个字符");
            this.name = "姓名有误！！";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //1.7 判断年龄合理范围
        if(age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("设置年龄不对，需要在 (1-90), 给默认年龄18 ");
            //1.8 设置一个默认年龄
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //1.9 编写一个info()方法，返回属性信息
    public String info() {
        return "用户信息:name:" + name + ",age=" + age + ",薪水=" + salary;
    }
}

public class Encapsulation01 {
    public static void main(String[] args) {
        // 2.1 创建p1对象
        Person p1 = new Person();
        p1.setName("curry");
        p1.setAge(32);
        p1.setSalary(10000);
        System.out.println(p1.info());  // 用户信息:name:curry,age=32,薪水=10000.0

        System.out.println("==========");

        //2.2 使用构造器指定属性
        Person p2 = new Person("james", 38, 20000);
        System.out.println(p2.info());  // 用户信息:name:james,age=38,薪水=20000.0
    }
}
```

#### 7.3.5 案例分析

案例需求：创建程序,在其中定义两个类: `Account`和`Encapsulation02`类体会`Java`的封装性。`Account`类要求具有属性：姓名(长度为2位3位或4位)、余额(必须>20)、密码(必须是六位), 如果不满足，则给出提示信息，并给默认值通过`setXxx`的方法给`Account`的属性赋值。

1、Account.java

```java
package cn.encap.demo01;

public class Account {
    // 1.1 定义成员变量
    private String name;
    private double balance;
    private String pwd;

    // 1.2 无参构造
    public Account() {

    }

    // 1.3 代参构造
    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    // 1.4 getXxx/setXxx方法
    public String getName() {
        return name;
    }

    //1.5 设置姓名长度
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 9) {
            this.name = name;
        } else {
            System.out.println("姓名要求（长度为2位3位或4位），默认值 无名");
            this.name = "姓名有误！！";
        }
    }

    public double getBalance() {
        return balance;
    }

    //1.6 设置余额大小(必须>20)
    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额(必须>20) 默认为0");
        }
    }

    public String getPwd() {
        return pwd;
    }

    //1.7 设置密码的大小(必须是六位)
    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码（必须是六位）默认密码为 000000");
            this.pwd = "000000";
        }
    }
    //1.8 显示账号信息
    public void showInfo() {
        //增加权限的校验
        System.out.println("用户信息: name="+ name+ ",余额=" + balance + ", 密码" + pwd); 
       
    }
}
```

2、Encapsulation02.java

```java
package cn.encap.demo01;

public class Encapsulation02 {
    public static void main(String[] args) {
        // 1.1 创建account
        Account account = new Account();
        // 1.2 设置属性
        account.setName("curry");
        account.setBalance(20000);
        account.setPwd("123456");

        account.showInfo(); //用户信息: name=curry,余额=20000.0, 密码123456
    }
}
```

### 7.4 面向对象编程特征(继承)

#### 7.4.1 继承引出

模块中编写两个类，一个是Student类，一个是Teacher类，==当两个类的属性和方法有很多是相同的==，怎么解决问题？===>从而引出继承(代码复用性)。

#### 7.4.2 继承示意图

继承可以解决代码复用,让编程更加靠近人类思维.当多个类存在相同的属性(变量)和方法时,可以从这些类中抽象出父类,在父类中定义这些相同的属性和方法，所有的子类不需要重新定义这些属性和方法，只需要通过`extends`来声明继承父类即可。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210910110728.png)

#### 7.4.3 继承的基本语法

- 子类就会自动拥有父类定义的属性和方法。
- 父类又叫超类，基类，子类又叫派生类。

```java
class 子类 extends 父类 {
}
```

#### 7.4.4 快速入门案例

模块中编写两个类，一个是Student类，一个是Teacher类，输出类的相关属性。查看继承关系(`ctrl + H`)

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210910145748.png)

1、Person.java

```java
package cn.guardwhy.improve;

public class Person {
    //共有属性
    public String name;
    public int age;
    private String address;//成绩
    //共有的方法
    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo() {
        System.out.println("学生名:" + name + ",年龄:" + age + ",地址:" + address);
    }
}
```

2、Student.java

```java
package cn.guardwhy.improve;

public class Student extends Person {
    public void testing() {
        System.out.println("学生:" + name + ", 正在学Java知识！！");
    }
}
```

3、Teacher.java

```java
package cn.guardwhy.improve;

public class Teacher extends Person {
    public void testing() {
        System.out.println("老师:" + name + ",备课Java文档！！！");
    }
}
```

4、Extends01.java

```java
package cn.guardwhy.improve;

public class Extends01 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "curry";
        stu.age = 11;
        stu.testing();
        stu.setAddress("广州");
        stu.showInfo();

        System.out.println("=======");
        Teacher teacher = new Teacher();
        teacher.name = "james";
        teacher.age = 34;
        teacher.testing();
        teacher.setAddress("北京");
        teacher.showInfo();
    }
}
```

执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210910150141.png" style="zoom:80%;" />

5、继承给编程带来的便利

1) 代码的复用性提高了。
2) 代码的扩展性和维护性提高了。

#### 7.4.5 继承的细节问题

1、子类继承了所有的属性和方法，非私有的属性和方法可以在子类直接访问, ==但是私有属性和方法不能在子类直接访问，要通过父类提供公共的方法去访问==。

2、子类必须调用父类的构造器， 完成父类的初始化

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210910154906.png)

Base.java

```java
package cn.guardwhy.extends01;

public class Base {
    //4个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() { //无参构造器
        System.out.println("Base(父类)构造器被调用....");
        System.out.println("=====================");
    }

    //父类提供一个public的方法,返回了n4
    public int getN4() {
        return n4;
    }
    public void test100() {
        System.out.println("test100");
    }
    protected void test200() {
        System.out.println("test200");
    }
    void test300() {
        System.out.println("test300");
    }
    private void test400() {
        System.out.println("test400");
    }

    // 定义call()方法
    public void call(){
        // 调用方法
        test400();
    }
}
```

Sub.java

```java
package cn.guardwhy.extends01;

public class Sub extends Base{
    // 1.0 构造器
    public Sub() {
        System.out.println("Sub构造器(子类)被调用.....");
    }

    // 1.1 子类方法
    public void sayOk(){
        System.out.print("n1值:" + n1 + ",n2值:" + n2 + ",n3值:" + n3);

        // 1.2 要通过父类提供公共的方法去访问
        System.out.println(",n4值:" + getN4());

        System.out.println("+++++++++++++++++");
        // 调用方法
        test100();
        test200();
        test300();
        // 通过公开方法，调用test400()
        call();
    }
}
```

ExtendsDetail.java

```java
package cn.guardwhy.extends01;

public class ExtendsDetail {
    public static void main(String[] args) {
        // 1.1 创建sub对象
        Sub sub = new Sub();
        // 1.2 对象调用方法
        sub.sayOk();
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210910160146.png)

3、当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，==如果父类没有提供无参构造器，则必须在子类的构造器中用 super 去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过==。

Base.java

```java
package cn.guardwhy.extends01;

public class Base {
    /*public Base() { //无参构造器
        System.out.println("Base(父类)构造器被调用....");
        System.out.println("=====================");
    }*/

    // 有参构造器
    public Base(String name, int age){
        System.out.println("父类Base(String name, int age)构造器被调用....");
    }
}
```

Sub.java

```java
package cn.guardwhy.extends01;

public class Sub extends Base{
    // 1.0 子类构造器
    public Sub() {
        // 1.1 super(); // 默认调用父类的无参构造器
        super("guardwhy", 21);
        System.out.println("子类Sub构造器()被调用.....");
    }
    // 1.2 代参构造器
    public Sub(String name) {
        // 注意:当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
        super("curry", 10);
        System.out.println("子类Sub构造器(String name)被调用.....");
    }
}
```

ExtendsDetail.java

```java
package cn.guardwhy.extends01;

public class ExtendsDetail {
    public static void main(String[] args) {
        System.out.println("===第1个对象===");
        Sub sub1 = new Sub();
        System.out.println("===第2个对象===");
        Sub sub2 = new Sub("jack");
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210910184744.png)

3、如果希望指定去调用父类的某个构造器，则显式的调用一下 : `super(参数列表)`，`super`在使用时，必须放在构造器第一行(`super `只能在构造器中使用)，==super() 和 this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器==。

Base.java

```java
package cn.guardwhy.extends01;

public class Base {

    // 有参构造器
    public Base(String name, int age){
        System.out.println("父类Base(String name, int age)构造器被调用....");
    }
}
```

Sub.java

```java
package cn.guardwhy.extends01;

public class Sub extends Base{
    public Sub(String name, int age) {
        // 调用父类的Base(String name, int age) 构造器
        super("james", 40);
        System.out.println("子类Sub(String name, int age)构造器被调用.....");
    }
}
```

ExtendsDetail.java

```java
package cn.guardwhy.extends01;

public class ExtendsDetail {
    public static void main(String[] args) {
        System.out.println("===第3对象===");
        Sub sub3 = new Sub("james", 10);
    }
}
```

执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210910193354.png)

4、`java`所有类都是`Object`类的子类, `Object`是所有类的基类。

5、父类构造器的调用不限于直接父类！将一直往上追溯直到`Object`类(顶级父类)。

6、子类最多只能继承一个父类(指直接继承)，即`java`中是单继承机制。

#### 7.4.6 继承的本质分析

1、代码示例

```java
package cn.guardwhy.extends02;

/**
(1) 首先看子类是否有该属性
(2) 如果子类有这个属性，并且可以访问，则返回信息
(3) 如果子类没有这个属性，就看父类有没有这个属性(如果父类有该属性，并且可以访问，就返回信息..)
(4) 如果父类没有就按照(3)的规则，继续找上级父类，直到Object...
*/

//1.1 基类
class GrandPa {
    String name = "jordan";
    String hobby = "旅游";
}

// 1.2 父类
class Father extends GrandPa {
    String name = "james";
    int age = 39;

}

// 1.3 子类
class Son extends Father {
    String name = "curry";
}

public class ExtendsTheory {
    public static void main(String[] args) {
        // 创建son对象
        Son son = new Son();
        System.out.println(son.name);
        System.out.println(son.age);
        System.out.println(son.hobby);
    }
}
```

2、流程分析

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210911131729.jpg" style="zoom:80%;" />

#### 7.4.7 案例分析

1、案例一

在以下源码中，当在`main`方法中创建`b`对象时：`B b = new B();`，会输出什么？

```java
package cn.guardwhy.extends02;

class A {
    A() {
        System.out.println("a");
    }

    A(String name) {
        System.out.println("a name");
    }
}

class B extends A {
    B() {
        this("abc");
        System.out.println("b");
    }

    B(String name) {
        // 默认有super()
        System.out.println("b name");
    }
}

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();  
    }
}
```

执行结果

```java
// 先后输出 a, b name, b
```

2、案例二

在以下源码中，当在`main`方法中创建`c`对象时：`C c = new C();`，会输出什么？

```java
package cn.guardwhy.extends02;

// 1.1 基类
class A {
    public A() {
        // super()
        System.out.println("A类的无参构造");
    }
}

//1.2 B类,继承A类
class B extends A {
    public B() {
       
        System.out.println("B类的无参构造");
    }
    public B(String name) {
        // super()
        System.out.println(name + "B类的有参构造");
    }
}
//1.3 C类，继承 B类
class C extends B {
    public C() {
        this("hello");
        System.out.println("c类的无参构造");
    }

    public C(String name) {
        super("curry");
        System.out.println("c类的有参构造");
    }
}

public class ExtendsExercise02 {
    public static void main(String[] args) {
        // 2.1 创建c对象
        C c = new C();
    }
}
```

执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210911110931.png" style="zoom:80%;" />

3、案例三

编写`Computer`类，包含`CPU`、`内存`、硬盘等属性，`getDetails` 方法用于返回 `Computer` 的详细信息，编写 `PC` 子类，继承 `Computer` 类，添加特有属性【品牌 `brand`】，编写 `NotePad` 子类，继承`Computer`类，添加特有属性【`color`】，编写`Test`类，在`main`方法中创建`PC`和`NotePad`对象，分别给对象中特有的属性赋值，以及从`Computer` 类继承的属性赋值，并使用方法并打印输出信息。

Computer.java

```java
package cn.guardwhy.extends02;

//编写Computer类，包含CPU、内存、硬盘等属性，getDetails方法用于返回Computer的详细信息
public class Computer {
    private String cpu;
    private int memory;
    private int disk;
    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }
    //返回Computer信息
    public String getDetails() {
        return "cpu=" + cpu + ",memory=" + memory + ",disk=" + disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
```

PC .java

```java
package cn.guardwhy.extends02;

public class PC extends Computer{
    private String brand;
    //1.1 子类的构造器完成子类属性初始化
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo() {
        System.out.print("PC信息:");
        //1.2 调用父类的getDetails方法，得到相关属性信息..
        System.out.println(getDetails() + ",brand=" + brand);
    }
}
```

ExtendsExercise03.java

```java
package cn.guardwhy.extends02;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel", 16, 500, "IBM");
        pc.printInfo();
    }
}
```

执行结果
`PC信息:cpu=intel,memory=16,disk=500,brand=IBM`

### 7.5 Super 关键字

#### 7.5.1 基本介绍

`super`代表父类的引用，用于 访问父类的属性、方法、构造器。

#### 7.5.2 基本语法

1、访问父类的属性，但是不能访问父类的`private`属性。

```java
super.属性名;
```

2、访问父类的方法，不能访问父类的`private`方法

```java
super.方法名(参数列表)
```

3、访问父类的构造器

```java
super(参数列表); // 只能放在构造器的第一句，只能出现一句。
```

代码示例

A.java

```java
package cn.guardwhy.super01;

public class A {
    // 1.1 定义成员属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    // 1.2 定义构造方法
    public A() {}
    public A(String name) {}
    public A(String name, int age) {}

    public void method01() {
    }

    protected void method02() {

    }

    void method03() {

    }

    private void method04() {

    }
}
```

B.java

```java
package cn.guardwhy.super01;

public class B extends A{
    //1.3 访问父类的属性 , 但不能访问父类的private属性 super.属性名
    public void test01() {
        System.out.println("n1的值:" + super.n1 + ", n2的值:" + super.n2 + ", n3的值:" + super.n3 );
    }

    //1.2 访问父类的方法，不能访问父类的private方法 super.方法名(参数列表);
    public void ok() {
        super.method01();
        super.method02();
        super.method03();
        //super.test400();//不能访问父类private方法
    }

    //1.3 访问父类的构造器,super(参数列表);只能放在构造器的第一句，只能出现一句！
    public  B() {
        // super();
        // super("guardwhy", 10);
        super("curry");
    }
}
```

Super01.java

```java
package cn.guardwhy.super01;

public class Super01 {
    public static void main(String[] args) {
        B b = new B();
        // 对象调用方法
        b.test01(); // n1的值:100, n2的值:200, n3的值:300
    }
}
```

#### 7.5.3 使用细节

1、调用父类的构造器的好处(分工明确，父类属性由父类初始化，子类的属性由子类初始化)。

2、当子类中有和父类中的成员(属性和方法)，重名时，为了访问父类的成员，必须通过`super`。如果没有重名，使用`super`、`this`、直接访问是一样的效果。

3、super的访问不限于直接父类，如果爷爷类和本类中有同名的成员，也可以使用super去访问爷爷类的成员，如果多个基类(上级类)中都有同名的成员，使用super访问遵循就近原则。(A->B->C)，当然也要遵循访问权限的相关规则。

4、代码示例

A.java

```java
package cn.guardwhy.super01;

public class A {
    // 1.1 定义成员属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    // 1.2 定义构造方法
    public A() {}
    public A(String name) {}
    public A(String name, int age) {}

    // 1.3 定义cal()方法
    public void cal(){
        System.out.println("A类的cal()方法...");
    }
}
```

B.java

```java
package cn.guardwhy.super01;

public class B extends A{

    public int n1 = 90;

    // 1.0 创建sum 方法
    public void sum(){
        /**
         * 调用父类-A的cal()方法这时，因为子类B没有cal方法，因此我可以使用下面三种方式
         * 找cal方法时(cal() 和 this.cal())，顺序是:(1)先找本类，如果有，则调用
         * (2)如果没有，则找父类(如果有，并可以调用，则调用)
         * (3)如果父类没有，则继续找父类的父类,整个规则，就是一样的,直到 Object类。
         * 提示：如果查找方法的过程中，找到了，但是不能访问， 则报错, cannot access
         * 如果查找方法的过程中，没有找到，则提示方法不存在
         */
        // cal();
        this.cal(); //等价 cal
        //找cal方法(super.call()) 的顺序是直接查找父类，其他的规则一样
        super.cal();
    }

    // 1.1 定义cal()方法
    public void cal(){
        System.out.println("B类的cal()方法...");
    }

    // 1.3 访问属性的规则
    public void method01(){
        /**
         * n1和 this.n1查找的规则是,(1)先找本类，如果有，则调用
         * (2) 如果没有，则找父类(如果有，并可以调用，则调用)
         * (3) 如果父类没有，则继续找父类的父类,整个规则，就是一样的,直到 Object类
         * 提示：如果查找属性的过程中，找到了，但是不能访问， 则报错, cannot access
         * 如果查找属性的过程中，没有找到，则提示属性不存在
         */
        System.out.println("B类中n1的值: :"+ n1);
        // System.out.println(this.n1);

        //找n1 (super.n1) 的顺序是直接查找父类属性，其他的规则一样
        System.out.println("A类中n1的值:"+ super.n1);
    }
}
```

Super01.java

```java
package cn.guardwhy.super01;

public class Super01 {
    public static void main(String[] args) {
        B b = new B();
        // 对象调用方法
        b.sum();
        b.method01();
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210911170833.png)

#### 7.5.4 super 和 this 的比较

| 区别点     | this                                                      | super                                        |
| ---------- | --------------------------------------------------------- | -------------------------------------------- |
| 访问属性   | 调用本类中的属性，如果本类没有此属性则从父类中继续 查找。 | 从父类开始查找属性                           |
| 调用方法   | 访问本类中的方法，如果本类没有此方法则从父类继续查找。    | 从父类开始查找方法                           |
| 调用构造器 | 调用本类构造器，必须放在构造器的首行。                    | 调用父类的构造器，必须放在子类构造器的首行。 |
| 特殊       | 表示当前对象                                              | 子类中访问父类对象                           |

### 7.6 方法重写/覆盖(override)

#### 7.6.1 基本介绍

方法覆盖(重写)就是子类有一个方法，和父类的某个方法的名称，返回类型、参数一样，那么就说子类的这个方法覆盖了父类的方法。

#### 7.6.2 快速入门案例

Animal.java

```java
package cn.override.demo01;

public class Animal {
    // 1.1 定义cry方法
    public void cry() {
        System.out.println("动物叫唤..");
    }
}
```

Dog.java

```java
package cn.override.demo01;

public class Dog extends Animal{
    /**
     * 因为Dog是Animal子类,Dog的 cry方法和 Animal的 cry定义形式一样(名称、返回类型、参数)
     * 这时就说Dog的cry方法，重写了Animal的cry方法.
     */
    public void cry() {
        System.out.println("小狗汪汪叫..");
    }
}
```

Override01.java

```java
package cn.override.demo01;

public class Override01 {
    public static void main(String[] args) {
        // 1.1 创建dog对象
        Dog dog = new Dog();
        // 1.2 对象调用方法
        dog.cry(); // 小狗汪汪叫..
    }
}
```

#### 7.6.3 方法重写细节

方法重写也叫方法覆盖，需要满足下面的条件

子类的方法的形参列表，方法名称，要和父类方法的形参列表，方法名称完全一样。

子类方法的返回类型和父类方法返回类型一样，或者是父类返回类型的子类，比如父类返回类型是`Object`，子类方法返回类型是`String`

```java
父类
public Object getInfo(){}

子类
public String getInfo(){}
```

子类方法不能缩小父类方法的访问权限，访问权限大小【`public` > `protected` > 默认 > `private`】

```java
子类
void method01(){}

父类
public void method01(){}
```

#### 7.6.4 重写和重载对比

对方法的重写和重载做一个比较

| 名称           | 发生范围 | 方法名   | 形参列表                         | 返回类型                                                     | 修饰符                               |
| -------------- | -------- | -------- | -------------------------------- | ------------------------------------------------------------ | ------------------------------------ |
| 重载(overload) | 本类     | 必须一样 | 类型，个数或者顺序至少有一个不同 | 无要求                                                       | 无要求                               |
| 重写(override) | 父子类   | 必须一样 | 相同                             | 子类重写的方法，返回的类型和子类返回的类型一致，或者是其子类。 | 子类方法不能缩小父类方法的访问范围。 |

#### 7.6.5 案例分析

1、案例需求

- 编写一个`Person` 类，包括属性`private（name、age）`，构造器、方法 `say`(返回自我介绍的字符串）。
- 编写一个`Student`类，继承`Person`类，增加 `id、score` 属性`private`，以及构造器，定义`say `方法(返回自我介绍的信息)。
- 在`main` 中,分别创建 `Person` 和 `Student` 对象，调用`say` 方法输出自我介绍。

2、代码示例

Person.java

```java
package cn.override.demo02;

public class Person {
    // 1.成员变量
    private String name;
    private int age;
    // 1.2 构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String say() {
        return "name=" + name + " age=" + age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

Student.java

```java
package cn.override.demo02;

public class Student extends Person{
    // 1.1成员变量
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        //1.2 这里会调用父类构造器
        super(name, age);
        this.id = id;
        this.score = score;
    }

    //1.3 这里体现super的一个好处，代码复用
    public String say() {
        return super.say() + " id=" + id + " score=" + score;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
```

OverrideExercise.java

```java
package cn.override.demo02;

public class OverrideExercise {
    public static void main(String[] args) {
        //在main中,分别创建Person和Student对象，调用say方法输出自我介绍
        Person p1 = new Person("curry", 10);
        System.out.println(p1.say());	// name=curry age=10

        Student stu = new Student("james", 38, 123456, 99.8);
        System.out.println(stu.say());	// name=james age=38 id=123456 score=99.8
    }
}
```

### 7.7 面向对象编程特征(多态)

#### 7.7.1 多态基本概念

1、同一个类型，在不同的状态下会表现出不同的行为。

2、多态的形式

```java
父类类名 对象名称 = new 子类构造器;
接口名称 对象名称 = new 实现类构造器;
父类的范围 > 子类的范围。
```

3、 多态的识别技巧

- 对于方法的调用：编译看左边，运行看右边。
- 对于变量的访问：编译看左边，运行也看左边。

4、多态的的使用前提

- 必须有继承或者实现关系。
- 必须有父类类型的变量引用子类类型的对象。
- 需要存在方法重写。

#### 7.7.2 入门案例

5、代码示例

```java
package cn.guardwhy_05;
// 基类:Animal
class Animal{
    // 成员变量
    public String name = "动物的总称";
    // 成员方法
    public void run(){
        System.out.println("动物都能吃东西");
    }
}
// 派生类:Cat
class Cat extends Animal{
    public String name = "猫";

    @Override
    public void run() {
        System.out.println("猫在屋子吃鱼..");
    }
}
// 派生类:Dog
class Dog extends Animal{
    public String name = "狗";

    @Override
    public void run() {
        System.out.println("狗拿耗子,没有多管闲事..");
    }
}

// 测试类:
public class PolymorphicDemo01 {
    public static void main(String[] args) {
        // 父类名称 对象名称 = new 子类构造器
        Animal as1 = new Cat();
        as1.run(); // 编译看左边,运行看右边    // 猫在屋子吃鱼..
        System.out.println(as1.name); // 编译看左边,运行看左边 // 动物的总称

        // 创建对象
        Animal as2 = new Dog();
        as2.run();  // 编译看左边,运行看右边
    }
}
```

**执行结果**

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/26-mysql.png" style="zoom:67%;" />

####  7.7.3 多态的优劣

1、多态的优势

- 在多态的形势下，右边的对象可以实现组件化解耦思想。可以随时切换业务逻辑，而不需要更改过多代码，遍历系统的维护，拓展和管理。

- 实际开发的过程中，父类类型作为方法形式参数，传递子类对象给方法，进行方法的调用。这样该方法可以接收一切子类对象的类型。更能体现出多态的扩展性与便利。


2、多态的劣势

多态形式下无法调用子类独有的功能，因为编译看左边，左边没有子类独有的功能就直接报错！！

**代码示例**

```java
package cn.guardwhy_05;
// 基类:Animal
class Animal1{
    // 成员方法
    public void run(){
        System.out.println("动物都能吃东西");
    }
}
// 派生类:Cat
class Cat1 extends Animal1{

    @Override
    public void run() {
        System.out.println("猫在屋子里跑步..");
    }
    // 特有功能
    public void eat(){
        System.out.println("猫吃鱼...");
    }
}
// 派生类:Dog
class Dog1 extends Animal1{
    @Override
    public void run() {
        System.out.println("狗拿耗子,没有多管闲事..");
    }
}

// 测试类
public class PolymorphicDemo02 {
    public static void main(String[] args) {
        // 创建对象
        Animal1 as = new Cat1();
        // 对象调用方法
        as.run();
        // a.catchMouse(); // 多态下无法调用子类独有的功能,编译看左边

        Animal1 cs = new Cat1();
        start(cs);

        Animal1 ds = new Dog1();
        start(ds);
    }

    // 开发一个动物大赛
    public static void start(Animal1 a){
        a.run();
    }
}
```

**执行结果**

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/27-mysql.png" style="zoom: 80%;" />

#### 7.7.4 向上转型

==多态的前提是：两个对象(类)存在继承关系==。

1、基本特点

本质: 父类的引用指向了子类的对象。

语法: `父类类型 引用名 = new 子类类型();`

特点: 编译类型看左边，运行类型看右边。可以调用父类中的所有成员【需要遵守访问权限】，不能调用子类中特有成员，最终运行效果看子类的具体实现！！

2、代码示例

Animal.java

```java
package cn.polymorphism.demo01;
// 动物类
public class Animal {
    String name = "动物";
    int age = 10;
    public void sleep(){
        System.out.println("睡");
    }
    public void run(){
        System.out.println("跑");
    }
    public void eat(){
        System.out.println("吃");
    }
    public void show(){
        System.out.println("hello,你好");
    }
}
```

Cat.java

```java
package cn.polymorphism.demo01;

public class Cat extends Animal{
    //1.1 方法重写
    public void eat(){
        System.out.println("猫吃鱼");
    }
    //Cat特有方法
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
```

PolyDetail.java

```java
package cn.polymorphism.demo01;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型: 父类的引用指向了子类的对象
        //语法：父类类型引用名 = new 子类类型();
        Animal animal = new Cat();
        Object obj = new Cat();//可以吗? 可以 Object 也是 Cat的父类

        //向上转型调用方法的规则如下:
        //(1)可以调用父类中的所有成员(需遵守访问权限),但是不能调用子类的特有的成员。
        //(2)因为在编译阶段，能调用哪些成员,是由编译类型来决定的
        //animal.catchMouse();错误
        //(3)最终运行效果看子类(运行类型)的具体实现, 即调用方法时，按照从子类(运行类型)开始查找方法
        //，然后调用，规则我前面我们讲的方法调用规则一致。
        animal.eat();//猫吃鱼..
        animal.run();//跑
        animal.show();//hello,你好
        animal.sleep();//睡
    }
}
```

#### 7.7.5 向下转型

==多态的前提是：两个对象(类)存在继承关系==。

1、基本特点

语法: `子类类型 引用名 = (子类类型)父类引用;`

特点: 只能强转父类的引用，不能强转父类的对象。要求父类的引用必须指向的是当前 目标类型的对象，当向下转型后，可以调用子类类型中所有的成员。

2、代码示例

```java
package cn.polymorphism.demo01;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型: 父类的引用指向了子类的对象
        //语法：父类类型引用名 = new 子类类型();
        Animal animal = new Cat();

        /***
         * 可以调用Cat的 catchMouse方法
         * 多态的向下转型
         * (1)语法：子类类型 引用名 =（子类类型）父类引用;
         * 问一个问题? cat 的编译类型 Cat,运行类型是 Cat
         */
        Cat cat = (Cat) animal;
        //猫抓老鼠
        cat.catchMouse();
        System.out.println("ok~~");
    }
}
```

#### 7.7.6 多态注意事项

1、属性没有重写之说，属性的值看编译类型！！！

```java
package cn.polymorphism.demo01;
/**
 * 对于属性的访问: 编译看左边，运行看左边 
 */
class Base { //父类
    int count = 10;//属性
}
class Sub extends Base {//子类
    int count = 20;//属性
}

public class PolyDetail02 {
    public static void main(String[] args) {
        //属性没有重写之说！属性的值看编译类型
        Base base = new Sub();//向上转型
        System.out.println(base.count);// ？ 看编译类型 10
        Sub sub = new Sub();
        System.out.println(sub.count);//?  20
    }
}
```

2、`instanceOf`比较操作符，用于判断对象的类型是否为`XX`类型或者`XX`类型的子类型。

```java
package cn.polymorphism.demo01;

class AA {} //父类
class BB extends AA {}//子类
public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof  BB);// true
        System.out.println(bb instanceof  AA);// true

        //aa 编译类型 AA, 运行类型是BB
        //BB是AA子类
        AA aa = new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);

        Object obj = new Object();
        System.out.println(obj instanceof AA);//false
        String str = "hello";
        //System.out.println(str instanceof AA);
        System.out.println(str instanceof Object);//true
    }
}
```

#### 7.7.7 案例分析

1、下面的每条语言，哪些是正确的，哪些是错误的，为什么?

````java
package cn.polymorphism.demo01;

public class PolyExercise01 {
    public static void main(String[] args) {
        double d = 13.4;   // ok
        long l = (long) d; // ok
        System.out.println(l); // 13
        int in = 5; // ok
        // boolean b = (boolean) in;    // 不对， boolean -> int
        Object obj = "Hello";   // 可以，向上转型
        String objStr = (String) obj; // 可以，向下转型
        System.out.println(objStr); // hello
        Object objPri = new Integer(5); // 可以，向上转型

        // String str = (String) objPri; // 错误ClassCastExcetpion,指向Integer的父类引用，转成String
        Integer str1 = (Integer) objPri;   // 可以，向下转型
    }
}
````

2、查看下面源码，最终结果输出啥？

```java
package cn.polymorphism.demo02;
/**
 * 对于方法的调用:编译看左边，运行看右边
 * 对于变量的访问:编译看左边，运行也看左边
 */
//1.1 父类
class Base {
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}
// 1.2 子类
class Sub extends Base {//子类
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);//20
        s.display();//20
        Base b = s;
        System.out.println(b == s);//ture
        System.out.println(b.count);//10
        b.display();//20
    }
}
```

#### 7.7.8 java动态绑定机制

1、==当调用对象方法的时候，该方法会和该对象的内存地址(运行类型)绑定==。

2、==当调用对象属性时候，没有动态绑定机制，哪里声明，哪里使用！！==

```java
package cn.polymorphism.demo02;

//1、父类
class A {
    // 1.1 定义变量i
    public int i = 10;

    //1.2 父类sum()
    public int sum() {
        return getI() + 10;//20 + 10
    }
    //1.3 父类sum1()
    public int sum1() {
        return i + 10;//10 + 10
    }

    //1.4 父类getI()
    public int getI() {
        return i;
    }
}

//2.子类
class B extends A {
    public int i = 20;

    //2.1 子类getI()
    public int getI() {
        return i;
    }
}

public class DynamicBinding01 {
    public static void main(String[] args) {
        //3.1 a的编译类型 A, 运行类型 B
        A a = new B();//向上转型
        System.out.println("a.sum()值:" + a.sum());  // a.sum()值:30
        System.out.println("a.sum1()的值:" + a.sum1());// a.sum1()的值:20
    }
}
```

#### 7.7.9 多态的应用

##### 1.多态数组

数组的定义类型为父类类型，里面保存的实际元素类型为子类类型。

需求实现: 现有一个继承结构如下，要求创建1个`Person`对象、2 个`Student`对象和 2 个`Teacher`对象, 统一放在数组中，并调用每个对象`say()` 方法。

Person.java

```java
package cn.polymorphism.demo02;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //返回名字和年龄
    public String say() {
        return "姓名:" + name + ", 年龄:" + age;
    }
}
```

Student.java

```java
package cn.polymorphism.demo02;

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    //重写父类say

    @Override
    public String say() {
        return  super.say() + "，score=" + score + "，职业:学生";
    }
    //特有的方法
    public void study() {
        System.out.println(getName() + "正在学java...");
    }
}
```

Teacher.java

```java
package cn.polymorphism.demo02;

public class Teacher extends Person{
    // 薪水属性
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //写重写父类的say方法
    @Override
    public String say() {
        return super.say() + ",薪水:" + salary + ",职业:老师";
    }
    //特有方法
    public void teach() {
        System.out.println(getName() + "正在讲java课程...");
    }
}
```

PloyArray.java

```java
package cn.polymorphism.demo02;

public class PloyArray {
    public static void main(String[] args) {
        // 1.1 2个Student 对象和2个Teacher对象, 统一放在数组中，并调用每个对象say方法
        Person[] persons = new Person[5];
        persons[0] = new Person("kobe", 20);
        persons[1] = new Student("curry", 18, 100);
        persons[2] = new Student("t-mac", 19, 66);
        persons[3] = new Teacher("james", 30, 20000);
        persons[4] = new Teacher("jordan", 50, 25000);

        //1.2 循环遍历多态数组，调用say()方法
        for (int i = 0; i < persons.length; i++) {
            //1.3 person[i]编译类型是 Person ,运行类型是是根据实际情况有JVM来判断
            System.out.println(persons[i].say());//动态绑定机制
            //1.4 使用类型判断+向下转型,判断person[i] 的运行类型是不是Student
            if(persons[i]  instanceof  Student) {
                //1.5 向下转型
                Student student = (Student)persons[i];
                student.study();
            } else if(persons[i] instanceof  Teacher) {
                Teacher teacher = (Teacher)persons[i];
                teacher.teach();
            } else if(persons[i] instanceof  Person){
            } else {
                System.out.println("你的类型有误, 请自己检查...");
            }
        }
    }
}
```

执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210912145533.png" style="zoom: 80%;" />

##### 2.多态参数

==方法定义的形参为父类类型，实参类型允许为子类类型==。

案例需求：定义员工类`Employee`，包括姓名和月工资【`private`】,以及计算年工资`getAnnual`的方法。普通员工和经理继承了员工，经理类多了奖金`bonus`属性和管理`manage`方法，普通员工类多了`work`方法，普通员工和经理类要求分别重写`getAnnual`方法。测试类中添加一个方法`showEmpAnnual(Employee e)`,实现获取任何员工对象的年工资，并且在`main`方法中调用该方法【`e.getAnnual()`】,测试类中添加一个方法，`testWork()`，如果是普通员工，则调用`work`方法，如果是经理，则调用`maage()`方法。

Employee.java

```java
package cn.polymorphism.demo03;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    //得到年工资的方法
    public double getAnnual() {
        return 12 * salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
```

Manager.java

```java
package cn.polymorphism.demo03;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manage() {
        System.out.println("经理:" + getName()+", 年薪:" + getAnnual() );
    }
    //重写获取年薪方法
    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
```

Worker.java

```java
package cn.polymorphism.demo03;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work() {
        System.out.println("普通员工:" + getName()+", 年薪:" + getAnnual());
    }

    @Override
    //因为普通员工没有其它收入，则直接调用父类方法
    public double getAnnual() {
        return super.getAnnual();
    }
}
```

PloyParameter.java

```java
package cn.polymorphism.demo03;

public class PloyParameter {
    //1.1 定义showEmpAnnual(Employee e)方法，实现获取任何员工对象的年工资,并在main方法中调用该方法 
    public void showEmpAnnual(Employee e) {
        System.out.println("年薪:" + e.getAnnual());//动态绑定机制.
    }
    //1.2 添加一个方法testWork(),如果是普通员工，则调用work方法，如果是经理，则调用manage方法
    public void testWork(Employee e) {
        if(e instanceof  Worker) {
            //有向下转型操作
            ((Worker) e).work();
        } else if(e instanceof Manager) {
            //有向下转型操作
            ((Manager) e).manage();
        } else {
            System.out.println("不做处理...");
        }
    }
    
    public static void main(String[] args) {
        // 创建wk对象
        Worker wk = new Worker("james", 2500);
        // 创建mg对象
        Manager mg = new Manager("curry", 5000, 200000);
        // 创建ployParameter对象
        PloyParameter ployParameter = new PloyParameter();
        // 对象调用方法
        ployParameter.showEmpAnnual(wk);
        ployParameter.showEmpAnnual(mg);

        ployParameter.testWork(wk);
        ployParameter.testWork(mg);

    }
}
```

执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210912163353.png" style="zoom:80%;" />

### 7.8 Object 类详解

类 `Object` 是类层次结构的根类。每个类都使用 `Object`  作为超类。所有对象（包括数组）都实现这个类的方法。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210912165334.png" style="zoom: 67%;" />

#### 7.8.1 == 和 equals 方法

1、== 是一个比较运算符

`==`：既可以判断基本类型，又可以判断引用类型。

`==`：如果判断基本类型，判断的是值是否相等。

`==`：如果判断引用类型，判断的是地址是否相等，即判定是不是同一个对象。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210912171643.png" style="zoom:67%;" />

```java
package cn.object.demo01;

class B {

}
class A extends B {

}
public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);//true
        System.out.println(b == c);//true
        B bObj = a;
        System.out.println(bObj == c);//true
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);//基本数据类型，判断值是否相等, true
    }
}
```

2、equals 方法

`equals`：是`Object`类中的方法，只能判断引用类型。==默认判断的是地址是否相等，子类中往往重写该方法，用于判断内容是否相等==。

查看【String】和【Integer】的源码分析

```java
public class Equals01 {
    public static void main(String[] args) {
        
        //1.0 Object的equals方法,默认就是比较对象地址是否相同,也就是判断两个对象是不是同一个对象.
         public boolean equals(Object obj) {
            return (this == obj);
        }
        
        // 1.1 String类的equals方法把Object的equals方法重写了,变成了比较两个字符串值是否相同
        public boolean equals(Object anObject) {
                //如果是同一个对象
            if (this == anObject) {
                //返回true
                return true;
            }
                //判断类型
            if (anObject instanceof String) {
                //向下转型
                String anotherString = (String)anObject;
                int n = value.length;
                //如果长度相同
                if (n == anotherString.value.length) {
                    char v1[] = value;
                    char v2[] = anotherString.value;
                    int i = 0;
                    //然后一个一个的比较字符
                    while (n-- != 0) {
                        if (v1[i] != v2[i])
                            return false;
                        i++;
                    }
                    //如果两个字符串的所有字符都相等，则返回true
                    return true;
                }
            }
                //如果比较的不是字符串，则直接返回false
            return false;
        }
        
        //1.3 Integer 也重写了Object的equals方法,变成了判断两个值是否相同
        public boolean equals(Object obj) {
            if (obj instanceof Integer) {
                return value == ((Integer)obj).intValue();
            }
            return false;
        }
    }
}
```

equals方法比较

```java
package cn.object.demo01;

public class Equals01 {
    public static void main(String[] args) {
        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);//false
        System.out.println(integer1.equals(integer2));//true

        String str1 = new String("guardwhy");
        String str2 = new String("guardwhy");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true
    }
}
```

#### 7.8.2 重写 equals 方法

1、判断两个`Person`对象的内容是否相等，如果两个`Person`对象的各个属性值都一样，则返回`true`，反之`false`。

```java
package cn.object.demo02;
/**
 * 判断两个Person对象的内容是否相等，如果两个Person对象的各个属性值都一样，则返回true，反之false。
 */

//1.1 extends Object
class Person{
    private String name;
    private int age;
    private char gender;

    //1.2 重写Object的equals方法
    public boolean equals(Object obj) {
        //1.3 判断如果比较的两个对象是同一个对象，则直接返回true
        if(this == obj) {
            return true;
        }
        //1.4 类型判断，是Person才比较
        if(obj instanceof  Person) {
            //1.5 进行向下转型, 因为需要得到obj的各个属性
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        //1.6 如果不是Person,则直接返回false
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}

public class EqualsExercise01 {
    public static void main(String[] args) {
        // 2.1 创建person对象
        Person p1 = new Person("curry", 10, '男');
        Person p2 = new Person("james", 20, '男');

        System.out.println("两对象的内容是否相等:" + p1.equals(p2)); // 两对象的内容是否相等:false
    }
}
```

#### 7.8.3 案例分析

1、应用实例1

```java
package cn.object.demo02;

class Student{//类
    public String name;
}

public class EqualsExercise02 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "curry";

        Student stu2 = new Student();
        stu2.name = "curry";

        System.out.println(stu1 == stu2); // False
        System.out.println(stu1.name .equals(stu2.name));//True
        System.out.println(stu1.equals(stu2));//False

        String s1 = new String("guardwhy");
        String s2 = new String("guardwhy");
        System.out.println(s1.equals(s2));//True
        System.out.println(s1 == s2); //False
    }
}
```

2、应用实例2

```java
package cn.object.demo02;

public class EqualsExercise03 {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println("65和65.0f是否相等:" + (it == fl));   // 65和65.0f是否相等:true

        char ch1 = 'A';
        char ch2 = 12;
        System.out.println("65和'A'是否相等?" + (it == ch1));    // 65和'A'是否相等?true
        System.out.println("12和ch2是否相等:" + (12 == ch2));    // 12和ch2是否相等:true

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1和str2是否相等:" + (str1 == str2));  // str1和str2是否相等:false

        System.out.println("str1是否equals str2:" +(str1.equals(str2)));  // str1是否equals str2:true
    }
}
```

#### 7.8.4 hashCode 方法

1、方法概述

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210913095715.png" style="zoom:80%;" />

2、方法总结

- 提高具有哈希结构的容器的效率！
- 两个引用，如果指向的是同一个对象，则哈希值肯定是一样的！
- 两个引用，如果指向的是不同对象，则哈希值是不一样的
- 哈希值主要根据地址号来的， 不能完全将哈希值等价于地址。

3、代码示例

```java
package cn.polymorphism.demo04;
class AA {

}
public class HashCode01 {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa2 = new AA();
        AA aa3 = aa;
        System.out.println("aa.hashCode()=" + aa.hashCode()); // aa.hashCode()=460141958
        System.out.println("aa2.hashCode()=" + aa2.hashCode()); // aa2.hashCode()=1163157884
        System.out.println("aa3.hashCode()=" + aa3.hashCode()); // aa3.hashCode()=460141958
    }
}
```

#### 7.8.5 toString 方法

1、基本介绍

- 默认返回：全类名+`@`+哈希值的十六进制，【查看 Object 的 toString 方法】子类往往重写 toString 方法，用于返回对象的属性信息。
- 重写`toString`方法，打印对象或拼接对象时，都会自动调用该对象的`toString`形式。
- 当直接输出一个对象时，`toString`方法会被默认的调用, 比如 `System.out.println(monster);` 就会默认调用`monster.toString()`

2、代码示例

```java
package cn.polymorphism.demo04;
class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    //重写toString方法, 输出对象的属性
    @Override
    //重写后，一般是把对象的属性值输出，当然程序员也可以自己定制
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}

public class ToString {
    public static void main(String[] args) {
        /*
        Object的toString() 源码
        (1)getClass().getName() 类的全类名(包名+类名 )
        (2)Integer.toHexString(hashCode()) 将对象的hashCode值转成16进制字符串
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
         */

        // 1.1 创建monster对象
        Monster monster = new Monster("curry", "打球的", 1000);
        System.out.println(monster.toString() + " hashcode=" + monster.hashCode());

        System.out.println("==当直接输出一个对象时，toString方法会被默认的调用==");
        //1.2 等价 monster.toString()
        System.out.println(monster);
    }
}
```

3、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210913105313.png)

## 第8章 Java面向对象编程(进阶)

### 8.1 类变量相关操作

#### 8.1.1 类变量的引出

1、问题引出：

有一群小孩在玩堆积木游戏,不时有新的小孩加入,请问如何知道现在共有多少人在玩?

2、思路分析

在`main`方法中定义一个变量`count`，当一个小孩加入游戏后`count++`，最后多少`count`就记录有多少小孩玩游戏。

`count`是一个独立于对象，很尴尬，因为以后访问`count`很麻烦，没有使用到`OOP`=>因此引出 ==类变量/静态变量==。

#### 8.1.2 类变量快速入门

设计一个`int count` 表示总人数,在创建一个小孩时，就把 `count` 加 1,并且 `count` 是所有对象共享的。

```java
package cn.stacti_.demo01;

class Student { //类
    private String name;

    /**
     * 1.1 定义一个变量 count ,是一个类变量(静态变量) static静态.
     * 该变量最大的特点就是会被Student 类的所有的对象实例共享
     */
    public static int count = 0;
    public Student(String name) {
        this.name = name;
    }
    // 1.2 创建join()方法
    public void join() {
        System.out.println(name + "加入了堆积木游戏..");
    }
}

public class StudentGame {
    public static void main(String[] args) {
        //2.1 定义一个变量 count, 统计有多少加入了游戏
        int count = 0;
        // 2.2 创建stu1对象
        Student stu1 = new Student("curry");
        stu1.join();
        //count++;
        stu1.count++;

        // 2.2 创建stu2对象
        Student stu2 = new Student("james");
        stu2.join();
        //count++;
        stu2.count++;

        //2.3 类变量，可以通过类名来访问
        System.out.println("共有" + Student.count+ "个小孩加入了堆积木游戏");
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210913162831.png)	

#### 8.1.3 类变量内存布局

1、jdk1.8以前静态变量的内存布局

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210913175854.png" style="zoom:80%;" />

2、jdk1.8以后静态变量的内存布局

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210913180012.png" style="zoom:80%;" />

3、总结点

==static变量是同一个类所有对象共享，static类变量，在类加载器的时候就生成了。==

#### 8.1.4 类变量的特点

1、什么是类变量

类变量也叫静态变量/静态属性，==是该类的所有对象共享的变量任何一个该类的对象去访问它时,取到的都是相同的值，同样任何一个该类的对象去修改它时修改的也是同一个变量==。

2、定义类变量

基本语法

```java
方式一：访问修饰符 static 数据类型 变量名;
方式二：static 访问修饰符 数据类型 变量名;
```

3、访问类变量

- 类名.类变量名
- 对象名.类变量名【静态变量的访问修饰符的访问权限和范围和普通属性是样的】

4、代码示例

```java
package cn.stacti_.demo01;

class A {

    //1.1 类变量的访问，必须遵守 相关的访问权限.
    public static  String name = "NBA真牛逼！！！";
    //普通属性/普通成员变量/非静态属性/非静态成员变量/实例变量
    private int num = 10;

}

public class StaticDemo01 {
    public static void main(String[] args) {
        //2.1 类名.类变量名
        //2.2 注意:类变量是随着类的加载而创建，所以即使没有创建对象实例也可以访问
        System.out.println("类名.类变量名:" + A.name); // 类名.类变量名:NBA真牛逼！！！
        A a = new A();
        //2.3 通过对象名.类变量名
        System.out.println("对象名.类变量名:" + a.name); // 对象名.类变量名:NBA真牛逼！！！
    }
}
```

#### 8.1.5 类变量使用注意事项

1、什么时候需要用类变量：

- 当我们需要让某个类的所有对象都共享一个变量时， 就可以考虑使用类变量(静态变量):比如:定义学生类，统计所有学生共交多少钱。

2、类变量与实例变量(普通属性)区别：

- 类变量是该类的所有对象共享的，而实例变量是每个对象独享的。

3、加上static称为类变量或静态变量，否则称为实例变量/普通变量/非静态变量

4、类变量可以通过【类名.类变量名】或者【对象名.类变量名】来访问。

- java设计者推荐使用【类名.类变量名】方式访问，【前提是满足访问修饰符的访向权限和范围】。

5、实例变量不能通过【类名.类变量名】方式访问。

6、==类变量是在类加载时就初始化了，也就是说即使你没有创建对象，只要类加载了,就可以使用类变量了==。

7、类变量的生命周期是随类的加载开始，随着类消亡而销毁。

```java
package cn.stacti_.demo01;

class B {
    // 1.1 定义变量n1
    public int n1 = 100;
    // 1.2 定义静态变量n2
    public static int n2 = 200;
}

class C {
    // 2.1 定义静态变量 address
    public static String address = "北京";
}

public class StaticDemo02 {
    public static void main(String[] args) {
        // 3.1 创建 b对象
        B b = new B();
        //System.out.println(B.n1);
        System.out.println(B.n2);   // 200

        // 3.2 静态变量是类加载的时候，就创建了,所以没有创建对象实例也可以通过类名.类变量名来访问.
        System.out.println(C.address); // 北京

    }
}
```

### 8.2 类方法相关操作

#### 8.2.1 基本介绍

类方法也叫静态方法，具体表现方式如下

```java
方式一:
访问修饰符 static 数据返回类型 方法名(){ } 

方式二: 
static 访问修饰符 数据返回类型 方法名(){}
```

#### 8.2.2 类方法的调用

1、使用方式：

【类名.类方法名】或者【对象名.类方法名】,使用前提是满足访问修饰符的访问权限和范围。

2、代码实现

```java
package cn.stacti_.demo02;

class Student {
    // 1.1 成员变量name
    private String name;
    //1.2 定义一个静态变量，来累积学生的学费
    private static double fee = 0;

    public Student(String name) {
        this.name = name;
    }

    //1.3 当方法使用了static修饰后，该方法就是静态方法,静态方法就可以访问静态属性/变量
    public static void payFee(double fee) {
        //1.4累积到
        Student.fee += fee;
    }
    public static void showFee() {
        System.out.println("所需支付总学费:" + Student.fee);
    }
}

//2.1 可以将方法做成静态的，方便调用
class MyTools  {
    //2.2 求出两个数的和
    public static double calSum(double n1, double n2) {
        return  n1 + n2;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // 3.1 创建2个学生对象
        Student stu1 = new Student("curry");
        //stu1.payFee(100);
        Student.payFee(100);//对不对?对

        Student stu2 = new Student("james");
        //mary.payFee(200);
        Student.payFee(200);


        //3.2 输出当前收到的总学费
        Student.showFee();//300

        //3.3 如果希望不创建实例，也可以调用某个方法(即当做工具来使用)这时，把方法做成静态方法时非常合适
        System.out.println("9开平方:" + Math.sqrt(9));
        // 3.4 输出两数之和
        System.out.println("两数之和:" + MyTools.calSum(10, 30));
    }
}
```

3、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210914081607.png)	

#### 8.2.3 使用注意事项

1、类方法使用细节

- 类方法和普通方法都是随着类的加载而加载，将结构信息存储在方法区:

  - 类方法中无this的参数。

  - 普通方法中隐含着this的参数。

- 类方法可以通过类名调用，也可以通过对象名调用。

- 普通方法和对象有关，需要通过对象名调用，比如【对象名.方法名(参数)】，不能通过类名调用。

- 类方法中不允许使用和对象有关的关键字，比如`this和super`，普通方法(成员方法)可以。

- 类方法(静态方法)中只能访问静态变量或静态方法。

- 普通成员方法，既可以访问非静态成员，也可以访问静态成员。

小结: ==静态方法，只能访问静态的成员，非静态的方法，可以访问静态成员和非静态成员(必须遵守访问权限)==。

2、代码示例

```java
package cn.stacti_.demo02;

class T {
    // 1.1 定义成员变量n1
    private int n1 = 100;
    // 1.2 定义静态变量 n2
    private static int n2 = 200;

    //1.3 非静态方法,普通方法
    public void method01() {
    }

    //1.4 静态方法,类方法,类方法中不允许使用和对象有关的关键字，
    public static void method02() {
        //1.5 比如this和super,普通方法(成员方法)可以。
        // System.out.println(this.n1);
    }

    //1.6 类方法(静态方法)中 只能访问 静态变量 或静态方法,静态方法只能访问静态成员。
    public static void method03() {
        System.out.println(n2);
        System.out.println(T.n2);
        //System.out.println(this.n2);不能使用
        method02();//OK
        //method01();//错误
    }

    //1.7 普通成员方法，既可以访问非静态成员，也可以访问静态成员
    public void method04() {
        //非静态成员
        System.out.println(n1);
        method01();
        //静态成员
        System.out.println(n2);
        // 非静态方法可以访问静态成员和非静态成员
        method03();

    }
}
public class StaticMethod02 {
    public static void main(String[] args) {
        // 2.1 对象调用静态方法
        T.method02();
        
        //2.2 非静态方法，不能通过类名调用
        //T.method01(); // 错误，需要先创建对象，再调用
        
        // 2.3 对象调用方法
        new T().method01();//可以
    }
}
```

#### 8.2.4 案例分析

1、看下面源码，最终结果输出啥？

```java
package cn.stacti_.demo02;

// 1.1 创建Test类
class Test {
    // 1.2 定义静态变量
    static int count = 9;
    // 1.3 定义count()方法
    public void count() {
        System.out.println("count值:" + (count++));
    }
}
public class StaticMethod03 {
    public static void main(String args[]) {
        new Test().count(); // count值:9
        new Test().count(); // count值:10
        System.out.println("count值:"+ Test.count);	// count值:11
    }
}
```

2、看看下面代码有没有错误,如果有错误，就修改，看看输出什么?

```java
package cn.stacti_.demo02;

class Person {
    // 1.1 成员变量
    private int id;
    // 1.2 静态成员变量
    private static int total = 0;
    // 1.3 创建静态getTotalPerson()方法
    public static int getTotalPerson() {
        //id++;//错误, 注销
        return total;
    }
    //1.4 构造器
    public Person() {
        total++;  //total = 1
        id = total;//id = 1
    }
}
public class StaticMethod04 {
    public static void main(String[] args) {
        System.out.println("Number of total is:" +Person.getTotalPerson()); // Number of total is:0
        Person p1 = new Person();
        System.out.println( "Number of total is:"+ Person.getTotalPerson()); // Number of total is:1
    }
}
```

3、看看下面代码有没有错误,如果有错误，就修改，看看 total 等于多少 4?

```java
package cn.stacti_.demo03;

class Person {
    // 1.1 成员变量
    private int id;
    // 1.2 静态成员变量
    private static int total = 0;
    // 1.3 静态成员方法
    public static void setTotalPerson(int total){
        //1.4 错误，因为在static方法中，不可以使用this 关键字
        // this.total = total;
        Person.total = total;
    }
    //1.5 构造器
    public Person() {
        total++;
        id = total;
    }

    //1.6 编写一个方法，输出total的值
    public static void method() {
        System.out.println("total的值=" + total); // total的值=4
    }
}
public class StaticMethod05 {
    public static void main(String[] args) {
        // 类调用静态方法
        Person.setTotalPerson(3);
        new Person(); //最后 total的值就是4
        // 类调用静态方法
        Person.method();
    }
}

```

小结: ==静态方法，只能访问静态成员。非静态方法，可以访问所有的成员，在编写代码时候，仍然要遵守访问权限规则！！==

### 8.3 理解 main 方法

#### 8.3.1 深入理解 main 方法

1、解释`main`方法的形式：`public static void main(String[] args)`

- `main`方法时虚拟机调用。
- java虚拟机需要调用类的`main()`方法，所以该方法的访问权限必须是`public`。
- `java`虚拟机在执行`main()`方法时候不必创建对象，所有该方法必须是`static`。
- 该方法接收`String`类型的数组参数，该数组中保存执行`java`命令时传递给所运行的类的参数。
- java执行的程序 参数1 参数2 参数3

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210914184531.png)

#### 8.3.2 main 方法小结

1、在`main()`方法中，可以直接调用`main`方法所在类的静态方法或静态属性。

2、不能直接访问该类中的非静态成员，必须创建该类的一个实例对象后，才能通过这个对象去访问类中的非静态成员。

代码示例

```java
package cn.stacti_.demo03;

public class Main01 {
    //1.1 静态的变量/属性
    private static  String name = "guardwhy";
    //1.2 非静态的变量/属性
    private int n1 = 10;

    //1.3 静态方法
    public static  void method01() {
        System.out.println("Main01的method01方法(静态方法)");
    }
    //1.4 非静态方法
    public void method02() {
        System.out.println("Main01的method02方法(非静态方法)");
    }
    public static void main(String[] args) {

        //2.1 静态方法main 可以访问本类的静态成员
        System.out.println("静态变量:" + name);
        method01();
        //2.2 静态方法main 不可以访问本类的非静态成员
        //System.out.println("n1=" + n1);//错误
        //method02();

        //2.3 静态方法main 要访问本类的非静态成员，需要先创建对象 , 再调用即可
        Main01 main01 = new Main01();
        System.out.println("非静态变量n1：" + main01.n1);
        main01.method02();
    }
}
```

### 8.4 代码块

#### 8.4.1 基本介绍

==代码化块又称为初始化块==,属于类中的成员【即是类的一部分】，类似于方法，将逻辑语句封装在方法体中，通过`{}`包围起来。

但和方法不同，没有方法名，没有返回，没有参数，只有方法体，而且不用通过对象或类显式调用，而是加载类时，或创建对象时隐式调用。

#### 8.4.2 基本语法

```java
[修饰符]{
    代码
};
```

说明注意:

1)修饰符可选，要写的话，也只能写static

2)代码块分为两类，使用static 修饰的叫静态代码块，没有static修饰的，叫普通代码块/非静态代码块。

3)逻辑语句可以为任何逻辑语句(输入、输出、方法调用、循环，判断等)。

4)`;`号可以写上，也可以省略。

#### 8.4.3 代码块的好处

1、相当于另外种形式的构造器(对构造器的补充机制)，可以做初始化的操作。

2、如果多个构造器中都有重复的语句， 可以抽取到初始化块中，提高代码的重用性。

```java
package cn.codeblock.demo01;
/**
 * 可以把相同的语句，放入到一个代码块中，即可这样不管调用哪个构造器，创建对象，都会先调用代码块的内容
 * 代码块调用的顺序优先于构造器..
 */
class Movie {
    private String name;
    private double price;
    private String director;

    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正是开始...");
    };

    public Movie(String name) {
        System.out.println("Movie(String name) 被调用...");
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("Movie(String name, double price, String director) 被调用...");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("杀破狼·贪狼");
        System.out.println("===============");
        Movie movie2 = new Movie("战狼2", 100, "吴京");
    }
}
```

#### 8.4.4 代码块注意事项

1、`static`代码块也叫静态代码块，作用就是对类进行初始化，而且它随着类的加载而执行，并且只会执行次。==如果是普通代码块，每创建一个对象，就执行==。

```java
package cn.codeblock.demo01;

class AA {
    //静态代码块
    static {
        System.out.println("AA的静态代码1被执行...");   // AA的静态代码1被执行...
    }
}
public class CodeBlock02 {
    public static void main(String[] args) {
        //1. 创建对象实例时(new)
        AA aa = new AA();
    }
}
```

2、类什么时候被加载

①创建对象实例时(new) ②创建子类对象实例，父类也会被加载。③使用类的静态成员时(静态属性，静态方法)

```java
package cn.codeblock.demo01;

class AA extends BB{
    //静态代码块
    static {
        System.out.println("AA的静态代码1被执行...");
    }
}
class BB {
    //静态代码块
    static {
        System.out.println("BB的静态代码1被执行...");
    }
}

public class CodeBlock02 {
    public static void main(String[] args) {
        //1. 创建子类对象实例，父类也会被加载, 而且，父类先被加载，子类后被加载
        AA aa1 = new AA();
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210914214033.png)

```java
package cn.codeblock.demo01;
class Animal {
    //1.1 静态代码块
    static {
        System.out.println("Animal的静态代码被执行...");
    }
}

class Cat extends Animal {
    // 2.1 静态属性
    public static int n1 = 32;

    //2.2 静态代码块
    static {
        System.out.println("Cat的静态代码被执行");//
    }
}
public class CodeBlock03 {
    public static void main(String[] args) {
        //3.1 使用类的静态成员时(静态属性，静态方法)
        System.out.println("静态属性n1:" + Cat.n1);
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210914215712.png)

3、普通的代码块，在创建对象实例时，会被隐式的调用。被创建一次，就会调用次，如果只是使用类的静态成员时，普通代码块并不会执行。

- `static`代码块是类加载时，执行，只会执行1次。
- 普通代码块是在创建对象时调用的，创建一次，调用1次。

```java
package cn.codeblock.demo01;

class DD {
    //1.1 静态属性
    public static int n1 = 16;
    //1.2 静态代码块
    static {
        System.out.println("DD的静态代码1被执行...");//
    }

    /**
     * 1.3 普通代码块在new对象时被调用，而且是每创建一个对象，就调用一次。
     * 可以这样简单的，理解 普通代码块是构造器的补充。
     */
    {
        System.out.println("DD的普通代码块...");
    }
}
public class CodeBlock04 {
    public static void main(String[] args) {
        //2.1 static代码块，是在类加载时，执行的，而且只会执行一次。

        // DD dd = new DD();
        // DD dd1 = new DD();

        /**
         * 2.2 普通的代码块，在创建对象实例时，会被隐式的调用,被创建一次，就会调用一次。
         * 如果只是使用类的静态成员时，普通代码块并不会执行。
         */
        System.out.println("静态属性n1:" + DD.n1);//静态模块块一定会执行
    }
}
```

执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210914221422.png)

4、创建一个对象时，在一个类调用顺序

- 调用静态代码块和静态属性初始化【静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块和多个静态变量初始化，则按他们定义的顺序调用】
- 调用普通代码块和普通属性的初始化【普通代码块和普通属性初始化调用的优先级一样，如果有多个普通代码块和多个普通属性初始化，则按定义顺序调用】
- 调用构造方法。

```java
package cn.codeblock.demo02;

class A {
    //1.1 普通代码块
    {
        System.out.println("A类普通代码块被调用");
    }
    //1.2 普通属性的初始化
    private int n2 = method02();

    //1.3 静态代码块
    static {
        System.out.println("A类静态代码块被调用");
    }

    //1.4 静态属性的初始化
    private static  int n1 = method01();

    // 1.5 静态方法method01()
    public static int method01() {
        System.out.println("method01(静态方法)被调用...");
        return 100;
    }
    //1.6 普通方法/非静态方法method02()
    public int method02() {
        System.out.println("method02(普通方法)被调用...");
        return 200;
    }

    //无参构造器
    public A() {
        System.out.println("A类无参构造器被调用");
    }

}

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        // 2.1 创建a对象
        A a = new A();
    }
}
```

执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210915085147.png" style="zoom:80%;" />

5、构造器的最前面其实隐含了`super()`和调用普通代码块。静态相关的代码块，属性初始化，在类加载时就已经执行完毕。因此静态相关的代码块是优先于构造器和普通代码块执行的。

```java
package cn.codeblock.demo02;

//父类Object
class AA {
    {
        System.out.println("AA的普通代码块");
    }
    public AA() {
        //1.1 super()
        //1.2 调用本类的普通代码块
        System.out.println("AA()构造器被调用....");
    }
}

class BB extends AA  {
    {
        System.out.println("BB的普通代码块...");
    }
    public BB() {
        //2.1 super()
        //2.2 调用本类的普通代码块
        System.out.println("BB()构造器被调用....");
    }
}
public class CodeBlockDetail02 {
    public static void main(String[] args) {
        new BB();
    }
}
```

执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210915102045.png" style="zoom:80%;" />

6、创建一个子类对象时【继承关系】，他们的静态代码块，静态属性初始化，普通代码块，普通属性初始化，构造方法的调用顺序如下:

- ①父类的静态代码块和静态属性【优先级一样，按定义顺序执行】。
- ②子类的静态代码块和静态属性【优先级一样，按定义顺序执行】
- ③父类的普通代码块和普通属性初始化【优先级一样，按定义顺序执行】
- ④父类的构造方法。
- ⑤子类的普通代码块和普通属性初始化【优先级-样，按定义顺序执行】
- ⑥子类的构造方法

```java
package cn.codeblock.demo02;

//1.1 父类
class A02 {
    //1.2 静态属性的初始化
    private static int n1 = method01();

    static {
        System.out.println("A02类[父类]静态代码块被调用");//(2)
    }

    {
        System.out.println("A02类[父类]普通代码块被调用");//(5)
    }

    //1.3 普通属性的初始化
    public int n3 = method02();

    // 1.4 静态方法
    public static int method01() {
        System.out.println("method01[父类静态方法被调用]");//(1)
        return 10;
    }
    
    // 1.5 普通方法
    public int method02() {
        System.out.println("method02[父类普通方法被调用]");//(6)
        return 10;
    }

    //1.6 无参构造器
    public A02() {
        //隐藏super()
        //普通代码和普通属性的初始化......
        System.out.println("A02(父类)构造器被调用");//(7)
    }
}

// 子类B02
class B02 extends A02 { 
    // 2.1 定义静态变量
    private static int n3 = method03();

    static {
        System.out.println("B02(子类)的静态代码块..");//(4)
    }

    // 2.2 定义普通变量
    public int n5 = method04();

    {
        System.out.println("B02(子类)的普通代码块..");//(9)
    }

    // 2.3 定义子类的静态方法
    public static int method03() {
        System.out.println("method03[子类静态方法被调用]");//(3)
        return 10;
    }

    // 2.4 定义子类的普通方法
    public int method04() {
        System.out.println("method04[子类普通方法被调用]");//(8)
        return 10;
    }

    //2.5 子类构造器
    public B02() {
        //隐藏了super()
        //普通代码块和普通属性的初始化...
        System.out.println("B02(子类)构造器被调用");//(10)
    }
}

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        //3.1 进行类的加载
        //3.2 先加载 父类 A02，再加载 B02
        //3.3 创建对象
        //3.4 从子类的构造器开始
        new B02();
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210915154902.png)

7、静态代码块只能直接调用静态成员(静态属性和静态方法)，普通代码块可以调用任意成员。

```java
package cn.codeblock.demo02;

class C02 {
    // 1.1 定义普通变量n1
    private int n1 = 100;
    // 1.2 定义静态变量n2
    private static int n2 = 200;
    
    // 1.3 定义普通方法
    private void method01() {

    }
    // 1.3 定义静态方法
    private static void method02() {

    }

    //1.4 静态代码块，只能调用静态成员和静态方法
    static {
        //System.out.println(n1);错误
        System.out.println("静态变量n2:" + n2);//ok
        //method01();//错误
        method02();
    }

    //1.5 普通代码块，可以使用任意成员
    {
        System.out.println("普通变量n1:" + n1);
        System.out.println("静态变量n2:" + n2);//ok
        method01();
        method02();
    }
}

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        new C02();
    }
}
```

执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210915162631.png)

#### 8.4.5 案例分析

1、下面的代码输出什么？

```java
package cn.codeblock.demo03;

class Person {
    //1.1 静态变量
    public static int total;
    //1.2 静态代码块
    static {
        total = 100;
        System.out.println("is static block!");//(1)
    }
}
public class CodeBlockDemo01 {
        public static void main(String[] args) {
        System.out.println("total:"+ Person.total); //100
        System.out.println("total:"+ Person.total); //100
    }
}
```

执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210915163333.png)

2、下面的代码输出什么？

```java
package cn.codeblock.demo03;

// 1.1 Sample类
class Sample
{
    // 代参构造
    Sample(String s)
    {
        System.out.println(s);
    }
    // 无参构造
    Sample()
    {
        System.out.println("Sample默认构造函数被调用");
    }
}
class Test{
    // 2.1 普通变量
    Sample sam1=new Sample("普通成员变量sam1初始化");
    // 2.2 静态成员
    static Sample sam2=new Sample("静态成员sam2初始化 ");
    // 2.3 静态代码块
    static{
        System.out.println("静态代码块被调用");
        if(sam2==null)System.out.println("sam2 is null");
    }
    //2.4 无参构造器
    Test()
    {
        System.out.println("Test默认构造函数被调用");
    }
}

public class CodeBlockDemo02 {
    public static void main(String[] args) {
        {   //无参构造器
            Test a=new Test();
        }
    }
}
```

执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210915171505.png)

### 8.5 final 关键字

#### 8.5.1 基本介绍

`final`中文意思是最后的,最终的。`final`可以修饰类、属性、方法和局部变量。在某些情况下，程序员可能有以下需求，就会使用到`final`。

1、当不希望类被继承时,可以用`final`修饰。

```java
package cn.final_.demo01;

//如果要求A类不能被其他类继承可以使用final修饰A类
final class A{
    
}

/*class B extends A{
    
}*/

public class FinalDemo01 {
    public static void main(String[] args) {

    }
}
```

2、当不希望父类的某个方法被子类覆盖/重写(override)时，可以用final关键字修饰。

```java
package cn.final_.demo01;

class C {
    //如果要求method01不能被子类重写可以使用final修饰 method01方法
    public final void method01() {}
}
/*
class D extends C {
    @Override
    public void method01() {
        System.out.println("重写了C类的method01方法..");
    }
}
*/

public class FinalDemo01 {
    public static void main(String[] args) {

    }
}

```

3、当不希望类的的某个属性的值被修改可以用final修饰。

```java
package cn.final_.demo01;

//当不希望类的的某个属性的值被修改,可以用final修饰
class E {
    public final double TAX_RATE = 0.08;
}

public class FinalDemo01 {
    public static void main(String[] args) {
        E e = new E();
        //e.TAX_RATE = 0.09;
    }
}
```

4、当不希望某个局部变量被修改，可以使用final修饰

```java
package cn.final_.demo01;

//当不希望某个局部变量被修改，可以使用final修饰
class F {
    public void cry() {
        //这时，NUM也称为局部常量
        final double NUM = 0.01;
        // NUM = 0.9;
        System.out.println("NUM=" + NUM);
    }
}
public class FinalDemo01 {
    public static void main(String[] args) {
        F f = new F();
        f.cry();
    }
}
```

#### 8.5.2 final使用细节

1、`final`修饰的属性又叫常量，一般用`XX_XX_XX`来命名。

2、final修饰的属性在定义时,必须赋初值，并且以后不能再修改，赋值可以在如下位置之一 ，【选择一个位置赋初值即可】。

```java
class AA {
    /*
    1. 定义时：如 public final double TAX_RATE=0.1;
    2. 在构造器中
    3. 在代码块中
    */
    
    //1.1 定义时赋值
    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2 ;
    public final double TAX_RATE3 ;

    public AA() {
        //1.2 构造器中赋值
        TAX_RATE2 = 1.1;
    }
    
    {   //1.3在代码块赋值
        TAX_RATE3 = 8.8;
    }
}
```

3、如果`final`修饰的属性是静态的，则初始化的位置只能是①定义时②在静态代码块，不能在构造器中赋值。

```java
class BB {
    // 1.1 定义是赋值
    public static final double TAX_RATE = 9.9;
    public static final double TAX_RATE2 ;

    static {
        // 1.2 在静态代码中赋值
        TAX_RATE2 = 3.3;
    }
}
```

4、`final`类不能继承， 但是可以实例化对象。如果类不是`final`类，但是含有`final`方法，则该方法虽然不能重写，但是可以被继承。

```java
package cn.final_.demo01;

//1.1 final类不能继承，但是可以实例化对象
final class CC {

}
//1.2 如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承即，仍然遵守继承的机制.
class DD {
    public final void cal() {
        System.out.println("cal()方法被调用！！！");	// cal()方法被调用！！！
    }
}
class EE extends DD {

}

public class FinalDemo02 {
    public static void main(String[] args) {
        // 2.1 调用cal方法
        new EE().cal();
    }
}
```

6、一般来说，如果个类已经是`final`类了，就没有必要再将方法修饰成`final`方法。

```java
final class AA{
    //如果一个类已经是final类了，就没有必要再将方法修饰成final方法
    //public final void cry() {}
}
```

7、`final`不能修饰构造方法【即构造器】 ，`final`和`static`往往搭配使用，效率更高，不会导致类加载底层编译器做了优化处理。

```java
package cn.final_.demo01;

//final 和 static 往往搭配使用，效率更高，不会导致类加载.底层编译器做了优化处理
class BB {
    // 1.1 定义静态变量
    public final static int num = 100;
    // 1.2 定义静态代码块
    static {
        System.out.println("BB静态代码块被执行");
    }
}
public class FinalDemo03 {
    public static void main(String[] args) {
        System.out.println("num值:" + BB.num); // num值:100
    }
}
```

8、包装类【`Integer`,`Double`,`Float`, `Boolean`等都是`final`】，`String`也是`final`类。

#### 8.5.3  final 应用实例

1、请编写一个程序，能够计算圆形的面积，要求圆周率为3.14. 赋值的位置3个方式都写一下。

```java
package cn.final_.demo01;

class Circle {
    private double radius;
    private final double PI;
    //构造器
    public Circle(double radius) {
        this.radius = radius;
    }
    {
        PI = 3.14;
    }
    public double calArea() {
        return PI * radius * radius;
    }
}
public class FinalDemo04 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("圆的面积:" + circle.calArea()); // 圆的面积:78.5
    }
}
```

2、判断下面程序是否正确，为什么？

```java
package cn.final_.demo01;

class Something {
    public int addOne(final int x) { // 正确
        //++x;  //错误,原因是不能修改 final x的值
        return x + 1; //这里是可以.
    }
}

public class FinalDemo05 {
    public static void main(String[] args) {

    }
}
```

### 8.6 抽象类

#### 8.6.1 抽象类的引出

当父类的某些方法，需要声明，但是又不确定如何实现时，可以将其声明为抽象方法，那么这个类就是抽象类。

当父类的一些方法不能确定时，可以用`abstract`关键字来修饰该方法，这个方法就是抽象方法，用`abstract`来修饰该类就是抽象类。

```java
package cn.abstract_.demo01;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    
    /**
     * 考虑将该方法设计为抽象(abstract)方法,所谓抽象方法就是没有实现的方法。
     * 所谓没有实现就是指，没有方法体，当一个类中存在抽象方法时，需要将该类声明为abstract类
     * 一般来说，抽象类会被继承，有其子类来实现抽象方法。
     */
    
    /*
    public void eat() {
       System.out.println("这是一个动物，但是不知道吃什么..");
    }
    */
    public abstract void eat()  ;
}

public class Abstract01 {
    public static void main(String[] args) {
        
    }
}
```

#### 8.6.2 抽象类的介绍

1、用`abstract`关键字来修饰一 个类时，这个类就叫抽象类。

```java
访问修饰符 abstract 类名{
    
}
```

2、用`abstract`关键字来修饰一 个方法时,这个方法就是抽象方法

```java
访问修饰符abstract返回类型方法名(参数列表); //没有方法体
```

3、抽象类的价值更多作用是在于设计，是设计者设计好后，让子类继承并实现抽象类`()`。

#### 8.6.3 抽象类使用注意事项

1、抽象类不能被实例化

2、抽象类不一定要包含`abstract`方法。也就是说，抽象类可以没有abstract方法。

```java
package cn.abstract_.demo01;

//1.1 抽象类不一定要包含abstract方法。抽象类可以没有abstract方法,也可以有实现的方法。
abstract class A {
    public void method01() {
        System.out.println("hello Java!!!");
    }
}
public class Abstract02 {
    public static void main(String[] args) {
        //2.1 抽象类，不能被实例化
        //new A();
    }
}
```

3、一旦类包含了`abstract`方法,则这个类必须声明为`abstract` 。

```java
package cn.abstract_.demo01;

//1.1 一旦类包含了abstract方法,则这个类必须声明为abstract
abstract class B {
    public abstract void method02();
}

public class Abstract02 {
    public static void main(String[] args) {
        //2.1 抽象类，不能被实例化
        //new A();
    }
}
```

4、abstract只能修饰类和方法，不能修饰属性和其它的。

```java
//1.1 abstract 只能修饰类和方法，不能修饰属性和其它的
class C {
    // public abstract int n1 = 1;
}

public class Abstract02 {
    public static void main(String[] args) {
        //2.1 抽象类，不能被实例化
        //new A();
    }
}
```

5、抽象类可以有任意成员【抽象类本质还是类】比如:非抽象方法、构造器、静态属性等

```java
package cn.abstract_.demo01;

//1.1 抽象类的本质还是类，所以可以有类的各种成员
abstract class D {
    // 1.2 成员变量
    public int n1 = 10;
    // 1.3 静态变量
    public static  String name = "guardwhy";
    // 1.4 普通方法
    public void method01() {
        System.out.println("hello Spring!!!");
    }
    // 1.5 抽象方法
    public abstract void method02();
    // 1.6 静态方法
    public static void ok() {
        System.out.println("ok");
    }
}

public class Abstract03 {
    public static void main(String[] args) {
        System.out.println("hello java");
    }
}
```

6、抽象方法不能有主体，即不能实现。

```java
// abstract void method03(){}; // 错误！！！
```

7、如果个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非它自己也声明为`abstract`类。

```java
//1.1 如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非它自己也声明为abstract类
abstract class E {
    public abstract void method01();
}
abstract class F extends E {

}
class G extends E {
    @Override
    //1.2 这里相等于G子类实现了父类E的抽象方法，所谓实现方法，就是有方法体
    public void method01() { 

    }
}

public class Abstract03 {
    public static void main(String[] args) {
        System.out.println("hello java");
    }
}
```

8、抽象方法不能使用`private`、`final` 和 `static`来修饰，因为这些关键字都是和重写相违背的。

```java
//1.1 抽象方法不能使用private、final和static来修饰，因为这些关键字都是和重写相违背的
abstract class H {
    //1.2 抽象方法
    public  abstract void method02();
}


public class Abstract03 {
    public static void main(String[] args) {
        System.out.println("hello java");
    }
}
```

#### 8.6.4 案例分析

1、判断下面语句是否能通过，为什么？

```java
package cn.abstract_.demo01;

// 1.1 final不能被继承
// abstract final class A{}

// 1.2 static关键字和方法重写无关
// abstract public static void test02();

// 1.3 private方法不能重写
// abstract private void test03();
public class Abstract04 {
    public static void main(String[] args) {

    }
}
```

2、编写一个`Employee`类, 声明为抽象类，包含如下三个属性: `name`,` id`, `salary`。提供必要的构造器和抽象方法: `work()`。 对于`Manager`类来说，他既是员工，还具有奖金`(bonus)`的属性。请使用继承的思想，设计`CommonEmployee`类和`Manager`类，要求类中提供必要的方法进行属性访问，实现`work()`,提示“经理/普通员工名字工作中`.. `。

Employee.java

```java
package cn.abstract_.demo02;

abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    //将work做成一个抽象方法
    public abstract void work();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
```

Manager.java

```java
package cn.abstract_.demo02;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理 " + getName() + " 工作中...");
    }
}
```

CommonEmployee .java

```java
package cn.abstract_.demo02;

public class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + getName() + "工作中...");
    }
}
```

AbstractExercise01.java

```java
package cn.abstract_.demo02;

public class AbstractExercise01 {
    public static void main(String[] args) {
        //测试
        Manager mg = new Manager("curry", 999, 50000);
        mg.setBonus(8000);
        mg.work();

        CommonEmployee ce = new CommonEmployee("james", 888, 20000);
        ce.work();
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210916171202.png)	

### 8.7 接口

#### 8.7.1 基本介绍

1、接口就是给出一些没有实现的方法,封装到一起，到某个类要使用的时候,在根据具体情况把这些方法写出来。

2、基本语法:

```java
interface 接口名{
    //属性
    //方法(1.抽象方法 2.默认实现方法 3.静态方法)
}
class 类名 implements 接口{
	自己属性;
    自己方法;
    必须实现的接口的抽象方法
}
```

3、小结:

- 接口是更加抽象的抽象的类，抽象类里的方法可以有方法体，接口里的所有方法都没有方法体【jdk7.0】 。
- 接口体现了程序设计的多态和高内聚低偶合的设计思想。
- 【jdk8.0】后接口类可以有静态方法，默认方法，也就是说接口中可以有方法的具体实现

AInterface.java

```java
package cn.Interface_.demo02;

public interface AInterface {
    //1.1 成员属性
    public int n1 = 10;

    //1.2 在接口中，抽象方法，可以省略abstract关键字
    public void hi();

    //1.3 jdk8后，可以有默认实现方法,需要使用default关键字修饰
    default public void ok() {
        System.out.println("ok ...");
    }
    //1.4 在jdk8后, 可以有静态方法
    public static void cry() {
        System.out.println("cry ....");
    }
}
```

InterfaceDemo01.java

```java
package cn.Interface_.demo02;

class A implements AInterface{

    @Override
    public void hi() {
        System.out.println("hello Interface！！！");
    }

    @Override
    public void ok() {
        AInterface.super.ok();
    }
}
public class InterfaceDemo01 {
    public static void main(String[] args) {
        A a = new A(); // hello Interface！！！
        a.hi();
    }
}
```

#### 8.7.2 快速入门

1、需求：创建`UsbInterface`接口，实现开始工作和停止工作方法

UsbInterface.java

```java
package cn.Interface_.demo01;
/*
* 1.1 接口相关方法
*/
public interface UsbInterface {
    public void start();
    public void stop();
}
```

Phone.java

```java
package cn.Interface_.demo01;
/*
* 1.2 Phone类需要实现 UsbInterface接口 规定/声明的方法
*/
public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作.....");
    }
}
```

Camera.java

```java
package cn.Interface_.demo01;
/*
*实现接口,就是把接口方法实现
*/
public class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("相机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作....");
    }
}
```

Computer.java

```java
package cn.Interface_.demo01;
/*
* 编写一个方法, 计算机工作
* UsbInterface usbInterface 形参是接口类型:UsbInterface
* 看到接收 实现了UsbInterface接口的类的对象实例
*/
public class Computer {
    public void work(UsbInterface usbInterface) {
        //通过接口，来调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
```

InterfaceDemo01.java

```java
package cn.Interface_.demo01;

public class InterfaceDemo01 {
    public static void main(String[] args) {


        // 1.1 创建相机对象Camera 实现了 UsbInterface
        Camera camera = new Camera();
        // 1.2 创建手机，对象Phone 实现了 UsbInterface
        Phone phone = new Phone();
        //1.3 创建计算机
        Computer computer = new Computer();
        //1.4 把手机接入到计算机
        computer.work(phone);
        System.out.println("===============");
        //1.5 把相机接入到计算机
        computer.work(camera);
    }
}
```

执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210916183450.png)

#### 8.7.3 接口注意事项

1、接口不能被实例化。

2、接口中所有的方法是`public`方法, 接口中抽象方法，可以不用`abstract`修饰。

3、一个普通类实现接口，就必须将该接口的所有方法都实现，可以使用`alt+enter`来解决。

```java
package cn.Interface_.demo03;

interface IA {
    //1.1 修饰符 public protected 默认 private
    void say();
    void hi();
}

class Cat implements IA{
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
public class InterfaceDetail01 {
    public static void main(String[] args) {
        // new IA();
    }
}
```

4、抽象类去实现接口时，可以不实现接口的抽象方法。

```java
package cn.Interface_.demo03;

interface IA {
    //1.1 修饰符 public protected 默认 private
    void say();
    void hi();
}

abstract class Tiger implements  IA {

}

public class InterfaceDetail01 {
    public static void main(String[] args) {
        // new IA();
    }
}
```

5、一个类同时可以实现多个接口。

6、接口中的属性，只能是`final`的，而且是`public static final`修饰符。比如:int a=1;实际上是public static final int a= 1; (必须初始化)

7、接口中属性的访问形式：`接口名.属性名`

```java
package cn.Interface_.demo03;

interface IB {
    //1.1 接口中的属性,只能是final的，而且是public static final修饰符
    int n1 = 10; //等价 public static final int n1 = 10;
    void hi();
}

interface IC {
    void say();
}

//一个类同时可以实现多个接口
class Pig implements IB,IC {
    @Override
    public void hi() {
    }
    @Override
    public void say() {
    }
}

public class InterfaceDetail02 {
    public static void main(String[] args) {
        //2.1 接口中的属性,是 public static final,说明n1 就是static
        System.out.println("n1的值:" + IB.n1); // n1的值:10
        // 2.2 说明n1 是 final
        //IB.n1 = 30;
    }
}
```

8、接口不能继承其它的类，但是可以继承多个别的接口。

```java
package cn.Interface_.demo03;

interface IB {
    void hi();
}

interface IC {
    void say();
}

// 1.2 接口不能继承其它的类,但是可以继承多个别的接口
interface ID extends IB,IC {
    
}

public class InterfaceDetail02 {
    public static void main(String[] args) {
    }
}
```

9、接口的修饰符 只能是`public`和默认，这点和类的修饰符是一样的。

```java
package cn.Interface_.demo03;

//1.1 接口的修饰符 只能是public和默认，这点和类的修饰符是一样的
interface IE{
    
}

public class InterfaceDetail02 {
    public static void main(String[] args) {
      
    }
}
```

#### 8.7.4 案例分析

阅读下面代码，得出相关代码的变量值？

```java
package cn.Interface_.demo04;

interface A {
    //1.1 等价 public static final int a = 23;
    int a = 23; 
}
class B implements A {
    
}

public class InterfaceExercise01 {
    public static void main(String[] args) {
        // 2.0 创建对象b
        B b = new B();
        // 2.1 对象b访问a:23
        System.out.println("对象b访问a:" + b.a);
        // 2.2 类A访问a:23
        System.out.println("类A访问a:" + A.a);
        // 2.3 类B访问a:23
        System.out.println("类B访问a:" + B.a);
    }
}
```

#### 8.7.5 接口 vs 继承类

1、基本概念

当子类继承了父类，就自动的拥有父类的功能，如果子类需要扩展功能可以通过实现接口的方式扩展。==可以理解实现接口是对 java 单继承机制的一种补充==。

2、代码示例

```java
package cn.Interface_.demo04;

//接口
interface Fishable {
    void swimming();
}
interface Birdable {
    void flying();
}

// 1.3 Monkey类
class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }
    public void climbing() {
        System.out.println(name + "会爬树...");
    }

    public String getName() {
        return name;
    }
}

// 1.4 创建LittleMonkey继承Monkey，实现Fishable，Birdable接口方法
class LittleMonkey extends Monkey implements Fishable,Birdable {

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "通过学习，可以像鱼儿一样游泳...");
    }

    @Override
    public void flying() {
        System.out.println(getName() + "通过学习，可以像鸟儿一样飞翔...");
    }
}

public class InterfaceExercise02 {
    public static void main(String[] args) {
        // 2.1 创建LM对象
        LittleMonkey LM = new LittleMonkey("孙猴子");
        LM.climbing();
        LM.swimming();
        LM.flying();
    }
}
```

执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210916222215.png)

3、小结

继承的价值主要在于：==解决代码的复用性和可维护性==，接口的价值主要在于：==设计好各种规范【方法】，让其它类去实现这些方法，即更加的灵活==。

接口比继承更加灵活，接口比继承更加灵活，继承是满足`is - a`的关系，而接口只需满足`like - a`的关系。

接口在一定程度上实现代码解耦【即:接口规范性+动态绑定机制】

#### 8.7.6 接口的多态特性

1、多态参数

接口引用可以指向实现了接口的类的对象

```java
package cn.Interface_.demo5;

// 1.1 创建IF接口
interface IF {}
// 1.2 创建Monster类实现IF接口
class Monster implements IF{

}
// 1.3 创建Car类实现IF接口
class Car implements IF{

}

// 1.4 创建AAA类
class AAA {

}
// 1.5 创建BBB类继承AAA类
class BBB extends AAA {

}
// 1.5 创建CCC类继承AAA类
class CCC extends AAA {

}

public class InterfaceExercise01 {
    public static void main(String[] args) {
        //2.1 接口的多态体现:接口类型的变量if01,可以指向实现了IF接口类的对象实例
        IF if01 = new Monster();
        if01 = new Car();

        //2.2 继承体现的多态:父类类型的变量a可以指向,继承AAA的子类的对象实例。
        AAA a = new BBB();
        a = new CCC();
    }
}
```

2、多态数组

给`Usb`数组中，存放`Phone`和相机对象，`Phone`类还有一个特有的方法`call()`遍历`Usb`数组，如果是`Phone`对象，除了调用`Usb`接口定义的方法外，还需要调用`Phone`特有方法`call()`。

```java
package cn.Interface_.demo5;
// 1.1 创建Usb接口
interface Usb{
    // 1.2 创建work()方法
    void work();
}
// 2.1 创建Phone类实现Usb接口
class Phone implements Usb {
    public void call() {
        System.out.println("手机可以打电话...");
    }

    @Override
    public void work() {
        System.out.println("手机工作中...");
    }
}
// 2.2 创建 Camera类实现Usb接口
class Camera implements Usb {

    @Override
    public void work() {
        System.out.println("相机工作中...");
    }
}

public class InterfaceExercise02 {
    public static void main(String[] args) {
        // 3.1 创建usbs对象，多态数组 -> 接口类型数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone();
        usbs[1] = new Camera();
        /*
        3.2 给Usb数组中，存放Phone和相机对象，Phone类还有一个特有的方法call()，
        请遍历Usb数组，如果是Phone对象，除了调用Usb 接口定义的方法外，还需要调用Phone 特有方法 call
         */
        for(int i = 0; i < usbs.length; i++) {
            //3.3 动态绑定
            usbs[i].work();
            //3.4 需要进行类型的向下转型,判断他的运行类型是Phone
            if(usbs[i] instanceof Phone) {
                ((Phone) usbs[i]).call();
            }
        }
    }
}
```

3、接口多态传递

```java
package cn.Interface_.demo5;

// 1.1 创建IH接口
interface IH {
    void hi();
}
// 1.2 创建IG接口继承IH接口
interface IG extends IH{

}
// 1.3 创建Teacher对象实现IG接口
class Teacher implements IG {
    @Override
    public void hi() {
        
    }
}

public class InterfaceExercise03 {
    public static void main(String[] args) {
            //2.1 接口类型的变量可以指向，实现了该接口的类的对象实例
            IG ig = new Teacher();
            /*
            * 2.2 
            * 如果IG继承了IH接口，而Teacher类实现了IG接口
            * 那么，实际上就相当于Teacher类也实现了IH接口.这就是所谓的 接口多态传递现象。
            */
            IH ih = new Teacher();
    }
}
```

#### 8.7.7 案例分析

判断下面源码，如果有错误就改正，看其输出结果。

```java
package cn.Interface_.demo5;

// 1.1 创建接口A
interface A {
    // 1.2等价public static final int x = 0;
    int x = 0;
}
// 2.1 创建类B
class B {
    //2.2 普通属性
    int x = 1;
}

// 3.1 创建类C继承类B实现A接口
class C extends B implements A {
    public void method01() {
        /**
         *
         * 可以明确的指定x,访问接口的 x 就使用 A.x
         * 访问父类的 x 就使用 super.x
         */
        // System.out.println(x); //错误，原因不明确x
        System.out.println("接口A中x的值:" + A.x + " " + "类B中x的值:" + super.x);
    }
}

public class InterfaceExercise04 {
    public static void main(String[] args) {
        new C().method01(); // 接口A中x的值:0 类B中x的值:1
    }
}
```

### 8.8 内部类

#### 8.8.1基本介绍

1、基本介绍

一个类的内部又完整的嵌套了另 一个类结构，被嵌套的类称为内部类`(inner class)`，嵌套其他类的类称为外部类`(outer class)`。 ==内部类最大的特点就是可以直接访问私有属性，并且可以体现类与类之间的包含关系==。

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210917212223.png)

2、内部类的分类

- 定义在外部类局部位置上(比如方法内) : 
  - 局部内部类【有类名】
  - 匿名内部类【没有类名】

- 定义在外部类的成员位置上:
  - 成员内部类【没用static修饰】
  - 静态内部类【使用static修饰】

#### 8.8.2 基本语法

```java
// 外部类
class Outer{
    // 内部类
    class Inner{
        
    }
}
// 外部其他类
class Other{
    
}
```

#### 8.8.3 入门案例

```java
package cn.innerclass.demo01;

//1.1 外部类
class Outer {
    //1.2 属性
    private int n1 = 100;
    //1.3 构造器
    public Outer(int n1) {
        this.n1 = n1;
    }
    //1.4 方法
    public void method01() {
        System.out.println("method01()被调用！！");
    }
    //1.5 普通代码块
    {
        System.out.println("代码块...");
    }
    //1.6 内部类, 在Outer类的内部
    class Inner { 

    }
}

public class InnerClassDemo01 {//外部其他类
    public static void main(String[] args) {

    }
}
```

#### 8.8.4 局部内部类使用

局部内部类是定义在外部类的局部位置，比如方法中，并且有类名。

1、可以直接访问外部类的所有成员，包含私有的

2、不能添加访问修饰符，因为它的地位就是一个局部变量，局部变量是不能使用修饰符的。但是可以使用`final`修饰，因为局部变量也可以使用`final`。

```java
package cn.innerclass.demo01;

//1.1 外部类
class Outer02 {
    // 1.1 创建成员变量
    private int n1 = 100;
    // 1.3 私有方法
    private void method02() {
    }
    //1.4 方法
    public void method01() {
        /*
        * 1.5 局部内部类是定义在外部类的局部位置通常在方法，
        * 不能添加访问修饰符,但是可以使用final修饰
        */
        final class Inner02 {
            //2.局部内部类(本质仍然是一个类)，可以直接访问外部类的所有成员，包含私有的
            public void f1() {
                System.out.println("n1的值:" + n1);
                method02();
            }
        }
        /*
        class Inner03 extends Inner02{

        }
        */
    }
}
public class InnerClassDemo02 {
    public static void main(String[] args) {
        
    }
}
```

3、作用域：仅仅在定义它的方法或代码块中。

```java
package cn.innerclass.demo01;

//1.1 外部类
class Outer02 {
    //1.2方法
    public void method01() {
        //1.3 作用域 : 仅仅在定义它的方法或代码块中
        String name = "curry";
        final class Inner02 {

        }
    }

    // 1.4 代码块
    {
        class Inner03{
            
        }
    }
}
public class InnerClassDemo02 {
    public static void main(String[] args) {
        
    }
}
```

 4、局部内部类可以直接访问外部类的成员属性和方法

```java
package cn.innerclass.demo01;

//1.1 外部类
class Outer02 {
    // 1.1 创建成员变量
    private int n1 = 100;
    // 1.3 私有方法
    private void method02() {
    }
    //1.4 方法
    public void method01() {
        final class Inner02 {
            public void f1() {
                // 1.5 局部内部类可以直接访问外部类的成员和方法
                System.out.println("n1的值:" + n1);
                method02();
            }
        }
    }
}
public class InnerClassDemo02 {
    public static void main(String[] args) {

    }
}

```

5、外部类-->访问---->局部内部类的成员，==访问方式:创建对象，再访问【注意:必须在作用域内】==

```java
package cn.innerclass.demo01;

//1.1 外部类
class Outer02 {
    // 1.1 创建成员变量
    private int n1 = 100;
    // 1.3 私有方法
    private void method02() {
    }
    //1.4 方法
    public void method01() {
        // 1.5 内部类Inner02
        final class Inner02 {
            public void f1() {
                System.out.println("n1的值:" + n1);
                method02();
            }
        }
        //1.6 外部类在方法中，可以创建Inner02对象，然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}
public class InnerClassDemo02 {
    public static void main(String[] args) {
        // 2.1 创建ot对象
        Outer02 ot = new Outer02();
        // 2.2 对象调用方法
        ot.method01();  // n1的值:100
    }
}
```

6、外部其他类---不能访向---->局部内部类【因为局部内部类地位是一个局部变量】

7、如果外部类和局部内部类的成员重名时，==默认遵循就近原则，如果想访问外部类的成员，则可以使用【外部类名.this.成员】去访问==。

```java
package cn.innerclass.demo01;

//1.1 外部类
class Outer02 {
    // 1.1 创建成员变量
    private int n1 = 100;
    // 1.3 私有方法
    private void method02() {
    }
    //1.4 方法
    public void method01() {
        // 1.5 内部类Inner02
        final class Inner02 {
            // 1.6 创建局部变量
            private int n1 = 65;
            public void f1() {
                /*
                * 1.7如果外部类和局部内部类的成员重名时，默认遵循就近原则。
                * 如果想访问外部类的成员，使用(外部类名.this.成员)去访问。
                * Outer02.this 本质就是外部类的对象, 即哪个对象调用了method02(), Outer02.this就是哪个对象
                */
                System.out.println("Inner02中n1的值:" + n1 + ",Outer02类中的n1:" +Outer02.this.n1);
                System.out.println("Outer02.this的hashcode:" + Outer02.this);
                method02();
            }
        }
        //1.8 外部类在方法中，可以创建Inner02对象，然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}
public class InnerClassDemo02 {
    public static void main(String[] args) {
        // 2.1 创建ot对象
        Outer02 ot = new Outer02();
        // 2.2 对象调用方法
        ot.method01();  // n1的值:100
        System.out.println("Outer02的hashcode:" + ot);
    }
}
```

执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/docker/images01/20210918090017.png)

8、小结

局部内部类定义在方法中/代码块，作用域在方法体或者代码块中，本质仍然是一个类。

#### 8.8.5 匿名内部类使用

1、匿名内部类的基本特点

- 匿名内部类本质是类，匿名内部类没有名字。匿名内部类同时还是一个对象。
- 匿名内部类是定义在外部类的局部位置，比如方法中，并且没有类名。

2、匿名内部类基本语法

```java
 new 类或者接口(参数列表){
     类体
 };
```

3、匿名内部类实现【接口】

```java
package cn.innerclass.demo02;

// 1.1 创建Person接口
interface Person {
    // 1.2 创建study()方法
    public void study();
}

/*
    class Student implements Person {

        @Override
        public void study() {
            System.out.println("学生在认真的写作业！！！");
        }
    }
    class Teacher implements  Person{
        @Override
        public void study() {
            System.out.println("老师在认真的备课！！！");
        }
    }
*/

// 2.1 外部类
class Outer01 {
    //2.2 成员属性
    private int n1 = 10;
    // 2.3方法
    public void method() {

    /*
    *2.4
    * 基于接口的匿名内部类需求:想使用Person接口,并创建对象,传统方式，是写一个类，实现该接口，并创建对象
    * 需求是 Student/Teacher 类只是使用一次，后面再不使用,可以使用匿名内部类来简化开发。
    */

    /*
    * 2.5 底层分析
    * student的编译类型 ? Person
    * student的运行类型 ? 就是匿名内部类Outer01$1
    * jdk底层在创建匿名内部类Outer01$1,立即马上就创建了Outer01$1实例，并且把地址返回给 student
    */

    /*
    通过看底层会分配类名Outer04$1
    class Outer04$1 implements Person {
        @Override
        public void study() {
            System.out.println("学生在认真的写作业！！！");
        }
    }
   */

    //2.6 匿名内部类使用一次，就不能再使用
    Person student = new Person() {
        @Override
        public void study() {
            System.out.println("学生在认真的写作业！！！");
        }
    };
    System.out.println("student运行类型:" +student.getClass()); // student运行类型:class cn.innerclass.demo02.Outer01$1
        student.study();
    }
}

public class AnonymousInnerClassDemo01 {
    public static void main(String[] args) {
        // 3.1 创建outer对象
        Outer01 outer = new Outer01();
        // 3.2 对象调用方法
        outer.method(); // 学生在认真的写作业！！！
    }
}
```

4、匿名内部类实现【基于普通类】

```java
package cn.innerclass.demo03;

//1.1 创建Person类
class Person {
    //1.2 创建构造器
    public Person(String name) {
        System.out.println("接收到name:" + name);
    }
    //1.3 创建成员方法
    public void method01() {
        
    }
}

//2.1 外部类
class Outer01 {
    //2.2 成员属性
    private int n1 = 10;
    //2.3 成员方法
    public void method() {
        /*
        * 2.4 思路分析
        * Person编译类型 Person
        * Person运行类型 Outer01$1
        * 底层会创建匿名内部类，同时也直接返回了匿名内部类Outer01$1对象。
        * 将("guardwhy") 参数列表会传递给 构造器
        */
        
        /*
            class Outer01$1 extends Person{
                @Override
                public void method01() {
                    System.out.println("匿名内部类重写了method01方法");
                }
            }
         */
        Person person = new Person("guardwhy"){
            @Override
            public void method01() {
                System.out.println("匿名内部类重写了method01方法");
            }
        };
        System.out.println("Person对象运行类型:" + person.getClass());//Outer01$1
        person.method01();
    }
}

public class AnonymousInnerClassDemo02 {
    public static void main(String[] args) {
        // 3.1 创建ot对象
        Outer01 ot = new Outer01();
        // 3.2 对象调用方法
        ot.method();
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210918131421.png)

5、匿名内部类实现【基于抽象类】

```java
package cn.innerclass.demo04;

//1.1 创建抽象类
abstract class Animal {
    // 1.2 创建抽象eat()方法
    abstract void eat();
}
//2.1 外部类
class Outer01 {
    // 2.2 创建成员方法
    public void method() {
        //2.3 基于抽象类的匿名内部类
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头...");
            }
        };
        animal.eat();
    }
}
public class AnonymousInnerClassDemo01 {
    public static void main(String[] args) {
        // 3.1 创建outer对象
        Outer01 outer = new Outer01();
        // 3.2 对象调用方法
        outer.method(); // 小狗吃骨头...
    }
}
```

#### 8.8.6 匿名内部类注意事项

1、匿名内部类的语法比较奇特，因为匿名内部类既是一个类的定义，同时它本身也是一个对象，因此从语法上看，它既有定义类的特征，也有创建对象的特征，这个特点因此可以调用匿名内部类方法。

```java
package cn.innerclass.demo04;

//1.1 Person类
class Person {
    // 1.2成员方法
    public void hi() {
        System.out.println("Person hi()");
    }
    public void ok(String str) {
        System.out.println("ok成员方法传入参数:" + str);
    }
}
class Outer02 {
    private int n1 = 99;
    public void f1() {
        Person p = new Person(){
            private int n1 = 88;
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法");
            }
        };
        //2.1 动态绑定, 运行类型是 Outer02$1
        p.hi();

        //2.2 也可以直接调用, 匿名内部类本身也是返回对象  class 匿名内部类 extends Person {}
        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法,哈哈...");
            }
            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("guardwhy");
    }
}
public class AnonymousInnerClassDemo02 {
    public static void main(String[] args) {
        // 2.1 创建outer对象
        Outer02 outer = new Outer02();
        outer.f1();
    }
}
```

执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210918145042.png)

3、可以直接访问外部类的所有成员，包含私有的。不能添加访问修饰符，因为它的地位就是一个局部变量。

4、作用域 :仅仅在定义它的方法或代码块中，匿名内部类--访问--->外部类成员方式:【直接访可】

```java
package cn.innerclass.demo04;

//1.1 Person类
class Person {
    // 1.2成员方法
    public void hi() {
        System.out.println("Person hi()");
    }
}
class Outer02 {
    // 2.0 成员属性
    private int n1 = 88;
    public void f1() {
        //2.1 不能添加访问修饰符,因为它的地位就是一个局部变量
        Person p = new Person(){
            //2.2 作用域 : 仅仅在定义它的方法或代码块中
            @Override
            public void hi() {
                System.out.println("n1的值:" + n1);   // n1的值:88
            }
        };
        //2.3 动态绑定, 运行类型是 Outer02$1
        p.hi();
    }
}
public class AnonymousInnerClassDemo02 {
    public static void main(String[] args) {
        // 3.1 创建outer对象
        Outer02 outer = new Outer02();
        outer.f1();
    }
}
```

7、外部其他类---不能访----匿名内部类【因为匿名内部类地位是一个局部变量】

8、如果外部类和匿名内部类的成员重名时，匿名内部类访问的话，默认遵循就近原则，如果想访问外部类的成员，则可以使用【外部类名.this.成员)】去访问。

```java
package cn.innerclass.demo04;

//1.1 Person类
class Person {
    // 1.2成员方法
    public void hi() {}
}
// 2.1 创建Outer02类
class Outer02 {
    // 2.2 成员变量
    private int n1 = 88;
    // 2.3 成员方法
    public void f1() {
        new Person(){
            //2.4 成员变量
            private int n1 = 23;
            @Override
            public void hi() {
                /*
                 * 可以直接访问外部类的所有成员，包含私有的。如果外部类和匿名内部类的成员重名时，匿名内部类访问的话。
                 * 默认遵循就近原则，如果想访问外部类的成员，则可以使用(外部类名.this.成员)去访问
                 */
                System.out.println("内部类n1的值:" + n1 + ", 外部类n1的值:" +Outer02.this.n1);   // n1的值:88
                //Outer02.this 就是调用f1的对象
                System.out.println("Outer02.this hashcode=" + Outer02.this);
            }
        }.hi();
    }
}
public class AnonymousInnerClassDemo02 {
    public static void main(String[] args) {
        // 3.1 创建outer对象
        Outer02 outer = new Outer02();
        outer.f1();
        //外部其他类---不能访问----->匿名内部类
        System.out.println("main outer02 hashcode=" + outer);
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210918153414.png)

#### 8.8.7 匿名内部类实践

1、案例一

将匿名内部类当做实参直接传递

```java
package cn.innerclass.demo05;

// 1.1 创建接口
interface T{
    void show();
}
// 2.1 创建picture类实现T接口方法
class Picture implements T{

    @Override
    public void show() {
        System.out.println("这是一幅漂亮的画[传统方式方式]！！！");
    }
}

public class InnerClassExercise01 {
    // 3.1 创建静态方法method01()
    public static void method01(T t) {
        t.show();
    }
    public static void main(String[] args) {
        // 3.2 传统方式实现调用
        method01(new Picture());

        // 3.2 匿名内部类实现
        method01(new T() {
            @Override
            public void show() {
                System.out.println("这是一幅漂亮的画[匿名内部类方式]！！！");
            }
        });
    }
}
```

执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210918191727.png)

2、案例二

- 有一个铃声接口`Bell`，里面有个 `ring()` 方法。
- 有一个手机类 `Cellphone`，具有闹钟功能 `alarmClock`，参数是 Bell 类型。
- 测试手机类的闹钟功能，通过匿名内部类【对象】作为参数，打印：懒猪起床了。
- 再传入另一个匿名内部类【对象】，打印：小伙伴上课了......

```java
package cn.innerclass.demo05;

//1.1 创建接口
interface Bell{
    //1.2 创建接口方法
    void ring();
}

// 2.1 创建类CellPhone
class CellPhone{
    //2.2 形参是Bell接口类型
    public void alarmClock(Bell bell){
        // 2.3 动态绑定
        bell.ring();
    }
}
public class InnerClassExercise02 {
    public static void main(String[] args) {
        // 3.1 创建cellPhone对象
        CellPhone cellPhone = new CellPhone();
        /*
        1.传递的是实现了 Bell接口的匿名内部类 InnerClassExercise02$1
        2. 重写了ring()方法
        Bell bell = new Bell() {
                @Override
                public void ring() {
                    System.out.println("懒猪起床了");
                }
            }
        */
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了！！！");
            }
        });

        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙子，要上班了！！！");
            }
        });
    }
}
```

#### 8.8.8 成员内部类使用

1、具体概念

成员内部类是定义在外部类的成员位置，并且没有static修饰。

2、注意事项

2.1、可以直接访问外部类的所有成员，包含私有的。

2.2、可以添加任意访问修饰符【`public`、`protected`、 默认、`private`】，因为它的地位就是一个成员。

```java
ackage cn.innerclass.demo05;

//1.1 外部类
class Outer {
    // 1.2 成员属性
    private int n1 = 10;
    public String name = "guardwhy";

    //1.4 成员内部类，是定义在外部内的成员位置上
    public class Inner {
        public void say() {
            //1.5 可以直接访问外部类的所有成员，包含私有的
            System.out.println("n1的值:" + n1 + ", name的值: " + name); // n1的值:10, name的值: guardwhy
        }
    }

    //写方法
    public void method01() {
        //使用成员内部类
        //创建成员内部类的对象，然后使用相关的方法
        Inner inner = new Inner();
        inner.say();
    }
}

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method01();
    }
}
```

2.3、作用域和外部类的其他成员一样，为整个类体比如前面案例，在外部类的成员方法中创建成员内部类对象，再调用方法。

2.4、成员内部类--访问---> 外部类成员(比如：属性) 【访问方式：直接访问】 

2.5、外部类---访问---->成员内部类(说明)【访问方式：创建对象， 再访问】

```java
package cn.innerclass.demo05;

//1.1 外部类
class Outer {
    // 1.2 外部成员方法
    private void hi(){
        System.out.println("hi()方法被调用！！！");
    }

    //1.3 可以添加任意访问修饰符(public、protected 、默认、private),因为它的地位就是一个成员
    public class Inner {
        // 1.4 成员内部类属性值
        public double n2 = 23.78;
        public void say() {
            //1.5 可以直接访问外部类的所有成员和方法
            hi();
        }
    }
    //1.6 成员内部类方法
    public void method01() {
        //1.7 使用成员内部类创建成员内部类的对象，然后使用相关的方法。
        Inner inner = new Inner();
        inner.say();
        System.out.println("成员内部类变量的值:" + inner.n2);
    }
}

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method01();
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210918210453.png)

2.6、外部其他类---访问----成员内部类

```java
package cn.innerclass.demo05;

//1.1 外部类
class Outer {
    // 1.2 外部成员方法
    private void hi(){
        System.out.println("hi()方法被调用！！！");
    }

    //1.3 可以添加任意访问修饰符(public、protected 、默认、private),因为它的地位就是一个成员
    public class Inner {
        // 1.4 成员内部类属性值
        public double n2 = 23.78;
        public void say() {
            //1.5 可以直接访问外部类的所有成员和方法
            hi();
        }
    }

    //1.6 方法，返回一个Inner实例
    public Inner getInnerInstance(){
        return new Inner();
    }

    //1.7 成员内部类方法
    public void method01() {
        //1.8 使用成员内部类创建成员内部类的对象，然后使用相关的方法。
        Inner inner = new Inner();
        inner.say();
        System.out.println("成员内部类变量的值:" + inner.n2);
    }
}

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        // outer.method01();

        //外部其他类，使用成员内部类的方式
        // 第一种方式:outer.new Inner(); 相当于把 new Inner()当做是outer成员
        Outer.Inner inner = outer.new Inner();
        inner.say();

        // 方式二: 在外部类中，编写一个方法，可以返回 Inner对象
        Outer.Inner innerInstance = outer.getInnerInstance();
        innerInstance.say();
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210918214947.png)

2.7、如果外部类和内部类的成员重名时，内部类访问的话，默认遵循就近原则，如果想访问外部类的成员，则可以使用【`外部类名.this.成员`】去访问

```java
package cn.innerclass.demo05;

//1.1 外部类
class Outer {
    // 1.2 成员属性
    private int n1 = 10;
    public String name = "guardwhy";

    //1.4 成员内部类，是定义在外部内的成员位置上
    public class Inner {
        // 1.5 成员内部类变量
        private int n1 = 12;
        public void say() {
            //1.6 可以直接访问外部类的所有成员，包含私有的
            System.out.println("成员内部类n1的值:" + n1 + ", name的值:" + name + ", 外部类的n1:" + Outer.this.n1);
        }
    }

    //写方法
    public void method01() {
        //使用成员内部类
        //创建成员内部类的对象，然后使用相关的方法
        Inner inner = new Inner();
        inner.say();
    }
}

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method01(); // 成员内部类n1的值:12, name的值:guardwhy, 外部类的n1:10
    }
}
```

#### 8.8.9 静态内部类使用

1、基本概念

静态内部类是定义在外部类的成员位置，并且有`static`修饰。

2、注意事项

可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员。

可以添加任意访问修饰符【public、 protected、 默认、private】，因为它的地位就是一个成员。

作用域:同其他的成员，为整个类体。

```java
package cn.innerclass.demo06;

//1.1 外部类
class Outer { 
    // 1.2 成员变量
    private int n1 = 10;
    // 1.3 静态变量
    private static String name = "guardwhy";
    //1.4 Inner就是静态内部类
    public static class Inner{
        /*
        * 放在外部类的成员位置,使用static修饰
        * 可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员.
        * 可以添加任意访问修饰符(public、protected 、默认、private),因为它的地位就是一个成员。
        * 作用域 ：同其他的成员，为整个类体
        */
        public void say() {
            System.out.println("外部类的name:" + name);
        }
    }

    //1.5 外部类---访问------>静态内部类 访问方式：创建对象，再访问
    public void method01() {
        Inner inner= new Inner();
        inner.say();
    }
}

public class StaticInnerClass01 {
    public static void main(String[] args) {
        // 2.1 创建outer对象
        Outer outer = new Outer();
        // 2.3 对象调用方法
        outer.method01();   // 外部类的name:guardwhy
    }
}
```

静态内部类---访问---->外部类(比如:静态属性) 【访问方式:直接访问所有静态成员】

外部类---访问----->静态内部类访问方式:创建对象，再访问

外部其他类---访问---->静态内部类。

```java
package cn.innerclass.demo06;

//1.1 外部类
class Outer {
    // 1.2 静态变量
    private static String name = "guardwhy";
    private static void cry() {}
    //1.3 Inner就是静态内部类
    public static class Inner{
        public void say() {
            System.out.println("外部类的name:" + name);
            cry();
        }
    }

    //1.5 外部类---访问------>静态内部类 访问方式：创建对象，再访问
    public Inner getInner01(){
        return new Inner();
    }
    public static Inner getInner02() {
        return new Inner();
    }
}

public class StaticInnerClass01 {
    public static void main(String[] args) {
        // 2.1 创建outer对象
        Outer outer = new Outer();

        // 2.2方式1 因为静态内部类，是可以通过类名直接访问(前提是满足访问权限)
        Outer.Inner inner01 = new Outer.Inner();
        inner01.say();

        //2.3 方式2 写一个方法，可以返回静态内部类的对象实例.
        Outer.Inner inner02 = outer.getInner01();
        inner02.say();

        Outer.Inner inner03 = Outer.getInner02();
        inner03.say();
    }
}
```

如果外部类和静态内部类的成员重名时，静态内部类访问的时，默认遵循就近原则，如果想访问外部类的成员，则可以使用【外部类名.成员】 去访问。

```java
package cn.innerclass.demo06;

//1.1 外部类
class Outer {
    // 1.3 静态变量
    private static String name = "guardwhy";
    //1.4 Inner就是静态内部类
    public static class Inner{
        private static String name = "curry";
        /*
         * 如果外部类和静态内部类的成员重名时，静态内部类访问的时，
         * 默认遵循就近原则，如果想访问外部类的成员，则可以使用 （外部类名.成员）
         */
        public void say() {
            System.out.println("外部类的name:" + name + ", 静态内部类name:" + Outer.name);
        }
    }

    //1.5 外部类---访问------>静态内部类 访问方式：创建对象，再访问
    public void method01() {
        Inner inner= new Inner();
        inner.say();
    }
}

public class StaticInnerClass01 {
    public static void main(String[] args) {
        // 2.1 创建outer对象
        Outer outer = new Outer();
        // 2.3 对象调用方法
        outer.method01(); // 外部类的name:curry, 静态内部类name:guardwhy
    }
}
```

#### 8.8.10 案例分析

阅读下面代码，输出最终数据值?

```java
package cn.innerclass.demo07;

//1.1 外部类Test
class Test {
    //1.2 构造器
    public Test() {
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println("s2指向a的值:" + s2.a);
    }
    //1.3 内部类，成员内部类
    class Inner {
        public int a = 5;
    }
}

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Test t = new Test();
        Test.Inner r = t.new Inner();//5
        System.out.println("r指向a的值:" + r.a);//5
    }
}
```

执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210919144217.png)

## 第9章 枚举和注解

### 9.1 枚举的引出

1、创建季节(Season) 对象，通过传统方法完成代码设计。

```java
package cn.enum_.demo01;

//1.1 创建Season类
class Season{
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
public class Enumeration01 {
    public static void main(String[] args) {
        // 2.1 创建季节相关对象
        Season spring = new Season("春天", "温暖");
        Season winter = new Season("冬天", "寒冷");
        Season summer = new Season("夏天", "炎热");
        Season autumn = new Season("秋天", "凉爽");
        // 2.2 输出相关结果
        System.out.println("春天:" + spring); // 春天:Season{name='春天', desc='温暖'}
    }
}

```

注意事项：因为对于季节而已，它的对象(具体值)，是固定的四个，不会有更多，这个设计类的思路，不能体现季节是固定的四个对象。因此，这样的设计不好。==由于对象是固定的，从而引出枚举==。

### 9.2 枚举实现方式

#### 9.2.1 基本概念

- 枚举对应英文(enumeration, 简写 ==enum==)
- 可以这里理解：枚举属于一种特殊的类，里面只包含一组有限的特定的对象。
- 枚举是一组常量的集合。

#### 9.2.2 自定义类实现枚举

1、注意事项

- 不需要提供`setXxx`方法，因为枚举对象值通常为只读。
- 对枚举对象/属性使用`final + static` 共同修饰，实现底层优化。
- 枚举对象名通常使用全部大写，常量的命名规范。
- 枚举对象根据需要，也可以有多个属性。

2、代码示例

```java
package cn.enum_.demo02;

//1.1 创建Season类
class Season {
    private String name;
    private String desc;

    //1.2 定义了四个固定对象
    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season WINTER = new Season("冬天", "寒冷");
    public static final Season AUTUMN = new Season("秋天", "凉爽");
    public static final Season SUMMER = new Season("夏天", "炎热");

    /*
    * 1.3
    * 将构造器私有化,目的防止 直接 new。
    * 去掉setXxx方法, 防止属性被修改。
    * 在Season 内部，直接创建固定的对象。
    * 优化，可以加入 final 修饰符。
    */
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println("AUTUMN：" + Season.AUTUMN);
        System.out.println("SPRING：" + Season.SPRING);
    }
}
```

3、自定义类实现枚举小结

- 构造器私有化。
- 本类内部创建一组对象【四个春夏秋冬】
- 对外暴露对象【通过为对象添加 `public` `final` `static` 修饰符】。
- 可以提供 get 方法，但是不要提供 set方法。

#### 9.2.3 enum 关键字实现枚举

1、使用`enum`来实现前面的枚举案例。

```java
package cn.enum_.demo02;

//1.1 使用enum关键字来实现枚举类
enum  Season {
    /*
    * 1.2 使用关键字 enum 替代 class
    * 1.3 public static final Season SPRING = new Season("春天", "温暖");
    * 直接使用SPRING("春天", "温暖") 解读 常量名(实参列表)
    * 1.4 如果有多个常量(对象)使用,号间隔即可。如果使用enum 来实现枚举，要求将定义常量对象，写在前面。
    * 1.5 如果使用的是无参构造器，创建常量对象，则可以省略()
    */
    SPRING("春天", "温暖"), WINTER("冬天", "寒冷"),
    AUTUMN("秋天", "凉爽"), SUMMER("夏天", "炎热");

    // 1.6 成员name
    private String name;
    // 1.7 成员属性描述
    private String desc;

    //1.8 无参构造器
    private Season() {

    }

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println("AUTUMN：" + Season.AUTUMN);
        System.out.println("SPRING：" + Season.SPRING);
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210920091333.png)	

#### 9.2.4 enum实现枚举注意事项

1、当使用`enum`关键字开发一个枚举类时，默认会继承`Enum`类, 而且是一个`final` 类。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210920095235.png)

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210920092328.png" style="zoom:80%;" />

 2、传统的 `public static final Season2 SPRING = new Season2("春天", "温暖"); `简化成` SPRING("春天", "温暖");`， 这里必
须知道，它调用的是哪个构造器。

3、如果使用无参构造器 创建 枚举对象，则实参列表和小括号都可以省略。

4、当有多个枚举对象时，使用,间隔，最后有一个分号结尾，枚举对象必须放在枚举类的行首。

#### 9.2.5 案例分析

1、下面代码是否正确, 并说明表示的含义?

```java
enum Gender{ 
    BOY, GIRL; //这里其实就是调用Gender类的无参构造器
    private Gender(String name){}
    private Gender(){}
}
```

上面代码语法是正确的，有一个枚举类`Gender`， 没有属性。有两个枚举对象`BOY, GIRL`, 使用的无参构造器创建。

2、查看下面源码，判断源码输出什么？

```java
package cn.enum_.demo02;
// 1.1 枚举类Gender
enum Gender{
    BOY , GIRL;
}
public class EnumExercise01 {
    public static void main(String[] args) {
        Gender boy1 = Gender.BOY;//OK
        Gender boy2 = Gender.BOY;//OK
        System.out.println(boy1);//输出BOY
        /*
        * 本质就是调用 Gender 的父类Enum的 toString()
        * public String toString() {
        *       return name;
        *   }
        */
        System.out.println(boy2 == boy1);  //True
    }
}
```

### 9.3 enum 常用方法

1、`name`：返回当前对象名（常量名），子类中不能重写。

```java
package cn.enum_.demo02;

public class EnumMethodDemo01 {
    public static void main(String[] args) {
        //输出枚举对象的名字
        Season autumn = Season.AUTUMN;
        System.out.println("name:" + autumn.name()); // name:AUTUMN
    }
}
```

2、`ordinal`：返回当前对象的位置号，默认从 0 开始

```java
package cn.enum_.demo02;

public class EnumMethodDemo01 {
    public static void main(String[] args) {
        //1.1 创建autumn对象
        Season autumn = Season.AUTUMN;
        //1.2 ordinal() 输出的是该枚举对象的次序/编号，从0开始编号AUTUMN 枚举对象是第三个，因此输出 2
        System.out.println("该枚举对象的次序:" + autumn.ordinal()); // 该枚举对象的次序:2
    }
}
```

4、`values`：返回当前枚举类中所有的常量。

```java
package cn.enum_.demo02;

public class EnumMethodDemo01 {
    public static void main(String[] args) {
        //1.1 创建autumn对象
        Season autumn = Season.AUTUMN;
        //1.2 从反编译可以看出 values方法，返回Season含有定义的所有枚举对象
        Season[] values = Season.values();
        System.out.println("===遍历取出枚举对象(增强for)====");
        //1.3 增强for循环
        for (Season season: values) {
            System.out.println(season);
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210920145444.png" style="zoom:80%;" />	

6、compareTo：比较两个枚举常量，比较的就是编号！

```java
package cn.enum_.demo02;

public class EnumMethodDemo01 {
    public static void main(String[] args) {
        //1.1 创建autumn对象
        Season autumn = Season.AUTUMN;
        //1.2 compareTo：比较两个枚举常量，比较的就是编号
        /*
         源码分析: 就是把Season.AUTUMN枚举对象的编号和Season.SUMMER枚举对象的编号比较
            public final int compareTo(E o) {
                Enum<?> other = (Enum<?>)o;
                Enum<E> self = this;
                if (self.getClass() != other.getClass() && // optimization
                        self.getDeclaringClass() != other.getDeclaringClass())
                    throw new ClassCastException();
                return self.ordinal - other.ordinal;
            }
        */
        System.out.println("两者对比:" + Season.AUTUMN.compareTo(Season.SUMMER)); // 两者对比:-1
    }
}
```

### 9.4 经典案例

#### 9.4.1 案例一

声明`Week`枚举类，其中包含星期一至星期日的定义，`MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,SATURDAY, SUNDAY;`使用 `values` 返回所有的枚举数组, 并遍历。

```java
package cn.enum_.demo03;

//1.1 定义Week的枚举对象
enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
    THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"),
    SUNDAY("星期日");
    private String name;
    
    //1.2 构造器
    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class EnumExercise01 {
    public static void main(String[] args) {
        //获取到所有的枚举对象， 即数组
        Week[] weeks = Week.values();
        //遍历，使用增强for
        System.out.println("===所有星期的信息如下===");
        for (Week week : weeks) {
            System.out.println(week);
        }
    }
}
```

####  9.4.2 案例二

创建一个`Color`枚举类，有【 `RED,BLUE,BLACK,YELLOW,GREEN`】这个五个枚举值/对象，`Color`有三个属性【`redValue，greenValue，blueValue`】，创建构造方法，参数包括这三个属性，每个枚举值都要给这三个属性赋值，三个属性对应的值分别是【`red:255,0,0 blue:0,0,255 black:0,0,0 yellow:255,255,0 green:0,255,0` 】定义接口，里面有方法`show`，要求`Color`实现该接口，`show()`方法中显示三属性的值，将枚举对象在`switch`语句中匹配使用。

```java
package cn.enum_.demo03;

interface IMyInterface {
    public void show();
}

enum Color implements IMyInterface {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值为" + redValue + "," + greenValue + "," + blueValue);
    }
}

public class EnumExercise02 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        //switch () 中，放入枚举对象，在每个case 后，直接写上在枚举类中，定义的枚举对象即可
        switch (green) {
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            default:
                System.out.println("没有匹配到..");
        }
    }
}
```

执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210920161853.png" style="zoom:80%;" />

#### 9.4.3 案例三

```java
package cn.enum_.demo03;

interface IPlaying {
    public void playing();
}
/*
* 注意事项:
*1.使用enum关键字后，就不能再继承其它类了，因为enum会隐式继承Enum，而Java是单继承机制.
* 2.enum实现的枚举类，仍然是一个类，所以还是可以实现接口的.
*/
enum Music implements IPlaying {
    CLASSICMUSIC;
    @Override
    public void playing() {
        System.out.println("hello enum!!!");
    }
}
public class EnumExercise03 {
    public static void main(String[] args) {
        Music.CLASSICMUSIC.playing();
    }
}
```

## 第10章 异常-Exception

### 10.1 异常的引出

1、运行下面的代码，看看有什么问题？

```java
package cn.exception.demo01;
/*
* 引出异常和异常处理机制
*/
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int res = num1 / num2;
        System.out.println("程序继续运行....");
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210921094251.png)

2、解决方案-异常捕获

对异常进行捕获，保证程序可以继续运行。

```java
package cn.exception.demo01;
/*
* 引出异常和异常处理机制
*/
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        /*
        * 1.2 当执行到 num1 / num2 因为 num2 = 0, 程序就会出现(抛出)异常ArithmeticException
        * 1.3 当抛出异常后，程序就退出崩溃了,下面的代码就不在执行。
        * 1.4 如果程序员，认为一段代码可能出现异常/问题，可以使用try-catch异常处理机制来解决从而保证程序的健壮性
        * 1.5 将该代码块->选中->快捷键 ctrl + alt + t -> 选中 try-catch。
        * 1.6. 如果进行异常处理，那么即使出现了异常，程序可以继续执行
        */
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("出现异常的原因="+ e.getMessage());//输出异常信息
        }

        System.out.println("程序继续运行....");

    }
}
```

执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210921095849.png" style="zoom:80%;" />

### 10.2 异常介绍

#### 10.2.1 基本概念

Java语言中，将程序执行中发生的不正常情况称为==“异常"== 。【开发过程中的语法错误和逻辑错误不是异常】执行过程中所发生的异常事件可分为两大类：

1、**Error(错误)**: Java虚拟机无法解决的严重问题。如: JVM系统内部错误、资源耗尽等严重情况。比如: ==StackOverflowError[栈溢出]==和==OOM(out ofmemory), Error== 是严重错误，程序会崩溃。

2、**Exception**:其它因编程错误或偶然的外在因素导致的一般性问题，可以使用针对性的代码进行处理。例如空指针访问，试图读取不存在的文件，网络连接中

断等等，`Exception`分为两大类:运行时异常【程序运行时，发生的异常】和编译时异常【编程时，编译器检查出的异常】。

#### 10.2.2 异常体系图

1、系统体系图

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210921111252.png)

2、异常体系图的小结

- 异常分为两大类，运行时异常和编译时异常。
- 运行时异常，编译器检查不出来，一般是指编程时的逻辑错误，是程序员应该避免其出现的异常。【`java.lang.RuntimeException`】类及它的子类都是运行时异常。
- 对于运行时异常，可以不作处理，因为这类异常很普遍，若全处理可能会对程序的可读性和运行效率产生影响。
- 编译时异常，是编译器要求必须处置的异常。

### 10.3 运行时异常

#### 10.3.1 空指针异常

1、`NullPointerException`空指针异常，当应用程序试图在需要对象的地方使用`null`时，抛出该异常,看案例演示。

```java
package cn.exception.demo01;

public class NullPointerExceptionDemo01 {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210921121541.png)

#### 10.3.2 数学运算异常

1、`ArithmeticException` 数学运算异常，当出现异常的运算条件时，抛出此异常。

```java
package cn.exception.demo01;
/*
* 引出异常和异常处理机制
*/
public class ArithmeticExceptionDemo01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int res = num1 / num2;
        System.out.println("程序继续运行....");
    }
}
```

2、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210921124801.png)

#### 10.3.3 数字格式不正确异常

1、`NumberFormatException` 数字格式不正确异常，当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常。

```java
package cn.exception.demo01;

public class NumberFormatExceptionDemo03 {
    public static void main(String[] args) {
        String name = "guardwhy";
        //将String 转成 int
        int num = Integer.parseInt(name);//抛出NumberFormatException
        System.out.println(num);//1234
    }
}
```

2、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210921125722.png)

#### 10.3.4 数组下标越界异常

1、`ArrayIndexOutOfBoundsException` 数组下标越界异常，用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引。

```java
package cn.exception.demo01;

public class ArrayIndexOutOfBoundsExceptionDemo04 {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
```

2、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210921131428.png)

#### 10.3.5 类型转换异常

1、`ClassCastException`类型转换异常，当试图将对象强制转换为不是实例的子类时，抛出该异常。

```java
package cn.exception.demo01;

class A {}
class B extends A {

}
class C extends A {

}
public class ClassCastExceptionDemo05 {
    public static void main(String[] args) {
        //1.1 向上转型
        A b = new B();
        //1.2 向下转型，这里是OK
        B b2 = (B)b;
        //1.3 这里抛出ClassCastException
        C c2 = (C)b;
    }
}
```

2、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210921134534.png)

#### 10.3.6 案例分析

看看下面代码是否正确，为什么？ 

```java
String friends[]={"tom","jack","milan"};
for(int i=O;i<4;i++) {
    System.out.println(friends[i]);
}
```

错误，因为出现`ArrayIndexOutOfBoundsException`！！！

```java
Cat c=new Cat();
cat=null;
System.out.println(cat.name);
```

错误，出现`NullPointerException`！！

```java
package cn.exception.demo02;

public class AAA{
    int x;//默认0
    public static void main(String[] args) {
        int y;
        AAA a=new AAA();
        y =3 / a.x; //==> 3/0
        System.out.println("program ends ok!");
    }
}
```

错误，出现`ArithmeticException`！！！

```java
package cn.exception.demo02;

import java.util.Date;

class Person {
    public static void main(String[] args) {
        Object obj = new Date();
        Person person;
        person = (Person)obj;
        System.out. println(person);
    }
} 
```

错误，出现`ClassCastException`！！！

### 10.4 出现编译时异常

#### 10.4.1 基本概念

编译异常是指在编译期间，就必须处理的异常，否则代码不能通过编译。

#### 10.4.2 常见的编译异常

- **SQLException**：操作数据库时，查询表可能发生异常
- **IOException**：操作文件时，发生的异常
- **FileNotFoundException**：当操作一个不存在的文件时， 发生异常
- **ClassNotFoundException**：加载类，而该类不存在时，异常
- **EOFException**：操作文件，到文件末尾，发生异常
- **llegalArguementException**：参数异常

#### 10.4.3 案例说明

1、通过下列代码，寻找`test.jpg`图片

```java
package cn.exception.demo02;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis;
            fis = new FileInputStream("c:\\test.jpg");
            int len;
            while ((len = fis.read()) != -1) {
                System.out.println(len);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

2、执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210921135847.png" style="zoom: 80%;" />

###  10.5 异常处理

#### 10.5.1 基本介绍

异常处理就是当异常发生时，对异常处理的方式。

#### 10.5.2 异常处理方式

1、**try-catch-finally**方式

程序员在代码中捕获发生的异常，自行处理！！

```java
try{
    代码/可能有异常
}catch(Exception e) {
//1.1 捕获到异常
//1.2 当异常发生时系统将异常封装成Exception对象e,传递给catch
//1.3 得到异常对象后程序员自己处理注意，如果没有发生异常catch代码块不执行
}finally{
// 1.1 不管try代码块是否有异常发生，始终要执行finally
// 1.2.所以，通常将释放资源的代码，放在finally
}
```

2、**throws** 方式

将发生的异常抛出，交给调用者(方法)来处理，最顶级的处理者就是`JVM`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210921205748.png" style="zoom:80%;" />

3、小结

- `try-catch-finally`和`throws`只能二选一
- 如果程序员，没有显示是处理异常，默认`throws`。

### 10.6 try-catch 异常处理

#### 10.6.1 基本概念

1、具体说明

`Java`提供`try`和`catch`块来处理异常，`try`块用于包含可能出错的代码，`catch`块用于处理`try`块中发生的异常。

可以根据需要在程序中有多个`try.....catch`块。

2、基本语法

```java
try {
  //可疑代码
  //将异常生成对应的异常对象，传递给catch块
}catch(异常){
 //对异常的处理
}
//如果没有finally,语法是可以通过
```

3、快速入门

```java
package cn.exception.demo03;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210921212220.png)	

#### 10.6.2 try-catch 注意事项

1、如果异常发生了，则异常发生后面的代码不会执行，直接进入到`catch`块。

2、如果异常没有发生，则顺序执行`try`的代码块，不会进入到`catch`。

3、如果希望不管是否发生异常，都执行某段代码【比如关闭连接，释放资源等】则使用如下代码`-finally {}`

```java
package cn.exception.demo03;

public class TryCatchDetailDemo01 {
    public static void main(String[] args) {
        /*
        * ctrl + atl + t
        *1.1 如果异常发生了，则异常发生后面的代码不会执行，直接进入到catch块
        *1.2 如果异常没有发生，则顺序执行try的代码块，不会进入到catch。
        *1.3 如果希望不管是否发生异常，都执行某段代码(比如关闭连接，释放资源等)则使用如下代码- finally
        */
        try {
            String str = "guardwhy";
            int a = Integer.parseInt(str);
            System.out.println("数字:" + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息=" + e.getMessage());
        } finally {
            System.out.println("finally代码块被执行...");
        }
        System.out.println("程序继续...");
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210921214221.png" style="zoom:80%;" />	

4、可以有多个catch语句，捕获不同的异常【进行不同的业务处理】，要求父类异常在后子类异常在前，比如【`Exception` 在后，`NullPointerException` 在前】，如果发生异常，只会匹配一个`catch`。

```java
package cn.exception.demo03;

class Person {
    private String name = "guardwhy";

    public String getName() {
        return name;
    }
}

public class TryCatchDetailDemo03 {
    public static void main(String[] args) {
        /*
        * 1.1 如果try代码块有可能有多个异常,可以使用多个catch 分别捕获不同的异常，相应处理
        * 1.2 要求子类异常写在前面，父类异常写在后面
        */
        try {
            Person person = new Person();
            //1.1 person = null; NullPointerException
            System.out.println(person.getName());
            int n1 = 10;
            int n2 = 0;
            //1.2 ArithmeticException
            int res = n1 / n2;
        } catch (NullPointerException e) {
            System.out.println("空指针异常=" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("算术异常=" + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }
}
```

执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210921215039.png" style="zoom:80%;" />

5、可以进行`try-finally`配合使用，这种用法相当于没有捕获异常，因此程序会直接崩掉/退出。==应用场景，就是执行一段代码，不管是否发生异常，都必须执行某个业务逻辑==。

```java
package cn.exception.demo03;

public class TryCatchDetailDemo04 {
    public static void main(String[] args) {
        /*
        可以进行 try-finally 配合使用, 这种用法相当于没有捕获异常，
        因此程序会直接崩掉/退出。应用场景，就是执行一段代码，不管是否发生异常，都必须执行某个业务逻辑
        */
        try{
            int n1 = 10;
            int n2 = 0;
            System.out.println(n1 / n2);
        }finally {
            System.out.println("执行了finally..");
        }
        System.out.println("程序继续执行..");
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210921215655.png)

#### 10.6.3 异常处理练习

1、查看下面代码，分析流程过程，最终输出结果？

```java
package cn.exception.demo05;

public class TryCatchExercise01 {
    public static int method() {
        try {
            //1.1 String[]数组
            String[] names = new String[3];
            //1.2 NullPointerException
            if (names[1].equals("tom")) {
                System.out.println(names[1]);
            } else {
                names[3] = "hello java!!!";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
            // 1.3 捕获
        } catch (NullPointerException e) {
            return 3;
            //1.4 必须执行,最终返回4
        } finally {
            return 4;
        }
    }

    public static void main(String[] args) {
        System.out.println("输出最后的结果:"+ method()); //输出最后的结果:4
    }
}
```

2、查看下面代码，分析流程过程，最终输出结果？

```java
package cn.exception.demo05;

public class TryCatchExercise02 {
    // 1.1 创建method()方法
    public static int method() {
        int i = 1;
        try {
            i++; //i = 2
            String[] names = new String[3];
            //1.2 空指针
            if (names[1].equals("tom")) {
                System.out.println(names[1]);
            } else {
                names[3] = "guardwhy";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i; //i = 3
            //1.3 必须执行
        } finally {
            return ++i; //i = 4
        }
    }

    public static void main(String[] args) {
        System.out.println("输出最后的结果:" + method());  // 输出最后的结果:4
    }
}
```

3、查看下面代码，分析流程过程，最终输出结果？

```java
package cn.exception.demo05;

public class TryCatchExercise03 {
    public static int method() {
        //1.1 i = 1
        int i = 1;
        try {
            // 1.2 i=2
            i++;
            String[] names = new String[3];
            //1.3 空指针
            if (names[1].equals("tom")) {
                System.out.println(names[1]);
            } else {
                names[3] = "guardwhy";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            // 1.4 i = 3 => 保存临时变量 temp = 3;
            return ++i;
        } finally {
            //1.5 i = 4
            ++i;
            System.out.println("i=" + i);// i = 4
        }
    }

    public static void main(String[] args) {
        System.out.println("输出最后的结果:" + method());  // 输出最后的结果:4
    }
}
```

4、如果用户输入的不是一个整数，就提示他反复输入，直到输入一个整数为止。

```java
package cn.exception.demo05;

import java.util.Scanner;
/*
* 思路分析
* 1. 创建Scanner对象,使用无限循环，去接收一个输入.
* 2.然后将该输入的值，转成一个int
* 3.如果在转换时，抛出异常，说明输入的内容不是一个可以转成int的内容.
* 4.如果没有抛出异常，则break 该循环
*/
public class TryCatchExercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while (true) {
            System.out.println("请输入一个整数:");
            inputStr = scanner.next();
            try {
                //1.1 这里是可能抛出异常
                num = Integer.parseInt(inputStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数:");
            }
        }
        System.out.println("你输入的值是=" + num);
    }
}
```

#### 10.6.4 执行顺序小结

1、如果没有出现异常，则执行`try`块中所有语句，不执行`catch`块中语句，如果有`finally`,最后还需要执行`finally`里面的语句。

2、如果出现异常，则`try`块中异常发生后，`try`块剩下的语句不再执行。将执行`catch`块中的语句，如果有`finally`, 最后还需要执行`finally`里面的语句!

### 10.7 throws 异常处理

#### 10.7.1 基本介绍

1、如果个方法【中的语句执行时】可能生成某种异常，但是并不能确定如何处理这种异常，则此方法应显示地声明抛出异常，表明该方法将不对这些异常进行处理，而由该方法的调用者负责处理。

2、在方法声明中用`throws`语句可以声明抛出异常的列表，`throws`后面的异常类型可以是方法中产生的异常类型，也可以是它的父类。

#### 10.7.2 快速入门案例

```java
package cn.throws_.demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo01 {
    public void method() throws FileNotFoundException,NullPointerException,ArithmeticException {
        /*
        * 1.1 创建了一个文件流对象,这里的异常是一个FileNotFoundException编译异常。
        * 1.2 使用throws ,抛出异常, 让调用method()方法的调用者(方法)处理。
        * 1.3 throws后面的异常类型可以是方法中产生的异常类型，也可以是它的父类。
        * 1.4 throws关键字后也可以是 异常列表, 即可以抛出多个异常。
        */
        FileInputStream fis = new FileInputStream("c://test.txt");

    }
    public static void main(String[] args) {

    }
}
```

#### 10.7.3 注意事项

1、对于编译异常，程序中必须处理，比如`try-catch`或者`throws`。

2、对于运行时异常，程序中如果没有处理，默认就是`throws`的方式处理。

```java
package cn.throws_.demo01;

public class ThrowsDemo02 {
    public static void method01() /* throws ArithmeticException*/ {
        //1.1 对于编译异常，程序中必须处理，比如 try-catch 或者 throws
        //1.2 对于运行时异常，程序中如果没有处理，默认就是throws的方式处理

        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
    }

    public static void main(String[] args) /*throws ArithmeticException*/ {
        method01();
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210922113127.png)

3、子类重写父类的方法时，对抛出异常的规定子类重写的方法，所抛出的异常类型要么和父类抛出的异常一致，要么为父类抛出的异常的类型的子类型。

4、在`throws`过程中，如果有方法`try-catch` ,就相当于处理异常，就可以不必`throws`。

```java
package cn.throws_.demo01;

//1.1 创建基类Father
class Father {
    public void method() throws RuntimeException {
        System.out.println("hello javaSE!!!");
    }
}

//1.2 创建子类Son
class Son extends Father {
    /*
    * 1.3 子类重写父类的方法时，对抛出异常的规定:子类重写的方法.
    * 1.4 所抛出的异常类型要么和父类抛出的异常一致，要么为父类抛出的异常类型的子类型
    * 1.5 在throws 过程中，如果有方法 try-catch , 就相当于处理异常，就可以不必throws
    */
    @Override
    public void method() throws ArithmeticException {
        System.out.println("hello throws！！！");
    }
}
public class ThrowsDemo02 {
    public static void main(String[] args) {
        Son sn = new Son();
        sn.method();
    }
}
```

5、编译异常

```java
package cn.throws_.demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo03 {
    public static void method01() throws FileNotFoundException {
        
        /*
        * 1.1 调用method03()报错，因为method03()方法抛出的是一个编译异常
        * 1.2 即这时，就要method01()必须处理这个编译异常.
        * 1.3 在method01()中，要么try-catch-finally ,或者继续throws这个编译异常
        */
        method03(); // 抛出异常
    }
    public static void method03() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://test.txt");
    }

    public static void main(String[] args) {

    }
}
```

6、运行时异常

```java
package cn.throws_.demo01;

public class ThrowsDemo03 {

    public static void method01() {
        /*
        * 1.1 在method01()中调用方法method02()是可以使用的。
        * 1.2 因是method02()抛出的是运行异常,而java中，并不要求程序员显示处理,因为有默认处理机制。
        */
        method02();
    }
    public static void method02() throws ArithmeticException {

    }
    public static void main(String[] args) {

    }
}
```

#### 10.7.4 案例分析

1、阅读下面代码，查看输出最终结果？

```java
package cn.throws_.demo01;

class ReturnExceptionDemo {
    static void methodA() {
        try {
            System.out.println("进入方法A()"); // 1
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("用A方法的finally"); // 2
        }
    }

    static void methodB() {
        try {
            System.out.println("进入方法B()"); // 4
            return;
        } finally {
            System.out.println("调用B方法的finally"); // 5
        }
    }
}

public class ThrowExceptionDemo01 {
    public static void main(String[] args) {
        try {
            ReturnExceptionDemo.methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage()); // 3
        }
        ReturnExceptionDemo.methodB();
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210922191449.png" style="zoom:80%;" />	

### 10.8 自定义异常

#### 10.8.1 基本概念

当程序中出现了某些"错误”,但该错误信息并没有在Throwable子类中描述处理，这个时候可以自己设计异常类，用于描述该错误信息。

#### 10.8.2 自定义异常的步骤

1、定义类自定义异常类名(程序员自己写)继承`Exception`或`RuntimeException`

2、如果继承`Exception`,属于编译异常。

3、如果继承`RuntimeException`,属于运行异常(一般来说， 继承`RuntimeException`)

#### 10.8.3 自定义异常应用实例

当接收`Person`之间，否则抛出一个自定义异常(要求 继承`RuntimeException`)并给出提示信息。

```java
package cn.throws_.demo02;

/*
* 1. 一般情况下，我们自定义异常是继承 RuntimeException
* 2. 即把自定义异常做成 运行时异常，好处时，我们可以使用默认的处理机制
* 3. 即比较方便
*/
class AgeException extends RuntimeException {
    public AgeException(String message) {//构造器
        super(message);
    }
}
public class CustomExceptionDemo01 {
    public static void main(String[] args) {
        // 2.1 定义变量
        int age = 33;
        //2.2 要求范围在 18 – 120 之间，否则抛出一个自定义异常
        if(!(age >= 18 && age <= 120)) {
            //2.3 这里可以通过构造器，设置信息
            throw new AgeException("年龄需要在 18~65之间");
        }
        System.out.println("你的年龄范围正确.");
    }
}
```

### 10.9 throw 和 throws 的区别

#### 10.9.1基本小结

| 关键字 | 简介                     | 位置       | 后面跟的东西 |
| ------ | ------------------------ | ---------- | ------------ |
| throws | 异常处理的一种方式       | 方法声明处 | 异常类型     |
| throw  | 手动生成异常对象的关键字 | 方法体中   | 异常对象     |

#### 10.9.2 经典案例

1、说出以下代码是否会发生异常，如果会，是哪种异常?如果不会，则打印结果是什么？

```java
package cn.guardwhy.demo01;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        //1.1 args.length = 0，这里发生的是 ArrayIndexOutOfBoundsException

        //1.2 可能发生NullPointerException
        if(args[4].equals("john")){  
            System.out.println("AA");
        }else{
            System.out.println("BB");
        }
        //1.3 String->Object，向上转型
        Object o= args[2];
        //1.4 错误，这里一定会发生 ClassCastException
        Integer i = (Integer)o;      
    }
}
```

2、阅读下面代码，得出程序最终结果的值？

```java
package cn.guardwhy.demo01;

public class ExceptionDemo02 {
    public static void func() {//静态方法
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }
    public static void main(String[] args) {
        try {
            func();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }
}
```

执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210922203217.png" style="zoom: 80%;" />

3、阅读下面代码，得出程序最终结果的值？

```java
package cn.guardwhy.demo01;

public class ExceptionDemo03 {
    public static void main(String[] args) {
        try {
            show();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void show() throws Exception {
        throw new Exception();
    }
}
```

执行结果
<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210922203552.png" style="zoom:80%;" />

## 第11章 Java常用类

### 11.1 包装类

#### 11.1.1 包装类的分类

1、针对八种基本数据类型相应的引用类型，包装类

2、有了类的特点，就可以调用类中的方法。

3、基本数据类型转包装类

Boolean包装类

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210922221612.png" style="zoom:80%;" />	

| 基本数据类型 | 包装类  |
| ------------ | ------- |
| boolean      | Boolean |

Character包装类

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210922221215.png" style="zoom:80%;" />	

| 基本数据类型 | 包装类    |
| ------------ | --------- |
| char         | Character |

其他包装类

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210923111659.png" style="zoom:80%;" />

| 基本数据类型 | 包装类  |
| ------------ | ------- |
| byte         | Byte    |
| short        | Short   |
| int          | Integer |
| long         | Long    |
| float        | Float   |
| double       | Double  |

#### 11.1.2 基本数据的转换

1、`jdk5`前的手动装箱和拆箱方式，装箱:【基本类型->包装类型，反之，拆箱】。

2、`jdk5`以后(`含jdk5`)的自动装箱和拆箱方式。

3、自动装箱底层调用的是`valueOf()`方法， 比如`Integer.valueOf()`

#### 11.1.3 入门案例

1、自动和手动的装箱拆箱操作

```java
package cn.wrapper.demo01;
/*
* int <--> Integer的装箱和拆箱
*/
public class IntegerDemo01 {
    public static void main(String[] args) {

        //1.1 jdk5前是手动装箱和拆箱,手动装箱 int->Integer
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //1.2 手动拆箱Integer -> int
        int i = integer.intValue();

        //1.3 jdk5后，就可以自动装箱和自动拆箱
        int n2 = 200;
        //1.4 自动装箱 int->Integer,底层使用的是 Integer.valueOf(n2)
        Integer integer2 = n2;
        //1.5 自动拆箱 Integer->int,底层仍然使用的是intValue()方法
        int n3 = integer2;
    }
}
```

2、判断下面代码是否正确，为什么？

```java
package cn.wrapper.demo01;

public class WrapperExercise01 {
    public static void main(String[] args) {
        //1.1 true,自动装箱 Double.valueOf(100d);
        Double d = 100d;
        //1.2 true, 自动装箱 Float.valueOf(1.5f);
        Float f = 1.5f;
        //1.3 三元运算符【是一个整体】
        Object obj1 = true? new Integer(1) : new Double(2.0);
        System.out.println("obj1的值:" + obj1);   // obj1的值:1.0

        // 1.4 定义obj2对象
        Object obj2;
        if(true)
            obj2 = new Integer(1);
        else
            obj2 = new Double(2.0);
        System.out.println("obj2的值:" + obj2);// obj2的值:1
    }
}
```

#### 11.1.4 类型之间相互转换

1、 以` Integer` 和 `String` 转换为例

```java
package cn.wrapper.demo01;

public class WrapperVSString {
    public static void main(String[] args) {
        //包装类(Integer)->String
        Integer i = 100;//自动装箱
        //1.1 方式1
        String str1 = i + "";
        //1.2 方式2
        String str2 = i.toString();
        System.out.println("str2:" +str2);  // str2:100
        //1.3 方式3
        String str3 = String.valueOf(i);
        System.out.println("str3:" +str3);  // str3:100

        //String -> 包装类(Integer)
        String str4 = "12345";
        //1.4 使用到自动装箱
        Integer i2 = Integer.parseInt(str4);
        System.out.println("i2的值:" + i2); // i2的值:12345
        //1.5 构造器
        Integer i3 = new Integer(str4);
        System.out.println("i3的值:" + i3);   // i3的值:12345
    }
}
```

#### 11.1.5 类型之间的常用方法

 1、`Integer` 类和 `Character` 类的常用方法

```java
package cn.wrapper.demo01;

public class WrapperMethod {
    public static void main(String[] args) {
        System.out.println("返回最小值:" + Integer.MIN_VALUE); //返回最小值
        System.out.println("返回最大值:" + Integer.MAX_VALUE);//返回最大值

        System.out.println(Character.isDigit('a'));//判断是不是数字
        System.out.println(Character.isLetter('a'));//判断是不是字母
        System.out.println(Character.isUpperCase('a'));//判断是不是大写
        System.out.println(Character.isLowerCase('a'));//判断是不是小写

        System.out.println(Character.isWhitespace('a'));//判断是不是空格
        System.out.println(Character.toUpperCase('a'));//转成大写
        System.out.println(Character.toLowerCase('A'));//转成小写
    }
}
```

#### 11.1.6 经典案例

1、看看下面代码，输出什么结果?

```java
package cn.wrapper.demo02;

public class WrapperExercise02 {
    public static void main(String[] args) {
        // 1.1 这里主要是看范围-128 ~ 127就是直接返回
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);  //False

        /*
         * 1.2 源码分析
         * 如果i 在 IntegerCache.low(-128)~IntegerCache.high(127),就直接从数组返回
         * 如果不在 -128~127,就直接 new Integer(i)
         * public static Integer valueOf(int i) {
         *  if (i >= IntegerCache.low && i <= IntegerCache.high)
         *      return IntegerCache.cache[i + (-IntegerCache.low)];
         *  return new Integer(i);
         */

        //1.2 这里主要是看范围 -128 ~ 127就是直接返回。否则就new Integer(xx);
        Integer m = 1; //底层 Integer.valueOf(1);
        Integer n = 1;//底层 Integer.valueOf(1);
        System.out.println(m == n); //true

        Integer x = 128;//底层Integer.valueOf(1);
        Integer y = 128;//底层Integer.valueOf(1);
        System.out.println(x == y);//False
    }
}
```

2、看看下面代码，输出什么结果？

```java
package cn.wrapper.demo02;

public class WrapperExercise03 {
    public static void main(String[] args) {
        //1.1 示例一
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);//F
        //1.2 示例二
        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);//F

        //1.3 示例三
        Integer i5 = 127;//底层Integer.valueOf(127)
        Integer i6 = 127;//-128~127
        System.out.println(i5 == i6); //T
        //1.4 示例四
        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);//F
        //1.5 示例五
        Integer i9 = 127; //Integer.valueOf(127)
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);//F

        //示例六
        Integer i11=127;
        int i12=127;
        //只有有基本数据类型，判断的是值是否相同
        System.out.println(i11==i12); //T
        //示例七
        Integer i13=128;
        int i14=128;
        System.out.println(i13==i14);//T
    }
}
```

### 11.2 String类

#### 11.2.1 String类概念

1、基本介绍

- String 类代表字符串类，Java 程序中所有的双引号字符串（比如"Hello"），都是 String 类的对象。
- String 类在`java.lang` 包下，所以使用的时候不需要导包。
- ==该类由final关键字修饰，表示该类不能被继承。该类描述的字符串内容是个常量不可更改，因此可以被共享使用==。

2、继承方式

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210924094054.png)

3、String入门案例

```java
package cn.string.demo01;

public class StringDemo01 {
    public static void main(String[] args) {
       /**
        * 1.0 字符串的字符使用Unicode字符编码，一个字符(不区分字母还是汉字)占两个字节
        * String 类实现了接口 Serializable【String 可以串行化:可以在网络传输】
        * 接口 Comparable [String 对象可以比较大小]
        */

        // 1.1.String 对象用于保存字符串，也就是一组字符序列,"guardwhy"是字符串常量, 双引号括起的字符序列
        String name = "guardwhy";
        name = "tom";
        //1.2 String是final类，不能被其他的类继承
        final char[] value = {'a','b','c'};
        // 1.3 String有属性 private final char value[]; 用于存放字符串内容
        char[] v2 = {'t','o','m'};
        //新的地址，但是单个字符内容是可以变化
        value[0] = 'H';
        // 1.4 一定要注意：value 是一个final类型,不可以修改(需要功力)：即value不能指向
        //value = v2; 不可以修改 value地址
    }
}
```

4、源码分析

```java
package java.lang;

import java.io.ObjectStreamField;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class String
    implements java.io.Serializable, Comparable<String>, CharSequence {
    /** The value is used for character storage. */
    private final char value[];
    
    public String() {
        this.value = "".value;
    }
    
    public String(String original) {
        this.value = original.value;
        this.hash = original.hash;
    }

    public String(char value[]) {
        this.value = Arrays.copyOf(value, value.length);
    }

    
    public boolean contentEquals(StringBuffer sb) {
        return contentEquals((CharSequence)sb);
    }
    /**
     * This object (which is already a string!) is itself returned.
     *
     * @return  the string itself.
     */
    public String toString() {
        return this;
    }

    /**
     * Converts this string to a new character array.
     *
     * @return  a newly allocated character array whose length is the length
     *          of this string and whose contents are initialized to contain
     *          the character sequence represented by this string.
     */
    public char[] toCharArray() {
        // Cannot use Arrays.copyOf because of class initialization order issues
        char result[] = new char[value.length];
        System.arraycopy(value, 0, result, 0, value.length);
        return result;
    }
    /**
     * Returns the string representation of the {@code Object} argument.
     *
     * @param   obj   an {@code Object}.
     * @return  if the argument is {@code null}, then a string equal to
     *          {@code "null"}; otherwise, the value of
     *          {@code obj.toString()} is returned.
     * @see     java.lang.Object#toString()
     */
    public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }

    /**
     * Returns the string representation of the {@code char} array
     * argument. The contents of the character array are copied; subsequent
     * modification of the character array does not affect the returned
     * string.
     *
     * @param   data     the character array.
     * @return  a {@code String} that contains the characters of the
     *          character array.
     */
    public static String valueOf(char data[]) {
        return new String(data);
    }

    public static String valueOf(char c) {
        char data[] = {c};
        return new String(data, true);
    }

    public static String valueOf(int i) {
        return Integer.toString(i);
    }

    /**
     * Returns the string representation of the {@code long} argument.
     * <p>
     * The representation is exactly the one returned by the
     * {@code Long.toString} method of one argument.
     *
     * @param   l   a {@code long}.
     * @return  a string representation of the {@code long} argument.
     * @see     java.lang.Long#toString(long)
     */
    public static String valueOf(long l) {
        return Long.toString(l);
    }

    public static String valueOf(double d) {
        return Double.toString(d);
    }

    public native String intern();
}
```

#### 11.2.2 String类的特点

- ==字符串不可变，它们的值在创建后不能被更改==。
- 虽然 String 的值是不可变的，但是它们可以被共享（常量池）。
- 字符串的底层原理是字节数组。(**byte[ ]**）
- String  s  =  "字符串常量" ;

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/33-mysql.png" style="zoom: 80%;" />

2、常量池的概念

由于String类型描述的字符串内容是常量不可改变，因此Java虚拟机将首次出现的字符串放入常量池中，若后续代码中出现了相同字符串内容则直接使用池中已有的字符串对象而无需申请内存及创建对象，从而提高了性能。

```java
package cn.guardwhy_08;

public class StringPoolTest01 {
    public static void main(String[] args) {
        // 1.验证常量池的存在
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2); // 比较地址 true
    }
}
```

#### 11.2.3 创建对象的方式

1、基本概念

创建方式一：直接赋值

```java
String S1 = "guardwhy"
```

创建方式二 :调用构造器

```java
String s2 = new String("guardwhy");
```

2、内存分布图

方式一: 先从常量池查看是否有`"guardwhy"`数据空间，如果有直接指向，如果没有则重新创建，然后指向。`s1`最终指向的是常量池的空间地址。

方式二: 先在堆中创建空间，里面维护了`value`属性，指向常量池的`guardwhy`空间。如果常量池没有`"guardwhy"`,重新创建，如果有，直接通过`value`指向。最终指向的是堆中的空间地址。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210924111727.png" style="zoom:80%;" />	

3、案例分析

查看下列代码，查看最终输出的结果？

```java
package cn.string.demo01;

public class StringDemo02 {
    public static void main(String[] args) {
        String a1 = "abc";
        String b1 ="abc";
        System.out.println(a1.equals(b1));// true
        System.out.println(a1==b1); //true

        System.out.println("================");

        //2.1 a2指向常量池的“guardwhy”
        String a2 = "guardwhy";
        //2.2 b2指向堆中对象
        String b2 =new String("guardwhy");
        System.out.println(a2.equals(b2)); //true
        System.out.println(a2==b2); //false
        //2.3 b2.intern() 方法返回常量池地址

        /*
        *当调用intern方法时，如果池已经包含一个等于此String对象的字符串(用equals(Object)方法确定)，则返回池中的字符串。
        *否则，将此String对象添加到池中，井返回此String对象的引用
        * b2.intern(方法最终返回的是常量池的地址(对象) .
        */
        System.out.println(a2==b2.intern()); //true
        System.out.println(b2==b2.intern()); //false
        System.out.println("+++++++++++++++++++++");

        //3.1 指向常量池”guardwhy”
        String s1 = "guardwhy";
        //3.2 指向常量池”java”
        String s2 = "java";
        //3.3 指向常量池”java”
        String s4 = "java";
        //3.4 指向堆中对象
        String s3 = new String("java");
        System.out.println(s2 == s3); // false
        System.out.println(s2 == s4);  // true
        System.out.println(s2.equals(s3));// true
        System.out.println(s1 == s2);  // false
    }
}
```

#### 11.2.4 字符串的特性

==String是一个final类，代表不可变的字符序列，字符串是不可变的。一个字符串对象一旦被分配， 其内容是不可变的==。

1、阅读下面代码，判断输出结果，画出内存布局图

```java
package cn.string.demo01;

class Person {
    public String name;
}

public class StringDemo03 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "guardwhy";
        Person p2 = new Person();
        p2.name = "guardwhy";


        System.out.println(p1.name.equals(p2.name));//比较内容:true
        System.out.println(p1.name == p2.name);  //true
        System.out.println(p1.name == "guardwhy");   //true

        String s1 = new String("jack");
        String s2 = new String("jack");
        System.out.println(s1==s2); // false
    }
}
```

内存布局图

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210924150123.png" style="zoom:80%;" />

2、以下语句创建了几个对象?画出内存布局图。

```java
package cn.string.demo02;

public class StringDemo01 {
    public static void main(String[] args) {
        // 一共创建了2个对象
        String s1 = "hello";
        s1 = "guardwhy";
    }
}
```

内存布局图

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210924181010.png" style="zoom:80%;" />

3、以下语句创建了几个对象?

```java
package cn.string.demo02;

public class StringDemo01 {
    public static void main(String[] args) {
        // 一共创建了1个对象
        /*
         * String s1 = "hello"+ "guardwhy"; ==>优化等价 String s1 = "helloguardwhy";
         * 编译器会做一个优化，判断创建的常池对象，是否有引用指向。
         */
        String s1 = "hello" + "guardwhy";
    }
}
```

4、以下语句创建了几个对象?画出内存布局图

```java
package cn.string.demo02;

public class StringDemo02 {
    public static void main(String[] args) {
        //1.1 创建a对象
        String a = "hello";
        //1.2 创建 b对象
        String b = "guardwhy";

        /** 源码分析
         * 1.3 先创建一个 StringBuilder sb = StringBuilder()
         * 执行sb.append("hello");
         * 执行sb.append("guardwhy");
         * String c= sb.toString();
         * 最后其实是c指向堆中的对象(String) value[] -> 池中 "helloguardwhy"
         */
        // 1.4 创建c对象,将 a + b的值赋值给c
        String c = a + b;
        System.out.println("变量c的值:" + c);
        // 1.4 创建d对象
        String d = "helloguardwhy";
        System.out.println(c == d); // false
        //1.5 直接看池， e指向常量池
        String e = "hello" + "guardwhy";
        System.out.println( d == e);// true
    }
}
```

内存布局图

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210924222443.png" style="zoom: 80%;" />

5、下面代码输出什么？并且说明其原因。

```java
package cn.string.demo02;

public class StringDemo03 {
    public static void main(String[] args) {
        //1.1 s1指向池中的 “hello”
        String s1 = "hello";
        //1.2 s2指向池中的 “java”
        String s2 = "java";
        //1.3 s5指向池中的 “hellojava”
        String s5 = "hellojava";
        System.out.println("s5的值:" + s5); // s5的值:hellojava
        //1.4 s6指向池中的“hellojava”
        String s6 = (s1 + s2).intern();
        System.out.println("s6的值:" + s6);   // s6的值:hellojava
        System.out.println(s5 == s6); // true
        System.out.println(s5.equals(s6));// true
    }
}
```

6、下列程序运行的结果是什么，尝试画出内存布局图?

```java
package cn.string.demo02;

// 1.1 创建Test类
class Test {
    String str = new String("guardwhy");
    final char[] ch = {'j', 'a', 'v', 'a'};
    // 1.2 创建change()方法
    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
    }
}
public class StringDemo04 {
    public static void main(String[] args) {
        // 2.1 创建ex对象
        Test ex = new Test();
        // 2.2 对象调用方法
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);	// guardwhy and hava
    }
}
```

内存布局图

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210925093632.png" style="zoom: 80%;" />	

#### 11.2.5 String构造方法

`String`类是保存字符串常量的。每次更新都需要重新开辟空间，效率较低，因此`java`设计者还提供了`StringBuilder`和`StringBuffer`来增强`String`的功能并提高效率。

1、String构造方法

| 方法声明                                       | 功能介绍                                                     |
| ---------------------------------------------- | ------------------------------------------------------------ |
| `String()`                                     | 使用无参方式构造对象得到空字符序列                           |
| `String(byte[] bytes, int offset, int length)` | 使用`bytes`数组中下标从`offset`位置开始的length个字节来<br/>构造对象 |
| `String(byte[] bytes)`                         | 使用`bytes`数组中的所有内容构造对象                          |
| `String(char[] value, int offset, int count)`  | 使用`value`数组中下标从`offset`位置开始的`count`个字符来构<br/>造对象 |
| `String(char[] value)`                         | 使用`value`数组中的所有内容构造对象                          |
| `String(String original)`                      | 根据参数指定的字符串内容来构造对象，新创建对象为参<br/>数对象的副本 |

2、代码示例

```java
package cn.guardwhy_08;
/*
String构造方法
*/
public class StringConstructorTest02 {
    public static void main(String[] args) {
        // 1.使用无参方式构造对象并打印
        String str1 = new String();
        // "" 表示空字符串对象，有对象只是里面没有内容
        // null 表示空，连对象都没有
        System.out.println("str1 = " + str1); // ""  自动调用toString方法
        System.out.println("------------------");

        // 2.使用参数指定的byte数组来构造对象并打印
        byte[] bArr = {97, 98, 99, 100, 101};
        // 使用字节数组中的一部分内容来构造对象，表示使用数组bArr中下标从1开始的3个字节构造字符串对象
        String str2 = new String(bArr, 1, 3);
        System.out.println("str2 = " + str2); // bcd

        // 使用整个字节数组来构造字符串对象
        String str3 = new String(bArr);
        System.out.println("str3 = " + str3); // abcde
        System.out.println("-------------------");
        
        // 3.使用字符数组来构造字符串对象
        char[] cArr = {'h', 'e', 'l', 'l', 'o'};
        // 使用字符数组中的一部分内容来构造对象
        String str4 = new String(cArr, 2, 2);
        System.out.println("str4 = " + str4); // ll
        
        // 使用整个字符数组来构造对象
        String str5 = new String(cArr);
        System.out.println("str5 = " + str5); // hello
        System.out.println("---------------------");
        
        // 4.使用字符串来构造字符串对象
        String str6 = new String("world");
        System.out.println("str6 = " + str6); // world
    }
}
```

3、执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/34-mysql.png" style="zoom: 67%;" />

#### 11.2.6 String成员方法

1、常用方法

| 方法声明               | 功能介绍                                   |
| ---------------------- | ------------------------------------------ |
| `String toString()`    | 返回字符串本身                             |
| `byte[] getBytes()`    | 将当前字符串内容转换为`byte`数组并返回     |
| `char[] toCharArray()` | 用于将当前字符串内容转换为`char`数组并返回 |

2、代码示例

```java
package cn.guardwhy_08;

public class StringByteCharTest03 {
    public static void main(String[] args) {

        // 1.创建String类型的对象并打印
        String str1 = new String("world");
        System.out.println("str1 = " + str1); // world

        System.out.println("-----------------------");

        // 2.实现将String类型转换为byte数组类型并打印
        byte[] bArr = str1.getBytes();
        for (int i = 0; i < bArr.length; i++) {
            System.out.println("下标为i的元素是：" + bArr[i]);
        }
        // 将byte数组转回String类型并打印
        String str2 = new String(bArr);
        System.out.println("转回字符串为：" + str2); // world

        System.out.println("-----------------------");
        
        // 3.实现将String类型转换为char数组类型并打印
        char[] cArr = str1.toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            System.out.println("下标为" + i + "的字符是：" + cArr[i]);
        }
        // 将char数组转回String类型并打印
        String str3 = new String(cArr);
        System.out.println("转回字符串为：" + str3); // world
    }
}
```

#### 11.2.7 String常用方法

1、常用方法

| 方法声明                 | 功能介绍                                   |
| ------------------------ | ------------------------------------------ |
| `char charAt(int index)` | 方法`charAt`用于返回字符串指定位置的字符。 |
| `int length()`           | 返回字符串字符序列的长度                   |
| `boolean isEmpty()`      | 判断字符串是否为空                         |

2、代码示例

```java
package cn.guardwhy_08;

public class StringCharTest05 {
    public static void main(String[] args) {
        // 1.构造String类型的对象并打印
        String str1 = new String("hello");
        // hello
        System.out.println("str1 = " + str1);

        // 2.获取字符串的长度和每个字符并打印
        System.out.println("字符串的长度是：" + str1.length()); // 5
        System.out.println("下标为0的字符是：" + str1.charAt(0)); // h
        System.out.println("下标为1的字符是：" + str1.charAt(1)); // e
        // StringIndexOutOfBoundsException 字符串下标越界异常
        //System.out.println("下标为5的字符是：" + str1.charAt(5));
        System.out.println("---------------------");

        // 3.使用for循环获取所有字符
        for (int i = 0; i < str1.length(); i++) {
            // h e l l o
            System.out.println("下标为" + i + "的字符是：" + str1.charAt(i));
        }
        System.out.println("----------------------------");

        // 4.判断字符串是否为空
        System.out.println(0 == str1.length()? "字符串为空": "字符串不为空"); // 不为空
        System.out.println(str1.isEmpty()? "字符串为空": "字符串不为空");     // 不为空
        System.out.println("------------------------");

        // 5.使用两种方式实现字符串"12345"转换为整数12345并打印
        String str2 = new String("12345");
        // 方式一：调用Integer类中的parseInt()方法即可
        int i1 = Integer.parseInt(str2);
        System.out.println("转换整数：" + i1); // 12345

        // 方式二：利用ASCII来实现类型转换并打印
        int i2 = 0;
        for (int i = 0; i < str2.length(); i++) {
            // 1 12 ...
            i2 = i2 * 10 + (str2.charAt(i) - '0');
        }
        // 12345
        System.out.println("转换整数：" + i2);
        System.out.println("-------------------");

        // 6.如何实现整数到字符串的转换
        //String str3 = String.valueOf(i2);
        String str3 = "" + i2; // 推荐使用
        System.out.println("str3 = " + str3); // 12345
    }
}
```

#### 11.2.8 String字符串比较

1、字符串比较代码示例

```java
package cn.guardwhy_08;

public class StringDemo4 {
    public static void main(String[] args) {
        //String str1 = "hello";  // 1个对象  存放在常量池中
        //String str1 = new String("hello"); // 2个对象  1个在常量池中，1个在堆区

        // 2.常量池和堆区对象的比较
        String str1 = "hello";  // 常量池
        String str2 = "hello";  // 常量池
        String str3 = new String("hello"); // 堆区
        String str4 = new String("hello"); // 堆区

        System.out.println(str1 == str2);       // 比较地址  true
        System.out.println(str1.equals(str2));  // 比较内容  true
        System.out.println(str3 == str4);       // 比较地址  false
        System.out.println(str3.equals(str4));  // 比较内容  true
        System.out.println(str2 == str4);       // 比较地址  false
        System.out.println(str2.equals(str4));  // 比较内容 true

        System.out.println("-------------------------");
        // 3.常量有优化机制，变量没有
        String str5 = "abcd";
        String str6 = "ab" + "cd";  // 常量优化机制  "abcd"
        System.out.println(str5 == str6); // 比较地址  true

        String str7 = "ab";
        String str8 = str7 + "cd"; // 没有常量优化
        System.out.println(str5 == str8); // 比较地址 false

    }
}
```

2、字符串比较特殊方法

| 方法声明                              | 功能介绍                                     |
| ------------------------------------- | -------------------------------------------- |
| `int compareTo(String anotherString)` | 用于比较调用对象和参数对象的大小关系         |
| `int compareToIgnoreCase(String str)` | 不考虑大小写，也就是`'a'`和`'A'`是相等的关系 |

3、代码示例

```java
package cn.guardwhy_08;

public class StringCompareTest06 {
    public static void main(String[] args) {
        // 1.构造String类型的对象并打印
        String str1 = new String("hello");
        System.out.println("str1 = " + str1); // hello

        // 2.使用构造好的对象与其它字符串对象之间比较大小并打印
        System.out.println(str1.compareTo("world"));  // -15
        System.out.println(str1.compareTo("Curry"));   // 37
        System.out.println(str1.compareTo("guardwhy"));   // 1
        System.out.println(str1.compareTo("kobe")); // -3 
        System.out.println(str1.compareTo("helloworld")); // -5
        System.out.println(str1.compareToIgnoreCase("HELLO")); // 0
    }
}
```

#### 11.2.9 String查找字符

1、常见方法

| 方法声明                                     | 功能介绍                                                     |
| -------------------------------------------- | ------------------------------------------------------------ |
| `int indexOf(int ch)`                        | 用于返回当前字符串中参数`ch`指定的字符第一次出现的下标。     |
| `int indexOf(int ch, int fromIndex)`         | 用于从`fromIndex`位置开始查找ch指定的字符。                  |
| `int indexOf(String str)`                    | 在字符串中检索`str`返回其第一次出现的位置，若找不到返回-1    |
| `int indexOf(String str, int fromIndex)`     | 表示从字符串的`fromIndex`位置开始检索`str`第一次出现的位置。 |
| `int lastIndexOf(int ch)`                    | 用于返回参数ch指定的字符最后一次出现的下标。                 |
| `int lastIndexOf(int ch, int fromIndex)`     | 用于从`fromIndex`位置开始查找ch指定字符出现的下标。          |
| `int lastIndexOf(String str)`                | 返回`str`指定字符串最后一次出现的下标。                      |
| `int lastIndexOf(String str, int fromIndex)` | 用于从`fromIndex`位置开始反向搜索的第一次出现的下标。        |

2、代码示例

```java
package cn.guardwhy_08;

public class StringIndexTest09 {
    public static void main(String[] args) {
        // 1.构造String类型的对象并打印
        String str1 = new String("Good Good Study, Day Day Up!");
        System.out.println("str1 = " + str1); // Good Good Study, Day Day Up!

        // 2.实现字符串中指定字符和字符串的查找功能
        int pos = str1.indexOf('g');
        System.out.println("pos = " + pos); // -1  代表查找失败
        pos = str1.indexOf('G');
        System.out.println("pos = " + pos); // 0   该字符第一次出现的索引位置
        // 表示从下标0开始查找字符'G'第一次出现的索引位置，包含0
        pos = str1.indexOf('G', 0);
        System.out.println("pos = " + pos); // 0
        pos = str1.indexOf('G', 1);
        System.out.println("pos = " + pos); // 5

        System.out.println("-----------------------");
        // 3.查找字符串
        pos = str1.indexOf("day");
        System.out.println("pos = " + pos); // -1
        pos = str1.indexOf("Day");
        System.out.println("pos = " + pos); // 17   字符串中第一个字符的下标
        pos = str1.indexOf("Day", 17);
        System.out.println("pos = " + pos); // 17   字符串中第一个字符的下标
        pos = str1.indexOf("Day", 18);
        System.out.println("pos = " + pos); // 21   字符串中第一个字符的下标

        System.out.println("----------------------");

        // 编写通用代码实现将字符串str1中所有"Day"出现的索引位置找到并打印出来
        pos = str1.indexOf("Day");
        while (-1 != pos) {
            System.out.println("pos = " + pos); // 17
            pos = str1.indexOf("Day", pos+1);// 21
        }

        System.out.println("-----------------------");

        // 优化一下
        pos = 0;
        while ((pos = str1.indexOf("Day", pos)) != -1) {
            System.out.println("pos = " + pos);// 17
            pos += "Day".length();  // 21
        }

        System.out.println("--------------------------");
        // 3.实现字符和字符串内容的反向查找
        pos = str1.lastIndexOf('G');
        System.out.println("pos = " + pos); // 5
        // 从下标5的位置开始反向查找
        pos = str1.lastIndexOf('G', 5);
        System.out.println("pos = " + pos); // 5

        pos = str1.lastIndexOf('G', 6);
        System.out.println("pos = " + pos); // 5

        pos = str1.lastIndexOf('G', 4);
        System.out.println("pos = " + pos); // 0
        System.out.println("-----------------------");

        pos = str1.lastIndexOf("Day");
        System.out.println("pos = " + pos); // 21
        pos = str1.lastIndexOf("Day",  21);
        System.out.println("pos = " + pos); // 21
        pos = str1.lastIndexOf("Day", 20);
        System.out.println("pos = " + pos); // 17
        pos = str1.lastIndexOf("Day", 15);
        System.out.println("pos = " + pos); // -1
    }
}
```

#### 11.2.10 String字符串截取

1、代码示例

```java
package cn.guardwhy_08;

public class SubStringTest10 {
    public static void main(String[] args) {
        // 1.构造String类型的对象并打印
        String str1 = new String("Happy Wife, Happy Life!");
        System.out.println("str1 = " + str1); // Happy Wife, Happy Life!

        // 2.获取字符串中的一部分内容并打印
        String str2 = str1.substring(12);
        System.out.println("str2 = " + str2); // Happy Life!
        // 可以取到6但是取不到10
        String str3 = str1.substring(6, 10);
        System.out.println("str3 = " + str3); // Wife
    }
}
```

#### 11.2.11 String其余方法

1、常用方法

| 方法声明                                         | 功能介绍                                   |
| ------------------------------------------------ | ------------------------------------------ |
| `String concat(String str)`                      | 用于实现字符串的拼接。                     |
| `boolean contains(`CharSequence s)`              | 用于判断当前字符串是否包含参数指定的内容。 |
| `String toLowerCase()`                           | 返回字符串的小写形式。                     |
| `String toUpperCase()`                           | 返回字符串的大写形式。                     |
| `String trim()`                                  | 返回去掉前导和后继空白的字符串。           |
| `boolean startsWith(String prefix)`              | 判断字符串是否以参数字符串开头。           |
| `boolean startsWith(String prefix, int toffset)` | 从指定位置开始是否以参数字符串开头。       |
| `boolean endsWith(String suffix)`                | 判断字符串是否以参数字符串结尾。           |

2、代码示例

```java
package cn.guardwhy_08;

public class StringManyMethodTest07 {
    public static void main(String[] args) {
        // 1.构造String类型的对象并打印
        String str1 = new String("     Let Me Give You Some Color To See See!");
        System.out.println("str1=" + str1); //      Let Me Give You Some Color To See See!

        // 2.实现各种成员方法的调用和测试
        boolean b1 = str1.contains("some");
        System.out.println("b1=" + b1); // false  区分大小写
        b1 = str1.contains("Some");
        System.out.println("b1 = " + b1); // true

        System.out.println("-----------------------");
        // 将所有字符串转换为大写  小写  以及去除两边的空白字符
        String str2 = str1.toUpperCase();
        System.out.println("str2 = " + str2); //    LET ME GIVE YOU SOME COLOR TO SEE SEE!
        System.out.println("str1 = " + str1); //    Let Me Give You Some Color To See See!

        String str3 = str1.toLowerCase();
        System.out.println("str3 = " + str3); //    let me give you some color to see see!
        System.out.println("str1 = " + str1); //    Let Me Give You Some Color To See See!

        String str4 = str1.trim();
        System.out.println("str4 = " + str4); //Let Me Give You Some Color To See See!

        System.out.println("----------------------------------------------");
        // 判断字符串是否以...开头  以...结尾
        b1 = str1.startsWith("Let");
        System.out.println("b1 = " + b1); // false
        b1 = str1.startsWith(" ");
        System.out.println("b1 = " + b1); // true
        // 从下标5开始是否以"Let"开头
        b1 = str1.startsWith("Let", 5);
        System.out.println("b1 = " + b1); // true

        b1 = str1.endsWith("See");
        System.out.println("b1 = " + b1); // false
        b1 = str1.endsWith("See!");
        System.out.println("b1 = " + b1); // true
    }
}
```

3、判断字符串内容

| 方法声明                                         | 功能介绍                                                     |
| ------------------------------------------------ | ------------------------------------------------------------ |
| `boolean equals(Object anObject)`                | 用于比较字符串内容是否相等并返回                             |
| `int hashCode()`                                 | 获取调用对象的哈希码值                                       |
| `boolean equalsIgnoreCase(String anotherString)` | 用于比较字符串内容是否相等并返回，不考虑大小写，如：`'A'`和`'a'`是相等 |

4、代码示例

```java
package cn.guardwhy_08;

import java.util.Scanner;

public class StringEqualsTest08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            // 1.提示用户从键盘输入用户名和密码信息并使用变量记录
            System.out.println("请输入您的用户名：");
            String userName = sc.next();
            System.out.println("请输入您的密码：");
            String password = sc.next();

            // 2.判断用户名和密码
            // 防止空指针异常
            if ("admin".equalsIgnoreCase(userName) && "123".equals(password)) {
                System.out.println("登录成功，欢迎使用！");
                break;
            }
            if (1 == i) {
                System.out.println("账户已冻结，请联系客服人员！");
            } else {
                System.out.println("用户名或密码错误，您还有" + (i - 1) + "次机会！");
            }

        }
        // 关闭扫描器
        sc.close();
    }
}
```

### 11.3 StringBuffer 类

#### 11.3.1 基本介绍

1、`java.lang.StringBuffer`代表可变的字符序列，可以对字符串内容进行增删。

2、很多方法与String相同，==但StringBuffer是可变长度的。StringBuffer是一个容器==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210925133355.png" style="zoom: 67%;" />

3、源码分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210925130104.png" style="zoom:80%;" />

```java
/*
 * 1.1 StringBuffer是final类。
 * 1.2 实现了Serializable接口，可以保存到文件，或者网络传输
 * 1.3 继承了抽象类AbstractStringBuilder
 * 1.4 AbstractStringBuilder属性 char[] value,存放的字符序列
 */
public final class StringBuffer
    extends AbstractStringBuilder
    implements java.io.Serializable, CharSequence{
}
```

#### 11.3.2 String 与 StringBuffer区别

1、StringBuffer类基本特点

- `StringBuffer` 的直接父类 是 `AbstractStringBuilder`。`StringBuffer` 实现了 `Serializable`, 即`StringBuffer`的对象可以串行化。

* 在父类中`AbstractStringBuilder`有属性`char[] value`,不是`final`，该`value`数组存放字符串内容引出存放在堆中的。
* `StringBuffer`是一个`final`类，不能被继承，因为`StringBuffer`字符内容是存在 `char[] value`，所有在变化(增加/删除)。

2、两者区别

- `String`保存的是字符串常量，里面的值不能更改，每次`String`类的更新实际上就是更改地址，效率较低。
- `StringBuffer`保存的是字符串变量，里面的值可以更改，每次`StringBuffer`的更新实际上可以更新内容，不用每次更新地址，效率较高。

3、两者转换

在开发中，经常需要将`String`和`StringBuffer`进行转换，代码实现操作。

```java
package cn.stringbuffer.demo01;

public class StringBuffer02 {
    public static void main(String[] args) {
        //1、String——>StringBuffer
        String str = "hello guardwhy";
        //1.1方式1 使用构造器，注意:返回的才是StringBuffer对象，对str本身没有影响
        StringBuffer str1 = new StringBuffer(str);
        System.out.println("str1的值:" + str1);   // str1的值:hello guardwhy
        //1.2 方式2 使用的是append方法
        StringBuffer str2 = new StringBuffer();
        str2 = str2.append(str);
        System.out.println("str2的值:" + str2);   // str2的值:hello guardwhy

        System.out.println("==========");

        //2、StringBuffer ->String
        StringBuffer sb1 = new StringBuffer("curry，小学生");
        //2.1 方式1 使用StringBuffer提供的 toString方法
        String sb2 = sb1.toString();
        System.out.println("sb2的值:" + sb2); // sb2的值:curry，小学生
        //2.2 方式2: 使用构造器来搞定
        String sb3 = new String(sb2);
        System.out.println("sb3的值:" + sb3); // sb3的值:curry，小学生
    }
}
```

#### 11.3.3 StringBuffer构造器

1、StringBuffer构造器参数

| 方法声明                         | 功能介绍                                                     |
| -------------------------------- | ------------------------------------------------------------ |
| `StringBuffer()`                 | 构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。 |
| `StringBuffer(CharSequence seq)` | 构造一个字符串缓冲区，它包含与指定的  `CharSequence` 相同的  |
| `StringBuffer(int capacity)`     | 用于比较字符串内容是否相等并返回，不考虑大小写，如：`'A'`和`'a'`是相等 |
| `StringBuffer(String str)`       | 构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。   |

2、代码示例

```java
package cn.stringbuffer.demo01;

public class StringBuffer03 {
    public static void main(String[] args) {
        
        //1. 创建一个大小为 16的char[] ,用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();
        //2 通过构造器指定 char[] 大小
        StringBuffer stringBuffer1 = new StringBuffer(100);
        //3. 通过给一个String 创建 StringBuffer, char[]大小就是 str.length() + 16
        StringBuffer hello = new StringBuffer("hello");
    }
}
```

#### 11.3.4 StringBuffer类方法

1、`StringBuffer`常见方法，代码示例

```java
package cn.stringbuffer.demo01;

public class StringBuffer04 {
    public static void main(String[] args) {
        // 1.0 创建s1对象
        StringBuffer s1 = new StringBuffer("hello");
        //1.1 添加操作
        s1.append(',');
        s1.append("curry");
        s1.append(",小学生").append(", ").
                append(100).append(", ").
                append(true).append(", ").
                append(10.5);
        System.out.println("添加操作:" + s1); // 添加操作:hello,curry,小学生, 100, true, 10.5

        //2.1 删除操作，删除索引为>=start && <end 处的字符
        // 删除 11~14的字符 [11, 14)
        s1.delete(11, 14);
        System.out.println("删除操作:" + s1);// 删除操作:hello,curry生, 100, true, 10.5

        //3.1 修改操作使用java替换索引0-4的字符
        s1.replace(0, 4, "java");
        System.out.println("修改操作:" + s1); // 修改操作:javao,curry生, 100, true, 10.5

        //4.1 查找指定的子串在字符串第一次出现的索引，如果找不到返回-1
        int indexOf = s1.indexOf("curry");
        System.out.println("查找的索引值:" + indexOf); // 查找的索引值:6

        //5.1 插在索引为11的位置插入“大学",原来索引为11的内容自动后移
        s1.insert(11, "大学");
        System.out.println("插入操作:" + s1); // 插入操作:javao,curry大学生, 100, true, 10.5

        // 6.1 获取字符串的长度
        System.out.println("该字符串的长度:" + s1.length()); // 该字符串的长度:31
    }
}
```

#### 11.3.5 经典案例

1、看看下面代码，输出什么结果?

```java
package cn.stringbuffer.demo02;

public class StringBufferExercise01 {
    public static void main(String[] args) {
        // 1.1 创建str变量
        String str = null;
        // 1.2 创建sb对象
        StringBuffer sb = new StringBuffer();
        //1.3 底层调用的是AbstractStringBuilder的appendNull
        sb.append(str);
        System.out.println(sb.length());//4
        System.out.println(sb);//null

        //2.1 下面的构造器，会抛出NullpointerException
        StringBuffer sb1 = new StringBuffer(str);//底层源码 super(str.length() + 16);
        System.out.println(sb1);
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210925195356.png)

### 11.4 StringBuilder类

#### 11.4.1 基本概念

1、基本介绍

`StringBuilder` 是一个可变的字符串类，可以把它看成是一个容器，这里的可变指的是`StringBuilder`对象中的内容是可变的。`StringBuilder`位于`java.lang`包下，不需要导包。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210925204529.png)

2、相关源码分析	

```java
package cn.stringbuffer.demo02;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        * 1. StringBuilder继承AbstractStringBuilder类
        * 2. 实现了 Serializable ,说明StringBuilder对象是可以串行化(对象可以网络传输,可以保存到文件)
        * 3. StringBuilder 是final类, 不能被继承
        * 4. StringBuilder 对象字符序列仍然是存放在其父类 AbstractStringBuilder的 char[] value; 因此，字符序列是堆中
        * 5.StringBuilder 的方法，没有做互斥的处理,即没有synchronized 关键字,因此在单线程的情况下使用StringBuilder
        */
        StringBuilder stringBuilder = new StringBuilder();
    }
}
```

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210925212006.png" style="zoom:80%;" />	

3、StringBuilder特点

- `StringBuilder`很适合做字符串的拼接操作，性能好, 建议使用！
- `StringBuilder`线程不安全的，性能好！

#### 11.4.2  StringBuilder构造器

1、基本构造方法

| 方法声明                      | 功能介绍                                              |
| ----------------------------- | ----------------------------------------------------- |
| `StringBuilder()`             | 使用无参方式构造对象，容量为16                        |
| `StringBuilder(int capacity)` | 根据参数指定的容量来构造对象，容量为参数指定大小      |
| `StringBuilder(String str)`   | 根据参数指定的字符串来构造对象，容量为：16+字符串长度 |

2、代码示例

```java
package cn.guardwhy_09;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        // 1.使用无参方式构造StringBuilder类型的对象并打印容量和长度
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1 = " + sb1); // 自动调用toString方法 啥也没有
        System.out.println("容量是：" + sb1.capacity()); // 16
        System.out.println("长度是：" + sb1.length()); // 0
        System.out.println("-----------------------");

        // 2.使用参数指定的容量来构造对象并打印容量和长度
        StringBuilder sb2 = new StringBuilder(20);
        // 自动调用toString方法 啥也没有
        System.out.println("sb2 = " + sb2);
        System.out.println("容量是：" + sb2.capacity()); // 20
        System.out.println("长度是：" + sb2.length()); // 0
        System.out.println("----------------------");

        // 3.根据参数指定的字符串内容来构造对象并打印容量和长度
        StringBuilder sb3 = new StringBuilder("hello");
        // 自动调用toString方法  hello
        System.out.println("sb3 = " + sb3);
        System.out.println("容量是：" + sb3.capacity()); // 16 + 5 = 21
        System.out.println("长度是：" + sb3.length()); // 5
        System.out.println("-----------------------");
        String str1 = new String("hello");
        // 转换成大写
        String str2 = str1.toUpperCase();
        System.out.println("str2 = " + str2); // HELLO
        System.out.println("str1 = " + str1); // hello  字符串本身是个常量不会改变
    }
}
```

#### 11.4.3  StringBuilder成员方法

1、基本成员方法

注意: 作为参数传递的话，方法内部`String`不会改变其值，`StringBuffer`和`StringBuilder`会改变其值。

| 方法声明                                                | 功能介绍                                    |
| ------------------------------------------------------- | ------------------------------------------- |
| `int capacity()`                                        | 用于返回调用对象的容量                      |
| `int length()`                                          | 用于返回字符串的长度，也就是字符的个数      |
| `StringBuilder insert(int offset, String str)`          | 插入字符串并返回调用对象的引用，就是自己。  |
| `StringBuilder append(String str)`                      | 追加字符串                                  |
| `StringBuilder deleteCharAt(int index)`                 | 将当前字符串中下标为index位置的单个字符删除 |
| `StringBuilder delete(int start，int end)`              | 删除字符串                                  |
| `StringBuilder replace(int start，int end，String str)` | 替换字符串                                  |
| `StringBuilder reverse()`                               | 字符串反转                                  |

2、代码示例

```java
package cn.guardwhy_09;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        String name = "guardwhy";
        name += "欢迎";
        name += "您！";
        System.out.println(name);	// guardwhy欢迎您！

        StringBuilder sb = new StringBuilder();
        // 拼接字符串！！
        sb.append("guardwhy");
        sb.append("欢迎");
        sb.append("您！");
      	// System.out.println(sb.toString());
        System.out.println(sb);	// guardwhy欢迎您！

        // StringBuilder支持链式编程。
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Java").append("是世界上").append("最牛逼").append("的语言！");
        String rs = sb1.toString();
        System.out.println(rs);	// Java是世界上最牛逼的语言！
    }
}
```

3、StringBuilder和String相互转换

```java
package cn.guardwhy_09;
/*
StringBuilder和String相互转换
*/
public class StringBuilderTest3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("hello").append(" world");

        // 1. StringBuilder 转 String
        String s  = sb1.toString();
        System.out.println(s);  // hello world

        // 2. String 转 StringBuilder
        String str = "hello java";
        StringBuilder sb2 = new StringBuilder(str);
        System.out.println(sb2); // hello java
    }
}
```

4、StringBuilder删除字符

```java
package cn.guardwhy_09;

public class StringBuilderTest4 {
    public static void main(String[] args) {
        // 1.创建sb对象
        StringBuilder sb = new StringBuilder("abcd1234helloABCDworld");
        // 2.表示删除下标为8的单个字符
        sb.deleteCharAt(8);
        System.out.println("sb(删除下标为8):" +sb); // sb(删除下标为8):abcd1234elloABCDworld

        //3.使用for循环删除多个字符
        for (int i = 8; i < 12; i++) {
            // 始终删除下标为8的字符
            sb.deleteCharAt(8);
        }
        System.out.println("sb(删除下标8~12)："+sb); // sb(删除下标8~12)：abcd1234ABCDworld
        System.out.println("------------------------");

        // 4. 删除起始字符串abcd，包含0但不包含4
        sb.delete(0, 4);
        System.out.println("sb(删除0,4下标)=" +sb); // sb(删除0,4下标)=1234ABCDworld

        // 5. 删除中间字符串
        sb.delete(4, 8);
        System.out.println("sb(删除4,8下标) = " + sb); // sb(删除4,8下标) = 1234world

        // 6. 删除末尾字符串
        sb.delete(4, sb.length());
        System.out.println("sb(删除末尾字符串) = " + sb); // sb(删除末尾字符串) = 1234
        System.out.println("------------------------");
    }
}
```

5、StringBuilder内容的修改

```java
package cn.guardwhy_09;
/*
    实现字符串内容的修改、查找以及反转操作
*/
public class StringBuilderTest5 {
    public static void main(String[] args) {
        // 1.创建sb对象
        StringBuilder sb = new StringBuilder("1234");
        // 2.表示将下标为0这个位置的字符修改为'a'
        sb.setCharAt(0, 'a');
        System.out.println("修改单个字符后的内容是：" + sb); // a234
        // 3.修改"234"为"bcd"
        sb.replace(1, 4, "bcd");
        System.out.println("修改字符串后的结果是：" + sb); // abcd
        // 4.实现查找的功能
        int pos = sb.indexOf("b");
        System.out.println("从前向后查找的结果是：" + pos); // 1
        pos = sb.lastIndexOf("b");
        System.out.println("从后向前查找的结果是：" + pos); // 1
        // 5.实现字符串的反转功能
        sb.reverse();
        System.out.println("反转后的结果是：" + sb); // dcba
    }
}
```

#### 11.4.1 三者比较

- `String`是内容是固定的类，进行`String`的拼接其实是创建新的字符串对象。`String`类是不适合做字符串拼接的，`String`做字符串拼接操作性能比较差，会产生大量的垃圾对象。`String`不可变字符序列，效率低，但是复用率高。
- `StringBuffer`是内容可变的类，可以动态进行字符串内容的拼接。`StringBuffer`是可变字符序列、效率较高(增删)、线程安全。
-  `StringBuilder`: 可变字符序列、效率最高、线程不安全。`StringBuilder`和`StringBuffer`非常类似，均代表可变的字符序列，而且方法也一样。

#### 11.4.2 小结

1、String使用注意说明

`String s="a"; `【创建了一个字符串`s += "b"; `】实际上原来的`"a"`字符串对象已经丢弃了，现在又产生了一个字符串`s+"b"`【`(也就是"ab")`】。==如果多次执行这些改变串内容的操作，会导致大量副本字符串对象存留在内存中，降低效率。如果这样的操作放到循环中，会极大影响程序的性能==。结论:如果对`String`做大量修改，不要使用`String`！！！

2、三者效率比较: `StringBuilder` > `StringBuffer` > `String`

```java
package cn.stringbuffer.demo02;

public class StringBuilder02 {
    public static void main(String[] args) {
        // 1.1 开始时间
        long startTime = 0L;
        // 1.2 结束时间
        long endTime = 0L;
        StringBuffer buffer = new StringBuffer("");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));

        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));


        String text = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210925220920.png" style="zoom:80%;" />	

3、`String`、`StringBuffer` 和 `StringBuilder` 的选择，使用的原则，结论:

- 如果字符串存在大量的修改操作，一般使用`StringBuffer`或`StringBuilder`。
- 如果字符串存在大量的修改操作，并在单线程的情况，使用`StringBuilder`。
- 如果字符串存在大量的修改操作，并在多线程的情况，使用`StringBuffer`。
- 如果字符串很少修改，被多个对象引用，使用`String`，比如配置信息等。

### 11.5 Math 类

#### 11.5.1 基本介绍

Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。

#### 13.7.2 静态方法

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210925223341.png" style="zoom: 67%;" />	

#### 13.7.3 Math类方法实现

1、静态方法实现

```java
package cn.math.demo01;

public class MathMethod {
    public static void main(String[] args) {
        //1.1 abs 绝对值
        int abs = Math.abs(-9);
        System.out.println("绝对值:" + abs);//9

        //1.2 pow 求幂, 2的4次方
        double pow = Math.pow(2, 4);
        System.out.println("求幂操作:" + pow);//16

        //1.3 ceil 向上取整,返回>=该参数的最小整数(转成double);
        double ceil = Math.ceil(3.9);
        System.out.println("向上取整:" + ceil);//4.0

        //1.4.floor向下取整，返回<=该参数的最大整数(转成double)
        double floor = Math.floor(4.001);
        System.out.println("向下取整:" + floor);//4.0

        //1.5.round四舍五入Math.floor(该参数+0.5)
        long round = Math.round(5.51);
        System.out.println("四舍五入:" + round);//6

        //1.6.sqrt 求开方
        double sqrt = Math.sqrt(9.0);
        System.out.println("开方操作:" + sqrt);//3.0

        /**
         * 1.7.random 求随机数
         * 请写出获取 a-b之间的一个随机整数,a,b均为整数 ，比如 a = 2, b=7
         * 公式就是(int)(a + Math.random() * (b-a +1) )
         */
        System.out.print("求随机数:" + "[");
        for(int i = 0; i < 10; i++) {
            System.out.print((int)(2 +  Math.random() * (7 - 2 + 1)) + " ");
        }
        System.out.println("]");

        //1.8 min求两个数的最小值
        int min = Math.min(1, 9);
        // 1.9 max求两个数的最大值
        int max = Math.max(45, 90);
        System.out.println("两个数最小值min=" + min);
        System.out.println("两个数最大值max=" + max);
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210926112836.png" style="zoom:80%;" />	

### 11.6 Arrays 类

`Arrays`里面包含了一系列静态方法，用于管理或操作数组(比如排序和搜索)。

#### 11.6.1 toString 方法

1、调用`toString`方法，实现数组遍历，代码实现

```java
package cn.arrays.demo01;

import java.util.Arrays;

public class ArraysMethod01 {
    public static void main(String[] args) {
        // 1.1 创建integers数组
        Integer[] integers = {1, 20, 90};
        //1.1 遍历数组
        System.out.print("遍历数组(传统方式):" + "["+ integers[0]);
        for(int i = 1; i < integers.length; i++) {
            System.out.print(", " + integers[i]);
        }
        System.out.println("]");
        //1.2 直接使用Arrays.toString方法，显示数组
        System.out.println("遍历数组(Arrays):" + Arrays.toString(integers));
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210926133838.png" style="zoom:80%;" />	

#### 11.6.2 sort排序方法

1、调用`sort()`方法，实现数组排序，代码实现

```java
package cn.arrays.demo01;

import java.util.Arrays;
/**
 * 1.1可以直接使用冒泡排序,也可以直接使用Arrays提供的sort方法排序
 * 1.2 因为数组是引用类型，所以通过sort排序后,会直接影响到实参arr
 */
public class ArraysMethod02 {
    public static void main(String[] args) {
        // 1.1 创建array数组
        int arr[] = {1, -1, 7, 0, 89};
        // 遍历数组
        System.out.print("排序前:" + "[" + arr[0]);
        for (int i=1; i<arr.length; i++){
            System.out.print(", " + arr[i]);
        }
        System.out.println("]");

        // 1.3 排序后
        Arrays.sort(arr);
        System.out.println("排序后:" + Arrays.toString(arr));
    }
}
```

2、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210926144417.png)	

3、通过传入一个接口 `Comparator` 实现定制排序，代码示例

```java
package cn.arrays.demo01;

import java.util.Arrays;
import java.util.Comparator;
/**
 *sort重载的，也可以通过传入一个接口 Comparator 实现定制排序
 *调用定制排序时，传入两个参数(1)排序的数组arr
 *实现了Comparator接口的匿名内部类 ,要求实现 compare方法
 */
public class ArraysMethod03 {
    public static void main(String[] args) {

        /** 源码分析
        1.1 Arrays.sort(arr, new Comparator()
        1.2 最终到 TimSort类的 private static <T> void binarySort(T[] a, int lo, int hi, int start,
                                               Comparator<? super T> c)()
        1.3 执行到 binarySort方法的代码, 会根据动态绑定机制 c.compare()执行传入的匿名内部类的 compare ()
             while (left < right) {
                        int mid = (left + right) >>> 1;
                        if (c.compare(pivot, a[mid]) < 0)
                            right = mid;
                        else
                            left = mid + 1;
                    }
            new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        Integer i1 = (Integer) o1;
                        Integer i2 = (Integer) o2;
                        return i2 - i1;
                     }
            }
        1.4 public int compare(Object o1, Object o2) 返回的值>0 还是 <0
            会影响整个排序结果, 这就充分体现了 接口编程+动态绑定+匿名内部类的综合使用
            将来的底层框架和源码的使用方式，会非常常见
        */

        // 2.1 创建arr数组
        Integer arr[] = {1, -1, 7, 0, 89};

        // 遍历数组
        System.out.print("数组排序前(默认):" + "[" + arr[0]);
        for (int i=1; i<arr.length; i++){
            System.out.print(", " + arr[i]);
        }
        System.out.println("]");
        // 2.2 调用sort方法排序
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });

        System.out.println("数组排序后:(从大到小)" + Arrays.toString(arr));
    }
}
```

4、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210926144417.png" style="zoom:67%;" />	

5、使用冒泡+定制排序，代码示例。

```java
package cn.arrays.demo01;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod04 {
    public static void main(String[] args) {
        // 1.1 定义数组
        int[] arr = {1, -1, 8, 0, 20};
        // 1.2 调用method01方法
        method01(arr);
        System.out.println("冒泡排序:" + Arrays.toString(arr));

        // 1.3调用method02
        method02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer)o1;
                int i2 = (Integer)o2;
                return i2 - i1;
            }
        });
        System.out.println("冒泡+定制排序:" + Arrays.toString(arr));
    }



    //2.1 使用冒泡完成排序
    private static void method01(int[] arr) {
        // 2.2 定义临时变量
        int temp = 0;
        for(int i=0; i <arr.length-1; i++){
            for(int j=0; j<arr.length - 1 -i; j++){
                // 2.3 从小到大排序
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // 2.2 使用冒泡+定制
    private static void method02(int[] arr, Comparator c) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //数组排序由 c.compare(arr[j], arr[j + 1])返回的值决定
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
```

6、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210926153720.png" style="zoom:80%;" />	

#### 11.6.3  二分搜索法查找

1、`binarySearch()`方法通过二分搜索法进行查找，要求数组必须是有序的，代码示例。

```java
package cn.arrays.demo02;

import java.util.Arrays;

public class ArraysMethod01 {
    public static void main(String[] args) {
        // 1.1 定义arr数组
        Integer[] arr = {1, 2, 90, 123, 567};
        //1.2使用 binarySearch二叉查找，要求该数组是有序的. 如果该数组是无序的，不能使用binarySearch
        //1.3如果数组中不存在该元素，就返回 return -(low + 1);  // key not found.
        int index = Arrays.binarySearch(arr, 567);
        System.out.println("index=" + index);   // index=4
    }
}
```

#### 11.6.4 数组元素复制

1、`copyOf()`方法数组元素的复制，代码示例。

```java
package cn.arrays.demo02;

import java.util.Arrays;

public class ArraysMethod01 {
    public static void main(String[] args) {
        // 1.1 定义arr数组
        Integer[] arr = {1, 2, 90, 123, 567};
        /**
         * 1. 从 arr 数组中，拷贝 arr.length个元素到 newArr数组中
         * 2. 如果拷贝的长度 > arr.length 就在新数组的后面 增加 null
         * 3. 如果拷贝长度 < 0 就抛出异常NegativeArraySizeException
         * 4. 该方法的底层使用的是 System.arraycopy()
         */
        Integer[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println("数组复制:" + Arrays.toString(newArr));	// 数组复制:[1, 2, 90, 123, 567]
    }
}
```

#### 11.6.5 其他方法

1、`fill()`方法数组元素的填充，代码示例。

```java
package cn.arrays.demo02;

import java.util.Arrays;

public class ArraysMethod02 {
    public static void main(String[] args) {
        //1.1 fill数组元素的填充
        Integer[] num = new Integer[]{9,3,2};
        //1.2 使用99去填充 num数组，可以理解成是替换原理的元素
        Arrays.fill(num, 99);
        System.out.println("==num数组填充后==");
        System.out.println("数组填充后:" + Arrays.toString(num));    // 数组填充后:[99, 99, 99]
    }
}
```

2、`equals()`方法比较两个数组元素内容是否完全一致，代码示例

```java
package cn.arrays.demo02;

import java.util.Arrays;

public class ArraysMethod02 {
    public static void main(String[] args) {
        // 1.1 定义两个数组
        Integer[] arr1 = {1, 2, 90, 123, 567};
        Integer[] arr2 = {1, 2, 90, 123};
        //1.2 equals 比较两个数组元素内容是否完全一致
        boolean equals = Arrays.equals(arr1, arr2);
        //1.3 如果arr和 arr2 数组的元素一样，则方法true;如果不是完全一样，就返回 false
        System.out.println("数组内容是否相等:" + equals); // 数组内容是否相等:false
    }
}
```

3、`asList()` 将一组值，转换成`list`，代码示例

```java
package cn.arrays.demo02;

import java.util.Arrays;
import java.util.List;

public class ArraysMethod02 {
    public static void main(String[] args) {

        //1.1 asList方法，会将 (2,3,4,5,6,1)数据转成一个List集合
        //1.2 返回的list1编译类型 List(接口)
        //1.3 list1运行类型 java.util.Arrays#ArrayList, 是Arrays类的
        //   静态内部类 private static class ArrayList<E> extends AbstractList<E>
        //            implements RandomAccess, java.io.Serializable
        List list1 = Arrays.asList(2,3,4,5,6,1);
        System.out.println("List集合:" + list1); // List集合:[2, 3, 4, 5, 6, 1]
        System.out.println("list1的运行类型:" + list1.getClass()); // list1的运行类型:class java.util.Arrays$ArrayList
    }
}
```

#### 11.6.6 案例分析

1、自定义`Book`类，里面包含`name`和`price`,按`price`排序(从大到小)，要求使用两种方式排序,有一个`Book[] books = 4`本书对象。

```java
package cn.arrays.demo02;

import java.util.Arrays;
import java.util.Comparator;

// 1.1 创建Book类
class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class ArraysMethod03 {
    public static void main(String[] args) {
        // 2.0 创建books数组对象
        Book[] books = new Book[4];
        books[0] = new Book("大话数据结构", 100);
        books[1] = new Book("现代操作系统", 90);
        books[2] = new Book("Java编程并发艺术", 50);
        books[3] = new Book("java从入门到放弃~", 10);

        //2.1 price从大到小
        /*
            Arrays.sort(books, new Comparator() {
                //这里是对Book数组排序，因此 o1和o2就是Book对象
                @Override
                public int compare(Object o1, Object o2) {
                    Book book1 = (Book) o1;
                    Book book2 = (Book) o2;
                    double priceVal = book2.getPrice() - book1.getPrice();
                    //这里进行了一个转换如果发现返回结果和输出的不一致，就修改一下返回的1和 -1
                    if(priceVal > 0) {
                        return  1;
                    } else  if(priceVal < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            });
        */

        //2.2 price从小到大
        /*
            Arrays.sort(books, new Comparator() {
                //这里是对Book数组排序，因此o1和o2就是Book对象
                @Override
                public int compare(Object o1, Object o2) {
                    Book book1 = (Book) o1;
                    Book book2 = (Book) o2;
                    double priceVal = book2.getPrice() - book1.getPrice();
                    //这里进行了一个转换如果发现返回结果和输出的不一致，就修改一下返回的1和 -1
                    if(priceVal > 0) {
                        return  -1;
                    } else  if(priceVal < 0) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            });
        */

        //2.3 按照书名长度从大到小
        Arrays.sort(books, new Comparator() {
            //这里是对Book数组排序，因此o1和o2就是Book对象
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                //要求按照书名的长度来进行排序
                return book2.getName().length() - book1.getName().length();
            }
        });
        System.out.println("books数组:" + Arrays.toString(books));
        // books数组:[Book{name='java从入门到放弃~', price=10.0}, 
        // Book{name='Java编程并发艺术', price=50.0}, 
        // Book{name='大话数据结构', price=100.0}, 
        // Book{name='现代操作系统', price=90.0}]
    }
}
```

### 11.7 System 类

#### 11.7.1 基本概念

- `Java.lang.System`类中提供了一些有用的类字段和方法。
- `System`代表了当前系统。

#### 11.7.2 常用方法

1、基本方法

| 方法声明                                                     | 功能介绍                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| `public static long currentTimeMillis()`                     | 返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。 |
| `public static void exit(int status)`                        | 终止当前正在运行的 `Java` 虚拟机*，*0代表正常结束，非0代表异常结束！！ |
| `public static void arraycopy(Object src , int srcPos ,Object dest, int destPos,int length)` | 数组拷贝，数组复制。                                         |

2、相关方法代码示例

```java
package cn.guardwhy_05;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class SystemDemo08 {
    public static void main(String[] args) {
        // 得到此刻时间毫秒值
        long time = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("格式化时间:" + sdf.format(time));    // 格式化时间:2020/09/17 19:08:10

        // 终止当前正在运行的Java虚拟机。参数用作状态码.根据惯例,非0的状态码表示异常终止。
        // System.exit(0);

        // 数组拷贝
        int[] arr1 = new int[]{10, 20, 30, 40, 50, 60};
        int[] arr2 = new int[6];

        /**
         * arraycopy(Object src,   参数一：原数组
         *           int  srcPos,  参数二：从哪个元素索引位置开始复制。
         *           Object dest,  参数三：目标数组
         *           int destPos,  参数四：复制到目标数组的哪个位置开始！
         *           int length)   参数五：复制多少个元素
         */
        System.arraycopy(arr1, 0, arr2, 0, 5);
        System.out.println("arr2数组元素:" + Arrays.toString(arr2));

        System.out.println("程序结束....");
    }
}
```

3、执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/29-mysql.png"  />

### 11.8 第一代日期类

#### 11.8.1 Date类

1、基本概念

`Java.util.Date`类主要用于描述特定的瞬间，也就是年月日时分秒，可以精确到毫秒。

2、`Date`日期基本方法

| 方法声明                | 功能介绍                                                     |
| ----------------------- | ------------------------------------------------------------ |
| Date()                  | 使用无参的方式构造对象，也就是当前系统时间                   |
| Date(long date)         | 根据参数指定毫秒数构造对象， 参数为距离1970年1月1日0时0分0秒的毫秒数 |
| long getTime()          | 获取调用对象距离1970年1月1日0时0分0秒的毫秒数                |
| void setTime(long time) | 设置调用对象为距离基准时间time毫秒的时间点                   |

3、相关方法，代码示例。

```java
package cn.guardwhy_05;

import java.util.Date;

/**
Date类代表了：当前系统的当前此刻日期信息对象。

Date类的API详情：
     a.包 java.util.Date 需要导入包的。
     b.常用构造器：
     -- public Date()
     -- public Date(long time)
     c.方法
     -- public long getTime()：返回从1970-01-01 00:00:00走到此刻的总的时间毫秒值。1000ms = 1s
Java记录时间的两种方式:
     1.可以直接用Date日期类对象记录：Date d = new Date();
     2.可以直接使用时间毫秒值：从1970-01-01 00:00:00走到此刻的总的时间毫秒值

总结：
     当前此刻日期对象：Date
     表示此刻时间的两种形式:
     -- Date d = new Date()
     -- long time = d.getTime(); 使用时间毫秒值
 */
public class DateDemo01 {
    public static void main(String[] args) {
        // 1.创建一个日期对象
        Date d = new Date();
        // 输出当前系统此刻日期时间信息
        System.out.println(d);  // hu Sep 17 15:20:52 CST 2020

        // 2.获取当前系统此刻时间毫秒值
        long time = d.getTime();
        System.out.println(time);   // 1600327441960
    }
}
```

4、时间运算，相关代码实现

```java
package cn.guardwhy_05;

import java.util.Date;

/**
 时间毫秒值可以用于做时间的运算。
 */
public class DateDemo02 {
    public static void main(String[] args) {
        // 1.提取此刻当前时间的毫秒值
        Date d1 = new Date();
        long startTime = d1.getTime();

        for(int i=0; i<1000; i++){
            System.out.println(i);
        }

        //2.再提取执行完毕以后的当前时间的时间毫秒值
        Date d2 = new Date();
        long endTime = d2.getTime();

        // 3.输出性能时间
        System.out.println("耗时:" + (endTime - startTime) / 1000.0); // 耗时:0.006
    }
}
```

5、有参数构造器，代码实现

```java
package cn.guardwhy_05;

import java.util.Date;

/**
 Date日期类的有参数构造器的使用。
 public Date(long time): 可以把时间毫秒值转换成日期对象。

 Date日期对象 -> getTimer() -> 时间毫秒值
 时间毫秒值  -> public Date(long time) -> Date日期对象

 总结:
    public Date(long time): 可以把时间毫秒值转换成日期对象。
 */
public class DateDemo03 {
    public static void main(String[] args) {
        // 1.拿到此刻当前日期对象
        Date d1 = new Date();
        System.out.println("d1的日期对象:" + d1);    // d1的日期对象:Thu Sep 17 15:45:13 CST 2020

        // 2.拿到此刻的时间毫秒值
        long time = d1.getTime();
        // 3.往后走121s
        time += 121 * 1000;

        // 4.把时间毫秒值转换成日期对象输出
        Date d2 = new Date(time);
        System.out.println("d2的日期对象:" + d2);    // d2的日期对象:Thu Sep 17 15:47:14 CST 2020
    }
}
```

#### 11.8.2 SimpleDateFormat类

1、基本概念

- `java.text.SimpleDateFormat`类主要用于实现日期和文本之间的转换。
- `SimpleDateFormat`格式化和解析日期的具体类，它允许进行格式化(日期->文本)、解析(文本->日期)和规范化。

2、常用方法总结

| 方法声明                           | 功能介绍                                                     |
| ---------------------------------- | ------------------------------------------------------------ |
| `SimpleDateFormat()`               | 使用无参方式构造对象。                                       |
| `SimpleDateFormat(String pattern)` | 根据参数指定的模式来构造对象，模式主要有: `y-年 M-月 d-日 H-时 m-分 s-秒`。 |
| `final String format(Date date)`   | 用于将日期类型转换为文本类型。                               |
| `Date parse(String source)`        | 用于将文本类型转换为日期类型。                               |

3、格式化时间，代码实现

```java
package cn.guardwhy_05;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 DateFormat日期格式化

 DateFormat的作用：
     1.可以把日期对象或者时间毫秒值转换成我们喜欢的字符串时间格式。
     2.也可以把字符串时间解析成日期对象。

 DateFormat:
     包：java.text
     这个类是一个抽象的父类，不能直接使用，我们要用它的子类：SimpleDateFormat

 SimpleDateFormat(简单日期格式化对象):
     a.构造器：public SimpleDateFormat(String pattern):定制格式
     b.方法
     -- public String format(Date d):把日期对象转换成格式化的字符串时间返回
     -- public String format(Object time):把时间毫秒值转换成格式化的字符串时间返回
     -- public Date parse(String time):把字符串的时间解析成日期对象。
 */
public class SimpleDateFormatDemo04 {
    public static void main(String[] args) {
        // 1.得到系统此刻时间
        Date d1 = new Date();
        System.out.println("当前系统此刻日期时间:" + d1); // 当前系统此刻日期时间:Thu Sep 17 16:03:44 CST 2020
        // 2.创建一个简单日期格式化对象用于格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss EEE a");
        // 3.把日期格式化成字符串
        String rs = sdf.format(d1);
        System.out.println("格式化时间:" + rs);  // 格式化时间:2020年09月17 16:06:46 星期四 下午
    }
}
```

### 11.10 第二代日期类

#### 11.10.1 Calendar类

1、基本概念

- `java.util.Calender`类主要用于描述特定的瞬间，取代Date类中的过时方法实现全球化。
- 该类是个抽象类，因此不能实例化对象，其具体子类针对不同国家的日历系统，其中应用最广泛的是`GregorianCalendar`(格里高利历)，对应世界上绝大多数国家/地区使用的标准日历系统。

2、常用的方法

| 方法声明                                                     | 功能介绍                             |
| ------------------------------------------------------------ | ------------------------------------ |
| `static Calendar getInstance()`                              | 用于获取`Calendar`类型的引用         |
| `void set(int year, int month, int date, int hourOfDay, int<minute, int second)` | 用于设置年月日时分秒信息             |
| `Date getTime()`                                             | 用于将`Calendar`类型转换为`Date`类型 |
| `void set(int field, int value)`                             | 设置指定字段的数值。                 |
| `void add(int field, int amount)`                            | 向指定字段增加数值。                 |

3、Calendar类相关方法，代码示例

```java
package cn.guardwhy_05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 Calendar代表的是当前系统此刻时间对应的日历对象。是一个抽象类。

 Calendar创建日历对象的方式：
    -- public static Calendar getInstance()：直接返回一个日期对象。
 Calendar的方法：
     -- public int get(int field)：根据参数取日期信息
     -- public Date getTime() : 拿日期的此刻日期对象
     -- public long getTimeInMillis() : 拿此刻时间毫秒值
     -- public void add(int field, int amount):让日历中的某个信息多走一个值！！
 */
public class CalendarDemo07 {
    public static void main(String[] args) {
        // 1.创建日历对象,得到一个系统的日历对象
        Calendar c1 = Calendar.getInstance();
        System.out.println("日历对象:" + c1);

        // 获取年
        int year = c1.get(Calendar.YEAR);
        System.out.println("年:" + year);
        // 天数
        int days = c1.get(Calendar.DAY_OF_YEAR);
        System.out.println("天数:" + days);

        // 获取日历当前日期对象
        Date d = c1.getTime();
        System.out.println("当前日期对象:" + d);

        // 得到此刻时间毫秒值
        long time = c1.getTimeInMillis();
        System.out.println("此刻时间毫秒值:" + time);

        // 往后走多少时间信息。
        // 问 62天的日期,让日期中一年中的第几天往后多走62天,往后翻62页.
        c1.add(Calendar.DAY_OF_YEAR, 62);
        SimpleDateFormat sdf = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
        System.out.println("时间信息:" + sdf.format(c1.getTimeInMillis()));
    }
}
```

4、执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/30-mysql.png" style="zoom:67%;" />

### 11.11 第三代日期类

`Jdk8`日期类的概述

- `Java 8`通过发布新的`Date-Time API`来进一步加强对日期与时间的处理。
- `java.time`包：该包日期/时间`API`的基础包，`java.time.chrono`包：该包提供对不同日历系统的访问。
- `java.time.format`包：该包能够格式化和解析日期时间对象。`java.time.temporal`包：该包包含底层框架和扩展特性。
- `java.time.zone`包：该包支持不同时区以及相关规则的类。

#### 11.11.1 LocalDate日期类

1、基本概念

`java.time.LocalDate`类主要用于描述年-月-日格式的日期信息，该类不表示时间和时区信息。

2、常用的方法

| 方法声明                 | 功能介绍                           |
| ------------------------ | ---------------------------------- |
| `static LocalDate now()` | 在默认时区中从系统时钟获取当前日期 |

#### 11.11.2 LocalTimer日期类

1、基本概念

`java.time.LocalTime` 类主要用于描述时间信息，可以描述时分秒以及纳秒。

2、常用的方法

| 方法声明                            | 功能介绍                           |
| ----------------------------------- | ---------------------------------- |
| `static LocalTime now()`            | 从默认时区的系统时间中获取当前时间 |
| `static LocalTime now(ZoneId zone)` | 获取指定时区的当前时间             |

#### 11.11.3 LocalDateTime日期类

 1、基本概念

`java.time.LocalDateTime`类主要用于描述`ISO-8601`日历系统中没有时区的日期时间，如`2007-12-03 T10:15:30`。

2、常用的方法

| 方法声明                                                     | 功能介绍                                     |
| ------------------------------------------------------------ | -------------------------------------------- |
| `static LocalDateTime now()`                                 | 从默认时区的系统时间中获取当前日期时间       |
| `static LocalDateTime of(int year, int month, int<br/>dayOfMonth, int hour, int minute, int second)` | 根据参数指定的年月日时分秒信息来设置日期时间 |
| `int getYear()`                                              | 获取年份字段的数值                           |
| `int getMonthValue()`                                        | 获取`1`到`12`之间的月份字段                  |
| `int getDayOfMonth()`                                        | 获取日期字段                                 |

3、第三代日期类，代码示例

```java
package cn.guardwhy_07;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class LocalDateTimeTest {
    public static void main(String[] args) {
        // 1.获取当前日期信息并打印
        LocalDate now = LocalDate.now();
        System.out.println("获取到的当前日期是：" + now);
        // 2.获取当前时间信息并打印
        LocalTime now1 = LocalTime.now();
        System.out.println("获取到的当前时间是：" + now1);
        // 3.获取当前日期时间信息并打印，使用最多
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("获取到的当前日期时间是：" + now2);

        System.out.println("-------------------------------------------------------");
        // 4.使用参数指定的年月日时分秒信息来获取对象并打印
        LocalDateTime of = LocalDateTime.of(2020, 8, 9, 10, 8, 8);
        System.out.println("指定的日期时间是：" + of); // 自动调用toString方法
        System.out.println("获取到的年是：" + of.getYear()); // 2020
        System.out.println("获取到的月是：" + of.getMonthValue()); // 8
        System.out.println("获取到的日是：" + of.getDayOfMonth()); // 9
        System.out.println("获取到的时是：" + of.getHour()); // 10
        System.out.println("获取到的分是：" + of.getMinute()); // 8
        System.out.println("获取到的秒是：" + of.getSecond()); // 8

        System.out.println("-------------------------------------------------------");
        // 5.实现特征的设置并打印
        // 与String类型相似，调用对象本身的数据内容不会改变，返回值相当于创建了一个新的对象，由此证明了不可变性
        LocalDateTime localDateTime = of.withYear(2020);
        System.out.println("localDateTime = " + localDateTime); // 2020-08-08T20:08:08
        System.out.println("of = " + of); // 2020-08-08T20:08:08
        LocalDateTime localDateTime1 = localDateTime.withMonth(12);
        System.out.println("localDateTime1 = " + localDateTime1); // 2020 12 8 20 8 8

        System.out.println("-------------------------------------------------------");
        // 6.实现特征的增加并打印
        LocalDateTime localDateTime2 = localDateTime1.plusDays(2);
        System.out.println("localDateTime2 = " + localDateTime2); // 2020 12 10 20 8 8
        System.out.println("localDateTime1 = " + localDateTime1); // 2020 12 8 20 8 8
        LocalDateTime localDateTime3 = localDateTime2.plusHours(3);
        System.out.println("localDateTime3 = " + localDateTime3); // 2020 12 10 23 8 8

        System.out.println("-------------------------------------------------------");
        // 7.实现特征的减少并打印
        LocalDateTime localDateTime4 = localDateTime3.minusMinutes(1);
        System.out.println("localDateTime4 = " + localDateTime4); // 2020 12 10 23 7 8
        System.out.println("localDateTime3 = " + localDateTime3); // 2020 12 10 23 8 8
        LocalDateTime localDateTime5 = localDateTime4.minusSeconds(3);
        System.out.println("localDateTime5 = " + localDateTime5); // 2020 12 10 23 7 5

    }
}
```

#### 11.11.4 Instant日期类

1、基本概念

`java.time.Instant`类主要用于描述瞬间的时间点信息。

2、常用的方法

| 方法声明                                       | 功能介绍                                                     |
| ---------------------------------------------- | ------------------------------------------------------------ |
| `static Instant now()`                         | 从系统时钟上获取当前时间                                     |
| `OffsetDateTime atOffset(ZoneOffset offset)`   | 将此瞬间与偏移量组合以创建偏移日期时间                       |
| `static Instant ofEpochMilli(long epochMilli)` | 根据参数指定的毫秒数来构造对象，参数为距离1970年1月1<br/>日0时0分0秒的毫秒数 |
| `long toEpochMilli()`                          | 获取距离1970年1月1日0时0分0秒的毫秒数                        |

3、Instant日期类，代码示例

```java
package cn.guardwhy_07;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class InstantTest {

    public static void main(String[] args) {

        // 1.使用Instant类来获取当前系统时间
        Instant now = Instant.now();
        System.out.println("获取到的当前时间为：" + now);

        // 2.加上时区所差的8个小时
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println("偏移后的日期时间为：" + offsetDateTime);

        System.out.println("--------------------------------------------------------");
        // 3.获取当前调用对象距离标准基准时间的毫秒数
        long time = now.toEpochMilli();
        System.out.println("获取到的毫秒差为：" + time);

        // 4.根据参数指定的毫秒数来构造对象
        Instant instant = Instant.ofEpochMilli(time);
        System.out.println("根据参数指定的毫秒数构造出来的对象为：" + instant);
    }
}
```

4、执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/31-mysql.png" style="zoom: 80%;" />

#### 11.11.5 DateTimeFormatter日期类

1、基本概念

`java.time.format.DateTimeFormatter`类主要用于格式化和解析日期。

2、常用的方法

| 方法声明                                             | 功能介绍                       |
| ---------------------------------------------------- | ------------------------------ |
| `static DateTimeFormatter ofPattern(String pattern)` | 根据参数指定的模式来获取对象   |
| `String format(TemporalAccessor temporal)`           | 将参数指定日期时间转换为字符串 |
| `TemporalAccessor parse(CharSequence text)`          | 将参数指定字符串转换为日期时间 |

3、`DateTimeFormatter`日期类，代码示例

```java
package cn.guardwhy_07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatterTest {

    public static void main(String[] args) {

        // 1.获取当前系统的日期时间并打印
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        // 2.按照指定的格式准备一个DateTimeFormatter类型的对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 3.实现日期时间向字符串类型的转换并打印
        String str = dateTimeFormatter.format(now);
        System.out.println("调整格式后的结果是：" + str);
        // 4.实现字符串类型到日期时间类型的转换并打印
        TemporalAccessor parse = dateTimeFormatter.parse(str);
        System.out.println("转回去的结果是：" + parse);
    }
}
```

4、执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/32-mysql.png"  />

### 11.12 案例分析

#### 11.12.1 经典案例一

1、将字符串中指定部分进行反转，比如将`"abcdef"`反转为`"aedcbf"`，编写方法`public static String reverse(String str, int start , int end)`搞定。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210927100430.jpg" style="zoom: 50%;" />	

```java
package cn.homework.demo01;
/**
 * 思路分析
 * 1.1 先把方法定义确定
 * 1.2 把 String转成char[] ，因为char[] 的元素是可以交换的
 */
public class StringDemo01 {
    public static void main(String[] args) {
        //1.1 创建str字符串
        String str = "abcdef";
        System.out.println("交换前字符串:" + str);
        try {
            // 1.2 创建reverse()方法
            str = reverse(str, 1, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("==================");
        System.out.println("交换后字符串:" + str);
    }

    // 2.1 调用reverse()方法
    public static String reverse(String str, int start, int end) {
        // 2.2 条件判断
        if(!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }
        // 2.3 字符串转换成字符数组
        char[] chars = str.toCharArray();
        //2.4 交换辅助变量
        char temp = ' ';
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        //2.5 使用chars 重新构建一个String 返回即可
        return new String(chars);
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210927101652.png" style="zoom:80%;" />	

#### 11.12.2 经典案例二

1、输入用户名、密码、邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象。要求`(1)`用户名长度为`2`或`3`或`4`。`(2)`密码的长度为`6`，要求全是数字 `isDigital`。`(3)` 邮箱中包含`@`和`. `并且`@`在`.`的前面。

```java
package cn.homework.demo01;
/**
 * 思路分析
 *(1) 先编写方法 userRegister(String name, String pwd, String email) {}
 *(2) 针对 输入的内容进行校核，如果发现有问题，就抛出异常，给出提示
 *(3) 单独的写一个方法，判断 密码是否全部是数字字符 boolean
 */
public class StringDemo02 {
    public static void main(String[] args) {
        // 1.1 定义成员name
        String name = "abc";
        // 1.2 定义成员pwd
        String pwd = "123456";
        // 1.2 定义成员email
        String email = "hxy1625309592@aliyun.com";

        try {
            // 1.3 创建注册方法
            userRegister(name,pwd,email);
            System.out.println("恭喜你，注册成功~");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // 2.1 调用注册方法
    public static void userRegister(String name, String pwd, String email) {

        //2.2 判断信息是否为空，
        if(!(name != null && pwd != null && email != null)) {
            throw  new RuntimeException("参数不能为null");
        }
        // 2.3 判断用户名长度
        int userLength = name.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("用户名长度为2或3或4");
        }

        // 2.4 判断用户名密码和长度
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码的长度为6，要求全是数字");
        }

        //2.5 判断邮件相关信息
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱中包含@和. 并且@在.的前面");
        }
    }
    //2.6 判断 密码是否全部是数字字符 boolean
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
```

#### 11.12.3 经典案例三

1、编写`java`程序，输入形式为：`Mao ze Dong`是的人名，以`Dong,Mao .Z`的形式打印出来，其中`.Z`是中间单词的首字母。

```java
package cn.homework.demo01;
/**
 * 思路分析
 * (1) 对输入的字符串进行 分割split(" ")
 * (2) 对得到的String[] 进行格式化String.format（）
 * (3) 对输入的字符串进行校验即可
 */
public class StringDemo03 {
    public static void main(String[] args) {
        // 1.1 创建str字符串
        String name = "Willian Jefferson Clinton";
        // 1.2 创建printName()方法
        printName(name);
    }

    // 2.1 调用printName()方法
    public static void printName(String str) {
        // 2.2 判断是否为空
        if(str == null) {
            System.out.println("str字符串不能为空");
            return;
        }

        // 2.3 分割字符串
        String[] names = str.split(" ");
        if(names.length != 3) {
            System.out.println("输入的字符串格式不对");
            return;
        }

        // 2.4 对输入的字符串进行校验
        String format = String.format("%s,%s .%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println("输出字符串:" + format);  // 输出字符串:Clinton,Willian .J
    }
}
```

#### 11.12.4 经典案例四

1、输入字符串，判断里面有多少个大写字母，多少个小写字母，多少个数字？

```java
package cn.homework.demo01;
/**
 * 思路分析
 * (1) 遍历字符串，如果 char 在 '0'~'9' 就是一个数字
 * (2) 如果 char 在 'a'~'z' 就是一个小写字母
 * (3) 如果 char 在 'A'~'Z' 就是一个大写字母
 * (4) 使用三个变量来记录 统计结果
 */
public class StringDemo04 {
    public static void main(String[] args) {
        // 1.1 创建str字符串
        String str = "abcHsp U 1234";
        // 1.2 创建countStr()方法
        countStr(str);
    }

    // 2.1 调用countStr方法()
    public static void countStr(String str) {
        // 2.2 判断输入字符串是否为空
        if (str == null) {
            System.out.println("输入不能为 null");
            return;
        }
        // 2.3 定义strLen变量
        int strLen = str.length();
        // 2.4 定义数字计数器
        int numCount = 0;
        // 2.5 定义小写字母计数器
        int lowerCount = 0;
        // 2.6 定义大写字母计数器
        int upperCount = 0;
        // 2.7 定义其他字符计数器
        int otherCount = 0;
        // 2.8 条件判断，遍历输出
        for (int i = 0; i < strLen; i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numCount++;
            } else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCount++;
            } else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upperCount++;
            } else {
                otherCount++;
            }
        }

        // 输出相应的字符
        System.out.println("数字有 " + numCount);  // 数字有 4
        System.out.println("小写字母有 " + lowerCount);  // 小写字母有 5
        System.out.println("大写字母有 " + upperCount);  // 大写字母有 2
        System.out.println("其他字符有 " + otherCount);  // 其他字符有 2
    }
}
```

#### 11.12.5 经典案例五

1、阅读下面代码，画出内存图，得出最终结果。

````java
package cn.homework.demo01;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
public class StringDemo05 {
    public static void main(String[] args) {
        String s1 = "guardwhy";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a == b);// false
        // 调用的是Animal的equals方法，没有重写
        System.out.println(a.equals(b)); // false
        System.out.println(a.name == b.name); // true

        String s4 = new String("guardwhy");
        String s5 = "guardwhy";
        System.out.println(s1 == s4);   // false
        System.out.println(s4 == s5);   // false

        String t1 = "hello" + s1;
        String t2 = "helloguardwhy";
        System.out.println(t1.intern() == t2); // true
    }
}
````

2、对应的内存图

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210927144742.jpg" style="zoom: 50%;" />	

## 第12章 集合

### 12.1 集合概述

#### 12.1.1 什么是集合

1、数组特点

- 长度开始时必须指定，而且一旦指定，不能更改。
- 保存的必须为同一类型的元素。
- 使用数组进行增加/删除元素的示意代码-比较麻烦。

2、集合的特点

- 集合是一个容器，容器中的每个数据称为元素，可以动态保存任意多个对象，使用比较方便!

- 集合的类型可以不固定，集合的大小可以随时扩容，集合更像一个气球。
- 提供了一-系列方便的操作对象的方法: `add`、 `remove`、 `set`、` get`等。
- 使用集合添加,删除新元素的示意代码-简洁了。

#### 12.1.2 集合的框架结构

1、基本特点

- Java中集合框架顶层框架是：`java.util.Collection`集合 和 `java.util.Map`集合。
- 其中`Collection`集合中存取元素的基本单位是：单个元素。
- 其中`Map`集合中存取元素的基本单位是：单对元素。

2、框架图

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210927153443.png)

### 12.2 Collection集合

#### 12.2.1 基本概念

- `java.util.Collection`接口是`List`接口、`Queue`接口以及`Set`接口的父接口，因此该接口里定义的方法既可用于操作`List`集合，也可用于操作`Queue`集合和`Set`集合。
- `Collection`类是`Java`中单列集合的祖宗类。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210927155229.png)

#### 12.2.2 Collection集合体系特点

1、`Set`系列集合： 添加的元素，是无序，不重复，无索引的。

- `HashSet`：添加的元素，是无序，不重复，无索引的。
- `LinkedHashSet`：添加的元素，是有序，不重复，无索引的。

2、`List`系列集合：添加的元素，是有序，可重复，有索引的。

- `LinkedList`： 添加的元素，是有序，可重复，有索引的。
- `ArrayList`： 添加的元素，是有序，可重复，有索引的。

#### 12.2.3 常用的方法

1、常见方法总结

| 方法声明                                   | 功能介绍                                        |
| ------------------------------------------ | ----------------------------------------------- |
| `boolean add(E e)`                         | 向集合中添加对象                                |
| `boolean addAll(Collection<? extends E>c)` | 用于将参数指定集合c中的所有元素添加到当前集合中 |
| `boolean contains(Object o)`               | 判断是否包含指定对象                            |
| `boolean containsAll(Collection<?> c)`     | 判断是否包含参数指定的所有对象                  |
| `boolean retainAll(Collection<?> c)`       | 保留当前集合中存在且参数集合中存在的所有对象    |
| `boolean remove(Object o)`                 | 从集合中删除对象                                |
| `boolean removeAll(Collection<?> c)`       | 从集合中删除参数指定的所有对象                  |
| `void clear()`                             | 清空集合                                        |
| `int size()`                               | 返回包含对象的个数                              |
| `boolean isEmpty();`                       | 判断是否为空                                    |
| `boolean equals(Object o)`                 | 判断是否相等                                    |
| `int hashCode()`                           | 获取当前集合的哈希码值                          |
| `Object[] toArray()`                       | 将集合转换为数组                                |

2、添加元素方法，代码示例

```java
package cn.guardwhy_01;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
总结：
 Java中集合的代表是Collection。
 Collection的功能是一切集合都可以直接使用的！！
*/
public class CollectionDemo01 {
    public static void main(String[] args) {
        // 添加元素,是无序,不重复,无索引的
        Collection<String> cs = new HashSet<>();
        // 添加元素
        cs.add("Java");
        cs.add("Java");
        cs.add("Mybatis");
        cs.add("MySQL");
        cs.add("Spring");
        cs.add("Spring");
        cs.add("SSM");
        // 输出集合元素
        System.out.println("HashSet集合元素:" + cs);

        // 添加元素,是有序,可重复,有索引的。
        Collection<String> lists = new ArrayList<>();
        // 添加元素
        lists.add("Java");
        lists.add("Java");
        lists.add("Mybatis");
        lists.add("MySQL");
        lists.add("Spring");
        lists.add("Spring");
        lists.add("SSM");
        // 输出元素集合
        System.out.println("ArrayList集合元素:" + lists);
    }
}
```

3、执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/36-mysql.png" style="zoom: 80%;" />

4、 Collection其他方法，代码示例。

```java
package cn.guardwhy_01;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 Collection集合的功能:

 Collection的API:
     public boolean add(E e) ： 把给定的对象添加到当前集合中 。
     public void clear() :清空集合中所有的元素。
     public boolean remove(E e) : 把给定的对象在当前集合中删除。
     public boolean contains(Object obj) : 判断当前集合中是否包含给定的对象。
     public boolean isEmpty() : 判断当前集合是否为空。
     public int size() : 返回集合中元素的个数。
     public Object[] toArray() : 把集合中的元素，存储到数组中
*/
public class CollectionDemo02 {
    public static void main(String[] args) {
        // 创建集合对象cs
        Collection<String> cs = new HashSet<>();
        // 添加元素
        System.out.println(cs.add("Java")); // true
        System.out.println(cs.add("Java")); // false
        cs.add("MySQL");
        cs.add("MyBatis");
        // 输出集合元素
        System.out.println("集合元素:" + cs);   // 集合元素:[Java, MySQL, MyBatis]
        System.out.println("++++++++++++++++++++++++");

        // 删除元素
        System.out.println(cs.remove("MyBatis"));   // true
        System.out.println("集合元素(删除):" + cs);   // 集合元素(删除):[Java, MySQL]
        System.out.println("++++++++++++++++++++++++");

        // 判断集合中是否包含了某个元素
        System.out.println("集合是否包含该元素:");
        System.out.println(cs.contains("Java"));    // true
        System.out.println(cs.contains("Python"));  // false
        System.out.println("++++++++++++++++++++++++");

        // 判断集合是否为空,为空返回true,反之
        System.out.println("判断集合是否为空:" + cs.isEmpty());   // false
        System.out.println("++++++++++++++++++++++++");
        // 获取集合元素的个数
        System.out.println("集合元素的个数:" + cs.size());
        System.out.println("++++++++++++++++++++++++");

        // 将集合转换成数组
        Object[] objs = cs.toArray();
        System.out.println("数组内容:" + Arrays.toString(objs));
        System.out.println("++++++++++++++++++++++++");

        Collection<String> c1 = new HashSet<>();
        // 集合添加元素
        c1.add("curry");
        c1.add("james");
        Collection<String> c2 = new HashSet<>();
        // 添加元素
        c2.add("kobe");
        c2.add("Rondo");
        // 将c2全部元素倒入到c1集合中
        c1.addAll(c2);
        // 输出集合元素
        System.out.println("集合元素:" + c1);   // 集合元素:[kobe, james, Rondo, curry]
        System.out.println("++++++++++++++++++++++++");

        Collection<String> c3 = new HashSet<>();
        // 添加元素
        c3.add("Java1");
        c3.add("Java2");
        c3.add("Java");

        Collection<String> c4 = new HashSet<>();
        c4.add("Java3");
        c4.add("Java4");
        c4.add("Java");
        // c3和c4取交集，取完交集的结果作为c3的新数据！！
        c3.retainAll(c4);
        System.out.println("新集合:" + c3);    // 新集合:[Java]
    }
}
```

### 12.3 集合遍历

#### 12.3.1 Iterator接口

1、基本介绍

`java.util.Iterator`接口主要用于描述迭代器对象，可以遍历`Collection`集合中的所有元素。

`java.util.Collection`接口继承`Iterator`接口，因此所有实现`Collection`接口的实现类都可以使用该迭代器对象。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210927163011.png" style="zoom:80%;" />	

 `Iterator`仅用于遍历集合，`Iterator`本身并不存放对象。

2、迭代器执行原理

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210927163459.png" style="zoom: 67%;" />	

注意事项：调用`iterator.next`(方法之前必须要调用`iterator.hasNext()`进行检测。==若不调用，且下一-条记录无效==，直接调用`it.next()`会抛出`NoSuchElementException`异常。

3、常用的方法

| 方法声明          | 功能介绍                            |
| ----------------- | ----------------------------------- |
| boolean hasNext() | 判断集合中是否有可以迭代/访问的元素 |
| E next()          | 用于取出一个元素并指向下一个元素    |
| void remove()     | 用于删除访问到的最后一个元素        |

#### 12.3.2 迭代器遍历

1、迭代器遍历集合元素，代码示例

```java
package cn.guardwhy_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 Collection集合的遍历方式是所有集合都可以使用的。
 因为Collection集合是根类，他的功能子类都可以直接使用。
 1.迭代器遍历集合元素：
 步骤：
     -- 先获取集合的迭代器对象。
     方法：Iterator<E> iterator():得到当前集合的迭代器对象
     代码：Iterator<String> it = names.iterator();
     -- 使用while循环通过it.hasNext()询问是否有下一个元素。
     有就返回true然后进入循环通过it.next取出下一个元素。没有返回false ,循环就结束了!!
 注意：迭代器不能通过next()去访问超过了最大个数的元素.
 */
public class CollectionDemo03 {
    public static void main(String[] args) {
        // 创建一个集合对象
        Collection<String> lists = new ArrayList<>();
        // 添加元素
        lists.add("Curry");
        lists.add("Kobe");
        lists.add("James");
        lists.add("Rondo");
        System.out.println("集合元素:" + lists);    // 集合元素:[Curry, Kobe, James, Rondo]

        // 先获取当前集合的迭代器对象
        Iterator<String> it = lists.iterator();
        // 遍历迭代器对象
        System.out.println("迭代器遍历:");
        while (it.hasNext()){
            String str = it.next();
            // 输出集合元素
            System.out.println(str);
        }
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/37-mysql.png"  />	

#### 12.3.3  foreach遍历

1、基本介绍

增强`for`循环，可以代替`iterator`迭代器，增强`for`就是简化版的`iterator`,本质一样只能用于遍历集合或数组。

```java
 for(元素类型元素名:集合名或数组名) {
     访问元素
 }
```

2、通过增强`for`循环，实现代码

```java
package cn.guardwhy_01;

import java.util.ArrayList;
import java.util.Collection;

/**
foreach遍历，可以遍历集合也可以遍历数组，是迭代器的简化写法
    foreach遍历的核心是记住格式:
         for(被遍历集合或者数组中元素的类型 变量名称 : 被遍历集合或者数组){
            }

总结:foreach遍历原理就是迭代器,写法是简化写法。
 */
public class CollectionDemo04 {
    public static void main(String[] args) {
        // 创建一个集合对象
        Collection<String> lists = new ArrayList<>();
        // 添加元素
        lists.add("Curry");
        lists.add("Kobe");
        lists.add("James");
        lists.add("Rondo");
        // 集合元素:[Curry, Kobe, James, Rondo]
        System.out.println("集合元素:" + lists);

        System.out.println("集合for_each遍历:");
        for(String list : lists){
            System.out.println(list);
        }

        // 数组遍历
        int[] arrs = {10, 20, 30, 40};
        System.out.print("数组元素:");
        for(int arr : arrs){
            // 数组元素: 10 20 30 40
            System.out.print(" " + arr);
        }
    }
}
```

3、执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/38-mysql.png" style="zoom: 80%;" />

#### 12.3.4 JDK 1.8遍历

1、JDK 1.8开始之后的新技术，代码示例

```java
package cn.guardwhy_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 Collection集合的遍历方式有三种：
 （1）迭代器
 （2）foreach遍历（增强for循环，是迭代器的简化写法）
 （3）JDK 1.8开始之后的新技术（了解）
 */
public class CollectionDemo05 {
    public static void main(String[] args) {
        // 创建一个集合对象
        Collection<String> lists = new ArrayList<>();
        // 添加元素
        lists.add("Curry");
        lists.add("Kobe");
        lists.add("James");
        lists.add("Rondo");
        // 集合元素:[Curry, Kobe, James, Rondo]
        System.out.println("集合元素:" + lists);

        // 条件遍历
        System.out.print("集合JDK1.8的新技术:");
        System.out.print("[");
        lists.forEach(list->{
            System.out.print(list + " ");
        });
        System.out.print("]");
    }
}
```

2、执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se1/01-javase.png)

### 12.4 List集合

#### 12.4.1 基本介绍

1、`List`接口是`Collection`接口的子接口

- `List`集合类中元素有序(即添加顺序和取出顺序一致)，且可重复。`List`集合中的每个元素都有其对应的顺序索引，即支持索引。
- `List`容器中的元素都对应一 个整数型的序号记载其在容器中的位置，可以根据序号存取容器中的元素。
- `JDK API`中`List`接口的实现类有:`ArrayList`类、`LinkedList`类、`Stack`类、`Vector`类。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210927171645.png)

2、`List`接口常用的方法

| 方法名                                                 | 说明                     |
| ------------------------------------------------------ | ------------------------ |
| `void add(int index, E element)`                       | 向集合中指定位置添加元素 |
| `boolean addAll(int index, Collection<? extends E> c)` | 向集合中添加所有元素     |
| `E get(int index)`                                     | 从集合中获取指定位置元素 |
| `int indexOf(Object o)`                                | 查找参数指定的对象       |
| `int lastIndexOf(Object o)`                            | 反向查找参数指定的对象   |
| `E set(int index, E element)`                          | 修改指定位置的元素       |
| `E remove(int index)`                                  | 删除指定位置的元素       |
| `List subList(int fromIndex, int toIndex)`             | 用于获取子List           |

#### 12.4.2 相关方法实现

1、ArrayList集合特点

ArrayList类的底层是采用动态数组进行数据管理的，支持下标访问，增删元素不方便。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se1/06-javase.png" style="zoom:80%;" />

2、构造方法

| 方法名             | 说明                 |
| ------------------ | -------------------- |
| public ArrayList() | 创建一个空的集合对象 |

3、`List`相关方法代码实现

```java
package cn.guardwhy_04;

import java.util.ArrayList;
import java.util.List;

/**
 * List系列集合有索引，所以多了很多按照索引操作元素的特有功能：
 *    - public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
 *    - public E get(int index):返回集合中指定位置的元素。
 *    - public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
 *    - public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
 *小结：
 *    ArrayList集合的特点：底层是基于数组存储元素的，查询性能快，增删慢
 *    开发中更多的时候在做查询，所以ArrayList集合用的最多！
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        // 1.创建lists集合对象
        List<String> lists = new ArrayList<>();
        // 2.往集合中添加元素
        lists.add("Curry");
        lists.add("Kobe");
        lists.add("James");
        lists.add("Rondo");

        // 3.插入元素.在某个索引位置处插入元素,后面的元素后移
        lists.add(1, "guardwhy");
        System.out.println("list集合:" + lists);  // list集合:[Curry, guardwhy, Kobe, James, Rondo]

        // 4.获取索引位置的元素
        System.out.println("list集合(获取元素):" + lists.get(2)); // 获取元素:Kobe

        // 5.根据索引删除元素
        System.out.println("删除元素:" + lists.remove(1));    // guardwhy
        System.out.println("list集合(删除):" + lists);  // list集合(删除):[Curry, Kobe, James, Rondo]

        // 修改某个索引位置的元素
        System.out.println("修改元素:" + lists.set(1, "Duncan"));   // Kobe
        System.out.println("list集合(修改):" + lists);  // list集合(修改):[Curry, Duncan, James, Rondo]
    }
}
```

4、执行代码，查看结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se1/02-javase.png"  />

#### 12.4.3 四种遍历方式

1、使用四种方式，遍历`List`集合。

```java
package cn.guardwhy_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 List遍历方式：
     （1）for循环
     （2）迭代器
     （3）foreach
     （4）JDK 1.8新技术。
 */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        // 创建lists集合对象
        List<String> lists = new ArrayList<>();
        // 往集合中添加元素
        lists.add("Curry");
        lists.add("Kobe");
        lists.add("James");
        lists.add("Rondo");

        // 1.for循环
        System.out.println("for循环遍历:");
        for(int i=0; i<lists.size(); i++){
            System.out.println(lists.get(i));
        }
        System.out.println("++++++++++++++++");

        // 2.迭代器
        System.out.println("迭代器遍历:");
        Iterator<String> it = lists.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("++++++++++++++++");

        // foreach遍历
        System.out.println("foreach遍历:");
        for(String list : lists){
            System.out.println(list);
        }
        System.out.println("++++++++++++++++");

        // JDK 1.8新技术
        System.out.println("JDK1.8新技术forEach遍历:");
        lists.forEach(list ->{
            System.out.println(list);
        });
    }
}
```

#### 12.4.4 ArrayList 底层结构

1.1、`ArrayList`的注意事项

- `ArrayList`可以加入`null`，并且能加入多个`null`。`ArrayList`是由数组来实现数据存储的。
- `ArrayList`基本等同于`Vector`，除了`ArrayList`是线程不安全【执行效率高】，在多线程情况下，不建议使用`ArrayList`。

```java
package cn.arraylist_.demo01;

import java.util.ArrayList;

@SuppressWarnings({"all"})
public class ArrayListDetail {
    public static void main(String[] args) {
        //1.1 ArrayList是线程不安全的,可以看源码查看add()方法，add方法没有synchronized关键字
        /*
            public boolean add(E e) {
                ensureCapacityInternal(size + 1);  // Increments modCount!!
                elementData[size++] = e;
                return true;
            }
         */
        ArrayList list1 = new ArrayList();
        list1.add(null);
        list1.add("guardwhy");
        list1.add(null);
        list1.add("java");
        System.out.println("list集合:" + list1);
    }
}
```

1.2、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928081706.png)	

2、`ArrayList`的扩容机制

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928095254.png" style="zoom: 80%;" />

- `ArrayList`中维护了一个`Object`类型的数组`elementData`。

```java
transient Object[] elementData; //transient表示瞬间,短暂的，表示该属性不会被序列号
```

- 当创建`ArrayList`对象时， 如果使用的是无参构造器，则初始`elementData`容量为`0`，第`1`次添加，则扩容`elementData`为`10`。如需要再次扩容，则扩容`elementData`为`1.5`倍。
- 如果使用的是指定大小的构造器，则初始`elementData`容量为指定大小， 如果需要扩容，则直接扩容`elementData`为`1.5`倍。

##### 12.4.4.1 无参构造器

1.1、debug下面代码，分析ArrayList源码

```java
package cn.arraylist_.demo01;

import java.util.ArrayList;
@SuppressWarnings({"all"})
public class ArrayListSource {
    public static void main(String[] args) {

        //1.1 使用无参构造器创建ArrayList对象
        ArrayList list = new ArrayList();

        //1.2 使用for给list集合添加 1-10数据
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        //1.3 使用for给list集合添加 11-15数据
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}
```

1.2 `IDEA`中`debug`时，信息显示不全的问题解决。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928155944.png" style="zoom: 67%;" />	

2、使用无参构造器创建ArrayList对象，在程序中打上断点，直接进入方法体

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928101038.png" style="zoom: 67%;" />	

2.1 第一次初始化:就是创建了一个空的`elementData数组={}`，然后执行`shift+F8`跳出方法。	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928101609.png" style="zoom:67%;" />

2.2 逐步执行(`F8`)

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928102258.png" style="zoom: 80%;" />	

2.3 进入方法中(`F7`)，进入装箱操作源码。

```java
public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
}
```

2.4 跳出该方法，进入`add()`方法。

```java
/**
 * Appends the specified element to the end of this list.
 *
 * @param e element to be appended to this list
  * @return <tt>true</tt> (as specified by {@link Collection#add})
*/
public boolean add(E e) {
    ensureCapacityInternal(size + 1); // 先确定是否需要扩容。
    elementData[size++] = e; // 然后在执行赋值操作
    return true;
}
```

2.5 进入`ensureCapacityInternal()`方法【`F7`】确定`minCapacity`，第一次扩容的大小为`10`。

```java
private void ensureCapacityInternal(int minCapacity) {
    	// 1.1 判断是不是空数组
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            // 如果是第一次添加，赋予一个最小容量
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }
		// 1.3 确定是否真的需要扩容
        ensureExplicitCapacity(minCapacity);
    }
```

2.6 进入`ensureExplicitCapacity()`方法中，执行以下操作

```java
private void ensureExplicitCapacity(int minCapacity) {
    // 1.1 记录集合被修改的次数
    modCount++;

    // 1.2 如果elementData的大小不够，就调用 grow()方法去扩容
    if (minCapacity - elementData.length > 0)
        grow(minCapacity);
}
```

2.7 继续执行【`F7`】，调用底层的`grow()`方法

- 该方法是真的扩容，使用扩容机制来确定要扩容到多大。
- 第一次`newCapacity = 10`，第二次及其以后，按照1.5倍扩容。
- 扩容使用的是`Arrays.copyOf()`方法。

```java
/**
* Increases the capacity to ensure that it can hold at least th
* number of elements specified by the minimum capacity argument.
*
* @param minCapacity the desired minimum capacity
*/
private void grow(int minCapacity) {

    int oldCapacity = elementData.length;
    // 1.1 新容量 = 原先数组容量 + [原先数组容量/2]
    int newCapacity = oldCapacity + (oldCapacity >> 1);
    if (newCapacity - minCapacity < 0)
        // 1.2 注意:第一次扩容并没有使用1.5倍的扩容机制。
        newCapacity = minCapacity;
    if (newCapacity - MAX_ARRAY_SIZE > 0)
        newCapacity = hugeCapacity(minCapacity);
    // 1.3 使用Arrays.copyOf能保存数组原先的数据
    elementData = Arrays.copyOf(elementData, newCapacity);
}
```

2.8 继续执行【`F8`】操作，当其返回到`add()`方法时，可以得知已经扩容成功了。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928144107.png" style="zoom:80%;" />	

- 10个元素已经添加至集合`List`中。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928144156.png" style="zoom: 67%;" />	

2.9 如果`elementData`的大小不够，就调用 `grow()`方法去扩容，第二次及其以后，按照`1.5`倍扩容。

- 在程序中打上断点，直接进入方法体

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928154447.png" style="zoom:67%;" />	

2.10 查看源码，发现扩容成功！！！

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928154743.png" style="zoom: 67%;" />

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928155031.png" style="zoom:67%;" />	

##### 12.4.4.2 代参构造器实现

1、debug下面代码，分析ArrayList源码

```java
package cn.arraylist_.demo01;

import java.util.ArrayList;
@SuppressWarnings({"all"})
public class ArrayListSource {
    public static void main(String[] args) {

        //1.1 使用代参参构造器创建ArrayList对象
        ArrayList list = new ArrayList(8);

        //1.2 使用for给list集合添加 1-10数据
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}
```

2、使用代参构造器创建ArrayList对象，在程序中打上断点，直接进入方法体

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928162859.png" style="zoom: 67%;" />	

3、进入方法中(`F7`)，数组直接初始化，创建了一个指定大小`elementData[]`数组。

```java
/**
 * Constructs an empty list with the specified initial capacity.
 *
 * @param  initialCapacity  the initial capacity of the list
 * @throws IllegalArgumentException if the specified initial capacity
 *         is negative
 */
public ArrayList(int initialCapacity) {
    if (initialCapacity > 0) {
        // 创建指定大小的数组
        this.elementData = new Object[initialCapacity];
    } else if (initialCapacity == 0) {
        this.elementData = EMPTY_ELEMENTDATA;
    } else {
        throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
    }
}
```

4、第一次扩容，就按照`elementData`的1.5倍扩容，整个执行的流程还是和无参构造器流程一样

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928164145.png)

5、扩容成功！！！

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928164432.png)

#### 12.4.5 Vector类

##### 12.4.5.1 Vector底层结构

1、基本介绍

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928202828.png)

2、 Vector类基本特点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928204017.png" style="zoom:80%;" />	

Vector底层也是一个对象数组，阅读源码可得。

```java
public class Vector<E>
    extends AbstractList<E>
    implements List<E>, RandomAccess, Cloneable, java.io.Serializable{
    /**
     * The array buffer into which the components of the vector are
     * stored. The capacity of the vector is the length of this array buffer,
     * and is at least large enough to contain all the vector's elements.
     *
     * <p>Any array elements following the last element in the Vector are null.
     *
     * @serial
     */
    protected Object[] elementData;
}
```

Vector是线程同步的，即线程安全，Vector类的操作方法带有`synchronized`，查看基本方法。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928204427.png)

在开发中，需要线程同步安全时，考虑使用`Vector`！！

##### 12.4.5.2 Vector源码剖析

1、debug下面代码，分析Vector源码

```java
package cn.arraylist_.demo01;

import java.util.Vector;
@SuppressWarnings({"all"})
public class VectorSource {
    public static void main(String[] args) {
        //1.1 无参构造器
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println("vector=" + vector);
    }
}
```

2、使用无参构造器创建`Vector`对象，在程序中打上断点，直接进入方法体

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928212810.png" style="zoom:67%;" />	

3、Vector类底层数组初始化操作，如果是无参，默认10

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928213645.png" style="zoom:80%;" />	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928214353.png" style="zoom:80%;" />	

4、进入方法中(`F7`)，进入装箱操作源码。

```java
public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
}
```

5、跳出该方法，进入`add()`方法，下面这个方法就添加数据到`vector`集合。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928214838.png" style="zoom:80%;" />6、确定是否需要扩容条件：`minCapacity - elementData.length > 0`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928215739.png" style="zoom:80%;" />	

7、如果需要的数组大小不够用，就需要扩容 。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928220106.png)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928220656.png)

8、Vector数组容器扩容成功。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928220900.png" style="zoom: 67%;" />	

3、`Vector`和`ArrayList`的比较

| 集合名称    | 底层结构           | 版本     | 线程安全(同步)效率 | 扩容倍数                                                     |
| ----------- | ------------------ | -------- | ------------------ | ------------------------------------------------------------ |
| `ArrayList` | 可变数组           | `jdk1.2` | 不安全，效率高     | 如果有参构造`1.5`倍，如果是无参，第一 次`10`，从第二次开始安`1.5`扩容。 |
| `Vector`    | 可变数组`Object[]` | `jdk1.0` | 安全，效率不高     | 如果是无参，默认`10`，满后，就按`2`倍扩容。如果指定大小，则每次直接按`2`倍扩容。 |

#### 12.4.6 LinkedList类

##### 12.4.6.1 LinkedList特点

- `LinkedList`底层实现了双向链表和双端队列，访问不方便，增删元素方便。
- `LinkedList`可以添加任意元素(元素可以重复)，包括`null`。
- `LinkedList`线程不安全,没有实现同步。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929213148.png" style="zoom:80%;" />	

##### 12.4.6.2 LinkedList底层机制

1、基本介绍

`LinkedList`底层维护了一个双向链表，`LinkedList`中维护了两个属性`first`和`last`分别指向首节点和尾节点。

每个节点【Node对象】，里面又维护了`prev`、`next`、`item`三个属性，其中通过`prev`指向前一个，通过`next`指向后一个节点。最终实现双向链表.

所以`LinkedList`的元素的添加和删除，不是通过数组完成的，相对来说效率较高。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929102030.png)

2、模拟一个双向链表，插入一个节点，代码示例

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929151013.png)

```java
package cn.arraylist_.demo02;

//1.1 定义一个Node 类，Node 对象表示双向链表的一个结点
class Node {
    //1.2 真正存放数据
    public Object item;
    //1.3 指向后一个结点
    public Node next;
    //1.4 指向前一个结点
    public Node pre;
    public Node(Object name) {
        this.item = name;
    }
    public String toString() {
        return "Node name=" + item;
    }
}

public class LinkedList01 {
    public static void main(String[] args) {
        //2.1 模拟一个简单的双向链表
        Node curry = new Node("curry");
        Node james = new Node("james");
        Node guardwhy= new Node("guardwhy");

        //2.2 连接三个结点，形成双向链表 curry -> james -> guardwhy
        curry.next = james;
        james.next = guardwhy;
        //guardwhy-> james -> curry
        guardwhy.pre = james;
        james.pre = curry;
        //2.3 让first引用指向curry,就是双向链表的头结点
        Node first = curry;
        //2.4 让last引用指向guardwhy,就是双向链表的尾结点
        Node last = guardwhy;

        System.out.print("从头到尾进行遍历:" + "[");
        while (true) {
            if(first == null) {
                break;
            }
            //2.5 输出first信息
            System.out.print(first +" ");
            first = first.next;
        }
        System.out.println("]");

        System.out.print("从尾到头进行遍历:" + "[");
        while (true) {
            if(last == null) {
                break;
            }
            //2.6 输出last信息
            System.out.print(last + " ");
            last = last.pre;
        }
        System.out.println("]");

        //要求: 在james-->guardwhy直接，插入一个对象 kobe

        //3.1先创建一个 Node结点，name就是 kobe
        Node kobe = new Node("kobe");
        //3.2 下面就把 kobe加入到双向链表了
        kobe.next = guardwhy;
        kobe.pre = james;
        guardwhy.pre = kobe;
        james.next = kobe;

        //3.3 让first引用指向curry,就是双向链表的头结点
        first = curry;

        System.out.print("从头到尾进行遍历:" + "[");
        while (true) {
            if(first == null) {
                break;
            }
            //3.4 输出first 信息
            System.out.print(first + " ");
            first = first.next;
        }
        System.out.println("]");
        //3.5 让last 重新指向最后一个结点
        last = guardwhy;

        System.out.print("从尾到头的遍历:" + "[");
        while (true) {
            if(last == null) {
                break;
            }
            //3.6 输出last 信息
            System.out.print(last + " ");
            last = last.pre;
        }
        System.out.println("]");
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929151144.png" style="zoom:80%;" />	

##### 12.4.6.3 LinkedList源码分析

1、`debug`下面代码，分析`LinkedList`源码

````java
package cn.arraylist_.demo02;

import java.util.LinkedList;
@SuppressWarnings({"all"})
public class LinkedListSource {
    public static void main(String[] args) {
        // 1.1 创建 linkedList集合对象
        LinkedList linkedList = new LinkedList();
        // 1.2 添加元素
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList=" + linkedList); // linkedList=[1, 2, 3]

        //1.3 删除结点的，这里默认删除的是第一个结点
        linkedList.remove();   // linkedList=[2, 3]

        System.out.println("linkedList=" + linkedList);
    }
}
````

##### 12.4.6.4 添加结点操作

1、 使用无参构造器创建`linkedList`对象，在程序中打上断点，直接进入方法体

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929170417.png" style="zoom:80%;" />	

2、 调用了一个无参构造器，这时`linkeList` 的属性 `first = null`，` last = null`。

```java
/**
 * Constructs an empty list.
*/
public LinkedList() {
    
}
```

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929170900.png" style="zoom:80%;" />	

3、 进入方法中(`F7`)，进入装箱操作。

```java
public static Integer valueOf(int i) {
    if (i >= IntegerCache.low && i <= IntegerCache.high)
        return IntegerCache.cache[i + (-IntegerCache.low)];
    return new Integer(i);
}
```

4、 执行添加`add()`方法操作，进入`linKLast()`方法

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929171456.png" style="zoom:80%;" />	

5、 将新的结点，加入到双向链表的最后，注意：`first`和`last`分别指向这个结点，两头为空！！！

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929172737.png" style="zoom:80%;" />	

```java
void linkLast(E e) {
    // 把该元素设置为尾节点，所以需要新建一个变量把尾节点存储起来。然后新建一个节点，把last指向l，然后自身设置为尾结点。
    final Node<E> l = last;
    final Node<E> newNode = new Node<>(l, e, null);
    last = newNode;
    /**
	再判断一下l是否为空，如果为空的话，说明原来的LinkedList为空，所以同时也需要把新节点设置为头节点。
	否则就把l的next设置为newNode。
    */ 
    if (l == null)
        first = newNode;
    else
        l.next = newNode;
    // size和modCount自增。
    size++;
    modCount++;
}	
```

6、结点添加成功

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929173102.png" style="zoom: 67%;" />

 7、添加第二个结点，在程序中打上断点，直接进入方法体

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929184320.png" style="zoom:67%;" />	

8、进入方法中(`F7`)，进入装箱操作。
<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929184533.png" style="zoom:67%;" />

9、执行添加`add()`方法操作，进入`linKLast()`方法，添加第二个结点

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929193811.jpg)

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929184858.png" style="zoom:80%;" />

10、添加结点成功！！！

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929194040.png" style="zoom:67%;" />	

##### 12.4.6.5 删除结点操作

1、在程序中打上断点，直接进入方法体

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929194929.png)

2、进入删除方法

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929202306.jpg)

```java
/**
 * Retrieves and removes the head (first element) of this list.
 *
 * @return the head of this list
 * @throws NoSuchElementException if this list is empty
 * @since 1.5
 */
public E remove() {
    return removeFirst();
}

/**
 * Removes and returns the first element from this list.
 * @return the first element from this list
 * @throws NoSuchElementException if this list is empty
*/
public E removeFirst() {
    final Node<E> f = first;
    if (f == null)
        throw new NoSuchElementException();
    return unlinkFirst(f);
}
```

3、调用`unlinkFirst()`方法，将`f`指向的双向链表的第一个结点拿掉。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929195755.png" style="zoom: 67%;" />	

4、节点删除成功

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929202457.png" style="zoom: 67%;" />	

#### 12.4.7 ArrayList和LinkedList区别

1、基本介绍

`ArrayList`和`LinkedList`的方法在逻辑上完全一样，只是在性能上有一定的差别，`ArrayList`更适合于随机访问。

`LinkedList`更适合于插入和删除，在性能要求不是特别苛刻的情形下可以忽略这个差别。

| 集合类     | 底层结构 | 增删的效率         | 改查的效率 |
| ---------- | -------- | ------------------ | ---------- |
| ArrayList  | 可变数组 | 较低               | 数组扩容   |
| LinkedList | 双向链表 | 较高，通过链表追加 | 较低       |

2、`LinkedList`相关方法，代码示例

```java
package cn.arraylist_.demo03;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCRUD {
    public static void main(String[] args) {
        // 1.1 创建linkedList对象
        LinkedList linkedList = new LinkedList();
        // 1.2 将结点添加到linkedList集合中
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList集合:" + linkedList); // linkedList集合:[1, 2, 3]

        //2.1 默认删除的是第一个结点
        linkedList.remove();
        System.out.println("linkedList(默认删除):" + linkedList); // linkedList(默认删除):[2, 3]

        //3.1 修改某个结点对象
        linkedList.set(1, 32);
        System.out.println("linkedList(修改结点值):" + linkedList); // linkedList(修改结点值):[2, 32]

        //4.1 得到某个结点对象
        Object obj = linkedList.get(1);
        System.out.println("得到结点1:" + obj);	// 得到结点1:32

        // 4.2 LinkedList是实现了List接口,遍历方式
        System.out.println("迭代器遍历:");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next=" + next); 
        }

        System.out.println("增强for遍历:");
        for (Object o1 : linkedList) {
            System.out.println("o1=" + o1);
        }
        System.out.println("普通for遍历:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210929212620.png" style="zoom: 80%;" />	

4、如何选择`ArrayList`和`LinkedList`

- 如果改查的操作多，选择`ArrayList`。
- 如果增删的操作多，选择`LinkedList`。
- 一般来说，在程序中，80%-90%都是查询，因此大部分情况下会选择`ArrayList`。
- 在一个项目中，根据业务灵活选择，也可能这样，一个模块使用的是`Arraylist`,另外一个模块是`LinkedList`。

### 12.5 Stack类

#### 12.5.1 Stack特点

- Stack类的底层是采用动态数组进行数据管理的，==该类主要用于描述一种具有后进先出特征的数据结构，叫做栈==`(last in first out LIFO)`。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928170304.png)

#### 12.5.2 Stack类常用方法

1、Stack类相关方法，代码示例

```java
package cn.guardwhy_04;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        // 1.准备一个Stack类型的对象并打印
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        System.out.println("s1 = " + s1); // [啥也没有]
        System.out.println("s2 = " + s2); // [啥也没有]

        System.out.println("--------------------");
        // 2.将数据11、22、33、44、55依次入栈并打印
        for (int i = 1; i <= 5; i++) {
            Object obj = s1.push(i * 11);
            System.out.println("入栈的元素是：" + obj);
            //System.out.println("栈中的元素有：" + s1); // 11 22 33 44 55
        }
        
        // 3.对栈中所有元素依次出栈并打印
        int len = s1.size();
        for (int i = 1; i <= len; i++) {
            Object to = s1.pop();
            //System.out.println("出栈的元素是：" + to); // 55 44 33 22 11
            s2.push(to);
        }

        // 4.最终打印栈中的所有元素
        System.out.println("----------------------");
        len = s2.size();
        for (int i = 1; i <= len; i++) {
            Object to = s2.pop();
            System.out.println("出栈的元素是：" + to); // 11 22 33 44 55
        }
    }
}
```

### 12.6 Queue集合

#### 12.6.1 基本介绍

`java.util.Queue`集合是`Collection`集合的子集合，==与List集合属于平级关系==。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928193444.png)	

#### 12.6.2 Queue集合特点

该集合的主要用于描述具有先进先出特征的数据结构，叫做队列(`first in first out FIFO`)。

该集合的主要实现类是`LinkedList`类，因为该类在增删方面比较有优势。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928193911.png)

#### 12.6.3 常用的方法

| 方法名               | 说明                                         |
| -------------------- | -------------------------------------------- |
| `boolean offer(E e)` | 将一个对象添加至队尾，若添加成功则返回`true` |
| `E poll()`           | 从队首删除并返回一个元素                     |
| `E peek()`           | 返回队首的元素（但并不删除）                 |

1、常用方法，代码示例。

```java
package cn.guardwhy_04;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        // 1.准备一个Queue集合并打印
        Queue queue = new LinkedList();
        System.out.println("队列中的元素有：" + queue); // [ ]

        System.out.println("+++++++++++");
        // 2.将数据11、22、33、44、55依次入队并打印
        for (int i = 1; i <= 5; i++) {
            boolean b1 = queue.offer(i * 11);
        }
        System.out.println("队列中的元素有：" + queue); // 11 22 33 44 55

        System.out.println("+++++++++++++");
        // 3.然后查看队首元素并打印
        System.out.println("对首元素是：" + queue.peek()); // 11

        System.out.println("==============");
        // 4.然后将队列中所有数据依次出队并打印
        int len = queue.size();
        for (int i = 1; i <= len; i++) {
            System.out.println("出队的元素是：" + queue.poll()); // 11 22 33 44 55
        }

        System.out.println("------------------------");
        // 5.查看队列中最终的元素
        System.out.println("队列中的元素有：" + queue); // [ ]
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210928200753.png" style="zoom: 67%;" />	

### 12.7 Set集合

#### 12.7.1 Set接口基本介绍

1、基本概念

`java.util.Set`集合是`Collection`集合的子集合，与`List`集合平级。该集合中元素没有先后放入次序，且不允许重复。

该集合的主要实现类是：`HashSet`类 和 `TreeSet`类以及`LinkedHashSet`类。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210930100408.png)

#### 12.7.2 Set接口特点

1、无序【添加和取出的顺序不一致】，没有索引。

2、不允许重复元素，所以最多包含一个`null`。

3、`JDK API`中`Set`接口的实现类有:

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210930094937.png" style="zoom:80%;" />

#### 12.7.3 Set接口方法和遍历方式

1、接口方法

- 和`List`接口一样, `Set`接口也是`Collection`的子接口，因此，常用方法和`Collection`接口一样。

2、遍历方式

同`Collection`的遍历方式一样，因为`Set`接口是`Collection`接口的子接口。

- 可以使用迭代器
- 增强for遍历
- 不能使用索引的方式来获取。

3、代码示例

```java
package cn.arraylist_.demo03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
@SuppressWarnings({"all"})
public class SetMethod {
    public static void main(String[] args) {
        /**
         * set接口的实现类的对象(Set接口对象), 不能存放重复的元素, 可以添加一个null
         * set 接口对象存放数据是无序(即添加的顺序和取出的顺序不一致)
         */
        Set set = new HashSet();
        set.add("curry");
        set.add("james");
        set.add("curry");//重复
        set.add("guardwhy");
        // 注意：取出的顺序虽然不是添加的顺序，但是它的固定.
        set.add("kobe");
        set.add(null);
        //再次添加null
        set.add(null);
        System.out.println("set集合:" + set);

        //方式1： 使用迭代器
        System.out.print("迭代器遍历:" + "[");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj1 =  iterator.next();
            System.out.print( "obj1=" + obj1 +" ");
        }
        System.out.println("]");
        // 删除null结点
        set.remove(null);

        //方式2: 增强for
        System.out.print("增强for遍历:" + "[");
        for (Object obj2 : set) {
            System.out.print("obj2=" + obj2 + " ");
        }
        System.out.print("]");

        //set 接口对象，不能通过索引来获取
    }
}
```

4、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20210930115136.png" style="zoom: 80%;" />	

#### 12.7.4 HashSet类

##### 12.7.4.1 HashSet特点

1、基本介绍

`HashSet`的底层是采用哈希表进行数据管理的，添加的元素，是无序，不重复，无索引的。

`HashSet`实现了`Set`接口，` HashSet`实际上是`HashMap`，看下源码。

```java
/**
 * Constructs a new, empty set; the backing <tt>HashMap</tt> instance has
 * default initial capacity (16) and load factor (0.75).
*/
public HashSet() {
    map = new HashMap<>();
}
```

可以存放`null`值，但是只能有一个`null`， `HashSet`不保证元素是有序的，取决于`hash`后，再确定索引的结果。【==不保证存放元素的顺序和取出顺序一致==】。

2、`HashSet`添加方法，代码示例

```java
package cn.set.demo01;

import java.util.HashSet;
import java.util.Set;
@SuppressWarnings({"all"})

public class HashSetDemo01 {
    public static void main(String[] args) {
        // 无序不重复无索引的
        Set<String> sets = new HashSet<>();
        // 往集合中添加元素
        sets.add("Java");
        sets.add("Java");
        sets.add("Mybatis");
        sets.add("MySQL");
        // HashSet 可以存放null ,但是只能有一个null,即元素不能重复
        sets.add(null);
        sets.add(null);
        System.out.println("set集合:" + sets);	// set集合:[null, Java, MySQL, Mybatis]
    }
}
```

3、经典案例分析

```java
package cn.set.demo01;

import java.util.HashSet;

class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
@SuppressWarnings({"all"})
public class HashSetDemo02 {
    public static void main(String[] args) {
        // 1.1 创建set集合对象
        HashSet set = new HashSet();

        //1.2 在执行add方法后，会返回一个boolean值，如果添加成功，返回 true, 否则返回false
        System.out.println(set.add("kobe"));// true
        System.out.println(set.add("james"));// true
        System.out.println(set.add("kobe"));// false
        System.out.println(set.add("jack"));// true
        System.out.println(set.add("curry"));// true

        //2.1 可以通过 remove 指定删除哪个对象
        set.remove("curry");
        System.out.println("set集合:" + set); // set集合:[kobe, james, jack]
        System.out.println("=====================");

        // 3.1 重新创建set集合
        set  = new HashSet();
        System.out.println("set集合:" + set); // set集合:[]
        //3.2 Hashset 不能添加相同的元素/数据?
        set.add("guardwhy");
        set.add("guardwhy");
        set.add(new Student("curry"));//OK
        set.add(new Student("curry"));//Ok
        System.out.println("set集合:" + set); // set集合:[Student{name='curry'}, Student{name='curry'}, guardwhy]

        System.out.println("==================");
        
        set.add(new String("james"));//ok
        set.add(new String("james"));//加入不了.
        System.out.println("set集合:" + set); // set集合:[Student{name='curry'}, james, Student{name='curry'}, guardwhy]
    }
}
```

##### 12.7.4.2  HashSet 底层机制

1、数组链表模拟实现	

HashSet底层是`HashMap`, `HashMap`底层是【==数组+链表+红黑树==】，模拟一个简单的数组 + 链表结构

```java
package cn.set.demo01;

/**
 模拟一个HashSet的底层 (HashMap 的底层结构)
 */
//2.1 结点, 存储数据, 可以指向下一个结点，从而形成链表
class Node {
    //2.2 存放数据
    Object item;
    //2.3指向下一个结点
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
@SuppressWarnings({"all"})
public class HashSetStructure01 {
    public static void main(String[] args) {
        //1.1 创建一个表，表的类型是 Node[]
        Node[] table = new Node[16];
        //1.2创建结点
        Node curry = new Node("curry", null);
        // 1.3 设置节点
        table[2] = curry;
        Node kobe = new Node("kobe", null);
        //1.4 将kobe结点挂载到curry
        curry.next = kobe;
        Node james = new Node("james", null);
        //1.5 将james结点挂载到kobe
        kobe.next = james;

        Node guardwhy = new Node("guardwhy", null);
        //1.6将guardwhy放到table表的索引为3的位置。
        table[3] = guardwhy; 
        System.out.println("table=" + table);
    }
}
```

2、在程序中打上断点，直接进入方法体

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211001111638.png" style="zoom:80%;" />	

3、查看添加结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211001112446.png" style="zoom:80%;" />	

4、小结

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211001134904.png)	

1、`HashSet` 底层是`HashMap`，添加一个元素时，先得到`hash`【hashCode方法】值会转成->索引值。

2、找到存储数据表`table`，看这个索引位置是否已经存放的有元素。

3、如果没有直接加入，如果有调用`equals`比较，如果相同，就放弃添加。如果不相同，则添加到最后。

4、<font color = red>如果链表的元素个数到达【`TREEIFY THRESHOLD`】(默认是8)，并且`table`的大小 `>=MIN TREEIFY CAPACITY`(默认64)，就会进行树化【红黑树】</font>

##### 12.7.4.3  HashSet源码分析

1、`debug`下面代码，分析`HashSet`源码

```java
package cn.set.demo02;

import java.util.HashSet;
@SuppressWarnings({"all"})

public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        //1.1 到此位置，第1次add分析完毕.
        hashSet.add("java");
        //1.2 到此位置，第2次add分析完毕
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("set集合:" + hashSet); // set集合:[java, php]
    }
}
```

**<font color = red>第一次执行`add()`方法</font>**

1、 使用无参构造器创建`hashSet`对象，在程序中打上断点，直接进入方法体

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211001161141.png)	

2、 进入方法中`(F7)`，进入底层的构造器

```java
/**
 * Constructs a new, empty set; the backing <tt>HashMap</tt> instance has
 * default initial capacity (16) and load factor (0.75).
*/
public HashSet() {
    map = new HashMap<>();
}
```

3、进入方法中`(F7)`，执行`add()`方法。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211001163117.png)

```java
public boolean add(E e) {
    // PRESENT等价于:private static final Object PRESENT = new Object();
   return map.put(e, PRESENT)==null;
}
```

4、 继续执行(`F7`)，进入`put()`方法，该方法会执行hash(key) 得到key对应的hash值。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211001163425.png)

```java
public V put(K key, V value) { //key = "java" value = PRESENT 共享
    return putVal(hash(key), key, value, false, true);
}
```

进入`hash(key)`【`alt + shift + f7`方法】，算法`h = key.hashCode()) ^ (h >>> 16)`

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211001163925.png)

5、 继续执行(`F7`)，进入`putVal()`方法。

```java
/**
 * Implements Map.put and related methods
 * @param hash hash for key
 * @param key the key
 * @param value the value to put
 * @param onlyIfAbsent if true, don't change existing value
 * @param evict if false, the table is in creation mode.
 * @return previous value, or null if none
*/
final V putVal(int hash, K key, V value, boolean onlyIfAbsent,boolean evict) {
    // 1.1 定义了辅助变量，table就是HashMap的一个数组,类型是 Node[]
    Node<K,V>[] tab; Node<K,V> p; int n, i;
    //1.2 if语句表示如果当前table是null, 或者大小=0就是第一次扩容,到16个空间.
    if ((tab = table) == null || (n = tab.length) == 0)
        n = (tab = resize()).length; 
}
```

6、进入`resize()`方法

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211001170627.png)

```java
/**
  * Initializes or doubles table size.  If null, allocates in
  * accord with initial capacity target held in field threshold.
  * Otherwise, because we are using power-of-two expansion, the
  * elements from each bin must either stay at same index, or move
  * with a power of two offset in the new table.
  * @return the table
*/
final Node<K,V>[] resize() {
    Node<K,V>[] oldTab = table;
    int oldCap = (oldTab == null) ? 0 : oldTab.length;
    int oldThr = threshold;
    int newCap, newThr = 0;
    if (oldCap > 0) {
        if (oldCap >= MAXIMUM_CAPACITY) {
            threshold = Integer.MAX_VALUE;
            return oldTab;
        }
        else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
                 oldCap >= DEFAULT_INITIAL_CAPACITY)
            newThr = oldThr << 1; // double threshold
    }
    else if (oldThr > 0)
        newCap = oldThr;
    else {
		// 1.1 新数组到底要开辟多大的空间,默认开辟16个Node
        newCap = DEFAULT_INITIAL_CAPACITY;
        // 1.2 这里做了个计算临界值(0.75X16,到达了临界值时就开始扩容，如果不做缓冲，万一大量的线程突然往里面添加，有可能存在阻塞现象
        newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
    }
    if (newThr == 0) {
        float ft = (float)newCap * loadFactor;
        newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
                  (int)ft : Integer.MAX_VALUE);
    }
    threshold = newThr;
    @SuppressWarnings({"rawtypes","unchecked"})
    Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];
    table = newTab;
    if (oldTab != null) {
       ..............
    }
    return newTab;
}
```

7、进入静态常量`DEFAULT_INITIAL_CAPACITY`中可得，==新数组默认开辟16个Node的空间==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211001174237.png" style="zoom:80%;" />	

8、新数组将`newTab`容量赋值给`table`，然后返回`newTab`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211001181647.png" style="zoom: 67%;" />	

9、继续执行(`F7`)，进入`putVal()`方法。

```java
/**
 * Implements Map.put and related methods
 *@param hash hash for key
 * @param key the key
 * @param value the value to put
 * @param onlyIfAbsent if true, don't change existing value
     * @param evict if false, the table is in creation mode.
     * @return previous value, or null if none
     */
final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
               boolean evict) {
    Node<K,V>[] tab; Node<K,V> p; int n, i;
    if ((tab = table) == null || (n = tab.length) == 0)
        n = (tab = resize()).length;
    // 1、根据key得到hash,去计算该key应该存放到table表的哪个索引位置并把这个位置的对象，赋给p
    if ((p = tab[i = (n - 1) & hash]) == null)
        /*
        * 2、判断p是否为null
        * 2.1 如果p为null, 表示还没有存放元素, 就创建一个Node (key="java",value=PRESENT)
        * 2.2 就放在该位置 tab[i] = newNode(hash, key, value, null)
        */
        tab[i] = newNode(hash, key, value, null);
    else {
        .........
    }
    ++modCount;
     //3、size就是每加入一个结点Node(k,v,h,next), size++
    if (++size > threshold)
        // 4、扩容操作
        resize();
    afterNodeInsertion(evict);
    return null;
}
```

10、继续执行(`F7`)，添加节点成功！！！	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211001185202.png" style="zoom: 80%;" />	

**<font color = red>第二次执行`add()`方法</font>**

1、进入方法中`(F7)`，执行`add()`方法。	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211001215339.png)

2、继续执行(`F7`)，进入`put()`方法，该方法会执行`hash(key)`得到`key`对应的`hash`值。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211001215540.png)

3、不需要扩容，添加的节点数量，没到临界值。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211002093729.png" style="zoom: 67%;" />

4、添加成功

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211002094001.png" style="zoom: 67%;" />	

**<font color = red>第三次执行`add()`方法</font>**

1、在程序中打上断点，直接进入方法体。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211002102253.png" style="zoom:80%;" />	

2、进入方法中`(F7)`，执行`add()`方法。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211002102526.png)

3、进入方法中`(F7)`，执行`put()`方法。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211002102733.png)

4、执行`putVal()`方法

```java
/**
 * Implements Map.put and related methods
 * @param hash hash for key
 * @param key the key
 * @param value the value to put
 * @param onlyIfAbsent if true, don't change existing value
 * @param evict if false, the table is in creation mode.
 * @return previous value, or null if none
*/
final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
    ..........
    else {
        // 1.1 定义局部变量【辅助变量】
        HashMap.Node<K,V> e; K k;
        /**
         * 2、如果当前索引位置对应的链表的第一个元素和准备添加的key的hash值一样并且满足下面两个条件之一:
         * 2.1、准备加入的key和p指向的Node结点的key是同一个对象
         * 2.2、p指向的Node结点的key的equals()和准备加入的key比较后相同就不能加入。
         **/
        if (p.hash == hash &&
            ((k = p.key) == key || (key != null && key.equals(k))))
            e = p;
        /**
         * 3.1 再判断p是不是一颗红黑树,如果是一颗红黑树，就调用putTreeVal()方法来进行添加
         */
        else if (p instanceof TreeNode)
            e = ((HashMap.TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
        /**
          * 4、如果table对应索引位置，已经是一个链表, 就使用for循环比较。
          * 4.1 依次和该链表的每一个元素比较后，都不相同, 则加入到该链表的最后，注意在把元素添加到链表后，立即判断 该链表是否已经达到8个结点,就调用 				 treeifyBin()对当前这个链表进行树化(转成红黑树) 注意，在转成红黑树时，要进行判断。条件成立时，先table扩容。
          * 4.2 只有上面条件不成立时，才进行转成红黑树。依次和该链表的每一个元素比较过程中，如果有相同情况,就直接break。
          */
        else {
            for (int binCount = 0; ; ++binCount) {
                if ((e = p.next) == null) {
                    p.next = newNode(hash, key, value, null);
                    if (binCount >= TREEIFY_THRESHOLD - 1)
                        treeifyBin(tab, hash);
                    break;
                }
                if (e.hash == hash &&
                    ((k = e.key) == key || (key != null && key.equals(k))))
                    break;
                p = e;
            }
        }
       ........
    }
     ++modCount;
     //3、size就是每加入一个结点Node(k,v,h,next), size++
    if (++size > threshold)
        // 4、扩容操作
        resize();
    afterNodeInsertion(evict);
    return null;
}
```

5、调用`treeifyBin()`，在转成红黑树时，要进行判断。如果下面条件成立，先让`table`扩容，==只有下条件不成立时，才进行转成红黑树==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211002120712.png" style="zoom: 67%;" />	

点击`MIN_TREEIFY_CAPACITY`，查看最小值。

```java
/**
 * The smallest table capacity for which bins may be treeified.
 * (Otherwise the table is resized if too many nodes in a bin.)
 * Should be at least 4 * TREEIFY_THRESHOLD to avoid conflicts
 * between resizing and treeification thresholds.
*/
static final int MIN_TREEIFY_CAPACITY = 64;
```

6、执行执行`(F7)`,元素重复，节点添加失败。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211002130604.png" style="zoom:80%;" />

##### 12.7.4.4  扩容方法分析

1、`debug`下面代码，分析`HashSet`的扩容

```java
package cn.set.demo02;

import java.util.HashSet;

@SuppressWarnings({"all"})
public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        // 1、往集合中添加元素
        for(int i = 1; i <= 100; i++) {
            hashSet.add(i);
        }
    }
}
```

2、在程序中打上断点，直接进入方法体。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211002133911.png" style="zoom:67%;" />	

3、`HashSet`底层是`HashMap`，第一次添加时，`table` 数组扩容到`16`,临界值`(threshold)`是`16`，加载因子`(loadFactor)`是`0.75 = 12`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211002134342.png" style="zoom:80%;" />	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211002134930.png" style="zoom:80%;" />	

4、如果`table`数组使用到了临界值`12`，就会扩容到`16 * 2 = 32`，新的临界值就是`32*0.75 = 24`，然后依次类推。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211002140725.png)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211002141220.png)

##### 12.7.4.5  转成红黑树分析

1、`debug`下面代码，分析`HashSet`的扩容

```java
package cn.set.demo02;

import java.util.HashSet;

class A {
    private int n;

    public A(int n) {
        this.n = n;
    }
    @Override
    public int hashCode() {
        return 100;
    }
}

@SuppressWarnings({"all"})
public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        for(int i = 1; i <= 12; i++) {
            hashSet.add(new A(i));
        }
        System.out.println("hashset:" + hashSet);
    }
}
```

2、在程序中打上断点，直接进入方法体。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211002163652.png)

3、在`Java8`中如果一条链表的元素个数到达`TREEIFY THRESHOLD`【默认是8】，并且`table`的大小`>=MIN TREEIFY CAPACITY`【默认64】，==就会进行树化【红黑树】，否则仍然采用数组扩容机制==。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211002164421.png)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211002163929.png)

##### 12.7.4.6 HashSet经典案例

定义一个`Employee`类, 该类包含: `private`，成员属性`name`,`age`要求:创建`3`个`Employee`对象放入`HashSet`中。 当`name`和`age`的值相同时，认为是相同员工，不能添加到`HashSet`集合中。

```java
package cn.set.demo02;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("guardwhy", 18));//ok
        hashSet.add(new Employee("curry", 28));//ok
        hashSet.add(new Employee("guardwhy", 18));//加入不成功.
        System.out.println("hashSet=" + hashSet); // hashSet=[Employee{name='curry', age=28}, Employee{name='guardwhy', age=18}]
    }
}
//创建Employee
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
    //如果name和age值相同，则返回相同的hash值
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getAge() == employee.getAge() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
```

#### 12.7.5 LinkedHashSet类

##### 12.7.5.1  基本介绍

1、`LinkedHashSet`是`HashSet`的子类

2、`LinkedHashSet`底层是一个`LinkedHashMap`,==底层维护了一个数组+双向链表==。

3、`LinkedHashSet`根据元素的`hashCode`值来决定元素的存储位置，同时使用链表维护元素的次序(图)，这使得元素看起来是以插入顺序保存的。

4、`LinkedHashSet`不允许添重复元素。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211018131055.png)

##### 12.7.5.2 底层机制

`LinkedHashSet`类与`HashSet`类的==不同之处在于内部维护了一个双向链表，链表中记录了元素的迭代顺序，也就是元素插入集合中的先后顺序，因此便于迭代==。

```java
package cn.set.demo03;

import java.util.LinkedHashSet;
import java.util.Set;

// 1、创建Student类
class Student {
    private String name;
    private int no;

    public Student(String name, int no) {
        this.name = name;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}
@SuppressWarnings({"all"})
/**
 总结：
 如果希望元素可以重复，又有索引，查询要快用ArrayList集合。
 如果希望元素可以重复，又有索引，增删要快询要快用LinkedList集合。
 如果希望增删改查都很快，但是元素不重复以及无序无索引，那么用HashSet集合。
 如果希望增删改查都很快且有序，但是元素不重复以及无索引，那么用LinkedHashSet集合。
 */
public class LinkedHashSetSource {
    public static void main(String[] args) {
        //1.1 创建sets集合对象
        Set set = new LinkedHashSet();
        // 1.2 添加元素
        set.add(new String("Spring"));
        set.add(21);
        set.add(21);
        set.add(new Student("curry", 10));
        set.add(27);
        set.add("guardwhy");
        // 1.3 输出集合元素
        System.out.println("set=" + set); // set=[Spring, 21, Student{name='curry', no=10}, 27, guardwhy]
    }
}

```

2、底层机制示意图

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211018210410.png" style="zoom: 67%;" />	

具体说明

- 在`LinkedHastSet` 中维护了一个`hash`表和双向链表(==LinkedHashSet有head和tail== )

- 每一个节点有`before`和`after`属性,这样可以形成双向链表。

- 在添加一个元素时，先求`hash`值，在求索引位置。确定该元素在`table`的位置，然后将添加的元素加入到双向链表(如果已经存在，不添加<font color = red>**[原则和hashset一样]**</font>)


```java
tail.next = newElement;
newElement.pre = tail;
tail = newEelment;
```

- 这样的话，遍历`LinkedHashSet`也能确保插入顺序和遍历顺序一致。


##### 12.7.5.3 源码分析

1、创建`set`对象，在程序中打上断点，直接进入方法体

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211019105641.png" style="zoom:80%;" />	

2、`LinkedHashSet` 加入顺序和取出元素/数据的顺序一致，`LinkedHashSet` 底层维护的是一个`LinkedHashMap`(是`HashMap`的子类)。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211019110226.png" style="zoom: 67%;" />	

3、`LinkedHashSet` 底层结构 (数组`table`+双向链表)，添加第一次时，直接将 数组table 扩容到 16 ,存放的结点类型是`LinkedHashMap$Entry`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211019110831.png" style="zoom: 67%;" />	

4、数组是`HashMap$Node[]` 存放的元素/数据是`LinkedHashMap$Entry`类型，点击`LinkedHashMap`的源码，查看`entry`相关信息。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211019111628.png" style="zoom:67%;" />	

5、再次添加节点，添加过程和`hashset`添加元素比较一样，元素存在不添加，不存在则添加

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211019112036.png" style="zoom: 67%;" />	

6、输出集合

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211019113814.png" style="zoom:80%;" />	

##### 12.7.5.4 案例实现

创建一个`Car`类(属性:`name`,`price`)，如果 `name`和`price` 一样，则认为是相同元素，就不能添加。

```java
package cn.collections.demo03;

import java.util.LinkedHashSet;
import java.util.Objects;

class Car {
    private String name;
    private double price;
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // 重写equals方法和hashCode,当name和price相同时，就返回相同的hashCode值, equals返回true。

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

@SuppressWarnings({"all"})
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        // 1、创建linkedHashSet集合对象
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        // 2、往集合中添加元素
        linkedHashSet.add(new Car("奥拓", 1000));//OK
        linkedHashSet.add(new Car("奥迪", 300000));//OK
        linkedHashSet.add(new Car("法拉利", 10000000));//OK
        linkedHashSet.add(new Car("奥迪", 300000));//加入不了
        linkedHashSet.add(new Car("保时捷", 70000000));//OK
        linkedHashSet.add(new Car("奥迪", 300000));//加入不了
        // 3、输出元素
        System.out.println("linkedHashSet=" + linkedHashSet);
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211022214222.png" style="zoom: 80%;" />	

#### 12.7.6 TreeSet类

##### 12.7.6.1 TreeSet基本特点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211019143603.png" style="zoom:67%;" />	

- TreeSet类的底层是采用红黑树进行数据管理的，因此元素有大小次序，默认从小到大打印。
- 新元素插入到TreeSet集合时，需要使用新元素与集合中已有的元素依次比较来确定新元素的合理位置。

```java
package cn.guardwhy_07;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        // 1.准备一个TreeSet集合并打印
        Set<String> s1 = new TreeSet<>();
        System.out.println("s1 = " + s1); // [啥也没有]

        // 2.向集合中添加String类型的对象并打印
        boolean b1 = s1.add("aa");
        System.out.println("b1 = " + b1); // true
        System.out.println("s1 = " + s1); // [aa]

        b1 = s1.add("cc");
        System.out.println("b1 = " + b1); // true
        System.out.println("s1 = " + s1); // [aa, cc]

        b1 = s1.add("bb");
        System.out.println("b1 = " + b1); // true
        // 由于TreeSet集合的底层是采用红黑树实现的，因此元素有大小次序，默认从小到大打印
        System.out.println("s1 = " + s1); // [aa, bb, cc]
    }
}
```

##### 12.7.6.2 自然排序

使用元素的自然排序规则进行比较并排序，让元素类型实现`java.lang.Comparable`接口

```java
package cn.set.demo04;

import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
     * 自然排序
     */
    @Override
    public int compareTo(Student o) {
        /*
            // 1.姓名比较
            int compare = this.getName().compareTo(o.getName());
            if(0 == compare){
                // 2.年龄比较
                return this.getAge() - o.getAge();
            }
            // 3.返回比较器
            return compare;
        */

        // 2.简化写法
        // 2.1 姓名比较
        int compare = this.getName().compareTo(o.getName());
        // 2.年龄比较
        return 0 != compare ? compare : this.getAge() - o.getAge();
    }
}
public class TreeSetTest02 {
    public static void main(String[] args) {
        // 1.准备一个TreeSet集合并放入Student类型的对象
        Set<Student> s1 = new TreeSet<>();
        // 2.添加到集合
        s1.add(new Student("kobe", 41));
        s1.add(new Student("curry", 10));
        s1.add(new Student("james", 36));
        s1.add(new Student("kobe", 38));
        // 3.输出结果
        System.out.println("s1=" + s1);
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021153017.png)

##### 12.7.6.3 比较器排序

- 使用比较器规则进行比较并排序，构造TreeSet集合时传入`java.util.Comparator`接口。
- 自然排序的规则比较单一，而比较器的规则比较多元化，而且比较器优先于自然排序。

```java
package cn.set.demo05;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TreeSetTest03 {
    public static void main(String[] args) {
        // 4. 匿名比较器对象作为参数传递给构造方法
        /*
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            // 3.1 准备一个比较器对象作为参数传递给构造方法
            public int compare(Person o1, Person o2) {
                // 3.2 表示按照年龄比较
                return o1.getAge() - o2.getAge();
                }
            };
        */
        // 5.从Jdk1.8支持Lambda表达式: (参数列表) -> { 方法体 }
        Comparator<Person> comparator = (Person o1, Person o2)->{
            return o1.getAge() - o2.getAge();
        };

        // 1.准备一个TreeSet集合并放入Person类型的对象
        Set<Person> s1 = new TreeSet<>(comparator);
        // 2.添加到集合
        s1.add(new Person("kobe", 41));
        s1.add(new Person("curry", 10));
        s1.add(new Person("James", 36));
        s1.add(new Person("kobe", 38));
        // 3.输出结果
        System.out.println("s1=" + s1);
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021154330.png)

##### 12.7.6.4 TreeSet源码分析

1、创建`set`对象，在程序中打上断点，直接进入方法体

```java
package cn.set.demo06;

import java.util.Comparator;
import java.util.TreeSet;
@SuppressWarnings({"all"})
public class TreeSetDemo01 {
    public static void main(String[] args) {
        // 1.1 创建treeSet对象
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //1.2 调用String的 compareTo方法进行字符串大小比较
                return ((String) o2).compareTo((String) o1);
            }
        });
        //1.3 往treeSet中添加数据
        treeSet.add("curry");
        treeSet.add("kobe");
        treeSet.add("a");
        treeSet.add("ab");
        treeSet.add("abc");
        System.out.println("treeSet=" + treeSet); // treeSet=[kobe, curry, abc, ab, a]

    }
}
```

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021165536.png" style="zoom:80%;" />	

2、执行`(Alt +shift + F7)`操作，然后退出，直到进入`TreeSet()`方法。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021170011.png" style="zoom:80%;" />	

继续执行`(Alt +shift + F7)`操作，==new TreeSet 最终就是将匿名对象传给了TreeMap里面的comparator属性==`(this.comparator)`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021170204.png" style="zoom:80%;" />	

3、退出该方法，继续执行`(F7)`操作，执行`add()`方法。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021170728.png" style="zoom:80%;" />	

4、已经添加一个元素的情况下，开始添加第二个元素。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021171028.png" style="zoom:67%;" />	

 5、在 调用`treeSet.add("kobe"),` 在底层会执行到以下源码

```java
public V put(K key, V value) {
    Entry<K,V> t = root;
    if (t == null) {
        compare(key, key); // type (and possibly null) check

        root = new Entry<>(key, value, null);
        size = 1;
        modCount++;
        return null;
    }
    int cmp;
    Entry<K,V> parent;
    // cpr就是匿名内部类(对象)
    Comparator<? super K> cpr = comparator;
    if (cpr != null) {
        do {
            parent = t;
            //动态绑定到我们的匿名内部类(对象)compare
            cmp = cpr.compare(key, t.key);
            if (cmp < 0)
                t = t.left;
            else if (cmp > 0)
                t = t.right;
            else
                //如果相等，即返回0,这个Key就没有加入
                return t.setValue(value);
        } while (t != null);
    }
    else {
        if (key == null)
            throw new NullPointerException();
        @SuppressWarnings("unchecked")
        Comparable<? super K> k = (Comparable<? super K>) key;
        do {
            parent = t;
            cmp = k.compareTo(t.key);
            if (cmp < 0)
                t = t.left;
            else if (cmp > 0)
                t = t.right;
            else
                return t.setValue(value);
        } while (t != null);
    }
    Entry<K,V> e = new Entry<>(key, value, parent);
    if (cmp < 0)
        parent.left = e;
    else
        parent.right = e;
    fixAfterInsertion(e);
    size++;
    modCount++;
    return null;
}
```

继续执行下一步(`f7`)操作，比较成功！！！！

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021171939.png" style="zoom:80%;" />	

### 12.8 Map集合

#### 12.8.1 Map集合的体系

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211019144618.png" style="zoom: 67%;" />	

1、`java.util.Map<K,V>`集合中存取元素的基本单位是：单对元素，其中类型参数如下：

```java
K - 此映射所维护的键(Key)的类型，相当于目录。
V - 映射值(Value)的类型，相当于内容。
```

2、<font color = red>该集合中`key`是不允许重复的，而且一个`key`只能对应一个`value`</font>。

3、该集合的主要实现类有：`HashMap`类、`TreeMap`类、`LinkedHashMap`类、`Hashtable`类、`Properties`类。

#### 12.8.2 Map接口的特点

1、`Map`与`Collection`并列存在，用于保存具有映射关系的数据:`Key-Value`。

2、Map中的key和value可以是任何引用类型的数据，会封装到==HashMap$Node==对象中。

3、Map中的key不允许重复，原因和HashSet一样，前面分析过源码.

4、==Map中的value可以重复==。

5、Map的key可以为null, value也可以为null，==注意key为null,只能有一个，value为null ,可以多个==。

6、常用String类作为Map的key，key和value之间存在单向对一关系，即通过指定的key总能找到对应的value。

```java
package cn.map.demo01;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"all"})
public class MapDemo01 {
    public static void main(String[] args) {
        // 1、创建map集合
        Map map = new HashMap();
        //2、向集合中添加元素
        map.put(1,"小米");
        map.put(2,"苹果");//k-v
        map.put(1,"oppo");//当有相同的k,就等价于替换。
        map.put(3,"oppo");//k-v
        map.put(null, null); //k-v
        map.put(null, "华为"); //等价替换
        map.put("4", null); //k-v
        map.put("5", null); //k-v
        map.put(6, "魅族");//k-v
        map.put(new Object(), "三星");//k-v
        //3、通过get方法，传入key ,会返回对应的value
        System.out.println(map.get(2));// 苹果

        System.out.println("map=" + map);
        // map={null=华为, 1=oppo, 2=苹果, 3=oppo, 4=null, 5=null, 6=魅族, java.lang.Object@1540e19d=三星}
    }
}
```

8、一对`k-v`是放在一个==HashMap$Node==中的， 因为Node实现了Entry 接口，也可以说一对`k-v`就是一个`Entry`

8.1、进入HashMap的源码，查看`putVal()`方法

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211019201359.png" style="zoom:80%;" />	

8.2、点击`newNode()`方法，查看具体返回值

```java
// Create a regular (non-tree) node
Node<K,V> newNode(int hash, K key, V value, Node<K,V> next) {
    return new Node<>(hash, key, value, next);
}
```

8.3、再次点击`Node`，看出Node实现了Entry这个接口，从而得出`Map`集合是将`K-V`放到`node`里面去

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211019201809.png" style="zoom:67%;" />	

8.4、代码示例，查看具体结果

```java
package cn.map.demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
class Car {

}

class Person{

}

@SuppressWarnings({"all"})
public class MapDemo01 {
    public static void main(String[] args) {
        // 1.1 创建map对象
        Map map = new HashMap();
        map.put("map1", "james");//k-v
        map.put("map2", "curry");//k-v
        map.put(new Car(), new Person());//k-v

        //1.2 k-v 最后是 HashMap$Node node = newNode(hash, key, value, null)

        /**
         * 1.3 k-v为了方便程序员的遍历，还会创建 EntrySet集合 ，该集合存放的元素的类型 Entry, 而一个Entry
         * 对象就有k,v EntrySet<Entry<K,V>> 即： transient Set<Map.Entry<K,V>> entrySet;
         */
        Set set = map.entrySet();
        /**
         * 1.4 entrySet中，定义的类型是 Map.Entry，但是实际上存放的还是HashMap$Node
           这时因为 static class Node<K,V> implements Map.Entry<K,V>
         */
        System.out.println(set.getClass());// HashMap$EntrySet
        for (Object obj : set) {

            //System.out.println(obj.getClass()); //HashMap$Node
            //1.5 为了从 HashMap$Node 取出k-v,应该先做一个向下转型。
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
```

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211019205713.png" style="zoom: 80%;" />	

8.5、当把 ==HashMap$Node== 对象存放到 `entrySet` 就方便遍历, 因为 Map.Entry 提供了这两个重要方法`K getKey(); V getValue();`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211019210249.png" style="zoom:80%;" />	

#### 12.8.3 HashMap类

##### 12.8.3.1 HashMap类特点

- HashMap类的==底层是采用哈希表进行数据管理的==。

- LinkedHashMap类与HashMap类的==不同之处在于内部维护了一个双向链表，链表中记录了元素的迭代顺序，也就是元素插入集合中的先后顺序，因此便于迭代==。


##### 12.8.3.2  元素放入HashMap

- 使用元素的key调用hashCode方法获取对应的哈希码值，再由某种哈希算法计算在数组中的索引位置。
- 若该位置没有元素，则将该键值对直接放入即可。
- 若该位置有元素，则使用key与已有元素依次比较哈希值，若哈希值不相同，则将该元素直接放入。
- 若key与已有元素的哈希值相同，则使用key调用equals方法与已有元素依次比较。若相等则将对应的value修改，否则将键值对直接放入即可。

```java
package cn.guardwhy_01;

import java.util.HashMap;
import java.util.Map;

/**
 Map集合概述:
     Map集合是一种双列集合，每个元素包含两个值。
     Map集合的每个元素的格式：key=value(键值对元素)。
     Map集合也被称为键值对集合。

Map集合的特点：
     1.Map集合的特点都是由键决定的。
     2.Map集合的键是无序不重复的，无索引的。Map集合后面重复的键对应的元素会覆盖前面的整个元素！
     3.Map集合的值无要求。
     4.Map集合的键值对都可以为null。
 */
public class MapDemo01 {
    public static void main(String[] args) {
        // 创建Map集合对象
        Map<String, Integer> shops = new HashMap<>();
        // 向集合中添加元素
        shops.put("小米",10);
        shops.put("小米",30); // 键重复了，后面的覆盖前面的整个元素
        shops.put("huawei",1000);
        shops.put("iphone11",1);
        shops.put("iphone11",2);
        shops.put("三星",2);
        shops.put(null,null);

        // 输出map集合
        System.out.println("map集合:" + shops);  // map集合:{null=null, huawei=1000, iphone11=2, 小米=30, 三星=2}
    }
}
```

##### 12.8.3.3 常用的方法

| 方法声明                              | 功能介绍                                                     |
| ------------------------------------- | ------------------------------------------------------------ |
| V put(K key, V value)                 | 将Key-Value对存入Map，若集合中已经包含该Key，则替换该Key所对<br/>应的Value，返回值为该Key原来所对应的Value，若没有则返回null |
| V get(Object key)                     | 返回与参数Key所对应的Value对象，如果不存在则返回null         |
| boolean containsKey(Object key)       | 判断集合中是否包含指定的Key                                  |
| boolean containsValue (Object value); | 判断集合中是否包含指定的Value                                |
| V remove(Object key)                  | 根据参数指定的key进行删除                                    |

```java
package cn.guardwhy_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 Map集合的常用API:
     - public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
     - public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
     - public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
     - public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
     - public boolean containKey(Object key):判断该集合中是否有此键。
 */
public class MapDemo02 {
    public static void main(String[] args) {
       // 1.创建Map集合对象
        Map<String, Integer> maps = new HashMap<>();
        // 2.向集合中添加元素
        maps.put("小米",3000);
        maps.put("huawei",1000);
        maps.put("iphone11",6700);
        maps.put("iphone11",8000);
        maps.put("三星",4500);
        // 3.输出map集合
        System.out.println("map集合:" + maps);    // map集合:{huawei=1000, iphone11=8000, 小米=3000, 三星=4500}

        // size:获取元素个数
        System.out.println("元素个数:" + maps.size());  // 元素个数:4
        // 4.根据键取值
        System.out.println("根据键取值:" + maps.get("小米"));  // 根据键取值:3000
        // 5.根据键删除整个键值对元素。
        System.out.println("移除键:" + maps.remove("小米"));
        // map集合(删除键值对):{huawei=1000, iphone11=8000, 三星=4500}
        System.out.println("map集合(删除键值对):" + maps);

        // 6.获取全部键的集合。因为键是无序不重复的,返回的是Set集合
        Set<String> keys = maps.keySet();
        // maps的键值:[huawei, iphone11, 三星]
        System.out.println("maps的key:" + keys);

        // 7.获取全部值的集合
        Collection<Integer> values = maps.values();
        System.out.println("maps的value:" + values);  // maps的值:[1000, 8000, 4500]

        // 8.判断集合是否包含某个值
        System.out.println(maps.containsValue(1000));   // true
        System.out.println(maps.containsValue(800));    // false
        System.out.println(maps.containsValue(4500));   // true
    }
}
```

##### 12.8.3.4 遍历Map集合

1、键找值的方式遍历

```java
package cn.guardwhy_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
Map集合的遍历
 Map集合的遍历方式：3种。
 （1）键找值的方式遍历：先拿到所有的键，再遍历键获取对应值。（最简单的）
 （2）键值对方式遍历。
 （3）JDK 1.8开始的新技术（普遍使用了）

 1.键找值的方式遍历：先拿到所有的键，再遍历键获取对应值。（最简单的）
 */
public class MapDemo03 {
    public static void main(String[] args) {
        // 创建Map集合对象
        Map<String, Integer> maps = new HashMap<>();
        // 向集合中添加元素
        maps.put("小米",30);
        maps.put("huawei",10);
        maps.put("iphone11",67);
        maps.put("iphone11",80);
        maps.put("三星",45);
        // 取得Map集合的全部键
        Set<String> keys = maps.keySet();
        // 遍历键找到相应的值
        for(String key : keys){
            // 根据键找到相应的值
            Integer value = maps.get(key);
            // 输出结果
            System.out.println(key + "==>" + value);
        }
    }
}
```

2、键值对方式遍历

```java
package cn.guardwhy_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 Map集合的遍历。

 Map集合的遍历方式：3种。
 （1）键找值的方式遍历：先拿到所有的键，再遍历键获取对应值。
 （2）键值对方式遍历.
 （3）JDK 1.8开始的新技术

 2.键值对方式遍历
 */
public class MapDemo04 {
    public static void main(String[] args) {
        // 创建Map集合对象
        Map<String, Integer> maps = new HashMap<>();
        // 向集合中添加元素
        maps.put("小米",30);
        maps.put("huawei",10);
        maps.put("iphone11",67);
        maps.put("iphone11",80);
        maps.put("三星",45);
        // 遍历集合
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            // 取键
            String key = entry.getKey();
            // 取值
            Integer value = entry.getValue();
            System.out.println(key + "==>" + value);
        }
    }
}
```

3、jdk1.8新技术

```java
package cn.guardwhy_01;
/**
 Map集合的遍历方式：3种。
 （1）键找值的方式遍历：先拿到所有的键，再遍历键获取对应值。（最简单的）
 （2）键值对方式遍历。（老程序员用的多，更面向对象的遍历思想）
 （3）JDK 1.8开始的新技术（普遍使用了）

 3.JDK 1.8开始的新技术（普遍使用了）
 */
import java.util.HashMap;
import java.util.Map;

public class MapDemo05 {
    public static void main(String[] args) {
        // 创建Map集合对象
        Map<String, Integer> maps = new HashMap<>();
        // 向集合中添加元素
        maps.put("小米",30);
        maps.put("huawei",10);
        maps.put("iphone11",67);
        maps.put("iphone11",80);
        maps.put("三星",45);

        // 遍历集合
        maps.forEach((k, v) ->{
            System.out.println(k + "==>" + v);
        });
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se1/14-javase.png" style="zoom:80%;" />	

##### 12.8.3.5 案例分析

使用`HashMap`添加3个员工对象，要求键:员工`id` 值:员工对象并遍历显示工资> 18000的员工(遍历方式最少两种)员工类:姓名、工资、员工id

```java
package cn.map.demo02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        // 1.1 、创建hashMap对象
        Map hashMap = new HashMap();
        //1.2 添加对象
        hashMap.put(1, new Emp("jack", 300000, 1));
        hashMap.put(2, new Emp("tom", 21000, 2));
        hashMap.put(3, new Emp("milan", 12000, 3));

        //遍历2种方式
        //并遍历显示工资>18000的员工(遍历方式最少两种)
        //2.1使用keySet  -> 增强for
        Set keySet = hashMap.keySet();
        System.out.println("====第一种遍历方式====");
        for (Object key : keySet) {
            //先获取value
            Emp emp = (Emp) hashMap.get(key);
            if(emp.getSal() >18000) {
                System.out.println(emp);
            }
        }

        //2. 使用EntrySet -> 迭代器
        Set entrySet = hashMap.entrySet();
        System.out.println("======迭代器======");
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            //通过entry 取得key 和 value
            Emp emp = (Emp) entry.getValue();
            if(emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }
    }
}
/**
 * 使用HashMap添加3个员工对象，要求
 * 键：员工id
 * 值：员工对象
 * 并遍历显示工资>18000的员工(遍历方式最少两种)
 * 员工类：姓名、工资、员工id
 */
class Emp {
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211019214702.png" style="zoom: 67%;" />	

小结

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211019214906.png" style="zoom: 67%;" />	

##### 12.8.3.6 HashMap底层机制

1、基本概念

- `(k,v)` 是一个Node实现了`Map.Entry<K,V>`，查看`HashMap`的源码可以看到。
- `jdk7.0`的`hashmap`底层实现==[数组+链表]==，`jdk8.0`底层==[数组+链表+红黑树]==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211020110527.png" style="zoom: 67%;" />	

2、底层机制

- `HashMap`底层维护了`Node`类型的数组`table`，默认为`null`。
- 当创建对象时，将加载因子==(loadfactor)==初始化为`0.75`。
- 当添加==key-val==时，通过`key`的哈希值得到在`table`的索引。==然后判断该索引处是否有元素，如果没有元素直接添加==。如果该索引处有元素，继续判断该元素的key和准备加入的key相是否等，如果相等，则直接替换`val`;如果不相等需要判断是树结构还是链表结构，做出相应处理。如果添加时发现容量不够，则需要扩容。
- 第1次添加，则需要扩容`table`容量为`16`,临界值==(threshold)为12 (1 6*0.75)==。
- <font color = red>以后再扩容，则需要扩容table容量为原来的2倍(32),临界值为原来的2倍,即24,依次类推</font>。
- 在Java8中，如果一条链表的元素个数超过 ==TREEIFY THRESHOLD(默认是8)==，并且==table的大小>= MIN TREEIFY CAPACITY(默认64)==,就会进行树化(红黑树)。

##### 12.8.3.7 HashMap源码分析

1、`debug`下面代码，分析`HashMap`源码

```java
package cn.map.demo03;

import java.util.HashMap;

@SuppressWarnings({"all"})
public class HashMapSource1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("java", 10);//ok
        map.put("php", 10);//ok
        map.put("java", 20);//替换value

        System.out.println("map=" + map);//map={java=20, php=10}
    }
}
```

2、使用无参构造器创建`map`对象，在程序中打上断点，直接进入方法体

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211020151022.png" style="zoom: 67%;" />	

3、初始化加载因子 ==loadfactor = 0.75，HashMap$Node[] table = null==。

```java
/**
 * Constructs an empty <tt>HashMap</tt> with the default initial capacity
 * (16) and the default load factor (0.75).
*/
public HashMap() {
    this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted
}
```

4、进入方法中(`F7`)，进入装箱操作源码。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211020151532.png" style="zoom:80%;" />	

5、map集合首次执行put方法

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211020151716.png)

5、执行`step + into`操作，进入`hash(key)`方法，计算 key的`hash`值 ==(h = key.hashCode()) ^ (h >>> 16)==

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211020152121.png" style="zoom: 80%;" />	

6、执行`putVal()`方法，首次添加元素操作

```java
/**
   * Implements Map.put and related methods
   * @param hash hash for key
   * @param key the key
   * @param value the value to put
   * @param onlyIfAbsent if true, don't change existing value
   * @param evict if false, the table is in creation mode.
   * @return previous value, or null if none
*/
final V putVal(int hash, K key, V value, boolean onlyIfAbsent,boolean evict) {
    // 辅助变量
    Node<K,V>[] tab; Node<K,V> p; int n, i;
     // 如果底层的table 数组为null, 或者 length =0 , 就扩容到16
    if ((tab = table) == null || (n = tab.length) == 0)
        // 进入 resize()方法
        n = (tab = resize()).length;
    //取出hash值对应的table的索引位置的Node, 如果为null, 就直接把加入的k-v,创建成一个 Node ,加入该位置即可。
    if ((p = tab[i = (n - 1) & hash]) == null)
        tab[i] = newNode(hash, key, value, null);
    else {
        ......
    }
    //每增加一个Node ,就size++
    ++modCount;
    //如果size > 临界值，就扩容
    if (++size > threshold)
        resize();
    afterNodeInsertion(evict);
    return null;
}
```

7、点击`STEP into`，，进入`resize()`方法。

```java
/**
 * Initializes or doubles table size.  If null, allocates in
 * accord with initial capacity target held in field threshold.
 * Otherwise, because we are using power-of-two expansion, the
 * elements from each bin must either stay at same index, or move
 * with a power of two offset in the new table.
 * @return the table
*/
final Node<K,V>[] resize() {
    Node<K,V>[] oldTab = table;
    int oldCap = (oldTab == null) ? 0 : oldTab.length;
    int oldThr = threshold;
    // 设置当前的临界值
    int newCap, newThr = 0;
    if (oldCap > 0) {
        if (oldCap >= MAXIMUM_CAPACITY) {
            threshold = Integer.MAX_VALUE;
            return oldTab;
        }
        else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
                 oldCap >= DEFAULT_INITIAL_CAPACITY)
            newThr = oldThr << 1; // double threshold
    }
    else if (oldThr > 0) // initial capacity was placed in threshold
        newCap = oldThr;
    else {
        // 默认初始化的临界值等于16
        newCap = DEFAULT_INITIAL_CAPACITY;
        newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
    }
    if (newThr == 0) {
        float ft = (float)newCap * loadFactor;
        newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
                  (int)ft : Integer.MAX_VALUE);
    }
    threshold = newThr;
    @SuppressWarnings({"rawtypes","unchecked"})
    // 核心代码块
    Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];
    table = newTab;
    if (oldTab != null) {
        for (int j = 0; j < oldCap; ++j) {
            Node<K,V> e;
            if ((e = oldTab[j]) != null) {
                oldTab[j] = null;
                if (e.next == null)
                    newTab[e.hash & (newCap - 1)] = e;
                else if (e instanceof TreeNode)
                    ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
                else { // preserve order
                    Node<K,V> loHead = null, loTail = null;
                    Node<K,V> hiHead = null, hiTail = null;
                    Node<K,V> next;
                    do {
                        next = e.next;
                        if ((e.hash & oldCap) == 0) {
                            if (loTail == null)
                                loHead = e;
                            else
                                loTail.next = e;
                            loTail = e;
                        }
                        else {
                            if (hiTail == null)
                                hiHead = e;
                            else
                                hiTail.next = e;
                            hiTail = e;
                        }
                    } while ((e = next) != null);
                    if (loTail != null) {
                        loTail.next = null;
                        newTab[j] = loHead;
                    }
                    if (hiTail != null) {
                        hiTail.next = null;
                        newTab[j + oldCap] = hiHead;
                    }
                }
            }
        }
    }
    return newTab;
}
```

8、key值不一样，添加操作与首次put元素操作一样。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211020180702.png" style="zoom: 80%;" />	

9、第三次添加元素，判断java的`hash`值。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211020180941.png)

10、进入`putVal()`方法

```java
/**
   * Implements Map.put and related methods
   * @param hash hash for key
   * @param key the key
   * @param value the value to put
   * @param onlyIfAbsent if true, don't change existing value
   * @param evict if false, the table is in creation mode.
   * @return previous value, or null if none
*/
final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
               boolean evict) {
    Node<K,V>[] tab; Node<K,V> p; int n, i;
    if ((tab = table) == null || (n = tab.length) == 0)
        n = (tab = resize()).length;
    if ((p = tab[i = (n - 1) & hash]) == null)
        tab[i] = newNode(hash, key, value, null);
    else {
        Node<K,V> e; K k;//辅助变量
        
        /*
			如果table的索引位置的key的hash相同和新的key的hash值相同，并满足(table现有的结点的key和准备添加的key是同一个对象|| equals返回真)
			就认为不能加入新的k-v
        */
        if (p.hash == hash &&((k = p.key) == key || (key != null && key.equals(k))))
            e = p;
        //如果当前的table的已有的Node 是红黑树，就按照红黑树的方式处理
        else if (p instanceof TreeNode)
            e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
        //如果找到的结点，后面是链表，就循环比较
        else { 
            for (int binCount = 0; ; ++binCount) { //死循环
                //如果整个链表，没有和他相同,就加到该链表的最后
                if ((e = p.next) == null) {
                    p.next = newNode(hash, key, value, null);
                    //加入后，判断当前链表的个数，是否已经到8个，到8个后就调用 treeifyBin 方法进行红黑树的转换
                    if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                        treeifyBin(tab, hash);
                    break;
                }
                //如果在循环比较过程中，发现有相同,就break,就只是替换value
                if (e.hash == hash &&((k = e.key) == key || (key != null && key.equals(k))))
                    break;
                p = e;
            }
        }
        if (e != null) { // existing mapping for key
            V oldValue = e.value;
            if (!onlyIfAbsent || oldValue == null)
                //替换，key对应value
                e.value = value;
            afterNodeAccess(e);
            // 最终返回oldValue
            return oldValue;
        }
    }
    //每增加一个Node ,就size++
    ++modCount;
    if (++size > threshold)
        // 扩容操作
        resize();
    afterNodeInsertion(evict);
    return null;
}
```

11、关于树化(转成红黑树)

```java
/**
 * Replaces all linked nodes in bin at index for given hash unless
 * table is too small, in which case resizes instead.
*/
final void treeifyBin(Node<K,V>[] tab, int hash) {
    // 辅助变量
    int n, index; Node<K,V> e; 
    //如果table为null ,或者大小还没有到 64，暂时不树化，而是进行扩容.否则才会真正的树化 -> 剪枝
    if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
        resize();
    else if ((e = tab[index = (n - 1) & hash]) != null) {
        TreeNode<K,V> hd = null, tl = null;
        do {
            TreeNode<K,V> p = replacementTreeNode(e, null);
            if (tl == null)
                hd = p;
            else {
                p.prev = tl;
                tl.next = p;
            }
            tl = p;
        } while ((e = e.next) != null);
        if ((tab[index] = hd) != null)
            hd.treeify(tab);
    }
}
```

#### 12.9.4 HashTable类

##### 12.9.4.1 HashTable使用

1、基本特点

- 存放的元素是键值对: 即==K-V==
- `hashTable`的键和值都不能为`null`, 否则会抛出==NullPointerException==。
- hashTable使用方法基本上和HashMap一样。
- hashTable是线程安全的==(synchronized)==, hashMap是线程不安全的。

```java
package cn.map.demo04;

import java.util.Hashtable;
@SuppressWarnings({"all"})
public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();//ok
        table.put("curry", 10); //ok
        //table.put(null, 22); //异常 NullPointerException
        //table.put("curry", null);//异常 NullPointerException
        table.put("kobe", 31);//ok
        table.put("james", 15);//ok
        table.put("james", 40);//替换
        table.put("乔尔·恩比德", 23);
        table.put("尼古拉·约基奇", 26);
        table.put("安东尼·唐斯", 27);
        table.put("保罗·乔治", 18);
        table.put("吉米·巴特勒", 24);
        table.put("詹姆斯·哈登", 30);
        System.out.println("table:" + table);
        //table:{james=40, 詹姆斯·哈登=30, 乔尔·恩比德=23, 尼古拉·约基奇=26, 保罗·乔治=18, 
        // 吉米·巴特勒=24, curry=10, kobe=31, 安东尼·唐斯=27}
    }
}
```

##### 12.9.4.2 HashTable扩容

1、使用无参构造器创建`table`对象，在程序中打上断点，直接进入方法体

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021082604.png" style="zoom: 67%;" />	

2、底层有数组 ==Hashtable$Entry[]== 初始化大小为 11，临界值 ==threshold 8 = 11 \* 0.75==。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021093318.png)

3、`put()`方法，执行添加元素操作拿到`key`，进行一个计算得到该元素在`table`表中的某个索引，然后将该键值对封装到`Entry`对象中去，然后放到`table`中去

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021094121.png" style="zoom:67%;" />	

 <img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021094205.png" style="zoom: 67%;" />

4、执行`put()`方法，替换vaule值。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021100206.png" style="zoom:80%;" />

```java
public synchronized V put(K key, V value) {
        // Make sure the value is not null
        if (value == null) {
            throw new NullPointerException();
        }

        // Makes sure the key is not already in the hashtable.
        Entry<?,?> tab[] = table;
        int hash = key.hashCode();
        int index = (hash & 0x7FFFFFFF) % tab.length;
        @SuppressWarnings("unchecked")
        Entry<K,V> entry = (Entry<K,V>)tab[index];
        for(; entry != null ; entry = entry.next) {
            if ((entry.hash == hash) && entry.key.equals(key)) {
                V old = entry.value;
                entry.value = value;
                return old;
            }
        }

        addEntry(hash, key, value, index);
        return null;
    }
```

替换`value`成功

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021100308.png" style="zoom: 67%;" />	

5、按照自己的扩容机制来进行即可，在程序中打上断点，直接进入方法体

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021103824.png)

 执行`put()`方法，当值为`null`的时候抛出异常，在`addEntry()`打上断点。

```java
public synchronized V put(K key, V value) {
    // Make sure the value is not null
    if (value == null) {
        throw new NullPointerException();
    }

    // Makes sure the key is not already in the hashtable.
    Entry<?,?> tab[] = table;
    int hash = key.hashCode();
    int index = (hash & 0x7FFFFFFF) % tab.length;
    @SuppressWarnings("unchecked")
    Entry<K,V> entry = (Entry<K,V>)tab[index];
    for(; entry != null ; entry = entry.next) {
        if ((entry.hash == hash) && entry.key.equals(key)) {
            V old = entry.value;
            entry.value = value;
            return old;
        }
    }

    addEntry(hash, key, value, index);
    return null;
}
```

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021104401.png" style="zoom:80%;" />	

执行方法 ==addEntry(hash, key, value, index)：添加K-V 封装到Entry==

```java
private void addEntry(int hash, K key, V value, int index) {
    modCount++;

    Entry<?,?> tab[] = table;
    if (count >= threshold) {
        // 当if (count >= threshold)满足时，就进行扩容
        rehash();

        tab = table;
        hash = key.hashCode();
        index = (hash & 0x7FFFFFFF) % tab.length;
    }

    // Creates the new entry.
    @SuppressWarnings("unchecked")
    Entry<K,V> e = (Entry<K,V>) tab[index];
    tab[index] = new Entry<>(hash, key, value, e);
    count++;
}
```

进入`rehash()`方法，最终扩容成功！！！

```java
protected void rehash() {
        int oldCapacity = table.length;
        Entry<?,?>[] oldMap = table; 
       // 按照int newCapacity = (oldCapacity << 1) + 1;的大小扩容.
        int newCapacity = (oldCapacity << 1) + 1;
        if (newCapacity - MAX_ARRAY_SIZE > 0) {
            if (oldCapacity == MAX_ARRAY_SIZE)
                // Keep running with MAX_ARRAY_SIZE buckets
                return;
            newCapacity = MAX_ARRAY_SIZE;
        }
        Entry<?,?>[] newMap = new Entry<?,?>[newCapacity];

        modCount++;
        threshold = (int)Math.min(newCapacity * loadFactor, MAX_ARRAY_SIZE + 1);
        table = newMap;

        for (int i = oldCapacity ; i-- > 0 ;) {
            for (Entry<K,V> old = (Entry<K,V>)oldMap[i] ; old != null ; ) {
                Entry<K,V> e = old;
                old = old.next;

                int index = (e.hash & 0x7FFFFFFF) % newCapacity;
                e.next = (Entry<K,V>)newMap[index];
                newMap[index] = e;
            }
        }
    }
```

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021112930.png" style="zoom: 67%;" />

##### 12.9.4.3 Hashtable和HashMap对比

| Map集合   | 版本 | 线程安全(同步) | 效率 | 允许null键nul值 |
| --------- | ---- | -------------- | ---- | --------------- |
| HashMap   | 1.2  | 不安全         | 高   | 可以            |
| HashTable | 1.0  | 安全           | 较低 | 不可以          |

##### 12.9.4.3 Properties类

1、基本介绍

- `Properties`类继承自`Hashtable`类并且实现了`Map`接口，也是使用一种键值对的形式来保存数据，它的使用特点和`Hashtable`类似。
- `Properties` 还可以用于从`xxx.properties`文件中，加载数据到`Properties`类对象，并进行读取和修改。
- `xx.properties`文件通常作为配置文件，在项目中使用。

```java
package cn.map.demo04;

import java.util.Properties;

@SuppressWarnings({"all"})
public class PropertiesDemo02 {
    public static void main(String[] args) {

        //1. Properties 继承  Hashtable
        //2. 可以通过 k-v存放数据，当然key和value不能为 null
        Properties properties = new Properties();
        //properties.put(null, "abc");//抛出 空指针异常
        //properties.put("abc", null); //抛出 空指针异常
        properties.put("curry", 10);//k-v
        properties.put("kobe", 30);
        properties.put("james", 100);
        properties.put("james", 88);//如果有相同的key ， value被替换

        System.out.println("properties=" + properties); // properties={kobe=30, curry=10, james=88}

        //通过k获取对应值
        System.out.println(properties.get("james"));// 88

        //删除
        properties.remove("kobe");
        System.out.println("properties=" + properties); // properties={curry=10, james=88}

        //修改
        properties.put("curry", "Rondo");
        System.out.println("properties=" + properties); // properties={curry=Rondo, james=88}

    }
}
```

#### 12.9.5 TreeMap类

##### 12.9.5.1 源码分析

1、`debug`下面代码，分析`TreeMap`源码

```java
package cn.set.demo06;

import java.util.Comparator;
import java.util.TreeMap;

@SuppressWarnings({"all"})
public class TreeMapDemo02 {
    public static void main(String[] args) {
        // 1、创建treeMap对象
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //按照传入的 k(String) 的大小进行排序
                //按照K(String) 的长度大小排序
                return ((String) o2).compareTo((String) o1);
            }
        });
        // 1.2 往集合中添加元素
        treeMap.put("小米", 1699);
        treeMap.put("魅族", 1299);
        treeMap.put("苹果", 4599);
        treeMap.put("华为", 5599);
        System.out.println("treemap=" + treeMap);   // treemap={魅族=1299, 苹果=4599, 小米=1699, 华为=5599}
    }
}
```

2、创建`treeMap`对象，在程序中打上断点，直接进入方法体

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021195013.png" style="zoom: 80%;" />	

3、 执行`(Alt +shift + F7)`操作，然后退出，继续进入。构造器把传入的实现了`Comparator`接口的匿名内部类(对象)，传给给`TreeMap`的`comparator`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021195413.png" style="zoom:80%;" />	

4、调用`put()`方法，==第一次添加, 把k-v 封装到 Entry对象，放入root==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021201034.png" style="zoom: 67%;" />	

第一个元素添加成功

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021201442.png" style="zoom: 67%;" />	

5、再次执行`(F7)`步骤，进入`put()`方法，往后添加元素，会执行`Comparator()`方法。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021202440.png" style="zoom: 67%;" />	

调用`compare()`方法

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021202743.png)

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021202537.png" style="zoom: 67%;" />	

```java
Comparator<? super K> cpr = comparator;
if (cpr != null) {
    do {
        //遍历所有的key , 给当前key找到适当位置
        parent = t;
        //动态绑定到匿名内部类的compare
        cmp = cpr.compare(key, t.key);
        if (cmp < 0)
            t = t.left;
        else if (cmp > 0)
            t = t.right;
        else
            //如果遍历过程中，发现准备添加Key 和当前已有的Key 相等，就不添加
            return t.setValue(value);
    } while (t != null);
}
```

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021203801.png" style="zoom:80%;" />

6、添加和排序成功。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211021204153.png" style="zoom:67%;" />	

### 12.10 Collections工具类

#### 12.10.1 Collections 工具类介绍

- `Collections`是一个操作`Set`、` List`和`Map`等集合的工具类。
- `Collections`中提供了一系列静态的方法对集合元素进行排序、查询和修改等操作。

#### 12.10.2 排序操作

- `reverse(List)`: 反转List中元素的顺序
- `shuffle(List)`: 对List集合元素进行随机排序
- `sort(List)`: 根据元素的自然顺序对指定List集合元素按升序排序
- `sort(List, Comparator)`: 根据指定的Comparator产生的顺序对List集合元素进行排序
- `swap(List, int, int)`: 将指定list集合中的i处元素和j处元素进行交换

```java
package cn.collections.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
@SuppressWarnings({"all"})

public class CollectionsTest01 {
    public static void main(String[] args) {
        //1.1 创建ArrayList集合，用于测试.
        List list = new ArrayList();
        list.add("kobe");
        list.add("james");
        list.add("king");
        list.add("guardwhy");
        list.add("curry");

        // 1.2 reverse(List)：反转 List 中元素的顺序
        System.out.println("反转排序:");
        Collections.reverse(list);
        System.out.println("list=" + list);

        // 1.3 shuffle(List)：对 List 集合元素进行随机排序
        /*
            for (int i = 0; i < 5; i++) {
                Collections.shuffle(list);
                System.out.println("list=" + list);
            }
        */

        // 1.4 sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
        System.out.println("自然排序后:");
        Collections.sort(list);
        System.out.println("list=" + list);

        // 1.5 sort(List，Comparator)：根据指定的 Comparator产生的顺序对List集合元素进行排序按照字符串的长度大小排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //可以加入校验代码.
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        System.out.println("字符串长度大小排序:");
        System.out.println("list=" + list);

       // 1.6 swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
        Collections.swap(list, 0, 1);
        System.out.println("交换后的情况:");
        System.out.println("list=" + list);
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211022094012.png" style="zoom:80%;" />	

####  12.10.3 查找、替换

- `Object max(Collection)`: 根据元素的自然顺序，返回给定集合中的最大元素。
- `Object max(Collection, Comparator)`: 根据`Comparator`指定的顺序，返回给定集合中的最大元素。
- `Object min(Collection)`：根据元素的自然顺序，返回给定集合中的最小元素。
- `Object min(Collection, Comparator)`：根据`Comparator`指定的顺序，返回给定集合中的最小元素。
- `int frequency(Collection, Object)`: 返回指定集合中指定元素的出现次数。
- `void copy(List dest,List src)`: 将src中的内容复制到dest中。
- `boolean replaceAll(List list, Object oldVal, Object newVal)`: 使用新值替换List对象的所有旧值。

```java
package cn.collections.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
@SuppressWarnings({"all"})

public class CollectionsTest01 {
    public static void main(String[] args) {
        //1.1 创建ArrayList集合，用于测试.
        List list = new ArrayList();
        list.add("kobe");
        list.add("james");
        list.add("king");
        list.add("guardwhy");
        list.add("curry");

        //1.2 Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
        System.out.println("自然顺序最大元素=" + Collections.max(list));

        //1.3 Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
        //要返回长度最大的元素
        Object maxObject = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println("长度最大的元素=" + maxObject);


        //1.4 Object min(Collection),Object min(Collection，Comparator)这两个方法，参考max即可。

        //1.5 int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
        System.out.println("king出现的次数=" + Collections.frequency(list, "king"));

        //1.6 void copy(List dest,List src)：将src中的内容复制到dest中
        ArrayList dest = new ArrayList();
        //为了完成一个完整拷贝，我们需要先给dest 赋值，大小和list.size()一样
        for(int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        //拷贝
        Collections.copy(dest, list);
        System.out.println("dest(拷贝)=" + dest);

        //1.7 boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值
        //如果list中，有kobe就替换成科比
        Collections.replaceAll(list, "kobe", "科比");
        System.out.println("list替换后=" + list);
  }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211022110327.png" style="zoom:80%;" />	

#### 12.10.4 开发中如何选择集合实现类

在开发中，选择什么集合实现类，==主要取决于业务操作特点，然后根据集合实现类特性进行选择==，分析如下:

1、先判断存储的类型(一 组对象[单列]或一 组键值对[双列])

2、一组对象[单列]: `Collection`接口

- 允许重复: `List`
  - 增删多: `LinkedList` [底层维护了一个双向链表]
  - 改查多: `ArrayList` [底层维护`Object`类型的可变数组]

- 不允许重复：`Set`
- 无序: `HashSet` [<font color = red>底层是`HashMap`，维护了一个哈希表即(数组+链表+红黑树)</font>]
- 排序: `TreeSet `
- ==插入和取出顺序一致: LinkedHashSet ，维护数组+双向链表==。

3、一组键值对[双列]: Map

键无序：`HashMap` [==底层是:哈希表jdk7: 数组+链表，jdk8: 数组+链表+红黑树==]

键排序: `TreeMap` 

键插入和取出顺序一致: `LinkedHashMap`

读取文件：`Properties`

### 12.11 经典案例

#### 12.11.1 案例一

按要求实现：

(1) 封装一个新闻类，包含标题和内容属性，提供`get、set`方法，重写`toString`方法，打印对象时只打印标题。

(2) 只提供一个带参数的构造器，实例化对象时，只初始化标题；并且实例化两个对象：

-  新闻一：新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧
-  新闻二：男子突然想起`2`个月前钓的鱼还在网兜里，捞起一看赶紧放生

 (3) 将新闻对象添加到`ArrayList`集合中，并且进行倒序遍历

 (4) 在遍历集合过程中，对新闻标题进行处理，超过`15`字的只保留前`15`个，然后在后边加“…”

 (5) 在控制台打印遍历出经过处理的新闻标题。

```java
package cn.collections.demo02;

import java.util.ArrayList;

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}

@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新冠确诊病例超千万，数百万印度教信徒赴恒河\"圣浴\"引民众担忧"));
        arrayList.add(new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生"));

        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            //System.out.println(arrayList.get(i));
            News news = (News)arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));
        }

    }
    //专门写一个方法，处理现实新闻标题 process处理
    public static String processTitle(String title) {
        if(title == null) {
            return "";
        }

        // 判断标题的长度
        if(title.length() > 15) {
            return title.substring(0, 15) + "..."; //[0,15)
        } else {
            return title;
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211022121614.png" style="zoom:80%;" />	

#### 12.11.2 案例二

 使用`ArrayList` 完成对 对象 `Car {name, price}` 的各种操作

- `add()`:添加单个元素
- `remove()`:删除指定元素
- `contains()`:查找元素是否存在
- `size()`:获取元素个数
- `isEmpty()`:判断是否为空
- `clear()`:清空
- `addAll()`:添加多个元素
-  `containsAll()`:查找多个元素是否都存在
-  `removeAll()`：删除多个元素

 使用增强for和 迭代器来遍历所有的car , 需要重写 Car 的toString方法。

```java
package cn.collections.demo02;

import java.util.ArrayList;
import java.util.Iterator;

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car = new Car("长城", 400000);
        Car car2 = new Car("红旗",5000000);
        //1.add:添加单个元素
        System.out.print("添加单个元素:");
        arrayList.add(car);
        arrayList.add(car2);
        System.out.println(arrayList);

        //* 2.remove:删除指定元素
        System.out.print("删除指定元素:");
        arrayList.remove(car);
        System.out.println(arrayList);
        //* 3.contains:查找元素是否存在
        System.out.print("查找元素是否存在：");
        System.out.println(arrayList.contains(car));

        //* 4.size:获取元素个数
        System.out.print("获取元素个数：");
        System.out.println(arrayList.size());

        //* 5.isEmpty:判断是否为空
        System.out.print("判断集合是否为空:");
        System.out.println(arrayList.isEmpty());
        //* 6.clear:清空
        //System.out.println("清空集合:");
        //System.out.println(arrayList.clear(););

        //* 7.addAll:添加多个元素
        System.out.println("添加多个元素:");
        System.out.println(arrayList);
        arrayList.addAll(arrayList);
        System.out.println(arrayList);

        //* 8.containsAll:查找多个元素是否都存在
        System.out.print("查找多个元素是否都存在:");
        boolean a =  arrayList.containsAll(arrayList);
        System.out.println(a);


        // 9.removeAll：删除多个元素
        //arrayList.removeAll(arrayList); //相当于清空

        //10、使用增强for和 迭代器来遍历所有的car , 需要重写 Car 的toString方法
        System.out.println("===增强for遍历===:");
        for (Object o : arrayList) {
            System.out.println(o);
        }

        System.out.println("===迭代器遍历===");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211022132206.png" style="zoom: 67%;" />	

#### 12.11.3 案例三

1、按要求完成下列任务

- 使用`HashMap`类实例化一个`Map`类型的对象`m`，键`（String）`和值`（int）`分别用于存储员工的姓名和工资，存入数据如下：`jack—650`元；`tom—1200`元；`smith——2900`元。
- 将`jack`的工资更改为`2600`元。
- 为所有员工工资加薪`100`元。
- 遍历集合中所有的员工。
- 遍历集合中所有的工资。

```java
package cn.collections.demo02;

import java.util.*;
@SuppressWarnings({"all"})
public class Homework03 {
    public static void main(String[] args) {
        // 1.1 创建m集合
        Map m = new HashMap();
        // 1.2 向m中添加元素
        m.put("jack", 650);//int->Integer
        m.put("tom", 1200);//int->Integer
        m.put("smith", 2900);//int->Integer
        System.out.println(m);
        //1.3 替换，更新
        m.put("jack", 2600);
        System.out.println(m);

        //1.4 为所有员工工资加薪100元
        Set keySet = m.keySet();
        for (Object key : keySet) {
            //1.5 更新
            m.put(key, (Integer)m.get(key) + 100);
        }
        System.out.println(m);
        System.out.println("=============遍历=============");
        //1.6 遍历 EntrySet
        Set entrySet = m.entrySet();
        //1.7 迭代器
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());

        }
        System.out.println("====遍历所有的工资====");
        Collection values = m.values();
        for (Object value : values) {
            System.out.println("工资=" + value);
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211022185200.png" style="zoom: 67%;" />	

#### 12.11.4 案例四

1、试分析HashSet和TreeSet分别如何实现去重的。

- ==HashSet的去重机制==: `hashCode() + equals()` ,底层先通过存入对象，进行运算得到一个`hash`值，通过`hash`值得到对应的索引，如果发现`table`索引所在的位置，没有数据，就直接存放如果有数据，就进行`equals`比较==[遍历比较]==，如果比较后，不相同,就加入，否则就不加入。
- ==TreeSet的去重机制==:如果你传入了一-个`Comparator`匿名对象，就使用实现的`compare`去重，如果方法返回`0`,就认为是相同的元素/数据，就不添加，如果你没有传入一个`Comparator`匿名对象，则以你添加的对象实现的`Compareable`接口的`compareTo`去重。

#### 12.11.5 案例五

下面代码运行会不会抛出异常，并从源码层面说明原因。

```java
public class Homework05 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Person());//ClassCastException.
        System.out.println(treeSet);

    }
}

class Person {
......
}
```

出现问题：==ClassCastException==，`add() `方法，因为 `TreeSet()` 构造器没有传入`Comparator`接口的匿名内部类。

解决方案

```java
package cn.collections.demo02;

import java.util.TreeSet;

@SuppressWarnings({"all"})
public class Homework05 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        /*
        add方法，因为 TreeSet() 构造器没有传入Comparator接口的匿名内部类
        所以在底层 Comparable<? super K> k = (Comparable<? super K>) key;即把Perosn转成Comparable类型
        */
        treeSet.add(new Person());//ClassCastException.
        treeSet.add(new Person());//ClassCastException.

        System.out.println(treeSet);

    }
}

class Person implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
```

#### 12.11.6 案例分析

下面的代码输出什么? 已知: `Person`类按照`id`和`name`重写了`hashCode`和`equals`方法，问下面代码输出什么?

```java
package cn.collections.demo03;

import java.util.HashSet;
import java.util.Objects;

class Person {
    public String name;
    public int id;

    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

@SuppressWarnings({"all"})
public class Homework06 {
    public static void main(String[] args) {
        HashSet set = new HashSet();//ok
        Person p1 = new Person(1001,"AA");//ok
        Person p2 = new Person(1002,"BB");//ok
        set.add(p1);//ok
        set.add(p2);//ok
        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);//2
        set.add(new Person(1001,"CC"));
        System.out.println(set);//3
        set.add(new Person(1001,"AA"));
        System.out.println(set);//4
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211022205830.png)

#### 12.11.7 案例六

ArrayList和`Vector`对比？

| 集合        | 底层结构           | 版本     | 线程安全(同步)效率 | 扩容倍数                                                     |
| ----------- | ------------------ | -------- | ------------------ | ------------------------------------------------------------ |
| `ArrayList` | 可变数组           | `jdk1.2` | 不安全，效率高     | 如果使用有参构造器按照`1.5`倍扩容，如果是无参构造器。<br/>1、第次扩容`10`。<br/>2、从第二次开始按照`1.5`倍。 |
| `Vector`    | 可变数组`Object[]` | `jdk1.0` | 安全，效率不高     | 如果是无参，默认`10`满后，按照`2`倍扩容如果是指定大小创建`Vector`,则每次按照`2`倍扩容。 |

## 第13章 泛型

### 13.1 泛型入门

1、泛型的引出

编写程序，在`ArrayList`中，添加`3`个`Dog`对象，`Dog`对象含有`name`和`age`,并输出`name`和`age `(要求使用`getXxx()`）先使用传统的方法来解决===>引出泛型

```java
package cn.generic.demo01;

import java.util.ArrayList;

// Dog类
class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat { //Cat类
    private String name;
    private int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
@SuppressWarnings({"all"})

public class GenericDemo01 {
    public static void main(String[] args) {
        //1、使用传统的方法来解决
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("小黄", 5));

        //2、假如我们的程序员，不小心，添加了一只猫
        arrayList.add(new Cat("cuury猫", 8));

        //3、遍历集合
        for (Object o : arrayList) {
            //向下转型Object ->Dog
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "-" + dog.getAge());
        }
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211023103556.png)

2、存在问题

- 不能对加入到集合ArrayList中的数据类型进行约束(不安全)。
- 遍历的时候，需要进行类型转换，如果集合中的数据量较大，对效率有影响。

3、解决方案

```java
package cn.generic.demo02;

import java.util.ArrayList;

// Dog类
class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
// Cat类
class Cat {
    private String name;
    private int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

@SuppressWarnings({"all"})
public class GenericDemo02 {
    public static void main(String[] args) {
        //1. 当ArrayList<Dog> 表示存放到 ArrayList 集合中的元素是Dog类型
        //2. 如果编译器发现添加的类型，不满足要求，就会报错
        //3. 在遍历的时候，可以直接取出 Dog 类型而不是 Object
        //4. public class ArrayList<E> {} E称为泛型,那么 Dog->E
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("小黄", 5));
        
        System.out.println("===使用泛型====");
        for (Dog dog : arrayList) {
            System.out.println(dog.getName() + "-" + dog.getAge());
        }
    }
}
```

执行结果

不使用泛型

- `Dog` -加入-> `Object` -取出-> `Dog` 【==放入到ArrayList会先转成Object，在取出时，还需要转换成Dog==】

使用泛型

- Dog-> Dog-> Dog 【==放入时，和取出时，不需要类型转换，提高效率==】

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211023105923.png" style="zoom: 80%;" />	

### 13.2 泛型的声明

#### 13.2.1 基本概念

1、基本介绍

- 泛型又称参数化类型，是`Jdk5.0`出现的新特性解决数据类型的安全性问题。
- 在类声明或实例化时只要指定好需要的具体的类型即可。
- `Java`泛型可以保证如果程序在编译时没有发出警告，运行时就不会产生`ClassCastException`异常， 同时代码更加简洁、健壮。
- ==泛型的作用是:可以在类声明时通过一个标识表示类中某个属性的类型，或者是某个方法的返回值的类型，或者是参数类型==。

2、泛型的基本语法

```java
ifterface 接口<T>{} 和class类<K,V>{}
```

注意：1)其中，`T,K,V`不代表值，而是表示类型。2)任意字母都可以。常用`T`表示，是`Type`的缩写。

3、泛型的实例化

要在类名的后面指定类型参数的值==(类型)==

```java
List<String> list01 = new ArrayList<String>();
```

#### 13.2.2 泛型的好处

1、编译时，检查添加元素的类型，提高了安全性。

2、减少了类型转换的次数，提高效率。

5、不再提示编译警告

```java
package cn.generic.demo03;

// 1.1、泛型的作用是：可以在类声明时通过一个标识表示类中某个属性的类型，或者是某个方法的返回值的类型，或者是参数类型
class Person<E> {
    
    //1.2、E表示 s的数据类型, 该数据类型在定义Person对象的时候指定,即在编译期间，就确定E是什么类型
    E s ;
    
    //1.3、E也可以是参数类型
    public Person(E s) {
        this.s = s;
    }
    
    //1.4、返回类型使用E
    public E f() {
        return s;
    }

    public void show() {
        //1.5、显示s的运行类型
        System.out.println(s.getClass());
    }
}

public class GenericDemo01 {
    public static void main(String[] args) {
        //2.1、特别强调：E具体的数据类型在定义Person对象的时候指定,即在编译期间，就确定E是什么类型
        Person<String> person = new Person<String>("韩顺平教育");
        person.show(); //String
        /*
            你可以这样理解，上面的Person类
            class Person {
                String s ;//E表示 s的数据类型, 该数据类型在定义Person对象的时候指定,即在编译期间，就确定E是什么类型

                public Person(String s) {//E也可以是参数类型
                    this.s = s;
                }

                public String f() {//返回类型使用E
                    return s;
                }
            }
         */

        Person<Integer> person2 = new Person<Integer>(100);
        person2.show();//Integer
        /*
            class Person {
                Integer s ; //E表示 s的数据类型, 该数据类型在定义Person对象的时候指定,即在编译期间，就确定E是什么类型

                public Person(Integer s) {//E也可以是参数类型
                    this.s = s;
                }

                public Integer f() {//返回类型使用E
                    return s;
                }
            }
         */
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211023114341.png" style="zoom:80%;" />	

#### 13.2.2 应用实例

创建`3`个学生对象，放入到`HashSet`中学生对象, 使用放入到`HashMap`中，要求`Key`是`String name`, `Value` 就是 学生对象，使用两种方式遍历。

```java
package cn.generic.demo04;

import java.util.*;
// 创建Student类
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

@SuppressWarnings({"all"})
public class GenericExercise {
    public static void main(String[] args) {
        //1.1、使用泛型方式给HashSet 放入3个学生对象
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("jack", 18));
        students.add(new Student("tom", 28));
        students.add(new Student("mary", 19));

        System.out.println("===hashset遍历====");
        //遍历
        for (Student student : students) {
            System.out.println(student);
        }

        //使用泛型方式给HashMap 放入3个学生对象
        //K -> String V->Student
        HashMap<String, Student> hm = new HashMap<String, Student>();
        /*
            public class HashMap<K,V>  {}
         */
        hm.put("curry", new Student("curry", 38));
        hm.put("smith", new Student("smith", 48));
        hm.put("guardwhy", new Student("guardwhy", 28));

        //迭代器 EntrySet
        /*
        public Set<Map.Entry<K,V>> entrySet() {
            Set<Map.Entry<K,V>> es;
            return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
        }
         */
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        /*
            public final Iterator<Map.Entry<K,V>> iterator() {
                return new EntryIterator();
            }
         */
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        System.out.println("===map遍历===");
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211023125708.png" style="zoom: 80%;" />	

### 13.3 泛型使用细节

#### 13.3.1 注意事项

1、给泛型指向数据类型是，要求是引用类型，不能是基本数据类型

```java
package cn.test.demo01;

import java.util.ArrayList;
import java.util.List;

public class GenericDetail {
    public static void main(String[] args) {
        //1.给泛型指向数据类型是，要求是引用类型，不能是基本数据类型
        List<Integer> list = new ArrayList<Integer>(); //OK
        //List<int> list2 = new ArrayList<int>();//错误
    }
}
```

2、在给泛型指定具体类型后，可以传入该类型或者其子类类型。

```java
package cn.test.demo01;
// 1、创建A类
class A {}
// 2、创建B类继承A类
class B extends A {}

// 3、创建Pig类
class Pig<E> {
    E e;
    // 构造方法
    public Pig(E e) {
        this.e = e;
    }
    // 普通方法f()
    public void f() {
        System.out.println(e.getClass()); //运行类型
    }
}

public class GenericDetail {
    public static void main(String[] args) {
        
        //因为 E指定了A类型, 构造器传入了 new A(),在给泛型指定具体类型后，可以传入该类型或者其子类类型。
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<A> aPig2 = new Pig<A>(new B());
        aPig2.f();
    }
}
```

3、泛型的使用形式

```java
package cn.test.demo01;

import java.util.ArrayList;
import java.util.List;
// 创建Pig类
class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f() {
        System.out.println(e.getClass());
    }
}

public class GenericDetail {
    public static void main(String[] args) {
        //1. 泛型的使用形式在实际开发中，往往简写
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        ArrayList<Pig> pigs = new ArrayList<>();
    }
}
```

#### 13.3.2 案例分析

1、代码分析

- 定义`Employee`类该类包含: `private`成员变量`name`,`sal`,`birthday`, 其中`birthday`为`MyDate`类的对象;
- 为每一 个属性定义`getter`, `setter`方法;
- 重写`toString`方法输出`name`, `sal`, `birthday`。
- `MyDate`类包含: `private`成员变量`month`,`day`,`year`; 并为每一个属性定义`getter`,`setter`方法;
- 创建该类的`3`个对象，并把这些对象放入`ArrayList`集合中(`ArrayList`需使用泛型来定义)，对集合中的元素进行排序，并遍历输出:排序方式调用`ArrayList `的`sort`方法,传入`Comparator`对象[使用泛型]，先按照`name`排序，如果`name`相同，则按生日日期的先后排序。

2、Employee类实现

```java
package cn.test.demo02;

// 创建Employee类
public class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
```

3、MyDate类实现

```java
package cn.test.demo02;

// 创建MyDate类
public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    //把对year-month-day比较放在这里
    public int compareTo(MyDate o) {
        int yearMinus = year - o.getYear();
        if(yearMinus != 0) {
            return  yearMinus;
        }
        //如果year相同，就比较month
        int monthMinus = month - o.getMonth();
        if(monthMinus != 0) {
            return monthMinus;
        }
        //如果year 和 month
        return day - o.getDay();
    }
}
```

4、GenericExercise02类实现

```java
package cn.test.demo02;

import java.util.ArrayList;
import java.util.Comparator;

@SuppressWarnings({"all"})
public class GenericExercise02 {
    public static void main(String[] args) {
        // 创建employees对象
        ArrayList<Employee> employees = new ArrayList<>();
        // 往集合中添加元素
        employees.add(new Employee("tom", 20000, new MyDate(1980,12,11)));
        employees.add(new Employee("jack", 12000, new MyDate(2001,12,12)));
        employees.add(new Employee("tom", 50000, new MyDate(1980,12,10)));

        System.out.println("employees=" + employees);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                //先按照name排序，如果name相同，则按生日日期的先后排序。【即：定制排序】
                //先对传入的参数进行验证
                if(!(emp1 instanceof  Employee && emp2 instanceof Employee)) {
                    System.out.println("类型不正确..");
                    return 0;
                }
                //比较name
                int i = emp1.getName().compareTo(emp2.getName());
                if(i != 0) {
                    return i;
                }

                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });

        System.out.println("==对雇员进行排序==");
        System.out.println(employees);

    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211023154850.png" style="zoom: 67%;" />	

### 13.4 自定义泛型

#### 13.4.1 自定义泛型类

1、基本语法

```java
class 类名<T,R...>{ //...表示可以有多个泛型
    成员
}
```

2、注意细节

- 普通成员可以使用泛型(属性、方法)。
- 使用泛型的数组，不能初始化
- 静态方法中不能使用类的泛型。
- 泛型类的类型，是在创建对象时确定的(因为创建对象时，需要指定确定类型)。
- 如果在创建对象时，没有指定类型，默认为Object。

```java
package cn.gustomgeneric.demo01;

//1. Tiger 后面泛型，所以我们把 Tiger 就称为自定义泛型类
//2, T, R, M 泛型的标识符, 一般是单个大写字母
//3. 泛型标识符可以有多个.
class Tiger<T, R, M>{
    //4. 普通成员可以使用泛型 (属性、方法)
    String name;
    R r;
    M m;
    T t;

    //因为数组在new 不能确定T的类型，就无法在内存开空间
    // T[] ts1 = new T[8];
    T[] ts;

    /**
     * 静态方法中不能使用类的泛型,因为静态是和类相关的，在类加载时，对象还没有创建
     * 所以，如果静态方法和静态属性使用了泛型，JVM就无法完成初始化
     */
    //    static R r2;
    //    public static void m1(M m) {
    //
    //    }


    //构造器使用泛型
    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public String getName() {
        return name;
    }

    //方法使用泛型
    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }
    //返回类型可以使用泛型.
    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", m=" + m +
                ", t=" + t +
                '}';
    }
}

public class CustomGenericDemo01 {
    public static void main(String[] args) {

    }
}
```

3、案例实现

```java
package cn.gustomgeneric.demo01;

// 创建Student类
class Student<T, R, M>{
    // 成员变量的属性
    String name;
    R r;
    M m;
    T t;

    //构造器使用泛型
    public Student(String name) {
        this.name = name;
    }

    public Student(R r, M m, T t) {
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", m=" + m +
                ", t=" + t +
                '}';
    }
}

@SuppressWarnings({"all"})
public class CustomGenericDemo01 {
    public static void main(String[] args) {
        //1.1 T=Double, R=String, M=Integer
        Student<Double,String,Integer> stu1 = new Student<>("curry");
        stu1.setT(10.9); //OK

        //1.2 g.setT("yy"); //错误，类型不对
        System.out.println(stu1);

        //1.3 OK T=Object R=Object M=Object
        Student stu2 = new Student("guardwhy");

        //1.4 OK ,因为 T=Object "yy"=String 是Object子类
        stu2.setT("yy"); 
        System.out.println("stu2=" + stu2);
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211023163751.png" style="zoom:80%;" />	

#### 13.4.2 自定义泛型接口

1、基本语法

```java
interface 接口名<T, R...>{
    
}
```

2、注意细节

2.1、接口中，==静态成员也不能使用泛型(这个和泛型类规定一样)==

```java
package cn.gustomgeneric.demo02;

interface IUsb<U, R> {

    int n = 10;
    //1.1、U name; 不能这样使用

    //1.2、普通方法中，可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //1.3、在jdk8 中，可以在接口中，使用默认方法, 也是可以使用泛型
    default R method(U u) {
        return null;
    }
}

public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}
```

2.2、泛型接口的类型，==在继承接口==。

```java
package cn.gustomgeneric.demo02;

// 1、创建IUsb接口
interface IUsb<U, R> {
    int n = 10;
    //1.2、普通方法中，可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //1.3、在jdk8 中，可以在接口中，使用默认方法, 也是可以使用泛型
    default R method(U u) {
        return null;
    }
}

//2、在继承接口 指定泛型接口的类型
interface IA extends IUsb<String, Double> {

}

/**
 3、当我实现IA接口时，因为IA在继承IUsu 接口时，指定了U为String R为Double
    在实现IUsu接口的方法时，使用String替换U, 是Double替换R
 */
class AA implements IA {

    @Override
    public Double get(String s) {
        return null;
    }
    @Override
    public void hi(Double aDouble) {

    }
    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}
```

2.4、实现接口时，==直接指定泛型接口的类型==

```java
package cn.gustomgeneric.demo02;

// 1、创建IUsb接口
interface IUsb<U, R> {
    int n = 10;
    //1.2、普通方法中，可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //1.3、在jdk8 中，可以在接口中，使用默认方法, 也是可以使用泛型
    default R method(U u) {
        return null;
    }
}

/*
* 2、给U指定Integer，给R指定了Float，所以当实现IUsb方法时，会使用Integer替换U, 使用Float替换R
*/
class BB implements IUsb<Integer, Float> {

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}

public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}
```

2.5、没有指定类型，默认为Object。

```java
package cn.gustomgeneric.demo02;

// 1、创建IUsb接口
interface IUsb<U, R> {
    int n = 10;
    //1.2、普通方法中，可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //1.3、在jdk8 中，可以在接口中，使用默认方法, 也是可以使用泛型
    default R method(U u) {
        return null;
    }
}

/*
* 2、没有指定类型，默认为Object，建议直接写成 IUsb<Object,Object>
*/
class CC implements IUsb { //等价 class CC implements IUsb<Object,Object> {
    @Override
    public Object get(Object o) {
        return null;
    }
    @Override
    public void hi(Object o) {
    }
    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {
    }
}

public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}
```

#### 13.4.2 自定义泛型方法

1、基本语法

```java
修饰符<T,R..> 返回类型方法名(参数列表) {
    
}
```

2、注意细节

- 泛型方法，可以定义在普通类中，也可以定义在泛型类中。
- 当泛型方法被调用时，类型会确定。
- `public void eat(E e) {}`， 修饰符后没有`<T,R..> eat`方法不是泛型方法，而是使用了泛型。

3、案例分析

```java
package cn.gustomgeneric.demo02;

import java.util.ArrayList;

//1.1 泛型方法，可以定义在普通类中, 也可以定义在泛型类中
class Phone {
    //1.2 普通方法
    public void run() {
        
    }
    
    /**
     * 1.3 说明泛型方法, <T,R> 就是泛型,是提供给 fly()方法使用的
     */
    public <T, R> void fly(T t, R r) {//泛型方法
        System.out.println(t.getClass());//String
        System.out.println(r.getClass());//Integer
    }
}
//2、泛型类
class Fish<T, R> {
    //2.1 普通方法
    public void run() {
        
    }
    //2.2 泛型方法
    public<U,M> void eat(U u, M m) {

    }
    
    /**
     * 2.3、注意:下面hi方法不是泛型方法，是hi方法使用了类声明的 泛型
     */
    public void hi(T t) {
        
    }
    
    //2.4、泛型方法，可以使用类声明的泛型，也可以使用自己声明泛型
    public<K> void hello(R r, K k) {
        System.out.println(r.getClass());//ArrayList
        System.out.println(k.getClass());//Float
    }
}

@SuppressWarnings({"all"})
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Phone phone = new Phone();
        //3.1 当调用方法时，传入参数，编译器，就会确定类型
        phone.fly("小米", 100);
        System.out.println("===输出1===");
        //3.2 当调用方法时，传入参数，编译器，就会确定类型
        phone.fly(300, 100.1);

        //测试
        //T->String, R-> ArrayList
        Fish<String, ArrayList> fish = new Fish<>();
        System.out.println("===输出2===");
        fish.hello(new ArrayList(), 11.3f);
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211023221012.png" style="zoom: 67%;" />	

### 13.5 泛型的继承和通配符

#### 13.5.1 相关特点

1、泛型不具备继承性。

2、`< ? >` :支持任意泛型类型。

3、`<? extends A>`:支持`A`类以及`A`类的子类，规定了泛型的上限。

4、` <? super A>`:支持`A`类以及`A`类的父类，不限于直接父类，规定了泛型的下限。

#### 13.5.2 案例说明

```java
package cn.gustomgeneric.demo03;

import java.util.ArrayList;
import java.util.List;

// 创建AA类
class AA {
}

// 创建BB类继承AA类
class BB extends AA {

}

// 创建CC类继承BB
class CC extends BB {

}

public class GenericExtends {
    public static void main(String[] args) {
        // 1.1、创建obj对象
        Object obj = new String("guardwhy");
        //1.2、泛型没有继承性
        //List<Object> list = new ArrayList<String>();

        //1.3、举例说明下面三个方法的使用
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();

        //1.4、调用printCollection1()方法，如果是 List<?> c，可以接受任意的泛型类型
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //1.5、List<? extends AA> c：表示上限，可以接受 AA或者AA子类

        // printCollection2(list1);// false
        // printCollection2(list2);// false
        printCollection2(list3);// true
        printCollection2(list4);// true
        printCollection2(list5);// true

        // 1.6、List<? super AA> c:支持AA类以及AA类的父类，不限于直接父类
        printCollection3(list1);// true
        //printCollection3(list2);// false
        printCollection3(list3);// true
        // printCollection3(list4);// false
        //printCollection3(list5);// false
    }

    //2.1、说明: List<?> 表示 任意的泛型类型都可以接受
    public static void printCollection1(List<?> c) {
        // 通配符，取出时，就是Object
        for (Object object : c) {
            System.out.println(object);
        }
    }

    // 2.2、? extends AA表示上限，可以接受AA或者AA子类
    public static void printCollection2(List<? extends AA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }
    // 2.3、 ? super子类类名AA:支持AA类以及AA类的父类，不限于直接父类，规定了泛型的下限
    public static void printCollection3(List<? super AA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }
}
```

### 13.6 案例分析

#### 13.6.1 案例分析1

判断下面代码是否正确，如果有错误，修改正确，并说明输出什么?

```java
package cn.gustomgeneric.demo03;

//1.1 自定义泛型类
class Student<T, R, M> {
    //1.2 泛型方法
    public <E> void fly(E e) {
        System.out.println(e.getClass().getSimpleName());
    }

    //1.3 public void eat(U u) {}//错误，因为U没有声明
    public void run(M m) { //ok

    }
}

// 2.1 创建Person类
class Person {

}

public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        // T->String, R->Integer, M->Double
        Student<String, Integer, Double> student = new Student<>();
        // 10 会被自动装箱 Integer10
        student.fly(10); // 输出Integer
        student.fly(new Person());// Person
    }
}
```

#### 13.6.2 案例分析2

1、定义个泛型类`DAO<T>`,在其中定义一个`Map`成员变量，`Map`的键为`String`类型，值为`T`类型。

2、分别创建以下方法:

- `public void save(String id,T entity)`:保存`T`类型的对象到`Map`成员变量中。
- `public T get(String id)`:从`map`中获取`id`对应的对象。
- `public void update(String id,T entity)`:替换`map`中`key`为`id`的内容,改为`entity`对象。
- `public List<T> list()`: 返回`map`中存放的所有`T`对象。
- `public void delete(String id)`:删除指定`id`对象。

3、定义一个`User`类:

- 该类包含: `private`成员变量`(int类型)` `id`,  `age`;  (`String`类型)  `name`。

4、创建`DAO`类的对象，分别调用其 `save`、`get, update`、` list`、 `delete` 方法来操作`User`对象，使用`Junit`单元测试类进行测试。

User 类

```java
package cn.test.demo03;

public class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
```

DAO类

```java
package cn.test.demo03;

import java.util.*;
//1.1 泛型类
public class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public T get(String id) {
        return map.get(id);
    }
    public void update(String id,T entity) {
        map.put(id, entity);
    }
    //返回 map 中存放的所有 T 对象,遍历map [k-v],将map的 所有value(T entity),封装到ArrayList返回即可.
    public List<T> list() {
        //创建 Arraylist
        List<T> list = new ArrayList<>();

        //遍历map
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            //map.get(key) 返回就是 User对象->ArrayList
            list.add(map.get(key));//也可以直接使用本类的 get(String id)
        }

        return list;
    }
    public void delete(String id) {
        map.remove(id);
    }
    //把entity保存到map
    public void save(String id,T entity) {
        map.put(id, entity);
    }
}
```

测试类

```java
package cn.test.demo03;

import org.junit.jupiter.api.Test;

import java.util.List;

public class Homework01 {
    public static void main(String[] args) {

    }

    @Test
    public void testList() {
        //说明
        //这里我们给T 指定类型是User
        DAO<User> dao = new DAO<>();
        dao.save("001", new User(1,10,"curry"));
        dao.save("002", new User(2,18,"kobe"));
        dao.save("003", new User(3,38,"james"));

        List<User> list = dao.list();
        System.out.println("集合:(修改前)");
        System.out.println("list=" + list);

        dao.update("003", new User(3, 28, "guardwhy"));
        // 删除操作
        dao.delete("001");
        System.out.println("集合:(修改后)");
        list = dao.list();
        System.out.println("list=" + list);

        System.out.println("id为3的信息:");
        System.out.println("id=003 " + dao.get("003"));

    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025094604.png" style="zoom:80%;" />

## 第14章 多线程

### 14.1 进程基本介绍

#### 14.1.1 什么是进程

1、进程是指运行中的程序，比如我们使用微信,就启动了一个进程，操作系统就会为该进程分配内存空间。当我们使用迅雷，又启动了一个进程，操作系统将为迅雷分配新的内存空间。

2、进程是程序的一次执行过程，或是正在运行的一一个程序。是动态过程:有它自身的产生、存在和消亡的过程

#### 14.1.2 进程的特征

- 动态性: 进程是运行中的程序，要动态的占用内存，CPU和网络等资源。
-  独立性 : 进程与进程之间是相关独立的，彼此有自己的独立内存区域。

### 14.2  线程基本介绍

#### 14.2.1 基本概念

1、线程是属于进程的。一个进程可以包含多个线程，这就是多线程。

2、在同一个进程内可以执行多个任务，而这每一个任务就可以看成是一个线程。

3、线程是程序的执行单位，执行路径是程序使用cpu的最基本单位。线程也支持并发性。

​	<img src="https://img-blog.csdnimg.cn/2021021521560312.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2h4eTE2MjUzMDk1OTI=,size_16,color_FFFFFF,t_70#pic_center" alt="在这里插入图片描述" style="zoom: 80%;" />

#### 14.2.2 线程的分类

1、<font color = red>**单线程**</font>:同一个时刻，只允许执行一个线程。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025130922.png" style="zoom:80%;" />	

2、<font color = red>**多线程**</font>:同一个时刻，可以执行多个线程，比如:一个qq进程，可以同时打开多个聊天窗口，一个迅雷进程，可以同时下载多个文件。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025131048.png" style="zoom:80%;" />	

#### 14.2.3  线程的作用

- 可以提高程序的效率，可以有更多机会得到CPU。多线程可以解决很多业务模型。
- 大型高并发技术的核心技术，设计到多线程的开发可能都比较难理解。

#### 14.2.3 进程与线程的区别

1、**进程**: 就是操作系统中的运行的一个程序。比如 QQ.exe, chrome.exe ...这是多个进程。

2、**线程**：每个进程中都存在一个或者多个线程，比如Typora写文档的时候，就会有一个线程默默帮你定时自动保存。

3、线程是在进程的基础上划分的。线程消失了，进程不会消失，进程如果消失了，则线程肯定消失。

### 14.3 并发和并行

#### 14.3.1 基本概念

**并行**：同个时刻，多个任务同时执行，多核cpu可以实现并行。 多个人一起跑路。

- CPU多核，多个线程同时执行，比如线程池，效率最高。

**并发**: 同一个时刻，多个任务交替执行，造成种“貌似同时”的错觉，简单的说，==单核cpu实现的多任务就是并发==。多线程操作同一个资源。

- CPU一核，模拟出来多条线程，天下武功，为快不破，快速交替。

#### 14.3.2 并发和并行区别

- 并发偏重于多个任务交替执行，而多个任务之间有可能还是串行的。并发是逻辑上的同时发生而并行是物理上的同时发生。然而并行的偏重点在于”同时执行”。
- 并行的多个任务是真实的同时执行，而对于并发来说，这个过程只是交替的，一会运行任务一,一会儿又运行任务二，系统会不停地在两者间切换。

#### 14.3.3 并发和并行动机制

1、**并发的动机**：在计算能力恒定的情况下处理更多的任务, 就像我们的大脑, 计算能力相对恒定, 要在一天中处理更多的问题, 我们就必须具备多任务的能力. 现实工作中有很多事情可能会中断你的当前任务, 处理这种多任务的能力就是你的并发能力。

2、**并行的动机**：用更多的CPU核心更快的完成任务. 就像一个团队, 一个脑袋不够用了, 一个团队来一起处理一个任务。所以并发编程的目标是充分的利用处理器的每一个核，以达到最高的处理性能。

### 14.3 线程创建

#### 14.3.1 继承Thread类

1、`Thread`类基本概念

- `java.lang.Thread`类代表线程，任何线程对象都是`Thread`类（子类）的实例。
- `Thread`类是线程的模板，封装了复杂的线程开启等操作，封装了操作系统的差异性。

定义一个线程类继承`Thread`类,然后重写`run()`方法,再创建线程对象，调用`start()`方法启动线程。

2、代码示例

```java
package cn.thread.demo01;

/**
 方式一的步骤：
 a.定义一个线程类继承Thread类
 b.重写Thread类的run()方法
 c.创建一个子线程对象
 d.调用线程对象的start()方法启动线程（其实最终就是执行线程对象的run()方法）

 线程的注意：
 1.启动线程不能直接调用run()方法，否则是普通对象的普通方法调用了，将失去线程特征。线程的启动必须调用start()
 2.一般是先创建子线程，再申明主线程的任务，否则主线程任务总是先执行完！

 优缺点：
 优点：编码简单。
 缺点：线程类已经继承了Thread类，不能再继承其他类，功能被削弱了。不能做线程池。无法直接返回线程执行的结果。
 */

//  a.定义一个线程类继承Thread类
class MyThread extends Thread{
    // 重写Thread类的run()方法
    @Override
    public void run() {
        for(int i=0; i < 5; i++){
            System.out.println("子线程执行:" + i);
        }
    }
}

public class ThreadDemo02 {
    public static void main(String[] args) {
        // 创建一个子线程对象
        MyThread t = new MyThread();
        // 启动线程,线程的启动必须调用start()
        t.start();
        // 遍历操作
        for(int i=0; i<5; i++){
            System.out.println("main线程执行:" + i);
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025131821.png" style="zoom:80%;" />	

3、源码分析

点击`start()`方法，进入源码，阅读源码可得，<font color = red>`start0()`是本地方法，是`JVM`调用, 底层是`c/c++`实现，真正实现多线程的效果，是`start0()`, 而不是 `run`</font>。

```java
public synchronized void start() {
    /**
      * This method is not invoked for the main method thread or "system"
      * group threads created/set up by the VM. Any new functionality added
      * to this method in the future may have to also be added to the VM.
      *
      * A zero status value corresponds to state "NEW".
      */
    if (threadStatus != 0)
        throw new IllegalThreadStateException();

    /* Notify the group that this thread is about to be started
         * so that it can be added to the group's list of threads
         * and the group's unstarted count can be decremented. */
    group.add(this);

    boolean started = false;
    try {
        start0();
        started = true;
    } finally {
        try {
            if (!started) {
                group.threadStartFailed(this);
            }
        } catch (Throwable ignore) {
            /* do nothing. If start0 threw a Throwable then
                  it will be passed up the call stack */
        }
    }
}

private native void start0();
```

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025132802.png" style="zoom:67%;" />	

#### 14.3.2 实现Runnable接口

1、Runnable基本概念

-  `java`是单继承的，在某些情况下一一个类可能已经继承了某个父类，这时在用继承`Thread`类方法来创建线程 显然不可能了。
- ` java`设计者们提供了另外一个方式创建线程，就是通过实现`Runnable`接口来创建线程。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/32-javase.png" style="zoom:80%;" />

2、代码示例(普通方式)

定义一个线程任务类实现`Runnable`接口，然后重写`run()`方法，创建线程任务对象，把线程任务对象包装成线程对象，调用`start()`方法启动线程。

```java
package cn.thread.demo02;
/**
 方式二:
 a.定义一个线程任务类实现Runnable接口。重写run()方法
 b.创建一个线程任务对象
 c.把线程任务对象包装成一个线程对象
 -- public Thread(Runnable target)
 d.调用线程对象的start()方法启动线程。

 优缺点：
 缺点：编程相对复杂，不能直接返回线程的执行结果
 优点：
 1. 一个任务对象可以被反复包装成多个线程对象。
 2. 可以避免java中的单继承的局限性。因为线程任务对象只是实现了接口，还可以继续继承其他类和实现其他接口。
 3. 实现解耦操作，线程任务对象代码可以被多个线程共享，代码和线程独立。
 4. 线程池只能放入实现Runable或Callable类线程，不能直接放入继承Thread的类。适合做线程池。
 */

// 定义一个线程任务类实现Runnable接口。
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<4; i++){
            System.out.println(Thread.currentThread().getName() + "=>" + i);
        }
    }
}

public class ThreadDemo01 {
    public static void main(String[] args) {
        // 创建一个线程任务对象
        Runnable target = new MyRunnable();
        // 将线程任务对象包装成线程对象
        Thread t1 = new Thread(target);
        // 启动线程
        t1.start();

        // 创建线程对象
        Thread t2 = new Thread(target);
        // 启动线程
        t2.start();

        for(int i=0; i<4; i++){
            System.out.println(Thread.currentThread().getName() + "=>"+i);
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025135517.png" style="zoom: 67%;" />	

3、代码示例(匿名内部类)

匿名内部类实现`Runnable`接口

 ```java
package cn.guardwhy_03;
/**
 匿名内部类简化写法！
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        // 直接创建Runnable的线程任务对象的匿名内部类形式
        /*
            Runnable target = new Runnable() {
                @Override
                public void run() {
                    for(int i=0; i<10; i++){
                        System.out.println(Thread.currentThread().getName() + "=>" + i);
                    }
                }
            };

            Thread t1 = new Thread(target);
            t1.start();
        */

        // 匿名形式..
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<4; i++){
                    System.out.println(Thread.currentThread().getName() + "=>"+i);
                }
            }
        }).start();

        // 遍历操作
        for(int i=0; i<4; i++){
            System.out.println(Thread.currentThread().getName()+"=>"+i);
        }
    }
}
 ```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025135517.png" style="zoom: 67%;" />	

4、注意事项：启动线程不能直接使用`run()`方法?

- ==因为run()方法仅仅是封装线程执行代码，直接调用是普通方法。Start( )方法首先启动了线程，然后由JVM去调用该线程的run()方法。==
- JVM虚拟机的启动是多线程的，<font color = red>原因是垃圾回收线程要先启动，否则容易出现内存溢出</font>。

#### 14.3.3 Thread和Runnable区别

1、Thread类是Runnable接口的子类,但是Thread类中并且没有完全实现Runnable接口中的run( )方法。

2、如果一个类继承Thread类，不适合于多个线程共享资源，实现Runnable接口,就可以方便地实现资源共享。

#### 14.3.4 Callable接口

1、基本概念

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/27-javase.png" style="zoom: 67%;" />

2、原理分析

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/29-javase.png" style="zoom: 80%;" />

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/30-javase.png" style="zoom: 80%;" />

3、代码示例(传统方式)

定义一个线程任务类实现Callable接口。

```java
package cn.thread.demo03;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 创建线程的方式三:
 a.定义一个线程任务类实现Callable接口。
 b.重写call()方法。
 c.把线程任务对象包装成一个未来任务对象。
 d.把未来任务对象包装成一个线程对象。
 e.调用线程对象的start()方法启动线程。
 优缺点：
 缺点：编码复杂。
 优点：全是优点。
 可以继续继承其他类。可以做线程池。可以得到线程返回的结果。可以做资源共享操作。
 */

//a.定义一个线程任务类实现Callable接口,申明返回值类型
class MyCallable implements Callable<String>{
    @Override
    public String call() throws Exception {
        // 定义计数器
        int count = 0;
        for(int i=0; i<5; i++){
            // 1-10的和
            count += (i+1);
            System.out.println(Thread.currentThread().getName()+"=>"+i);
        }
        return Thread.currentThread().getName()+"求和结果:" + count;
    }
}

public class ThreadDemo01 {
    public static void main(String[] args) {
        // 把线程任务对象包装成一个未来任务对象。
        MyCallable call = new MyCallable();
        /**
         * 未来任务对象： FutureTask
         *  1.可以通过未来任务对象去获取线程执行的结果。
         *  2.未来任务对象其实就是一个Runnable的对象。
         */
        FutureTask<String> target = new FutureTask<>(call);
        // 将未来任务对象包装成一个线程对象
        Thread t1 = new Thread(target);
        // 调用线程对象的start()方法启动线程
        t1.start();

        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + "=>" + i);
        }

        try {
            // 线程的执行的结果
            String result = target.get();
            System.out.println("线程执行结果:" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025142034.png" style="zoom: 67%;" />	

4、 代码示例`(jdk1.8)`

阅读Callable底层源码，分析具体情况。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/31-javase.png" style="zoom:80%;" />

```java
package cn.thread.demo03;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest01 {
    public static void main(String[] args) throws Exception {
        /*
         * 步骤:
         * 1. new Thread(new Runable()).start;
         * 2. new Thread(new FutureTask<V>()).start;
         * 3. new Thread(new FutureTask<V>(Callable)).start;
         */

        // 创建线程对象
        MyThread thread = new MyThread();
        // 适配类：未来任务对象 FutureTask
        FutureTask futureTask = new FutureTask(thread);
        // 线程操作
        new Thread(futureTask, "kobe").start();
        // 第二次调用执行，会有结果缓存，不用再次计算
        new Thread(futureTask, "curry").start();

        // 获取操作，get方法可能会产生阻塞，放到最后
        Integer result = (Integer) futureTask.get();
        System.out.println(result);
    }
}

class MyThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("call方法被调用");
        // 耗时操作
        return 666;
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025144701.png" style="zoom: 80%;" />	

#### 14.3.5 Callable与Runnable区别

- 是否有返回值, 是否抛异常。
- 方法不一样，一个是`call()`方法，一个是`run()`方法。

### 14.4 线程状态

#### 14.4.1 线程终止

1、当线程完成任务后，会自动退出。

2、还可以通过==使用变量==来控制`run()`方法退出的方式停止线程，即==通知方式==。

```java
package cn.thread.demo04;

class T extends Thread {
    // 2.1定义计数器
    private int count = 0;
    //2.2、设置一个控制变量
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            try {
                // 2.2、让当前线程休眠50ms
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T 运行中...." + (++count));
        }

    }

    //2.3、如果希望main线程去控制t1 线程的终止, 必须可以修改 loop，让t1退出run方法，从而终止 t1线程->通知方式
    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

public class ThreadExitDemo01 {
    public static void main(String[] args) throws InterruptedException {
        // 1.1 创建t1对象
        T t1 = new T();
        // 1.2 t1对象调用start()方法
        t1.start();

        //1.3 让主线程休眠 10 秒，再通知 t1线程退出
        System.out.println("main线程休眠10s...");
        Thread.sleep(10 * 20);
        t1.setLoop(false);
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025154020.png" style="zoom:80%;" />	

#### 14.4.2 线程操作方法

1、常用方法1

注意事项:

- `start`底层会创建新的线程，调用`run()`方法, `run`就是一个简单的方法调用，不会启动新线程。
- 线程优先级的范围
- `interrupt`中断线程，但并没有真正的结束线程，所以一般用于中断正在休眠线程。
- `sleep`：线程的静态方法，使当前线程休眠。

| 方法声明                              | 功能介绍                                                     |
| ------------------------------------- | ------------------------------------------------------------ |
| `String getName()`                    | 返回线程的名称                                               |
| `void start( )`                       | 使该线程开始执行，`Java`虚拟机底层调用该线程的`start0()`方法 |
| `void run()`                          | 调用线程对象`run`方法。                                      |
| `Thread()`                            | 使用无参的方式构造对象                                       |
| `Thread(Runnable target,String name)` | 根据参数指定引用和名称来构造对象。                           |
| `long getId()`                        | 获取调用对象所表示线程的编号。                               |
| `Thread currentThread()`              | 获取当前正在执行线程的引用。                                 |
| `int setPriority()`                   | 更改线程的优先级                                             |
| `int getPriority()`                   | 发挥线程的优先级。                                           |
| `boolean isInterrupted()`             | 判断目前线程是否被中断。                                     |
| `void sleep()`                        | 在指定的毫秒数内让当前正在执行的线程休眠(暂停执行)           |

```java
package cn.method.demo01;

//1.1 自定义的线程类
class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                //1.2、Thread.currentThread().getName() 获取当前线程的名称
                System.out.println(Thread.currentThread().getName() + "阅读Java代码！！！" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休息一下！！！");
                //1.3、休眠一下20秒
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                //1.4、当该线程执行到一个interrupt 方法时，就会catch 一个 异常, 可以加入自己的业务代码
                //InterruptedException 是捕获到一个中断异常.
                System.out.println(Thread.currentThread().getName() + "被interrupt了");
            }
        }
    }
}

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        // 2.1、创建t线程
        T t = new T();
        // 2.2 线程t设置名称
        t.setName("guardwhy");
        // 2.3 设置优先级
        t.setPriority(Thread.MIN_PRIORITY);
        //2.4 启动子线程
        t.start();

        //2.5 主线程打印5 hi ,然后我就中断 子线程的休眠
        for(int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hello, Java！！！" + i);
        }

        System.out.println(t.getName() + "线程的优先级 =" + t.getPriority());//1
        //2.6、当执行到这里，就会中断 t线程的休眠.
        t.interrupt();
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025162013.png" style="zoom: 67%;" />	

2、常用方法2

| 方法声明       | 功能介绍                                                     |
| -------------- | ------------------------------------------------------------ |
| `void yield()` | 线程的礼让，让出cpu让其他线程执行，但礼让的时间不确定，所以也不一 定礼让成功。 |
| `void join()`  | 线程的插队，插队的线程旦插队成功， 则肯定先执行完插入的线程所有的任务 |

```java
package cn.method.demo01;

class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                //2.1、休眠1秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程(小弟)吃了" + i +"苹果");
        }
    }
}

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        // 1.1、创建线程对象
        T2 t2 = new T2();
        // 1.2、对象调用方法
        t2.start();
        for(int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程(大哥)吃了" + i  +"苹果");
            if(i == 5) {
                System.out.println("主线程(大哥)让子线程(小弟)先吃");

                //1.3、join, 线程插队，这里相当于让t2 线程先执行完毕
                //t2.join();

                //1.4、礼让，不一定成功..
                Thread.yield();
                System.out.println("线程(小弟)吃完了，主线程(大哥)接着吃..");
            }
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025164157.png" style="zoom: 67%;" />	

#### 14.4.3 线程的生命周期

1、==Java的线程有6种状态==

- **新建状态** ：使用`new`关键字创建之后进入的状态，此时线程并没有开始执行。
- **就绪状态**：调用`start`方法后进入的状态，此时线程还是没有开始执行。
- **运行状态**：使用线程调度器调用该线程后进入的状态，此时线程开始执行，当线程的时间片执行完毕后任务没有完成时回到就绪状态。
- **阻塞状态**：当线程执行的过程中发生了阻塞事件进入的状态，如：`sleep`方法。阻塞状态解除后进入就绪状态。
- **死亡状态**：线程调用`stop()`方法时或者`run()`方法执行结束后，即处于死亡状态。处于死亡状态的线程不具有继续运行的能力。

```java
public enum State {
    /**
     * Thread state for a thread which has not yet started.
     */
    
    // 1. 线程创建
    NEW,

    /**
      * Thread state for a runnable thread.  A thread in the runnable
      * state is executing in the Java virtual machine but it may
      * be waiting for other resources from the operating system
      * such as processor.
      */
    
    // 2.在jvm中正在运行的线程
    RUNNABLE,

    /**
     * Thread state for a thread blocked waiting for a monitor lock.
     * A thread in the blocked state is waiting for a monitor lock
     * to enter a synchronized block/method or
     * reenter a synchronized block/method after calling
     * {@link Object#wait() Object.wait}.
     */
    
    // 3. 线程处于阻塞状态，等待监视锁，可以重新进行同步代码块中执行
    BLOCKED,

    /**
      * Thread state for a waiting thread.
      * A thread is in the waiting state due to calling one of the
      * following methods:
      * <ul>
      *   <li>{@link Object#wait() Object.wait} with no timeout</li>
      *   <li>{@link #join() Thread.join} with no timeout</li>
      *   <li>{@link LockSupport#park() LockSupport.park}</li>
      * </ul>
      *
      * <p>A thread in the waiting state is waiting for another thread to
      * perform a particular action.
      *
      * For example, a thread that has called <tt>Object.wait()</tt>
      * on an object is waiting for another thread to call
      * <tt>Object.notify()</tt> or <tt>Object.notifyAll()</tt> on
      * that object. A thread that has called <tt>Thread.join()</tt>
      * is waiting for a specified thread to terminate.
      */
    
    // 4. 等待状态
    WAITING,

    /**
      * Thread state for a waiting thread with a specified waiting time.
      * A thread is in the timed waiting state due to calling one of
      * the following methods with a specified positive waiting time:
      * <ul>
      *   <li>{@link #sleep Thread.sleep}</li>
      *   <li>{@link Object#wait(long) Object.wait} with timeout</li>
      *   <li>{@link #join(long) Thread.join} with timeout</li>
      *   <li>{@link LockSupport#parkNanos LockSupport.parkNanos}</li>
      *   <li>{@link LockSupport#parkUntil LockSupport.parkUntil}</li>
      * </ul>
      */
    
    // 5.调用sleep() join() wait()方法可能导致线程处于等待状态
    TIMED_WAITING,

    /**
      * Thread state for a terminated thread.
      * The thread has completed execution.
      */
    
    // 6.线程执行完毕，已经退出
    TERMINATED;
}
```

2、生命周期图解

<img src="https://img-blog.csdnimg.cn/2021021521564242.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2h4eTE2MjUzMDk1OTI=,size_16,color_FFFFFF,t_70#pic_center" alt="在这里插入图片描述"  />	

3、生命周期路线

- 新建-就绪-运行-死亡
- 新建-就绪-运行-就绪-运行-死亡
- 新建-就绪-运行-就绪-运行-死亡
- 新建-就绪-运行-其他阻塞-就绪-运行-死亡
- 新建-就绪-运行-同步阻塞-就绪-运行-死亡
- 新建-就绪-运行-等待阻塞-同步阻塞-就绪-运行-死亡

#### 14.4.4 wait和sleep 的区别

- 来自不同的类

  这两个方法来自不同的类分别是，sleep来自Thread类，和wait来自Object类。
  sleep是Thread的静态类方法，谁调用的谁去睡觉，即使在a线程里调用了b的sleep方法，实际上还是a去睡觉，要让b线程睡觉要在b的代码中调用sleep。

- 是否释放资源

  sleep方法没有释放锁，而wait方法释放了锁，使得其他线程可以使用同步控制块或者方法。
  sleep是线程被调用时，占着cpu其他线程不能占用cpu，os认为该线程正在工作，不会让出系统资源，wait是进入等待池等待，让出系统资源，其他线程可以占用cpu。也就是说sleep有时间限制的，就像闹钟一样到时候闹钟铃声就响了，而wait是无限期的除非用户主动notify。

- 使用范围不同

  wait，notify和notifyAll只能在同步控制方法或者同步控制块里面使用，而sleep可以在任何地方使用。

  ```java
  synchronized(x){
  	// x.wait()
  	x.notify()
  }
  ```

- 是否需要捕获异常

  sleep必须捕获异常，而wait，notify和notifyAll不需要捕获异常。

### 14.5 线程同步机制

#### 14.5.1 产生问题的原因

- 当多个线程同时访问同一种共享资源时，可能会造成数据的覆盖等不一致性问题，此时就需要对线程之间进行通信和协调。
- 多个线程并发读写同一个临界资源时会发生线程并发安全问题。
- 异步操作:多线程并发的操作，各自独立运行。同步操作:多线程串行的操作，先后执行的顺序。

#### 14.5.2 线程安全问题

==线程问题的核心原因：多个线程操作同一个共享资源的时候可能出现线程安全问题。==

1、账户对象`(Account类)`

```java
package cn.guardwhy_05;

public class Account {
    // 卡号
    private String cardId;
    // 余额
    private double money;

    // 无参构造器
    public Account() {
    }
    // 代参构造器
    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    /*
        get/set方法
    */
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    // 取钱地点方法
    public void drawMoney(double money){
        // 1.先拿到是谁来取钱:拿到当前线程的名字即可，名字是谁就是谁来取钱
        String name = Thread.currentThread().getName();
        // 2.判断余额是否足够
        if(this.money >= money){
            // 钱够了
            System.out.println(name + "来取钱,余额足够,吐出:" + money);
            // 更新余额
            this.money -= money;
            System.out.println(name + "取钱剩余:" + this.money);
        }else {
            // 钱不够
            System.out.println(name + "来取钱,余额不足..");
        }
    }
}
```

2、取钱的线程类【`DrawThread`】

```java
package cn.guardwhy_05;
/**
 *  取钱的线程类
 */
public class DrawThread extends Thread{
    // 定义一个成员变量接收账户对象
    private Account acc;
    // 带参构造器
    public DrawThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        // 去账户acc中取钱
        acc.drawMoney(10000);
    }
}
```

3、转账功能类【`ThreadSaveDemo01`】

```java
package cn.guardwhy_05;
/**
 先模拟一个线程安全问题的案例：转账功能。

 分析：整存整取。
 （1）定义一个账户（余额，卡号）。
 （2）定义一个取钱的线程类
 （3）创建一个账户对象，创建2个线程对象，去这个账户对象取钱10000

总结：
 多个线程操作同一个共享资源的时候可能出现线程安全问题。
 */
public class ThreadSaveDemo01 {
    public static void main(String[] args) {
        // 1.创建一个共享资源:是一个账户对象,这个对象必须只有一个。
        Account acc = new Account("ICBC-162", 10000);
        // 创建2个线程对象代表curry和james
        DrawThread curry = new DrawThread("curry", acc);
        // 启动线程
        curry.start();

        DrawThread james = new DrawThread("james", acc);
        // 启动线程
        james.start();
    }
}
```

4、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025200739.png" style="zoom:80%;" />	

#### 14.5.3 解决方案

1、引发原因

- 当两个线程同时对同一个账户进行取款时，导致最终的账户余额不合理。
- 线程一执行取款时还没来得及将取款后的余额写入后台，线程二就已经开始取款。

2、解决方案

- ==让线程一执行完毕取款操作后，再让线程二执行即可，将线程的并发操作改为串行操作==。

3、线程同步的作用

- 用于解决线程安全问题，线程同步就是指线程安全了，线程同步解决线程安全问题的核心思想。

- ==线程同步就是让多个线程实现先后有序的访问共享资源，每次只能一个线程执行完毕，另一个线程才能进行==。


#### 14.5.4 同步代码块

1、账户对象类【`Account`】

```java
package cn.guardwhy_06;

public class Account {
    // 卡号
    private String cardId;
    // 余额
    private double money;

    // 无参构造器
    public Account() {
    }
    // 代参构造器
    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    /*
        get/set方法
    */
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    // 取钱地点方法
    public void drawMoney(double money){
        // 1.先拿到是谁来取钱:拿到当前线程的名字即可，名字是谁就是谁来取钱
        String name = Thread.currentThread().getName();
        // 2.判断余额是否足够
        synchronized (this){
            if(this.money >= money){
                // 钱够了
                System.out.println(name + "来取钱,余额足够,吐出:" + money);
                // 更新余额
                this.money -= money;
                System.out.println(name + "取钱剩余:" + this.money);
            }else {
                // 钱不够
                System.out.println(name + "来取钱,余额不足..");
            }
        }

    }
}
```

2、取钱的线程类【`DrawThread`】

```java
package cn.guardwhy_06;

/**
 *  取钱的线程类
 */
public class DrawThread extends Thread{
    // 定义一个成员变量接收账户对象
    private Account acc;
    // 带参构造器
    public DrawThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        // 去账户acc中取钱
        acc.drawMoney(10000);
    }
}
```

3、转账功能类【`ThreadSaveDemo01`】

```java
package cn.guardwhy_06;
/**
同步代码块：
     思想：把“出现线程安全问题的核心代码”给锁起来，每次只能进入一个线程，
     其他线程必须在外面等这个线程执行完毕以后，才能进入执行，这样就线程安全了。
格式:
     synchronized(锁对象){
        出现线程安全问题的核心代码。
     }
锁对象：原则上可以是任意唯一的Java对象。
理论上:在实例方法中推荐用this作为锁.在静态方法中推荐用类名.class字节码文件作为锁对象
*/
public class ThreadSaveDemo01 {
    public static void main(String[] args) {
        // 1.创建一个共享资源:是一个账户对象,这个对象必须只有一个。
        Account acc = new Account("ICBC-162", 10000);
        // 创建2个线程对象代表curry和james
        DrawThread curry = new DrawThread("curry", acc);
        // 启动线程
        curry.start();

        DrawThread james = new DrawThread("james", acc);
        // 启动线程
        james.start();
    }
}
```

4、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se1/34-javase.png"  />	

#### 14.5.5 同步方法	

1、账户对象类【`Account` 】

```java
package cn.guardwhy_07;

public class Account {
    // 卡号
    private String cardId;
    // 余额
    private double money;

    // 无参构造器
    public Account() {
    }
    // 代参构造器
    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    /*
        get/set方法
    */
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    // 取钱地点方法
    public synchronized void drawMoney(double money){
        // 1.先拿到是谁来取钱:拿到当前线程的名字即可，名字是谁就是谁来取钱
        String name = Thread.currentThread().getName();
        // 2.判断余额是否足够
        if(this.money >= money){
            // 钱够了
            System.out.println(name + "来取钱,余额足够,吐出:" + money);
            // 更新余额
            this.money -= money;
            System.out.println(name + "取钱剩余:" + this.money);
        }else {
            // 钱不够
            System.out.println(name + "来取钱,余额不足..");
        }
    }
}
```

2、取钱的线程类【`DrawThread`】

```java
package cn.guardwhy_07;

public class DrawThread extends Thread{
    // 定义一个成员变量接收账户对象
    private Account acc;
    // 带参构造器
    public DrawThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        // 去账户acc中取钱
        acc.drawMoney(10000);
    }
}
```

3、转账功能类实现【`ThreadSaveDemo01`】

```java
package cn.guardwhy_07;
/**
 同步方法：
 思想：把"出现线程安全问题的核心方法"给锁起来,每次只能进入一个线程，
 其他线程必须在外面等这个线程执行完毕以后，才能进入执行，这样就线程安全了。
 只需要在方法上加上一个 synchronized 关键字即可！

 原理：同步方法的原理与同步代码块的原理是一样的，只是同步方法是把整个方法体代码都锁起来，同步方法默认也是有锁对象的。
 如果同步的方法是实例方法，默认用this作为锁对象。如果同步的方法是静态方法，默认用类名.class作为锁对象。
 */
public class ThreadSaveDemo01 {
    public static void main(String[] args) {
        // 1.创建一个共享资源:是一个账户对象,这个对象必须只有一个。
        Account acc = new Account("ICBC-162", 10000);
        // 创建2个线程对象代表curry和james
        DrawThread curry = new DrawThread("curry", acc);
        // 启动线程
        curry.start();

        DrawThread james = new DrawThread("james", acc);
        // 启动线程
        james.start();
    }
}
```

4、执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025201801.png" style="zoom:80%;" />

#### 14.5.6 案例分析

1、案例1

在`main`方法中启动两个线程，第`1`个线程循环随机打印`100`以内的整数，直到第`2`个线程从键盘读取了`Q`命令。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026195328.png" style="zoom:80%;" />	

```java
package cn.homework.demo01;

import java.util.Scanner;
//创建A线程类
class A extends Thread {
    // 定义loop变量
    private boolean loop = true;
    @Override
    public void run() {
        //输出1-100数字
        while (loop) {
            System.out.println((int)(Math.random() * 100 + 1));
            //休眠
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("a线程退出...");
    }
    //可以修改loop变量
    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

//直到第2个线程从键盘读取了“Q”命令
class B extends Thread {
    // 创建a对象
    private A a;
    private Scanner scanner = new Scanner(System.in);

    //构造器中，直接传入A类对象
    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            //接收到用户的输入
            System.out.println("请输入你指令(Q)表示退出:");
            char key = scanner.next().toUpperCase().charAt(0);
            if(key == 'Q') {
                //以通知的方式结束a线程
                a.setLoop(false);
                System.out.println("b线程退出.");
                break;
            }
        }
    }
}

public class Homework01 {
    public static void main(String[] args) {
        // 创建a对象
        A a = new A();
        // 创建b对象
        B b = new B(a);
        // 启动线程a
        a.start();
        // 启动线程a
        b.start();
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026213203.png" style="zoom: 80%;" />	

2、有`2`个用户分别从同一个卡上取钱`(总额: 10000)`，每次都取`1000`,当余额不足时，就不能取款了，不能出现超取现象。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026215210.png" style="zoom: 67%;" />	

```java
package cn.homework.demo01;

//编程取款的线程
//1.因为这里涉及到多个线程共享资源，所以我们使用实现Runnable方式,每次取出 1000
class T implements  Runnable {
    // 定义money
    private int money = 8000;

    @Override
    public void run() {
        while (true) {
            /*
            * 1. 这里使用 synchronized 实现了线程同步
            * 2. 当多个线程执行到这里时，就会去争夺 this对象锁
            * 3. 哪个线程争夺到(获取)this对象锁，就执行 synchronized 代码块, 执行完后，会释放this对象锁
            * 4. 争夺不到this对象锁，就blocked，准备继续争夺，this对象锁是非公平锁.
            */
            synchronized (this) {
                //判断余额是否够
                if (money < 1000) {
                    System.out.println("余额不足");
                    break;
                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName() + "取出了1000，当前余额=" + money);
            }

            //休眠1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Homework02 {
    public static void main(String[] args) {
        // 创建t对象
        T t = new T();
        Thread thread1 = new Thread(t);
        thread1.setName("t1");
        Thread thread2 = new Thread(t);
        thread2.setName("t2");
        // 启动线程
        thread1.start();
        thread2.start();
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026215822.png" style="zoom:67%;" />	

### 14.6 Lock锁

#### 14.6.1 线程通信

1、`Object`类常用方法

| 方法声明                  | 功能介绍                                                     |
| ------------------------- | ------------------------------------------------------------ |
| `void wait()`             | 用于使得线程进入等待状态，直到其它线程调用`notify()`或`notifyAll()`方法,此方法必须锁对象调用。 |
| `void wait(long timeout)` | 用于进入等待状态，直到其它线程调用方法或参数指定的毫秒数已经过去为止。 |
| `void notify()`           | 唤醒当前锁对象上等待状态的某个线程  此方法必须锁对象调用。   |
| `void notifyAll()`        | 唤醒当前锁对象上等待状态的全部线程  此方法必须锁对象调用。   |

2、生产者及消费者案例实现线程通信

账户对象类【`Account`】

```java
package cn.guardwhy_09;
/**
 * 账户对象
 */
public class Account {
    // 卡号
    private String cardId;
    // 余额
    private int money;
    // 无参构造器
    public Account() {
    }
    // 代参构造器
    public Account(String cardId, int money) {
        this.cardId = cardId;
        this.money = money;
    }

    /**
     * get/set方法
     * @return
     */
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    // 取钱方法
    public synchronized void drawMoney(int money){
        try {
            // 1.先拿到是谁来取钱:拿到当前线程的名字即可，名字是谁就是谁来取钱
            String name = Thread.currentThread().getName();
            // 2.判断余额是否足够
            if(this.money >= money){
                // 更新余额
                this.money -= money;
                System.out.println(name + "来取钱,余额足够.吐出:" + money + "元,剩余" + this.money + "元");

                this.notify(); // 钱已经取完了,暂停自己唤醒其他线程！
                // 等待自己
                this.wait();
            }else {
                this.notify();  // 没钱了.唤醒其他线程！
                // 等待自己
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 存钱方法
    public synchronized void saveMoney(int money){
        try {
            String name = Thread.currentThread().getName();
            // 判断是否有钱
            if(this.money == 0){
                // 没钱,需要存钱
                this.money += money;
                System.out.println(name + "来存钱" + money + "元成功, 剩余" + this.money + "元");

                this.notify(); // 钱已经取完了,暂停自己,唤醒其他线程
                this.wait(); // 等待自己
            }else {
                this.notify(); // 唤醒其他线程
                this.wait(); // 等待自己
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

```

存钱的线程类【`SaveThread`】

```java
package cn.guardwhy_09;
/**
 存钱的线程类。
 */
public class SaveThread extends Thread{
    // 定义一个成员变量接收账户对象
    private Account acc;
    // 带参构造器
    public SaveThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        // 3个爸爸来反复的存钱.
        while (true){
            try {
                // 线程休眠
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            acc.saveMoney(10000);
        }
    }
}
```

取钱的线程类【`DrawThread` 】

```java
package cn.guardwhy_09;
/**
 取钱的线程类。
 */
public class DrawThread extends Thread{
    // 定义一个成员变量接收账户对象
    private Account acc;
    // 带参构造器
    public DrawThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        // curry和james来取钱
        while (true){
            // 线程休眠
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 去账户acc中取钱
            acc.drawMoney(10000);
        }
    }
}
```

线程通信测试类【`ThreadCommunication01`】

```java
package cn.guardwhy_09;
/**
 线程通信：多个线程因为在同一个进程中，所以互相通信比较容易。

 线程通信的经典模型：生产者与消费者问题。
 生产者负责生成商品，消费者负责消费商品。
 生成不能不剩，消费不能没有，是一个同步模型。

 线程通信必须先保证线程安全，否则代码会报出异常！！

模拟一个案例：
     curry和james有一个共同账户：共享资源
     他们有3个爸爸（亲爸，岳父，干爹）给他们存钱。

     模型：curry和james去取钱，如果有钱就取出，等待自己，唤醒他们3个爸爸们来存钱
     他们的爸爸们来存钱，如果发现有钱就不存，没钱就存钱，然后等待自己，唤醒孩子们来取钱。
     整存整取 10000元。
分析：
     生产者：亲爸，岳父，干爹
     消费者：curry，james
     共享资源：账户对象。
 */
public class ThreadCommunication01 {
    public static void main(String[] args) {
        // 创建一个共享资源账户对象
        Account acc = new Account("ISBC-162530", 0);

        // 定义两个取钱线程代表curry和james
        new DrawThread("curry", acc).start();
        new DrawThread("james", acc).start();

        // 定义三个存钱线程,分别代表亲爸,岳父,干爹
        new SaveThread("亲爸", acc).start();
        new SaveThread("干爹", acc).start();
        new SaveThread("岳父", acc).start();
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025203315.png" style="zoom:80%;" />	

#### 14.6.2 Lock锁

使用 juc.locks 包下的类操作 Lock 锁 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210215215709663.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2h4eTE2MjUzMDk1OTI=,size_16,color_FFFFFF,t_70#pic_center)

##### 14.6.2.1 接口实现类

1、相关概念

![](https://img-blog.csdnimg.cn/20210215215840359.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2h4eTE2MjUzMDk1OTI=,size_16,color_FFFFFF,t_70#pic_center)	

##### 14.6.2.2 公平锁和非公平锁

1、**公平锁**: 十分公平, 可以先来后到。

2、**非公平锁**: 十分不公平,可以插队(默认是非公平锁)。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210215220012343.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2h4eTE2MjUzMDk1OTI=,size_16,color_FFFFFF,t_70#pic_center)

3、代码示例

```java
package cn.guardwhy.test02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicketDemo01 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        // 函数式接口
        new Thread(()->{for(int i = 1; i < 30; i++) ticket.saleTicket();}, "kobe").start();
        new Thread(()->{for(int i = 1; i < 30; i++) ticket.saleTicket();}, "Curry").start();
        new Thread(()->{for(int i = 1; i < 30; i++) ticket.saleTicket(); }, "James").start();
    }
}

/*
* lock锁使用:
*   1.new ReentrantLock();
*   2.Lock.lock(); // 加锁
*   3. finally=> lock.unlock(); // 解锁
*/
class Ticket{
    private int number = 30;

    // 锁对象
    Lock lock = new ReentrantLock();

    public  void saleTicket(){
        // 加锁操作
        lock.lock();

        try {
            // 条件判断
            if(number > 0){
                System.out.println(Thread.currentThread().getName() + "卖出第" + (number--)
                        + "票, 还剩下:" + number + "张票");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放锁
            lock.unlock();
        }
    }
}
```

##### 14.6.2.3 synchronized和lock 区别

**1、原始构成**

- `synchronized`是`java`内置关键字，属于`JVM`层面。
- `lock`是具体类`(java.util.concurrent.locks.Lock)`是`API`层面的锁。

**2、使用方法**

- `synchronized`无法判断是否获取锁的状态，`Lock`可以判断是否获取到锁。
- `synchronized`不需要用户去手动释放锁，当`synchronized`代码执行完后系统会自动的让线程释放对锁的占用。
- `ReentrantLock`则需要用户去手动释放锁，若用户没有主动释放锁，就可能出现死锁现象。需要`lock()`和`unlock()`方法配合`try/finally`语句块来完成。

**3、等待是否中断**

- `synchronized`不可中断，除非抛出异常或者正常运行完成。
- `ReentrantLock`可中断。

```java
1.设置超时方法: tryLock(long timeout, TimeUnit unit);
2.lockInterruptibly()放入代码块中,调用interrupt()方法可中断。
```

**4、加锁是否公平**

- `synchronized`的锁可重入、不可中断、非公平。
- `ReentrantLock`两者都可以，默认非公平锁，构造方法可以传入`boolean`值，`true`为公平锁，`false`为非公平锁。
- `Lock`锁适合大量同步的代码的同步问题，`synchronized`锁适合代码少量的同步问题。

**5、实现等待通知**

- 关键字`synchronized`通过与`wait()`和`notify()/notifyAll()`方法相结合可以实现等待/通知
- `ReentrantLock`实现等待/通知，需要借助于`Condition`对象。用来精确唤醒线程，而不是像`synchronized`那样要么随机唤醒一个，要么就是全部唤醒。

#### 14.6.3 生产者和消费者

##### 14.6.3.1 synchroinzed实现

1、代码示例

```java
package cn.guardwhy.test02;

/*
* 线程之间的通信问题: 生产者和消费者问题, 等待唤醒，通知唤醒
* 线程交替执行，两个线程操作同一个变量    number=0
*/
public class ThreadDemo02 {
    public static void main(String[] args) {
        // 创建线程对象
        Data data = new Data();
        new Thread(()->{
            for (int i=1; i<=8; i++){
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "kobe").start();

        new Thread(()->{
            for (int i=1; i<=8; i++){
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "curry").start();
    }
}

// 资源类
class Data{
    // 判断等待，业务， 通知
    private int number = 0;

    public synchronized void increment() throws InterruptedException {
        // 判断是否该线程执行操作
        if(number != 0){
            // 等待操作
            this.wait();
        }
        // 执行操作+1
        number++;
        System.out.println(Thread.currentThread().getName() + "===>" + number);
        // 通知其他线程，num+1执行完毕
        this.notifyAll();
    }

    public synchronized void decrement() throws InterruptedException {
        // 判断是否该线程执行操作
        if(number == 0){
            // 等待操作
            this.wait();
        }
        // 执行操作+1
        number--;
        System.out.println(Thread.currentThread().getName() + "===>" + number);
        // 通知其他线程，num-1执行完毕
        this.notifyAll();
    }
}
```

##### 14.6.3.2 防止虚假唤醒

1、**if 和while 的区别**

```xml
多个线程同时操作，存在线程虚假唤醒
```

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/03-javase.png" style="zoom: 80%;" />	

```java
package cn.guardwhy.test02;

public class ThreadDemo03 {
    public static void main(String[] args) {
        // 创建线程对象
        Account accout = new Account();
        new Thread(()->{
            for (int i=1; i<=8; i++){
                try {
                    accout.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "kobe").start();

        new Thread(()->{
            for (int i=1; i<=8; i++){
                try {
                    accout.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "curry").start();

        new Thread(()->{
            for (int i=1; i<=8; i++){
                try {
                    accout.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "james").start();

        new Thread(()->{
            for (int i=1; i<=8; i++){
                try {
                    accout.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "rondo").start();
    }

}

// 资源类
class Account {
    // 判断等待，业务， 通知
    private int number = 0;

    public synchronized void increment() throws InterruptedException {
        // 判断是否该线程执行操作
        while (number != 0){
            // 等待操作
            this.wait();
        }
        // 执行操作+1
        number++;
        System.out.println(Thread.currentThread().getName() + "===>" + number);
        // 通知其他线程，num+1执行完毕
        this.notifyAll();
    }

    public synchronized void decrement() throws InterruptedException {
        // 判断是否该线程执行操作
        while(number == 0){
            // 等待操作
            this.wait();
        }
        // 执行操作+1
        number--;
        System.out.println(Thread.currentThread().getName() + "===>" + number);
        // 通知其他线程，num-1执行完毕
        this.notifyAll();
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025204413.png" style="zoom:80%;" />	

##### 14.6.3.3 Lock锁实现

==精准通知，唤醒线程==。

1、**Lock接口**

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/05-javase.png" style="zoom: 50%;" />

2、**Condition对象**

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/06-javase.png" style="zoom: 50%;" />

3、**常用方法**

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/07-javase.png" style="zoom: 67%;" />

4、**两者方式区别**

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/08-javase.png" style="zoom: 80%;" />

```java
package cn.guardwhy.test03;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* 精确通知顺序访问
*/
public class LockDemo01 {
    public static void main(String[] args) {
        // 1.创建数据资源对象
        Data data = new Data();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data.print1();
            }
        }, "curry").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data.print2();
            }
        }, "kobe").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data.print3();
            }
        }, "james").start();
    }
}

// 资源类
class Data{
    // 创建锁对象
    private Lock lock = new ReentrantLock();
    // 创建Condition对象
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();
    // 定义计数器
    private int number = 1;

    // 打印方法
    public void print1(){
        // 调用锁对象
        lock.lock();
        try {
            // 业务，判断->执行-> 通知
            while (number != 1){
                // 等待
                condition1.await();
            }
            System.out.println(Thread.currentThread().getName() + "===>curry");
            // 指定唤醒的线程
            number = 2;
            condition2.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void print2(){
        // 调用锁对象
        lock.lock();
        try {
            // 业务，判断->执行-> 通知
            while (number != 2){
                condition2.await();
            }
            System.out.println(Thread.currentThread().getName() + "===>kobe");
            // 唤醒指定的线程
            number = 3;
            condition3.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void print3(){
        // 调用锁对象
        lock.lock();
        try {
            // 业务，判断->执行-> 通知
            while (number != 3){
                condition3.await();
            }
            System.out.println(Thread.currentThread().getName() + "===>james");
            // 唤醒指定的线程
            number = 1;
            condition1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
```

5、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/9-javase.png" style="zoom:80%;" />	

#### 14.6.4 八锁现象

##### 14.6.4.1 标准访问

1、代码实现

```java
package cn.guardwhy.test04;

import java.util.concurrent.TimeUnit;

/*
* 标准访问：先发短信还是打电话?
*/
public class LockTest01 {
    public static void main(String[] args) {
        // 创建phone对象
        Phone phone = new Phone();

        new Thread(()->{
            phone.sendMessage();
        }, "curry").start();

        try {
            // 睡眠1s
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone.call();
        }, "kobe").start();
    }
}

// 手机类
class Phone{
    public synchronized void sendMessage(){

        System.out.println("发短信...");
    }

    public synchronized void call(){
        System.out.println("打电话...");
    }
}
```

2、**执行结果**

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/10-javase.png)	

3、**总结**

 synchronized修饰的方法，锁的对象是方法的调用者。因为两个方法的调用者是同一个，==所以当两个方法用的是同一个锁，先调用方法的先执行==。

##### 14.6.4.2 短信暂停5s

1、代码实现

```java
package cn.guardwhy.test04;

import java.util.concurrent.TimeUnit;

/*
* 发短信延迟5s,谁先访问?
*/
public class LockTest01 {
    public static void main(String[] args) {
        // 创建phone对象
        Phone phone = new Phone();

        new Thread(()->{
            phone.sendMessage();
        }, "curry").start();

        try {
            // 睡眠1s
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone.call();
        }, "kobe").start();
    }
}

// 手机类
class Phone{
    public synchronized void sendMessage(){

        try {
            // 睡眠5s
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信...");
    }

    public synchronized void call(){

        try {
            // 睡眠5s
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("打电话...");
    }
}
```

2、执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/10-javase.png)

3、结论

==synchronized修饰的方法，锁的对象是方法的调用者。因为两个方法的调用者是同一个，所以两个方法用的是同一个锁，先调用方法的先执行，第二个方法只有在第一个方法执行完释放锁之后才能执行==。

##### 16.6.4.3  新增普通方法

1、代码示例

```java
package cn.guardwhy.test04;

import java.util.concurrent.TimeUnit;

/*
新增一个普通方法test(),请问先打短信还是test？
*/
public class LockTest02 {
    public static void main(String[] args) {
        // 创建phone对象
        Phone2 phone2 = new Phone2();

        new Thread(()->{
            phone2.sendMessage();
        }, "curry").start();

        try {
            // 睡眠1s
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone2.test();
        }, "kobe").start();
    }
}

// 手机类
class Phone2{
    public synchronized void sendMessage(){

        try {
            // 睡眠5s
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信...");
    }

    public synchronized void call(){
        System.out.println("打电话...");
    }
    // 普通方法
    public void test(){
        System.out.println("hello world!!!");
    }
}
```

2、执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/11-javase.png)

3、总结:

==新增的方法没有被synchronized修饰，不是同步方法，不受锁的影响，所以不需要等待。其他线程共用了一把锁，所以还需要等待==。

##### 16.6.4.4 两个对象

1、代码示例

```java
package cn.guardwhy.test04;

import java.util.concurrent.TimeUnit;

/*
两部手机、先call还是sendMessage?
*/
public class LockTest03 {
    public static void main(String[] args) {
        // 创建phone对象，两个对象，两个调用者，两把锁
        Phone3 phone1 = new Phone3();
        Phone3 phone2 = new Phone3();

        new Thread(()->{
            phone1.sendMessage();
        }, "curry").start();

        try {
            // 睡眠1s
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone2.call();
        }, "kobe").start();
    }
}

// 手机类
class Phone3{
    public synchronized void sendMessage(){

        try {
            // 睡眠5s
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信...");
    }

    public synchronized void call(){
        System.out.println("打电话...");
    }

}
```

2、执行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/12-javase.png" style="zoom:80%;" />

3、总结

被synchronized修饰的方法，锁的对象是方法的调用者。因为用了两个对象调用各自的方法，所以两个方法的调用者不是同一个，==两个方法用的不是同一个锁，后调用的方法不需要等待先调用的方法==。

##### 16.6.4.5 静态同步方法(同对象)

1、代码示例

```java
package cn.guardwhy.test04;

import java.util.concurrent.TimeUnit;

/*
 * 两个静态同步方法，同一部手机,先发短信还是打电话?
 */
public class LockTest04 {
    public static void main(String[] args) {
        // 创建phone对象
        Phone4 phone4 = new Phone4();

        new Thread(()->{
            phone4.sendMessage();
        }, "curry").start();

        try {
            // 睡眠1s
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone4.call();
        }, "kobe").start();
    }
}

// Phone4是唯一的class对象
class Phone4{
    /*
    * synchronized锁的对象是方法的调用者，static是静态方法。
    * 静态方法类一加载就有了！！锁的是Class
    */
    public static synchronized void sendMessage(){

        try {
            // 睡眠5s
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信...");
    }

    public static synchronized void call(){

        System.out.println("打电话...");
    }
}
```

2、执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/13-javase.png)

3、总结：

被synchronized和static修饰的方法，==锁的对象是类的class对象。因为两个同步方法都被static修饰了==，所以两个方法用的是同一个锁，后调用的方法需要等待先调用的方法。

##### 16.6.4.6 静态同步方法(两对象)

1、代码示例

```java
package cn.guardwhy.test04;

import java.util.concurrent.TimeUnit;

/*
 * 两个静态同步方法，同一部手机,先发短信还是打电话?
 */
public class LockTest05 {
    public static void main(String[] args) {
        // 两个对象的Class类模板只有一个，Static,锁的是Class.
        Phone5 phone1 = new Phone5();
        Phone5 phone2 = new Phone5();

        new Thread(()->{
            phone1.sendMessage();
        }, "curry").start();

        try {
            // 睡眠1s
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone2.call();
        }, "kobe").start();
    }
}

// Phone5是唯一的class对象
class Phone5{
    /*
     * synchronized锁的对象是方法的调用者，static是静态方法。
     * 静态方法类一加载就有了！！锁的是Class
     */
    public static synchronized void sendMessage(){

        try {
            // 睡眠5s
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信...");
    }

    public static synchronized void call(){

        System.out.println("打电话...");
    }
}
```

2、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/14-javase.png)	

3、总结

==被synchronized和static修饰的方法，锁的对象是类的class对象。因为两个同步方法都被static修饰了，即便用了两个不同的对象调用方法，两个方法用的还是同一个锁，后调用的方法需要等待先调用的方法==。

##### 16.6.4.7 普通方法和静态方法(同一对象)

1、代码示例

```java
package cn.guardwhy.test06;

import java.util.concurrent.TimeUnit;

/*
 * 一个普通同步方法，一个静态同步方法，同一个对象,先发短信还是打电话?
 */
public class LockTest01 {
    public static void main(String[] args) {
       Phone phone1 = new Phone();

        new Thread(()->{
            phone1.sendMessage();
        }, "curry").start();

        try {
            // 睡眠1s
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone1.call();
        }, "kobe").start();
    }
}


class Phone{
    /*
     * synchronized锁的对象是方法的调用者，static是静态方法。
     * 静态方法类一加载就有了！！锁的是Class
     */
    public static synchronized void sendMessage(){

        try {
            // 睡眠5s
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信...");
    }

    public synchronized void call(){
        System.out.println("打电话...");
    }
}
```

2、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/15-javase.png)	

3、总结

被synchronized和static修饰的方法，锁的对象是类的class对象。==仅仅被synchronized修饰的方法，锁的对象是方法的调用者==。因为两个方法锁的对象不是同一个，所以两个方法用的不是同一个锁，后调用的方法不需要等待先调用的方法。

##### 16.6.4.8 普通方法和静态方法(两个对象)

1、代码示例

```java
package cn.guardwhy.test06;

import java.util.concurrent.TimeUnit;

/*
 * 一个普通同步方法，一个静态同步方法，同一个对象,先发短信还是打电话?
 */
public class LockTest01 {
    public static void main(String[] args) {
       Phone phone1 = new Phone();
       Phone phone2 = new Phone();

        new Thread(()->{
            phone1.sendMessage();
        }, "curry").start();

        try {
            // 睡眠1s
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone2.call();
        }, "kobe").start();
    }
}


class Phone{
    // 静态的同步方法:锁的是Class类模板
    public static synchronized void sendMessage(){

        try {
            // 睡眠5s
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信...");
    }
    
    // 普通的同步方法: 锁的是调用者
    public synchronized void call(){
        System.out.println("打电话...");
    }
}
```

2、执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/15-javase.png)

3、总结:

==被synchronized和static修饰的方法，锁的对象是类的class对象。仅仅被synchronized修饰的方法，锁的对象是方法的调用者。即便是用同一个对象调用两个方法，锁的对象也不是同一个，所以两个方法用的不是同一个锁，后调用的方法不需要等待先调用的方法。==

##### 16.6.4.9 八锁现象总结

- 对于普通同步方法，锁的是当前实例对象。
- 对于静态同步方法，锁的是当前的`Class`对象。
- 对于同步方法块，锁是`synchronized`括号里面的配置对象。

#### 14.6.5 ReadWriteLock(读写锁)

##### 14.6.5.1 基本概念

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/39-javase.png)

##### 14.6.5.2 案例实现

1、代码示例

```java
package cn.guardwhy.juc01;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
* 独占锁(写锁)：一次只能被一个线程占有
* 共享锁(读锁)：多个线程可以同时占有
* ReadWriteLock
* 读-读   可以共存！！！
* 读-写   不能共存！！！
* 写-写   不能共存！！！
*/
public class ReadWriteLockDemo01 {
    public static void main(String[] args) {
        // 创建MyCache对象
        MyCacheLock myCache = new MyCacheLock();

        // 写入操作
        for (int i = 1; i <=3 ; i++) {
            int temp = i;
            new Thread(()->{
                myCache.put(temp + "", temp+ "");
            }, String.valueOf(i)).start();
        }

        // 读取操作
        for (int i = 1; i <=3 ; i++) {
            int temp = i;
            new Thread(()->{
                myCache.get(temp + "");
            }, String.valueOf(i)).start();
        }
    }
}

/*
加锁自定义缓存
*/
class MyCacheLock{
    // volatile能保证顺序性和可见性，但是不能保证原子性，避免机读重新排序。
    private volatile Map<String, Object> map = new HashMap<>();
    // 读写锁: 更加细粒度的控制
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    // 存，写入操作的时候，只希望同时只有一个线程写入
    public void put(String key, Object value){
        // 加锁操作
        readWriteLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "写入" + key);
            map.put(key, value);
            System.out.println(Thread.currentThread().getName() + "写入成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 解锁
            readWriteLock.writeLock().unlock();
        }
    }

    // 取，读操作，所有人都可以读取
    public void get(String key){
        // 加锁
        readWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "读取" + key);
            Object o = map.get(key);
            System.out.println(Thread.currentThread().getName() + "读取成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readWriteLock.readLock().unlock();
        }
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211025205942.png" style="zoom: 67%;" />	

### 14.7 集合类安全

#### 14.7.1 List集合

##### 14.7.1.1 单线程实现

1、代码示例

```java
package cn.guardwhy.List01;

import java.util.Arrays;
import java.util.List;

/*
单线程安全
*/
public class ListTest01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("kobe", "curry", "james");
        list.forEach(System.out::println);
    }
}
```

##### 14.7.1.2 多线程实现

1、代码示例

```java
package cn.guardwhy.List01;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/*
并发修改异常：java.util.ConcurrentModificationException
*/
public class ListTest02 {
    public static void main(String[] args) {
        // 1.创建list集合
        List<String> list = new ArrayList<>();
        // 2.多线程
        for (int i = 0; i <= 100; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,10));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/17-javase.png" style="zoom:80%;" />	

##### 14.7.1.3 解决线程不安全

1、CopyOnWriteArrayList基本概念

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/18-javase.png" style="zoom: 67%;" />

2、代码示例

```java
package cn.guardwhy.List01;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/*
并发下Arraylist是不安全的
*/
public class ListTest03 {
    public static void main(String[] args) {
        /*
        * 解决方案:
        * 1. List<String> list = new Vector<>();
        * 2. List<String> list = Collections.synchronizedList(new ArrayList<>());
        * 3. List<String> list = new CopyOnWriteArrayList<>();
        */

        // 1.创建list集合
        // CopyOnWrite 写入时复制
        List<String> list = new CopyOnWriteArrayList<>();
        // 2.多线程
        for (int i = 0; i <= 100; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,10));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    }
}
```

3、写入时复制`(CopyOnWrite)`思想

<font color = red>写入时复制（简称`COW`）思想是计算机程序设计领域中的一种优化策略。此做法主要的优点是如果调用者没有修改资源，就不会有副本`private copy`)被创建，因此多个调用者只是读取操作时可以共享同一份资源。读写分离，写时复制出一个新的数组，完成插入、修改或者移除操作后将新数组赋值给`array`</font>。

4、==CopyOnWriteArrayList性能比Vector好==

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/19-javase.png)

`Vector`是增删改查方法都加了`synchronized`，保证同步，但是每个方法执行的时候都要去获得锁，性能就会大大下降，而`CopyOnWriteArrayList`只是在增删改上加锁，但是读不加锁，在读方面的性能就好于`Vector`，`CopyOnWriteArrayList`支持读多写少的并发情况。

#### 14.7.2 Set集合

##### 14.7.2.1 多线程实现

1、代码实现

```java
package cn.guardwhy.List01;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
// java.util.ConcurrentModificationException
public class SetTest01 {
    public static void main(String[] args) {
        // 1.创建Set集合
        Set<String> set = new HashSet<>();
        // 2.多线程
        for (int i = 0; i <= 100; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,10));
                System.out.println(set);
            },String.valueOf(i)).start();
        }
    }
}
```

##### 14.7.2.2 解决线程不安全

1、CopyOnWriteArraySet基本介绍

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/20-javase.png" style="zoom:80%;" />

2、代码示例

```java
package cn.guardwhy.List01;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetTest01 {
    public static void main(String[] args) {
        /*
         解决方案:
         1. Set<String> set = Collections.synchronizedSet(new HashSet<>());
         2. Set<String> set = new CopyOnWriteArraySet<>();
         */

        // 1.创建Set集合
        Set<String> set = new CopyOnWriteArraySet<>();
        // 2.多线程
        for (int i = 0; i <= 100; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,10));
                System.out.println(set);
            },String.valueOf(i)).start();
        }
    }
}
```

3、`hashset`底层就是`hashMap`

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/21-javase.png" style="zoom:80%;" />

4、`add()`方法就是`map`的`put()`方法

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/22-javase.png" style="zoom:80%;" />

#### 14.7.3 Map集合

##### 14.7.3.1 源码分析

`hashMap`底层是==数组+链表+红黑树==

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/23-javase.png" style="zoom:80%;" />

```java
Map<String,String> map = new HashMap<>();
// 等价于
Map<String,String> map = new HashMap<>(16,0.75);
```

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/24-javase.png" style="zoom:80%;" />

##### 14.7.3.2 多线程实现

1、代码示例

```java
package cn.guardwhy.List01;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/*
并发修改异常：java.util.ConcurrentModificationException
*/
public class MapTest01 {
    public static void main(String[] args) {
        // 1.创建Map集合对象
      Map<String, String> map = new HashMap<>();
        // 2.多线程
        for (int i = 0; i <= 30; i++) {
            new Thread(()->{
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,5));
                System.out.println(map);
            },String.valueOf(i)).start();
        }
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/25-javase.png" style="zoom: 80%;" />	

##### 14.7.3.3 解决线程不安全

1、`ConcurrentHashMap`概念

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/26-javase.png" style="zoom:80%;" />

2、代码示例

```java
package cn.guardwhy.List01;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/*
并发修改异常：java.util.ConcurrentModificationException
*/
public class MapTest01 {
    public static void main(String[] args) {
       Map<String, String> map = new ConcurrentHashMap<>();
        // 2.多线程
        for (int i = 0; i <= 30; i++) {
            new Thread(()->{
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,5));
                System.out.println(map);
            },String.valueOf(i)).start();
        }
    }
}
```

### 14.8 常用辅助类

#### 14.8.1 CountDownLatch

##### 14.8.1.1 基本概念

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/33-javase.png)

##### 14.8.1.2 底层源码

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/34-javase.png" style="zoom:80%;" />

##### 14.8.1.3 代码示例

```java
package cn.guardwhy.juc01;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo01 {
    public static void main(String[] args) throws InterruptedException {
        // 1.创建countDownLatch对象
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 0; i <=6 ; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + " Start");
                // 数量-1
                countDownLatch.countDown();
            }, String.valueOf(i)).start();
        }
        // 等待计数器归零，然后再往下执行。
        countDownLatch.await();
        System.out.println("End..");
    }
}
```

##### 14.8.1.4 原理分析

==CountDownLatch 主要有两个方法，当一个或多个线程调用 await 方法时，这些线程会阻塞其他线程调用CountDown方法会将计数器减1(调用CountDown方法的线程不会阻塞）当计数器变为0时，await 方法阻塞的线程会被唤醒，继续执行。==

#### 14.8.2 CyclicBarrier

##### 14.8.2.1 基本概念

1、加法计数器

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/35-javase.png" style="zoom: 67%;" />

##### 14.8.2.2 代码示例

```java
package cn.guardwhy.juc01;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo01 {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,()->{
            System.out.println("NBA王朝成立");
        });

        for (int i = 0; i <=7 ; i++) {
            int temp = i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "拿到" + temp + "个总冠军");
                try {
                    // 等待操作
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
```

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026065421.png" style="zoom:80%;" />	

#### 14.8.3 Semaphore

##### 14.8.3.1 基本概念

信号量;信号灯;信号

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/38-javase.png" style="zoom: 67%;" />

##### 14.8.3.2 代码示例

```java
package cn.guardwhy.juc01;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo01 {
    public static void main(String[] args) {
        // 线程数量
        Semaphore semaphore = new Semaphore(3);
        // 多线程
        for (int i = 0; i <=5 ; i++) {
            new Thread(()->{
                try {
                    // acquire() 得到
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "抢到车位");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getName() + "离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 释放资源
                    semaphore.release();
                }
            }).start();
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026070223.png" style="zoom: 67%;" />	

##### 14.8.3.3 原理分析

1、基本概念

- **CyclicBarrier**：指定个数线程执行完毕再执行操作。
- **semaphore**：同一时间只能有指定数量个得到线程。

2、在信号量上两种操作

`acquire`（获取）

- 当一个线程调用`acquire` 操作时，他要么通过成功获取信号量（信号量-1）
- 要么一直等下去，直到有线程释放信号量，或超时。

`release` （释放）

- 实际上会将信号量的值 + 1，然后唤醒等待的线程。

- 信号量主要用于两个目的：一个是用于多个共享资源的互斥使用，另一个用于并发线程数的控制。

3、**作用:** 多个共享资源互斥的使用，并发限流，控制最大的线程数！！！

### 14.9 阻塞队列

#### 14.9.1 基本概念

**队列(queue) ：**是只允许在一端(==头部: front==)进行插入操作，而在另一端==(尾部：rear)==进行删除操作的线性表。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/41-javase.png" style="zoom:80%;" />

**特点：**队列是一种先进先出(First In First Out)的线性表，简称FIFO。==允许插入的一端为队尾，允许删除的一端称为对头==。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/43-javase.png)

#### 14.9.2 BlockingQueue

##### 14.9.2.1基本概念

阻塞：必须要阻塞、不得不阻塞

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/42-javase.png)

阻塞队列是一个队列，在数据结构中起的作用如下图

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/44-javase.png)

- 当队列是空的，从队列中获取元素的操作将会被阻塞。
- 当队列是满的，从队列中添加元素的操作将会被阻塞。
- 试图从空的队列中获取元素的线程将会被阻塞，直到其他线程往空的队列插入新的元素。
- 试图向已满的队列中添加新元素的线程将会被阻塞，直到其他线程从队列中移除一个或多个元素或者完全清空，使队列变得空闲起来并后续新增。

##### 14.9.2.2 阻塞队列的用处

- 在多线程领域：所谓阻塞，在某些情况下会挂起线程（即阻塞），一旦条件满足，被挂起的线程又会自动被唤起。

- 好处是不需要关心什么时候需要阻塞线程，什么时候需要唤醒线程，因为这一切`BlockingQueue` 都可以处理好。


#### 14.9.3 接口架构

##### 14.9.3.1 接口架构图

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/45-javase.png" style="zoom:80%;" />

- ArrayBlockingQueue：由数组结构组成的有界阻塞队列。
- LinkedBlockingQueue：由链表结构组成的有界（默认值为：integer.MAX_VALUE）阻塞队列。

##### 14.9.3.2 常用API

| 方法\处理方法 | 抛出异常   | 返回特殊值 | 一直阻塞 | 超时退出             |
| ------------- | ---------- | ---------- | -------- | -------------------- |
| 插入方法      | add(e)     | offer(e)   | put(e)   | offer(e, time, unit) |
| 移除方法      | remove( )  | poll( )    | take( )  | poll(time, unit)     |
| 检查方法      | element( ) | peek( )    | 不可用   | 不可用               |

1、抛出异常

```java
package cn.guardwhy.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/*
抛出异常
*/
public class BlockingQueueDemo01 {
    public static void main(String[] args) {
        // 1.队列的大小
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(3);
        // 2.添加元素
        System.out.println(blockingQueue.add("kobe"));
        System.out.println(blockingQueue.add("curry"));
        System.out.println(blockingQueue.add("James"));
        // java.lang.IllegalStateException: Queue full
        // System.out.println(blockingQueue.add("Durant"));

        System.out.println("=========");
        System.out.println("队首元素:" + blockingQueue.element()); // 查看队首元素？

        // 3.出队操作
        System.out.println("=========");
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        // java.util.NoSuchElementException,抛出异常
        // System.out.println(blockingQueue.remove());
    }
}
```

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026095134.png" style="zoom: 67%;" />	

2、返回特殊值

```java
package cn.guardwhy.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueDemo02 {
    public static void main(String[] args) {
        // 1.队列的大小
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(3);
        // 2.添加元素
        System.out.println(blockingQueue.offer("kobe"));
        System.out.println(blockingQueue.offer("curry"));
        System.out.println(blockingQueue.offer("James"));
        System.out.println(blockingQueue.offer("Durant"));

        System.out.println("=========");
        System.out.println("队首元素:" + blockingQueue.peek()); // 查看队首元素？

        // 3.出队操作
        System.out.println("=========");
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());   // null 不抛出异常
    }
}
```

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026095303.png" style="zoom: 67%;" />	

3、一直阻塞

```java
package cn.guardwhy.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueDemo03 {
    public static void main(String[] args) throws InterruptedException {
        // 1.队列的大小
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(3);
        // 2.添加元素
        blockingQueue.put("kobe");
        blockingQueue.put("Durant");
        blockingQueue.put("James");
        // blockingQueue.put("curry"); 一直阻塞


        // 3.出队操作
        System.out.println("=========");
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        // System.out.println(blockingQueue.take());// 阻塞不停止等待
    }
}
```

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026095444.png" style="zoom:67%;" />	

4、超时退出

```java
package cn.guardwhy.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueDemo04 {
    public static void main(String[] args) throws InterruptedException {
        // 1.队列的大小
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(3);
        // 2.添加元素
        blockingQueue.offer("kobe");
        blockingQueue.offer("Durant");
        blockingQueue.offer("James");
        blockingQueue.offer("curry", 3, TimeUnit.SECONDS); // 等待超过3秒就退出 


        // 3.出队操作
        System.out.println("=========");
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll(3, TimeUnit.SECONDS));// 等待超过3s就退出
    }
}
```

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026095647.png" style="zoom:67%;" />	

#### 14.9.4 SynchronousQueue

##### 14.9.4.1 同步队列

`SynchronousQueue`是`BlockingQueue`的实现类。`SynchronousQueue` 没有容量，与其他的`BlockingQueue`不同，`SynchronousQueue`是一个不存储元素的 `BlockingQueue` ，每一个`put`操作必须要等待一个`take`操作，否则不能继续添加元素。

##### 14.9.4.2 代码示例

```java
package cn.guardwhy.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class SynchronousQueueDemo05 {
    public static void main(String[] args) {
        // 1.创建队列
        BlockingQueue<String> blockingQueue = new SynchronousQueue<>();
        // 2.添加元素
        new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName() + "1");
                blockingQueue.put(" curry");
                System.out.println(Thread.currentThread().getName() + "2");
                blockingQueue.put(" kobe");
                System.out.println(Thread.currentThread().getName() + "3");
                blockingQueue.put(" james");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "NBA").start();

        new Thread(()->{
            // 延迟3s
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println(Thread.currentThread().getName() + blockingQueue.take());
                TimeUnit.SECONDS.sleep(3);
                System.out.println(Thread.currentThread().getName() + blockingQueue.take());
                TimeUnit.SECONDS.sleep(3);
                System.out.println(Thread.currentThread().getName() + blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"NBA").start();
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/46-javase.png" style="zoom:80%;" />	

### 14.10 线程池

#### 14.10.1 池化技术

1、线程池特点：==线程复用，控制最大并发数，管理线程==。

2、池化技术简单点来说：<font color = red>就是提前保存大量的资源，以备不时之需。在机器资源有限的情况下，使用池化技术可以大大的提高资源的利用率，提升性能等</font>。

3、在编程领域，比较典型的池化技术有：线程池、连接池、内存池、对象池等。

#### 14.10.2 线程池实现原理

通过创建一个线程对象，并且实现`Runnable`接口就可以实现一个简单的线程。可以利用上多核`CPU`。当一个任务结束，当前线程就接收。但很多时候，我们不止会执行一个任务。==如果每次都是如此的创建线程->执行任务->销毁线程，会造成很大的性能开销那能否一个线程创建后，执行完一个任务后，又去执行另一个任务，而不是销毁。这就是线程池==。

#### 14.10.3 使用线程池好处

- 降低资源消耗，通过重复利用已创建的线程降低线程创建和销毁造成的消耗。
- 提高响应速度。当任务到达时，任务可以不需要等待线程创建就能立即执行。
- 提高线程的可管理性，线程是稀缺资源，如果无限制的创建，不仅会消耗系统资源，还会降低系统的稳定性，使用线程池可以进行统一分配，调优和监控。

#### 14.10.4 三大方法

1、代码示例

```java
package cn.guardwhy.demo04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo06 {
    public static void main(String[] args) {
        // ExecutorService threadPool = Executors.newSingleThreadExecutor(); // 单个线程
        // ExecutorService threadPool = Executors.newFixedThreadPool(5); // 创建一个固定的线程池的大小
        ExecutorService threadPool = Executors.newCachedThreadPool();// 无限容器

        try {
            for (int i = 0; i < 10; i++) {
                // 使用线程池来创建线程
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName() + " 创建成功..");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭线程池,程序结束。
            threadPool.shutdown();
        }
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026101401.png" style="zoom: 80%;" />	

#### 14.10.5 七大参数

##### 14.10.5.1 源码分析

查看三大方法的底层源码，都调用了`new ThreadPoolExecutor()`方法

```java
public ThreadPoolExecutor(int corePoolSize, // 核心线程池大小
                              int maximumPoolSize,	// 最大核心线程池大小
                              long keepAliveTime,	// 空闲的线程保留的时间
                              TimeUnit unit,	// 超时单位
                              BlockingQueue<Runnable> workQueue, // 阻塞队列
                              ThreadFactory threadFactory,	// 线程工厂，创建线程的
                              RejectedExecutionHandler handler) {	// 拒绝策略
        if (corePoolSize < 0 ||
            maximumPoolSize <= 0 ||
            maximumPoolSize < corePoolSize ||
            keepAliveTime < 0)
            throw new IllegalArgumentException();
        if (workQueue == null || threadFactory == null || handler == null)
            throw new NullPointerException();
        this.acc = System.getSecurityManager() == null ?
                null :
                AccessController.getContext();
        this.corePoolSize = corePoolSize;
        this.maximumPoolSize = maximumPoolSize;
        this.workQueue = workQueue;
        this.keepAliveTime = unit.toNanos(keepAliveTime);
        this.threadFactory = threadFactory;
        this.handler = handler;
}
```

##### 14.10.5.2 注意点

线程池不允许使用`Executors`去创建，而是通过`ThreadPoolExecutor`的方式，这样的处理方式能更加明确线程池的运行规则，规避资源耗尽的风险。`Executors` 返回的线程池对象的弊端如下:

1、 <font color= red>**FixedThreadPool 和SingleThreadPool**</font>

- 允许的请求队列长度为`Integer.MAX_ VALUE`【约为21亿】， 可能会堆积大量的请求，从而导致`OOM`【内存溢出】。

2、<font color = red>**CachedThreadPool和ScheduledThreadPool**</font>

允许的创建线程数量为`Integer.MAX_ VALUE`，可能会创建大量的线程，从而导致OOM。

##### 14.10.5.3 ThreadPoolExecutor底层原理

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026104445.png)

#### 14.10.6 四种拒绝策略

##### 14.10.6.1 银行办理业务

- 1~2人被受理（核心区大小core）
- 3~5人进入队列（Queue）
- 6~8人到最大线程池（扩容大小max）
- 再有人进来就要被拒绝策略接受了

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/48-javase.png" style="zoom: 80%;" />

##### 14.10.6.2 源码分析

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/49-javase.png)	

##### 14.10.6.3  代码示例

1、案例实现

```java
package cn.guardwhy.BlockingQueue;

import java.util.concurrent.*;
/*
* 1.new ThreadPoolExecutor.CallerRunsPolicy(): 银行满了，还有客户进来。不处理这个客户，抛出异常
* 2.new ThreadPoolExecutor.AbortPolicy(): 队列满了丢任务，不抛出异常,哪来的去哪里。
* 3.new ThreadPoolExecutor.DiscardPolicy()：队列满了，丢掉任务，不会抛出异常！！！！
* 4.new ThreadPoolExecutor.DiscardOldestPolicy()：队列满了,尝试去和最早的竞争，但是不会抛出异常。
*
*/
public class ThreadPoolDemo07 {
    public static void main(String[] args) {
        ExecutorService threadPool = new ThreadPoolExecutor(2,
                5
                , 3,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());

        try {
            // 最大容量: Deque + maximumPoolSize
            for (int i = 0; i < 9; i++) {
                // 使用线程池来创建线程
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName() + " 创建成功..");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭线程池,程序结束。
            threadPool.shutdown();
        }
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026104855.png" style="zoom: 67%;" />	

##### 14.10.6.4 线程池设置

1、最大的线程设置：==IO密集型， CPU密集型 (调优)==

```java
package cn.guardwhy.BlockingQueue;

import java.util.concurrent.*;
/*
 最大线程定义:
 1.CPU 密集型，几核就是几，可以保持CPU的效率最高。cpu密集型的任务来说，线程数等于cpu数是最好的了。
 2.IO 密集型 》= 判断程序中十分消耗的IO线程，线程数大于等于IO任务数是最佳的
*/
public class ThreadPoolDemo07 {
    public static void main(String[] args) {
        // 获取CPU的核数
        System.out.println(Runtime.getRuntime().availableProcessors());

        ExecutorService threadPool = new ThreadPoolExecutor(2,
                Runtime.getRuntime().availableProcessors()
                , 3,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());

        try {
            // 最大容量: Deque + maximumPoolSize
            for (int i = 0; i < 9; i++) {
                // 使用线程池来创建线程
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName() + " 创建成功..");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭线程池,程序结束。
            threadPool.shutdown();
        }
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026105139.png" style="zoom: 67%;" />	

####  14.10.7 函数式接口

`java.util.function` ,` Java` 内置核心四大函数式接口，可以使用`lambda`表达式。

1、函数型接口`(function)`：只有一个方法的接口

##### 14.10.7.1 源码分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/52-javase.png" style="zoom:80%;" />

##### 14.10.7.2 代码示例

```java
package cn.guardwhy.juc02;

import java.util.function.Function;
/*
Function 函数型接口,只有一个参数输入，有一个参数输出
只要是函数型接口，都可以用lambda表达式简化
*/
public class Function01 {
    public static void main(String[] args) {
        /*Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String str) {
                return str;
            }
        };*/

        Function<String, String> function = (str)->{
            return str;
        };

        // 输出结果
        System.out.println(function.apply("hello world!!!"));
    }
}
```

#### 14.10.8 断定型接口(Predicate)

有一个输入参数，返回只有布尔值。

##### 14.10.8.1 源码分析

```java
/**
 * Represents a predicate (boolean-valued function) of one argument.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #test(Object)}.
 *
 * @param <T> the type of the input to the predicate
 *
 * @since 1.8
 */
@FunctionalInterface
public interface Predicate<T> {

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param t the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
    boolean test(T t);
```

##### 14.10.8.2 代码示例

```java
package cn.guardwhy.juc02;

import java.util.function.Predicate;

public class Predicate02 {
    public static void main(String[] args) {
        /*Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String str) {
                return str.isEmpty();
            }
        };*/

        Predicate<String> predicate = str->{
            return str.isEmpty();
        };

        System.out.println(predicate.test(" ")); // false
    }
}
```

#### 14.10.9 消费型接口(Consumer)

有一个输入参数，没有返回值。

##### 14.10.9.1 源码分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/53-javase.png" style="zoom:80%;" />

##### 14.10.9.2 代码示例

```java
package cn.guardwhy.juc02;

import java.util.function.Consumer;
/*
Consumer消费型接口:只有输入，没有返回值
*/
public class ConsumerDemo03 {
    public static void main(String[] args) {
        /*Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        };*/

        Consumer<String> consumer = str->{
            System.out.println(str);
        };
        consumer.accept("hello world!!!");
    }
}
```

#### 14.10.10 供给型接口

没有输入参数，只有返回参数。

##### 14.10.10.1 源码分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/54-javase.png" style="zoom:80%;" />

##### 14.10.10.2 代码分析

```java
package cn.guardwhy.juc02;

import java.util.function.Supplier;
/*
Supplier 供给型接口,没有参数，只有返回值。
*/
public class SupplierDemo04 {
    public static void main(String[] args) {
        /*Supplier supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                System.out.println("get()方法");
                return 666;
            }
        };*/

        // 表达式
        Supplier supplier = ()->{
            return 666;
        };
        System.out.println(supplier.get());
    }
}
```

#### 14.10.11 分支合并

##### 14.10.11.1 什么是ForkJoin

从JDK1.7开始，Java提供Fork/Join框架用于并行执行任务，就是将一个大任务分割成若干小任务，最终汇总每个小任务的结果得到这个大任务的结果。
过程主要有两步：

- 第一:  任务切割；
- 第二 ： 结果合并

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/57-javase.png)



##### 14.10.11.2 ForkJoin特点

就是一个工作线程下会维护一个包含多个子任务的双端队列。而对于每个工作线程来说，会从头部到尾部依次执行任务。这时，总会有一些线程执行的速度
较快，很快就把所有任务消耗完了。
**工作窃取（work-stealing)**: 是指某个线程从其他队列里窃取任务来执行。

**线程的任务窃取:** 比如你和你的小伙伴在一起吃水果，你的那份吃完了，他那份没吃完，这个时候你偷偷的拿了他的一些水果吃了。==存在执行2个任务的子线程，存在A,B两个WorkQueue在执行任务，A的任务执行完了，B的任务没执行完，那么A的WorkQueue就从B的WorkQueue的ForkJoinTask数组中拿走了一部分尾部的任务来执行，可以合理的提高运行和计算效率。==

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/58-javase.png" style="zoom:80%;" />

##### 14.10.11.3 核心类

1、ForkJoinPool

`WorkQueue`是一个`ForkJoinPool`中的内部类，它是线程池中线程的工作队列的一个封装，支持任务窃取。
每个线程都有一个`WorkQueue`，而`WorkQueue`中有执行任务的线程`(ForkJoinWorkerThreadowner)`，还有这个线程需要处理的任务`(ForkJoinTask<?>[] array)`。那么这个新提交的任务就是加到`array`中。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/55-javase.png)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/56-javase.png)

2、ForkJoinTask

`ForkJoinTask`代表运行在`ForkJoinPool`中的任务。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/59-javase.png)

**主要方法**：

- `fork()` 在当前线程运行的线程池中安排一个异步执行。简单的理解就是再创建一个子任务。
- `join()` 当任务完成的时候返回计算结果。
- `invoke()` 开始执行任务，如果必要，等待计算完成。

**子类**：`Recursive`【递归】

- `RecursiveAction` 一个递归无结果的`ForkJoinTask`【没有返回值】
- `RecursiveTask` 一个递归有结果的`ForkJoinTask`【有返回值】

##### 14.10.11.4 代码示例

1、源码分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/60-javase.png" style="zoom:80%;" />

2、核心代码

```java
package cn.guardwhy.forkJoin;

import java.util.concurrent.RecursiveTask;
/*
* 求和计算的任务!!
* 1.使用forkjoin
* 1.1forkjoinpool 通过它来执行。
* 1.2 计算任务ForkJoinPool.excute(ForkJoinTask task)
* 1.3 计算类要继承ForkJoinTask
*/
public class ForkJoinDemo extends RecursiveTask<Long> {
    private Long start; // 起始值
    private Long end; // 结束值

    // 临界值
    private Long temp = 10000L;

    public ForkJoinDemo(Long start, Long end) {
        this.start = start;
        this.end = end;
    }

    // 计算方法
    @Override
    protected Long compute() {
        // 常规方式
        if((end - start) < temp){
            // 定义sum值
            Long sum = 0L;
            for (Long i = start; i <= end ; i++) {
                sum += i;
            }
            return sum;
        }else {
          // ForkJoin递归
            long middle = (start + end) / 2; // 中间值
            ForkJoinDemo task1 = new ForkJoinDemo(start, middle);
            // 拆分任务，把任务压入线程队列
            task1.fork();
            ForkJoinDemo task2 = new ForkJoinDemo(middle+1, end);
            // 拆分任务，把任务压入线程队列
            task2.fork();
            return task1.join() + task2.join();
        }
    }
}
```

3、测试代码

```java
package cn.guardwhy.forkJoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class ForkJoinTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
         // test1();    // sum=500000000500000000 时间: 6235
         test2();    // sum=500000000500000000 时间: 6017
        // test03();   // sum=500000000500000000 时间: 102
    }

    // 1.普通方式
    public static void test1() {
        Long sum = 0L;
        long start = System.currentTimeMillis();
        for (Long i = 1L; i <=10_0000_0000 ; i++) {
            sum += i;
        }
        Long end = System.currentTimeMillis();
        System.out.println("sum=" +sum+" 时间: " + (end-start));
    }

    // 2.使用ForkJoin方法
    private static void test2() throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoinDemo(0L, 10_0000_0000L);
        // 提交任务
        ForkJoinTask<Long> submit = forkJoinPool.submit(task);
        Long sum = submit.get();

        long end = System.currentTimeMillis();
        System.out.println("sum=" +sum+" 时间: " + (end-start));
    }

    // 3.链式编程
    private static void test03() {
        long start = System.currentTimeMillis();
        // Stream并行流
        long sum = LongStream.rangeClosed(0L, 10_0000_0000L).parallel().reduce(0, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("sum=" +sum+" 时间: " + (end-start));
    }

}
```

4、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026174925.png)	

#### 14.10.12 异步回调

##### 14.10.12.1 Future基本概念

对将来某个时刻会发生的结果进行建模。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/61-javase.png)

##### 14.10.12.2 CompletableFuture(实现类)

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/62-javase.png" style="zoom:80%;" />

##### 14.10.12.3 异步回调图解

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/63-javase.png" style="zoom: 67%;" />	

**Future的优点**：比更底层的Thread更易用。要使用Future，通常只需要将耗时的操作封装在一个Callable对象中，再将它提交给ExecutorService。

##### 14.10.12.4 代码示例

```java
package cn.guardwhy.forkJoin;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/*
* 异步调用:completableFuture
* 1. 异步执行
* 2.成功调回
* 3.失败回调
*/
public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1.1没有返回值的runAsync 异步回调
        CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(()->{
           // 1.2 休息2s
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "runAsync=>Void");
        });
        System.out.println("123");
        // 1.3 获取阻塞执行结果
        completableFuture1.get();

        System.out.println("======================");

        // 2.1 有返回值的supplyAsync 异步回调
        CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(()->{
            System.out.println(Thread.currentThread().getName() + "supplyAsync=>Integer");
            int i = 10/0;
            return 666;
        });
        System.out.println(completableFuture2.whenComplete((t,u)->{
            // 2.2 正常的返回结果
            System.out.println("t==>" + t);
            // 2.3 java.util.concurrent.CompletionException
            System.out.println("u==>" + u);
        }).exceptionally((e)->{
            System.out.println(e.getMessage());
            // 2.4 可以获取到错误的返回结果
            return 111;
        }).get());
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026180753.png" style="zoom: 67%;" />	

### 14.11 Volatile关键字

#### 14.11.1 volatile的理解

volitile 是 Java 虚拟机提供的轻量级的同步机制，三大特性：

- 保证可见性。
- ==不保证原子性==。
- 禁止指令重排。

#### 14.11.2 JMM基本概念

JMM 本身是一种抽象的概念，并不真实存在，它描述的是一组规则或者规范。

 1、**JMM 同步的规定：**

- 线程解锁前，必须把共享变量的值刷新回主内存。
- 线程加锁前，必须读取主内存的最新值到自己的工作内存，加锁解锁是同一把锁。

2、==JMM即为JAVA 内存模型（java memory model）==。因为在不同的硬件生产商和不同的操作系统下，内存的访问逻辑有一定的差异，结果就是当你的代码在某个系统环境下运行良好，并且线程安全，但是换了个系统就出现各种问题。

3、==Java内存模型，就是为了屏蔽系统和硬件的差异，让一套代码在不同平台下能到达相同的访问结果。==

#### 14.11.3  JMM内存模型

JMM规定了内存主要划分为**主内存**和**工作内存**两种。此处的主内存和工作内存跟JVM内存划分（堆、栈、方法区）是在不同的层次上进行的，如果非要对应起来，==主内存对应的是Java堆中的对象实例部分，工作内存对应的是栈中的部分区域，从更底层的来说，主内存对应的是硬件的物理内存，工作内存对应的是寄存器和高速缓存==。

**代码示例**

```java
package cn.guardwhy.volatile01;

import java.util.concurrent.TimeUnit;

/*
* JMM内存模型
*/
public class JMMDemo01 {
    private static int num = 0;
    public static void main(String[] args) { // 线程1(main线程)
        new Thread(()->{ // 线程2
            while (num == 0){

            }
        }).start();

        try {
            // 休眠1s
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        num = 1;
        System.out.println("num的值:" + num);
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026111318.png" style="zoom:80%;" />	

==线程1感知不到线程2操作了值的变化==！如何能够保证线程间可以同步感知这个问题呢？只需要使用Volatile关键字即可！volatile 保证线程间变量的可见性，简单地说就是当线程A对变量X进行了修改后，在线程A后面执行的其他线程能看到变量X的变动，更详细地说是要符合以下两个规则 ：

- 线程对变量进行修改之后，要立刻回写到主内存。
- 线程对变量读取的时候，要从主内存中读，而不是缓存
- 各线程的工作内存间彼此独立，互不可见，在线程启动的时候，虚拟机为每个内存分配一块工作内存，不仅包含了线程内部定义的局部变量，也包含了线程所需要使用的共享变量（非线程内构造的对象）的副本，即，为了提高执行效率。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/65-javase.png" style="zoom:80%;" />

#### 14.11.4 内存交互操作

1、==内存交互操作有8种，虚拟机实现必须保证每一个操作都是原子的，不可在分的==。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/64-javase.png" style="zoom: 67%;" />

- `lock(锁定)`：作用于主内存的变量，把一个变量标识为线程独占状态。
- `unlock(解锁)`：作用于主内存的变量，它把一个处于锁定状态的变量释放出来，释放后的变量才可以被其他线程锁定。
- `read(读取)`：作用于主内存变量，它把一个变量的值从主内存传输到线程的工作内存中，以便随后的`load`动作使用。
- `load(载入)`：作用于工作内存的变量，它把read操作从主存中变量放入工作内存中。
- `use(使用)`：作用于工作内存中的变量，它把工作内存中的变量传输给执行引擎，每当虚拟机遇到一个需要使用到变量的值，就会使用到这个指令。
- `assign(赋值)`：作用于工作内存中的变量，它把一个从执行引擎中接受到的值放入工作内存的变量副本中。
- `store(存储)`：作用于主内存中的变量，它把一个从工作内存中一个变量的值传送到主内存中，以便后续的write使用。
- `write(写入)`：作用于主内存中的变量，它把store操作从工作内存中得到的变量的值放入主内存的变量中

2、JMM对这八种指令的使用，制定了如下规则

- 不允许`read`和`load`、`store`和`write`操作之一单独出现。即使用了`read`必须`load`，使用了`store`必须`write`。
- 不允许线程丢弃他最近的`assign`操作，即工作变量的数据改变了之后，必须告知主存。
- 不允许一个线程将没有`assign`的数据从工作内存同步回主内存。
- 一个新的变量必须在主内存中诞生，不允许工作内存直接使用一个未被初始化的变量。对变量实施`use、store`操作之前，必须经过`assign`和`load`操作。
- 一个变量同一时间只有一个线程能对其进行`lock`。多次`lock`后，必须执行相同次数的`unlock`才能解锁。
- 如果对一个变量进行`lock`操作，会清空所有工作内存中此变量的值，在执行引擎使用这个变量前，必须重新`load`或`assign`操作初始化变量的值。
- 如果一个变量没有被`lock`，就不能对其进行`unlock`操作。也不能`unlock`一个被其他线程锁住的变量。
- 对一个变量进行`unlock`操作之前，必须把此变量同步回主内存。

3、小结

3.1、`JMM`对这八种操作规则和对`volatile`的一些特殊规则就能确定哪里操作是线程安全，哪些操作是线程不安全的了。但是这些规则实在复杂，很难在实践中直接分析，更多的时候，使用`java`的`happen-before`规则来进行分析。

3.2、happen-before规则

==happens-before就是先行发生，在Java内存模型中，happens-before 应该翻译成：前一个操作的结果可以被后续的操作获取==。通俗点说就是前面一个操作把变量赋值为`3`，那后面一个操作肯定知道变量已经变成了`3`。所以为了解决多线程的可见性问题，就搞出了`happens-before`原则，==让线程之间遵守这些原则==。编译器还会优化`java`语句，所以等于是给了编译器优化的约束。

#### 14.11.5 保证可见性

1、代码示例

```java
package cn.guardwhy.volatile01;
import java.util.concurrent.TimeUnit;
/*
 保证可见性
*/
public class VolatileDemo01 {
    // 不加 volatile程序会出现死循环,加上volatile可以保证可见性。
    private volatile static int num = 0;

    public static void main(String[] args) {
        new Thread(()->{ // 线程2对主内存的变化不知道
            while (num == 0){

            }
        }).start();

        try {
            // 休眠1s
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        num = 1;
        System.out.println("num的值:" + num);
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211026113532.png" style="zoom:80%;" />	

#### 14.11.6 不保证原子性

1、原子性理解：不可分割，完整性，也就是某个线程正在做某个具体的业务的时候，中间不可以被加塞或者被分割，要整体完整，要么同时成功，要么同时失败。

```java
package cn.guardwhy.volatile01;
/*
验证volatile 不保证原子性
*/
public class VolatileDemo02 {

    private volatile static int num = 0;

    public static void add(){
        num++;
    }

    public static void main(String[] args) {
        // 1.理论上num的值应该为2w
        for (int i = 1; i <= 20 ; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    // 2.调用方法
                    add();
                }
            }).start();
        }

        while (Thread.activeCount()>2){
            // 礼让
            Thread.yield();
        }

        System.out.println(Thread.currentThread().getName() + " " + num);
    }
}
```

2、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/66-javase.png)	

3、命令行查看底层字节码代码实现：`javap -c VolatileDemo02.class`，==num++ 在多线程下是非线程安全的==

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/67-javase.png" style="zoom:80%;" />

4、不加`Lock`锁和`synchronized`，如何保证原子性

通过使用原子类， 解决原子性的问题。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/68-javase.png" style="zoom:80%;" />

案例实现

```java
package cn.guardwhy.volatile01;

import java.util.concurrent.atomic.AtomicInteger;

// volatile 不保证原子性
public class VolatileDemo02 {
    // 原子类的Integer
    private volatile static AtomicInteger num = new AtomicInteger();

    public static void add(){
        num.getAndIncrement(); // AtomicInteger + 1 方法， CAS
    }

    public static void main(String[] args) {
        // 1.理论上num的值应该为2w
        for (int i = 1; i <= 20 ; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    // 2.调用方法
                    add();
                }
            }).start();
        }

        while (Thread.activeCount()>2){
            // 礼让
            Thread.yield();
        }

        System.out.println(Thread.currentThread().getName() + " " + num);
    }
}
```

5、执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/69-javase.png)

6、源码分析

==这些原子类的底层都直接和操作系统挂钩！！！允许在内存中修改值！！==**unsafe类**是个很特殊的存在。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/70-javase.png" style="zoom:80%;" />

#### 14.11.7 指令重排

计算机在执行程序时，为了提高性能，**==编译器和处理器的常常会对指令做重排==**，一般分以下3种

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/71-javase.png)

- 单线程环境里面确保程序最终执行结果和代码顺序执行的结果一致。
- 处理器在进行重排序时必须要考虑==指令之间的数据依赖性==。
- 多线程环境中线程交替执行，由于编译器优化重排的存在，两个线程中使用的变量能否保证一致性是无法确定的。

```java
int x = 1; // 1
int y = 2; // 2
x = x + 5; // 3
y = X * x; // 4

期待结果是: 1234 但是可能执行的时候会变成 2134 1324, 但是不可能是 4123!!!
```

可能造成影响的结果: a b x y 这四个值默认都是 0

| 线程A | 线程B |
| ----- | ----- |
| x = a | y = b |
| b = 1 | a = 2 |

正常的结果：x = 0; y = 0; 但是可能由于指令重排

| 线程A | 线程B |
| ----- | ----- |
| b = 1 | a = 2 |
| x = a | y = b |

指令重排导致的诡异结果: x = 2; y = 1;

**volitile可以避免指令重排:**

内存屏障， CPU指令。基本作用：

1、保证特定的操作。

2、可以保证某些变量的内存可见性（利用这些特性volitile实现了可见性）。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/72-javase.png" style="zoom:80%;" />

**Volitile** 是可以保持可见性，不能保证原子性，但是由于内存屏障，可以保证避免指令重排的现象产生！！！

### 14.12 单例模式

单例模式，是一种常用的软件设计模式。通过单例模式可以保证系统中，应用该模式的这个类永远只有一个实例。即一个类永远只有一个对象实例。

#### 14.12.1 饿汉式单例

1、代码示例

```java
package cn.guardwhy.singleDemo01;
/**
 单例的应用场景：在实例开发中，有很多业务对象永远只需要一个，无论启动多少次
                我们只需要一个对象，例如任务管理对象，只需要一个。节约内存和性能。

单例的设计方式:
    （1）饿汉单例设计模式
         在用类的时候，对象已经创建好了。
         步骤：
         a.定义一个对象，最好static和final修饰，这样这个对象永远是唯一不可变的对象了。
         b.把构造器进行私有化，外面就不能创建新对象。
         c.提供一个方法把唯一的单例对象返回出去。
 */
public class HungrySingle01 {
    public static void main(String[] args) {
        // 4.创建对象
        MyHungrySingle01 single1 = MyHungrySingle01.getInstance();
        MyHungrySingle01 single2 = MyHungrySingle01.getInstance();
        // 5.输出结果
        System.out.println(single1 == single2);	// true
    }
}

class MyHungrySingle01{
    // 1.定义一个对象
    private static final MyHungrySingle01 instance = new MyHungrySingle01();
    // 2.将构造器私有化
    public MyHungrySingle01() {
        
    }

    // 3.返回唯一的对象
    public static MyHungrySingle01 getInstance(){
        return instance;
    }
}
```

#### 14.12.2 静态内部类

在类中定义`static`变量的对象，并且直接初始化。既保证了线程的安全性，同时又满足了懒加载。这是饿汉式的改进版本。

```java
package cn.guardwhy.singleDemo01;
// 静态内部类
public class Holder {
    // 1. 构造器
    private Holder(){

    }

    public  static  Holder getInstance(){
        return InnerClass.HOLDER;
    }

    public static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }
}

```

#### 14.12.3 懒汉式单例

1、正常的懒汉式单例代码示例

```java
package cn.guardwhy.singleDemo01;
/*
懒汉单例设计模式
    真正需要的时候，才创建一个对象。
        步骤：
         a.定义一个对象变量用于后面存储一个对象，此时是没有创建对象的。
         b.把构造器进行私有化，外面就不能创建新对象。
         c.提供一个方法，等需要对象的时候判断是否有一个唯一对象，如果没有创建一个对象。
            以后都是直接返回这个对象即可！！
*/
public class LazySingle02 {
    public static void main(String[] args) {
        MyLazySingle02 t1 = MyLazySingle02.getInstance();
        MyLazySingle02 t2 = MyLazySingle02.getInstance();
        // 输出结果
        System.out.println(t1); // cn.guardwhy.singleDemo01.MyLazySingle02@49e4cb85
        System.out.println(t1); // cn.guardwhy.singleDemo01.MyLazySingle02@49e4cb85
        System.out.println(t1 == t2); // true
    }
}

// 懒汉式单例模式
class MyLazySingle02{
    // 1.定义一个对象变量用于保存一个对象,但是这里还没有创建对象
    private static MyLazySingle02 instance = null;
    // 2.把构造器私有起来
    private MyLazySingle02(){

    }
    // 3.返回这个唯一的对象
    public static MyLazySingle02 getInstance(){
        // 3.1 懒汉模式是现在需要，才创建对象。
        if(instance == null){
            instance = new MyLazySingle02();
        }
        // 3.2 返回对象
        return instance;
    }
}
```

#### 14.12.4 DCL懒汉式

1、代码示例

```java
package cn.guardwhy.singleDemo02;

/*
 懒汉式单例
*/
public class LazySingle {
    // 1.将构造器私有化
    public LazySingle() {
        System.out.println(Thread.currentThread().getName() + " ok"); // Thread-0 ok
    }

    // 2.定义lazySingle
    private  static LazySingle lazySingle;
    // 3.双重检查锁模式 懒汉式单例 DCL懒汉式
    public static LazySingle getInstance(){
        // 3.1 条件判断
        if(lazySingle == null){
            synchronized (LazySingle.class){
                if(lazySingle == null){
                    // 不是一个原子性操作
                    lazySingle = new LazySingle();
                }
            }
        }
        // 4.返回对象
        return lazySingle;
    }

    // 多线程并发
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                LazySingle.getInstance();
            }).start();
        }
    }
}

```

2、存在问题

==DCL懒汉式的单例，保证了线程的安全性，又符合了懒加载==，只有在用到的时候，才会去初始化，调用效率也比较高，但是这种写法在极端情况还是可能会有一定的问题。因为不是原子性操作，至少会经过三个步骤：

```java
lazySingle = new LazySingle(); 
```

1. 分配对象内存空间
2. 执行构造方法初始化对象
3. 设置`instance`指向刚分配的内存地址，此时`instance ！=null;`

3、注意事项

由于指令重排，导致A线程执行`lazySingle = new LazySingle( );`的时候，可能先执行了第三步（还没执行第二步），此时线程`B`又进来了，发现`lazySingle`已经不为空了，直接返回了`lazySingle`，并且后面使用了返回的`lazySingle`，由于线程`A`还没有执行第二步，导致此时`lazySingle`还不完整，可能会有一些意想不到的错误，这时候==增加一个volatile关键字来避免指令重排==。

```java
package cn.guardwhy.singleDemo02;

/*
 懒汉式单例
*/
public class LazySingle {
    // 1.将构造器私有化
    public LazySingle() {
        System.out.println(Thread.currentThread().getName() + " ok"); // Thread-0 ok
    }

    // 2. volatile关键字来避免指令重排
    private volatile static LazySingle lazySingle;
    // 3.双重检查锁模式 懒汉式单例 DCL懒汉式
    public static LazySingle getInstance(){
        // 3.1 条件判断
        if(lazySingle == null){
            synchronized (LazySingle.class){
                if(lazySingle == null){
                    /*
                     1.分配对象内存空间
                     2. 执行构造方法初始化对象
                     3. 设置instance指向刚分配的内存地址，此时instance ！=null；
                    */
                    lazySingle = new LazySingle();  // 不是一个原子性操作
                }
            }
        }
        // 4.返回对象
        return lazySingle;
    }

    // 多线程并发
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                LazySingle.getInstance();
            }).start();
        }
    }
}
```

#### 14.12.5 反射破坏单例

##### 14.12.5.1 情况 1 

通过反射破坏单例模式，==反射无视private修饰的构造方法==，可以直接在外面`newInstance`

1、代码示例

```java
package cn.guardwhy.singleDemo02;

import java.lang.reflect.Constructor;

/*
 懒汉式单例
*/
public class LazySingle {
    // 1.将构造器私有化
    public LazySingle() {
        System.out.println(Thread.currentThread().getName() + " ok");
    }

    // 2. volatile关键字来避免指令重排
    private volatile static LazySingle lazySingle;
    // 3.双重检查锁模式 懒汉式单例 DCL懒汉式
    public static LazySingle getInstance(){
        // 3.1 条件判断
        if(lazySingle == null){
            synchronized (LazySingle.class){
                if(lazySingle == null){   
                    lazySingle = new LazySingle();  // 不是一个原子性操作
                }
            }
        }
        // 4.返回对象
        return lazySingle;
    }

    public static void main(String[] args) throws Exception {
        // 1.创建对象instance1
        LazySingle instance1 = LazySingle.getInstance();
        // 2.获得反射对象
        Constructor<LazySingle> declaredConstructor = LazySingle.class.getDeclaredConstructor(null);
        // 3.无视私有构造器
        declaredConstructor.setAccessible(true);
        // 4.通过反射创建对象instance2
        LazySingle instance2 = declaredConstructor.newInstance();
        
        System.out.println(instance1.hashCode());   // 460141958
        System.out.println(instance2.hashCode());   // 1163157884
        // 3.判断是否相等
        System.out.println(instance1 == instance2); // false
    }
}
```

2、解决存在的问题

```java
// 1.将构造器私有化
public LazySingle() {
    synchronized (LazySingle.class){
        // 条件判断
        if(lazySingle != null){
            throw new RuntimeException("反射破坏失败！！！");
        }
    }
}
```

3、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/73-javase.png)

##### 14.12.5.2 情况 2 

先调用`getInstance`方法，一上来就直接用反射创建对象，判断就不生效了。

1、代码示例

```java
package cn.guardwhy.singleDemo02;

import java.lang.reflect.Constructor;

/*
 懒汉式单例
*/
public class LazySingle {
    // 1.将构造器私有化
    public LazySingle() {
        synchronized (LazySingle.class){
            // 条件判断
            if(lazySingle != null){
                throw new RuntimeException("反射破坏失败！！！");
            }
        }
    }

    // 2. volatile关键字来避免指令重排
    private volatile static LazySingle lazySingle;
    // 3.双重检查锁模式 懒汉式单例 DCL懒汉式
    public static LazySingle getInstance(){
        // 3.1 条件判断
        if(lazySingle == null){
            synchronized (LazySingle.class){
                if(lazySingle == null){
                    lazySingle = new LazySingle();  // 不是一个原子性操作
                }
            }
        }
        // 4.返回对象
        return lazySingle;
    }

    public static void main(String[] args) throws Exception {

        // 1.获得反射对象
        Constructor<LazySingle> declaredConstructor = LazySingle.class.getDeclaredConstructor(null);
        // 2.无视私有构造器
        declaredConstructor.setAccessible(true);
        // 3.通过反射创建对象instance2
        LazySingle instance2 = declaredConstructor.newInstance();
        LazySingle instance1 = declaredConstructor.newInstance();

        System.out.println(instance1.hashCode());   // 460141958
        System.out.println(instance2.hashCode());   // 1163157884
        // 4.判断是否相等
        System.out.println(instance1 == instance2); // false
    }
}
```

2、解决方案

```java
// 0.定义标志符
private static boolean flag = false;
// 1.将构造器私有化
public LazySingle() {
    synchronized (LazySingle.class){
        // 条件判断
        if(flag == false){
            flag = true;

        }else{
            throw new RuntimeException("反射破坏失败！！！");
        }
    }
}
```

3、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/74-javase.png)

##### 14.12.5.3 情况 3 

定义一个boolean变量flag，初始值是false，私有构造函数里面做一个判断，如果flag=false，就把flag改为true，但是如果flag等于true，就说明有问题了，==因为正常的调用是不会第二次跑到私有构造方法的，所以抛出异常。看起来很美好，但是还是不能完全防止反射破坏单例模式，因为可以利用反射修改flag的值==。

**代码示例**

```java
package cn.guardwhy.singleDemo02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
 懒汉式单例
*/
public class LazySingle {
    // 0.定义标志符
    private static boolean flag = false;
    // 1.将构造器私有化
    public LazySingle() {
        synchronized (LazySingle.class){
            // 条件判断
            if(flag == false){
                flag = true;

            }else{
                throw new RuntimeException("反射破坏失败！！！");
            }
        }
    }

    // 2. volatile关键字来避免指令重排
    private volatile static LazySingle lazySingle;
    // 3.双重检查锁模式 懒汉式单例 DCL懒汉式
    public static LazySingle getInstance(){
        // 3.1 条件判断
        if(lazySingle == null){
            synchronized (LazySingle.class){
                if(lazySingle == null){
                    lazySingle = new LazySingle();  // 3.2不是一个原子性操作
                }
            }
        }
        // 4.返回对象
        return lazySingle;
    }

    public static void main(String[] args)  {

        try {
            // 拿到隐藏字段
            Field flag = LazySingle.class.getDeclaredField("flag");
            // 破坏字段的私有权限
            flag.setAccessible(true);

            // 获得反射对象
            Constructor<LazySingle> declaredConstructor = LazySingle.class.getDeclaredConstructor(null);
            // 无视私有构造器
            declaredConstructor.setAccessible(true);
            LazySingle instance1 = declaredConstructor.newInstance();
            // 修改对象1的值
            flag.set(instance1, false);
            // 通过反射创建对象instance2
            LazySingle instance2 = declaredConstructor.newInstance();

            System.out.println(instance1.hashCode());   // 1163157884
            System.out.println(instance2.hashCode());   // 1956725890
            // 判断是否相等
            System.out.println(instance1 == instance2); // false
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

#### 14.12.6 枚举类型 

枚举类型是`Java 5`中新增特性的一部分，它是一种特殊的数据类型，之所以特殊是因为它既是一种类`(class)`类型却又比类类型多了些特殊的约束，但是这些约束的存在也造就了枚举类型的简洁性、安全性以及便捷性。

##### 14.12.6.1 源码分析

```java
package cn.guardwhy.singleDemo02;

public enum  EnumSingleton {
    // 定义一个单例对象
   INSTANCE;
   public EnumSingleton getInstance(){
       // 返回对象
       return INSTANCE;
   }

    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        // 结果判断
        System.out.println("两个实例是否相等:" + (singleton1==singleton2)); // 两个实例是否相等:true
    }
}
```

通过查看**newInstance的源码**可得知

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/75-javase.png" style="zoom:80%;" />

##### 14.12.6.2 尝试破坏

1、通过 `jad`工具进行反编译

```java
jad -s java EnumSingleton.class
# 会生成一个java文件
Parsing EnumSingleton.class... Generating EnumSingleton.java
```

2、查看源码

```java
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EnumSingleton.java

package cn.guardwhy.singleDemo02;

import java.io.PrintStream;

public final class EnumSingleton extends Enum
{

    public static EnumSingleton[] values()
    {
        return (EnumSingleton[])$VALUES.clone();
    }

    public static EnumSingleton valueOf(String name)
    {
        return (EnumSingleton)Enum.valueOf(cn/guardwhy/singleDemo02/EnumSingleton, name);
    }

    private EnumSingleton(String s, int i)
    {
        super(s, i);
    }

    public EnumSingleton getInstance()
    {
        return INSTANCE;
    }

    public static void main(String args[])
    {
        EnumSingleton singleton1 = INSTANCE;
        EnumSingleton singleton2 = INSTANCE;
        System.out.println((new StringBuilder()).append("\u4E24\u4E2A\u5B9E\u4F8B\u662F\u5426\u76F8\u7B49:").append(singleton1 == singleton2).toString());
    }

    public static final EnumSingleton INSTANCE;
    private static final EnumSingleton $VALUES[];

    static 
    {
        INSTANCE = new EnumSingleton("INSTANCE", 0);
        $VALUES = (new EnumSingleton[] {
            INSTANCE
        });
    }
}
```

3、代码示例

```java
package cn.guardwhy.singleDemo02;

import java.lang.reflect.Constructor;

public enum  EnumSingleton {
    // 定义一个单例对象
   INSTANCE;
   public EnumSingleton getInstance(){
       // 返回对象
       return INSTANCE;
   }

    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        try {
            // 获得反射对象
            Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
            // 破解私有构造器
            declaredConstructor.setAccessible(true);
            // 通过反射创建对象singleton2
            EnumSingleton singleton2 = declaredConstructor.newInstance();

            // 输出结果
            System.out.println(singleton1);
            System.out.println(singleton2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

4、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/76-javase.png)

### 14.13 理解CAS机制

#### 14.13.1 基本概念

`CAS`是英文单词`Compare And Swap`的缩写，翻译过来就是比较并交换。

`CAS`机制当中使用了3个基本操作数：内存地址`(initialValue)`，旧的预期值`(expect)`，要修改的新值`(update)`。

更新一个变量的时候，只有当变量的预期值`(expect)`和内存地址`(initialValue)`当中的实际值相同时，才会将内存地址`(initialValue)`对应的值修改为`(update)`。

1、源码分析

```java
/**
 * Atomically sets the value to the given updated value
 * if the current value {@code ==} the expected value.

 * @param expect the expected value
 * @param update the new value
 * @return {@code true} if successful. False return indicates that
 * the actual value was not equal to the expected value.
*/
// 参数: 期望值 更新值
public final boolean compareAndSet(int expect, int update) {
    return unsafe.compareAndSwapInt(this, valueOffset, expect, update);
}
```

2、代码示例

==真实值和期望值相同，就修改成功，真实值和期望值不同，就修改失败!!!，CAS是 CPU到的并发原语==。

```java
package cn.guardwhy.cas01;

import java.util.concurrent.atomic.AtomicInteger;

/*
CAS : 比较并交换 compareAndSet
*/
public class CASDemo01 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(2011);
        /*
          源码示例 参数: 期望值 更新值
          public final boolean compareAndSet(int expect, int update) {
                return unsafe.compareAndSwapInt(this, valueOffset, expect, update);
            }
        */
        // 期望值是 2011 ,后来改为2021 所以结果为2021
        System.out.println(atomicInteger.compareAndSet(2011, 2021)); // true
        System.out.println(atomicInteger.get()); // 2021

        // 期望值是2011,后改为1024 所以最终结果为false 2021
        System.out.println(atomicInteger.compareAndSet(2011, 1024)); // false
        System.out.println(atomicInteger.get()); // 2021
    }
}
```

#### 14.13.2 CAS底层原理

1、`atomicInteger.getAndIncrement();`，==这里的自增 + 1 是如何实现的==。

```java
atomicInteger.getAndIncrement(); // 分析源码，如何实现的i++安全的问题
/**
 * Atomically increments by one the current value.
 *
 * @return the previous value
*/
public final int getAndIncrement() { 
    // this表示当前对象， valueOffset内存偏移量，内存地址，固定写死
    return unsafe.getAndAddInt(this, valueOffset, 1);
}
```

#### 14.13.3 Unsafe类

1、`UnSafe`是`CAS`的核心类

由于`Java`方法无法直接访问底层系统，需要通过本地`(native)`方法来访问，`UnSafe`相当于一个后门，基于该类可以直接操作特定内存的数据，`Unsafe`类存在于 `sun.misc`包中，其内部方法操作可以像`C++`的指针一样直接操作内存，因为`Java`中`CAS`操作的执行依赖于`Unsafe`类的方法。
==注意：Unsafe类中的所有方法都是Native修饰的，也就是说Unsafe类中的方法都直接调用操作系统底层资源执行相应任务==。

2、变量`valueOffset`

表示该变量值在内存中的偏移地址，因为`Unsafe`就是根据内存偏移地址获取数据的。

3、源码分析

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/78-javase.png" style="zoom:80%;" />

 ==Compare-And-Swap是一条CPU并发原语,是判断内存某个位置的值是否为预期值，如果是则更改为新的值，这个过程是原子的。==`CAS`并发原语体现在`JAVA`语言中就是`sun.misc.Unsafe`类中的各个方法。==调用UnSafe类中的CAS方法，JVM会帮我们实现出CAS汇编指令。==这是一种完全依赖于硬件的功能，通过它实现了原子操作。再次强调，由于`CAS`是一种系统原语，原语属于操作系统用于范畴，是由若干条指令组成的，用于完成某个功能的一个过程，并且原语的执行必须是连续的，在执行过程中不允许被中断，也就是说`CAS`是一条`CPU`的原子指令，不会造成所谓的数据不一致问题。

4、底层是自旋锁

```java
public final int getAndAddInt(Object var1, long var2, int var4) {
     int var5;
     // 自旋锁
     do {
         // 获取传入对象的地址
         var5 = this.getIntVolatile(var1, var2);
         // 比较并且交换，如果var1, var2还是原来的var5，就执行内存偏移 + 1， var5 + var4操作
     } while(!this.compareAndSwapInt(var1, var2, var5, var5 + var4));

     return var5;
 }
```

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/79-javase.png" style="zoom:80%;" />

#### 14.13.4 CAS总结

1、**CAS（CompareAndSwap）**

比较当前工作内存中的值和主内存中的值，如果相同则执行规定操作，否则继续比较直到主内存和工作内存中的值一致为止(自旋锁)。

2、**CAS 的缺点**

1、循环会很耗时

- 源码中存在 一个 do...while 操作，如果CAS失败就会一直进行尝试。

2、只能保证一个共享变量的原子操作。

- 当对一个共享变量执行操作时，我们可以使用循环CAS的方式来保证原子操作。
- 对多个共享变量操作时，循环CAS就无法保证操作的原子性，这时候只能用锁来保证原子性。

#### 14.13.5 原子引用

##### 14.13.5.1 ABA问题(狸猫换太子)

CAS算法实现前提：==需要取出内存中某时刻的数据并在当下时刻比较并交换，那么在这个时间差内会导致数据的变化==。

1、案例分析

假设一个线程`a`从内存取出`A(A=1)` , 线程`b`也从内存中取出`A (A=1) `，但是线程`b`速度比较快，把`A`进行了`CAS(1, 3)`操作，然后线程`b`又将内存`A`进行`CAS(3,1)`操作。此刻线程`a `进行`CAS`操作发现内存中仍然是`A`，然后线程`a`操作成功。尽管线程`a`的`CAS`操作成功，但是这个过程是有问题的。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/80-javase.png" style="zoom:80%;" />

**代码示例**

```java
package cn.guardwhy.cas01;

import java.util.concurrent.atomic.AtomicInteger;

// CAS : 比较并交换 compareAndSet
public class CASDemo02 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(2011);
        /*
          期望、更新
          public final boolean compareAndSet(int expect, int update)
          如果期望值达到了，那么就更新，否则就不更新，CAS是CPU的并发原语
        */

        System.out.println("======捣乱的线程========");
        System.out.println(atomicInteger.compareAndSet(2011, 2021));    // true
        System.out.println(atomicInteger.get());    // 2021

        System.out.println(atomicInteger.compareAndSet(2021, 2011));    // true
        System.out.println(atomicInteger.get());    // 2011

        System.out.println("======期待的线程========");
        System.out.println(atomicInteger.compareAndSet(2011, 123)); // true
        System.out.println(atomicInteger.get());    // 123
    }
}
```

##### 14.13.5.2 AtomicStampedReference

1、基本概念

==带版本号的原子操作，类似于乐观锁。==

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/82-javase.png)

2、源码分析

```java
// 创建AtomicStampedReference对象
AtomicStampedReference<Integer> AtomicStampedReference = new AtomicStampedReference<>(1,1);

# 2.查看AtomicStampedReference源码
/**
 * Creates a new {@code AtomicStampedReference} with the given
 * initial values.
 *
 * @param initialRef the initial reference
 * @param initialStamp the initial stamp
*/
	
public AtomicStampedReference(V initialRef, int initialStamp) { 
	// initialValue：初始值 initialStamp:初始的时间戳
	pair = Pair.of(initialRef, initialStamp);
}
```

3、构造方法

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/20210301204441.png)

```java
/**
     * Atomically sets the value of both the reference and stamp
     * to the given update values if the
     * current reference is {@code ==} to the expected reference
     * and the current stamp is equal to the expected stamp.
     *
     * @param expectedReference the expected value of the reference
     * @param newReference the new value for the reference
     * @param expectedStamp the expected value of the stamp
     * @param newStamp the new value for the stamp
     * @return {@code true} if successful
*/
public boolean compareAndSet(V   expectedReference,
                             V   newReference,
                             int expectedStamp,	// 拿到最新的版本号
                             int newStamp) {	// 版本号+1操作(更新)
    Pair<V> current = pair;
    return
        expectedReference == current.reference &&
        expectedStamp == current.stamp &&
        ((newReference == current.reference &&
          newStamp == current.stamp) ||
         casPair(current, Pair.of(newReference, newStamp)));
}
```

##### 14.13.5.3 代码示例

```java
package cn.guardwhy.cas01;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicStampedReference;

/*
* 解决ABA问题
*/
public class ABADemo03 {
    public static void main(String[] args) {
        // 1. 正常业务操作时候，泛型类型一般都是user对象
        AtomicStampedReference<Integer> atomicStampedReference
                = new AtomicStampedReference<>(1,1); // 两个值: 初始值,初始版本号(初始的时间戳)

        // 2.1CAS：比较并交换
        new Thread(()->{
            // 2.2 获得最新的版本号
            int stamp = atomicStampedReference.getStamp();
            // 拿到最新版本
            System.out.println("a1==>" + stamp);

            try {
                // 2.3 休眠1s
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            atomicStampedReference.compareAndSet(1, 2,
                    // 拿到最新的版本号，版本号+1操作(更新)
                    atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1);
            // 拿到最新版本号
            System.out.println("a2==>" + atomicStampedReference.getStamp());

            System.out.println(atomicStampedReference.compareAndSet(2, 1,
                    // 拿到最新的版本号，版本号+1操作(更新)
                    atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1));


            // 拿到最新版本号
            System.out.println("a3==>" + atomicStampedReference.getStamp());

        },"a").start();

        new Thread(()->{
            // 获得最新版本号
            int stamp = atomicStampedReference.getStamp();
            System.out.println("b1==>" + stamp);
            try {
                // 休眠2s
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(atomicStampedReference.compareAndSet(1, 66,
                    stamp, stamp + 1));

            System.out.println("b2==>" + atomicStampedReference.getStamp());
        }, "b").start();
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/20210301213327.png)	

### 14.14 Java锁

#### 14.14.1 公平锁、非公平锁

1、**公平锁**：非常公平，不能够插队，必须先来后到。

2、**非公平锁**： 非常不公平，可以插队（默认是非公平锁）

```java
// 公平锁
public ReentrantLock() {
	sync = new NonfairSync();
}
// 非公平锁
public ReentrantLock(boolean fair) {
  	sync = fair ? new FairSync() : new NonfairSync();
}
```

#### 14.14.2 可重入锁

##### 14.14.2.1 可重入锁概念

同一线程外层函数获得锁之后，内层递归函数仍然能获取该锁的代码，在同一个线程在外层方法获取锁的时候，在进入内层方法会自动获取锁。线程可以进入任何一个它已经拥有的锁，所同步着的代码块。==ReentrantLock、Synchronized 就是一个典型的可重入锁，可重入锁最大的作用就是避免死锁==。

##### 14.14.2.2 可重入锁图解

**注意**: 拿到外面锁1后，里面的锁2, 锁3、可以自动获得。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/20210301230515.png" style="zoom:80%;" />

##### 14.14.2.3 代码示例

1、Synchronized版本实现

```java
package cn.guardwhy.lock;



public class ReentrantLockDemo01 {
    public static void main(String[] args) {
        // 创建phone对象
        Phone phone = new Phone();

        new Thread(()->{
            phone.sendMessage();
        }, "curry").start();
        

        new Thread(()->{
            phone.sendMessage();
        }, "kobe").start();
    }
}

// 手机类
class Phone{
    public synchronized void sendMessage(){

        System.out.println(Thread.currentThread().getName() + "发短信...");
        // 调用call方法
        call();
    }

    public synchronized void call(){
        System.out.println(Thread.currentThread().getName() + "打电话...");
    }
}

```

2、ReentrantLock版本实现

```java
package cn.guardwhy.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo01 {
    public static void main(String[] args) {
        // 创建phone对象
        Phone phone = new Phone();

        new Thread(()->{
            phone.sendMessage();
        }, "curry").start();


        new Thread(()->{
            phone.sendMessage();
        }, "kobe").start();
    }
}

// 手机类
class Phone{
    // 创建lock
    Lock lock = new ReentrantLock();
    // 发短信方法
    public void sendMessage(){
        lock.lock(); // 加锁操作，lock锁必须配对，不然容易出现死锁
        try {
            System.out.println(Thread.currentThread().getName() + "发短信...");
            call(); // 调用call方法，这里也有一把锁
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // 释放锁
        }
    }
    // 打电话方法
    public synchronized void call(){
        lock.lock(); // 加锁操作
        try {
            System.out.println(Thread.currentThread().getName() + "打电话...");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
```

3、执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/20210302114744.png)

### 14.14.3 自旋锁

##### 14.14.3.1 基本概念

自旋锁`(spinlock)`:是指尝试获取锁的线程不会立即阻塞，而是采用循环的方式去尝试获取锁，这样的好处是减少线程上下文切换的消耗，缺点是循环会消耗CPU。

##### 14.14.3.2 源码分析

```java
unsafe.getAndAddInt()
    
public final int getAndAddInt(Object var1, long var2, int var4) {
  int var5;
    // 自旋锁
  do {
    // 获取传入对象的地址
    var5 = this.getIntVolatile(var1, var2);
    // 比较并交换，如果var1，var2 还是原来的 var5，就执行内存偏移+1； var5 +
var4
 } while(!this.compareAndSwapInt(var1, var2, var5, var5 + var4));
  	return var5;
}
```

##### 14.14.3.3 代码示例

1、自旋锁案例实现

```java
package cn.guardwhy.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class SpinlockDemo {
    // 1.原子引用线程
    AtomicReference<Thread> atomicReference = new AtomicReference<>();
    // 2.加锁操作
    public void myLock(){
        Thread thread = Thread.currentThread();// 获取线程
        System.out.println(Thread.currentThread().getName() + "==>myLock");

        // 3.自旋
        while (!atomicReference.compareAndSet(null, thread)){

        }
    }
    // 4. 解锁操作
    public void myUnLock(){
        Thread thread = Thread.currentThread();
        atomicReference.compareAndSet(thread, null);
        System.out.println(Thread.currentThread().getName() + "==>myUnLock");
    }

    public static void main(String[] args) {
        // 创建自旋锁对象,底层使用自旋锁CAS
        SpinlockDemo spinlock = new SpinlockDemo();

        new Thread(()->{
            // 加锁
            spinlock.myLock();
            try {
                // 休眠3s
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 解锁
                spinlock.myUnLock();
            }
        }, "Curry").start();


        try {
            // 休眠1s
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            // 加锁
            spinlock.myLock();
            try {
                // 休眠1s
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 解锁
                spinlock.myUnLock();
            }
        }, "Kobe").start();
    }
}
```

2、执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/20210302134805.png)

### 14.14.4 Java 死锁

##### 14.14.4.1 死锁概念

1、基本介绍

多个线程同时被阻塞,它们中的一个或者全部都在等待某个资源被释放。由于线程被无限期地阻塞，因此程序不可能正常终止。

2、基本结构

```java
线程一执行的代码：
public void run(){
    synchronized(a){ //持有对象锁a，等待对象锁b
        synchronized(b){
        编写锁定的代码;
        }
    }
}

线程二执行的代码：
public void run(){
    synchronized(b){ //持有对象锁b，等待对象锁a
        synchronized(a){
        编写锁定的代码;
        }
    }
}

```

3、产生死锁

- 系统资源不足。
- 进程运行推进的顺序不合适。
- 资源分配不当。

==注意：在以后的开发中尽量减少同步的资源，减少同步代码块的嵌套结构的使用！==

##### 14.14.4.2 死锁产生条件

互斥使用，即当资源被一个线程使用(占有)时，别的线程不能使用

 不可抢占，资源请求者不能强制从资源占有者手中夺取资源，资源只能由资源占有者主动释放。

 请求和保持，即当资源请求者在请求其他的资源的同时保持对原有资源的占有。

 循环等待，即存在一个等待队列：p1要p2的资源，p2要p1的资源。这样就形成了一个等待环路。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/20210302152956.png" style="zoom:80%;" />

##### 14.14.4.3 代码示例

```java
package cn.guardwhy_11;

/**
   实现死锁一般需要进行锁资源的嵌套才会出现死锁。
 */
public class ThreadDead {
    // 定义两个静态资源对象
    public static Object resources1 = new Object();
    public static Object resources2 = new Object();

    public static void main(String[] args) {
        // 实现死锁现象至少存在两个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resources1){
                    System.out.println("线程对象1对资源1上锁,占用资源1");
                    System.out.println("线程对象1开始请求资源2");
                    try {
                        // 线程休眠
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resources2){
                        System.out.println("线程对象1对资源2上锁,占用资源2");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resources2){
                    System.out.println("线程对象2对资源2上锁,占用资源2");
                    System.out.println("线程对象2开始请求资源1");
                    try {
                        // 线程休眠
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resources1){
                        System.out.println("线程对象2对资源1上锁,占用资源1");
                    }
                }
            }
        }).start();
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se1/38-javase.png"  />	

##### 14.14.4.4  解决方案

1、查看JDK目录的bin目录。

2、使用  ==jps -l 命令==定位进程号。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/20210302155149.png" style="zoom:80%;" />

3、使用  ==jstack 进程号== 找到死锁查看。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/20210302155436.png" style="zoom:80%;" />	

4、查看结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se2/20210302155740.png" style="zoom:80%;" />

## 第15章 IO Stream流

### 15.1 File基本概念

1、基本概念

- 代表当前操作系统的文件对象。
- 是用来操作操作系统的文件对象的，删除文件，获取文件信息，创建文件`(文件夹)`

2、构造器方法

| 方法声明                            | 功能概述                                     |
| ----------------------------------- | -------------------------------------------- |
| `File(String pathname)`             | 根据参数指定的路径名来构造对象               |
| `File(String parent, String child)` | 根据参数指定的父路径和子路径信息构造对象     |
| `File(File parent, String child)`   | 根据参数指定的父抽象路径和子路径信息构造对象 |
| `boolean exists()`                  | 测试此抽象路径名表示的文件或目录是否存在     |

3、创建文件对象的格式

```java
 File f = new File("绝对路径/相对路径");
```

> **绝对路径**：

- 从磁盘的的盘符一路走到目的位置的路径。
- 绝对路径依赖具体的环境，一旦脱离环境，代码可能出错！！

> **相对路径**: 

- 去找工程中的文件才可以使用相对路径。没有盘符，默认就是直接去工程下寻找文件的
- 能用相对路径就尽量用,相对路径在任何环境下都是没有问题的！

代码示例

```java
package cn.guardwhy_01;

import java.io.File;

/**
总结:
 File创建文件对象:路径可以是绝对路径，相对路径，文件路径，文件夹路径。
 能用相对路径就用相对路径，相对路径只有项目中的文件才能用.
 */
public class FileDemo01 {
    public static void main(String[] args) {
        public static void main(String[] args) {
        // 绝对路径
        File f1 = new File("E:\\workspace\\Java\\IOStream\\src\\test1\\timg.jpg");
        System.out.println("图片长度:" + f1.length());

        // 相对路径:默认是相对到工程目录下直接寻找。
        File f2 = new File("src/test1/test01.txt");
        System.out.println("test01:" + f2.length());

        // 3. File f = new File("文件路径/文件夹路径");
        File f3 = new File("E:\\workspace\\Java\\IOStream\\src\\test1");
        System.out.println("文件存在:" + f3.exists());
    }
    }
}
```

4、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se1/21-javase.png" style="zoom:80%;" />	

### 15.2 File类获取功能

1、常用方法

| 方法声明                   | 功能概述                               |
| -------------------------- | -------------------------------------- |
| `String getAbsolutePath()` | 返回此`File`的绝对路径名字符串         |
| `String getPath()`         | 返回由此`File`表示的文件或目录的名称。 |
| `long length()`            | 返回由此`File`表示的文件的长度。       |

2、代码示例

```java
package cn.guardwhy.demo01;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo02 {
    public static void main(String[] args) {
        // 1.定义一个文件对象
        File f = new File("E:\\workspace\\Java\\IOStream\\src\\test1\\timg.jpg");
        // 获取当前文件对象的绝对路径的字符串
        System.out.println("路径:" + f.getAbsolutePath());    // 路径:E:\workspace\Java\IOStream\src\test1\timg.jpg
        
        // 获取创建文件对象的时候用的路径
        // 创建文件对象的时候用的路径:E:\workspace\Java\IOStream\src\test1\timg.jpg
        System.out.println("创建文件对象的时候用的路径:" + f.getPath()); 
        
        // 获取当前文件对象的名称
        System.out.println("文件对象的名称:" + f.getName());   // 文件对象的名称:timg.jpg
        // 获取文件的大小（字节总数大小）
        System.out.println("字节总数大小:" + f.length()); // 字节总数大小:19383
        System.out.println("+++++++++++++++++==+++++++");
        // 2.创建一个文件对象
        File f1 = new File("src/guardwhy");
        // 获取当前文件对象的绝对路径的字符串
        System.out.println("绝对路径:" + f1.getAbsolutePath()); // 绝对路径:E:\workspace\Java\IOStream\src\guardwhy
        // 获取创建文件对象的时候用的路径
        System.out.println("创建文件对象的时候用的路径:" + f1.getPath());    // 创建文件对象的时候用的路径:src\guardwhy
        // 获取当前文件对象的名称
        System.out.println("文件对象的名称:" + f1.getName());  // 文件对象的名称:guardwhy
        // 获取文件的大小（字节总数大小）
        System.out.println("字节总数大小:" + f1.length());    // 字节总数大小:0
        System.out.println("++++++++++++++++++++++++++++++++");

        // 获取它的上级目录的字符串
        System.out.println("上级目录:" + f.getParent());    // 上级目录:E:\workspace\Java\IOStream\src\test1
        // 获取它的上级目录的文件对象
        System.out.println("上级目录的文件对象:"+ f.getParentFile());    // 上级目录的文件对象:E:\workspace\Java\IOStream\src\test1
        // 获取文件的最后修改时间
        long time = f.lastModified(); // 时间毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        System.out.println("格式化时间:" + sdf.format(time));    // 格式化时间:2020-06-29 17:58:56 星期一 下午
    }
}
```

### 15.3 File类判断功能

1、常用方法

| 方法声明                | 功能概述                             |
| ----------------------- | ------------------------------------ |
| `boolean exists()`      | 此`File`表示的文件或目录是否实际存在 |
| `boolean isDirectory()` | 此`File`表示的是否为目录。           |
| `boolean isFile()`      | 此`File`表示的是否为文件。           |

2、代码示例

```java
package cn.guardwhy.demo01;

import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) {
        // 1.定义一个文件对象
        File f1 = new File("E:\\workspace\\Java\\IOStream\\src\\test1\\timg.jpg");
        // 检测路径是否存在的。检测文件是否存在
        System.out.println(f1.exists()); // true
        // 判断文件对象是否是文件,是文件返回true,反之false
        System.out.println(f1.isFile()); // true
        // 判断文件对象是否是文件夹
        System.out.println(f1.isDirectory());    // false

        // 定义一个文件对象
        File f2 = new File("E:\\workspace\\Java\\IOStream\\src\\test1");
        // 检测路径是否存在的。检测文件是否存在
        System.out.println(f2.exists());    // true
        // 判断文件对象是否是文件
        System.out.println(f2.isFile());  // false
        // 判断文件对象是否是文件夹
        System.out.println(f1.isDirectory());   // false
    }
}
```

### 15.4 File类创建和删除

1、常用方法

| 方法声明                  | 功能概述                                                 |
| ------------------------- | -------------------------------------------------------- |
| `boolean createNewFile()` | 当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。 |
| `boolean delete()`        | 删除由此`File`表示的文件或目录。(只能删除空目录）        |
| `boolean mkdir()`         | 创建由此`File`表示的目录。(只能创建一级目录）            |
| `boolean mkdirs()`        | 创建由此`File`表示的目录，包括任何必需但不存在的父目录。 |

2、代码示例

```java
package cn.guardwhy.demo01;

import java.io.File;

public class FileDemo04 {
    public static void main(String[] args) throws Exception{
        // 定义文件对象
        File f1 = new File("src/test1/test01.txt");
        // 创建一个新文件对象,因为以后文件都是可以自动创建的
        System.out.println(f1.createNewFile());

        // 删除文件对象
        System.out.println(f1.delete());
        // delete如果删除文件夹，只能删除空文件夹
        File f2 = new File("src/test1/test2");
        System.out.println(f2.delete());    // true

        // 创建一个文件夹
        File f3 = new File("E:\\workspace\\Java\\IOStream\\src\\test1\\ab");
        System.out.println(f3.mkdir()); // true
    }
}
```

### 15.5 File目录的遍历

1、常用方法

| 方法声明                   | 功能概述                                                     |
| -------------------------- | ------------------------------------------------------------ |
| `String[] list()`          | 获取当前目录下所有的一级文件名称到一个字符串数组中去返回。   |
| `File[] listFiles()(常用)` | 获取当前目录下所有的一级文件对象到一个文件对象数组中去返回。 |

2、代码示例

```java
package cn.guardwhy.demo01;

import java.io.File;

public class FileDemo05 {
    public static void main(String[] args) {
        // 定位一个目录
        File f = new File("src/cn/guardwhy");
        // 获取当前目录下所有的一级文件名称到一个字符串数组中去
        String[] names = f.list();
        // 遍历操作
        for(String n : names){
            System.out.println(n);
        }

        // 获取当前目录下所有的一级文件对象到一个文件对象数组中去返回。
        File[] files = f.listFiles();
        for(File f1 : files){
            System.out.println(f1.getAbsolutePath());
        }
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se1/22-javase.png" style="zoom:80%;" />	

### 15.6 字节流

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/Spring/Test4/20210320181124.png)

#### 15.6.1 字节输入流(InputStream)

1、基本概念

==以内存为基本，把磁盘文件中的数据以一个一个的字节的形式读入到内存中的流。==

| 方法声明                               | 功能介绍                                                     |
| -------------------------------------- | ------------------------------------------------------------ |
| `FileInputStream(String name)`         | 根据参数指定的文件路径名来构造对象。                         |
| `nt read()`                            | 从输入流中读取单个字节的数据并返回，返回`-1`表示读取到末尾   |
| `int read(byte[] b, int off, int len)` | 从此输入流中将最多`len`个字节的数据读入字节数组中，返回读取到的<br/>字节个数，返回`-1`表示读取到末尾 |
| `int read(byte[] b)`                   | 从此输入流中将最多 `b.length` 个字节的数据读入字节数组中，返回读<br/>取到的字节个数，返回`-1`表示读取到末尾 |
| `void close()`                         | 关闭流对象并释放有关的资源                                   |
| `int available()`                      | 获取输入流所关联文件的大小                                   |

2、文件字节输入流的使用代码实现

```java
package cn.inputstream.demo01;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
/**
文件字节输入流：FileInputStream
     -- 作用：以内存为基本，把磁盘文件中的数据以一个一个的字节的形式读入到内存中的流。
     -- 构造器:
         public FileInputStream(File file):
         public FileInputStream(String file):
     -- 方法:
         public int read():每次读取一个字节（读取一滴水），返回这个字节的数据。读取完毕返回-1
         这种方式：无法避免中文乱码！
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01() {
        // 1.定义文件对象的地址
        String filePath = "E:\\workspace\\Java\\hello.txt";
        // 1.2 定义一个变量每次读取了多少个字节数
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            // 1.3 定义一个文件字节输入流管道与源文件接通
            fileInputStream = new FileInputStream(filePath);
            //1.4 从该输入流读取一个字节的数据。 如果没有输入可用，此方法将阻止。如果返回-1 , 表示读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                //1.5 转成char显示
                System.out.print((char)readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //1.6 关闭文件流，释放资源.
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211027110753.png" style="zoom: 80%;" />	

3、使用字节数组读取数据代码实现

```java
package cn.guardwhy.demo02;

import java.io.FileInputStream;
import java.io.InputStream;

/**
文件字节输入流的使用-使用字节数组读取数据。

 文件字节输入流：FileInputStream
     -- 作用：以内存为基本，把磁盘文件中的数据以一个一个的字节的形式读入到内存中的流。
     -- 构造器:
         public FileInputStream(File file):先创建文件对象，再通向文件对象。
         public FileInputStream(String file):直接通向文件路径。
     -- 方法:
         public int read():每次读取一个字节（读取一滴水），返回这个字节的数据。读取完毕返回-1
         public int read(byte b[]):每次读取一个字节数组的数据到字节数组中去，返回读取了多少个字节数，读取完毕返回-1
*/
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        // 定义一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("src/test1/text1.txt");
        // 定义一个循环,读取文件的全部数据
        byte[] buffer = new byte[3];
        // 定义一个变量存储数组每次读取了多少个字节数
        int len = 0;
        while ((len = is.read(buffer)) !=-1){
            // 读取多少,就倒出多少
            String rs = new String(buffer, 0, len);
            System.out.println(rs);
        }
    }
}
```

4、字节流读取文本文件乱码

```java
package cn.guardwhy.demo02;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
定义一个与文件字节数刚刚好一样大的数组，一桶水读取完文件的数据输出即可.
总结：
     这种方式是一次把文件数据全部读取完毕可以避免中文乱码,但是如果文件过大可能出现内存溢出.
     读取文本文件内容最好的方式是用字符流。
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception{
        InputStream is = new FileInputStream("src/test1/text2.txt");

        File f = new File("src/test1/text2.txt");
        // 定义一个数组，读取文件的全部数据。这个字节数组的大小与文件的大小一样大
        byte[] buffer = new byte[(int) f.length()];
        int len = is.read(buffer);
        String rs = new String(buffer);
        System.out.println(rs);

        // 直接一个字节数组读取文件全部数据(jdk1.9以上)
        /*byte[] buffer = is.readAllBytes();
        String rs = new String(buffer);
        System.out.println(rs);*/
    }
}
```

#### 15.6.2 字节输出流 (OutputStream)

1、基本概念

==以内存为基准，把内存中的数据以字节的形式写出到磁盘文件中去的流。==

| 方法声明                                       | 功能介绍                                                     |
| ---------------------------------------------- | ------------------------------------------------------------ |
| `FileOutputStream(String name)`                | 根据参数指定的文件路径名来构造对象。                         |
| `FileOutputStream(String name,boolean append)` | 以追加的方式根据参数指定的文件名来构造对象。                 |
| `void write(int b)`                            | 将指定字节写入此文件输出流。                                 |
| `void write(byte[] b, int off, int len)`       | 将指定字节数组中从偏移量`off`开始的`len`个字节写入此文件输出流。 |
| `void write(byte[ ] b)`                        | 将 `b.length` 个字节从指定字节数组写入此文件输出流中。       |
| `void flush()`                                 | 刷新此输出流并强制写出任何缓冲的输出字节。                   |
| `void close()`                                 | 关闭流对象并释放有关的资源。                                 |

2、文件字节输出流的使用

```java
package cn.inputstream.demo01;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
文件字节输出流：FileOutputStream
     -- 作用：以内存为基准，把内存中的数据以字节的形式写出到磁盘文件中去的流。
     -- 构造器：
         public FileOutputStream(File file):
         public FileOutputStream(String file):
         public FileOutputStream(File file,boolean append):追加数据的管道
         public FileOutputStream(String file,boolean append)::追加数据的管道

    -- 方法
         public  void write(int b) ：写一个字节出去
         public  void write(byte[] buffer) ：写一个字节数组出去
         public  void write(byte[] b, int off, int len) ：写一个字节数组的一部分出去
总结：
     注意：输出流默认是覆盖之前全部内容！！
     如果要追加数据应该在构造器的第二个参数加上：true.
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile(){

        //1.1 创建os对象
        OutputStream os = null;
        String filePath = "src/File/test1/test1.txt";

        try {
            // 1.2 定义一个字节输出流管道与目标文件接通
            os = new FileOutputStream(filePath, true);
            // 1.3 写出一个字节出去
            os.write(97);
            os.write(98);
            os.write('a');
            os.write('b');
            // 1.4 写一个换行
            os.write("\r\n".getBytes());

            // 2.1 写一个字节数组出去(倒一桶水出去)
            byte[] buffer1 = "我是java程序员, I love java".getBytes();   // 以默认的UTF-8转字节数组
            os.write(buffer1);
            // 2.2 写一个换行
            os.write("\r\n".getBytes());

            // 3.1 写一个字节数组的一部分出去
            byte[] buffer2 = "我爱java,java是最牛逼的".getBytes();
            // 3.2 发送:我爱java
            os.write(buffer2, 0, 10);
            os.write("\r\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭刷新
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```

3、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211027114444.png)	

#### 15.6.3 字节流做文件的复制

**代码示例**

```java
package cn.guardwhy.demo03;

import java.io.*;

/**
字节流做文件的复制。

 计算机中所有的文件的底层都是由字节组成的。
 字节流很适合做文件的复制，只要复制前后文件的格式一致，绝对没有问题。

 分析：
 （1）定义一个字节输入流管道与源文件接通
 （2）定义一个字节输出流管道与目标文件接通
 （3）定义一个字节数组。
 （4）定义一个循环从字节输入流管道中读取数据，倒出到字节输出流管道即可！读多少倒出多少！！
 */
public class CopyDemo01 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;

        try {
            // 1.定义一个字节输入流管道与源文件接通
            is = new FileInputStream("src/test1/aaa/my.jpg");
            // 2.定义一个字节输出流管道与目标文件接通
            os = new FileOutputStream("src/test1/abc/my1.jpg");
            // 3.定义字节数组
            byte[] buffer = new byte[1024];
            // 4.定义一个循环从字节输入流管道中读取数据，倒出到字节输出流管道即可
            int len = 0;
            while ((len = is.read(buffer)) != -1){
                // 读出多少,倒出多少
                os.write(buffer, 0, len);
            }
        } catch (Exception e) {
            System.out.println("复制成功...");
            e.printStackTrace();
        } finally {
            try {
                // 关闭字节输入输出流
                if(os != null)os.close();
                if(is != null)is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
```

**代码示例(jdk1.7)**

```java
package cn.guardwhy.demo03;

import java.io.*;

/**
 JDK 1.7开始关闭资源的新方式：try-with-resources

     try(
     // 这里只能放置资源对象，用完会自动调用资源的close()方法关闭。
     ){

     }catch (Exception e){
     e.printStackTrace();
     }

     资源：是实现了Closeable接口的类就是资源。就需要释放！
*/
public class CopyDemo02 {
    public static void main(String[] args) {
        try (// 1.定义一个字节输入流管道与源文件接通
             InputStream is = new FileInputStream("src/test1/aaa/my.jpg");
             // 2.定义一个字节输出流管道与目标文件接通
             OutputStream os = new FileOutputStream("src/test1/abc/newMy1.jpg");
             ){
            // 3.定义一个字节数组
            byte[] buffer = new byte[1024];
            // 4.定义一个循环从字节输入流管道中读取数据，倒出到字节输出流管道即可
            int len = 0;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }
            System.out.println("复制成功...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### 15.7 字符流

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/Spring/Test4/20210320181529.png)

#### 15.7.1 字符输入流(FileReader)

1、基本概念

==以内存为基准，把磁盘文件的数据以字符的形式读取到内存中去的流，一般用于读取文本文件==。

| 方法声明                                        | 功能介绍                                                     |
| ----------------------------------------------- | ------------------------------------------------------------ |
| `FileReader(String fileName)`                   | 根据参数指定的文件名构造对象。                               |
| `int read()`                                    | 读取单个字符的数据并返回，返回`-1`表示读取到末尾。           |
| `int read(char[] cbuf, int offset, int length)` | 从输入流中将最多`len`个字符的数据读入一个字符数组中，返回读取到的字符个数，返回`-1`表示读取到末尾。 |
| `int read(char[ ] cbuf)`                        | 从此输入流中将最多` cbuf.length` 个字符的数据读入字符数组中，返回读取到的字符个数，返回-1表示读取到末尾。 |
| `void close()`                                  | 关闭流对象并释放有关的资源。                                 |
| `new String(char],off,len)`                     | 将`char[]`的指定部分转换成`String `                          |

2、文件字符输入流的使用代码实现

```java
package cn.reader.demo01;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

/**
文件字符输入流：FileReader
     -- 作用：以内存为基准，把磁盘文件的数据以字符的形式读取到内存中去的流，一般用于读取文本文件。
     -- 构造器：
         public FileReader(File file)
         public FileReader(String file)
     -- 方法：
         public int read():读取一个字符的编号返回。如果读取完毕返回的是-1.
         public int read(char cbuf[]):读取字符到一个字符数组中去，返回读取的字符个数，读取完毕了返回-1
总结：
    读取文本文件内容，建议用字符流。
 */
public class FileReaderDemo01 {
    public static void main(String[] args) {

    }
    /**
     * 单个字符读取文件
     */
    @Test
    public void readFile01() {
        String filePath = "src/File/test1/text2.txt";
        //创建FileReader对象
        FileReader fileReader = null;
        // 定义数据大小
        int data = 0;
        try {
            // 定义一个字符输入流管道与源文件接通。
            fileReader = new FileReader(filePath);
            //循环读取 使用read, 单个字符读取
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 字符数组读取文件
     */
    @Test
    public void readFile02() {
        String filePath = "src/File/test1/text2.txt";
        FileReader fileReader = null;
        // 定义一个变量存储数组每次读取了多少个字节数
        int readLen = 0;
        char[] buf = new char[8];
        //1. 创建FileReader对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取 使用read(buf), 返回的是实际读取到的字符数，如果返回-1, 说明到文件结束
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    // 关闭字符流
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211027160053.png" style="zoom:67%;" />	

#### 15.7.2 字符输出流(FileWriter)

1、基本概念

==以内存为基准，把内存中的数据以字符的形式写出到磁盘文件中去，一般用于写数据到文本文件==。

| 方法声明                                      | 功能介绍                                                     |
| --------------------------------------------- | ------------------------------------------------------------ |
| `FileWriter(String fileName)`                 | 根据参数指定的文件名构造对象。                               |
| `FileWriter(String fileName, boolean append)` | 以追加的方式根据参数指定的文件名来构造对象。                 |
| `void write(int c)`                           | 写入单个字符。                                               |
| `void write(char[] cbuf, int off, int len)`   | 将指定字符数组中从偏移量off开始的len个字符写入此文件输出流。 |
| `void write(char[] cbuf)`                     | 将cbuf.length个字符从指定字符数组写入此文件输出流中。        |
| `void flush()`                                | 刷新流                                                       |
| `void close()`                                | 关闭流对象并释放有关的资源                                   |

2、文件字符输出流代码示例

```java
package cn.writer.demo01;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
文件字符输出流的使用。

 文件字符输出流：FileWriter
     -- 作用：以内存为基准,把内存中的数据以字符的形式写出到磁盘文件中去,一般用于写数据到文本文件！
     -- 构造器：
         public FileWriter(File file)
         public FileWriter(String file)
         public FileWriter(String file,boolean append)
         public FileWriter(String file,boolean append)
    -- 方法：
         public void write(int c)：写一个字符出去
         public void write(String str) : 写一个字符串出去
         public void write(char cbuf[]) ：写一个字符数组出去
         public void write(String str, int off, int len):写一个字符串的一部分出去
         public void write(char cbuf[], int off, int len):写一个字符数组的一部分出去
 */
public class FileWriterDemo01 {
    public static void main(String[] args){

    }

    @Test
    public void writerDemo01(){
        String filePath = "src/test1/text2.txt";
        FileWriter fileWriter = null;
        try {
            // 1.定义一个字符输出流与目标文件接通
            fileWriter = new FileWriter(filePath, true);
            // 2.写一个字符出去
            fileWriter.write(97); // 写一个字符a出去
            fileWriter.write('a'); // 写一个字符a出去
            fileWriter.write('何');
            fileWriter.write("\r\n"); // 换行

            // 3.写一个字符串出去
            fileWriter.write("curry是mvp!!!");
            fileWriter.write("\r\n"); // 换行

            // 4.写一个字符数组出去
            fileWriter.write("curry是mvp!!!".toCharArray());
            fileWriter.write("\r\n"); // 换行

            // 5.写一个字符串的一部分出去
            fileWriter.write("我在公司看球赛，看的很开心..", 0,4);
            fileWriter.write("\r\n"); // 换行

            // 6.写一个字符串的一部分出去
            fileWriter.write("我在公司看球赛，看的很开心..".toCharArray(), 0,4);
            fileWriter.write("\r\n"); // 换行
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭字符输出流
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211027170046.png" style="zoom:80%;" />	

### 15.8 节点流和处理流

#### 15.8.1 节点流

1、节点流基本概念

节点流可以从一个特定的数据源==读写数据==，如【`FileReader` `FileWriter`】

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211027201520.png" style="zoom:67%;" />	

2、常见的节点流

| 分类       | 字节输入流            | 字节输出流              | 字符输入流        | 字符输出流        |
| ---------- | --------------------- | ----------------------- | ----------------- | ----------------- |
| 抽象基类   | `IputStream`          | `OutputStream`          | `Reader`          | `Writer`          |
| 访问文件   | `FileInputStream`     | `FileOutputStream`      | `FileReader`      | `FileWriter`      |
| 访问数组   | `ByteArayInputStream` | `ByteArrayOutpatStream` | `CharArrayReader` | `CharArrayWriter` |
| 访问管理   | `PipedInputStream`    | `PipedOutputStream`     | `PipedReader`     | `PipedWriter`     |
| 访问字符串 |                       |                         | `StringReader`    | `StringWriter`    |

#### 15.8.2 处理流

处理流(也叫包装流)：==是"连接"在已存在的流(节点流或处理流)之上，为程序提供更为强大的读写功能，也更加灵活==。

| 分类       | 字节输入流            | 字节输出流             | 字符输入流          | 字符输出流           |
| ---------- | --------------------- | ---------------------- | ------------------- | -------------------- |
| 缓冲流     | `BufTeredlnputStream` | `BufferedOutputStream` | `BuferedReader`     | `BufferedWriter`     |
| 转换流     |                       |                        | `InputStreamReader` | `OutputStreamWriter` |
| 对象流     | `ObjectlnputStream`   | `ObjectOutputStream`   |                     |                      |
| 抽象基类   | `FiterlnputSrream`    | `FilterOutputSream`    | `FilterReader`      | `FilterWriter`       |
| 打印流     |                       | `PrintStream`          |                     | `PrintWriter`        |
| 推回输入流 | `PushbackInputStream` |                        | `PushbackReader`    |                      |
| 特殊流     | `DatalnpulStream`     | `DataOutputStream`     |                     |                      |

#### 15.8.3 节点流和处理流区别

1、节点流是底层流/低级流，直接跟数据源相接。

2、处理流(包装流)包装节点流，既可以消除不同节点流的实现差异，也可以提供更方便的方法来完成输入输出。

3、处理流(也叫包装流)对节点流进行包装，使用了修饰器设计模式，不会直接与数据源相连。

#### 15.8.4 处理流的功能

1、性能的提高：主要以增加缓冲的方式来提高输入输出的效率。

2、操作的便捷：处理流可能提供了一系列便捷的方法来一次输入输出大批量的数据，使用更加灵活方便。

3、处理流设计模式实现案例

`ReaderDemo01`类

```java
package cn.bufferedreader.demo01;
// 抽象类
public abstract class ReaderDemo01 {
    public void readFile(){

    }

    public void readString(){

    }
}
```

`FileReader`类

```java
package cn.bufferedreader.demo01;

public class FileReader extends ReaderDemo01{
    public void readFile(){
        System.out.println("对文件进行读取......");
    }
}
```

`StringReader`类

```java
package cn.bufferedreader.demo01;

public class StringReader extends ReaderDemo01{
    public void readString(){
        System.out.println("读取字符串....");
    }
}
```

`BufferedReadeDemo01`类

```java
package cn.bufferedreader.demo01;

public class BufferedReadeDemo01 extends ReaderDemo01{
    // 重写属性
    private ReaderDemo01 readerDemo01;
    // 接收ReaderDemo01子类对象

    public BufferedReadeDemo01(ReaderDemo01 readerDemo01) {
        this.readerDemo01 = readerDemo01;
    }
    // 封装一层
    public void readFile(){
        readerDemo01.readFile();
    }

    //让方法更加灵活， 多次读取文件, 或者加缓冲byte[] ....
    public void readFiles(int num){
        // 遍历操作
        for (int i=0; i<num; i++){
            readerDemo01.readFile();
        }
    }

    //扩展 readString, 批量处理字符串数据
    public void readStrings(int num){
        for (int i=0; i<num; i++){
            readerDemo01.readString();
        }
    }
}
```

`TestDemo01`类

```java
package cn.bufferedreader.demo01;

public class TestDemo01 {
    public static void main(String[] args) {
        // 1、读取文本
        BufferedReadeDemo01 buffer1 = new BufferedReadeDemo01(new FileReader());
        buffer1.readFiles(3);
        // 2、读取字符串
        BufferedReadeDemo01 buffer2 = new BufferedReadeDemo01(new StringReader());
        buffer2.readStrings(3);
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211028064804.png" style="zoom:80%;" />	

### 15.9 缓冲流

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/Spring/Test4/20210320185428.png)

#### 15.9.1 字节缓冲输入流(BufferedInputStream)

1、基本概念

==可以把低级的字节输入流包装成一个高级的缓冲字节输入流管道，从而提高读数据的性能。==

| 方法声明                                        | 功能介绍                                 |
| ----------------------------------------------- | ---------------------------------------- |
| `BufferedInputStream(InputStream in)`           | 根据参数指定的引用构造对象。             |
| `BufferedInputStream(InputStream in, int size)` | 根据参数指定的引用和缓冲区大小构造对象。 |
| `int read()`                                    | 读取单个字节。                           |
| `int read(byte[] b, int off, int len)`          | 读取`len`个字节。                        |
| `int read(byte[] b)`                            | 读取`b.length`个字节。                   |
| `void close()`                                  | 关闭流对象并释放有关的资源。             |

2、代码示例

```java
package cn.guardwhy.demo04;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
字节缓冲输入流的使用。

字节缓冲输入流：BufferedInputStream
     -- 作用：可以把低级的字节输入流包装成一个高级的缓冲字节输入流管道，从而提高读数据的性能。
     -- 构造器: public BufferedInputStream(InputStream in)
     -- 原理：缓冲字节输入流管道包装了低级的字节输入流管道以后
         就自带一个缓冲池，缓冲池是内存的一块区域，一次可以直接提取8KB数据到内存
         以后程序直接在内存的缓冲池中读取数据，性能是很快的！
总结：缓冲字节输入流只是提高了字节输入流读取数据的性能，功能是一样用的。
 */
public class  BufferedInputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 定义一个字节输入流管道与源文件接通
        InputStream is = new FileInputStream("src/test2/test01.txt");
        // 把字节输入流管道包装成一个高级的缓冲字节输入流管道
        BufferedInputStream bis = new BufferedInputStream(is);

        // 定义一个字节数组循环读取数据
        byte[] buffer = new byte[3];
        int len = 0;
        System.out.print("字节缓冲输入流:");
        while ((len = bis.read(buffer)) != -1){
            String rs = new String(buffer, 0, len);
            System.out.print(rs);
        }
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211028072300.png" style="zoom: 80%;" />	

#### 15.9.2 字节缓冲输出流(BufferedOutputStream)

1、基本概念

==可以把低级的字节输出流包装成一个高级的缓冲字节输出流，从而提高写数据的性能==。

| 方法声明                                           | 功能介绍                                   |
| -------------------------------------------------- | ------------------------------------------ |
| `BufferedOutputStream(OutputStream out)`           | 根据参数指定的引用来构造对象。             |
| `BufferedOutputStream(OutputStream out, int size)` | 根据参数指定的引用和缓冲区大小来构造对象。 |
| `void write(int b)`                                | 写入单个字节。                             |
| `void write(byte[] b, int off, int len)`           | 写入字节数组中的一部分数据。               |
| `void write(byte[] b)`                             | 写入参数指定的整个字节数组。               |
| `void flush()`                                     | 刷新流。                                   |
| `void close()`                                     | 关闭流对象并释放有关的资源。               |

2、代码示例

```java
package cn.guardwhy.demo04;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
字节缓冲输出流：BufferedOutputStream
     -- 作用：可以把低级的字节输出流包装成一个高级的缓冲字节输出流，从而提高写数据的性能。
     -- 构造器：public BufferedOutputStream(OutputStream os)
     -- 原理：缓冲字节输出流自带了8KB缓冲池,数据就直接写入到缓冲池中去，性能极高了！
总结：字节缓冲输出流提高了字节输出流写数据的性能，但是功能是一样使用的。
 */
public class BufferedStreamDemo02 {
    public static void main(String[] args) throws Exception{
        // 创建一个字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("src/test2/test02.txt");
        // 把低级的字节输出流包装成一个高级的缓冲字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(os);
        // 写数据出去
        bos.write('a');
        bos.write('b');
        bos.write(97);
        System.out.println("\n");
        bos.write("guardwhy快乐的学习java".getBytes());

        // 关闭数据
        bos.close();
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211028083212.png" style="zoom:80%;" />	

#### 15.9.3 字符缓冲输入流(BufferedReader)

1、基本概念

==字节缓冲输入流可以把字符输入流包装成一个高级的缓冲字符输入流，可以提高读数据的性能。==

| 方法声明                                  | 功能介绍                                                     |
| ----------------------------------------- | ------------------------------------------------------------ |
| `BufferedReader(Reader in)`               | 根据参数指定的引用来构造对象。                               |
| `BufferedReader(Reader in, int sz)`       | 根据参数指定的引用和缓冲区大小来构造对象。                   |
| `int read()`                              | 从输入流读取单个字符，读取到末尾则返回`-1`，否则返回实际读取到的字符内容。 |
| `int read(char[] cbuf, int off, int len)` | 从输入流中读取`len`个字符放入数组`cbuf`中下标从`off`开始的位置上，若读取到末尾则返回`-1`，否则返回实际读取到的字符个数。 |
| `int read(char[] cbuf)`                   | 从输入流中读满整个数组`cbuf`。                               |
| `String readLine()`                       | 读取一行字符串并返回，返回`null`表示读取到末尾。             |
| `void close()`                            | 关闭流对象并释放有关的资源。                                 |

2、代码示例

```java
package cn.inputstream.demo02;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderDemo01 {
    public static void main(String[] args) throws Exception{
        
    }

    @Test
    public void bufferedReader01(){
        // 1.创建一个字符输入流管道与源文件接通
        Reader fr = null;
        try {
            fr = new FileReader("src/test2/hello.java");
            // 2.低级的字符输入流包装成一个高级的缓冲字符输入流管道
            BufferedReader br = new BufferedReader(fr);
            //3.定义一个字节数组循环读取数据
            char[] buffer = new char[6];
            //4.定义字符串长度
            int len = 0;
            //5.条件判断
            while ((len = br.read(buffer)) != -1){
                String rs = new String(buffer, 0, len);
                System.out.println(rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void bufferedReader02(){
        try {
            // 1.创建一个字符输入流管道与源文件接通
            Reader fr = new FileReader("src/test2/hello.java");
            // 2.低级的字符输入流包装成一个高级的缓冲字符输入流管道
            BufferedReader br = new BufferedReader(fr);
            // 3.定义字符串存储一行数据
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211028092244.png" style="zoom:80%;" />	

#### 15.9.4 字符缓冲输出流(BufferedWriter)

1、基本概念

==把字符输出流包装成一个高级的缓冲字符输出流，提高写字符数据的性能==。

| 方法声明                                    | 功能介绍                                                     |
| ------------------------------------------- | ------------------------------------------------------------ |
| `BufferedWriter(Writer out)`                | 根据参数指定的引用来构造对象。                               |
| `BufferedWriter(Writer out, int sz)`        | 根据参数指定的引用和缓冲区大小来构造对象。                   |
| `void write(int c)`                         | 写入单个字符到输出流中。                                     |
| `void write(char[] cbuf, int off, int len)` | 将字符数组`cbuf`中从下标`off`开始的`len`个字符写入输出流中。 |
| `void write(char[] cbuf)`                   | 将字符串数组`cbuf`中所有内容写入输出流中。                   |
| `void write(String s, int off, int len)`    | 将参数`s`中下标从`off`开始的`len`个字符写入输出流中。        |
| `void write(String str)`                    | 将参数指定的字符串内容写入输出流中。                         |
| `void newLine()`                            | 用于写入行分隔符到输出流中。                                 |
| `void flush()`                              | 刷新流。                                                     |
| `void close()`                              | 关闭流对象并释放有关的资源。                                 |

2、代码实现

```java
package cn.inputstream.demo02;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

/**
 字符缓冲输出流：BufferedWriter
     -- 作用：把字符输出流包装成一个高级的缓冲字符输出流，提高写字符数据的性能。
     -- 构造器：public BufferedWriter(Writer writer):
     -- 原理：高级的字符缓冲输出流多了一个8k的字符缓冲池，写数据性能极大提高了!
     -- 字符缓冲输出流多了一个换行的特有功能：
        public void newLine()：新建一行
 */
public class BufferedWriterDemo02 {
    public static void main(String[] args) throws Exception{

    }

    @Test
    public void FileWriter01() throws Exception {
        // 1.创建一个字符输出流与目标文件接通
        Writer fw = new FileWriter("src/test2/test03.txt", true);
        // 2.把低级的字符输出流管道包装成一个高级的字符缓冲输出流管道
        BufferedWriter bw = new BufferedWriter(fw);
        // 3.输出操作
        bw.write("在公司看电影");
        bw.newLine(); // 换行操作

        bw.write("在公司加班写代码...很开心");
        bw.write("\r\n");   // 换行

        // 关闭字符缓冲输出流
        bw.close();
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211028094048.png" style="zoom:80%;" />	

#### 15.9.5 缓冲流整合

1、需求:把这个文章的段落恢复顺序,把恢复顺序的结果数据写出到另一个文件中去

-  定义一个缓冲字符输入流管道与源文件接通，定义一个`List`集合存储文章的每一段数据。
-  按照行读取数据，把每行数据都存入到`List`集合中，给`List`集合按照元素的顺序进行合理排序。
-  先定义一个缓冲字符输出流通向目标文件，遍历List集合，把每行数据通过一个缓冲字符输出流写出到磁盘文件中去。

2、代码示例

```java
package cn.inputstream.demo02;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExecDemo03 {
    public static void main(String[] args) {

    }

    @Test
    public void method01(){
        try (// 1.定义一个缓冲字符输入流管道与源文件接通
             BufferedReader br = new BufferedReader(new FileReader("src/test3/a.txt"));
             // 2.先定义一个缓冲字符输出流通向目标文件。
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/test4/b.txt"));
        ){
            // 3.定义一个List集合存储文章的每一段数据
            List<String> lists1 = new ArrayList<>();
            // 4.按照行读取数据，把每行数据都存入到List集合中
            String line;
            while ((line = br.readLine()) != null){
                lists1.add(line);
            }
            System.out.println(lists1);

            // 5.自定义大小规则
            List<String> lists2 = new ArrayList<>();
            // 6.添加到集合
            Collections.addAll(lists2, "零","一","二","三","四","五","六","七","八","九","十");
            // 7.给List集合按照元素的顺序进行合理排序。
            Collections.sort(lists1, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return lists2.indexOf(o1.charAt(0) + "") - lists2.indexOf(o2.charAt(0) + "");
                }
            });
            System.out.println(lists1);
            // 8.遍历集合
            for(String In : lists1){
                bw.write(In);
                // 换行操作
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211028143012.png" style="zoom:80%;" />

### 15.10 对象流

#### 15.10.1 基本介绍

1、需求实现

- 将`int num = 100`这个`int`数据保存到文件中，注意不是`100`数字，而是`int 100`,并且，能够从文件中直接恢复`int 100`。
- 将`Student stu = new Student( “curry”，3)`这个`stu`对象保存到文件中，并且能够从文件恢复。
- 上面的要求， 就是能够将基本数据类型或者对象进行序列化和反序列化操作。

2、序列化和反序列化

- 序列化就是在保存数据时，==保存数据的值和数据类型==。
- 反序列化就是在恢复数据时，==恢复数据的值和数据类型==。
- 需要让某个对象支持序列化机制， 则必须让其类是可序列化的，为了让某个类是可序列化的，该类必须实现如下两个接口之一

```java
Serializable // 这是个标记接口， 没有方法
Externalizable //该接口有方法需要实现，因此一般实现上面的Serializable接口
```

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211028151352.png)

#### 15.10.1 ObjectOutputStream(对象输出流)

1、基本概念

`ObjectOutputStream` ==提供序列化功能==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211028151852.png" style="zoom:67%;" />	

2、案例实现

`Student`类

```java
package cn.object.demo01;

import java.io.Serializable;
//如果需要序列化某个类的对象，实现 Serializable
public class Student implements Serializable {
    private String name;
    private int age;

    //serialVersionUID 序列化的版本号，可以提高兼容性
    private static final long serialVersionUID = 1L;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

`ObjectOutputStream`类

```java
package cn.object.demo01;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        //1.1 序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
        String filePath = "E:\\workspace\\Java\\data.txt";
        // 1.2 创建对象输出流指向指向目标文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //1.3 序列化数据到 E:\data.txt
        oos.writeInt(10);// int -> Integer (实现了 Serializable)
        oos.writeBoolean(true);// boolean -> Boolean (实现了 Serializable)
        oos.writeChar('a');// char -> Character (实现了 Serializable)
        oos.writeDouble(8.8);// double -> Double (实现了 Serializable)
        oos.writeUTF("hello world");//String

        //1.3 保存一个Student对象
        oos.writeObject(new Student("curry", 10));
        // 1.4 关闭流
        oos.close();
        System.out.println("数据保存完毕(序列化形式)");
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211028162208.png" style="zoom:80%;" />	

#### 15.10.2 ObjectInputStream(对象输入流)

1、基本概念

`ObjectInputStream`==提供反序列化功能==

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211028171137.png" style="zoom:67%;" />	

2、代码示例

`ObjectInputStream`类实现

```java
package cn.object.demo01;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo01 {
    public static void main(String[] args) throws Exception{
        //1.1 指定反序列化的文件
        String filePath = "E:\\workspace\\Java\\data.txt";
        // 1.2 创建对象输入流指向指向目标文件
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        // 1.3 读取(反序列化)的顺序需要和你保存数据(序列化)的顺序一致,否则会出现异常
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());


        //1.4 student的编译类型是Object, student的运行类型是Student
        Object student = ois.readObject();
        System.out.println("运行类型=" + student.getClass());
        System.out.println("student信息=" + student);//底层 Object -> Student


        //1.5 如果希望调用Student的方法, 需要向下转型,需要将Student类的定义，放在到可以引用的位置.
        Student stu = (Student)student;
        System.out.println(stu.getName());

        //1.6 关闭外层流即可，底层会关闭FileInputStream流
        ois.close();
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211028171344.png" style="zoom:67%;" />	 	

#### 15.10.4 注意事项

- 读写顺序要一致。要求实现序列化或反序列化对象,需要实现`Serializable`
- 序列化的类中建议添加`SerialVersionUID`,为了提高版本的兼容性
- 序列化对象时，默认将里面所有属性都进行序列化，但除了`static`或`transient`修饰的成员。
- 序列化对象时，要求里面属性的类型也需要实现序列化接口。
- ==序列化具备可继承性，也就是如果某类已经实现了序列化，则它的所有子类也已经默认实现了序列化==。

### 15.10 转换流

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/Spring/Test4/20210320191522.png)

#### 15.10.1 字符输入转换流 (InputStreamReader）

1、基本概念

- ==把原始的字节输入流按照指定的编码转换成字符流，从而解决不同编码读取数据乱码的问题==。
- `InputStreamReader`：`Reader`的子类，可以将`InputStream`(字节流)包装成(转换)`Reader`(字符流)。

| 方法声明                                                | 功能介绍                             |
| ------------------------------------------------------- | ------------------------------------ |
| `InputStreamReader(InputStream in)`                     | 根据参数指定的引用来构造对象。       |
| `InputStreamReader(InputStream in, String charsetName)` | 根据参数指定的引用和编码来构造对象。 |
| `int read(char[] cbuf)`                                 | 读取字符数据到参数指定的数组。       |
| `void close()`                                          | 用于关闭输出流并释放有关的资源。     |

2、代码示例

```java
package cn.object.demo02;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
字符输入转换流：InputStreamReader
     -- 作用: 把原始的字节输入流按照指定的编码转换成字符流，从而解决不同编码读取数据乱码的问题。
     -- 构造器：
         public InputStreamReader(InputStream is):默认是以当前代码编码转换成字符流（几乎不用）
         public InputStreamReader(InputStream is,String charset):指定编码转换成字符流（很重要）
总结：
     字符输入转换流：可以把原始的字节流按照指定的编码转换成字符流
     从而可以解决不同编码读取乱码的问题。
 */
public class InputStreamReaderDemo01 {
    public static void main(String[] args) {

    }

    @Test
    public void InputStreamReader01() throws Exception {
        // 1.先获取文件的原始字节流
        InputStream is = new FileInputStream("src/test4/text01.txt");
        Reader fr = new InputStreamReader(is);
        // 定义字符数组
        char[] buffer = new char[11];
        // 定义长度
        int len = 0;
        while ((len = fr.read(buffer)) != -1){
            String rs = new String(buffer, 0, len);
            System.out.println(rs);
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211028172818.png" style="zoom:80%;" />	

#### 15.10.2 字符输出转换流(OutputStreamWriter)

1、基本概念

- ==可以把字节输出流按照指定编码转换成字符输出流，可以实现写某种编码的字符数据出去。==
- `OutputStreamWriter`：`Writer`的子类，实现将`OutputStream`(字节流)包装成`Writer`(字符流)。
- 当处理纯文本数据时，如果使用字符流效率更高，并且可以有效解决中文问题，所以建议将字节流转换成字符流.
- 可以在使用时指定编码格式(比如`utf-8`, `gbk`，`gb2312`,` IS08859-1`等)。

| 方法声明                                                     | 功能介绍                           |
| ------------------------------------------------------------ | ---------------------------------- |
| `OutputStreamWriter(OutputStream out)`                       | 根据参数指定的引用来构造对象。     |
| `OutputStreamWriter(OutputStream out, String<br/>charsetName)` | 根据参数指定的引用和编码构造对象。 |
| `void write(String str)`                                     | 将参数指定的字符串写入。           |
| `void flush()`                                               | 刷新流。                           |
| `void close()`                                               | 用于关闭输出流并释放有关的资源。   |

2、代码示例

```java
package cn.object.demo02;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
字符输出转换流：OutputStreamWriter
     -- 作用：可以把字节输出流按照指定编码转换成字符输出流，可以实现写某种编码的字符数据出去。
     -- public OutputStreamWriter(OutputStream os):
     -- public OutputStreamWriter(OutputStream os , String charset):
总结：
 字符输出转换流可以把字节输出流指定编码转换成字符流。
 */
public class OutputStreamWriterDem01 {
    public static void main(String[] args) {

    }

    @Test
    public void OutputStreamWriter01() throws Exception {
        // 创建一个字节输出流管道
        OutputStream os = new FileOutputStream("src/test4/test02.txt");
        // 把字节输出流转换成一个字符输出流
        Writer fw = new OutputStreamWriter(os);
        // 写入操作
        fw.write("科比是mvp");
        // 关闭流
        fw.close();
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211028175312.png" style="zoom:67%;" />	

### 15.11 打印流

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaEE/Spring/Test4/20210320192324.png)

#### 15.11.1 PrintStream类

1、基本概念
==java.io.PrintStream类主要用于更加方便地打印各种数据内容==。

| 方法声明                        | 功能介绍                             |
| ------------------------------- | ------------------------------------ |
| `PrintStream(OutputStream out)` | 根据参数指定的引用来构造对象。       |
| `void print(String s)`          | 用于将参数指定的字符串内容打印出来。 |
| `void println(String x)`        | 用于打印字符串后并终止该行。         |
| `void flush()`                  | 刷新流。                             |
| `void close()`                  | 用于关闭输出流并释放有关的资源。     |

2、代码示例

```java
package cn.guardwhy.demo07;

import java.io.PrintStream;

/**
 打印流有：PrintStream / PrintWriter
 打印流的作用：可以方便并且高效的打印各种类型的数据出去。

 PrintStream:打印流
     -- 构造器:
     public PrintStream(OutputStream os):直接通向字节输出流
     public PrintStream(String path): 直接通向文件地址
 总结：
    PrintStream:打印流可以高效，方便的打印各种数据类型出去，而且也可以写字节数据出去！
 */
public class PrintStreamDemo01 {
    public static void main(String[] args) throws Exception{
        // 创建一个打印流对象
        PrintStream ps = new PrintStream("src/test3/a.txt");
        ps.println(97);
        ps.println("kobe is mvp!!");
        ps.println('c');

        // 写一个字符
        ps.write(97);
        // 写一个字节出去
        ps.write("我在公司写代码".getBytes());
        // 关闭打印流
        ps.close();
    }
}
```

3、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se1/31-javase.png)	

#### 15.11.3 PrintWriter类

1、基本概念
==java.io.PrintWriter类主要用于将对象的格式化形式打印到文本输出流==。

| 方法声明                  | 功能介绍                         |
| ------------------------- | -------------------------------- |
| `PrintWriter(Writer out)` | 根据参数指定的引用来构造对象。   |
| `void print(String s)`    | 将参数指定的字符串内容打印出来。 |
| `void println(String x)`  | 打印字符串后并终止该行。         |
| `void flush()`            | 刷新流。                         |
| `void close()`            | 用于关闭输出流并释放有关的资源。 |

2、代码示例

```java
package cn.guardwhy.demo07;

import java.io.PrintWriter;

/**
 打印流有：PrintStream / PrintWriter
 打印流的作用：可以方便并且高效的打印各种类型的数据出去。

 PrintWriter:打印流
 -- 构造器:
 public PrintWriter(OutputStream os):直接通向字节输出流
 public PrintWriter (Writer out):直接通向字符输出流
 public PrintWriter(String path): 直接通向文件地址
 
总结：PrintWriter:打印流可以高效，方便的打印各种数据类型出去。
 */
public class PrintWriterDemo02 {
    public static void main(String[] args) throws Exception{
        // 创建打印流对象
        PrintWriter ps = new PrintWriter("src/test3/b.txt");
        ps.println(97);
        ps.println("kobe is mvp!!");
        ps.println('c');

        // 写一个字符
        ps.write(97);
        // 写一个字符串出去
        ps.write("我在公司写代码");
        // 关闭打印流
        ps.close();
    }
}
```

3、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se1/30-javase.png)	

## 第16章 网络编程

### 16.1 网络的相关概念

网络编程是指编写运行在多个设备【计算机】的程序，这些设备都通过网络连接起来。程序之间可以通信，互相发送消息，网络编程其实是有难度的，但是`Java`作为一个面向对象的语言，帮助我们屏蔽了大量的复杂实现，所以就简单了。`Java`中提供了 `java.net `包中` J2SE` 的 `API `包含有类和接口，它们提供低层次的通信细节。可以直接使用这些类和接口，来专注于解决问题，而不用关注通信细节。

#### 16.1.1 网络通信

1、基本概念：两台设备之间通过网络实现数据传输，将数据通过网络从一台设备传输到另一台设备。

2、`java.net`包下提供了一系列的类或接口，供程序员使用，完成网络通信。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029071815.png)

#### 16.1.2 网络

1、网络概念:两台或多台设备通过一定物理设备连接起来构成了网络。

2、根据网络的覆盖范围不同，对网络进行分类:

- 局域网：覆盖范围最小，仅仅覆盖一个教室或一个机房。
- 城域网：覆盖范围较大，可以覆盖一个城市。
- 广域网：覆盖范围最大，可以覆盖全国，甚至全球，万维网是广域网的代表。

#### 16.1.3 网卡

网卡是一块被设计用来允许计算机在计算机网络上进行通讯的计算机硬件。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029094847.png" style="zoom:67%;" />	

==每一个网卡都有一个被称为MAC地址的独一无二的48位串行号==，它被写在卡上的一块内存中。在网络上的每一个计算机都必须拥有一个独一无
二的MAC地址。

没有任何两块被生产出来的网卡拥有同样的地址。这是因为电气电子工程师协会负责为网络接口控制器（网卡）销售商分配唯一的MAC地址。

#### 16.1.3 MAC地址、IP地址

1、window电脑在命令行模式下输入命令cmd，然后输入以下命令

```java
ipconfig -all 
```

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029095411.png" style="zoom:67%;" />	

2、其中物理地址指的就是`MAC`地址、`IPv4` 地址就是`IP`，`MAC`地址也叫物理地址和局域网地址，主要用于确认网上设备的地址，类似于身份证号 ，具有唯一标识，每一个网卡制作完成之后就带有一个`MAC`地址，永远都不会改变。

3、`ip`地址概念：==用于唯一标识网络中的每台计算机/主机==，类似于你的现住址，是标记你在网络中的具体位置，一个网卡的IP地址是可以改变的。`ip`地址的表示形式：点分十进制`XX.X.xx.xx`，每一个十进制数的范围: `0~255`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029083909.png" style="zoom:80%;" />	

`ip`地址的组成===网络地址+主机地址==，比如: `192.168.16.69`

| 类型 | 范围                           |
| ---- | ------------------------------ |
| `A`  | `0.0.0.0` 到`127.255.255.255`  |
| `B`  | `128.0.0.0`到`191.255.255.255` |
| `C`  | `192.0.0.0`到`223.255.255.255` |
| `D`  | `224.0.0.0`到`239.255.255.255` |
| `E`  | `240.0.0.0`到`247.255.255.255` |

`iPv6`是互联网工程任务组设计的用于替代`IPv4`的下一代`IP`协议， 其地址数量号称可以为全世界的每一粒沙子编上一 个地址。由于`IPv4`最大的问题在于网络地址资源有限，严重制约了互联网的应用和发展。`IPv6`的使用，不仅能解决网络地址资源数量的问题，而且也解决了多种接入设备连入互联网的障碍。

#### 16.1.4 计算机之间是如何通信的

1、双绞线

如果只是两台计算机，==就可以使用双绞线（网线）连载一起==，就能互相发送消息，组成一个小网络。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029101511.png" style="zoom:80%;" />	

2、交换机

但是网络不是由两台电脑组成的，经常需要将几十台上百台电脑组织起来形成一个局域网，此时一个新的设备就出现了叫做交换机【switch】。交换机可以记录每一个设备的地址和接口的对应关系，从而实现端对端的信息传输。交换机要将内容发送给指定的计算机，那么内部一定维护了一张表，记录了哪个电脑链接了我的哪个口。==交换机只能识别MAC地址，MAC地址是【物理地址】，交换机对【IP地址】并不感兴趣==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029102909.png" style="zoom:67%;" />	

3、路由器

一般的交换机的地址表也就能存个几千个地址，当网络内的设备多起来以后，只要交换机找不到对应设备就会广播，地址表如果满了，新地址
还会覆盖旧地址就会导致重新寻找效率比较低。所以又引入了一个设备叫【路由器】，谁也听过的一个设备，一般家里都有。

> 注意事项：

==路由器不是猫，猫是调制解调器==。它能把计算机的【数字信号】翻译成可沿【普通电话线/光纤】传送的模拟信号，而这些模拟信号又可被线路另一端的另一个调制解调器接收，并译成计算机可懂的【语言】。但是运营商送你的盒子一般既有调制解调器的功能，也有路由器的功能，只不过路由功能不太好。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029104925.png)

#### 16.1.5 域名相关概念

1、域名就是`IP`的名字，如果`IP`是手机号，域名就是名字。通常可以去阿里云等云服务提供商购买域名。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029105736.png" style="zoom: 50%;" />	

2、购买了域名之后，需要在云服务厂商进行域名的配置，==让域名指向一个拥有公网IP地址的服务器==，以后访问域名就能访问到我们的服务器了。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029121513.png)

3、DNS服务器

| 名称       | 介绍                                                | DNS地址                                                   |
| ---------- | --------------------------------------------------- | --------------------------------------------------------- |
| 114 DNS    | 国内用户量最大的老牌DNS                             | 首选：<br/>114.114.114.114<br/>备选：<br/>114.114.114.115 |
| DNS PodDNS | 中国最大的第三方域名服务商，全球排名第四位          | 首选：<br/>119.29.29.29<br/>备选：<br/>182.254.116.116    |
| 阿里 DNS   | 阿里公共DNS是阿里巴巴集团推出的<br/>DNS递归解析系统 | 首选：223.5.5.5<br/>备选：223.6.6.6                       |

2、域名的分类

| 分类标<br/>准 | 分类情况                                                     |
| ------------- | ------------------------------------------------------------ |
| 语种分类      | 中文：百度`.com `、百度.中国、`baidu.`中国<br/>英文：`baidu.com` |
| 地区分类      | 中国大陆顶级域名是`.cn`<br/>美国国家顶级域名是`.us`<br/>日本国家顶级域名是`.jp` |
| 机构分类      | `.com` 商业性的机构或公司<br/>`.org` 非盈利的组织、团体 https://apache.org/<br/>`.gov` 政府部门 http://www.gov.cn/ https://www.shanghai.<br/>`gov.cn/` |
| 层级分类      | 顶级域名(一级域名): `baidu.com`<br/>二级域名：`jingyan.baidu.com`  www.baidu.com |

### 16.2 数据的传输

#### 16.2.1 计算机网络体系结构定义

计算机网络所划分的(<font color = red>**层次**</font>)以及(<font color = red>**各层协议**</font>)的集合就称为<font color = red>**计算机网络体系结构**</font>。

1、层次结构:按==功能==分成若干层，每层完成一部分子功能，分而治之，各个击破。(==不是按实现方式划分层次结构的==)

2、层次结构的优点: 各层之间是独立的，灵活性好，结构上可分隔开，易于实现和维护，能促进网络标准化。

3、体系结构定义:计算机网络各<font color = red>**层次结构模型及其协议**</font>的集合。

#### 16.2.2 OSI参考模型

开放系统互连( Open System Interconnection, <font color = red>**OSI**</font> )参考模型:国际标准化组织

- `OSI`包括了体系结构、服务定义和协议规范三级抽象(异构网络系统互连的国际标准、理解网络通信的理论模型)
- `OSI`參考模型七层结构:<font color = red>**物理层、数据链路层、网络层、传输层、会话层、表示层、应用层**</font>。

2、每层功能特定,且下层为上层提供服务！！！【==物 联 网 叔 会 使 用==】

- 物理层：使原始的数据以==比特流==在物理介质上传输。【接口特性、比特编码、数据率、比特同步、传输模式】
- 数据链路层：通过校验、确认和反馈重发等手段，将不可靠的物理链路改造成对网络层米说是无差错的数据链路，以==“帧”==为单位进行传输。【点到点数据传输、成帧、物理寻址、流量控制、差错控制、访问控制】
- 网络层：源主机到目的主机数据分组交付、逻辑寻址、路由、分组转发。以“==数据包”(Packet)== 为单位进行传输。
- 传输层：提供了==端到端，【应用进程间】==的透明数据传输服务，处理端到端的==差错控制==和==流量控制==问题。传输层的数据传输单位是“==数据段==”。【通过端口号寻址通信】
- 会话层：负责建立、管理和终止进程之间的会话和数据交换。【会话控制、同步】
- 表示层：负责数据格式转换、数据加密与解密、压缩与解压缩等。
- 应用层：为用户的应用进程提供网络服务。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211008102237.png)

3、OSI参考模型相关特点

- 数据在垂直的层次中自上而地逐层传递至物理层。
- 对等层不直接进行通信,称为<font color = red>**虚拟通信**</font>。
- 物理层的两个端点进行<font color=red>**物理通信**</font>，称为<font color = red>**实通信**</font>。
- 中间系统通常只实现==物理层==、==数据链路层==和==网络层==功能。物理层、数据链路层、网络层为==结点==到==结点层==，传输层、会话层、表示层、应用层为==端==到==端层==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211008103857.png" style="zoom: 67%;" />	

#### 16.2.3 TCP/IP参考模型

1、`OSI`参考模型太过于理想化，==业界普遍认准的是五层参考模型==，因为这是最接近实际网络的参考模型，TCP/IP成功也不是偶然的，而是综合了其他几个因素:

- 它是免费的或者仅仅收少量的费用，这就是它的使用人群，非常的广泛。
- `TCP/IP`搭上了`unix`这辆快车，并很快推出了基于【套接字】的实际编程接口。
- `TCP/IP`来源于实际需求，它确实解决了当下的网络互连标准。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211008125548.png" style="zoom: 67%;" />

#### 16.2.4 TCP协议

##### 16.2.4.1 TCP报文段结构

1、基本概念

==传输控制协议==`(Transmission Control Protocol ,TCP)`：`Internet`传输层协议。提供面向连接、可靠、有序、字节流 传输服务。

- 应用进程<font color = red>**先建立连接**</font>，每一条TCP连接只有<font color = red>**两个**</font>端点。
- <font color = red>**可靠交付**</font>：无差错，不丢失，不重复，按序到达，<font color = red>**全双工通信**</font>，<font color = red>**面向字节流**</font>。
- 面向字节流：字节序列。应用程序和TCP的交互是一个个数据块，TCP把他们看做是无结构字节流。
- 最大报文段长度(Maximum Segment Size,MSS)：报文段中封装的<font color = red>**应用层数据**</font>的最大长度。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211011101104.png" style="zoom: 80%;" />	

2、TCP报文段结构

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211011102034.png" style="zoom: 50%;" />	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211011105806.png" style="zoom:80%;" />	

2.1、源端口号字段，目的端口号字段分别占16位。复用/分解来自/送到上层应用的数据，序号字段、确认序号字段分别占32位。

- 序号字段：`TCP`的序号是对每个应用层数据的<font color = red>**每个字节**</font>进行编号。
- 确认序号字段：是==期望==从对方接收数据的字节序号，即该序号对应的字节尚未收到。

2.2、首部长度字段占4位。指出`TCP`段的首部长度，以==4字节==为计算单位。

- ==最短是20字节==，最长是60字节，保留字段占6位。保留为今后使用，目前值为0。

2.3、`URG`、`ACK`、`PSH`、`RST`、`SYN`、`FIN`各占1位。为标志位字段，各占1位，取值为0或1。

- 紧急`URG=1`，紧急指针字段有效，优先传送。
- 确认`ACK=1`，确认序号字段有效；ACK=0时，确认序号字段无效。
- 推送`PSH=1`，尽快将报文段中的数据交付接收应用进程，不要等缓存满了再交付。
- 复位`RST=1`，TCP连接出现严重差错，释放连接，再重新建立TCP连接。
- 同步`SYN=1`，该TCP报文段是一个建立新连接请求控制段或者同意建立新连接的确认段。
- 终止`FIN=1`，TCP报文段的发送端数据已经发送完毕，请求释放连接。

2.4、接收窗口字段占`16`位。向对方通告我方接收窗口的大小。校验和字段占`16`位。

- 校验和字段检验的范围类似于`UDP`，计算方法与`UDP`校验和的计算方法相同，`TCP`协议号是`6`。

2.5、紧急指针字段占`16`位。

- `URG`=1时，才有效，指出在本`TCP`报文段中紧急数据共有多少个字节，选项字段长度可变，基本不用。最短为`0`字节，最长为`40`字节。
- 填充字段，取值全为`0`，目的是为了整个首部长度是`4`字节的整倍数。

3、传输控制协议小结

- 序号字段：`TCP`的序号是对每个应用层数据的==每个字节==进行编号。
- 确认序号字段：是==期望==从对方接收数据的字节序号，即该序号对应的字节尚未收到，用`ack_seq`表示。
- `TCP·段的==首部长度最短是20字节==。

##### 16.2.4.2 TCP协议相关特点

- 使用`TCP`协议前，须先建立`TCP`连接，形成传输数据通道
- 传输前，采用"==三次握手=="方式，是可靠的
- TCP协议进行通信的两个应用进程:客户端、服务端
- 在连接中可进行大数据量的传输
- ==传输完毕，需释放已建立的连接，效率低==

##### 16.2.4.3 TCP连接管理

1、三次握手实现

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029145801.png" style="zoom: 80%;" />	

2、【连接】操作

第一次握手：

- 客户向服务器发送连接请求段：`SYN=1,seq=x`
- `SYN=1`：建立连接请求控制段
- `seq=x`：表示传输的报文段的第`1`个数据字节的序列号是`x`，并以此序列号代表整个报文段的序号(补充：`sequence number`，序号的意思。）==客户端进入SYN_SEND（同步发送）==

第二次握手

- 服务器收到TCP连接请求段后，如同意，则发回确认报文段:`(SYN=1,ACK=1,seq=y, ack_seq=x+1)`，`SYN=1`：同意建立新连接的确认段。
- `ack_seq=x+1`：表示已经收到了序列号为x的报文段，准备接收序列号为`x+1`的报文段。
- `seq=y`：服务器告诉客户确认报文段的序列号是`y`，<font color = red>**服务器由`LISTEN`进入`SYN_RCVD`(同步收到)**</font>。

第三次握手，客户对服务器的同意连接报文段进行确认

- `(ACK=1,seq=x+1,ack_seq=y+1)`，`seq=x+1`：客户此次的报文段的序列号是`x+1`。
- `ack_seq=y+1`：客户期望接收服务器序列号为y+1的报文段。
- **<font color = red>当客户发送`ACK`时，客户端进入`ESTABLISHED`状态，当服务收到`ACK`后，也进入`ESTABLISHED`状态</font>**。
- ==只有第三次握手可携带数据==。

3、TCP连接管理小结

为什么需要三次握手？

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029134419.png)

- ==第一次握手：客户发送请求，此时服务器知道客户能发。==
- ==第二次握手：服务器发送确认，此时客户知道服务器能发能收。==
- ==第三次握手：客户发送确认，此时服务器知道客户能收。==	

##### 16.2.4.4 TCP连接拆除管理

1、四次挥手实现

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029140407.png" style="zoom: 80%;" />	

2、连接拆除步骤

第一次挥手：

- 客户向服务器发送释放连接报文段：`(FIN=1,seq=u)`
- `FIN=1`：发送端数据发送完毕，请求释放连接，`seq=u`：传输的第一个数据字节的序号是`u`
- 客户端状态由`ESTABLISHED`进入`FIN_WAIT_1`（终止等待1状态）

第二次挥手

- 服务器向客户发送确认段:`(ACK=1,seq=v,ack_seq=u+1)`
- `ACK=1`：确认字号段有效，`ack_seq=u+1`：服务器期望接收客户数据序号为`u+1`。
- `seq=v`：服务器传输的数据序号是`v`。服务器状态由`ESTABLISHED`进入`CLOSE_WAIT`（关闭等待）
- 客户端收到`ACK`段后，由`FIN_WAIT_1`进入`FIN_WAIT_2`

第三次挥手

- 服务器向客户发送释放连接报文段：`(FIN=1,ACK=1,seq=w,ack_seq=u+1)`
- `FIN=1`：请求释放连接，`ACK=1`：确认字号段有效。
- `ack_seq=u+1`：表示服务器期望接收客户数据序号为`u+1`。
- `seq=w`：表示自己传输的第一个数据字节的序号是`w`。
- 服务器状态由`CLOSE_WAIT进入LAST_ACK`（最后确认状态）

第四次挥手

- 客户向服务器发送确认段：`(ACK=1,seq=u+1,ack_seq=w+1)`
- `ACK=1`：确认字号段有效。`ack_seq=w+1`：表示客户期望接收服务器数据序号为`w+1`。
- `seq=u+1`：表示客户传输的数据的序号是`u+1`。
- 客户端状态由`FIN_WAIT_2`进入`TIME_WAIT`，等待`2MSL`时间，进入`CLOSED`状态。
- 服务器在收到最后一次`ACK`后，由`LAST_ACK`进入`CLOSED`。

3、TCP连接拆除小结

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029151823.png)

##### 16.2.4.5 TCP管理小结

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029155616.png" style="zoom:80%;" />

#### 16.2.5 UDP协议

`UDP(User Datagram Protocol)`：==用户数据报协议==)是一种传输层的协议，它提供不可靠服务，它是无连接的，所以不存在建立连接需要的时延。

##### 16.2.5.1 UDP特点

- 将数据、源、目的封装成数据包，不需要建立连接。
- 每个数据报的大小限制在`64K`内，不适合传输大量数据。
- 因无需连接，==故是不可靠的==。
- 发送数据结束时无需释放资源(因为不是面向连接的)，速度快。

##### 16.2.5.2 UDP数据报结构

1、UDP首部<font color = red>**四个字段**</font>：每个字段长度都是2个字节，共8个字节。

- <font color = red>**源端口号**</font>和<font color = red>**目的端口号**</font>：用于UDP实现复用和分解。
- <font color = red>**长度**</font>：指示UDP报文段中的字节数（首部和数据的总和）。
- <font color = red>**校验和**</font>：接收方使用来检测数据报是否出现差错。

2、数据字段：应用层数据占用

3、用户数据报协议【UDP】图解

使用范围：有些场景如直播、电话会议，能容一些数据的丢失，但是不能允许有较大的时延。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211011083009.png)

##### 16.2.5.3 两者区别

1、`TCP`需要在端系统中维护连接状态，需要一定的开销。此连接装入包括接收和发送缓存，拥塞控制参数和序号与确认号的参数。`UCP`不维护连
接状态，也不跟踪这些参数，开销小。空间和时间上都具有优势。`UDP`提供尽最大努力的交付，不保证可靠交付。

2、`UDP`常用一次性传输比较少量数据的网络应用，如`DNS,SNMP`等，因为对于这些应用，若是采用`TCP`为连接的创建，维护和拆除带来不小的
开销。`UDP`也常用于多媒体应用（如IP电话，实时视频会议，流媒体等）数据的可靠传输对他们而言并不重要，`TCP`的拥塞控制会使他们有较大的
延迟，也是不可容忍的。

### 16.3 Socket 编程

#### 16.3.1 socket编程前置

1、`Socket`编程是在`TCP/IP`上的网络编程，可以发现`Socket`就在应用程序的传输层和应用层之间，设计了一个`Socket`抽象层，传输层的底一层的服务提供给`Socket`抽象层，`Socket`抽象层再提供给应用层。==要想理解Socket编程怎么通过Socket关键词实现服务器和客户端通讯，必须得先了解TCP/IP是怎么通讯的，在这个的基础上再去理解Socket的握手通讯==！

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029162221.png" style="zoom: 67%;" />	

2、套接字使用`TCP`提供了两台计算机之间的通信机制，客户端程序创建一个套接字，并尝试连接服务器的套接字。当连接建立时，服务器会创建一个 Socket 对象。客户端和服务器现在可以通过对 `Socket` 对象的写入和读取来进行通信。`java.net.Socket` 类代表一个套接字，并且 `java.net.ServerSocket `类为服务器程序提供了一种来监听客户端，并与他们建立连接的机制。

3、以下步骤在两台计算机之间使用套接字建立`TCP`连接时会出现：

- 服务器实例化一个`ServerSocket` 对象，表示通过服务器上的端口通信。
- 服务器调用 `ServerSocket`类的`accept()`方法，该方法将一直等待，直到客户端连接到服务器上给定的端口。
- 服务器正在等待时，一个客户端实例化一个`Socket`对象，指定服务器名称和端口号来请求连接。
- `Socket` 类的构造函数试图将客户端连接到指定的服务器和端口号。如果通信被建立，则在客户端创建一个`Socket`对象能够与服务器进行通信。
- 在服务器端`accept()`方法返回服务器上一个新的`Socket`引用，该`Socket`连接到客户端的`Socket`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029163321.png" style="zoom: 80%;" />

####  16.3.2 InetAddress 类

> **1、主机名**

【主机名】就是计算机的名字（计算机名），这个名字可以随时更改，从我的电脑-属性的计算机名就可更改。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029163855.png" style="zoom: 67%;" />	

> **2、主机名和域名的联系**

- `Internet`域名是`Internet`网络上的一个服务器或一个网络系统的名字。在全世界没有重复的域名。域名的范围要比主机名大。一个域名下可以有多
  个主机名域名下还可以有子域名。例如：域名`cnwg.cn`下,有主机`server1`和`server2`其主机全名就是`server1.cnwg.cn`和`server2.cnwg.cn`。
- ==主机名的含义是机器本身的名字，域名是方面记录IP地址才做的一种IP映射==,二者有共性：都能对应到一个唯一的`IP`上，从应用场景上可以这么简单理解二者的区别：==主机名用于局域网中，域名用于公网中==。

> **3、相关方法**

1、具体相关方法

| 方法名                                                      | 方法描述                                                |
| ----------------------------------------------------------- | ------------------------------------------------------- |
| `static InetAddress getByAddress(byte[] addr)`              | 在给定原始` IP` 地址的情况下，返回 `InetAddress `对象。 |
| `static InetAddress getByAddress(String host, byte[] addr)` | 根据提供的主机名和 `IP` 地址创建 `InetAddress`。        |
| `static InetAddress getByName(String host)`                 | 在给定主机名的情况下确定主机的 `IP` 地址。              |
| `String getHostAddress()`                                   | 返回 `IP` 地址字符串（以文本表现形式）。                |
| `String getHostName() `                                     | 获取此 `IP` 地址的主机名。                              |
| `static InetAddress getLocalHost()`                         | 返回本地主机。                                          |
| `String toString() `                                        | 将此 `IP` 地址转换为` String`。                         |

2、代码实现

```java
package cn.api.demo01;

import java.net.InetAddress;

public class ApiTest {
    public static void main(String[] args) throws Exception{
        //1. 获取本机的InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//GuardWhy/192.168.3.9

        //2. 根据指定主机名 获取 InetAddress对象
        InetAddress host1 = InetAddress.getByName("GuardWhy");
        System.out.println("host1=" + host1);//host1=GuardWhy/192.168.3.9


        //3. 根据域名返回 InetAddress对象, 比如 www.baidu.com 对应
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2=" + host2);// host2=www.baidu.com/183.232.231.174

        //4. 通过 InetAddress对象，获取对应的地址
        String hostAddress = host2.getHostAddress();// 192.168.3.9
        System.out.println("host2对应的ip = " + hostAddress);// host2对应的ip = 183.232.231.174

        //5. 通过 InetAddress 对象，获取对应的主机名/或者的域名
        String hostName = host2.getHostName();
        System.out.println("host2对应的主机名/域名=" + hostName); // host2对应的主机名/域名=www.baidu.com
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029213201.png" style="zoom:80%;" />	

### 16.4 TCP 网络通信编程

#### 16.4.1 Socket关键字

1、基本概念

- 套接字`(Socket)`开发网络应用程序被广泛采用，以至于成为事实上的标准。
- 通信的两端都要有`Socket`,是两台机器间通信的端点，网络通信其实就是`Socket`间的通信。
- `Socket`允许程序把网络连接当成一 个流，数据在两个`Socket`间通过`IO`传输。
- ==一般主动发起通信的应用程序属客户端，等待通信请求的为服务端==。

2、图解说明

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211029220740.png" style="zoom:80%;" />	

#### 16.4.2 基本介绍

基于客户端一服务端的网络通信，底层使用的是`TCP/IP`协议。

应用场景举例:客户端发送数据，服务端接受并显示控制台，基于`Socket`的`TCP`编程。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211030051728.png" style="zoom: 67%;" />	

#### 16.4.3 应用案例1【字节流实现】

1、思路分析

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211030053516.png)

- 编写一个服务器端，和一个客户端。
- 服务器端在==8888==端口监听。
- 客户端连接到服务器端， 发送"==hello, server=="" ,然后退出。
- 服务器端接收到客户端发送的信息，输出并退出。

2、代码实现

服务端【`SocketServerDemo01 `】

```java
package cn.socket.demo01;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerDemo01 {
    public static void main(String[] args) throws Exception{
        /**
         * 1.1在本机的8888端口监听, 等待连接
         * 细节: 要求在本机没有其它服务在监听8888
         * 细节：这个ServerSocket可以通过 accept()返回多个Socket[多个客户端连接服务器的并发]
         */
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端，在8888端口监听，等待连接..");

        // 1.2 当没有客户端连接8888端口时，程序会阻塞等待连接,如果有客户端连接，则会返回Socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("服务端 socket =" + socket.getClass());

        //1.3 通过socket.getInputStream()读取客户端写入到数据通道的数据
        InputStream inputStream = socket.getInputStream();

        //1.4 IO读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            //1.5 根据读取到的实际长度，显示内容。
            System.out.println(new String(buf, 0, readLen));
        }
        //1.6 关闭流和socket
        inputStream.close();
        socket.close();
        //1.7 关闭
        serverSocket.close();
    }
}
```

客户端【`SocketClientDemo01`】

```java
package cn.socket.demo01;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketClientDemo01 {
    public static void main(String[] args) throws Exception{
        //1.1 连接服务端(ip,端口)连接本机的8888端口, 如果连接成功，返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println("客户端socket返回=" + socket.getClass());
        //1.2 连接上后，生成Socket, 通过socket.getOutputStream(),得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //1.3 通过输出流,写入数据到数据通道
        outputStream.write("hello, server".getBytes());
        //1.4 关闭流对象和socket, 必须关闭
        outputStream.close();
        socket.close();
        System.out.println("客户端退出.....");
    }
}
```

3、执行结果，先运行服务端，再执行客户端。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211030064512.png" style="zoom:80%;" />	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211030064607.png" style="zoom:80%;" />	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211030064644.png" style="zoom:80%;" />	

#### 16.4.4  应用案例2【字节流实现】

1、思路分析

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211030090918.png" style="zoom:80%;" />	

- 编写一个服务端，和一个客户端，服务器端在==8888==端口监听。
- 客户端连接到服务端，发送=="hello, server"==并接收服务器端回发的"hello,client",再退出。
- 服务器端接收到客户端发送的信息，输出并发送"hello, client"，再退出。

2、代码示例

服务端【`SocketServerDemo01 `】

```java
package cn.socket.demo02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerDemo01 {
    public static void main(String[] args) throws Exception{
        /**
         * 1.1 在本机的8888端口监听,等待
         * 连接细节: 要求在本机没有其它服务在监听8888
         * 细节：这个ServerSocket可以通过accept()返回多个Socket[多个客户端连接服务器的并发]
         */
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端，在8888端口监听，等待连接..");
       
        // 1.2 当没有客户端连接8888端口时，程序会阻塞等待连接，如果有客户端连接，则会返回Socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("服务端 socket =" + socket.getClass());
        
        //1.3 通过socket.getInputStream()读取客户端写入到数据通道的数据显示
        InputStream inputStream = socket.getInputStream();
        //1.4. IO读取
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(buf)) != -1) {
            //1.5 根据读取到的实际长度，显示内容.
            System.out.println(new String(buf, 0, len));
        }
        //1.6 获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, client".getBytes());
        //1.7 设置结束标记
        socket.shutdownOutput();

        //1.8 关闭流和socket
        outputStream.close();
        inputStream.close();
        socket.close();
        //1.9 关闭
        serverSocket.close();
    }
}
```

客户端【`SocketClientDemo01`】

```java
package cn.socket.demo02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketClientDemo01 {
    public static void main(String[] args) throws Exception{
        
        //1.1、连接服务端(ip,端口)连接本机的8888端口, 如果连接成功，返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println("客户端 socket返回=" + socket.getClass());
        
        //1.2 连接上后生成Socket,通过socket.getOutputStream(),得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //1.3 通过输出流，写入数据到 数据通道
        outputStream.write("hello, server".getBytes());
        
        //1.4 设置结束标记
        socket.shutdownOutput();
        //1.5 获取和socket关联的输入流,读取数据(字节)，并显示
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, len));
        }
        //1.6 关闭流对象和socket, 必须关闭
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端退出.....");
    }
}
```

3、执行结果，先运行服务端，再执行客户端。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211030100000.png" style="zoom:80%;" />	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211030100039.png" style="zoom:80%;" />	

#### 16.4.5 应用案例3【字符流实现】

1、思路分析

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211030105354.png" style="zoom:67%;" />	

- 编写一个服务端，和一个客户端，服务端在8888端口监听。
- 客户端连接到服务端，发送=="hello, server"==，并接收服务端回发的=="hello,client"==再退出。
- 服务端接收到客户端发送的信息输出，井发送=="hello, client"==再退出。

2、代码示例

服务端【`SocketServerDemo01 `】

```java
package cn.socket.demo03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerDemo01 {
    public static void main(String[] args) throws IOException {
        /**
         * 1.1 在本机的8888端口监听,等待连接。
         * 细节: 要求在本机没有其它服务在监听8888
         * 细节：这个ServerSocket可以通过accept()返回多个Socket[多个客户端连接服务器的并发]
         */
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在8888端口监听，等待连接..");

        /**
         * 1.2 当没有客户端连接8888端口时，程序会阻塞等待连接
         * 如果有客户端连接，则会返回Socket对象，程序继续
         */
        Socket socket = serverSocket.accept();
        System.out.println("服务端socket:" + socket.getClass());

        //1.3 通过socket.getInputStream()读取客户端写入到数据通道的数据显示
        InputStream inputStream = socket.getInputStream();

        // 1.4 IO读取使用字符流,使用 InputStreamReader将inputStream转成字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        // 1.5 输出
        System.out.println(s);

        // 1.6 获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        //1.7 使用字符输出流的方式回复信息
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("helloClient,字符流");
        //1.8 插入一个换行符，表示回复内容的结束
        bufferedWriter.newLine();
        //1.9 注意需要手动的flush
        bufferedWriter.flush();

        //1.10 关闭流和socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        // 1.11 关闭
        serverSocket.close();
    }
}
```

客户端【`SocketClientDemo01`】

```java
package cn.socket.demo03;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class SocketClientDemo01 {
    public static void main(String[] args) throws IOException {
        /**
         * 1.1 连接服务端(ip,端口)连接本机的8888端口,如果连接成功，返回Socket对象
         */
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println("客户端socket返回=" + socket.getClass());

        //1.2 连接上后生成Socket,通过socket.getOutputStream()得到socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //1.3 通过输出流，写入数据到 数据通道, 使用字符流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("helloServer,字符流");
        //1.4 插入一个换行符，表示写入的内容结束, 注意，要求对方使用readLine()!!!!
        bufferedWriter.newLine();
        //1.5 如果使用的字符流，需要手动刷新，否则数据不会写入数据通道
        bufferedWriter.flush();

        //1.6 获取和socket关联的输入流读取数据(字符)并显示
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
        //1.7 关闭流对象和socket, 必须关闭
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端退出.....");
    }
}
```

3、执行结果，先运行服务端，再执行客户端。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211030123546.png" style="zoom:80%;" />	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211030123628.png" style="zoom:80%;" />	

#### 16.4.6 上传文件

1、思路分析

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211030170626.png" style="zoom:80%;" />	

- 编写一个服务端，和一个客户端，服务器端在==8888==端口监听。
- 客户端连接到服务端，发送一张图片`E:\\timg.jpg`
- 服务器端接收到客户端发送的图片，保存到`src`下，发送=="收到图片"==再退出。
- 客户端接收到服务端发送的=="收到图片"==，再退出。
- 该程序要求使用`StreamUtils.java`, 然后直接使用

2、代码实现

`StreamUtils`类

```java
package cn.upload.demo01;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamUtils {
    /**
     * 功能：将输入流转换成byte[]
     * @param is
     * @return
     * @throws Exception
     */
    public static byte[] streamToByteArray(InputStream is) throws Exception{
        //1.1 创建输出流对象
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] b = new byte[1024];
        int len;
        while((len=is.read(b))!=-1){
            bos.write(b, 0, len);
        }
        byte[] array = bos.toByteArray();
        bos.close();
        return array;
    }
    /**
     * 功能：将InputStream转换成String
     * @param is
     * @return
     * @throws Exception
     */

    public static String streamToString(InputStream is) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder builder= new StringBuilder();
        String line;
        //1.2 当读取到 null时，就表示结束
        while((line=reader.readLine())!=null){
            builder.append(line+"\r\n");
        }
        return builder.toString();
    }
}
```

`SocketServerDemo01`

```java
package cn.upload.demo01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerDemo01 {
    public static void main(String[] args) throws Exception{
        //1.1 服务端在本机监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("===服务端在8888端口监听===");
        //1.2 等待连接
        Socket socket = serverSocket.accept();
        //1.3 读取客户端发送的数据,通过Socket得到输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //1.4 将得到bytes数组,写入到指定的路径就得到一个文件了
        String destFilePath = "src/timg.jpg";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bos.write(bytes);
        bos.close();

        //1.5 向客户端回复 "收到图片",通过socket 获取到输出流(字符)
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("收到图片");
        //1.6 把内容刷新到数据通道
        writer.flush();
        //1.7 设置写入结束标记
        socket.shutdownOutput();

        //1.8 关闭其他资源
        writer.close();
        bis.close();
        socket.close();
        serverSocket.close();
    }
}
```

`SocketClientDemo01`

```java
package cn.upload.demo01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketClientDemo01 {
    public static void main(String[] args) throws Exception{
        //1.1 客户端连接服务端8888，得到Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //1.2 创建读取磁盘文件的输入流
        String filePath = "E:\\timg.jpg";
        BufferedInputStream bis  = new BufferedInputStream(new FileInputStream(filePath));

        //1.3 bytes就是filePath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //1.4 通过socket获取到输出流, 将bytes数据发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        //1.5 将文件对应的字节数组的内容，写入到数据通道
        bos.write(bytes);
        bis.close();
        //1.6 设置写入数据的结束标记
        socket.shutdownOutput();

        // 1.7 接收从服务端回复的消息
        InputStream inputStream = socket.getInputStream();
        //1.8 使用StreamUtils的方法,直接将inputStream读取到的内容转成字符串
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);

        //1.9 关闭相关的流
        inputStream.close();
        bos.close();
        socket.close();
    }
}
```

3、执行结果，先运行服务端，再执行客户端。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211030204727.png" style="zoom:80%;" />	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211030204758.png" style="zoom:80%;" />	

#### 16.4.7 netstat 指令

1、`netstat -an`可以查看当前主机网络情况，包括端口监听情况和网络连接情况。

2、`netstat -an| more` 可以分页显示，要求在`dos`控制台下执行`win+r`。

- `Listening`表示某个端口在监听。
- 如果有一个外部程序(客户端)连接到该端口，就会显示一条连接信息。
- 可以输入`ctrl + C`退出指令。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211030214906.png" style="zoom:80%;" />	

3、注意点

当客户端连接到服务端后，实际上客户端也是通过一个端口和服务端进行通讯的，这个端口是`TCP/IP`来分配的是不确定的， ==是随机的==。

### 16.5 UDP 网络通信编程

#### 16.5.1 基本介绍

1、类`DatagramSocket`和`DatagramPacket`==[数据包/数据报]==实现了基于`UDP`协议网络程序。

2、`UDP`数据报通过数据报套接字`DatagramSocket`发送和接收，系统不保证`UDP`数据报一定能够安全送到目的地，也不能确定什么时候可以抵达。

3、`DatagramPacket`对象封装了`UDP`数据报，在数据报中包含了发送端的`IP`地址和端口号以及接收端的`IP`地址和端口号。

4、`UDP`协议中每个数据报都给出了完整的地址信息，因此无须建立发送方和接收方的连接。

#### 16.5.2 基本流程

1、核心的两个类/对象`DatagramSocket`与`DatagramPacket`。

2、建立发送端，接收端(没有服务端和客户端概念)。

3、发送数据前，建立数据包/报`DatagramPacket`对象。

4、调用`DatagramSocket`的发送、接收方法，关闭`DatagramSocket`。

#### 16.5.3 应用案例

1、思路分析

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211031104008.png" style="zoom: 80%;" />	

- 编写一个接收端`A`,和一个发送端`B`，接收端A在9999端口等待接收数据`(receive)`。
- 发送端`B`向接收端`A`发送数据`hello，Spring Boot!!!`
- 接收端`A`接收到发送端`B`发送的数据，回复`hello vue.js`，再退出。
- 发送端接收回复的数据，再退出。

2、代码示例

`UDPReceiverA`类

```java
package cn.udp.demo01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReceiverA {
    public static void main(String[] args) throws Exception{
        // 1.1 创建一个 DatagramSocket对象，准备在9999接收数据
        DatagramSocket socket = new DatagramSocket(9999);
        // 1.2构建一个 DatagramPacket对象,一个数据包最大 64k
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        /**
         * 1.3 调用接收方法, 将通过网络传输的DatagramPacket对象,填充到 packet对象.
         * 当有数据包发送到本机的9999端口时，就会接收到数据。
         * 如果没有数据包发送到本机的9999端口, 就会阻塞等待.
         */
        System.out.println("接收端A,等待接收数据..");
        socket.receive(packet);

        //1.4 可以把packet进行拆包取出数据，并显示。
        int length = packet.getLength();//实际接收到的数据字节长度
        byte[] data = packet.getData();//接收到数据
        String s = new String(data, 0, length);
        System.out.println(s);

        //1.5 回复信息给B端，将需要发送的数据，封装到 DatagramPacket对象
        data = "hello，Vue.js".getBytes();

        //1.6 封装的 DatagramPacket对象data内容字节数组,data.length,主机(IP),端口
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.3.9"), 9998);
        //发送
        socket.send(packet);

        //1.7 关闭资源
        socket.close();
        System.out.println("A端退出...");
    }
}
```

`UDPSenderB`类

```java
package cn.udp.demo01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSenderB {
    public static void main(String[] args) throws Exception{
        //1.1 创建 DatagramSocket对象，准备在9998端口接收数据
        DatagramSocket socket = new DatagramSocket(9998);

        //1.2 将需要发送的数据，封装到 DatagramPacket对象
        byte[] data = "hello，Spring Boot".getBytes();

        //1.3 封装的 DatagramPacket对象data内容字节数组,data.length,主机(IP),端口
        DatagramPacket packet =
                new DatagramPacket(data, data.length, InetAddress.getByName("192.168.3.9"), 9999);

        socket.send(packet);

        //1.4 接收从A端回复的信息，构建一个 DatagramPacket对象，准备接收数据
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);

        /**
         * 1.5 调用接收方法,将通过网络传输的DatagramPacket对象填充到 packet对象
         * 有数据包发送到 本机的9998端口时，就会接收到数据。
         * 如果没有数据包发送到 本机的9998端口, 就会阻塞等待.
         */
        socket.receive(packet);

        // 1.6 可以把packet 进行拆包，取出数据，并显示.
        int length = packet.getLength();//实际接收到的数据字节长度
        data = packet.getData();//接收到数据
        String s = new String(data, 0, length);
        System.out.println(s);

        //1.7 关闭资源
        socket.close();
        System.out.println("B端退出");
    }
}
```

3、执行结果，先运行`Receiver`端，再运行`Sender`端

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211031112750.png" style="zoom:80%;" />	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211031112939.png" style="zoom:80%;" />	

### 16.7 经典案例

#### 16.7.1 案例实现一

1、需求分析

- 使用字符流的方式，编写一个客户端程序和服务器端程序。
- 客户端发送`name`,服务器端接收到后，返回我是`nova`，`nova`是你自己的名字。
- 客户端发送`hobby`,服务器端接收到后，返回==编写java程序==。
- 不是这两个问题，回复=="你说啥呢=="

2、代码实现

`ServerDemo01`

```java
package cn.tcp.demo01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端，使用字节流方式读写
 */
public class ServerDemo01 {
    public static void main(String[] args) throws Exception{

        /**
         * 1.1 在本机 的9999端口监听, 等待连接
         * 细节: 要求在本机没有其它服务在监听9999
         * 细节：这个 ServerSocket 可以通过 accept() 返回多个Socket[多个客户端连接服务器的并发]
         */
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接..");

        /**
         * 1.2 当没有客户端连接9999端口时程序会阻塞,等待连接.
         * 如果有客户端连接，则会返回Socket对象，程序继续。
         */
        Socket socket = serverSocket.accept();

        //1.3 通过socket.getInputStream()读取客户端写入到数据通道的数据显示
        InputStream inputStream = socket.getInputStream();
        //1.4. IO读取使用字符流,使用 InputStreamReader将inputStream转成字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String str = bufferedReader.readLine();
        String answer = "";
        if ("name".equals(str)) {
            answer = "我是curry小学生！！！";
        } else if("hobby".equals(str)) {
            answer = "热爱打篮球，嘿嘿";
        } else {
            answer = "你输入错误！！！";
        }

        //1.5 获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        //1.6 使用字符输出流的方式回复信息
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write(answer);
        //1.7 插入一个换行符，表示回复内容的结束
        bufferedWriter.newLine();
        //1.8 注意需要手动的flush
        bufferedWriter.flush();

        //1.9 关闭流和socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
```

`ClientDemo01`

```java
package cn.tcp.demo01;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端，发送信息给服务端，使用字符流
 */
public class ClientDemo01 {
    public static void main(String[] args) throws Exception{
        // 1.1 连接服务端(ip,端口）连接本机的 9999端口, 如果连接成功，返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        //1.2 连接上后生成Socket,通过socket.getOutputStream(),得到socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        // 1.3 通过输出流写入数据到数据通道,使用字符流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        //1.4 从键盘读取用户的问题
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String question = scanner.next();
        bufferedWriter.write(question);

        //1.5 插入一个换行符，表示写入的内容结束,要求对方使用readLine()!!!!
        bufferedWriter.newLine();
        //1.6 如果使用的字符流，需要手动刷新，否则数据不会写入数据通道
        bufferedWriter.flush();

        //1.7 获取和socket关联的输入流,读取数据(字符)并显示
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        //1.8 关闭流对象和socket, 必须关闭
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端退出.....");
    }
}
```

3、执行结果，先运行服务端，再执行客户端

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211031224405.png" style="zoom:80%;" />	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211031224443.png" style="zoom:80%;" />	

#### 16.7.2 案例实现二

1、需求分析

- 编写一个接收端`A`，和一个发送端`B`，使用`UDP`协议完成。
- 接收端在`8888`端口等待接收数据`(receive)`。
- 发送端向接收端发送数据==计算机经典书籍==
- 接收端接收到发送端发送的问题后，==返回“计算机经典书籍:《Java入门到放弃》”==，否则返回`what?`
- 接收端和发送端程序退出。

2、代码示例

`UDPReceiverA`类

```java
package cn.udp.demo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1.1创建一个 DatagramSocket对象，准备在8888接收数据
        DatagramSocket socket = new DatagramSocket(8888);
        //1.2 构建一个DatagramPacket对象，准备接收数据
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        //1.3 调用接收方法,将通过网络传输的DatagramPacket对象填充到packet对象
        System.out.println("接收端 等待接收问题 ");
        socket.receive(packet);
        //1.4.可以把packet进行拆包取出数据并显示
        int length = packet.getLength();//实际接收到的数据字节长度
        byte[] data = packet.getData();//接收到数据
        String s = new String(data, 0, length);

        //1.5 判断接收到的信息是什么
        String answer = "";
        if("计算机经典书籍".equals(s)) {
            answer = "计算机经典书籍 <<Java从入门到放弃>> <<操作系统>> <<计算机组成原理>> <<明解C语言>>";
        } else {
            answer = "你输入的是啥？";
        }

        //1.6 回复信息给B端，将需要发送的数据，封装到DatagramPacket对象。
        data = answer.getBytes();
        // 1.7 封装的DatagramPacket对象data内容字节数组
        packet =
                new DatagramPacket(data, data.length, InetAddress.getByName("192.168.3.9"), 9998);
        //1.8 发送
        socket.send(packet);
        //1.9 关闭资源
        socket.close();
        System.out.println("A端退出...");
    }
}
```

`UDPSenderB`类

```java
package cn.udp.demo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //1.1创建DatagramSocket对象，准备在9998端口接收数据
        DatagramSocket socket = new DatagramSocket(9998);
        //1.2 将需要发送的数据，封装到 DatagramPacket对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题: ");
        String question = scanner.next();
        byte[] data = question.getBytes();

        //1.3 封装的DatagramPacket对象data内容字节数组
        DatagramPacket packet =
                new DatagramPacket(data, data.length, InetAddress.getByName("192.168.3.9"), 8888);

        socket.send(packet);

        // 1.4 接收从A端回复的信息,构建一个DatagramPacket对象，准备接收数据
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);

        /**
         * 1.5 调用 接收方法, 将通过网络传输的 DatagramPacket 对象，填充到 packet对象
         * 当有数据包发送到 本机的9998端口时，就会接收到数据。
         * 如果没有数据包发送到 本机的9998端口, 就会阻塞等待。
         */
        socket.receive(packet);

        //1.6 可以把packet 进行拆包，取出数据，并显示.
        int length = packet.getLength();//实际接收到的数据字节长度
        data = packet.getData();//接收到数据
        String s = new String(data, 0, length);
        System.out.println(s);

        //1.7 关闭资源
        socket.close();
        System.out.println("B端退出");
    }
}
```

3、执行结果，先运行`Receiver`端，再运行`Sender`端

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211101100524.png)	

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211101100750.png)	

#### 16.7.3 案例实现三

1、思路分析

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211101130441.png" style="zoom: 80%;" />	

- 编写客户端程序和服务器端程序
- 客户端可以输入一个音乐文件名，比如《光辉岁月》,服务端收到音乐名后，可以给客户端返回这个音乐文件，如果服务器没有这个文件，返回一个默认的音乐即可。
- 客户端收到文件后，保存到本地`E:\\workspace\\Java\\`，提示:该程序可以使用`StreamUtils.java`
- ==本质:其实就是指定下载文件的应用==。

2、代码示例

`StreamUtils`工具类

```java
package cn.tcp.demo02;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
/**
 * 此类用于演示关于流的读写方法
 *
 */
public class StreamUtils {
    /**
     * 功能：将输入流转换成byte[]
     * @param is
     * @return
     * @throws Exception
     */
    public static byte[] streamToByteArray(InputStream is) throws Exception{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();//创建输出流对象
        byte[] b = new byte[1024];
        int len;
        while((len=is.read(b))!=-1){
            bos.write(b, 0, len);
        }
        byte[] array = bos.toByteArray();
        bos.close();
        return array;
    }
    /**
     * 功能：将InputStream转换成String
     * @param is
     * @return
     * @throws Exception
     */

    public static String streamToString(InputStream is) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder builder= new StringBuilder();
        String line;
        while((line=reader.readLine())!=null){
            builder.append(line+"\r\n");
        }
        return builder.toString();
    }
}
```

`ServerDemo01`类

```java
package cn.tcp.demo02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo01 {
    public static void main(String[] args) throws Exception {
        //1.1 监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        //1.2 等待客户端连接
        System.out.println("服务端，在9999端口监听，等待下载文件");
        Socket socket = serverSocket.accept();
        //1.3 读取客户端发送要下载的文件名
        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        String downLoadFileName = "";
        while ((len = inputStream.read(b)) != -1) {
            downLoadFileName += new String(b, 0 , len);
        }
        System.out.println("客户端希望下载文件名=" + downLoadFileName);

        //1.4 判断客户端下载文件
        String resFileName = "";
        if("高山流水".equals(downLoadFileName)) {
            resFileName = "src/光辉岁月.mp3";
        } else {
            resFileName = "src/匿名歌手.mp3";
        }

        //1.5 创建一个输入流，读取文件
        BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream(resFileName));

        //1.6 使用工具类StreamUtils，读取文件到一个字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //1.7 得到Socket关联的输出流
        BufferedOutputStream bos =
                new BufferedOutputStream(socket.getOutputStream());
        //1.8 写入到数据通道，返回给客户端
        bos.write(bytes);
        socket.shutdownOutput();

        //1.9 关闭相关的资源
        bis.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出...");
    }
}
```

`ClientDemo01`类

```java
package cn.tcp.demo02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo01 {
    public static void main(String[] args) throws Exception {
        //1.1 接收用户输入，指定下载文件名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入下载文件名");
        String downloadFileName = scanner.next();

        //1.2 客户端连接服务端，准备发送
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //1.3 获取和Socket关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downloadFileName.getBytes());
        //1.4 设置写入结束的标志
        socket.shutdownOutput();

        //1.5 读取服务端返回的文件(字节数据)
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //1.6 得到一个输出流，准备将bytes写入到磁盘文件
        String filePath = "E:\\workspace\\Java\\" + downloadFileName + ".mp3";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);

        //1.7 关闭相关的资源
        bos.close();
        bis.close();
        outputStream.close();
        socket.close();

        System.out.println("客户端下载完毕，正确退出..");
    }
}
```

3、执行结果，先运行服务端，再执行客户端。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211101121759.png" style="zoom:80%;" />	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211101122716.png" style="zoom:80%;" />	

## 第17章 反射reflection

### 17.1 静态语言 OR 动态语言

> 1、静态语言

- ==运行时结构不可变的语言就是静态语言==，如`Java`、`C`、`C++`。
- `Java`不是动态语言，但是`Java`有一定的动态性，可以利用反射机制获得类似动态语言的特性。

> 2、动态语言

主要动态语言：`C#、JavaScript、Vue、Python`。

在运行时可以改变其结构的语言，就是在运行时代码可以根据某些条件改变自身结构。

```javascript
// js代码
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>arguments使用</title>
</head>
<body>
    <script>
        // 利用函数求任意个数的最大值
        function getMax() {
            // 定义最大值
            var max = arguments[0];
            for (var i = 1; i < arguments.length; i++) {
                if (arguments[i] > max) {
                    max = arguments[i];
                }
            }
            return max;
        }
        
        // 输出结果
        console.log(getMax(1, 2, 3));
        console.log(getMax(1, 2, 3, 4, 5));
        console.log(getMax(11, 2, 34, 444, 5, 100));
    </script>
</body>
</html>
```

### 17.2 反射机制

#### 17.2.1 反射机制的引出

1、需求引出反射

根据配置文件`stu.properties`指定信息，创建`Student`对象并调用方法`study()`

```properties
classfullpath=cn.guardwhy.Student
method=study
```

> 创建`Student`类

```java
package cn.reflection.demo01;

public class Student {
    private String name = "curry";
    public int age = 10;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    // 1.1 常用方法
    public void study(){
        System.out.println(name + "在认真的学习java");
    }
}
```

> 测试类：`ReflectionTest01`

```java
package cn.reflection.demo01;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;
@SuppressWarnings({"all"})
public class ReflectionTest01 {
    public static void main(String[] args) throws Exception{
        //1.1 使用Properties 类, 可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/stu.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        System.out.println("classfullpath=" + classfullpath);//cn.reflection.demo01.Student
        System.out.println("method=" + methodName); // study

        System.out.println("+++++++++++++++");

        //1.2 创建对象 , 传统的方法，行不通 =》 反射机制
        //new classfullpath();

        // 1.3 使用反射机制解决
        //加载类, 返回Class类型的对象c
        Class c = Class.forName(classfullpath);
        // 通过c得到你加载的类cn.的对象实例
        Object obj = c.newInstance();
        System.out.println("obj的运行类型:"+obj.getClass()); //运行类型

        /**
         * 通过 c 得到你加载的类 com.reflection.demo01.Student的methodName"study()"的方法对象
         * 即：在反射中，可以把方法视为对象【万物皆对象】
         */
        Method method1 = c.getMethod(methodName);
        // 即通过方法对象来实现调用方法
        // 通过method1调用方法: 即通过方法对象来实现调用方法
        method1.invoke(obj);
    }
}
```

> 执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211101154024.png" style="zoom:80%;" />	

2、`Java`程序计算机有三个阶段

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211101165825.png" style="zoom:67%;" />	

#### 17.2.2 基本概念

1、反射机制允许程序在执行期借助于`Reflection API`取得任何类的内部信息，并能直接操作任意对象的内部属性及方法。

```css
Class c = Class.forName("类的权限名")
```

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210304003110.png" style="zoom:80%;" />

==加载完类之后，在堆内存的方法区中就产生了一个Class类型的对象（一个类只有一个Class对象），这个对象就包含了完整的类的结构信息==。可以通过这个对象看到类的结构。这个对象就像一面镜子，通过镜子看到类的结构，所以形象的称之为：**反射**

2、反射的基本特点

- 反射是`Java`的高级技术，是`Java`独有的技术。==反射的核心思想和关键就是得到编译以后的class文件对象==。

- 反射是工作在运行时的技术，因为只有运行之后才会有`class`类对象。


3、代码示例

> `User`实体类

```java
package cn.guardwhy.reflection01;
// 实体类
class User {
    // 成员属性
    private int id;
    private int age;
    private String name;
    // 无参构造器
    public User() {

    }
    // 带参构造
    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

```

> `Test1`类

反射技术实现

```java
package cn.guardwhy.reflection01;
// 反射
public class Test1 extends Object{
    public static void main(String[] args) throws Exception {
        // 1.通过反射获取类的Class对象
        Class c1 = Class.forName("cn.guardwhy.reflection01.User");

        System.out.println("c1的Class对象:" + c1); // c1的Class对象:class cn.guardwhy.reflection01.User

        Class c2 = Class.forName("cn.guardwhy.reflection01.User");
        System.out.println("c2的Class对象:" + c2); // c2的Class对象:class cn.guardwhy.reflection01.User

        //一个类被加载后,类的整个结构信息会被放到对应的Class对象中
        // 一个类只对应一个Class对象
        System.out.println("c1:" + c1.hashCode());  // c1:1735600054
        System.out.println("c2:" + c2.hashCode());  // c2:1735600054
    }
}
```

#### 17.2.3 反射相关类

1、反射具体作用

- 在运行时判断任意一个对象所属的类，在运行时构造任意一个类的对象
- 在运行时得到任意一个类所具有的成员变量和方法
- 在运行时调用任意一个对象的成员变量和方法，生成动态代理。

2、主要类

| 相关类                          | 具体作用                                            |
| ------------------------------- | --------------------------------------------------- |
| `java.lang.Class`               | 代表一个类，`Class`对象表示某个类加载后在堆中的对象 |
| `java.lang.reflect.Method`      | 代表类的方法, `Method`对象表示某个类的方法          |
| `java.lang.reflect.Field`       | 代表类的成员变量, `Field`对象表示某个类的成员变量   |
| `java.lang.reflect.Constructor` | 代表类的构造方法,`Constructor`对象表示构造器        |

3、代码实现

```java
package cn.reflection.demo01;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;
@SuppressWarnings({"all"})
public class ReflectionTest01 {
    public static void main(String[] args) throws Exception{
        //1.1 使用Properties 类, 可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/stu.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        System.out.println("classfullpath=" + classfullpath);//cn.reflection.demo01.Student
        System.out.println("method=" + methodName); // study

        System.out.println("+++++++++++++++");

        //1.2 创建对象 , 传统的方法，行不通 =》 反射机制
        //new classfullpath();

        // 1.3 使用反射机制解决
        //加载类, 返回Class类型的对象c
        Class c = Class.forName(classfullpath);
        // 通过c得到你加载的类cn.的对象实例
        Object obj = c.newInstance();
        System.out.println("obj的运行类型:"+obj.getClass()); //运行类型

        /**
         * 通过 c 得到你加载的类 com.reflection.demo01.Student的methodName"study()"的方法对象
         * 即：在反射中，可以把方法视为对象【万物皆对象】
         */
        Method method1 = c.getMethod(methodName);
        // 即通过方法对象来实现调用方法
        // 通过method1调用方法: 即通过方法对象来实现调用方法
        method1.invoke(obj);

        System.out.println("=================");
        
        /**
         * java.lang.reflect.Field: 代表类的成员变量, Field对象表示某个类的成员变量
         * 得到name字段,getField不能得到私有的属性
         */
        Field nameField = c.getField("age"); 
        System.out.println(nameField.get(obj)); // 传统写法:对象.成员变量, 反射:成员变量对象.get(对象)

        //java.lang.reflect.Constructor: 代表类的构造方法, Constructor对象表示构造器
        Constructor constructor = c.getConstructor(); //()中可以指定构造器参数类型, 返回无参构造器
        System.out.println(constructor);// public cn.reflection.demo01.Student()
        
        Constructor constructor2 = c.getConstructor(String.class); //这里传入的 String.class就是String类的Class对象
        System.out.println(constructor2);// public cn.reflection.demo01.Student(java.lang.String)
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211101200855.png" style="zoom:80%;" />	

#### 17.2.4 反射优缺点和性能优化

1、反射优缺点

- 优点:可以动态的创建和使用对象(也是框架底层核心)，使用灵活，没有反射机制，框架技术就失去底层支撑。
- 缺点:使用反射基本是解释执行，对执行速度有影响。

```java
package cn.reflection.demo01;

import java.lang.reflect.Method;

@SuppressWarnings({"all"})
public class ReflectionTest02 {
    public static void main(String[] args) throws Exception {
        //1.1 调用方法
        method01();
        method02();
    }

    //1.2 传统方法来调用eat()方法
    public static void method01() {
        // 创建stu对象
        Student stu = new Student();
        // 起始时间
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            stu.eat();
        }
        // 终止时间
        long end = System.currentTimeMillis();
        System.out.println("method01()耗时:" + (end - start));
    }

    //反射机制调用eat()方法
    public static void method02() throws Exception{
        // 类去加载class文件对象,通过类的全限名找到
        Class cls = Class.forName("cn.reflection.demo01.Student");
        Object obj = cls.newInstance();
        Method eat = cls.getMethod("eat");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            eat.invoke(obj);//反射调用方法
        }
        long end = System.currentTimeMillis();
        System.out.println("method02()耗时:" + (end - start));
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102055458.png" style="zoom:80%;" />	

2、反射调用优化

- `Method`和`Field`、` Constructor`对象都有`setAccessible()`方法 。
- `setAccessible`==作用是启动和禁用访问安全检查的开关==。
- 参数值为`true`表示反射的对象在使用时取消访问检查，提高反射的效率，参数值为`false`则表示反射的对象执行访问检查。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102060515.png" style="zoom: 67%;" />	

```java
package cn.reflection.demo01;

import java.lang.reflect.Method;

@SuppressWarnings({"all"})
public class ReflectionTest02 {
    public static void main(String[] args) throws Exception {
        //1.1 调用方法
        System.out.print("传统方法:");
        method01();
        System.out.print("反射实现:");
        method02();
        System.out.print("反射调用优化:");
        method03();
    }

    //1.2 传统方法来调用eat()方法
    public static void method01() {
        // 创建stu对象
        Student stu = new Student();
        // 起始时间
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            stu.eat();
        }
        // 终止时间
        long end = System.currentTimeMillis();
        System.out.println("耗时 " + (end - start) + "s");
    }

    //反射机制调用eat()方法
    public static void method02() throws Exception{
        // 类去加载class文件对象,通过类的全限名找到
        Class cls = Class.forName("cn.reflection.demo01.Student");
        Object obj = cls.newInstance();
        Method eat = cls.getMethod("eat");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            eat.invoke(obj);//反射调用方法
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时 " + (end - start) + "s");
    }

    //反射调用优化 + 关闭访问检查
    public static void method03() throws Exception{
        // 类去加载class文件对象,通过类的全限名找到
        Class cls = Class.forName("cn.reflection.demo01.Student");
        Object obj = cls.newInstance();
        Method eat = cls.getMethod("eat");
        //在反射调用方法时，取消访问检查
        eat.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            //反射调用方法
            eat.invoke(obj);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时 " + (end - start) + "s");
    }
}
```

执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102082612.png)

### 17.3 Class类



#### 17.3.1 基本介绍

1、Class相关图解

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102102249.png" style="zoom: 67%;" />	

2、`Class`基本特点

- `Class`也是类，因此也继承`Object`类。
- `Class`类对象不是`new`出来的，而是系统创建的。
- 对于某个类的`Class`类对象，在内存中只有一份，因为类只加载一次。
- 每个类的实例都会记得自己是由哪个`Class`实例所生成。
- 通过`Class`对象可以完整地得到一个类的完整结构， 通过一系列`API`。
- ==Class对象是存放在堆的，类的字节码二进制数据，是放在方法区的==，有的地方称为类的元数据【包括 方法代码，变量名，方法名，访问权限】

#### 17.3.2 源码分析

1、在`Object`类中定义了以下的方法，此方法将被所有子类继承，`Object`类是Java反射的源头，可以通过对象反射求出类的名称。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210304112407.png" style="zoom:80%;" />

2、代码示例

`Person`类

```java
package cn.reflection.demo02;

public class Person {
    public String username = "侯大力";
    public int age = 26;
    public String address = "北京";

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
```

3、传统方式创建对象

创建`p1`对象，在程序中打上断点，直接进入方法体。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102104300.png" style="zoom:67%;" />	

执行操作【==Alt + Shift + F7==】，直接进入`loadClass`类。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102105404.png)

4、反射方式创建对象

创建`p2`对象，在程序中打上断点，直接进入方法体。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102110002.png" style="zoom:67%;" />	

执行操作【==Alt + Shift + F7==】

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102110343.png)

继续继续执行`F8`

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102110540.png)

继续执行操作【==Alt + Shift + F7==】

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102111022.png)

继续继续执行`F8`

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102111213.png)

执行操作【==Alt + Shift + F7==】，直接进入`loadClass`类。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102111339.png)

#### 17.3.3 Class类注意点

- `Class` 本身也是一个类，`Class `对象只能由系统建立对象。
- 一个加载的类在 `JVM` 中只会有一个`Class`实例，一个`Class`对象对应的是一个加载到JVM中的一个`.class`文件。
- 每个类的实例都会记得自己是由哪个 `Class` 实例所生成，通过`Class`可以完整地得到一个类中的所有被加载的结构。
- `Class`类是`Reflection`的根源，针对任何你想动态加载、运行的类，唯有先获得相应的`Class`对象。

#### 17.3.4 Class类的常用方法

1、常用方法

| 方法名                                    | 方法作用                                                     |
| ----------------------------------------- | ------------------------------------------------------------ |
| `static ClassforName(String name)`        | 返回指定类名`name`的`Class`对象                              |
| `Object newInstance()`                    | 调用缺省构造函数，返回`Class`对象的一个实例                  |
| `getName()`                               | 返回此`Class`对象所表示的实体（类，接口，数组类或 `void`）的名称。 |
| `Class getSuperClass()`                   | 返回当前`Class`对象的父类的`Class`对象。                     |
| `Class[] getinterfaces()`                 | 获取当前`Class`对象的接口。                                  |
| `ClassLoader getClassLoader()`            | 返回该类的类加载器。                                         |
| `Constructor[] getConstructors()`         | 返回一个包含某些`Constructor`对象的数组。                    |
| `Method getMothed(String name,Class.. T)` | 返回一个`Method`对象，此对象的形参类型为`paramType`。        |
| `Field[] getDeclaredFields()`             | 返回`Field`对象的一个数组。                                  |

2、代码示例

```java
package cn.reflection.demo02;

import java.lang.reflect.Field;

public class ClassDemo02 {
    public static void main(String[] args) throws Exception{
        // 1.1 定义地址
        String classAllPath = "cn.reflection.demo02.Person";
        //1.2 获取到Person类 对应的 Class对象，<?>表示不确定的Java类型
        Class<?> cls = Class.forName(classAllPath);

        // 1.3 显示cls对象,是哪个类的Class对象 class cn.reflection.demo02.Person
        System.out.println(cls);
        // 1.4 输出cls运行类型 java.lang.Class
        System.out.println(cls.getClass());

        //1.5 得到包名
        System.out.println(cls.getPackage().getName());
        //1.6 得到全类名
        System.out.println(cls.getName());

        //1.7 通过cls创建对象实例
        Person Person = (Person) cls.newInstance();
        System.out.println(Person);//Person.toString()
        //1.8 通过反射获取属性
        Field username = cls.getField("username");
        System.out.println(username.get(Person));
        //1.9 通过反射给属性赋值
        username.set(Person, "curry");
        System.out.println(username.get(Person));
        //2.0 可以得到所有的属性(字段)
        System.out.println("=======所有的字段属性====");
        Field[] fields = cls.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102151439.png" style="zoom:67%;" />	

#### 17.3.5 获取Class类对象

1、基本概念

- 已知类的全类名，且该类在类路径下，可通过`Class`类的静态方法`forName()`获取，可能抛出`ClassNotFoundException`。

```java
Class c2 = Class.forName("cn.guardwhy.reflection01.Student");
```

- 已知具体的类，通过类的class属性获取，该方法最为安全可靠，程序性能最高。

```java
Class c3 = Student.class;
```

- 已知类的实例，调用该实例的getClass()方法获取Class对象。

```java
Class c1 = person.getClass();
```

- 内置基本数据类型可以直接用类名`.Type`

```java
 Class c4 = Integer.TYPE;
```

- 其他方式

```java
ClassLoader cl =对象.getClass().getClassLoader();
Class clazz4 = cl.loadClass( "类的全类名”);
```

- 基本数据`(int, char,boolean,float,double,byte,long,short) `，按如下方式得到`Class`类对象

```java
Class cls =基本数据类型.class
```

2、代码示例

```java
package cn.reflection.demo02;

@SuppressWarnings({"all"})
public class GetClassDemo03 {
    public static void main(String[] args) throws Exception{
        //1.1 Class.forName,通过读取配置文件获取
        String classAllPath = "cn.reflection.demo02.Person";
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);

        //1.2 类名.class应用场景: 用于参数传递
        Class cls2 = Person.class;
        System.out.println(cls2);

        //1.3对象.getClass()应用场景：有对象实例
        Person Person = new Person();
        Class cls3 = Person.getClass();
        System.out.println(cls3);

        //1.4 通过类加载器【4种】来获取到类的Class对象
        //(1)先得到类加载器 Person
        ClassLoader classLoader = Person.getClass().getClassLoader();
        //(2)通过类加载器得到Class对象
        Class cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        //1.5 cls1 , cls2 , cls3 , cls4 其实是同一个对象
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());

        //1.6 基本数据(int, char,boolean,float,double,byte,long,short) 按如下方式得到Class类对象
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);

        //1.7 基本数据类型对应的包装类，可以通过 .TYPE 得到Class类对象
        Class<Integer> type1 = Integer.TYPE;
        //其它包装类BOOLEAN, DOUBLE, LONG,BYTE等待
        Class<Character> type2 = Character.TYPE;
        System.out.println(type1);

        System.out.println(integerClass.hashCode());// 1766822961
        System.out.println(type1.hashCode());// 1766822961
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102154638.png" style="zoom: 67%;" />	

#### 17.3.6 Class对象类型

1、基本概念

- `class`：外部类，成员(成员内部类，静态内部类)，局部内部类，匿名内部类。
- `interface`：接口
- `[]`：数组
- `enum`：枚举
- `annotation`：注解@interface
- `primitive type`：基本数据类型
- `void`

2、代码示例

```java
package cn.guardwhy.reflection01;

import java.lang.annotation.ElementType;

/*
所有类型的Class
*/
public class ReflectTest03 {
    public static void main(String[] args) {
        Class c1 = Object.class; // 类对象
        Class c2 = Comparable.class; // 接口
        Class c3 = String[].class; // 一维数组
        Class c4 = int[][].class; // 二维数组
        Class c5 = Override.class; // 注解
        Class c6 = ElementType.class; // 枚举
        Class c7 = Integer.class; // 基本数据类型
        Class c8 = void.class; // void
        Class c9 = Class.class; // Class

        System.out.println(c1); // class java.lang.Object
        System.out.println(c2); // interface java.lang.Comparable
        System.out.println(c3); // class [Ljava.lang.String;
        System.out.println(c4); // class [[I
        System.out.println(c5); // interface java.lang.Override
        System.out.println(c6); // class java.lang.annotation.ElementType
        System.out.println(c7); // class java.lang.Integer
        System.out.println(c8); // void
        System.out.println(c9); // class java.lang.Class

        // 只要元素类型与维度是一样的，就是同一个Class
        int[] a1 = new int[10];
        int[] a2 = new int[100];
        System.out.println(a1.getClass().hashCode());   // 1735600054
        System.out.println(a2.getClass().hashCode());   // 1735600054
    }
}
```

### 17.4 类加载

#### 17.4.1 基本说明

1、基本概念

==反射机制是java实现动态语言的关键，也就是通过反射实现类动态加载==。

- **静态加载**:编译时加载相关的类，如果没有则报错，依赖性太强。
- **动态加载**:运行时加载需要的类，如果运行时不用该类，即使不存在该类，则不报错，降低了依赖性。

2、代码示例

```java
package cn.reflection.demo03;

import java.lang.reflect.Method;
import java.util.Scanner;

// 创建类
class Dog{
    public void cry(){
        System.out.println("小狗汪汪叫！！！");
    }
}
class Cat{
    public void eat(){
        System.out.println("小猫在吃鱼....");
    }
}

/**
 * 因为new Dog()静态加载，因此必须编写Dog
 * Person类是动态加载，所以，没有编写Person类也不会报错，只有当动态加载该类时，才会报错！！！
 */
public class ClassLoadDemo01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入key:");
        String key = scanner.next();
        // 开始选择
        switch (key){
            case "1":
                Dog dog = new Dog(); // 静态加载
                dog.cry();
                break;
            case "2":
                Class<?> cls = Class.forName("cn.reflection.demo03.Cat"); // 加载Cat类【动态加载】
                Object obj = cls.newInstance();
                Method method = cls.getMethod("eat");
                method.invoke(obj);
                System.out.println("ok");
                break;
            default:
                System.out.println("啥事也没干。。。。。");
        }
    }
}
```

3、类加载时机

```java
1.当创建对象时(new) //静态加载

2.当子类被加载时，父类也加载//静态加载

3.调用类中的静态成员时//静态加载

4.通过反射//动态加载Class.forName(" com.test.Cat");
```

#### 17.4.2 内存分析图

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210304185000.png" style="zoom:80%;" />

#### 17.4.3  类加载过程图

==当程序主动使用某个类时，如果该类还未被加载到内存中，则系统会通过以下步骤对该类进行初始化==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102200527.png" style="zoom: 67%;" />	

#### 17.4.4 类加载器ClassLoader

> **1、加载阶段**：

`JVM`在该阶段的主要目的是将字节码从不同的数据源(可能是`class`文件、也可能是`jar`包，甚至网络)==转化为进制字节流加载到内存中==，并生成一个代表该类的`java.lang.Class`对象。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102204759.png" style="zoom:67%;" />	

> **2、连接阶段-验证**

- 目的是为了确保`Class`文件的字节流中包含的信息符合当前虚拟机的要求，并且不会危害虚拟机自身的安全。
- 包括:文件格式验证(是否以魔数`oxcafebabe`开头)、元数据验证、字节码验证和符号引用验证。
- 可以考虑使用`-Xverify:none` 参数来关闭大部分的类验证措施，缩短虚拟机类加载的时间。

> **3、连接阶段-准备**

- 将`Java`类的二进制代码合并到`JVM`的运行状态之中的过程。
- `JVM`会在该阶段对静态变量，分配内存并默认初始化(对应数据类型的默认初始值，如`0、OL、 null、 false`等)。这些变量所使用的内存都将在方法区中进行分配。

```java
package cn.reflection.demo03;
/**
 * 属性-成员变量-字段
 */
class A {
    //1.1 n1是实例属性,不是静态变量因此在准备阶段,是不会分配内存
    public int n1 = 10;
    //1.2 n2是静态变量，分配内存n2是默认初始化0,而不是20
    public static  int n2 = 20;
    //1.3. n3是static final是常量, 它和静态变量不一样, 因为一旦赋值就不变 n3 = 30
    public static final  int n3 = 30;
}

public class ClassLoadDemo02 {
    public static void main(String[] args) {
        
    }
}
```

> **4、初始化**：

- 到初始化阶段，才真正开始执行类中定义的Java程序代码，此阶段是执行`< clinit>()`方法的过程。
- `<clinit>()`方法是由编译器按语句在源文件中出现的顺序，依次自动收集类中的所有静态变量的赋值动作和静态代码块中的语句，井进行合并。

```java
package cn.reflection.demo03;

class B {
    static {
        System.out.println("B 静态代码块被执行");
        num = 300;
    }

    static int num = 100;

    public B() {//构造器
        System.out.println("B() 构造器被执行");
    }
}

public class ClassLoadDemo03 {
    public static void main(String[] args) {

        //1.1  加载B类，并生成 B的class对象
        //1.2 链接 num = 0;
        
        /**
         1.3 初始化阶段
            依次自动收集类中的所有静态变量的赋值动作和静态代码块中的语句,并合并
            clinit() {
                System.out.println("B 静态代码块被执行");
                //num = 300;
                num = 100;
            }
            合并: num = 100
         */

        //new B();//类加载
        System.out.println(B.num);//100, 如果直接使用类的静态属性，也会导致类的加载
    }
}
```

- 虚拟机会保证一个类的`< clinit>()`方法在多线程环境中被正确地加锁、同步如果多个线程同时去初始化一个类，那么只会有一个线程去执行这个类的`<clinit>()`方法，其他线程都需要阻塞等待，直到活动线程执行`< clinit>()`方法完毕。

```java
package cn.reflection.demo03;

class B {
    static {
        System.out.println("B 静态代码块被执行");
        num = 300;
    }

    static int num = 100;

    public B() {//构造器
        System.out.println("B()构造器被执行");
    }
}

public class ClassLoadDemo03 {
    public static void main(String[] args) {
        //阅读源码查看,加载类的时候,存在同步机制控制！！！
        /*
        protected Class<?> loadClass(String name, boolean resolve)
        throws ClassNotFoundException
        {
            //正因为有这个机制，才能保证某个类在内存中, 只有一份Class对象
            synchronized (getClassLoadingLock(name)) {
            //....
            }
            }
         */
        B b = new B();
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102213240.png" style="zoom:80%;" />	

#### 17.4.5 类初始化

1、类的主动引用（一定会发生类的初始化）

- ==当虚拟机启动，先初始化main方法所在的类==。
- `new`一个类的对象。
- 调用类的静态成员（除了`final`常量）和静态方法。
- 使用`java.lang.reflect`包的方法对类进行反射调用。
- ==当初始化一个类，如果其父类没有被初始化，则先会初始化它的父类==。

2、类的被动引用（不会发生类的初始化）

- 当访问一个静态域时，只有真正声明这个域的类才会被初始化。如：当通过子类引用父类的静态变量，不会导致子类初始化。
- 通过数组定义类引用，不会触发此类的初始化
- ==引用常量不会触发此类的初始化（常量在链接阶段就存入调用类的常量池中了）==。

3、代码示例

```java
package cn.reflection.demo03;
// 基类
class Person{
    // 定义静态变量a
    static int a = 10;
    static {
        System.out.println("父类被加载");
    }
}
// 派生类
class Student extends Person{
    static {
        System.out.println("子类被加载!!!");
        b = 30;
    }
    // 定义静态变量
    static int b = 21;
    // 定义常量
    static final int C = 11;
}
public class ReflectTest01 {
    // 静态方法
    static {
        System.out.println("main类被加载！！");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        // 1.1 主动引用
        //Student stu = new Student();
        // 1.2 反射也会产生主动调用
        // Class.forName("cn.guardwhy.reflection_02.Student");

        // 2.1 不会产生类的引用方法, 子类不会被加载
        System.out.println(Student.a);
        // 2.2 调用常量
        System.out.println(Student.C);
    }
}
```

4、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102213642.png" style="zoom:80%;" />	

#### 17.4.6 类加载器作用

1、类加载的作用

将`class`文件字节码内容加载到内存中，并将这些静态数据转换成方法区的运行时数据结构，然后在堆中生成一个代表这个类的`java.lang.Class`对象，作为方法区中类数据的访问入口。

2、类缓存

标准的`JavaSE`类加载器可以按要求查找类，但一旦某个类被加载到类加载器中，它将维持加载（缓存）一段时间。不过`JVM`垃圾回收机制可以回收这些`Class`对象

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210305102212.png" style="zoom:80%;" />

==类加载器作用是用来把类(class)装载进内存的。JVM 规范定义了如下类型的类的加载器==。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210305104623.png" style="zoom:80%;" />

3、引导类加载器

用`C++`编写的，是`JVM`自带的类加载器，==负责`Java`平台核心库==。用来装载核心类库，该加载器无法直接获取。

4、拓展类加载器

负责`jre/lib/ext`目录下的`jar`包或者`-D java.ext.dirs` 指定目录下的`jar`包装入工作库。

5、系统类加载器

负责`java -classpath` 或者` -D java.class.path`所指的目录下的类与`jar`包装入工作，是最常用的加载器。

6、代码示例

```java
package cn.reflection.demo03;

public class ReflectTest02 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1.获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);  // sun.misc.Launcher$AppClassLoader@18b4aac2
        // 2.获取系统类加载器的父类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent); // sun.misc.Launcher$ExtClassLoader@677327b6
        // 3.获取拓展类加载器的父类加载器--> 跟加载器
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);    // null

        // 4.测试当前类的是哪个加载器加载的
        ClassLoader classLoader = Class.forName("cn.reflection.demo03.ReflectTest02").getClassLoader();
        System.out.println(classLoader);
        // 5.测试JDK内置的类是谁加载的
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);

        // 6.如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
    }
}
```

7、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211102214937.png" style="zoom: 67%;" />	

### 17.5 通过反射获取类的结构信息

#### 17.5.1  获取 java.lang.Class 类

1、常用方法

| 方法名                      | 基本作用                                          |
| --------------------------- | ------------------------------------------------- |
| `getName()`                 | 获取全类名                                        |
| `getSimpleName()`           | 获取简单类名                                      |
| `getFields()`               | 获取所有`public`修饰的属性， 包含本类以及父类的。 |
| `getDeclaredFields()`       | 获取本类中所有属性                                |
| `getMethods()`              | 获取所有`public`修饰的方法，包含本类以及父类的。  |
| `getDeclaredMethods()`      | 获取本类中所有方法                                |
| `getConstructors()`         | 获取本类所有`public`修饰的构造器                  |
| `getDeclaredConstructors()` | 获取本类中所有构造器                              |
| `getPackage()`              | 以`Package`形式返回包信息                         |
| `getSuperClass()`           | 以`Class`形式返回父类信息                         |
| `getInterfaces()`           | 以`Class[]`形式返回接口信息                       |
| `getAnnotations()`          | 以`Annotation[]`形式返回注解信息                  |

2、代码示例

`Person`类

```java
package cn.reflection.demo04;

class A {
    public String hobby;

    public void study() {

    }

    public A() {
    }

    public A(String name) {
    }
}

interface IA {

}

interface IB {


}
@Deprecated
public class Person extends A implements IA, IB{
    //属性
    public String name;
    protected static int age;
    String job;
    private double sal;

    //构造器
    public Person() {

    }

    public Person(String name) {
    }

    //私有的
    private Person(String name, int age) {

    }

    //方法
    public void method01(String name, int age, double sal) {

    }

    protected String method02() {
        return null;
    }

    void method03() {

    }

    private void method04() {

    }
}
```

`ClassDemo01`类

```java
package cn.reflection.demo04;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassDemo01 {
    public static void main(String[] args) throws Exception{
        //1.1 得到Class对象
        Class<?> personCls = Class.forName("cn.reflection.demo04.Person");
        //1.2 getName:获取全类名
        System.out.println(personCls.getName());
        //1.3 getSimpleName:获取简单类名
        System.out.println(personCls.getSimpleName());//Person

        //1.4 getFields:获取所有public修饰的属性，包含本类以及父类的
        Field[] fields = personCls.getFields();
        for (Field field : fields) {//增强for
            System.out.println("本类以及父类的属性=" + field.getName());
        }
        //1.5 getDeclaredFields:获取本类中所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有属性=" + declaredField.getName());
        }
        /**
         * 本类以及父类的属性=name
         * 本类以及父类的属性=hobby
         * 本类中所有属性=name
         * 本类中所有属性=age
         * 本类中所有属性=job
         * 本类中所有属性=sal
         */

        //1.7 getMethods:获取所有public修饰的方法，包含本类以及父类的
        Method[] methods = personCls.getMethods();
        for (Method method : methods) {
            System.out.println("本类以及父类的方法=" + method.getName());
        }

        //1.8 getDeclaredMethods:获取本类中所有方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法=" + declaredMethod.getName());
        }
        /**
         * 本类中所有方法=study
         * 本类中所有方法=method03
         * 本类中所有方法=method01
         * 本类中所有方法=method02
         * 本类中所有方法=method04
         */

        //1.9 getConstructors: 获取所有public修饰的构造器，包含本类
        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("本类的构造器=" + constructor.getName());
        }
        //1.10 getDeclaredConstructors:获取本类中所有构造器
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("本类中所有构造器=" + declaredConstructor.getName());//这里老师只是输出名
        }

        /**
         * 本类的构造器=cn.reflection.demo04.Person
         * 本类的构造器=cn.reflection.demo04.Person
         * 本类中所有构造器=cn.reflection.demo04.Person
         * 本类中所有构造器=cn.reflection.demo04.Person
         * 本类中所有构造器=cn.reflection.demo04.Person
         */

        //1.11 getPackage:以Package形式返回包信息
        System.out.println(personCls.getPackage());//package cn.reflection.demo04
        //1.12 getSuperClass:以Class形式返回父类信息
        Class<?> superclass = personCls.getSuperclass();
        System.out.println("父类的class对象=" + superclass);
        
        //1.13 getInterfaces:以Class[]形式返回接口信息
        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("接口信息=" + anInterface);
        }

        /**
         * 父类的class对象=class cn.reflection.demo04.A
         * 接口信息=interface cn.reflection.demo04.IA
         * 接口信息=interface cn.reflection.demo04.IB
         */

        //1.14 getAnnotations:以Annotation[]形式返回注解信息
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("注解信息=" + annotation); // 注解信息=@java.lang.Deprecated(forRemoval=false, since="")
        }
    }
}
```

#### 17.5.2 获取java.lang.reflect.Field 类

1、常用方法

| 方法名            | 基本作用                                                     |
| ----------------- | ------------------------------------------------------------ |
| ` getModifiers()` | 以`int`形式返回修饰符<br>【说明:默认修饰符是`0`，`public `是`1` , `private` 是`2`，`protected` 是`4`, `static`是`8`，`final`是`16`]，`public(1) + static (8) = 9`。 |
| `getType()`       | 以`Class`形式返回类型。                                      |
| `getName()`       | 返回属性名                                                   |

2、代码示例

`ClassDemo02`类

```java
package cn.reflection.demo04;

import java.lang.reflect.Field;

public class ClassDemo02 {
    public static void main(String[] args) throws Exception {
        //1.1 得到Class对象
        Class<?> personCls = Class.forName("cn.reflection.demo04.Person");
        //getDeclaredFields:获取本类中所有属性
        //规定 说明: 默认修饰符 是0 ， public  是1 ，private 是 2 ，protected 是 4 , static 是 8 ，final 是 16
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有属性=" + declaredField.getName()
                    + " 该属性的修饰符值=" + declaredField.getModifiers()
                    + " 该属性的类型=" + declaredField.getType());
        }
    }
}

```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211103103500.png" style="zoom:80%;" />	

#### 17.5.4 获取java.lang.reflect.Method 类

1、常用方法

| 方法名                | 基本作用                                                     |
| --------------------- | ------------------------------------------------------------ |
| ` getModifiers()`     | 以`int`形式返回修饰符<br>【说明:默认修饰符是`0`，`public `是`1` , `private` 是`2`，`protected` 是`4`, `static`是`8`，`final`是`16`】 |
| ` getReturnType()`    | 以`Class`形式获取返回类型。                                  |
| `getName()`           | 返回方法名。                                                 |
| `getParameterTypes()` | 以`Class[]`返回参数类型数组。                                |

2、代码示例

`ClassDemo02`类

```java
package cn.reflection.demo04;
import java.lang.reflect.Method;

public class ClassDemo02 {
    public static void main(String[] args) throws Exception {
        //1.1 得到Class对象
        Class<?> personCls = Class.forName("cn.reflection.demo04.Person");

        //1.2 getDeclaredMethods:获取本类中所有方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法=" + declaredMethod.getName()
                    + " 该方法的访问修饰符值=" + declaredMethod.getModifiers()
                    + " 该方法返回类型" + declaredMethod.getReturnType());

            //1.3 输出当前这个方法的形参数组情况
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该方法的形参类型=" + parameterType);
            }
        }
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211103104548.png" style="zoom:80%;" />	

#### 17.5.5 获取java.lang.reflect.Constructor 类

1、常用方法

| 方法名                | 基本作用                    |
| --------------------- | --------------------------- |
| ` getModifiers()`     | 以`int`形式返回修饰符       |
| `getName()`           | 返回构造器名(全类名)        |
| `getParameterTypes()` | 以`Class[]`返回参数类型数组 |

2、代码示例

`ClassDemo02`类

```java
package cn.reflection.demo04;
import java.lang.reflect.Constructor;

public class ClassDemo02 {
    public static void main(String[] args) throws Exception {
        //1.1 得到Class对象
        Class<?> personCls = Class.forName("cn.reflection.demo04.Person");

        //1.2 getDeclaredConstructors:获取本类中所有构造器
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("====================");
            System.out.println("本类中所有构造器=" + declaredConstructor.getName());

            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该构造器的形参类型=" + parameterType);
            }
        }
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211103111446.png" style="zoom:80%;" />	

### 17.6 反射相关操作

#### 17.6.1 通过反射创建对象

1、创建方式

- 方式一:调用类中的`public`修饰的无参构造器。
- 方式二:调用类中的指定构造器。

2、`Class`类相关方法

- `newInstance` ：调用类中的无参构造器，获取对应类的对象。
- `getConstructor(Cass..clazz)`：根据参数列表，获取对应的`public`构造器对象。
- `getDecalaredConstructor(Class..clazz)`：根据参数列表，获取对应的所有构造器对象。

3、`Constructor`类相关方法

- `setAccessible`：暴破
- `newlnstance(Objc..obj)`：调用构造器

4、代码示例

- 测试 1：通过反射创建某类的对象，要求该类中必须有`public` 的无参构造。
- 测试 2：通过调用某个特定构造器的方式，实现创建某类的对象。

`User`类

```java
package cn.reflection.demo05;

public class User {
    private String name = "guardwhy";
    private int age = 10;

    public User() {//无参 public
    }

    public User(String name) {//public的有参构造器
        this.name = name;
    }

    private User(int age, String name) {//private 有参构造器
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

`ReflectCreateInstanceDemo01`类

```java
package cn.reflection.demo05;

import java.lang.reflect.Constructor;

public class ReflectCreateInstanceDemo01 {
    public static void main(String[] args) throws Exception{
        //1.1 先获取到User类的Class对象
        Class<?> userClass = Class.forName("cn.reflection.demo05.User");
        //1.2. 通过public的无参构造器创建实例
        Object o = userClass.newInstance();
        System.out.println(o);
        // 通过public的有参构造器创建实例
        /*
            constructor 对象就是
            public User(String name) {//public的有参构造器
                this.name = name;
            }
         */

        //1.3 先得到对应构造器
        Constructor<?> constructor = userClass.getConstructor(String.class);
        //1.4 创建实例，并传入实参
        Object username = constructor.newInstance("curry");
        System.out.println("username=" + username);

        //1.5 通过非public的有参构造器,创建实例得到private的构造器对象
        Constructor<?> constructor1 = userClass.getDeclaredConstructor(int.class, String.class);
        //1.6 创建实例,暴破【暴力破解】使用反射可以访问private构造器/方法/属性反射面前，都是纸老虎
        constructor1.setAccessible(true);
        Object user2 = constructor1.newInstance(100, "张伯伦");
        System.out.println("user2=" + user2);
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211103141731.png" style="zoom:80%;" />	

#### 17.6.2 获取类中的成员属性

1、基本语法

根据属性名获取Field对象

```java
Field f = clazz对象.getDeclaredField(属性名);
```

暴破操作

```java
 f.setAccessible(true); // f是Field
```

访问

```java
f.set(o,值); // 0 表示对象
System.out.println(f.get())//0表示对象
```

注意:如果是静态属性，则`set`和`get`中的参数`o`,可以写成`null`！！！

2、代码示例

`Student`类

```java
package cn.reflection.demo05;

public class Student {
    public int age;
    private static String name;

    public Student() {//构造器
    }

    public String toString() {
        return "Student:[age=" + age + ", name=" + name + "]";
    }
}
```

`ReflectAccessPropertyDemo02`类

```java
package cn.reflection.demo05;

import java.lang.reflect.Field;

public class ReflectAccessPropertyDemo02 {
    public static void main(String[] args) throws Exception{
        //1.1 得到Student类对应的 Class对象
        Class<?> stuClass = Class.forName("cn.reflection.demo05.Student");
        //1.2 创建对象,obj的运行类型就是Student
        Object obj = stuClass.newInstance();
        System.out.println(obj.getClass());//Student

        //1.3 使用反射得到age属性对象
        Field age = stuClass.getField("age");
        //1.4 通过反射来操作属性
        age.set(obj, 27);
        System.out.println(obj);
        //1.5 返回age属性的值
        System.out.println(age.get(obj));

        //1.6 使用反射操作name属性
        Field name = stuClass.getDeclaredField("name");
        //1.7 对name进行暴破,可以操作private属性
        name.setAccessible(true);
        //1.8 因为name是static属性，因此obj也可以写出null
        name.set(null, "curry");
        System.out.println(obj);
        //1.9 获取属性值
        System.out.println(name.get(obj));
        //1.10 获取属性值, 要求name是static
        System.out.println(name.get(null));
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211103144704.png" style="zoom:67%;" />	

#### 17.6.3 获取类中的方法

1、基本概念

根据方法名和参数列表获取Method方法对象

```java
Method mt = clazz.getDeclaredMethod(方法名，XX.class); // 得到本类的所有方法
```

获取对象

```java
 Object obj = clazz.newInstance();
```

暴破

```java
mt.setAccessible(true);
```

访问: 

```java
Object returnValue = mt.invoke(o,实参列表);
```

==注意:如果是静态方法，则invoke的参数obj,可以写成null==。

 2、代码示例

`Person`类

```java
package cn.reflection.demo05;

class Work{

}

public class Person {
    private static String name;
    public int age;

    //构造器
    public Person() {
    }

    public Work study() {
        return new Work();
    }

    //静态方法
    private static String say( String s, char c, int n) {
        return  s + " " + c + " " + n ;
    }

    //普通public方法
    public void hello(String s) {
        System.out.println("hello" + s);
    }
}
```

`ReflectAccessMethod`类

```java
package cn.reflection.demo05;

import java.lang.reflect.Method;

public class ReflectAccessMethod {
    public static void main(String[] args) throws Exception {
        //1.1 得到Boss类对应的Class对象
        Class<?> cls = Class.forName("cn.reflection.demo05.Person");
        //1.2 创建对象
        Object obj = cls.newInstance();

        //1.3 得到hello()方法对象
        Method hello= cls.getDeclaredMethod("hello", String.class);
        hello.invoke(obj, "Spring Boot!!!!");

        // 1.4 调用private static方法,得到say()方法对象
        Method say = cls.getDeclaredMethod("say",  String.class, char.class, int.class);
        //1.5 因为say方法是private, 所以需要暴破原理和前面讲的构造器和属性一样
        say.setAccessible(true);
        System.out.println(say.invoke(obj, "curry", '男', 10));

        //1.6 因为say方法是static的还可以这样调用，可以传入null。
        System.out.println(say.invoke(null,  "小米", '女', 22));

        //1.7 在反射中如果方法有返回值，统一返回Object, 但是它运行类型和方法定义的返回类型一致
        Object result01 = say.invoke(null, "james", '男', 38);
        System.out.println("result01的运行类型:" + result01.getClass());

        //1.8 在演示一个返回的案例
        Method study = cls.getDeclaredMethod("study");
        Object result02 = study.invoke(obj);
        System.out.println("result02运行类型:" + result02.getClass());
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211103161930.png" style="zoom:80%;" />	

#### 17.6.4 Class对象,有啥用？

1、基本概念

> 创建类的对象：调用Class对象的newInstance()方法

- 类必须有一个无参数的构造器。
- 类的构造器的访问权限需要足够。

> 无参的构造器创建对象

- 通过`Class`类的`getDeclaredConstructor(Class … parameterTypes)`取得本类的指定形参类型的构造器。
- 向构造器的形参中传递一个对象数组进去，里面包含了构造器中所需的各个参数，通过`Constructor`实例化对象。

> 调用指定的方法

- 通过`Class`类的`getMethod(String name,Class…parameterTypes)`方法取得一个`Method`对象，并设置此方法操作时所需要的参数类型。
- 然后使用`Object invoke(Object obj, Object[] args)`进行调用，并向方法中传递要设置的`obj`对象的参数信息。

- `Object `对应原方法的返回值，若原方法无返回值，此时返回`null`。若原方法若为静态方法，此时形参`Object obj`可为`null`。
- 如果原方法形参列表为空，则`Object[] args`为`null`,若原方法声明为`private`,则需要在调用此`invoke()`方法前，显式调用方法对象的`setAccessible(true)`方法，将可访问`private`的方法。

2、代码示例

```java
package cn.guardwhy.reflection_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
* 通过反射,动态创建对象
*/
public class ReflectTest04 {
    public static void main(String[] args) throws Exception {
        // 1.1获得Class对象
        Class c1 = Class.forName("cn.guardwhy.reflection_02.User");
        // 1.2 构造一个对象
        User user1 = (User) c1.newInstance(); // 本质是调用了类的无参构造器
        System.out.println(user1);   // User{id=0, age=0, name='null'}
        System.out.println("===========");

        // 2.1 通过构造器创建对象
         Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
         User user2 = (User) constructor.newInstance("guardwhy", 1, 26);
         System.out.println(user2); // User{id=1, age=26, name='guardwhy'}
         System.out.println("===========");

        // 3.1 通过反射调用普通方法
        User user3 = (User) c1.newInstance();
        // 3.2 通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        // 3.3 invoke: 激活的意思,(对象，"方法的值")
        setName.invoke(user3, "guardwhy");
        System.out.println(user3.getName());    // guardwhy

        // 4.1 通过反射操作属性
        System.out.println("===========");
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        // 4.2 不能直接操作私有属性，暴力破解
        name.setAccessible(true);
        name.set(user4, "Curry");
        System.out.println(user4.getName());
    }
}
```

3、`setAccessible`关键字

- `Method`和`Field`、`Constructor`对象都有`setAccessible()`方法，==setAccessible作用是启动和禁用访问安全检查的开关==。
- 参数值为`true`则指示反射的对象在使用时应该取消`Java`语言访问检查。
- 提高反射的效率。如果代码中必须用反射，而该句代码需要频繁的被调用，那么请设置为`true`。

4、代码示例

```java
package cn.guardwhy.reflection_02;

import java.lang.reflect.Method;

/*
* 性能测试
*/
public class ReflectTest05 {
    public static void main(String[] args) throws Exception {
        // 调用方法
        test01();
        test02();
        test03();
    }

    // 1.普通方法
    public static void test01(){
        User user = new User();
        long startTime = System.currentTimeMillis();
        // 遍历操作
        for (int i = 0; i < 100000000; i++) {
            user.getName();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("普通方式执行10亿次数:" + (endTime - startTime) + "ms");
    }

    // 2.反射方法调用
    public static void test02() throws Exception {
        User user = new User();
        // 得到c1类对象
        Class c1 = user.getClass();
        long startTime = System.currentTimeMillis();
        // 拿到方法
        Method getName = c1.getDeclaredMethod("getName", null);
        for (int i = 0; i < 100000000; i++) {
            // 激活方法
            getName.invoke(user, null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方式执行10亿次数:" + (endTime - startTime) + "ms");
    }

    // 反射方式，关闭检查
    public static void test03() throws Exception {
        User user = new User();
        // 得到c1类对象
        Class c1 = user.getClass();
        long startTime = System.currentTimeMillis();
        // 拿到方法
        Method getName = c1.getDeclaredMethod("getName", null);
        // 暴力破解
        getName.setAccessible(true);
        for (int i = 0; i < 100000000; i++) {
            // 激活方法
            getName.invoke(user, null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方式(关闭检查)执行10亿次数:" + (endTime - startTime) + "ms");
    }
}
```

5、执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se3/20210306131158.png)

## 第18章 注解

### 18.1 什么是注解

#### 18.1.1 **基本概念**

- 注解`(Annotation)`也被称为元数据`(Metadata)`，用于修饰解释 包、类、方法、属性、构造器、局部变量等数据信息，==注解是JDK1.5的新特性==。
- 和注释一样，注解不影响程序逻辑，但注解可以被编译或运行，相当于嵌入在代码中的补充信息。注解是给编译器或`JVM`看的，编译器或`JVM`可以根据注解来完成对应的功能。
- 在` JavaSE` 中，注解的使用目的比较简单，例如标记过时的功能，忽略警告等。在` JavaEE` 中注解占据了更重要的角色，例如用来配置应用程序的任何切面，代替 `java EE` 旧版中所遗留的繁冗代码和` XML` 配置等。

#### 18.1.2 注解作用

- 不是程序本身 , 可以对程序作出解释(标记)。
- 可以被其他程序(比如:编译器等)读取，==现今最牛逼的框架技术多半都是在使用注解和反射==。

### 18.2 Annotation运用

1、基本概念

使用`Annotation`时要在其==前面增加 @ 符号==, 并把该`Annotation`当成一个修饰符使用，==用于修饰它支持的程序元素==。

2、基本用法

- `@Override`: 限定某个方法，是重写父类方法, 该注解只能用于方法。
- `@Deprecated`: 用于表示某个程序元素(类, 方法等)已过时。
- `@SuppressWarnings`: 抑制编译器警告。

#### 18.2.1 @Override 注解

1、基本介绍

定义在 `java.lang.Override` 中 , 此注释只适用于修辞方法 , 表示一个方法声明打算重写超类中的另一个方法声明。

2、代码示例

```java
package cn.guardwhy.demo01;

//父类
class Father{

    public void fly(){
        int i = 0;
        System.out.println("Father fly...");
    }
    public void say(){}

}

//子类
class Son extends Father {
    
    /**
     * @Override 注解放在fly方法上，表示子类的fly方法时重写了父类的fly
     * 这里如果没有写 @Override 还是重写了父类fly()方法.
     * 如果你写了@Override注解，编译器就会去检查该方法是否真的重写了父类的
     * 方法，如果的确重写了，则编译通过，如果没有构成重写，则编译错误
     */
    @Override
    public void fly() {
        System.out.println("Son fly....");
    }
    @Override
    public void say() {}
}

public class OverrideDemo01 {
    public static void main(String[] args) {

    }
}

```

3、注意点

- `@Override`表示指定重写父类的方法(从编译层面验证) , 如果父类没有`fly()`方法，则会报错。
- 如果不写`@Override`注解，而父类仍有`public void fly(){}` ,仍然构成重写。
- `@Override`只能修饰方法，不能修饰其它类，包，属性等。

#### 18.2.2 @Deprecated

1、基本概念

- 定义在`java.lang.Deprecated`中 , 此注释可以用于修辞方法 , 属性 , 类 。
- `@Deprecated`: 用于表示某个程序元素(类, 方法等)已过时。

2、代码示例

```java
package cn.guardwhy.demo01;

/**
 * 1. @Deprecated 修饰某个元素, 表示该元素已经过时
 * 2. 即不在推荐使用，但是仍然可以使用
 * 3. 查看 @Deprecated 注解类的源码
 * 4. 可以修饰方法，类，字段, 包,参数.
 * 5. @Deprecated可以做版本升级过渡使用
 */
@Deprecated
class A {
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void study(){

    }
}

public class DeprecatedDemo02 {
    public static void main(String[] args) {
        A a = new A();
        a.study();
        System.out.println(a.n1);
    }
}
```

#### 18.2.3 @SuppressWarnings

1、基本概念

定义在`java.lang.SuppressWarnings`中，==用来抑制编译时的警告信息==。与前两个注释有所不同,你需要添加一个参数才能正确使用,这些参数都是已经定义好了的,选择性的使用就好了。

2、代码示例

```java
package cn.annotation_01;

import java.util.ArrayList;
import java.util.List;

public class Annotation01 extends Object{
    // 1.重写的注解
    @Override
    public String toString() {
        return super.toString();
    }

    // 2.方法过时了,不建议使用,可能存在问题,并不是不能使用!
    @Deprecated
    public static void test01(){
        System.out.println("测试 @Deprecated");
    }

    //3. 发现 参数类型和参数名称,并不是方法!
   @SuppressWarnings("all")
    public void test02(){
        List list = new ArrayList<>();
   }

    public static void main(String[] args) {
        // 调用方法
        test01();
    }
}
```

### 18.3 元注解

#### 18.3.1 基本概念

元注解是`sun`公司提供的，元注解是用在自定义注解上的注解，==元注解是用来注解自定义注解的==。

#### 18.3.2 元注解类型

1、`@Target`

用于描述注解的使用范围(即:被描述的注解可以用在什么地方)。

2、`@Retention`

表示需要在什么级别保存该注释信息 , 用于描述注解的生命周期，`(SOURCE < CLASS < RUNTIME)`

3、`@Document`

说明该注解将被包含在`javadoc`中。

4、`@Inherited`

说明子类可以继承父类中的该注解

#### 18.3.3 代码示例

```java
package cn.annotation_01;

import java.lang.annotation.*;

public class Annotation02 {
    public void test(){

    }
}

// 1.定义一个注解
// Target 表示注解可以用到什么地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})

// 2.Retention 注解在什么地方还有效
// runtime > class > sources
@Retention(value = RetentionPolicy.RUNTIME)

// 3.Deprecated 表示是否将注解生成在Javadoc中
@Deprecated

// 4.Inherited 子类可以继承父类的注解
@Inherited
@interface MyAnnotation{

}
```

### 18.4 自定义注解

#### 18.4.1 基本概念

1、自定义注解的格式

使用`@interface`自定义注解时 , 自动继承了`java.lang.annotation.Annotation`接口。

```java
[修饰符] @interface 注解名{
         // 其中的每一个方法实际上是声明了一个配置参数。
}
```

2、参数类型

- ==方法的名称就是参数的名称，返回值类型就是参数的类型== ( 返回值只能是基本类型,`Class , String , enum` )。
- 可以通过`default`来声明参数的默认值，如果只有一个参数成员 , 一般参数名为`value`。注解元素必须要有值 , 定义注解元素时经常使用空字符串,`0`作为默认值 。

3、代码示例

```java
package cn.annotation_01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
* 自定义注解
*/
public class Test03 {
    // 注解可以显示赋值，如果没有默认值，就必须给注解赋值
    @MyAnnotation3(age = 26, name = "guardwhy")
    public void test01(){}

    @MyAnnotation4("guardwhy")
    public void test02(){
        
    }
}

// 定义注解
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    // 注解的参数: 参数类型 + 参数名();
    String name() default "";
    int age();
    // 如果默认值为-1,代表不存在.
    int id() default -1;
    String[] schools() default {"计算机工程学院", "中山大学"};
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation4{
    String value();
}
```

#### 18.4.2 反射读取注解

1、代码示例

```java
package cn.guardwhy.demo02;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Tablestu("db_student")
class Student{
    // 成员属性
    @Fieldstu(columnName="db_id", type = "int", length = 10)
    private int id;
    @Fieldstu(columnName="db_age", type = "int", length = 10)
    private int age;
    @Fieldstu(columnName = "db_name", type = "varchar", length = 6)
    private String name;

    public Student() {

    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// 类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Tablestu{
    String value();
}

// 属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Fieldstu{
    String columnName();
    String type();
    int length();
}

public class AnnotationDemo03 {
    public static void main(String[] args) throws Exception {
        // 1.获得Class类对象
        Class c1 = Class.forName("cn.guardwhy.demo02.Student");
        // 2.通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation); // @cn.annotation_02.Tablestu(value=db_student)
        }

        // 3.获得注解的value的值
        Tablestu tablestu = (Tablestu)c1.getAnnotation(Tablestu.class);
        String value = tablestu.value();
        System.out.println(value);  // db_student

        // 4.获得类指定的注解
        Field f = c1.getDeclaredField("id");
        Fieldstu annotation = f.getDeclaredAnnotation(Fieldstu.class);
        System.out.println(annotation.columnName());    // db_id
        System.out.println(annotation.type()); // int
        System.out.println(annotation.length()); // 10
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211103214206.png" style="zoom:80%;" />	

## 第19章 JDK新特性

### 19.1 Java8的概述

Java8是 Java 语言的一个重要版本，该版本于2014年3月发布，是自Java5以来最具革命性的版本，

这个版本包含语言、编译器、库、工具和JVM等方面的十多个新特性。

### 19.2 接口默认方法修饰为普通方法

#### 19.1.1 基本概念

1、在`Jdk8` 之前`interface` 之中可以定义变量和方法，变量必须是==public、static、final== 的，方法必须是 ==public、abstract== 的，由于这些修饰符都是默认的。

- 接口定义方法：`public` 抽象方法 需要子类实现
  接口定义变量：`public、static、final`

2、在 `Jdk 1.8` 开始 支持使用 `static` 和 `default` 修饰 可以写方法体，不需要子类重写。

- 普通方法: 可以有方法体
- 抽象方法: 没有方法体需要子类实现重写。

#### 19.1.2 代码示例

1、`JDK8Interface`接口

```java
package cn.jdk8.demo01;

public interface JDK8Interface {
    /**
     * 抽象方法 需要子类实现
     * 默认类型：public、abstract
     */
    void add();

    /**
     * default方法
     */
    default void defaultGet() {
        System.out.println("default方法操作");
    }

    static void staticGet() {
        System.out.println("静态方法操作");
    }
}
```

2、`JDK8InterfaceImpl`实现类

```java
package cn.jdk8.demo01;

public class JDK8InterfaceImpl implements JDK8Interface{
    /**
     * 默认的情况下必须重写接口中抽象方法 默认和静态方法是不需要必须重写
     */
    @Override
    public void add() {
        System.out.println("普通方法操作");
    }
}
```

3、`JDK8Demo01`测试类

```java
package cn.jdk8.demo01;

public class JDK8Demo01 {
    public static void main(String[] args) {
        // 1.1 创建jdk8Interface对象
        JDK8InterfaceImpl jdk8Interface = new JDK8InterfaceImpl();
        // 1.2 对象调用方法
        jdk8Interface.add();
        jdk8Interface.defaultGet();
        // 1.3 接口直接调用静态方法
        JDK8Interface.staticGet();
    }
}
```

4、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211104072216.png" style="zoom:67%;" />	

### 19.2 Lambda表达式

#### 19.2.1 什么是 Lambda  表达式

- `Lambda`表达式是`JDK1.8`开始之后的新技术，是一种代码的新语法。是一种特殊写法，核心目的是为了简化匿名内部类的代码写法。
- `Lambda` 表达式是实例化函数式接口的重要方式，使用`Lambda` 表达式可以使代码变的更加简洁紧凑。
- `Lambda`好处： 简化匿名内部类的调用，`Lambda+方法`引入代码变得更加精简。

#### 19.2.2 简化匿名内部类前提

- `Lambda`表达式并不是能简化所有匿名内部类代码的写法。
- `Lambda`表达式只能==简化函数式接口的匿名内部类写法==。
- 函数式接口:==首先必须是接口，其次接口中有且仅有一个抽象方法==。

- `Lambda`表达式只能简化只有一个抽象方法的接口的匿名内部类写法。

#### 19.2.3  函数式接口

##### 19.2.3.1 基本介绍

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se1/40-javase.png" style="zoom: 67%;" />	

- ==函数式接口主要指只包含一个抽象方法的接口==，如：`java.lang.Runnable`、`java.util.Comparator`接口等。
- `Java8`提供`@FunctionalInterface`注解来定义函数式接口，若定义的接口不符合函数式的规范便会报错。
- `Java8`中增加了`java.util.function`包，该包包含了常用的函数式接口，具体如下：

| 接口名称        | 方法声明            | 功能介绍                     |
| --------------- | ------------------- | ---------------------------- |
| `Consumer`      | `void accept(T t)`  | 根据指定的参数执行操作       |
| `Supplier`      | `T get()`           | 得到一个返回值               |
| `Function<T,R>` | `R apply(T t)`      | 根据指定的参数执行操作并返回 |
| `Predicate`     | `boolean test(T t)` | 判断指定的参数是否满足条件   |

##### 19.2.3.2 传统方式实现

1、代码示例

```java
package cn.jdk8.demo02;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@SuppressWarnings({"all"})
public class FunctionalInterface01 {
        public static void main(String[] args) {
            // 1.匿名内部类的语法格式：父类/接口类型  引用变量名 = new 父类/接口类型(){ 方法的重写 };
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("无参数无返回值的方法");
                }
            };
            // 没有参数又没有返回值的方法
            runnable.run();
            System.out.println("++++++++++++");

            // 2.有参数没有返回值
            Consumer consumer = new Consumer() {
                @Override
                public void accept(Object o) {
                    System.out.println(o + "有参数没有返回值");
                }
            };
            consumer.accept("Consumer接口:");
            System.out.println("++++++++++++");

            // 3.无参数有返回值
            Supplier supplier = new Supplier() {
                @Override
                public Object get() {
                    return "无参数有返回值";
                }
            };
            // 3.1 无参数有返回值
            System.out.println("Supplier接口:" + supplier.get());
            System.out.println("++++++++++++++");

            // 4.指定的参数执行操作并返回
            Function function = new Function() {
                @Override
                public Object apply(Object o) {
                    return o;
                }
            };
            System.out.println("Function接口:" + function.apply("有参数有返回值"));
            System.out.println("++++++++++++++");

            // 5.指定的参数是否满足条件
            Predicate predicate = new Predicate() {
                @Override
                public boolean test(Object o) {
                    return false;
                }
            };
            System.out.println("参数判断:" + predicate.test("guardwhy"));
        }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211104105731.png" style="zoom:67%;" />	

##### 19.2.3.3 Lambda表达式格式

1、基本语法

```java
(参数列表) -> { 方法体; } - 其中()、参数类型、{} 以及return关键字 可以省略。
```

2、无参方法调用

`AcanthopanaxInterface`类

```java
package cn.jdk8.demo03;
/**
 * 无参数调用
 **/
@FunctionalInterface
public interface AcanthopanaxInterface {
    void get();
}
```

测试类: `TestDemo01`

```java
package cn.jdk8.demo03;

public class TestDemo01 {
    public static void main(String[] args) {
        // 1.1 使用匿名内部类调用【传统方式】

        /*
            new AcanthopanaxInterface() {
                @Override
                public void get() {
                    System.out.println("get方法调用！！！");
                }
            }.get();
        */

        // 1.2 Lambda实现

        /*
            AcanthopanaxInterface acanthopanaxInterface = ()->{
                System.out.println("get方法调用！！！");
            };
            acanthopanaxInterface.get();
        */

        // 一步到位
        ((AcanthopanaxInterface) () -> System.out.println("get方法调用！！！")).get(); // get方法调用！！！
    }
}
```

3、带参数和返回值

接口类:`GenerationInterface`

```java
package cn.jdk8.demo03;
/**
 * 带参数和返回值
 */
@FunctionalInterface
public interface GenerationInterface {
    String get(int i, int j);
}
```

测试类：`TestDemo02`

```java
package cn.jdk8.demo03;

public class TestDemo02 {
    public static void main(String[] args) {
        // 1.1 使用匿名内部类调用
        GenerationInterface generationInterface1 = new GenerationInterface() {
            @Override
            public String get(int i, int j) {
                return i + " " + j;
            }
        };
        System.out.println(generationInterface1.get(6,10));

        //2.使用 Lambda实现调用有参数函数方法
        GenerationInterface generationInterface2 = (i,j)->{
            return i + " " + j;
        };

        System.out.println(generationInterface2.get(1,8));

        // 一次性解决
        String result = ((GenerationInterface) (i,j) -> i + " " + j).get(1,4);
        System.out.println(result);
    }
}

```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211104152654.png" style="zoom:80%;" />	

##### 19.2.3.4 Lambda方式实现

1、代码示例

```java
package cn.guardwhy_03;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo02 {
    public static void main(String[] args) {
        // 1.使用lambda表达式实现函数式接口对象的创建: (参数列表)->{方法体;}
        Runnable runnable = () -> System.out.println("默认方式:" + "无参数无返回值方法");
        runnable.run();
        System.out.println("+++++++++");

        // 2.有参数没有返回值,省略了()、参数类型、{}，自动类型推断
        //Consumer consumer1 = (Object o) -> {System.out.println(o + "有参数没有返回值");};
        //Consumer consumer1 = (o) -> System.out.println(o + "有参数没有返回值");
        Consumer consumer = o -> System.out.println(o + "有参数没有返回值");
        consumer.accept("Consumer接口:");
        System.out.println("+++++++++");

        // 3.无参数有返回值
        //Supplier supplier = () -> {return "无参数有返回值";};
        Supplier supplier = () -> "无参数有返回值";
        // 3.1 无参数有返回值
        System.out.println("Supplier接口:" + supplier.get());
        System.out.println("++++++++++++++");

        // 4.指定的参数执行操作并返回, return 和 {} 都可以省略
        Function function = o ->o;
        System.out.println("Function接口:" + function.apply("有参数有返回值"));
        System.out.println("++++++++++++++");

        // 5.指定的参数是否满足条件
        Predicate predicate = o -> false;
        System.out.println("Predicate接口:" + predicate.test("guardwhy"));
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211104105731.png" style="zoom:67%;" />	

#### 19.2.4 相关操作

##### 19.2.4.1 遍历集合

1、代码示例

```java
package cn.jdk8.demo04;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        // 添加元素
        lists.add("curry");
        lists.add("kobe");
        lists.add("james");
        lists.add("guardwhy");

        // 遍历操作
        lists.forEach(s ->{
            System.out.println(s);
        });
    }
}

```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211104165308.png" style="zoom:80%;" />	

##### 19.2.4.2 集合排序

1、代码示例

`UserEntity`类

```java
package cn.jdk8.demo04;

public class UserEntity {
    private String userName;
    private int age;

    public UserEntity() {

    }

    public UserEntity(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    public int hashCode() {
        return userName.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof UserEntity)
            return userName.equals(((UserEntity) obj).userName) && age == (((UserEntity) obj).age);
        else
            return false;
    }
}
```

`ArrayListDemo02`类

```java
package cn.jdk8.demo04;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<UserEntity> lists = new ArrayList<>();
        // 1.1 添加操作
        lists.add(new UserEntity("curry",10));
        lists.add(new UserEntity("kobe",41));
        lists.add(new UserEntity("james",36));
        lists.add(new UserEntity("guardwhy",21));

        // 1.2 排序操作【传统方式】

        /*
            lists.sort(new Comparator<UserEntity>() {
                @Override
                public int compare(UserEntity o1, UserEntity o2) {
                    return o1.getAge() - o2.getAge();
                }
            });
        */

        // 1.3 遍历操作【传统方式】

        /*
            for (UserEntity userEntity : lists){
                System.out.println(userEntity);
            }
        */

        // 1.4 排序操作【Lambda方式】
        lists.sort((o1, o2) -> o1.getAge() - o2.getAge());

        // 1.5 遍历操作【Lambda方式】
        lists.forEach((s) ->{
            System.out.println(s.toString());
        });
    }
}
```

2、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211104195040.png)

#### 19.2.5 方法引用

##### 19.2.5.1 基本概念

1、方法引用主要指==通过方法的名字来指向一个方法而不需要为方法引用提供方法体，该方法的调用交给函数式接口执行==。

2、方法引用是在特定场景下`lambda`表达式的一种简化表示，可以进一步简化代码的编写使代码更加紧凑简洁，从而减少冗余代码。

3、方法引用使用一对冒号 `:: `将类或对象与方法名进行连接，通常使用方式如下：

| 方法引用             | 基本语法                        |
| -------------------- | ------------------------------- |
| 对象的非静态方法引用 | `ObjectName :: MethodName`      |
| 类的静态方法引用     | `ClassName :: StaticMethodName` |
| 类的非静态方法引用   | `ClassName :: MethodName`       |
| 构造器的引用         | `ClassName :: new`              |
| 数组的引用           | `TypeName[] :: new`             |

##### 19.2.5.2 代码示例

实体类:`Person`

```java
package cn.lambda.demo01;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("方法引用...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return getAge() - o.getAge();
    }
}
```

实现类:`MethodReferenceTest`

```java
package cn.guardwhy_04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {
    public static void main(String[] args) {
        // 1.1方法调用
        Person person = new Person("kobe", 41);
        // 1.1 lambda表达式实现Person类中show方法调用
        Runnable runnable1 = ()-> person.show();
        runnable1.run();
        // 1.2 使用方法引用实现Person类中show方法调用
        Runnable runnable2 = person::show;
        runnable2.run();
        System.out.println("+++++++++++");

        // 2.1 使用lambda表达式方式实现Person类中setName方法调用
        Consumer<String> consumer1 = s-> person.setName(s);
        consumer1.accept("Curry");
        System.out.println("person=" + person);
        // 2.2 使用方法引用的方式实现Person类中setName方法的调用
        Consumer<String> consumer2 = person::setName;
        consumer2.accept("james");
        System.out.println("person=" + person);
        System.out.println("+++++++++++");

        // 3.通过函数式接口Supplier方法来实现Person类中getName方法调用
        Supplier<String> supplier1 = ()->person.getName();
        System.out.println(supplier1.get());    // james

        Supplier<String> supplier2 = person::getName;
        System.out.println(supplier2.get()); // james
        System.out.println("+++++++++++++");

        // 4.通过函数式接口Function中的方法实现Integer类中parseInt方法调用
        Function<String, Integer> function1 = s -> Integer.parseInt(s);
        System.out.println(function1.apply("12345")); // 12345
        Function<String, Integer> function2 = Integer::parseInt;
        System.out.println(function2.apply("12345")); // 12345
        System.out.println("+++++++++++++++");

        // 9.通过函数式接口Comparator方法实现Integer类中compare方法调用
        Comparator<Integer> comparator1 = (o1, o2) ->Integer.compare(o1, o2);
        System.out.println(comparator1.compare(10, 20)); // -1

        Comparator<Integer> comparator2 = Integer::compare;
        System.out.println(comparator2.compare(10, 20));
        System.out.println("+++++++++++++++");

        // 10.通过BiFunction函数式接口采用有参方式创建Person类型对象并返回
        BiFunction<String, Integer, Person> biFunction1 = (s, integer) -> new Person(s, integer);
        System.out.println(biFunction1.apply("Ross", 30));

        BiFunction<String, Integer, Person> biFunction2 = Person::new;
        System.out.println(biFunction2.apply("Ross", 21));
        System.out.println("+++++++++++++++");

        // 11.通过Function函数式接口创建指定数量的Person类型的对象数组并返回
        Function<Integer, Person[]> function3 = integer -> new Person[integer];
        System.out.println(Arrays.toString(function3.apply(4)));

        Function<Integer, Person[]> function4 = Person[]::new;
        System.out.println(Arrays.toString(function4.apply(5)));
    }
}
```

### 19.3 Stream流

#### 19.3.1 什么是stream流

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211105084328.png" style="zoom: 80%;" />	

- `Stream`是 `JDK1.8` 中处理集合的关键抽象概念，`Lambda` 和 `Stream` 是 `JDK1.8` 新增的函数式编程最有亮点的特性了，它可以指定对集合进行的操作，可以执行非常复杂的查找、过滤和映射数据等操作。
- 使用`Stream API`对集合数据进行操作，就类似于使用`SQL`执行的数据库查询，`Stream`使用一种类似用`SQL`语句从数据库查询数据的直观方式来提供一种对 `Java` 集合运算和表达的高阶抽象，`StreamAPI`可以极大提高 `Java` 程序员的生产力，让程序员写出高效率、干净、简洁的代码。
- 这种风格将要处理的元素集合看作一种流， 流在管道中传输并且可以在管道的节点上进行处理， 比如筛选，排序，聚合等。元素流在管道中经过中间操作`(intermediate operation)`的处理，最后由最终操作`(terminaloperation)`得到前面处理的结果。
- `Stream`以非常方便精简的形式遍历集合实现 过滤、排序等。

#### 19.3.2 Stream创建方式

1、创建步骤

- 创建`Stream`，通过一个数据源来获取一个流。
- 转换`Stream`，每次转换返回一个新的`Stream`对象，对`Stream`进行聚合操作并产生结果。
- `parallelStream` 为并行流采用多线程执行，`Stream `采用单线程执行，==parallelStream 效率比 Stream 要高==。

2、代码实现

```java
package cn.stream.demo01;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<Person> lists = new ArrayList<>();
        // 1.1 添加操作
        lists.add(new Person("curry",10));
        lists.add(new Person("kobe",41));
        lists.add(new Person("james",36));
        lists.add(new Person("guardwhy",21));
        lists.add(new Person("jordan",50));
        lists.add(new Person("jordan",50));

        // 创建方式一
        Stream<Person> stream1 = lists.stream();
        // 创建方式二
        Stream<Person> stream2 = lists.parallelStream();
        stream1.forEach((s) ->{
            System.out.println(s.toString());
        });
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211105090444.png" style="zoom: 80%;" />	

#### 19.3.3 Stream将list转换为Set

1、代码示例

实体类:`Person`

```java
package cn.stream.demo01;

import java.util.Objects;

public class Person {
    private String userName;
    private int age;

    public Person() {

    }

    public Person(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getUserName(), person.getUserName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
```

测试类:` ArrayListDemo01`

```java
package cn.stream.demo01;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<Person> lists = new ArrayList<>();
        // 1.1 添加操作
        lists.add(new Person("curry",10));
        lists.add(new Person("kobe",41));
        lists.add(new Person("james",36));
        lists.add(new Person("guardwhy",21));
        lists.add(new Person("jordan",50));
        lists.add(new Person("jordan",50));

        // 创建方式一
        Stream<Person> stream = lists.stream();

        // 转换成Set集合
        Set<Person> setPerson = stream.collect(Collectors.toSet());
        // 遍历集合
        setPerson.forEach(person -> System.out.println(person.toString()));
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211105095434.png" style="zoom:80%;" />	

#### 19.3.4 Stream将list转换为Map

1、代码示例

```java
package cn.stream.demo01;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStreamDemo02 {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        // 1.1 添加操作
        persons.add(new Person("curry",10));
        persons.add(new Person("kobe",41));
        persons.add(new Person("james",36));
        // list集合只有元素值 key list转换成map集合的情况下 指定key--user对象 username属性  value user对象
        Stream<Person> stream = persons.stream();
       /**
        * 匿名内部类实现
        */
        
        /*
            Map<String, Person> collect = stream.collect(Collectors.toMap(new Function<Person, String>() {
                @Override
                public String apply(Person person) {
                    return person.getUserName();
                }
            }, new Function<Person, Person>() {
                @Override
                public Person apply(Person person) {
                    return person;
                }
            }));
    
            collect.forEach(new BiConsumer() {
                @Override
                public void accept(Object o1,  Object o2) {
                    System.out.println(o1 + "," + o2);
                }
            });
    
            collect.forEach(new BiConsumer<String, Person>() {
                @Override
                public void accept(String s, Person person) {
                    System.out.println(s + "," + person);
                }
            });
        */

        /**
         * Lambda实现
         */
        Map<String, Person> collect = stream.collect(Collectors.toMap(Person::getUserName, person -> person));

        collect.forEach((s, person) -> System.out.println(s + "," + person));
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211105121828.png" style="zoom:80%;" />	

#### 19.3.5 Stream将Reduce求和

1、代码示例

```java
package cn.stream.demo01;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceStreamDemo03 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Person> lists = new ArrayList<>();
        // 往集合中添加元素
        lists.add(new Person("curry",10));
        lists.add(new Person("kobe",41));
        lists.add(new Person("james",36));
        lists.add(new Person("guardwhy",21));
        lists.add(new Person("jordan",50));
        lists.add(new Person("jordan",61));
        // 转换成stream流
        Stream<Person> stream = lists.stream();
        Optional<Person> sum =  stream.reduce((p1, p2) -> {
            Person person = new Person("sum", p1.getAge() + p2.getAge());
            return person;
        });
        // 求和操作
        System.out.println(sum.get().getAge()); // 219

        // 案例二
        Stream<Integer> integerStream = Stream.of(10, 50, 30, 12);
        Optional<Integer> reduce = integerStream.reduce((a1, a2) -> a1 + a2);

        System.out.println(reduce.get());   // 102
    }
}
```

2、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211105141842.png)

#### 19.3.6 StreamMax和Min

1、代码示例

```java
package cn.stream.demo01;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMinDemo04 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Person> lists = new ArrayList<>();
        // 往集合中添加元素
        lists.add(new Person("curry",10));
        lists.add(new Person("kobe",41));
        lists.add(new Person("james",36));
        lists.add(new Person("guardwhy",21));
        lists.add(new Person("jordan",50));
        lists.add(new Person("jordan",61));
        // 转换成stream流
        Stream<Person> stream = lists.stream();
        Optional<Person> min = stream.min((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(min.get());
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211105143849.png" style="zoom: 80%;" />	

#### 19.3.7 StreamMatch匹配

1、代码示例

- `anyMatch` 表示，判断的条件里，任意一个元素成功，返回 `true`。
- `allMatch` 表示，判断条件里的元素，所有的都是，返回` true`。
- `noneMatch` 跟 `allMatch` 相反，判断条件里的元素，所有的都不是，返回 `true`。

```java
package cn.stream.demo01;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamMatchDemo05 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Person> lists = new ArrayList<>();
        // 往集合中添加元素
        lists.add(new Person("curry",10));
        lists.add(new Person("kobe",41));
        lists.add(new Person("james",36));
        lists.add(new Person("guardwhy",21));
        lists.add(new Person("jordan",50));
        lists.add(new Person("jordan",61));
        // 转换成stream流
        Stream<Person> stream = lists.stream();
        boolean b = stream.anyMatch(person -> "guardwhy".equals(person.getUserName()));
        System.out.println(b);
    }
}
```

2、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211105150356.png)

#### 19.3.9 Stream过滤器

1、代码示例

```java
package cn.stream.demo01;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamFilterDemo06 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Person> lists = new ArrayList<>();
        // 往集合中添加元素
        lists.add(new Person("curry",10));
        lists.add(new Person("kobe",41));
        lists.add(new Person("james",36));
        lists.add(new Person("guardwhy",21));
        lists.add(new Person("jordan",50));
        lists.add(new Person("jordan",61));
        // 转换成stream流
        Stream<Person> stream = lists.stream();
        stream.filter(person -> "james".equals(person.getUserName()) && person.getAge() > 18)
                .forEach(person -> System.out.println(person));
    }
}
```

2、运行结果

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211105153158.png" style="zoom:80%;" />

#### 19.3.10 Stream排序sorted

1、代码示例

```java
package cn.stream.demo02;

import cn.stream.demo01.Person;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamSortDemo01 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Person> lists = new ArrayList<>();
        // 往集合中添加元素
        lists.add(new Person("curry",10));
        lists.add(new Person("kobe",41));
        lists.add(new Person("james",36));
        lists.add(new Person("guardwhy",21));
        lists.add(new Person("jordan",50));
        lists.add(new Person("jordan",61));
        // 转换成stream流
        Stream<Person> stream = lists.stream();
        // 排序操作
        stream.sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .forEach(person -> System.out.println(person.toString()));
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211105154820.png" style="zoom:80%;" />	

#### 19.3.11 Stream limit和skip

1、代码示例

```java
package cn.stream.demo02;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamSkipDemo02 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Person> lists = new ArrayList<>();
        // 往集合中添加元素
        lists.add(new Person("curry",10));
        lists.add(new Person("kobe",41));
        lists.add(new Person("james",36));
        lists.add(new Person("guardwhy",21));
        lists.add(new Person("jordan",50));
        lists.add(new Person("jordan",61));
        // 转换成stream流
        Stream<Person> stream = lists.stream();
        // stream分页(开始skip()) 结束：limit
        stream.skip(2).limit(4).forEach(person -> System.out.println(person.toString()));
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211105162611.png" style="zoom:80%;" />	

#### 19.3.12 Stream综合案例

1、代码示例

要求：对数据流的数据实现降序排列、且名称为`curry`获取后两位数据。

```java
package cn.stream.demo02;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Person> lists = new ArrayList<>();
        // 往集合中添加元素
        lists.add(new Person("curry",10));
        lists.add(new Person("kobe",41));
        lists.add(new Person("james",36));
        lists.add(new Person("guardwhy",21));
        lists.add(new Person("jordan",50));
        lists.add(new Person("Leonard",61));
        lists.add(new Person("curry",9));
        lists.add(new Person("curry",33));
        // 转换成stream流
        Stream<Person> stream = lists.stream();
        stream.sorted((o1, o2) -> o2.getAge() - o1.getAge()).filter(person -> "curry".equals(person.getUserName())).limit(2)
                .forEach((person -> System.out.println(person.toString())));
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211105175233.png" style="zoom:80%;" />	

### 19.4 Optional类

#### 19.4.1 Optional类引出

1、需求

判断字符串是否为空，若不为空则打印字符串的长度，否则打印0。

```java
package cn.optional.demo01;

public class OptionalDemo01 {
    public static void main(String[] args) {
        String str1 = null;
        // 条件判断
        if (str1 != null) {
            System.out.println("字符串的长度是：" + str1.length()); 
        } else {
            System.out.println("字符串为空，因此长度为0！");
        }
    }
}
```

<font color = red>传统方式实现过于麻烦，`JDK8`推出了`Optional`类实现对空值进行处理！！！</font>

#### 19.4.2 Optional类基本介绍

1、基本概念

- `Optional` 类是一个可以为`null` 的容器对象。如果值存在则`isPresent()`方法会返回`true`，调用`get()`方法会返回该对象。
- `Optional`是个容器：它可以保存类型 T 的值，或者仅仅保存 `null`。`Optional` 提供很多有用的方法，这样就不用显式进行空值检测。
- `Optional` 类的引入很好的解决空指针异常。

2、常用方法

| 方法声明                                               | 功能介绍                                         |
| ------------------------------------------------------ | ------------------------------------------------ |
| `static Optional ofNullable(T value)`                  | 根据参数指定数值来得到`Optional`类型的对象       |
| `Optional map(Function<? super T,? extends U> mapper)` | 根据参数指定规则的结果来得到`Optional`类型的对象 |
| `T orElse(T other)`                                    | 若该值存在就返回，否则返回`other`的数值。        |

3、代码示例

```java
package cn.optional.demo01;

import java.util.Optional;

public class OptionalDemo01 {
    public static void main(String[] args) {
        // 1.1 定义变量
        String str1 = null;
        // 1.2 将数据str1装到Optional对象代表的容器中
        Optional<String> optional = Optional.ofNullable(str1);

        // 1.3建立映射关系使用字符串的长度与字符串建立映射关系
        /*
            Optional<Integer> integer = optional.map(new Function<String, Integer>() {
                @Override
                public Integer apply(String s) {
                    return s.length();
                }
            });
        */
        Optional<Integer> integer = optional.map(String::length);

        // 1.4 若字符串为空则打印0,否则打印字符串的数值
        System.out.println("integer:" + integer);
        System.out.println(integer.orElse(0));
    }
}
```

4、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211105195331.png" style="zoom:80%;" />	



## 第20章 JDBC

### 20.1 JDBC概念

1、基本概念

`Java DataBase Connectivity`是`Java`的数据库连接技术，它是一组接口，使用`Java`编程来访问各种数据库。 

2、`JDBC`特点

由一组接口组成，代码针对接口进行编程的。不需要自己去实现接口，这些接口的实现类由第三方数据库厂商来实现。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/前端/jQuery/jquery2/05-jdbc.png" style="zoom: 80%;" />

### 20.2 JDBC访问数据库

#### 20.2.1 创建JDBC工程

1、创建普通的Java工程.

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/jdbc/2-jdbc.png" style="zoom:67%;" />

2、将普通的Java项目转换成Maven项目

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/jdbc/3-jdbc.png)

3、倒入相关依赖

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>cn.guardwhy</groupId>
    <artifactId>JDBC</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>
    <dependencies>
        <!--mysql的驱动-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.30</version>
        </dependency>
        <!--单元测试-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
        <!--lombok插件-->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.16</version>
        </dependency>
    </dependencies>

    <!--在build中配置resources，来防止我们资源导出失败的问题-->
    <build>
        <resources>
            <resource>
                <directory>src/main/resources</directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.xml</include>
                </includes>
                <filtering>true</filtering>
            </resource>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.xml</include>
                </includes>
                <filtering>true</filtering>
            </resource>
        </resources>
    </build>
</project>
```

#### 20.2.2 访问数据库步骤

1. 通过`DriverManager`创建连接对象。

2. 创建好连接对象以后, 由客户端通过`Statement`发送`SQL`语句给`MySQL`服务器。

3. 在数据库服务器端执行`SQL`语句

4. 将执行的结果以`ResultSet`返回给客户端

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/前端/jQuery/jquery2/06-jdbc.png" style="zoom: 67%;" />

#### 20.2.3  注册驱动

1、基本概念

- `JDBC`规范定义驱动接口： ==java.sql.Driver==
- MySql驱动包提供了实现类： ==com.mysql.jdbc.Driver==

| 加载注册驱动的方式                | 描述                                                         |
| --------------------------------- | ------------------------------------------------------------ |
| `Class.forName`(数据库驱动实现类) | 加载和注册数据库驱动,数据库驱动由数据库厂商MySql提供<br/>`com.mysql.jdbc.Driver` |

2、代码示例

```java
public class JDBCDemo01 {
	public static void main(String[] args) throws ClassNotFoundException {
    // 注册驱动
    // forName 方法执行将类进行初始化
    Class.forName("com.mysql.jdbc.Driver");
    }
}
```

#### 20.2.4 获得连接

1、基本操作

- `Connection` 接口，代表一个连接对象 ,具体的实现类由数据库的厂商实现。
- 使用 `DriverManager`类的静态方法，`getConnection`可以获取数据库的连接。

| 获取连接的静态方法                                           | 作用                                              |
| ------------------------------------------------------------ | ------------------------------------------------- |
| `Connection getConnection(String url, String user, String password)` | 通过连接字符串和用户名,密码来获取数据库连接对象。 |

#### 20.2.5 连接参数

 1、`DriverManager`类

注册驱动，从`JDK1.5`版本以后就会自动注册了，创建数据库连接

| **JDBC连接数据库的四个参数** | 具体作用                                           |
| ---------------------------- | -------------------------------------------------- |
| `username`                   | 登录用户名                                         |
| `password`                   | 登录密码                                           |
| 连接字符串`URL`              | `URL`的格式: `jdbc:mysql://localhost:3306/db_jdbc` |

`JDBC`规定`url`的格式由三部分组成，每个部分中间使用冒号分隔。

- 第一部分是协议` jdbc`，这是固定的。
- 第二部分是子协议，就是数据库名称，连接`mysql`数据库，第二部分当然是`mysql`了。
- 第三部分是由数据库厂商规定的，我们需要了解每个数据库厂商的要求，`mysql`的第三部分。分别由数据库服务器的`IP地址(localhost)`、端口号`(3306)`，以及要使用的 数据库名称组成。

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/jdbc/5-jdbc.png)

2、URL参数的作用

- 乱码的处理，如果数据库出现乱码，可以指定参数 `?characterEncoding=utf8`，表示让数据库以`UTF-8`编码来处理数据。

```properties
jdbc:mysql://localhost:3306/数据库名?characterEncoding=utf8
```

- 如果服务器是本地，端口号是默认的`3306`，可以简写：

```properties
jdbc:mysql:///数据库名
```

#### 20.2.6 得到连接对象

1、代码示例

```java
package cn.guardwhy_01;
/**
 * 得到数据库连接对象
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCDemo01 {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/db_jdbc";
        /**
         * 方式一:使用用户名、密码、url得到连接对象
         */
        Connection connection1 = DriverManager.getConnection(url, "root", "root");
        // 实现Connection接口的子类对象
        System.out.println("数据库连接对象:" + connection1);

        /**
         * 方式二:使用属性文件和url得到连接对象
         */
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "root");
        // 2.实现connection接口
        Connection connection2 = DriverManager.getConnection(url, properties);
        System.out.println("数据库连接对象:" + connection2);
    }
}
```

### 20.3 获取语句执行平台

#### 20.3.1 Connection接口

- 通过`Connection`的 `createStatement`方法 获取`sql`语句执行对象。


| Connection方法                | 描述                  |
| ----------------------------- | --------------------- |
| `Statement createStatement()` | 创建一个`SQL`语句对象 |

#### 20.3.2 `Statement`接口

- `Statement`：代表一条语句对象，用于发送` SQL `语句给服务器，用于执行静态 `SQL `语句并返回它所生成结果的对象。

| Statement接口中的方法                | 描述                                                         |
| ------------------------------------ | ------------------------------------------------------------ |
| `boolean execute(String sql)`        | 作用：执行可以任意的`SQL`语句，通常用于执行`DDL`语句。<br/>返回值：如果第一个结果为`ResultSet`对象，则返回 `true`，如果其为更新计数或者不存在任何结果，则返回`false`。 |
| `int executeUpdate(String sql)`      | 作用：用于执行增删改。返回值：表中影响的行数                 |
| `ResultSet executeQuery(String sql)` | 作用：用于执行查询操作。返回值：查询到的结果集               |

1、编写SQL语句

```sql
-- 创建jdbc_user表
CREATE TABLE jdbc_user (
	id INT PRIMARY KEY AUTO_INCREMENT ,
	username VARCHAR(50),
	PASSWORD VARCHAR(50),
	birthday DATE
);
-- 添加数据
insert into jdbc_user (username, PASSWORD, birthday) values
('Curry', '123', '2001/1/02'),
('Kobe', '456', '1991/10/14'),
('James', '6666', '1987/11/24'),
('Hardon', '6666', '1987/3/24');

select * from jdbc_user;
```

4、代码示例

```java
package cn.guardwhy.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo02 {
    public static void main(String[] args) throws Exception {
        // 1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2.获取连接url,用户名，密码
        String url = "jdbc:mysql://localhost:3306/db_jdbc";
        Connection con = DriverManager.getConnection(url, "root", "root");
        // 3.获取Statement对象
        Statement statement = con.createStatement();
        // 4.执行创建表操作
        String sql = "create table jdbc02(id int, name varchar(20),age int)";
        // 5.增删改操作，增加一张表
        int i = statement.executeUpdate(sql);
        // 6.输出结果
        System.out.println(i);
        // 7.关闭流操作
        statement.close();
        con.close();
    }
}
```

#### 20.3.3 ResultSet接口

1、基本概念

==封装数据库查询的结果集，对结果集进行遍历，取出每一条记录==。

| **ResultSet接口中的方法**     | **描述**                                                     |
| ----------------------------- | ------------------------------------------------------------ |
| `boolean next()`              | 1. 指针向下移动一行<br />2. 返回`boolean`，如果返回`true`表示当前行有数据，`false`表示结束了。 |
| 数据类型  `get`数据类型(参数) | 1) 通过列名，参数是 `String` 类型。返回不同的类型。<br/>2) 通过列号，参数是整数，从 `1` 开始。返回不同的类型。 |

2、代码示例

```java
package cn.guardwhy.demo01;

import java.sql.*;

public class JdbcDemo03 {
    public static void main(String[] args) throws Exception {
        // 1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2.获取连接url,用户名，密码
        String url = "jdbc:mysql://localhost:3306/db_jdbc";
        Connection con = DriverManager.getConnection(url, "root", "root");
        // 3.获取Statement对象
        Statement statement = con.createStatement();
        String sql = "select * from jdbc_user";
        // 4.执行查询操作，返回结果集对象
        ResultSet resultSet = statement.executeQuery(sql);
        // 5.使用while循环
        while (resultSet.next()){
            // 5.1 获取id
            int id = resultSet.getInt("id");
            // 5.2 获取username
            String username = resultSet.getString("username");
            // 5.3 获取birthday
            Date birthday = resultSet.getDate("birthday");

            // 输出结果
            System.out.println("编号: " + id + ", 用户名:" + username + ", 生日:" + birthday);
        }

        // 6.关闭连接对象
        resultSet.close();
        statement.close();
        con.close();
    }
}
```

#### 20.3.4 释放资源

1、基本概念

- 需要释放的对象：`ResultSet` 结果集，`Statement` 语句，`Connection` 连接
- 释放原则：先开的后关，后开的先关。`ResultSet ==> Statement ==> Connection`
- 与`IO`流一样，==使用后的东西都需要关闭！关闭的顺序是先开后关, 先得到的后关闭，后得到的先关闭==。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/17-mysql.png" style="zoom:67%;" />

2、代码示例

```java
package cn.guardwhy.demo01;

import java.sql.*;

public class JdbcDemo04 {
    public static void main(String[] args)  {

        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            // 2.获取连接url,用户名，密码
            String url = "jdbc:mysql://localhost:3306/db_jdbc";
            con = DriverManager.getConnection(url, "root", "root");
            // 3.获取Statement对象
            statement = con.createStatement();
            String sql = "select * from jdbc_user";
            // 4.执行查询操作，返回结果集对象
             resultSet = statement.executeQuery(sql);
            // 5.使用while循环
            while (resultSet.next()){
                // 5.1 获取id
                int id = resultSet.getInt("id");
                // 5.2 获取username
                String username = resultSet.getString("username");
                // 5.3 获取birthday
                Date birthday = resultSet.getDate("birthday");

                // 输出结果
                System.out.println("编号: " + id + ", 用户名:" + username + ", 生日:" + birthday);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 6.关闭连接对象
            try {
                resultSet.close();
                statement.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
```

3、执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/18-mysql.png)

### 20.4 数据库操作(Java)

#### 20.4.1 Jdbc工具类

1、代码示例

```java
package cn.guardwhy.utils;

import java.sql.*;

/*
* jdbc工具类
*/
public class JDBCUtils {
    //1. 定义字符串常量, 获取连接所需要的信息
    public static final String DRIVERNAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/db_jdbc?characterEncoding=UTF-8";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    // 2.注册加载驱动
    static {
        // 2.1 注册驱动
        try {
            Class.forName(DRIVERNAME);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 3.获取连接对象
    public static Connection getConnection(){
        try {
            // 3.1获取连接对象
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            // 3.2 返回连接对象
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    // 4.关闭连接对象
    public static void close(Connection connection, Statement  statement){
        // 4.1 判断语句对象是否为空
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            // 4.2 判断语句连接对象是否为空
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    // 5.关闭连接等对象
    public static void close(Connection connection, Statement statement,
                             ResultSet rs) {
        // 5.1判断结果集是否为空
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(connection, statement);
    }
}
```

#### 20.4.2 执行DDL操作

1、代码示例

```java
package cn.guardwhy.demo01;

import cn.guardwhy.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo05 {
    public static void main(String[] args) {
        // 1.创建数据表
        String sql = "create table student ( id int primary key auto_increment, " +
                "name varchar(20) not null," +
                "sex boolean, " +
                "birthday date)";
        try {
            // 2.创建数据库连接
            Connection connection = JDBCUtils.getConnection();
            // 3.通过连接对象创建语句对象
            Statement statement = connection.createStatement();
            // 4.通过语句对象执行DDL
            statement.execute(sql);
            System.out.println("创建表成功...");
        } catch (SQLException e) {
            // 关闭语句和连接对象
            e.printStackTrace();
            System.out.println("创建数据表失败...");
        }
    }
}
```

#### 20.4.3 执行DML操作

增删改使用`statement`接口中的`executeUpdate()`方法。

1、代码示例

```java
package cn.guardwhy.demo01;
/**
 * JDBC:执行DML操作
 */
import cn.guardwhy.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcDemo06 {

    @Test
    // 向学生表添加4条记录
    public void insert()throws SQLException {
        // 1.创建数据库连接对象
        Connection connection = JDBCUtils.getConnection();
        // 2.通过连接对象获得语句对象
        Statement statement = connection.createStatement();
        // 3.执行增删操作
        int row = statement.executeUpdate("insert into student (name,sex,birthday) values ('侯大利',1,'1999-2-10')," +
                "('田甜',1,'1999-5-10'),('杨红',1,'1999-2-10'),('张晓',1,'1999-2-10')");
        // 4.输出影响的行数
        System.out.println("添加了" + row + "行记录");

        // 5.关闭资源
        JDBCUtils.close(connection, statement);
    }

    @Test
    // 更新其中1条记录
    public void update() throws SQLException{
        // 1.创建数据库连接对象
        Connection connection = JDBCUtils.getConnection();
        // 2.通过连接对象得到语句对象
        Statement statement = connection.createStatement();
        // 3.执行修改操作
        int row = statement.executeUpdate("update student set name='宁玲', sex=0, birthday='1996-04-12'where id = 3");
        // 4.输出影响的行数
        System.out.println("更新了" + row + "行的数据");
        // 5.释放资源
        JDBCUtils.close(connection, statement);
    }

    @Test
    // 删除其中1条记录
    public void delete() throws SQLException{
        // 1.创建数据库连接对象
        Connection connection = JDBCUtils.getConnection();
        // 2.通过连接对象得到语句对象
        Statement statement = connection.createStatement();
        // 3.执行修改操作
        int row = statement.executeUpdate("delete from student where id = 4");
        // 4.输出影响的行数
        System.out.println("删除" + row + "行的数据");
        // 5.释放资源
        JDBCUtils.close(connection, statement);
    }
}
```

#### 20.4.4 执行DQL操作

1、代码示例

```java
package cn.guardwhy.demo01;

import cn.guardwhy.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * 查询学生表中的所有记录,并且输出
 */
public class JdbcDemo07 {
    public static void main(String[] args) throws SQLException {
        // 1.创建连接
        Connection connection = JDBCUtils.getConnection();
        // 2.通过连接对象得到语句对象
        Statement statement = connection.createStatement();
        // 3.通过语句对象执行sql语句，返回结果集
        ResultSet rs = statement.executeQuery("select * from student");
        // 4.遍历结果集
        while(rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            boolean sex = rs.getBoolean(3);
            Date birthday = rs.getDate(4);
            // 输出结果
            System.out.println("编号:" + id + ",姓名:" + name + ", 性别:" + (sex? "男":"女") + ", 生日:" + birthday);
        }
        // 5.释放资源
        JDBCUtils.close(connection, statement, rs);
    }
}
```

2、执行结果

​	![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/19-mysql.png)

### 20.5 预处理对象

#### 20.5.1 PreparedStatement接口

1、基本概念

- `PreparedStatement` 是 `Statement`接口的子接口，继承于父接口中所有的方法。它是一个预编译的`SQL`语句对象。
- ==预编译: 是指SQL 语句被预编译,并存储在 PreparedStatement 对象中，然后可以使用此对象多次高效地执行该语句==。

2、执行原理

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211105210727.png" style="zoom:80%;" />

3、代码示例

```java
package cn.guardwhy.demo02;

import cn.guardwhy.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo01 {
    public static void main(String[] args) throws SQLException {
        // 1.创建连接对象
        Connection con = JDBCUtils.getConnection();
        // 2.执行Sql语句执行对象
        Statement st = con.createStatement();
        // 3.插入数据
        st.executeUpdate("insert into jdbc_user values(null,'侯大力','xyxwer123','1992/12/26')");
        st.executeUpdate("insert into jdbc_user values(null,'张小欣','wazg456','1995/2/21')");

        // 4.获取预处理对象
        PreparedStatement pst = con.prepareStatement("insert into jdbc_user values(?,?,?,?)");
        // 5.插入数据
        pst.setString(1,null);
        pst.setString(2,"田甜");
        pst.setString(3,"tt134567");
        pst.setString(4,"1993/4/10");
        pst.executeUpdate();

        pst.setString(1,null);
        pst.setString(2,"杨帆");
        pst.setString(3,"yf223");
        pst.setString(4,"1991/5/1");
        pst.executeUpdate();

        // 6.释放资源
        st.close();
        pst.close();
        con.close();
    }
}
```

4、原理图

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/20-mysql.png" style="zoom: 67%;" />

#### 20.5.2 对比Statement接口

- 有预编译的功能，执行效率更高
- 更加安全性，没有`SQL`语句字符串拼接操作。没有`SQL`注入的安全隐患。
- 代码的可读性更强。需要使用`set`方法来替换占位符为真实的值。

#### 20.5.3 PreparedStatement对象

1、基本概念

- 通过`Connection`创建`PreparedStatement`对象

| Connection接口中的方法                           | 描述                                  |
| ------------------------------------------------ | ------------------------------------- |
| `PreparedStatement prepareStatement(String sql)` | 创建语句对象并且提交预编译的`SQL`语句 |

2、`PreparedStatement`接口常用方法

| PreparedStatement接口中的方法 | 描述                            |
| ----------------------------- | ------------------------------- |
| `int executeUpdate()`         | 执行增删改，不需要提供`SQL`语句 |
| `ResultSet  executeQuery()`   | 执行查询，不需要提供`SQL`语句   |

3、使用PreparedStatement的步骤

- 编写 SQL 语句，未知内容使用`?`占位

```sql
SELECT * FROM jdbc_user WHERE username=? AND password=? ;
```

- 获得 `PreparedStatement` 对象 
- 设置实际参数：`setXxx`( 占位符的位置, 真实的值) 
- 执行参数化 `SQL` 语句
- 关闭资源

| setXxx重载方法                                 | **说明**                                |
| ---------------------------------------------- | --------------------------------------- |
| `void setDouble(int parameterIndex, double x)` | 将指定参数设置为给定` Java double `值。 |
| `void setInt(int parameterIndex, int x)`       | 将指定参数设置为给定` Java int` 值。    |
| `void setString(int parameterIndex, String x)` | 将指定参数设置为给定` Java String` 值。 |
| `void setObject(int parameterIndex, Object x)` | 使用给定对象设置指定参数的值。          |

#### 20.5.4 执行DML操作

1、代码示例

```java
package cn.guardwhy_04;

import cn.Utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 使用PreparedStatement实现增删改操作
 */
public class PreparedStatementDemo01 {
    @Test
    public void insert() throws SQLException{
        // 1.得到连接对象
        Connection connection = JdbcUtils.getConnection();
        // 2.通过连接对象创建预编译语句,提供占位符的SQL语句
        PreparedStatement ps = connection.prepareStatement("insert into student values(null,?,?,?)");
        // 3.替换占位符
        ps.setString(1, "丁浩");
        ps.setBoolean(2, false);
        ps.setDate(3, Date.valueOf("1991-03-22"));
        // 4.执行增删改操作
        int row = ps.executeUpdate();
        // 5.返回影响的行数
        System.out.println("添加了" + row + "行记录");
        // 6.释放资源
        JdbcUtils.close(connection, ps);
    }

    @Test
    public void update() throws SQLException{
        // 1.得到连接对象
        Connection connection = JdbcUtils.getConnection();
        // 2.通过连接对象创建预编译语句,提供占位符的SQL语句
        PreparedStatement ps = connection.prepareStatement("update student set name=?, birthday=? where id=?");
        // 3.替换占位符
        ps.setString(1, "葛向东");
        ps.setDate(2, Date.valueOf("1986-03-12"));
        ps.setInt(3, 2);
        // 4.执行增删改操作
        int row = ps.executeUpdate();
        // 5.返回影响的行数
        System.out.println("更新了" + row + "行记录");
        // 6.释放资源
        JdbcUtils.close(connection, ps);
    }

    @Test
    public void delete() throws SQLException{
        // 1.得到连接对象
        Connection connection = JdbcUtils.getConnection();
        // 2.通过连接对象创建预编译语句,提供占位符的SQL语句
        PreparedStatement ps = connection.prepareStatement("delete from student where id = ?");
        // 3.替换占位符
        ps.setInt(1, 1);
        // 4.执行增删改操作
        int row = ps.executeUpdate();
        // 5.返回影响的行数
        System.out.println("删除了" + row + "行记录");
        // 6.释放资源
        JdbcUtils.close(connection, ps);
    }
}
```

#### 20.5.5 执行DQL封装成集合

1、需求

查询所有的学生类，封装成List\<Student>返回。

2、表与类之间的关系

- 如果查询的结果集只有一条记录，封装成一个Student对象。(实体类：封装数据)

- 如果有多个记录，封装成List\<Student>对象

3、ORM 对象关系映射

- 类对应表结构
- 对象对象表中记录
- 成员变量对应字段名字

3、代码示例

实体类: `Student`

```java
package cn.guardwhy.demo03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
学生实体类
*/
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private boolean sex;
    private Date birthday;
}

```

测试类:`JDBCList01`

```java
package cn.guardwhy_04;

import cn.Enty.Student;
import cn.Utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCList01 {
    public static void main(String[] args) throws SQLException{
        // 1.创建stus集合对象
        List<Student> stus = new ArrayList<>();
        // 2.创建连接对象
        Connection connection = JdbcUtils.getConnection();
        // 3.得到预编译的语句对象
        PreparedStatement ps = connection.prepareStatement("select * from student");
        // 4.查询得到结果集
        ResultSet rs = ps.executeQuery();
        // 5.遍历结果集,将每条记录封装成一个Student对象
        while (rs.next()){
            Student stu = new Student();
            // 封装所有属性
            stu.setId(rs.getInt("id"));
            stu.setName(rs.getString("name"));
            stu.setSex(rs.getBoolean("sex"));
            stu.setBirthday(rs.getDate("birthday"));
            // 将stu添加到List中
            stus.add(stu);
        }
        // 6.释放资源
        JdbcUtils.close(connection, ps, rs);
        // 7.输出list集合
        stus.forEach(System.out::println);
    }
}
```

4、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/21-mysql.png)	

#### 20.5.6 释放资源

- 每次访问数据库结束，都需要释放资源。
- 需要释放的对象：结果集，语句对象，连接对象
- 释放顺序：先开的后关，后开的先关，关闭顺序：`ResultSet --> Statement -> Connection`。

### 20.6 JDBC控制事务

#### 20.6.1 事务相关API

使用`JDBC`来处理事务：实现银行转账的操作

| 事务相关的方法                           | **说明**                                                     |
| ---------------------------------------- | ------------------------------------------------------------ |
| `void setAutoCommit(boolean autoCommit)` | 参数是` true` 或 `false` 如果设置为 `false`，表示关闭自动提交，相当于开启事务。 |
| `void commit()`                          | 提交事务                                                     |
| `void rollback()`                        | 回滚事务                                                     |

#### 20.6.2 SQL数据

```mysql
-- 创建数据表
CREATE TABLE account (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(10),  -- 名字
    balance DOUBLE  -- 余额
);
 
-- 添加数据
INSERT INTO account (name, balance) VALUES ('Jack', 1000), ('Rose', 1000);
select * from account;
```

#### 20.6.3 事务代码

1、代码示例

```java
package cn.guardwhy_03;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import cn.Utils.JdbcUtils;

public class TransactionDemo02 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            //1.得到连接对象
            connection = JdbcUtils.getConnection();
            // 2.开启事务
            connection.setAutoCommit(false);
            //3.得到语句对象
            statement = connection.createStatement();
            //4.执行更新操作2次，扣钱，加钱
            statement.executeUpdate("update account set balance = balance - 500 where name='Jack'");
            // 模拟代码出现异常
            int i = 10 / 0;
            statement.executeUpdate("update account set balance = balance + 500 where name='Rose'");
            // 5.提交事务
            connection.commit();
            System.out.println("转账成功");
        } catch (Exception e) {
            e.printStackTrace();
            try {
                // 回滚事务
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("转账失败");
        } finally {
            //4.释放资源
            JdbcUtils.close(connection, statement);
        }
    }
}
```

#### 20.6.4 用户登陆

1、需求实现

通过访问数据库，查询数据库中的用户，实现登录的功能。

2、创建user表

```mysql
-- 建表
create table `user`(
    id int primary key auto_increment,
    name varchar(20),
    password varchar(32)
);

-- 插入记录
insert into `user` values(null,'Jack','123'),(null,'Rose','456');
select * from user;
```

3、实现用户登录

```java
package cn.guardwhy_02;

import cn.Utils.JdbcUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * 实现用户的登陆
 */
public class LoginDemo02 {
    public static void main(String[] args) throws SQLException {
        // 1.用于用户的输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = scanner.nextLine();

        // 2.密码输入
        System.out.println("请输入密码:");
        String password = scanner.nextLine();
        // 3.执行SQL语句
        String sql = "select * from user where name=? and password=?";

        // 4.通过工具类得到连接对象
        Connection connection = JdbcUtils.getConnection();
        // 5.通过连接对象创建预编译的语句对象
        PreparedStatement ps = connection.prepareStatement(sql);
        // 6.替换占位符
        ps.setString(1,name);
        ps.setString(2, password);

        // 7.执行SQL语句,使用字符串拼接的方式创建SQL语句
        ResultSet rs = ps.executeQuery();
        // 8.查询得到结果集,如果结果集中有记录表示登录成功,否则登录失败
        if(rs.next()){
            System.out.println("欢迎你" + name + ", 登陆成功!!");
        }else {
            System.out.println("登陆失败..");
        }

        // 释放工具类资源
        JdbcUtils.close(connection, ps, rs);
    }
}
```

## 第21章 数据库连接池

### 21.1 连接池

#### 21.1.1 连接池基本特点

1、什么是连接池

- 实际开发中==“获得连接==”或==“释放资源”==是非常消耗系统资源的两个过程，为了解决此类性能问题，通常情况采用连接池技术，来共享连接`Connection`。
- 这样就不需要每次都创建连接、释放连接了，这些操作都交给了连接池。

2、连接池的好处

- 用池来管理`Connection`，这样可以重复使用`Connection`。 当使用完`Connection`后，调用`Connection`的`close()`方法也不会真的关闭`Connection`，而是把`Connection`==“归还”==给池。

#### 21.1.2 JDBC方式与连接池方式

- 普通 JDBC方式

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/22-mysql.png" style="zoom: 67%;" />

- 连接池方式

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/23-mysql.png" style="zoom:67%;" />

#### 21.1.3 如何使用数据库连接池

`Java`为数据库连接池提供了公共的接口：`javax.sql.DataSource`各个厂商需要让自己的连接池实现这个接口，应用程序可以方便的切换不同厂商的连接池。

#### 21.1.4 SQL语句

```sql
## 创建员工表
create table employee (
	eid int primary key auto_increment ,
	ename varchar (20), -- 员工姓名
	age int , -- 员工年龄
	sex varchar (6), -- 员工性别
	salary double , -- 薪水
	empdate date -- 入职日期
);

-- 插入数据
insert into employee (eid, ename, age, sex, salary, empdate) values(null,'田甜',22,'女',4000,'2018-11-12');
insert into employee (eid, ename, age, sex, salary, empdate) values(null,'杨帆',20,'女',5000,'2019-03-14');
insert into employee (eid, ename, age, sex, salary, empdate) values(null,'侯大力',40,'男',6000,'2020-01-01');
insert into employee (eid, ename, age, sex, salary, empdate) values(null,'夏雨',25,'男',3000,'2017-10-01');

-- 查询数据
select * from employee;
```

### 21.2 DBCP连接池

#### 21.2.1 添加依赖

```xml
<!--dbcp连接池-->
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-dbcp2</artifactId>
    <version>2.7.0</version>
</dependency>
```

#### 21.2.2  编写工具类

连接数据库表的工具类, 采用`DBCP`连接池的方式来完成

- `Java`中提供了一个连接池的规则接口: `DataSource` , 它是`java`中提供的连接池。
- 在`DBCP`包中提供了`DataSource`接口的实现类，要用的具体的连接池`BasicDataSource`类。

```java
package cn.guardwhy.utils;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCPUtils {
    //1. 定义字符串常量, 获取连接所需要的信息
    public static final String DRIVERNAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/db_jdbc?characterEncoding=UTF-8";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    // 2.创建连接池对象(有dbcp提供的实现类)
    public static BasicDataSource dataSource = new BasicDataSource();
    // 3.使用静态代码块进行配置
    static {
        dataSource.setDriverClassName(DRIVERNAME);
        dataSource.setUrl(URL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);
    }
    // 4.获取连接的方法
    public static Connection getConnection() throws SQLException {
        // 4.1 从连接池中获取连接
        Connection connection = dataSource.getConnection();
        return connection;
    }
    // 5.释放资源
    public static void close(Connection connection, Statement statement){
        // 5.1 条件判断
        if(connection != null && statement != null){
            try {
                statement.close();
                // 5.2 归还连接
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // 6.关闭连接
    public static void close(Connection connection, Statement statement, ResultSet resultSet){
        // 6.1 条件判断
        if(connection != null && statement != null && resultSet != null){
            try {
                resultSet.close();
                statement.close();
                // 6.1 归还连接
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
```

#### 21.2.3 测试工具类

1、需求: 查询所有员工的姓名

代码示例

```java
package cn.guardwhy.test;

import cn.guardwhy.utils.DBCPUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
* 测试dbcp连接池
*/
public class TestDbcp {
    public static void main(String[] args) throws SQLException {
        // 1.从dbcp连接池中拿到连接对象
        Connection connection = DBCPUtils.getConnection();
        // 2. 获取statement对象
        Statement statement = connection.createStatement();
        // 3.查询所有员工的姓名
       String sql = "select ename from employee";
       ResultSet resultSet = statement.executeQuery(sql);

       // 4.处理结果集
        while (resultSet.next()){
            String ename = resultSet.getString("ename");
            System.out.println("员工姓名:" + ename);
        }
        // 5.释放资源
        DBCPUtils.close(connection, statement, resultSet);
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/24-mysql.png" style="zoom:80%;" />	

### 21.3 Druid连接池

`Druid(德鲁伊)`是阿里巴巴开发的号称为监控而生的数据库连接池，`Druid`是目前最好的数据库连接池。在功能、性能、扩展性方面，都超过其他数据库连接池，同时加入了日志监控，可以很好的监控`DB`池连接和`SQL`的执行情况。

#### 21.3.1 添加依赖

```xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>druid</artifactId>
    <version>1.1.10</version>
</dependency>
```

#### 21.3.2 导入配置文件

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaWEB/image03/25-mysql.png" style="zoom:80%;" />

```properties
driverClassName=com.mysql.jdbc.Driver
url=jdbc:mysql://127.0.0.1:3306/db_jdbc?characterEncoding=UTF-8&rewriteBatchedStatements=true
username=root
password=root
initialSize=5
maxActive=10
maxWait=3000
```

#### 21.3.3 编写Druid工具类

1、相关步骤

- 获取数据库连接池对象
- 通过工厂来来获取`DruidDataSourceFactory`类的`createDataSource`方法。
- `createDataSource(Properties p)`方法参数可以是一个属性集对象。

2、代码示例

```java
package cn.guardwhy.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DruidUtils {
    //1.定义成员变量
    public static DataSource dataSource;

    //2.静态代码块
    static{
        try {
            //3.创建属性集对象
            Properties p = new Properties();

            //4.加载配置文件 Druid 连接池不能够主动加载配置文件 ,需要指定文件
            InputStream inputStream = DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties");

            //5. 使用Properties对象的 load方法 从字节流中读取配置信息
            p.load(inputStream);

            //6. 通过工厂类获取连接池对象
            dataSource = DruidDataSourceFactory.createDataSource(p);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取连接的方法
    public static Connection getConnection(){

        try {
            return dataSource.getConnection();

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //获取Druid连接池对象的方法
    public static DataSource getDataSource(){
        return dataSource;
    }
    
    //释放资源
    public static void close(Connection con, Statement statement){

        if(con != null && statement != null){
            try {
                statement.close();
                //归还连接
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    // 释放资源
    public static void close(Connection con, Statement statement, ResultSet resultSet){

        if(con != null && statement != null && resultSet != null){
            try {
                resultSet.close();
                statement.close();
                //归还连接
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
```

#### 21.3.4 测试工具类

1、需求: 查询薪资在`3000 - 5000`元之间的员工姓名

代码示例

```java
package cn.guardwhy.test;

import cn.guardwhy.utils.DruidUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDruid {
    // 需求 查询 薪资在3000 到 5000之间的员工的姓名
    public static void main(String[] args) throws SQLException {

        //1.获取连接
        Connection con = DruidUtils.getConnection();

        //2.获取Statement对象
        Statement statement = con.createStatement();

        //3.执行查询
        ResultSet resultSet = statement.executeQuery("select ename from employee where salary between 3000 and 5000");

        //4.处理结果集
        while(resultSet.next()){
            String ename = resultSet.getString("ename");
            System.out.println(ename);
        }

        //5.释放资源
        DruidUtils.close(con,statement,resultSet);
    }
}
```



