package com.more.friday.mail.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class Mailservice {

//    private Logger logger= LoggerFactory.getLogger(this.getClass());
//
//    @Value("${spring.mail.username}")
//    private String from;
//    @Autowired
//    private JavaMailSender mailSender;
//
//    public void sendSimpleMail(String to,String subject,String content){
//        SimpleMailMessage message=new SimpleMailMessage();
//        message.setTo(to);
//        message.setSubject(subject);
//        message.setText(content);
//        message.setFrom(from);
//
//        mailSender.send(message);
//    }
//
//    public void sendHtmlMail(String to,String subject,String content) throws MessagingException {
//        MimeMessage mimeMessage=mailSender.createMimeMessage();
//
//        MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true);
//        helper.setFrom(from);
//        helper.setTo(to);
//        helper.setSubject(subject);
//        helper.setText(content,true);
//        mailSender.send(mimeMessage);
//    }
//
//    public void sendAttachmenttsMail(String to,String subject,String content,String filePath) {
//
//
//        MimeMessage mimeMessage=mailSender.createMimeMessage();
//        MimeMessageHelper helper= null;
//        try {
//            helper = new MimeMessageHelper(mimeMessage,true);
//            helper.setFrom(from);
//            helper.setTo(to);
//            helper.setSubject(subject);
//            helper.setText(content,true);
//
//            FileSystemResource  file=new FileSystemResource(new File(filePath));
//            String fileName=file.getFilename();
//            helper.addAttachment(fileName,file);
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//
//        mailSender.send(mimeMessage);
//    }
//
//
//    public  void sendInLinResourceMail(String to,String subject,String content,String rscPath,String rscId)  {
//        logger.info("发送静态文件开始:{},{},{},{},{}",to,subject,content,rscPath,rscId);
//        MimeMessage mimeMessage=mailSender.createMimeMessage();
//        MimeMessageHelper helper= null;
//        try {
//            helper = new MimeMessageHelper(mimeMessage,true);
//            helper.setFrom(from);
//            helper.setTo(to);
//            helper.setSubject(subject);
//            helper.setText(content,true);
//
//            FileSystemResource  res=new FileSystemResource(new File(rscPath));
//            helper.addInline(rscId,res);
//            mailSender.send(mimeMessage);
//            logger.info("发送静态文件成功");
//        } catch (MessagingException e) {
//            logger.error("发送静态文件异常",e);
//            e.printStackTrace();
//        }
//
//    }
}
