package test.browserautomation.pages.extra


import geb.Page
import test.browserautomation.modules.CreateModule
import test.browserautomation.modules.Nav
import test.browserautomation.modules.TableModule

class ExtraListPage extends Page {

    static url = '/extra/index'

    static at = {
        title == 'Extra List'
    }

    static content = {
        table { $('div.content', 0).module(TableModule) }
        buttons { $('fieldset.buttons').module(CreateModule) }
        nav { $('div.nav').module(Nav) }
        message { $('div.message').text() }
    }

    String extraAt(int row) {
        table.textAt(0, 0)
    }

}
