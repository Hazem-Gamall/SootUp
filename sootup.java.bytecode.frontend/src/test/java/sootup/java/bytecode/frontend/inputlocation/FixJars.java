package sootup.java.bytecode.frontend.inputlocation;

import categories.TestCategories;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import sootup.java.core.views.JavaView;

public class FixJars extends BaseFixJarsTest {

@Test
public void executeazurespringcloudstreambinderservicebustopicjar(){
	String jarDownloadUrl = "https://repo1.maven.org/maven2/com/azure/spring/azure-spring-cloud-stream-binder-servicebus-topic/4.0.0/azure-spring-cloud-stream-binder-servicebus-topic-4.0.0.jar";
    String methodSignature = "";
    JavaView javaView = supplyJavaView(jarDownloadUrl);
    assertMethodConversion(javaView,methodSignature);
    assertJar(javaView);
}

@Test
public void executegantgroovyjar(){
	String jarDownloadUrl = "https://repo1.maven.org/maven2/org/codehaus/gant/gant_groovy2.3/1.9.11/gant_groovy2.3-1.9.11.jar";
    String methodSignature = "<gant.Gant: java.lang.Integer processArgs(java.lang.String[])>";
    JavaView javaView = supplyJavaView(jarDownloadUrl);
    assertMethodConversion(javaView,methodSignature);
    assertJar(javaView);
}

}