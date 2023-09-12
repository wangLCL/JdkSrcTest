package kw.jdk.test.net;

import org.junit.Test;

import java.net.*;
import java.util.Enumeration;
import java.util.List;

/**
 * 这个列表是Windows计算机上的各种网络适配器和相关组件的列表。这些是Windows网络堆栈的各种网络接口、虚拟适配器和过滤器。以下是其中一些的简要解释：
 *
 * Software Loopback Interface 1：环回接口用于在本地计算机上测试网络连接，而不实际通过物理网络发送数据。
 *
 * Microsoft Kernel Debug Network Adapter：用于内核级调试的组件，通常不用于常规网络操作。
 *
 * Microsoft 6to4 Adapter：使用6to4隧道技术在IPv4网络上启用IPv6通信。
 *
 * WAN Miniport (IP)：用于各种类型的广域网（WAN）连接的虚拟适配器。
 *
 * Microsoft IP-HTTPS Platform Adapter：用于通过HTTPS进行IPv6安全通信。
 *
 * WAN Miniport (IKEv2)：用于IKEv2 VPN连接的WAN迷你端口适配器。
 *
 * Realtek USB GbE Family Controller：一种物理网络适配器，可能是来自Realtek的USB以太网适配器。
 *
 * Microsoft Wi-Fi Direct Virtual Adapter：用于Wi-Fi Direct连接，允许设备在无需传统Wi-Fi网络的情况下相互通信。
 *
 * WAN Miniport (IPv6)：类似于WAN Miniport (IP)，但用于IPv6连接。
 *
 * Microsoft Teredo Tunneling Adapter：用于在IPv4网络上通过IPv6进行连接，特别是用于穿越NAT设备的隧道。
 *
 * WAN Miniport (SSTP)：用于SSTP VPN连接的WAN迷你端口适配器。
 *
 * WAN Miniport (PPPOE)：用于PPPoE（以太网点对点协议）连接的WAN迷你端口适配器。
 *
 * WAN Miniport (L2TP)：用于L2TP（第二层隧道协议）VPN连接的WAN迷你端口适配器。
 *
 * WAN Miniport (Network Monitor)：似乎与网络监控有关，可能被网络分析工具使用。
 *
 * Remote NDIS Compatible Device：用于远程网络驱动程序接口规范（NDIS）连接的虚拟网络适配器。
 *
 * Bluetooth Device (Personal Area Network)：用于蓝牙PAN（个人区域网络）连接。
 *
 * MediaTek Wi-Fi 6E MT7922 (RZ616) 160MHz PCIe Adapter：用于Wi-Fi 6E连接的物理网络适配器。
 *
 * 用于MediaTek Wi-Fi 6E适配器的各种过滤器驱动程序，可能用于数据包过滤和管理。
 *
 * 用于虚拟Wi-Fi Direct适配器的过滤器驱动程序和调度程序。
 *
 * 用于WAN Miniport适配器的过滤器驱动程序和调度程序。
 *
 * 这些适配器和过滤器在管理网络连接方面发挥不同的作用，包括物理网络接口、虚拟适配器和各种网络服务的协议。每个组件的具体用途可能会根据计算机的配置和用途而有所不同。
 */
public class Ipv4Net {
    @Test
    public void test(){
        try {
            Inet4Address inet4Address = (Inet4Address) Inet4Address.getByAddress("localhost",new byte[]{127,0,0,1});
            System.out.println(inet4Address);
            for (byte address : inet4Address.getAddress()) {
                System.out.println(address);
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void localAddr(){
        Enumeration<NetworkInterface> networkInterfaces = null;
        try {
            //网络接口（网卡）
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterface = networkInterfaces.nextElement();
//            System.out.println(networkInterface.getDisplayName());
//            List<InterfaceAddress> interfaceAddresses = networkInterface.getInterfaceAddresses();
//            for (InterfaceAddress interfaceAddress : interfaceAddresses) {
//                System.out.println(interfaceAddress);
//            }
            Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
            while (inetAddresses.hasMoreElements()) {
                InetAddress inetAddress = inetAddresses.nextElement();
                System.out.println(inetAddress);
            }
        }
    }
}
