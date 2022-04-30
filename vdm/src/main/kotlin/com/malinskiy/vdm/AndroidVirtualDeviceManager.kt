/*
 * SPDX-License-Identifier: Apache-2.0
 */

package com.malinskiy.vdm

import com.malinskiy.vdm.device.DeviceConfig
import com.malinskiy.vdm.device.Location
import com.malinskiy.vdm.device.VirtualDevice

class AndroidVirtualDeviceManager : VirtualDeviceManager {

    override fun browse(): List<VirtualDevice> {
        TODO("Not yet implemented")
    }

    override fun read(location: Location): VirtualDevice {
        TODO("Not yet implemented")
    }

    override fun update(location: Location, updatedConfig: DeviceConfig): VirtualDevice {
        TODO("Not yet implemented")
    }

    override fun add(config: DeviceConfig): VirtualDevice {
        TODO("Not yet implemented")
    }

    override fun delete(location: Location) {
        TODO("Not yet implemented")
    }

}
