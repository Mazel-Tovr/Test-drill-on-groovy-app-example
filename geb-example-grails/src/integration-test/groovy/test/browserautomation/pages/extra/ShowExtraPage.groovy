package test.browserautomation.pages.extra


import geb.Page
import test.browserautomation.modules.CreateEditDeleteModule
import test.browserautomation.modules.Nav

class ShowExtraPage extends Page {
    static at = {
        title == 'Show Extra'
    }

    static url = '/extra/show'

    String convertToPath(Object[] args) {
        args ? "/${args[0]}" : ""
    }

    static content = {
        row { $('li.fieldcontain .property-label', text: it).parent() }
        value { row(it).find('.property-value').text() }
        buttons { $('fieldset.buttons').module(CreateEditDeleteModule) }
        nav { $('div.nav').module(Nav) }
    }

    String getName() {
        value('Name')
    }
}
