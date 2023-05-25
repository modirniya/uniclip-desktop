package xyz.uniclip.ucd.cli

import xyz.uniclip.ucd.UC_APP_VERSION
import xyz.uniclip.ucd.cli.commands.Command
import xyz.uniclip.ucd.cli.commands.copy.CopyCommand

class UniclipCLI {
    fun run(isAttached: Boolean, args: List<String>) {
        if (args.isNotEmpty() && args[0].isNotEmpty()) {
            val command: Command? = when (args[0]) {
                "copy" -> CopyCommand()
                else -> {
                    null
                }
            }
            command?.execute(args.drop(1))
        } else {
            println("Usage: uniclip-cli <command> [options]")
        }
        if (isAttached) {
            print("//: ")
            val input = readlnOrNull()
            run(true, input?.split(" ") ?: emptyList())
        }
    }

    companion object {
        fun launch(args: Array<String>) {
            println("Uniclip Desktop CLI launching...\nVersion $UC_APP_VERSION")
            UniclipCLI().run(args[0] == "attach", args.toList())
        }
    }

}