package com.staccato;

import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;

import java.io.File;

public class PdfMerger {


    public static void merge(){
        try{

            PDFMergerUtility mergeUtil = new PDFMergerUtility();

            mergeUtil.addSource(new File("resources/JavaCheatSheet.pdf"));
            mergeUtil.addSource(new File("resources/MavenQuickReferenceCard.pdf"));

            mergeUtil.setDestinationFileName("resources/result.pdf");

            mergeUtil.mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());

        }catch (Exception e){
        }
    }
}
