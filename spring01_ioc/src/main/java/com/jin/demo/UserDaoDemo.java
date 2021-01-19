package com.jin.demo;

import com.jin.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {
    /**
     * 获取spring的Ioc核心容器，并根据id获取对象
     *
     * ApplicationContext的三个常用实现类：
     *      ClassPathXmlApplicationContext：它可以加载类路径下的配置文件，要求配置文件必须在类路径下。不在的话，加载不了。(更常用)
     *      FileSystemXmlApplicationContext：它可以加载磁盘任意路径下的配置文件(必须有访问权限）
     *
     *      AnnotationConfigApplicationContext：它是用于读取注解创建容器的，是明天的内容。
     *
     * 核心容器的两个接口引发出的问题：
     *  ApplicationContext:     单例对象适用              采用此接口
     *      它在构建核心容器时，创建对象采取的策略是采用立即加载的方式。也就是说，只要一读取完配置文件马上就创建配置文件中配置的对象。
     *
     *  BeanFactory:            多例对象使用
     *      它在构建核心容器时，创建对象采取的策略是采用延迟加载的方式。也就是说，什么时候根据id获取对象了，什么时候才真正的创建对象。
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        子类ClassPathXmlApplicationContext有 关闭方法，可以查看销毁方法
//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        ac.close();
//        ApplicationContext app = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\Jin_Spring\\spring_ioc\\src\\main\\resources\\applicationContext.xml");
//        当参数的数据类型是Class类型时，表示根据类型从容器中匹配Bean实例，当容器中相同类型的Bean有多个时，则此方法会报错。
        UserDao userDao = app.getBean("userDao", UserDao.class);
//        2.根据id获取Bean对象,需要强转
//        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }

}
