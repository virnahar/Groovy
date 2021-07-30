
// You can extend the existing nx-blob-repo-space-report.groovy available at https://support.sonatype.com/hc/article_attachments/1500006456442/nx-blob-repo-space-report.groovy

import org.sonatype.nexus.email.EmailConfiguration
import org.sonatype.nexus.email.EmailManager
import org.apache.commons.mail.SimpleEmail
import org.apache.commons.mail.*;
def emailMgr = container.lookup(EmailManager.class.getName());
MultiPartEmail email = new MultiPartEmail();
email.setSubject("Nexus Storage Info");
email.setMsg("Hey, Please find attached Nexus Storage INFO :-)");
email.addTo("virnahar@gmail.com"); // Receiver Email

// Create the attachment
EmailAttachment attachment = new EmailAttachment();
attachment.setPath(resultsFile.absolutePath);
attachment.setDisposition(EmailAttachment.ATTACHMENT);
attachment.setDescription("NexusStorageINFO");
attachment.setName(resultsFile.absolutePath); // resultsFile.absolutePath it will generate automatically with the existing script.

 // Attach the attachment
email.attach(attachment)
emailMgr.send(email)
