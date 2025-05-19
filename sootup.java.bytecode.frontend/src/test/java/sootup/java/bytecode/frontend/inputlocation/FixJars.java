package sootup.java.bytecode.frontend.inputlocation;

import categories.TestCategories;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import sootup.java.core.views.JavaView;

public class FixJars extends BaseFixJarsTest {

@Test
public void executesqooprepositoryderbyjar(){
	String jarDownloadUrl = "https://repo1.maven.org/maven2/org/apache/sqoop/repository/sqoop-repository-derby/1.99.7/sqoop-repository-derby-1.99.7.jar";
    String methodSignature = "<org.apache.sqoop.repository.derby.DerbyRepositoryHandler: void shutdown()>";
    JavaView javaView = supplyJavaView(jarDownloadUrl);
    assertMethodConversion(javaView,methodSignature);
    assertJar(javaView);
}

}