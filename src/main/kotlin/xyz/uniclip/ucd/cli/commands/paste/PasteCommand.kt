package xyz.uniclip.ucd.cli.commands.paste

import xyz.uniclip.ucd.cli.commands.Command
import xyz.uniclip.ucd.util.ResourceHelper

class PasteCommand : Command {
    override fun execute(args: List<String>) {
        if (args.isEmpty()) {
            println(ResourceHelper.getInstance().getString("missing_target"))
            return
        }
        QuickPasteStrategy().paste(args)
    }
}