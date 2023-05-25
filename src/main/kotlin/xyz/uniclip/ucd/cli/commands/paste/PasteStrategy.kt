package xyz.uniclip.ucd.cli.commands.paste

interface PasteStrategy {
    fun paste(args: List<String>)
}