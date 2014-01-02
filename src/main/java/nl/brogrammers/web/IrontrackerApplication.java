package nl.brogrammers.web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

/**
 * Application object for your web application. If you want to run this
 * application without deploying, run the Start class.
 */
public class IrontrackerApplication extends WebApplication
{
    @Override
    public Class<? extends WebPage> getHomePage()
    {
	return IrontrackerWebPage.class;
    }

    @Override
    public void init()
    {
	super.init();
	getComponentInstantiationListeners().add(
		new SpringComponentInjector(this));
	// add your configuration here
    }
}
