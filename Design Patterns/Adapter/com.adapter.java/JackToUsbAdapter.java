public class JackToUsbAdapter implements Usb {

    private JackConnector jackConnector;

    public JackToUsbAdapter(JackConnector jackConnector) {
        this.jackConnector = jackConnector;
    }

    @Override
    public void connectWithUsbCable() {
        jackConnector.insert();
        jackConnector.transferSound();
    }

}
