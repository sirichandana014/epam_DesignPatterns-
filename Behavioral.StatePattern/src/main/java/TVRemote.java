public class TVRemote
{

    public static void main( String[] args )
    {
        LEDTVContext context = new LEDTVContext();
        StateOfLEDTv ledTvOnState = new LEDTVOnState();
        StateOfLEDTv ledTvOffState = new LEDTVOffState();

        context.setStateOfLedTv(ledTvOnState);
        context.doTurnOnOrOff();

        context.setStateOfLedTv(ledTvOffState);
        context.doTurnOnOrOff();
    }

}