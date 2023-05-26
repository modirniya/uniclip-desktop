package xyz.uniclip.ucd.cli.commands.cut

import xyz.uniclip.ucd.SQLiteHelper
import xyz.uniclip.ucd.cli.commands.Command
import xyz.uniclip.ucd.util.ResourceHelper
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection

class CutCommand : Command {
    override fun execute(args: List<String>) {
        if (args.isEmpty()) {
            println(ResourceHelper.getInstance().getString("missing_target"))
            return
        }
        val value = SQLiteHelper.getRecord(args[0])
        if (value != null) {
            val clipboard = Toolkit.getDefaultToolkit().systemClipboard
            val stringSelection = StringSelection(value)
            clipboard.setContents(stringSelection, null)
            SQLiteHelper.removeRecord(args[0])
        }
    }
}