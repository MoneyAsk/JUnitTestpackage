package jUnitTestPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//hello
@RunWith(Suite.class)
@SuiteClasses({ testAddNumbers.class, testAddStrings.class })
public class AllTests {

}
