package com.yjhdemo.spring5jdbctemplate.Test;

import com.yjhdemo.spring5jdbctemplate.Service.BookService;
import com.yjhdemo.spring5jdbctemplate.Service.UserService;
import com.yjhdemo.spring5jdbctemplate.yjh;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Testyjh {
    @Test
    public void testadd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        yjh yjh = new yjh();
        yjh.setId(10);
        yjh.setLikename("789");
        yjh.setName("789");
        yjh.setSex("男");
        bookService.addyjh(yjh);
    }

    @Test
    public void testxiugai(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        yjh yjh = new yjh();
        yjh.setId(4);
        yjh.setLikename("java");
        yjh.setName("spring");
        yjh.setSex("男");
        bookService.xiugai(yjh);
    }
    @Test
    public void testdel(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        yjh yjh = new yjh();
        yjh.setId(2);
        yjh.setLikename("789");
        yjh.setName("789");
        yjh.setSex("男");
        bookService.delbook(yjh.getId());
    }
//    返回表中的记录数值的条数
    @Test
    public void testcount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.selectcount());
    }
    //    返回表中的对象
    @Test
    public void testobj(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.selectobj(4).toString());
    }
//    返回list集合
@Test
public void testlist(){
    ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
    BookService bookService = context.getBean("bookService", BookService.class);
    System.out.println(bookService.selectlist().toString());
}
    //    返回list集合
    @Test
    public void addlist(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]>list = new ArrayList<>();
        Object [] obj0 = {1,"kotlin","男","科特林"};
        Object [] obj1 = {1,"jsp","男","科特林"};
        Object [] obj2 = {1,"mvc","男","科特林"};
        Object [] obj3 = {1,"mvvm","男","科特林"};
        Object [] obj5 = {1,"mvp","男","科特林"};
        list.add(obj0);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj5);
        bookService.addlist(list);
    }
//    批量修改
    @Test
    public void xiulist(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]>list = new ArrayList<>();
        Object [] obj0 = {"kotlin","男","科特林",4};
        Object [] obj1 = {"jsp","男","科特林",1};
        Object [] obj2 = {"mvc","女","腰细",2};
        Object [] obj3 = {"mvvm","女","花姑娘",3};
        Object [] obj5 = {"mvp","男","阿斯顿",4};
        list.add(obj0);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj5);
        bookService.xiuadd(list);
    }
    @Test
    public void dellist(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]>list = new ArrayList<>();
        Object [] obj3 = {3};
        Object [] obj5 = {4};
        list.add(obj3);
        list.add(obj5);
        bookService.dellist(list);
    }
    @Test
    public void testAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
