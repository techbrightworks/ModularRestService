
open module CalculationService {

    requires spring.webmvc;
    requires spring.expression;
    requires spring.beans;
    requires spring.context;
    requires java.logging;
    requires org.apache.logging.log4j;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;


    exports org.srinivas.siteworks.data;
    exports org.srinivas.siteworks.exception;
    exports org.srinivas.siteworks.config;
    exports org.srinivas.siteworks.calculate;
    exports org.srinivas.siteworks.changeservice;
    exports org.srinivas.siteworks.denomination;


}
