
open module CalculationServiceWeb {
    requires CalculationService;
    requires java.logging;
    requires org.apache.logging.log4j;
    requires spring.web;
    requires spring.webmvc;
    requires spring.beans;
    requires spring.context;
    requires javax.servlet.api;
    requires jackson.core.asl;
    requires jackson.mapper.asl;
    requires com.fasterxml.jackson.databind;

    exports org.srinivas.siteworks.controller to CalculationServiceWebTest;
    exports org.srinivas.siteworks.webconfig to CalculationServiceWebTest;
}