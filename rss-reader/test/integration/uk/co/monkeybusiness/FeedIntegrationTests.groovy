package uk.co.monkeybusiness

import grails.test.*

class FeedIntegrationTests extends GroovyTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testSave() {

		def feed = new Feed(name: 'El Reg', url: 'http://www.theregister.co.uk/headlines.atom')

		assertNotNull feed.save()
		assertNotNull feed.id

		def foundFeed = Feed.get(feed.id)
		assertEquals 'El Reg', foundFeed.name

    }
}
