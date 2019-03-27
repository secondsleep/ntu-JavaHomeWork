# JavaSE前置

## 关于Java的几个术语

|  缩写  |           原名           |                                       描述                                       |
| :----: | :----------------------: | :------------------------------------------------------------------------------: |
|  JDK   |   Java Development Kit   |                         编写Java程序的程序员所使用的软件                         |
|  JRE   | Java Runtime Environment | 运行Java程序的用户使用的软件（包含虚拟机但没有编译器，提供给不需要编译器的用户） |
|        |     Server JRE           |                           在服务器上运行Java程序的软件                           |
|   SE   |     Standard Edition     |                        用于桌面或简单服务器应用的Java平台                        |
|   EE   |    Enterprise Edition    |                           用于复杂服务器应用的Java平台                           |
|   ME   |      Micro Edition       |                         用于手机和其他小型设备的Java平台                         |

### 对于Java新手开发员，我们需要 JDK（Java SE 开发包）

## 第一步，下载和设置JDK

1. 访问[https://www.oracle.com/technetwork/java/javase/downloads/index.html](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
2. 找到最新版本的Java SE（或者你喜欢的版本）,点击右侧的DOWNLOAD按钮
3. 在新弹出的网页下，点击单选框 Accept License Agreement，下载对应版本
ps. Linux系统建议选择.tar.gz版本，Windows可以选exe一键安装，安装路径名不要有空格
4. 设置JDK:（以下将使用**jdk**代称你的JDK安装目录，如何找到对应文件/面板请活用搜索引擎）
Windows和Linux上安装JDK时，需要将 **jdk**/bin 目录增加到执行路径中

   - Linux ：需要在 ~/.bashrc 或 ~/.bash_profile 文件的最后增加一行：
    export PATH=**jdk**/bin:$PATH
   - Windows : 控制面板-系统和安全-系统-高级系统设置-高级-环境变量，在“系统变量”列表找到名为Path的变量，
  点击编辑按钮，新建一个名为“**jdk**\bin”的目录路径
  大概最终效果：
  ![效果](/Images/addPathPic.png)

5. 安装库源文件和文档
  库源文件在JDK中以一个压缩文件src.zip的形式发布，需要解压缩才能访问，大概步骤：

     1. 确保JDK已经安装，**jdk**目录在执行路径中
     2. 在主目录中建立一个目录javasrc
     3. 在**jdk**目录下找到src.zip，解压缩到javasrc目录

6. 恭喜! JDK已经安装完成了！现在可以打开cmd，输入 javac -version 查看你的Java版本号

### 现在我们需要一个集成开发环境（IDE），当然你也可以选择命令行编译或者Java虚拟机，下面将展示Eclipse的安装和使用，这是一个开放源代码的、基于Java的可扩展开发平台。

## 第二步，下载和使用Eclipse

1. 访问[https://www.eclipse.org/downloads/packages/](https://www.eclipse.org/downloads/packages/)
2. 下拉，找到 Eclipse IDE for Java Developers，在右侧选择对应版本下载安装
3. 安装完后打开，可以自由选择默认工程路径
4. 创建Java工程，File-new-Java project ,命名你的工程，推荐勾选下面的默认路径，点击finish
5. 点击左侧的Restore，工作区弹出
6. 在你刚刚创建的project内创建一个类HelloWorld（会同时帮你创建同工程名的包）
7. 输入代码

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
 ```

8. 点击左上角Run-Run As-Java Application
9. 下面console窗口出现结果

### 小提示：Source-Format / Ctrl+Shift+F 格式化代码。

### Ctrl+/ 取消/加上注释。

### 最好先将文件写入格式转为utf-8，具体请用搜索引擎查询Eclipse 转UTF-8
