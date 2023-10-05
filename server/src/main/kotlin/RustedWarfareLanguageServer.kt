import org.eclipse.lsp4j.*
import org.eclipse.lsp4j.jsonrpc.messages.Either
import org.eclipse.lsp4j.services.LanguageClient
import org.eclipse.lsp4j.services.LanguageClientAware
import org.eclipse.lsp4j.services.LanguageServer
import java.util.concurrent.CompletableFuture

class RustedWarfareLanguageServer : LanguageServer, LanguageClientAware {
    private val textDocumentService = RustedWarfareTextDocumentService()
    private val workspaceService = RustedWarfareWorkspaceService()

    private var client: LanguageClient? = null

    override fun initialize(params: InitializeParams?): CompletableFuture<InitializeResult> =
        CompletableFuture.supplyAsync {
            val capabilities = ServerCapabilities().apply {
                textDocumentSync = Either.forLeft(TextDocumentSyncKind.Full)
                completionProvider = CompletionOptions()
            }

            InitializeResult(capabilities)
        }

    override fun shutdown(): CompletableFuture<Any> {
        TODO("Not yet implemented")
    }

    override fun exit() {
        TODO("Not yet implemented")
    }

    override fun getTextDocumentService() = textDocumentService

    override fun getWorkspaceService() = workspaceService

    override fun connect(client: LanguageClient?) {
        this.client = client
    }
}