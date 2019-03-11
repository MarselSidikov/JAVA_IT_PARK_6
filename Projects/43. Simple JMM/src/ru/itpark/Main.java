package ru.itpark;

/**
 * // class version 52.0 (52)
 * // access flags 0x21
 * public class ru/itpark/Main {
 *
 *   // compiled from: Main.java
 *
 *   // access flags 0x1
 *   public <init>()V
 *    L0
 *     LINENUMBER 3 L0
 *     ALOAD 0
 *     INVOKESPECIAL java/lang/Object.<init> ()V
 *     RETURN
 *    L1
 *     LOCALVARIABLE this Lru/itpark/Main; L0 L1 0
 *     MAXSTACK = 1
 *     MAXLOCALS = 1
 *
 *   // access flags 0x9
 *   public static main([Ljava/lang/String;)V
 *    L0
 *     LINENUMBER 8 L0
 *     BIPUSH 10
 *     ISTORE 2
 *    L1
 *     LINENUMBER 9 L1
 *     BIPUSH 10
 *     ISTORE 1
 *    L2
 *     LINENUMBER 11 L2
 *     ILOAD 1
 *     ILOAD 2
 *     IADD
 *     ISTORE 3
 *    L3
 *     LINENUMBER 12 L3
 *     RETURN
 *    L4
 *     LOCALVARIABLE args [Ljava/lang/String; L0 L4 0
 *     LOCALVARIABLE x I L2 L4 1
 *     LOCALVARIABLE y I L1 L4 2
 *     LOCALVARIABLE z I L3 L4 3
 *     MAXSTACK = 2
 *     MAXLOCALS = 4
 * }
 */
public class Main {

    public static void main(String[] args) {
        int x;
        int y;
        y = 10;
        x = 10;
        int z;
        z = x + y;
    }
}
