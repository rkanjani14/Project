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

@Model(adaptables = Resource.class)
public class Footer {

	@Inject
	@Default(values="navlabel1")
	private String navlabel1;
	
	@Inject
	@Default(values="navlink1")
	private String navlink1;
	
	@Inject
	@Default(values="navlabel1")
	private String navlabel2;
	
	@Inject
	@Default(values="navlink2")
	private String navlink2;

	public String getNavlabel1() {
		return navlabel1;
	}

	public String getNavlink1() {
		return navlink1;
	}

	public String getNavlabel2() {
		return navlabel2;
	}

	public String getNavlink2() {
		return navlink2;
	}

	public void setNavlabel1(String navlabel1) {
		this.navlabel1 = navlabel1;
	}

	public void setNavlink1(String navlink1) {
		this.navlink1 = navlink1;
	}

	public void setNavlabel2(String navlabel2) {
		this.navlabel2 = navlabel2;
	}

	public void setNavlink2(String navlink2) {
		this.navlink2 = navlink2;
	}
	

}
