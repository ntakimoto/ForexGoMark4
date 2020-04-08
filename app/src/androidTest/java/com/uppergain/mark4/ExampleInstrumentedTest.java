package com.uppergain.mark4;

import android.os.Bundle;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.android.CucumberAndroidJUnitRunner;

//@RunWith(Cucumber.class)
//@CucumberOptions(glue = "com.uppergain.mark4", plugin  = { "pretty","html:test-output"},features = "features")
@RunWith(AndroidJUnit4.class)
@CucumberOptions(
        features = "features",
        glue = "com.uppergain.mark4",
        tags = "")
public class ExampleInstrumentedTest extends CucumberAndroidJUnitRunner {

    @Override
    public void onCreate(final Bundle bundle) {
        bundle.putString("plugin", getPluginConfigurationString());
        // we programmatically create the plugin configuration
        super.onCreate(bundle);
    }

    /**
     * Since we want to checkout the external storage directory programmatically, we create the plugin configuration
     * here, instead of the {@link CucumberOptions} annotation.
     *
     * @return the plugin string for the configuration, which contains XML, HTML and JSON paths
     */
    private String getPluginConfigurationString() {
        String cucumber = "cucumber";
        String separator = "--";
        return "junit:" + getAbsoluteFilesPath() + "/" + cucumber + ".xml" + separator +
                "html:" + getAbsoluteFilesPath() + "/" + cucumber + ".html";
    }

    /**
     * The path which is used for the report files.
     *
     * @return the absolute path for the report files
     */
    private String getAbsoluteFilesPath() {

        //sdcard/Android/data/cucumber.cukeulator
        //File directory = getTargetContext().getExternalFilesDir(null);
        //return new File(directory,"reports").getAbsolutePath();
        return null;
    }
    /**
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.uppergain.mark4", appContext.getPackageName());
    }

    @Test
    public void useAppContext2() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.uppergain.mark4", appContext.getPackageName());
    }
    */

}
