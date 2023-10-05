import org.eclipse.lsp4j.*
import org.eclipse.lsp4j.jsonrpc.messages.Either
import org.eclipse.lsp4j.services.TextDocumentService
import java.util.concurrent.CompletableFuture

class RustedWarfareTextDocumentService : TextDocumentService {
    override fun didOpen(params: DidOpenTextDocumentParams?) {}

    override fun didChange(params: DidChangeTextDocumentParams?) {}

    override fun didClose(params: DidCloseTextDocumentParams?) {}

    override fun didSave(params: DidSaveTextDocumentParams?) {}

    override fun completion(position: CompletionParams?): CompletableFuture<Either<MutableList<CompletionItem>, CompletionList>> =
        CompletableFuture.supplyAsync {
            Either.forRight(CompletionList(listOf(CompletionItem("!unit").apply {
                kind = CompletionItemKind.Snippet
                detail = "Insert unit snippet"
                insertText = """
                        [core]
                        name: ${'$'}{1}
                        maxHp: 200
                        price: 500
                        mass: 50
                        radius: 16
                        
                        [graphics]
                        image: ${'$'}{2}.png
                        
                        [attack]
                        canAttack: true
                        canAttackFlyingUnits: true
                        canAttackLandUnits: true
                        canAttackUnderwaterUnits: true
                        
                        [movement]
                        movementType: LAND
                    """.trimIndent()
                insertTextFormat = InsertTextFormat.Snippet
            })))
        }
}