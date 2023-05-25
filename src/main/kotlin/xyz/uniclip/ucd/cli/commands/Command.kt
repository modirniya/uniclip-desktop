package xyz.uniclip.ucd.cli.commands

interface Command {
    fun execute(args: List<String>)
}