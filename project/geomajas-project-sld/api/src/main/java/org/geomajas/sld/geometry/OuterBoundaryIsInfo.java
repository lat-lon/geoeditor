/*
 * This is part of Geomajas, a GIS framework, http://www.geomajas.org/.
 *
 * Copyright 2008-2013 Geosparc nv, http://www.geosparc.com/, Belgium.
 *
 * The program is available in open source according to the Apache
 * License, Version 2.0. All contributions in this program are covered
 * by the Geomajas Contributors License Agreement. For full licensing
 * details, see LICENSE.txt in the project root.
 */
package org.geomajas.sld.geometry;

import java.io.Serializable;
import org.geomajas.annotation.Api;

/**
 * Schema fragment(s) for this class:...
 * 
 * <pre>
 * &lt;xs:element
 * xmlns:ns="http://www.opengis.net/gml"
 * xmlns:xs="http://www.w3.org/2001/XMLSchema" type="ns:GeometryAssociationType" name="outerBoundaryIs"/>
 * </pre>
 * 
 * @author Jan De Moerloose
 * @since 1.0.0
 */

@Api(allMethods = true)
public class OuterBoundaryIsInfo extends GeometryAssociationTypeInfo implements Serializable {

	private static final long serialVersionUID = 100;

	private LinearRingTypeInfo linearRing;

	/**
	 * Get the linear ring describing the outer boundary.
	 * 
	 * @return the linear ring
	 */
	public LinearRingTypeInfo getLinearRing() {
		return linearRing;
	}

	/**
	 * Set the linear ring describing the outer boundary.
	 * 
	 * @param linearRing the linear ring
	 */
	public void setLinearRing(LinearRingTypeInfo linearRing) {
		this.linearRing = linearRing;
	}

	@Override
	@java.lang.SuppressWarnings("all")
	public java.lang.String toString() {
		return "OuterBoundaryIsInfo(linearRing=" + this.getLinearRing() + ")";
	}

	@Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof OuterBoundaryIsInfo)) {
			return false;
		}
		final OuterBoundaryIsInfo other = (OuterBoundaryIsInfo) o;
		if (!other.canEqual((java.lang.Object) this)) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}
		if (this.getLinearRing() == null ? other.getLinearRing() != null : !this.getLinearRing().equals(
				(java.lang.Object) other.getLinearRing())) {
			return false;
		}
		return true;
	}

	/**
	 * Is there a chance that the object are equal? Verifies that the other object has a comparable type.
	 *
	 * @param other other object
	 * @return true when other is an instance of this type
	 */
	public boolean canEqual(final java.lang.Object other) {
		return other instanceof OuterBoundaryIsInfo;
	}

	@Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + super.hashCode();
		result = result * prime + (this.getLinearRing() == null ? 0 : this.getLinearRing().hashCode());
		return result;
	}
}