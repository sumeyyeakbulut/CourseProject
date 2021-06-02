package org.csystem.app.samples.games.cargameapp;

import org.csystem.app.samples.games.template.AbstractGame;

public class CarRaceGame extends AbstractGame {
    //...

    public CarRaceGame()
    {
        super("Car Racing");
    }

    public void start()
    {
        System.out.println("CarRaceGame start");
    }
    public void play()
    {
        System.out.println("CarRaceGame play");
    }

    public void pause()
    {
        System.out.println("CarRaceGame pause");
    }
    //...
    public void end()
    {
        System.out.println("CarRaceGame end");
    }
}
