package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class TABLE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("table", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var summary : String
        get()  = attributeStringf30f39f0.get(this, "summary")
        set(newValue) {attributeStringf30f39f0.set(this, "summary", newValue)}


}

public class TBODY(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("tbody", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class TD(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("td", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var rowSpan : RowSpan
        get()  = attributeRowSpanRowSpanValues89c3b301.get(this, "rowspan")
        set(newValue) {attributeRowSpanRowSpanValues89c3b301.set(this, "rowspan", newValue)}

    var headers : String
        get()  = attributeStringf30f39f0.get(this, "headers")
        set(newValue) {attributeStringf30f39f0.set(this, "headers", newValue)}

    var colSpan : ColSpan
        get()  = attributeColSpanColSpanValues14bb341.get(this, "colspan")
        set(newValue) {attributeColSpanColSpanValues14bb341.set(this, "colspan", newValue)}


}

public class TEXTAREA(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("textarea", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var maxlength : String
        get()  = attributeStringf30f39f0.get(this, "maxlength")
        set(newValue) {attributeStringf30f39f0.set(this, "maxlength", newValue)}

    var readonly : Boolean
        get()  = attributeBooleanReadonlyEmpty39ed8ab7.get(this, "readonly")
        set(newValue) {attributeBooleanReadonlyEmpty39ed8ab7.set(this, "readonly", newValue)}

    var wrap : Wrap
        get()  = attributeWrapWrapValuesb2f2c301.get(this, "wrap")
        set(newValue) {attributeWrapWrapValuesb2f2c301.set(this, "wrap", newValue)}

    var rowS : RowS
        get()  = attributeRowSRowSValues1fb3e1a1.get(this, "rows")
        set(newValue) {attributeRowSRowSValues1fb3e1a1.set(this, "rows", newValue)}

    var autoFocus : Boolean
        get()  = attributeBooleanAutoFocusEmpty84bc6550.get(this, "autofocus")
        set(newValue) {attributeBooleanAutoFocusEmpty84bc6550.set(this, "autofocus", newValue)}

    var required : Boolean
        get()  = attributeBooleanRequiredEmptya500c8fa.get(this, "required")
        set(newValue) {attributeBooleanRequiredEmptya500c8fa.set(this, "required", newValue)}

    var disabled : Boolean
        get()  = attributeBooleanDisabledEmpty700d95bd.get(this, "disabled")
        set(newValue) {attributeBooleanDisabledEmpty700d95bd.set(this, "disabled", newValue)}

    var colS : ColS
        get()  = attributeColSColSValues57e5c961.get(this, "cols")
        set(newValue) {attributeColSColSValues57e5c961.set(this, "cols", newValue)}

    var placeholder : String
        get()  = attributeStringf30f39f0.get(this, "placeholder")
        set(newValue) {attributeStringf30f39f0.set(this, "placeholder", newValue)}

    var form : String
        get()  = attributeStringf30f39f0.get(this, "form")
        set(newValue) {attributeStringf30f39f0.set(this, "form", newValue)}

    var name : String
        get()  = attributeStringf30f39f0.get(this, "name")
        set(newValue) {attributeStringf30f39f0.set(this, "name", newValue)}


}

public class TFOOT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("tfoot", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class TH(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("th", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var scope : Scope
        get()  = attributeScopeScopeValues21bc3101.get(this, "scope")
        set(newValue) {attributeScopeScopeValues21bc3101.set(this, "scope", newValue)}

    var rowSpan : RowSpan
        get()  = attributeRowSpanRowSpanValues89c3b301.get(this, "rowspan")
        set(newValue) {attributeRowSpanRowSpanValues89c3b301.set(this, "rowspan", newValue)}

    var headers : String
        get()  = attributeStringf30f39f0.get(this, "headers")
        set(newValue) {attributeStringf30f39f0.set(this, "headers", newValue)}

    var colSpan : ColSpan
        get()  = attributeColSpanColSpanValues14bb341.get(this, "colspan")
        set(newValue) {attributeColSpanColSpanValues14bb341.set(this, "colspan", newValue)}


}

public class THEAD(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("thead", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class TIME(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("time", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var dateTime : String
        get()  = attributeStringf30f39f0.get(this, "datetime")
        set(newValue) {attributeStringf30f39f0.set(this, "datetime", newValue)}


}

public class TITLE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("title", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class TR(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("tr", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

