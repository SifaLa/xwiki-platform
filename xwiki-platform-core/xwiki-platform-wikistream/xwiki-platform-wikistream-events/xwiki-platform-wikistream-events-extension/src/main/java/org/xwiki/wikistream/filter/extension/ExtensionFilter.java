/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.wikistream.filter.extension;

import org.xwiki.filter.FilterEventParameters;
import org.xwiki.filter.annotation.Default;
import org.xwiki.filter.annotation.Name;
import org.xwiki.stability.Unstable;
import org.xwiki.wikistream.WikiStreamException;

/**
 * Extension related events.
 * 
 * @version $Id$
 * @since 6.0M1
 */
@Unstable
public interface ExtensionFilter
{
    // Properties

    // Events

    /**
     * @param name the name of the namespace
     * @param parameters the parameters of the namespace
     * @throws WikiStreamException when failing to send event
     */
    void beginNamespace(@Name("name") String name,
        @Default(FilterEventParameters.DEFAULT) @Name(FilterEventParameters.NAME) FilterEventParameters parameters)
        throws WikiStreamException;

    /**
     * @param name the name of the namespace
     * @param parameters the parameters of the namespace
     * @throws WikiStreamException when failing to send event
     */
    void endNamespace(@Name("name") String name,
        @Default(FilterEventParameters.DEFAULT) @Name(FilterEventParameters.NAME) FilterEventParameters parameters)
        throws WikiStreamException;

    /**
     * @param id the id of the extension
     * @param version the version of the extension
     * @param parameters the parameters of the extension
     * @throws WikiStreamException when failing to send event
     */
    void beginExtension(@Name("id") String id, @Name("version") String version,
        @Default(FilterEventParameters.DEFAULT) @Name(FilterEventParameters.NAME) FilterEventParameters parameters)
        throws WikiStreamException;

    /**
     * @param id the id of the extension
     * @param version the version of the extension
     * @param parameters the parameters of the extension
     * @throws WikiStreamException when failing to send event
     */
    void endExtension(@Name("id") String id, @Name("version") String version,
        @Default(FilterEventParameters.DEFAULT) @Name(FilterEventParameters.NAME) FilterEventParameters parameters)
        throws WikiStreamException;
}
