public class SonyLedTv implements LEDTV
{
    public void switchOn()
    {
        System.out.println("Turning ON.. Sony TV.");
    }

    public void switchOff()
    {
        System.out.println("Turning Off.. Sony TV.");

    }

    public void setChannel( int channelNumber )
    {
        System.out.println("Setting channel Number " + channelNumber + ".. on Sony TV");

    }

}