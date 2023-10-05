import org.eclipse.lsp4j.*
import org.eclipse.lsp4j.services.TextDocumentService

class RustedWarfareTextDocumentService : TextDocumentService {
    override fun didOpen(params: DidOpenTextDocumentParams?) {}

    override fun didChange(params: DidChangeTextDocumentParams?) {}

    override fun didClose(params: DidCloseTextDocumentParams?) {}

    override fun didSave(params: DidSaveTextDocumentParams?) {}
}