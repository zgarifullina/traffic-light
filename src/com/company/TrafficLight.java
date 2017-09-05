package com.company;

/**
 * This class implements a traffic light with three light colours: green, yellow and red.
 * The order of lights working from the point the traffic light is activated, is as follows.
 * Green is on for 2 minutes, then yellow for 3 minutes, then red for 5 minutes.
 * @author Zulfia Garifullina
 * @since 01.09.2017.
 */
public class TrafficLight implements Light {
    private Colour light;

    TrafficLight() {
        this.light = Colour.GREEN;
        System.out.println("Traffic Light is activated. Green light is on");
    }

    /**
     * This method represents the working mode of the traffic light.
     * It invokes determineLight() method to determine which light needs to shine at this minute in time
     * And displays a message that that light is on using lightUp() method.
     */
    void work() {
        while (true) {
            double minute = (new Timing()).getTiming();
            if (minute == 0) {
                break;
            } else {
                this.determineLight(minute);
                this.lightUp();
            }
        }
    }

    /**
     * This method implements the Light interface contract
     * It displays a simple message showing which of the traffic lights is currently on
     */
    @Override
    public void lightUp() {
        System.out.println(this.light + " is on");
    }

    /**
     * This method is used to determine which traffic light should be on
     * based on the time passed since the start of traffic light working
     * @param minute the number of minutes since the traffic light started working (double)
     */
    private void determineLight(double minute) {
        if ((minute % 10 >= 0) && (minute % 10 <= 2)) {
            this.light = Colour.GREEN;
        } else if ((minute % 10 > 2) && (minute % 10 <= 5)) {
            this.light = Colour.YELLOW;
        } else {
            this.light = Colour.RED;
        }
    }
}
