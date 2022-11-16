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


import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Header {

	@Inject
	@Default(values="websiteheading")
	private String websiteheading;
	
	@Inject
	@Default(values="websitelogo")
	private String websitelogo;
	
	public String getWebsitelogolink() {
		return websitelogolink;
	}

	public void setWebsitelogolink(String websitelogolink) {
		this.websitelogolink = websitelogolink;
	}

	@Inject
	@Default(values="websitelogolink")
	private String websitelogolink;
	
	
	@Inject
	@Default(values="pagelist")
    private List<HeaderList> pagelist;

	public String getWebsiteheading() {
		return websiteheading;
	}

	public String getWebsitelogo() {
		return websitelogo;
	}

	public List<HeaderList> getPagelist() {
		return pagelist;
	}

	public void setWebsiteheading(String websiteheading) {
		this.websiteheading = websiteheading;
	}

	public void setWebsitelogo(String websitelogo) {
		this.websitelogo = websitelogo;
	}

	/*
	public void setPagelist(List<HeaderList> pagelist) {
		this.pagelist = pagelist;
	}
	*/


	

	


}
