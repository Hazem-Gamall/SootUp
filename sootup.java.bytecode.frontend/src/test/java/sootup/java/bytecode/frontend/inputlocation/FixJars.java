package sootup.java.bytecode.frontend.inputlocation;

import categories.TestCategories;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import sootup.java.core.views.JavaView;

public class FixJars extends BaseFixJarsTest {

@Test
public void executeBanManagerBungeejar(){
	String jarDownloadUrl = "https://repo1.maven.org/maven2/me/confuser/banmanager/BanManagerBungee/7.9.0/BanManagerBungee-7.9.0.jar";
    String methodSignature = "";
    JavaView javaView = supplyJavaView(jarDownloadUrl);
    assertMethodConversion(javaView,methodSignature);
    assertJar(javaView);
}

}