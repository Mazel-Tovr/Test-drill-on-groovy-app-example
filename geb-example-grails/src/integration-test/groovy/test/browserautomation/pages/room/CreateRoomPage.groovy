package test.browserautomation.pages.room


import geb.Page
import geb.module.TextInput
import test.browserautomation.modules.Nav

class CreateRoomPage extends Page {

    static at = {
        title == 'Create Room'
    }

    static url = '/room/create'

    static content = {
        inputField {
            $('input', name: it).module(TextInput)
        }
        saveButton {
            $('input', type: 'submit')
        }
        nav { $('div.nav').module(Nav) }
    }

    void setName(String name) {
        populate('name', name)
    }

    void save() {
        saveButton.click()
    }

    protected void populate(String inputFieldName, String value) {
        inputField(inputFieldName).text = value
    }
}
