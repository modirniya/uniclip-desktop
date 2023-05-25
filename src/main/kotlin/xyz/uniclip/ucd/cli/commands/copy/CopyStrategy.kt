package xyz.uniclip.ucd.cli.commands.copy

interface CopyStrategy {
    fun copy(args: List<String>)
}