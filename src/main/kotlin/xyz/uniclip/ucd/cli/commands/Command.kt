package xyz.uniclip.ucd.cli.commands

interface Command {
    fun execute(options: List<String>)
}