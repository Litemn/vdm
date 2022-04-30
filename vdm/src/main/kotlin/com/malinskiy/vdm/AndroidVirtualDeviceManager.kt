/*
 * SPDX-License-Identifier: Apache-2.0
 */

package com.malinskiy.vdm

import com.malinskiy.vdm.device.Config
import com.malinskiy.vdm.device.Location
import com.malinskiy.vdm.device.VirtualDevice

class AndroidVirtualDeviceManager : VirtualDeviceManager {

    override fun browse(): List<VirtualDevice> {
        TODO("Not yet implemented")
    }

    override fun read(location: Location): VirtualDevice {
        TODO("Not yet implemented")
    }

    override fun update(location: Location, updatedConfig: Config): VirtualDevice {
        TODO("Not yet implemented")
    }

    override fun add(config: Config): VirtualDevice {
        TODO("Not yet implemented")
    }

    override fun delete(location: Location) {
        TODO("Not yet implemented")
    }

    override fun start(location: Location, options: StartupOptions) {
        TODO("Not yet implemented")
    }

}
