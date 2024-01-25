package com.ssafy.day9.a_parse.client;

import java.io.InputStream;
import java.util.List;

import com.ssafy.day9.a_parse.dto.BoxOffice;
import com.ssafy.day9.a_parse.parser.BoxOfficeJsonParser;
import com.ssafy.day9.a_parse.parser.BoxOfficeParser;

public class BoxOfficeCLI {
    private BoxOfficeParser parser = null;
    private InputStream resource = null;

    public BoxOfficeCLI() {

    }

    private void readBoxOfficeList() {

//    	this.resource = BoxOfficeCLI.class.getResourceAsStream("../res/boxoffice.xml");
//    	this.parser = BoxOfficeDomParser.getParser();
//    	this.parser = BoxOfficeSaxParser.getParser();
    	
    	//JSON
    	this.resource = BoxOfficeCLI.class.getResourceAsStream("../res/boxoffice.json");
    	this.parser = BoxOfficeJsonParser.getParser();
        List<BoxOffice> list = parser.getBoxOffice(resource);
        System.out.println("list size: " + list.size());
        for (BoxOffice boxOffice : list) {
            System.out.println(boxOffice);
        }
    }

    public static void main(String[] args) {
        BoxOfficeCLI cli = new BoxOfficeCLI();
        cli.readBoxOfficeList();
    }
}
