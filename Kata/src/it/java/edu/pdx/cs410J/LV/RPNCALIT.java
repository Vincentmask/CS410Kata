package edu.pdx.cs410J.LV;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class RPNCALIT extends InvokeMainTestCase {

    @Test
    void test1() {
        InvokeMainTestCase.MainMethodResult result = invokeMain(RPN_CAL.class, "20", "5", "/");
        assertThat(result.getTextWrittenToStandardOut(), containsString("The result is: 4"));
    }

    @Test
    void test2() {
        InvokeMainTestCase.MainMethodResult result = invokeMain(RPN_CAL.class, "4", "2", "+", "3", "-");
        assertThat(result.getTextWrittenToStandardOut(), containsString("The result is: 3"));
    }

    @Test
    void test3() {
        InvokeMainTestCase.MainMethodResult result = invokeMain(RPN_CAL.class, "3", "5", "8", "*", "7", "+", "*");
        assertThat(result.getTextWrittenToStandardOut(), containsString("The result is: 141"));
    }

    @Test
    void test4() {
        InvokeMainTestCase.MainMethodResult result = invokeMain(RPN_CAL.class, "9", "SQRT");
        assertThat(result.getTextWrittenToStandardOut(), containsString("The result is: 3"));
    }

    @Test
    void test5() {
        InvokeMainTestCase.MainMethodResult result = invokeMain(RPN_CAL.class, "5","3", "4", "2", "9", "1", "MAX");
        assertThat(result.getTextWrittenToStandardOut(), containsString("The result is: 9"));
    }

    void test6 () {
        InvokeMainTestCase.MainMethodResult result = invokeMain(RPN_CAL.class, "4","5", "MAX", "1", "2", "MAX", "*");
        assertThat(result.getTextWrittenToStandardOut(), containsString("The result is: 10"));
    }

}
