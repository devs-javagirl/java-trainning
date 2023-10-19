public class UsbConnector implements Usb {

    public void insert() {
        System.out.println("Usb connector has successfully plugged!");
    }

    public void transferSound() {
        System.out.println("""
                *Playing music with usb connector*
                00:01 ⬤─────────── 04:05
                """);
    }

    public void connectWithUsbCable() {
        this.insert();
        this.transferSound();
    }
}
