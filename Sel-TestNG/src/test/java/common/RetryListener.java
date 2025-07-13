package common;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// This method allows you to modify TestNG annotations at runtime.
		// You can set a RetryAnalyzer here if needed.

		annotation.setRetryAnalyzer(Retry.class);
	}
}
