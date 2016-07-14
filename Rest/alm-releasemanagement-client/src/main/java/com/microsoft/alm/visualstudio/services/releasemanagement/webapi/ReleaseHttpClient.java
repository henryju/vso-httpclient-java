// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import javax.ws.rs.client.Client;
import java.net.URI;

public class ReleaseHttpClient
    extends ReleaseHttpClientBase
{

    public ReleaseHttpClient(final Client jaxrsClient, final URI baseUrl)
    {
        super(jaxrsClient, baseUrl);
    }
}
