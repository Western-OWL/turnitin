/**********************************************************************************
 * $URL: 
 * $Id: 
 ***********************************************************************************
 *
 * Copyright (c) 2006 Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/
package org.sakaiproject.turnitin.util;

/**
 * Custom class to represent return values from TII, containing an integer indicating the result
 * and an error message if an error occurred.
 */
public class TurnitinReturnValue
{
    private int result;
    private String errorMessage;

    public TurnitinReturnValue() {}

    public int getResult() { return result; }
    public String getErrorMessage() { return errorMessage; }

    public void setResult( int result ) { this.result = result; }
    public void setErrorMessage( String errorMessage ) { this.errorMessage = errorMessage; }
}
