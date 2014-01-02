package nl.brogrammers.web;

import org.apache.wicket.markup.head.CssReferenceHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.CssResourceReference;

public class IrontrackerWebPage extends WebPage
{

    public IrontrackerWebPage(final PageParameters parameters)
    {
	super(parameters);
    }

    @Override
    public void renderHead(IHeaderResponse response)
    {
	response.render(CssReferenceHeaderItem
		.forReference(new CssResourceReference(
			IrontrackerWebPage.class,
			"assets/bootstrap/css/bootstrap-responsive.css")));
	response.render(CssReferenceHeaderItem
		.forReference(new CssResourceReference(
			IrontrackerWebPage.class,
			"assets/bootstrap/css/bootstrap.css")));
    }
}
