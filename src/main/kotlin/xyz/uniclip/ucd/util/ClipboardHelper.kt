package xyz.uniclip.ucd.util

import java.awt.Toolkit
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.StringSelection

class ClipboardHelper {
    companion object {
        private val clipboard = Toolkit.getDefaultToolkit().systemClipboard

        fun setValue(value: String) {
            val stringSelection = StringSelection(value)
            clipboard.setContents(stringSelection, null)
        }

        fun getValue(): String {
            return clipboard.getData(DataFlavor.stringFlavor).toString()
        }
    }
}