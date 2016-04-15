package com.ttnd.demo.CO

import grails.validation.Validateable

class SearchCO implements Validateable {
    String q

    Integer length
    Integer start

    String order
    String columns
    String search
}
