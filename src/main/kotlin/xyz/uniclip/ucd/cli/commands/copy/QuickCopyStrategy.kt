package xyz.uniclip.ucd.cli.commands.copy

import xyz.uniclip.ucd.SQLiteHelper
import xyz.uniclip.ucd.util.ClipboardHelper

// private const val TAG = "QuickCopyStrategy"

class QuickCopyStrategy : CopyStrategy {

    override fun copy(args: List<String>) {
        val value = SQLiteHelper.getRecord(args[0])
        if (value != null) {
            ClipboardHelper.setValue(value)
        }
    }
}