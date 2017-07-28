package ServidorVoIP;
import java.net.*;
import java.util.*;

public class ShowInterfaces {
    
        public static String interfaceIP()  throws Exception
        {
                System.out.println("Host addr: " + InetAddress.getLocalHost().getHostAddress());  // often returns "127.0.0.1"
                Enumeration<NetworkInterface> n = NetworkInterface.getNetworkInterfaces();
                for (; n.hasMoreElements();)
                {
                        NetworkInterface e = n.nextElement();
                        n.nextElement();
                        System.out.println("Interface: " + e.getName());
                        Enumeration<InetAddress> a = e.getInetAddresses();
                        for (; a.hasMoreElements();)
                        {
                                InetAddress addr = a.nextElement();
                                System.out.println("  " + addr.getHostAddress());
                                a.nextElement();
                                return addr.getHostAddress();
                        }
                }
                return null;
        }
}