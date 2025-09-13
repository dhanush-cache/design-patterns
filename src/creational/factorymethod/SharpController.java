package creational.factorymethod;

public class SharpController extends MatchaController {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
