
package thursday;
import java.net.*;    
public class TryingURL{    
public static void main(String[] args){    
try{    
URL url=new URL("https://sabberrahman.vercel.app/aboutdev");    
    
System.out.println("Protocol: "+url.getProtocol());    
System.out.println("Host Name: "+url.getHost());    
System.out.println("Port Number: "+url.getPort());    
System.out.println("Default Port Number: "+url.getDefaultPort());       
System.out.println("Path: "+url.getPath());    
System.out.println("File: "+url.getFile());
System.out.println("authority: "+url.getAuthority()); 
System.out.println("authority: "+url.getContent()); 
System.out.println("inLine URl: "+ new URL("https://sabberrahman.vercel.app/projects#gdavsgdvasgdvagsvdgawvdg").getPath()); 
  
}catch(Exception e){System.out.println(e);}    
}    
}  
