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
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Carouselitems {

	@Inject
	@Default(values="img")
	private String img;
	
	@Inject
	@Default(values="link")
	private String link;
	
	@Inject
	@Default(values="title")
	private String title;
	
	@Inject
	@Default(values="desc")
	private String desc;

	public String getImg() {
		return img;
	}

	public String getLink() {
		return link;
	}

	public String getTitle() {
		return title;
	}

	public String getDesc() {
		return desc;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
