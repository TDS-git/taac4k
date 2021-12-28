package lib.taac4k.analysis.ta.ta4j.indicators

import lib.taac4k.analysis.ta.IndicatorConditions
import lib.taac4k.analysis.ta.conditions.OBVConditions
import lib.taac4k.analysis.ta.ta4j.indicators.helpers.Close
import lib.taac4k.markets.data.adapter.MarketDataAdapter
import lib.taac4k.markets.data.adapter.BaseMarketDataAdapter
import org.ta4j.core.indicators.volume.OnBalanceVolumeIndicator

open class OBV(
    open val close: Close,

    override val adapter: BaseMarketDataAdapter = MarketDataAdapter(),
    override val rawIndicator: OnBalanceVolumeIndicator = OnBalanceVolumeIndicator(adapter.convert(close.marketDataList)),
    override val conditions: OBVConditions

) : IndicatorConditions<OBVConditions>