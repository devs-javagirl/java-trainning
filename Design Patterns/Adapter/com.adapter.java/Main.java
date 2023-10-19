public class Main {
    public static void main(String[] args) {
        UsbConnector usbConnector = new UsbConnector();
        JackConnector jackConnector = new JackConnector();

        usbConnector.connectWithUsbCable();

        //jackConnector.connectWithUsbCable(); won't compile
        System.out.println("""
                Wrong type connector.
                Jack connectors are round and have a different type of plug. Use some adapter to usb ports.
                
                *Pause music*
                01:12 ━━⬤───────── 04:05
                """);

        Usb jackConnectorAdapter = new JackToUsbAdapter(jackConnector);
        jackConnectorAdapter.connectWithUsbCable();
    }
}