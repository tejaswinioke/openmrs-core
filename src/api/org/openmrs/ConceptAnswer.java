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
package org.openmrs;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * ConceptAnswer
 */
@Root
public class ConceptAnswer extends BaseOpenmrsObject implements Auditable, java.io.Serializable {
	
	public static final long serialVersionUID = 3744L;
	
	public Log log = LogFactory.getLog(this.getClass());
	
	// Fields
	private Integer conceptAnswerId;
	
	private Concept concept; // concept to answer
	
	private Concept answerConcept; // answer for <code>concept</code>
	
	private Drug answerDrug; // answer in drug form for <code>concept</code>
	
	private User creator;
	
	private Date dateCreated;
	
	// Constructors
	
	/** default constructor */
	public ConceptAnswer() {
	}
	
	/** constructor with id */
	public ConceptAnswer(Integer conceptAnswerId) {
		this.conceptAnswerId = conceptAnswerId;
	}
	
	public ConceptAnswer(Concept answerConcept) {
		this.answerConcept = answerConcept;
	}
	
	public ConceptAnswer(Concept answerConcept, Drug d) {
		this.answerConcept = answerConcept;
		this.answerDrug = d;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof ConceptAnswer) {
			ConceptAnswer c = (ConceptAnswer) obj;
			if (this.conceptAnswerId != null && c.getConceptAnswerId() != null)
				return (this.conceptAnswerId.equals(c.getConceptAnswerId()));
			else {
				boolean ret = true;
				if (this.concept != null && c.getConcept() != null)
					ret = ret && this.concept.equals(c.getConcept());
				if (this.answerConcept != null && c.getAnswerConcept() != null)
					ret = ret && this.answerConcept.equals(c.getAnswerConcept());
				if (this.answerDrug != null && c.getAnswerDrug() != null)
					ret = ret && this.answerDrug.equals(c.getAnswerDrug());
				//log.debug("asdf " + getAnswerConcept().getConceptId() + "=" + c.getAnswerConcept().getConceptId() + "?" + ret);
				return ret;
			}
			
		}
		return false;
	}
	
	public int hashCode() {
		if (this.getConceptAnswerId() != null)
			return this.getConceptAnswerId().hashCode();
		int hash = 9;
		if (concept != null)
			hash = hash * concept.hashCode() + 31;
		if (answerConcept != null)
			hash = hash * answerConcept.hashCode() + 31;
		if (answerDrug != null)
			hash = hash * answerDrug.hashCode() + 31;
		
		return hash;
		
	}
	
	/**
	 * @return Returns the answerConcept.
	 */
	@Element
	public Concept getAnswerConcept() {
		return answerConcept;
	}
	
	/**
	 * @param answerConcept The answerConcept to set.
	 */
	@Element
	public void setAnswerConcept(Concept answerConcept) {
		this.answerConcept = answerConcept;
	}
	
	/**
	 * @return Returns the answerDrug.
	 */
	public Drug getAnswerDrug() {
		return answerDrug;
	}
	
	/**
	 * @param answerDrug The answerDrug to set.
	 */
	public void setAnswerDrug(Drug answerDrug) {
		this.answerDrug = answerDrug;
	}
	
	/**
	 * @return Returns the concept.
	 */
	@Element
	public Concept getConcept() {
		return concept;
	}
	
	/**
	 * @param concept The concept to set.
	 */
	@Element
	public void setConcept(Concept concept) {
		this.concept = concept;
	}
	
	/**
	 * @return Returns the conceptAnswerId.
	 */
	@Attribute
	public Integer getConceptAnswerId() {
		return conceptAnswerId;
	}
	
	/**
	 * @param conceptAnswerId The conceptAnswerId to set.
	 */
	@Attribute
	public void setConceptAnswerId(Integer conceptAnswerId) {
		this.conceptAnswerId = conceptAnswerId;
	}
	
	/**
	 * @return Returns the creator.
	 */
	@Element
	public User getCreator() {
		return creator;
	}
	
	/**
	 * @param creator The creator to set.
	 */
	@Element
	public void setCreator(User creator) {
		this.creator = creator;
	}
	
	/**
	 * @return Returns the dateCreated.
	 */
	@Element
	public Date getDateCreated() {
		return dateCreated;
	}
	
	/**
	 * @param dateCreated The dateCreated to set.
	 */
	@Element
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	/**
	 * @since 1.5
	 * @see org.openmrs.OpenmrsObject#getId()
	 */
	public Integer getId() {
		return getConceptAnswerId();
	}
	
	/**
	 * @since 1.5
	 * @see org.openmrs.OpenmrsObject#setId(java.lang.Integer)
	 */
	public void setId(Integer id) {
		setConceptAnswerId(id);
	}
	
	/**
	 * Not currently used. Always returns null.
	 * 
	 * @see org.openmrs.Auditable#getChangedBy()
	 */
	public User getChangedBy() {
		return null;
	}
	
	/**
	 * Not currently used. Always returns null.
	 * 
	 * @see org.openmrs.Auditable#getDateChanged()
	 */
	public Date getDateChanged() {
		return null;
	}
	
	/**
	 * Not currently used.
	 * 
	 * @see org.openmrs.Auditable#setChangedBy(org.openmrs.User)
	 */
	public void setChangedBy(User changedBy) {
	}
	
	/**
	 * Not currently used.
	 * 
	 * @see org.openmrs.Auditable#setDateChanged(java.util.Date)
	 */
	public void setDateChanged(Date dateChanged) {
	}
}
