package framework.Junit5;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(JUnitPlatform.class)
@SelectPackages("framework.Junit5")
@SuiteClasses({ClassA.class,ClassB.class})
public class Junit5_TestSuite_Runner 
{

}
