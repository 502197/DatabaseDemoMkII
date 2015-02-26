package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features="src/cucumber/features/", //{"classpath:features/"},
		format = { "pretty", "json:target/cucumber.json" },
		glue = "src/cucumber/features/"
		)

public class CucumberRunner {
//
//	static{
//		System.out.println("loading CucumberRunner...");
//	}
}
