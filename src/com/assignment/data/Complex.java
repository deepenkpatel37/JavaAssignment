package com.assignment.data;

public class Complex {
    private final int real;
    private final int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex num){
        return new Complex(this.real + num.real, this.imaginary + num.imaginary);
    }

    public Complex subtract(Complex num){
        return new Complex(this.real - num.real, this.imaginary - num.imaginary);
    }

    public Complex multiply(Complex num){
        return new Complex(this.real* num.real - this.imaginary*num.imaginary, this.real*num.imaginary + this.imaginary*num.real);
    }

    @Override
    public String toString() {
        return real + " + (" + imaginary + "i)";
    }
}
