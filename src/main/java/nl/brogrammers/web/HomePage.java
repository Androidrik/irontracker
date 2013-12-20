package nl.brogrammers.web;

import org.apache.wicket.markup.head.CssReferenceHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.CssResourceReference;

//TODO: git
//TODO: java warnings
//TODO: users
//TODO: twitter bootstrap
//TODO: spring
//TODO: orm(mybatis of hibernate)
//TODO: JOOQ
public class HomePage extends WebPage
{

	public HomePage(final PageParameters parameters)
	{
		super(parameters);
		add(new Label("test", "test"));
	}

	@Override
	public void renderHead(IHeaderResponse response)
	{
		response.render(CssReferenceHeaderItem.forReference(new CssResourceReference(HomePage.class,
			"assets/bootstrap/css/bootstrap-responsive.css")));
		response.render(CssReferenceHeaderItem.forReference(new CssResourceReference(HomePage.class,
			"assets/bootstrap/css/bootstrap.css")));
	}
}
