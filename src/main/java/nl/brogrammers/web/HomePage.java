package nl.brogrammers.web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import nl.brogrammers.domain.models.persistent.Exercise;
import nl.brogrammers.domain.repositories.ExerciseRepository;

import org.apache.wicket.markup.head.CssReferenceHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.CssResourceReference;
import org.apache.wicket.spring.injection.annot.SpringBean;

public class HomePage extends WebPage
{

    @SpringBean
    private ExerciseRepository exerciseRepository;

    public HomePage(final PageParameters parameters)
    {
	super(parameters);
	List<Exercise> exercises = new ArrayList<>();
	Iterable<Exercise> iterable = exerciseRepository.findAll();
	for (Iterator<Exercise> it = iterable.iterator(); it.hasNext();)
	{
	    exercises.add(it.next());
	}

	add(new ListView<Exercise>("exercises", exercises)
	{

	    @Override
	    protected void populateItem(ListItem<Exercise> item)
	    {
		item.add(new Label("naam", item.getModelObject().getNaam()));
	    }
	});
    }

    @Override
    public void renderHead(IHeaderResponse response)
    {
	response.render(CssReferenceHeaderItem
		.forReference(new CssResourceReference(HomePage.class,
			"assets/bootstrap/css/bootstrap-responsive.css")));
	response.render(CssReferenceHeaderItem
		.forReference(new CssResourceReference(HomePage.class,
			"assets/bootstrap/css/bootstrap.css")));
    }
}
