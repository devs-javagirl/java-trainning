public class RealVideo implements Video {

    private String fileName;

    public RealVideo(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void download() {
        System.out.println("Downloading file " + fileName);
    }

    @Override
    public void playing() {
        System.out.println("Playing file " + fileName);
    }
}