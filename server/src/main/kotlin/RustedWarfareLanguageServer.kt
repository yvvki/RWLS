import org.eclipse.lsp4j.InitializeParams
import org.eclipse.lsp4j.InitializeResult
import org.eclipse.lsp4j.services.*
import java.io.Closeable
import java.util.concurrent.CompletableFuture

class RustedWarfareLanguageServer : LanguageServer, LanguageClientAware, Closeable {
    private val textDocumentService = RustedWarfareTextDocumentService()
    private val workspaceService = RustedWarfareWorkspaceService()
    
    private var client: LanguageClient? = null
    
    override fun initialize(params: InitializeParams?): CompletableFuture<InitializeResult> {
        TODO("Not yet implemented")
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

    override fun close() {}

}