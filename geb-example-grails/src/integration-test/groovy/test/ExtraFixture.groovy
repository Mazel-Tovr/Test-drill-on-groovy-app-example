package test

import demo.Extra
import demo.ExtraDataService
import groovy.transform.CompileStatic

@CompileStatic
trait ExtraFixture {
    abstract ExtraDataService getExtraDataService()

    Extra saveExtra(String extra) {
        extraDataService.save(extra)
    }

    List<Extra> saveExtras(List<String> extraNames) {
        extraNames.collect { saveExtra(it)}
    }

    void deleteExtras(List<Extra> extras) {
        extras.each { extraDataService.delete(it.id) }
    }
}
