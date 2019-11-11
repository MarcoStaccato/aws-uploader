package com.staccato;

import com.staccato.uploader.UploadObject;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
//        UploadObject.upload(new File("resources/strong-coffee.jpg").getAbsoluteFile().getAbsolutePath());

        PdfMerger.merge();
    }

}