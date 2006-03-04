package org.apache.ddlutils.platform.oracle;

/*
 * Copyright 2006 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


/**
 * The platform for Oracle 10.
 *
 * @author Thomas Dudziak
 * @version $Revision: 231306 $
 */
public class Oracle10Platform extends Oracle9Platform
{
    /** Database name of this platform. */
    public static final String DATABASENAME = "Oracle10";

    /**
     * Creates a new platform instance.
     */
    public Oracle10Platform()
    {
        super();
        setSqlBuilder(new Oracle10Builder(this));
        setModelReader(new Oracle10ModelReader(this));
    }

    /**
     * {@inheritDoc}
     */
    public String getName()
    {
        return DATABASENAME;
    }
}
