package xyz.uniclip.ucd.cli.commands.copy

import xyz.uniclip.ucd.repository.RecordsRepository
import xyz.uniclip.ucd.util.ResourceHelper
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import xyz.uniclip.ucd.util.LogHelper as log

private const val TAG = "QuickCopyStrategy"

class QuickCopyStrategy : CopyStrategy {

    override fun copy(args: List<String>) {
        log.l(TAG)
        log.i(TAG, args[0])
        val record = RecordsRepository.getRecord(args[0])
        if (record == null) {
            println(ResourceHelper.getInstance().getString("record_not_found"))
        } else {
            val clipboard = Toolkit.getDefaultToolkit().systemClipboard
            val stringSelection = StringSelection(record.value)
            clipboard.setContents(stringSelection, null)
        }

        // val retrievedText = clipboard.getData(DataFlavor.stringFlavor)

        // println("Retrieved text from clipboard: $retrievedText")

    }
}