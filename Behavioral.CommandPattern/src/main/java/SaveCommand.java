public class SaveCommand implements Command
{

    private WordDocument wordDocument;

    public SaveCommand( WordDocument wordDocument )
    {
        this.wordDocument = wordDocument;
    }

    public void execute()
    {
        wordDocument.save();
    }
}