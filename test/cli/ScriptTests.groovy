import grails.test.AbstractCliTestCase

class ScriptTests extends AbstractCliTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testScript() {

        execute(["script"])

        assertEquals 0, waitForProcess()
        verifyHeader()
    }
}
