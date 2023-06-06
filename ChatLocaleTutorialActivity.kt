    private fun buildJapaneseChat(qiContext: QiContext) {
        val locale = Locale(Language.SPANISH, Region.SPAIN)
        chatJA = buildChat(qiContext, "hello-ja.top", locale)
    }
    
    //easiest way to do it is just replacing in the buildjapanesechat  2 command lines JAPANESE = SPANISH and then Region.JAPAN= SPAIN, easy...
    //then chek the layout xml to see how to put the button from JP to ES
