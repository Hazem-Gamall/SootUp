package sootup.java.bytecode.frontend.inputlocation;

import categories.TestCategories;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import sootup.java.core.views.JavaView;

public class FixJars extends BaseFixJarsTest {

@Test
public void executeorgosgitestcasestypedeventjar(){
	String jarDownloadUrl = "https://repo1.maven.org/maven2/org/osgi/org.osgi.test.cases.typedevent/8.1.0/org.osgi.test.cases.typedevent-8.1.0.jar";
    String methodSignature = "";
    JavaView javaView = supplyJavaView(jarDownloadUrl);
    assertMethodConversion(javaView,methodSignature);
    assertJar(javaView);
}

}