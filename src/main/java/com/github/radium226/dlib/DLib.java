package com.github.radium226.dlib;

import com.github.radium226.commons.Libraries;
import com.github.radium226.opencv.OpenCV;

import java.util.Arrays;

public class DLib {

    public static void loadLibraries() {
        OpenCV.loadLibraries();
        for (String libraryName : Arrays.asList("dlib", "dlib-java")) {
            Libraries.loadLibrary(libraryName);
        }
    }
}
