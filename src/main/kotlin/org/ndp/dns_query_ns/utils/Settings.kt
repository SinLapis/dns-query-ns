package org.ndp.dns_query_ns.utils

import java.io.FileReader
import java.util.*

object Settings {
    val setting = Properties()

    init {
        val inFile = FileReader("settings.properties")
        setting.load(inFile)
        inFile.close()
    }

}