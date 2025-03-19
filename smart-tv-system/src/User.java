public class User {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        System.out.println("Is the TV on? " + smartTv.onOff);
        System.out.println("Channel: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.turnOn ();
        System.out.println("New status -> Is the TV on? " + smartTv.onOff);

        if(smartTv.volume == 100){
            System.out.println("Max volume reached: " + smartTv.volume);
        }
        if(smartTv.volume == 0){
            System.out.println("Minimum volume reached: " + smartTv.volume);
        }
        else {
            smartTv.volumeDown();
            System.out.println("New volume -> " + smartTv.volume);
        }

        smartTv.changeChannel(13);
        System.out.println("New channel: " + smartTv.channel);
    }
}
