package com.yjhdemo.spring5jdbctemplate.Test;

import com.yjhdemo.spring5jdbctemplate.Service.BookService;
import com.yjhdemo.spring5jdbctemplate.yjh;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
}
