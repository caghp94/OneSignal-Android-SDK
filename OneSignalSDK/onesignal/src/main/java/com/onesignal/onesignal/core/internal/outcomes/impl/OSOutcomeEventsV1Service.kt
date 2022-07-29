package com.onesignal.onesignal.core.internal.outcomes.impl

import com.onesignal.onesignal.core.internal.backend.http.HttpResponse
import com.onesignal.onesignal.core.internal.backend.http.IHttpClient
import org.json.JSONObject

internal class OSOutcomeEventsV1Service(client: IHttpClient) : OSOutcomeEventsClient(client) {
    /***
     * API endpoint /api/v1/outcomes/measure
     */
    override suspend fun sendOutcomeEvent(jsonObject: JSONObject) : HttpResponse {
        return client.post("outcomes/measure", jsonObject)
    }
}