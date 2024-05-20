/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refactorizacionentornos;

/**
 *
 * @author aleja
 */
public interface Animal {
    void hacerSonido();
}

public class Perro implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau!");
    }
}

public class Gato implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau!");
    }
}
