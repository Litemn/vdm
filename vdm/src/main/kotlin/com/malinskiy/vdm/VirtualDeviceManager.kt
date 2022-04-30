/*
 * SPDX-License-Identifier: Apache-2.0
 */

package com.malinskiy.vdm

import com.malinskiy.vdm.device.Config
import com.malinskiy.vdm.device.Location
import com.malinskiy.vdm.device.VirtualDevice

interface VirtualDeviceManager {
    fun browse(): List<VirtualDevice>
    fun read(location: Location): VirtualDevice
    fun update(location: Location, updatedConfig: Config): VirtualDevice
    fun add(config: Config): VirtualDevice
    fun delete(location: Location)
    fun start(location: Location, options: StartupOptions)
}
