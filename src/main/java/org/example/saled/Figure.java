package org.example.saled;

/**
 * Наследниками данного класса могут быть только классы Rectangle и Circle
 */
public sealed class Figure permits Rectangle, Circle {
}
