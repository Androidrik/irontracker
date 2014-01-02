package nl.brogrammers.web;

import org.apache.wicket.markup.head.CssReferenceHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.IHeaderContributor;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.CssResourceReference;
import org.wicketstuff.jslibraries.JSLib;
import org.wicketstuff.jslibraries.Library;
import org.wicketstuff.jslibraries.VersionDescriptor;

public class IrontrackerWebPage extends WebPage
{

    public IrontrackerWebPage(final PageParameters parameters)
    {
	super(parameters);
    }

    @Override
    public void renderHead(IHeaderResponse response)
    {
	IHeaderContributor jQuery = JSLib
		.getHeaderContribution(VersionDescriptor
			.alwaysLatest(Library.JQUERY));
	jQuery.renderHead(response);

	IHeaderContributor jQueryUI = JSLib
		.getHeaderContribution(VersionDescriptor
			.alwaysLatest(Library.JQUERY_UI));
	jQueryUI.renderHead(response);

	response.render(CssReferenceHeaderItem
		.forReference(new CssResourceReference(
			IrontrackerWebPage.class, "bootstrap/css/bootstrap.css")));
	response.render(CssReferenceHeaderItem
		.forReference(new CssResourceReference(
			IrontrackerWebPage.class,
			"bootstrap/css/bootstrap-responsive.css")));
    }
}
