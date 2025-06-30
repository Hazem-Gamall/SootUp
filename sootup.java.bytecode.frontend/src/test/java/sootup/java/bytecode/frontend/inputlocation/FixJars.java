package sootup.java.bytecode.frontend.inputlocation;

import categories.TestCategories;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import sootup.java.core.views.JavaView;

public class FixJars extends BaseFixJarsTest {

@Test
public void executeazurespringintegrationservicebusjar(){
	String jarDownloadUrl = "https://repo1.maven.org/maven2/com/azure/spring/azure-spring-integration-servicebus/4.0.0/azure-spring-integration-servicebus-4.0.0.jar";
    String methodSignature = "";
    JavaView javaView = supplyJavaView(jarDownloadUrl);
    assertMethodConversion(javaView,methodSignature);
    assertJar(javaView);
}

}