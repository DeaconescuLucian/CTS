package ro.ase.cts.classes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
		{ GrupaFakeTest.class, GrupaTest.class, GrupaTestSetup.class, TestCaseDummy.class,
		TestCaseGetPromovabilitateStub.class }
		)

public class AllTests {

}
