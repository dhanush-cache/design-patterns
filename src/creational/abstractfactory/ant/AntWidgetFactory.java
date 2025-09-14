package creational.abstractfactory.ant;

import creational.abstractfactory.Button;
import creational.abstractfactory.TextBox;
import creational.abstractfactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
