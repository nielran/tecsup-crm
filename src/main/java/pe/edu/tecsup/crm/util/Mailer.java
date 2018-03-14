package pe.edu.tecsup.crm.util;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;

@Component
public class Mailer {

    private static final Logger log = Logger.getLogger(Mailer.class);

    private static final String SUBJECT = "CRM-Integración: ";

    @Autowired
    private JavaMailSender javaMailSender;

    @Async // http://therealdanvega.com/blog/2016/01/13/sending-async-emails-in-spring
    public void sendMailToAdministrator(String subject, String message, String to){
        log.info("sendMailToAdministrator: " + "s:" + subject + "m:" + message);
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mailMsg = new MimeMessageHelper(mimeMessage);
            mailMsg.setFrom(Constant.EMAIL_FROM);
            mailMsg.setTo(to);
            mailMsg.setCc(Constant.EMAIL_CC);
            mailMsg.setSubject(SUBJECT + subject);
            mailMsg.setText(message, false);
            javaMailSender.send(mimeMessage);
        }catch (Exception e){
            log.error(e, e);
        }
    }

}
