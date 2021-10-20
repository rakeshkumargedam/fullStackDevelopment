package CheckedException;

public class GunsNotFunde extends Exception
{
    public GunsNotFunde(String errorAmmo){
        super(errorAmmo);
    }

}
