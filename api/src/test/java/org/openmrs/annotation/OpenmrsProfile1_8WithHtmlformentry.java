/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.annotation;

import org.springframework.stereotype.Component;

/**
 * Test bean which should be only loaded when running on OpenMRS 1.8 and later with the htmlformentry module
 */
@Component
@OpenmrsProfile(openmrsVersion = "1.8", modules = { "htmlformentry:2.3" })
public class OpenmrsProfile1_8WithHtmlformentry {}
