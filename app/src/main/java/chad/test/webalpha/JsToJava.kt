package chad.test.webalpha

import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

class JsToJava constructor(context:Context){
    private val actContext = context
    @JavascriptInterface
    fun testToast(){
        Toast.makeText(actContext, "javascript call java function！", Toast.LENGTH_SHORT).show()
    }

}