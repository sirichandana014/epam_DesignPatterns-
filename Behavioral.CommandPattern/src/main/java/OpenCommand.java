public class OpenCommand implements Command
{
    private WordDocument wordDocument;

    public OpenCommand( WordDocument wordDocument )
    {
        this.wordDocument = wordDocument;
    }

    public void execute()
    {
        wordDocument.open();
    }
}