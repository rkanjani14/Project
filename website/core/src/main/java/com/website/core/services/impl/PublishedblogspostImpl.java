
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import org.osgi.service.metatype.annotations.Designate;

import com.website.core.services.Publishedblogspost;

@Component(service = Publishedblogspost.class, immediate = true)
@Designate(ocd = PublishedblogspostConfiguration.class)
public class PublishedblogspostImpl  implements Publishedblogspost {

	int blogs;
	
	@Activate
	public void activate(PublishedblogspostConfiguration config) {
		blogs = config.no_of_blogs();
	}
	
	@Override
	public int noOfPages(){
	return blogs;
	}	

}
