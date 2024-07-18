package org.example.saled;

/**
 * Данный класс разрешает наследование только классу Cub.
 */
public sealed class Rectangle extends Figure permits Cub {

}
