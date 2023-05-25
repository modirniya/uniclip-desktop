package xyz.uniclip.ucd

import javafx.application.Application
import xyz.uniclip.ucd.cli.UniclipCLI
import xyz.uniclip.ucd.ui.UniclipApplication

const val UC_APP_VERSION = "1.23.0"
fun main(args: Array<String>) {
    if (args.isEmpty())
        Application.launch(UniclipApplication::class.java)
    else
        UniclipCLI.launch(args)
}