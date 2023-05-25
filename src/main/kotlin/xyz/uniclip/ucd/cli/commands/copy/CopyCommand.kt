package xyz.uniclip.ucd.cli.commands.copy

import xyz.uniclip.ucd.cli.commands.Command
import xyz.uniclip.ucd.util.ResourceHelper as rh

class CopyCommand : Command {
    override fun execute(options: List<String>) {
        // lbUsername.setText(res.getString("lbUsername"));
        if (options.isEmpty()) {
            println(rh.getInstance().getString("missing_target"))
            return
        }
        QuickCopyStrategy().copy(options)
    }
}