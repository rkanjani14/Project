package com.website.core.services.impl;


import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;


@ObjectClassDefinition(name = "Publishedblogspost Configuration")
public @interface PublishedblogspostConfiguration  {

	@AttributeDefinition(name = "Number of Blogs", required = true
			)
	int no_of_blogs() ;

	
}


