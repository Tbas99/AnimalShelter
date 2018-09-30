package ObserverPattern;

import com.sun.mail.smtp.SMTPTransport;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class Customer implements Observer
{
    private String customerEmail;
    private String animalName;

    public Customer(String customerEmail, String animalName)
    {
        this.customerEmail = customerEmail;
        this.animalName = animalName;
    }

    public String getCustomerEmail()
    {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail)
    {
        this.customerEmail = customerEmail;
    }

    public String getAnimalName()
    {
        return animalName;
    }

    public void setAnimalName(String animalName)
    {
        this.animalName = animalName;
    }

    @Override
    public void update()
    {
        // Send a mail to the subject
        Properties props = System.getProperties();
        props.put("mail.smtps.host","smtp.gmail.com");
        props.put("mail.smtps.auth","true");
        Session session = Session.getInstance(props, null);
        Message msg = new MimeMessage(session);
        try
        {
            ((MimeMessage) msg).setFrom("tobiassagis@gmail.com");
            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(this.customerEmail, false));
            msg.setSubject("Notification Reserved Animal");
            ((MimeMessage) msg).setText(this.animalName + " Has been reserved and is no longer available!");
            msg.setHeader("Testmail", "Testvalue");
            msg.setSentDate(new Date());
            SMTPTransport t = (SMTPTransport) session.getTransport("smtps");
            t.connect("smtp.gmail.com", "tobiassagis@gmail.com", "Darkmalijn1998");
            t.sendMessage(msg, msg.getAllRecipients());
            System.out.println("Response: " + t.getLastServerResponse());
            t.close();
        }
        catch (MessagingException e)
        {
            e.printStackTrace();
        }
    }
}
