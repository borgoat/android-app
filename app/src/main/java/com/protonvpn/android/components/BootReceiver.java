/*
 * Copyright (c) 2017 Proton Technologies AG
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
package com.protonvpn.android.components;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.protonvpn.android.auth.usecase.CurrentUser;
import com.protonvpn.android.models.config.UserData;
import com.protonvpn.android.models.profiles.Profile;
import com.protonvpn.android.utils.ServerManager;
import com.protonvpn.android.vpn.ConnectTrigger;
import com.protonvpn.android.vpn.VpnConnectionManager;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class BootReceiver extends BroadcastReceiver {

    @Inject ServerManager manager;
    @Inject UserData userData;
    @Inject CurrentUser currentVpnUser;
    @Inject VpnConnectionManager vpnConnectionManager;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (userData.getConnectOnBoot() && currentVpnUser.isLoggedInCached()) {
            Profile defaultProfile = manager.getDefaultConnection();
            vpnConnectionManager.connectInBackground(
                    defaultProfile, new ConnectTrigger.Auto("legacy always-on"));
        }
    }
}
