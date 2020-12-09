package test.browserautomation.pages.booking

import test.browserautomation.modules.CreateModule
import test.browserautomation.modules.Nav
import test.browserautomation.modules.TableModule
import geb.Page

class BookingListPage extends Page {

	static url = '/booking/index'

	static at = {
		title == 'Booking List'
	}

	static content = {
		buttons { $('fieldset.buttons').module(CreateModule) }
		table { $('div.content', 0).module(TableModule) }
		nav { $('div.nav').module(Nav) }
		message { $('div.message').text() }
	}
}
