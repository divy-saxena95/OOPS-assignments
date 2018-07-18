package Main;

import hostping.HostPinging;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Host address");
        String ip=input.next();
        System.out.println("Enter number of times to ping");
        int n;
        n = Integer.parseInt(input.next());
        System.out.printf("Ping %s%n", ip);
        HostPinging p=new HostPinging();
        p.ping(ip,n);
    }
}
