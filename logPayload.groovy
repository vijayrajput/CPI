import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.HashMap;
def Message processData(Message message) 
{
    def body = message.getBody(java.lang.String) as String;
    def messageLog = messageLogFactory.getMessageLog(message);
    if(messageLog != null)
    {
        messageLog.addAttachmentAsString("Payload", body, "text/plain");
    }
    return message;
}

def Message doTheLogging(String label, Message message)
{
    String loggingEnabled = message.getProperty("loggingEnabled");
    
    if (loggingEnabled != null && loggingEnabled.trim().length() > 0)
    {
      def body = message.getBody(java.lang.String) as String;
      def messageLog = messageLogFactory.getMessageLog(message);
      messageLog.addAttachmentAsString(label, body, "text/plain");
    }
    return message;
}

def Message log1(Message message) 
{
    return doTheLogging("01.Payload", message);
}

def Message log2(Message message) 
{
    return doTheLogging("02.Payload", message);
}

def Message log3(Message message) 
{
    return doTheLogging("03.Payload", message);
}

def Message log4(Message message) 
{
    return doTheLogging("04.Payload", message);
}

def Message log5(Message message) 
{
    return doTheLogging("05.Payload", message);
}

def Message log6(Message message) 
{
    return doTheLogging("06.Payload", message);
}

def Message log7(Message message) 
{
    return doTheLogging("07.Payload", message);
}

def Message log8(Message message) 
{
    return doTheLogging("08.Payload", message);
}

def Message log9(Message message) 
{
    return doTheLogging("09.Payload", message);
}

def Message log10(Message message) 
{
    return doTheLogging("10.Payload", message);
}

def Message log11(Message message) 
{
    return doTheLogging("11.Payload", message);
}

def Message log12(Message message) 
{
    return doTheLogging("12.Payload", message);
}

def Message log13(Message message) 
{
    return doTheLogging("13.Payload", message);
}

def Message log14(Message message) 
{
    return doTheLogging("14.Payload", message);
}

def Message log15(Message message) 
{
    return doTheLogging("15.Payload", message);
}