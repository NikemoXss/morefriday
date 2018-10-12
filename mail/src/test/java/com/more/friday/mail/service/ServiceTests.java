package com.more.friday.mail.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.annotation.Resource;
import javax.mail.MessagingException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTests {

    @Resource
    Mailservice mailservice;
    @Autowired
    TemplateEngine templateEngine;

//    @Test
//    public void sendSimpleMailTest(){
//        mailservice.sendSimpleMail("2918923409@qq.com","这是第2封邮件！",
//                "大家好，这是我的第2封邮件");
//    }
//
//    @Test
//    public void sendHtmlTest() throws MessagingException {
//        String c="<html>\n" +
//                "<body>\n" +
//                "        <h1>这是一份html邮件</h1>\n" +
//                "</body>\n" +
//                "</html>";
//        mailservice.sendHtmlMail("2918923409@qq.com","这是第html封邮件！", c);
//    }
//
//    @Test
//    public void sendAttachmentsTest() throws MessagingException {
//        //String filePath="G:/hehe.txt";
//        String filePath="G:/ewm.png";
//        mailservice.sendAttachmenttsMail("2918923409@qq.com","附件邮件","这是封附件邮件内容！",filePath);
//    }
//
//        //        String p="http://pic22.photophoto.cn/20120309/0005018327703583_b.jpg";
//        @Test
//        public void sendInLinResourceMailTest() {
//           // String p="http://pic22.photophoto.cn/20120309/0005018327703583_b.jpg";
//            String p="G:/ewm.png";
//            String id="pic1";
//            String c="<html>\n" +
//                    "<body>\n" +
//                    "        <h1>这是一份html邮件</h1>\n" +
//                    "<img src=\'cid:"+id+
//                    "\'></img>\n"+
//                    "</body>\n" +
//                    "</html>";
//            mailservice.sendInLinResourceMail("2918923409@qq.com","图片附件邮件",c,p,id);
//        }
//        @Test
//        public void  testMail() throws MessagingException {
//            Context context=new Context();
//            context.setVariable("id","006");
//            String emailcontext=templateEngine.process("mail",context);
//            mailservice.sendHtmlMail("2918923409@qq.com","这是第html模板封邮件！", emailcontext);
//        }

}
