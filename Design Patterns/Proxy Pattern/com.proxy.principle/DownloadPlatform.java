public class DownloadPlatform {

    public static void main(String[] args) {

        Video video = new ProxyVideo("testVideo.mp4");

        video.download();
        System.out.println("Download Complete!");

        System.out.println("Loading file...");

        video.playing();
    }
}
