/*
 * Copyright (c) 2022. Proton AG
 *
 * This file is part of ProtonVPN.
 *
 * ProtonVPN is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ProtonVPN is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ProtonVPN.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.protonvpn.test.shared

import com.protonvpn.android.models.vpn.ConnectingDomain
import com.protonvpn.android.models.vpn.Location
import com.protonvpn.android.models.vpn.Server

private val dummyConnectingDomain =
    ConnectingDomain("1.2.34", null, "dummy.protonvpn.net", "1.2.3.5", null, null, true, "dummy")

fun createServer(
    serverId: String = "ID",
    serverName: String = "dummyName",
    exitCountry: String = "PL",
    entryCountry: String = exitCountry,
    score: Float = 0.5f,
    tier: Int = 0,
    features: Int = 0
) =
    Server(
        serverId = serverId,
        entryCountry = entryCountry,
        exitCountry = exitCountry,
        serverName = serverName,
        connectingDomains = listOf(dummyConnectingDomain),
        hostCountry = null,
        domain = "dummy.protonvpn.net",
        load = 50f,
        tier = tier,
        region = null,
        city = null,
        features = features,
        location = Location("", ""),
        null,
        score = score,
        isOnline = true
    )


