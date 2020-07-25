public class CloseCommand implements Command
{
    private WordDocument wordDocument;

    public CloseCommand( WordDocument wordDocument )
    {
        this.wordDocument = wordDocument;
    }

    public void execute()
    {
        wordDocument.close();
    }
}