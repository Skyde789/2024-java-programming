package oamk.stream;

public class VideoFile implements Playable{
    public static String fileName;
    private Metadata videoFileData;

    public VideoFile(String videoFileName){
        String _split[] = videoFileName.split(" - ");

        String author = _split[0];

        _split  = _split[1].split("[.]");

        String name = _split[0];
        String fileType = _split[1];

        videoFileData = new Metadata(author, name, fileType);
    }

    public Metadata getVideoFileData() {
        return videoFileData;
    }

    @Override
    public String play(){
        return "Playing videofile: " + fileName;
    }

    @Override
    public String pause(Integer seconds){
        return "Videofile " + fileName + " paused for " + seconds + " seconds";
    }

    @Override
    public String stop(){
        return "Videofile " + fileName + " stopped";
    }

}