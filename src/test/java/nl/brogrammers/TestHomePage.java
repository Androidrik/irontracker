package nl.brogrammers;

import nl.brogrammers.web.IrontrackerWebPage;
import nl.brogrammers.web.IrontrackerApplication;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

/**
 * Simple test using the WicketTester
 */
public class TestHomePage
{
	private WicketTester tester;

	@Before
	public void setUp()
	{
		tester = new WicketTester(new IrontrackerApplication());
	}

	@Test
	public void homepageRendersSuccessfully()
	{
		//start and render the test page
		tester.startPage(IrontrackerWebPage.class);

		//assert rendered page class
		tester.assertRenderedPage(IrontrackerWebPage.class);
	}
}
