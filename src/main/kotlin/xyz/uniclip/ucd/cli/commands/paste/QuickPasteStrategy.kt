package xyz.uniclip.ucd.cli.commands.paste

import xyz.uniclip.ucd.SQLiteHelper
import java.awt.Toolkit
import java.awt.datatransfer.DataFlavor

class QuickPasteStrategy : PasteStrategy {
    override fun paste(args: List<String>) {
        val clipboard = Toolkit.getDefaultToolkit().systemClipboard
        val retrievedText = clipboard.getData(DataFlavor.stringFlavor)
        if (retrievedText.toString().isNotEmpty()) {
            SQLiteHelper.addRecord(args[0], retrievedText.toString())
            // RecordsRepository.addRecord(args[0], retrievedText.toString())
        }
    }
}