public class ProxyVideo implements Video {

    private RealVideo realVideo;
    private String fileName;

    public ProxyVideo(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void download() {
        if(realVideo == null){
            realVideo = new RealVideo(fileName);
        }
        realVideo.download();
    }

    @Override
    public void playing() {
        if(realVideo == null){
            realVideo = new RealVideo(fileName);
        }
        realVideo.playing();
    }
}
