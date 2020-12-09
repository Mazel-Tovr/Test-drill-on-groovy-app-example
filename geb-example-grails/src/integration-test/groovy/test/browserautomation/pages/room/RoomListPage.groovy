package test.browserautomation.pages.room


import geb.Page
import test.browserautomation.modules.CreateModule
import test.browserautomation.modules.Nav
import test.browserautomation.modules.TableModule

class RoomListPage extends Page {

    static url = '/room/index'

    static at = {
        title == 'Room List'
    }

    static content = {
        table { $('div.content', 0).module(TableModule) }
        buttons { $('fieldset.buttons').module(CreateModule) }
        nav { $('div.nav').module(Nav) }
        message { $('div.message').text() }
    }

    String roomAt(int row) {
        table.textAt(0, 0)
    }
}
