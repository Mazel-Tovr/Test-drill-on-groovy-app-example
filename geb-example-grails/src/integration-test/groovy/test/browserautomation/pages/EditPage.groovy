package test.browserautomation.pages


import geb.Page
import geb.module.TextInput
import test.browserautomation.TextInputUtils
import test.browserautomation.modules.UpdateDeleteModule

class EditPage extends Page implements TextInputUtils {
    static content = {
        inputField { $('input', name: it).module(TextInput) }
        buttons { $('fieldset.buttons').module(UpdateDeleteModule) }
    }

    void setName(String name) {
        clearTextInput('name')
        populate('name', name)
    }

    String getName() {
        inputField('name').text
    }
}
