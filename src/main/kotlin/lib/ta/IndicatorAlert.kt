package lib.ta

import lib.ta.alerts.ZonedAlert

interface IndicatorAlert {
    fun alert(bool: () -> Boolean): Boolean = bool()
}
