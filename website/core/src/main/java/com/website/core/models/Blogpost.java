/*
 *  Copyright 2015 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.website.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Blogpost {

	@Inject
	@Default(values="imagefield")
	private String imagefield;
	
	@Inject
	@Default(values="typeofblog")
	private String typeofblog;
	
	@Inject
	@Default(values="title")
	private String title;
	
	
	@Inject
	@Default(values="description")
	private String description;

	@Inject
	@Default(values="posttitlelink")
	private String posttitlelink;

	
	public String getPosttitlelink() {
		return posttitlelink;
	}


	public void setPosttitlelink(String posttitlelink) {
		this.posttitlelink = posttitlelink;
	}


	public String getImagefield() {
		return imagefield;
	}


	public String getTypeofblog() {
		return typeofblog;
	}


	public String getTitle() {
		return title;
	}


	public String getDescription() {
		return description;
	}


	public void setImagefield(String imagefield) {
		this.imagefield = imagefield;
	}


	public void setTypeofblog(String typeofblog) {
		this.typeofblog = typeofblog;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	


}
