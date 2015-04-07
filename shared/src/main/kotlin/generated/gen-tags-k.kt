package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class KBD(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("kbd", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class KEYGEN(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("keygen", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var challenge : String
        get()  = attributeStringf30f39f0.get(this, "challenge")
        set(newValue) {attributeStringf30f39f0.set(this, "challenge", newValue)}

    var autoFocus : Boolean
        get()  = attributeBooleanAutoFocusEmpty84bc6550.get(this, "autofocus")
        set(newValue) {attributeBooleanAutoFocusEmpty84bc6550.set(this, "autofocus", newValue)}

    var keyType : KeyType
        get()  = attributeKeyTypeKeyTypeValues6127e5e1.get(this, "keytype")
        set(newValue) {attributeKeyTypeKeyTypeValues6127e5e1.set(this, "keytype", newValue)}

    var disabled : Boolean
        get()  = attributeBooleanDisabledEmpty700d95bd.get(this, "disabled")
        set(newValue) {attributeBooleanDisabledEmpty700d95bd.set(this, "disabled", newValue)}

    var form : String
        get()  = attributeStringf30f39f0.get(this, "form")
        set(newValue) {attributeStringf30f39f0.set(this, "form", newValue)}

    var name : String
        get()  = attributeStringf30f39f0.get(this, "name")
        set(newValue) {attributeStringf30f39f0.set(this, "name", newValue)}


}

