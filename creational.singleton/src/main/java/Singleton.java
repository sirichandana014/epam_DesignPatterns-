public class Singleton {
    private static Singleton singletonInstance;
    private Singleton(){ }
    public static Singleton getSingletonInstance()
    {
        if( null == singletonInstance )
        {
            singletonInstance = new Singleton();
            System.out.println("Inside null check , Object is Created : " +singletonInstance.toString());
            System.out.println(" ----------------------------------------------------- ");
        }
        return singletonInstance;
    }

    public void printSingleton()
    {
        System.out.println("Inside print Singleton object : " +singletonInstance.toString());
        System.out.println("");
    }
}
