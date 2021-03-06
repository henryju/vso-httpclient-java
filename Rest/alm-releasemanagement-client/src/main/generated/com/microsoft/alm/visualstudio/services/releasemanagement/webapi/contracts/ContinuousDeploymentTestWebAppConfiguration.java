// @formatter:off
/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* Licensed under the MIT license. See License.txt in the project root.
* ---------------------------------------------------------
*
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;


/** 
 */
public class ContinuousDeploymentTestWebAppConfiguration {

    private ContinuousDeploymentAppServicePlanConfiguration appServicePlanConfiguration;
    private String testWebAppLocation;
    private String testWebAppName;

    public ContinuousDeploymentAppServicePlanConfiguration getAppServicePlanConfiguration() {
        return appServicePlanConfiguration;
    }

    public void setAppServicePlanConfiguration(final ContinuousDeploymentAppServicePlanConfiguration appServicePlanConfiguration) {
        this.appServicePlanConfiguration = appServicePlanConfiguration;
    }

    public String getTestWebAppLocation() {
        return testWebAppLocation;
    }

    public void setTestWebAppLocation(final String testWebAppLocation) {
        this.testWebAppLocation = testWebAppLocation;
    }

    public String getTestWebAppName() {
        return testWebAppName;
    }

    public void setTestWebAppName(final String testWebAppName) {
        this.testWebAppName = testWebAppName;
    }
}
