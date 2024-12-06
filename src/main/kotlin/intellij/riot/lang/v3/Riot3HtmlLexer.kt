package intellij.riot.lang.v3

import com.intellij.lang.javascript.JSStubElementTypes
import com.intellij.psi.tree.IElementType
import intellij.riot.js.RiotStubElements
import intellij.riot.lang.RiotHtmlLexer

class Riot3HtmlLexer : RiotHtmlLexer() {
    override fun getTokenType(): IElementType? {
        val tokenType = super.getTokenType()
        if (tokenType == JSStubElementTypes.EMBEDDED_CONTENT) {
            return RiotStubElements.EMBEDDED_RIOT3_TAG
        }

        return tokenType
    }
}
