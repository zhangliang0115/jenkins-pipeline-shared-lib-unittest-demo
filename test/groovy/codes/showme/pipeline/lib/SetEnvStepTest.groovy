package codes.showme.pipeline.lib

import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertEquals

class SetEnvStepTest extends BasePipelineTest {

    @Override
    @Before
    public void setUp() throws Exception {
        scriptRoots = ["vars"]
        super.setUp()

    }


    @Test
    void call() {
        binding.setVariable('env', new HashMap())
        def script = loadScript('setEnvStep.groovy')
        script.invokeMethod("call", [k: '123', v: "456"])
        assertEquals("123", ((HashMap) binding.getVariable("env")).get("k"))
    }
}
