package com.example;

public class Sample {
    public static String getColor(int rgb) {
        switch (rgb) {
        case 1:
            return "赤";//rgbが1の場合"赤"を返す
        case 2:
            return "緑";//rgbが2の場合"緑"を返す
        case 3:
            return "青";//rgbが3の場合"青"を返す
        }
        throw new IllegalArgumentException();//それ以外の値の場合 IllegalArgumentExceptionをスロー
    }
}