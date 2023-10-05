package id.synth.rwls.app

import id.synth.rwls.server.RustedWarfareLanguageServer
import org.eclipse.lsp4j.launch.LSPLauncher
import java.io.InputStream
import java.io.OutputStream
import java.util.logging.Level
import java.util.logging.LogManager
import java.util.logging.Logger

fun main() {
    LogManager.getLogManager().reset()
    Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).level = Level.OFF
    
    startServer(System.`in`, System.out)
}

private fun startServer(`in`: InputStream, out: OutputStream) {
    val server = RustedWarfareLanguageServer()
    val launcher = LSPLauncher.createServerLauncher(server, `in`, out)
    
    launcher.remoteProxy.also(server::connect)
    launcher.startListening().get()
}
