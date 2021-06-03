package ro.ase.cts.classes;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({GrupaTest.class,GrupaFakeTest.class})
@IncludeCategory({NormalTests.class})
public class SuitaCustom {

}
