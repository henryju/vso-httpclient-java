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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;


/** 
 */
public enum DeployPhaseTypes {

    UNDEFINED(0),
    AGENT_BASED_DEPLOYMENT(1),
    RUN_ON_SERVER(2),
    MACHINE_GROUP_BASED_DEPLOYMENT(4),
    ;

    private int value;

    private DeployPhaseTypes(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UNDEFINED")) { //$NON-NLS-1$
            return "undefined"; //$NON-NLS-1$
        }

        if (name.equals("AGENT_BASED_DEPLOYMENT")) { //$NON-NLS-1$
            return "agentBasedDeployment"; //$NON-NLS-1$
        }

        if (name.equals("RUN_ON_SERVER")) { //$NON-NLS-1$
            return "runOnServer"; //$NON-NLS-1$
        }

        if (name.equals("MACHINE_GROUP_BASED_DEPLOYMENT")) { //$NON-NLS-1$
            return "machineGroupBasedDeployment"; //$NON-NLS-1$
        }

        return null;
    }
}
