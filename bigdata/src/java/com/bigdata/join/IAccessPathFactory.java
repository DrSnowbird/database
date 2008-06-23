/*

Copyright (C) SYSTAP, LLC 2006-2008.  All rights reserved.

Contact:
     SYSTAP, LLC
     4501 Tower Road
     Greensboro, NC 27410
     licenses@bigdata.com

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; version 2 of the License.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

*/
/*
 * Created on Jun 19, 2008
 */

package com.bigdata.join;

import com.bigdata.btree.IIndex;
import com.bigdata.btree.ITuple;

/**
 * Interface for an {@link IAccessPath} factory.
 * 
 * FIXME There needs to be an interface for choosing the JOIN operator impl. For
 * RDF with its perfect indices this is always going to use the same operator
 * for a given deployment (e.g., LDS vs Jini Federation).
 * 
 * Note that index maintenance is highly specialized for the RDF DB because of
 * its perfect indices. GOM is a more typical example where there may be a
 * primary (clustered) index and then zero or more secondary indices.
 * 
 * @author <a href="mailto:thompsonbry@users.sourceforge.net">Bryan Thompson</a>
 * @version $Id$
 */
public interface IAccessPathFactory<E> {

    /**
     * Return the best {@link IAccessPath} for a relation given a predicate with
     * zero or more unbound variables.
     * <p>
     * Note: If there is an {@link IIndex} that directly corresponeds to the
     * natural order implied by the variable pattern on the predicate then the
     * access path should use that index. Otherwise you should choose the best
     * index given the constraints and make sure that the {@link IAccessPath}
     * incorporates additional filters that will allow you to filter out the
     * irrelevant {@link ITuple}s during the scan - this is very important when
     * the index is remote!
     * 
     * @param predicate
     *            The constraint on the elements to be visited.
     * 
     * @return The best {@link IAccessPath} for that {@link IPredicate}.
     */
    IAccessPath<E> getAccessPath(IPredicate<E> predicate);
    
}
