package com.company;

/**
 * This interface represents the ability of a given device to shine light
 * The contract for implementors requires implementation of method lightUp,
 * the idea behind which is to put the light on
 * @author Zulfia Garifullina
 * @since 01.09.2017.
 */
public interface Light {
    /**
     * Correct implementation of this method should involve the lights in the implementing class going on
     */
    void lightUp();
}
