interface PCI{
    void insert();
    void pullOut();
}
    class soundPCI implements PCI{
        public void insert(){
            System.out.println("声卡安装成功");
        }
        public void pullOut(){
            System.out.println("声卡拆卸成功");
        }
    }
    class DisplayPCI implements PCI{
        public void insert(){
            System.out.println("显卡安装成功");
        }
        public void pullOut(){
            System.out.println("显卡拆卸成功");
        }
    }
class usePCI {
    public void PCIinsert(PCI p) {
        p.insert();
    }

    public void PCIpullOut(PCI p) {
        p.pullOut();
    }
}
public class e14 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PCI p1=new soundPCI();
        PCI p2=new DisplayPCI();
        usePCI m1=new usePCI();
        m1.PCIinsert(p1);
        m1.PCIinsert(p2);
        m1.PCIpullOut(p1);
        m1.PCIpullOut(p2);
    }
}