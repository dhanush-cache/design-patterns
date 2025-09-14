package creational.abstractfactory;

import creational.abstractfactory.ant.AntWidgetFactory;
import creational.abstractfactory.app.ContactForm;
import creational.abstractfactory.material.MaterialWidgetFactory;

public class Main {
    public static void main(String[] args) {
        new ContactForm().render(new MaterialWidgetFactory());
        new ContactForm().render(new AntWidgetFactory());
    }
}
