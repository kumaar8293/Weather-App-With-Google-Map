
package com.mukesh.weatherapp.datamodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Day {
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("sunrise_time")
    @Expose
    private String sunriseTime;
    @SerializedName("sunset_time")
    @Expose
    private String sunsetTime;
    @SerializedName("moonrise_time")
    @Expose
    private String moonriseTime;
    @SerializedName("moonset_time")
    @Expose
    private String moonsetTime;
    @SerializedName("temp_max_c")
    @Expose
    private Double tempMaxC;
    @SerializedName("temp_max_f")
    @Expose
    private Double tempMaxF;
    @SerializedName("temp_min_c")
    @Expose
    private Double tempMinC;
    @SerializedName("temp_min_f")
    @Expose
    private Double tempMinF;
    @SerializedName("precip_total_mm")
    @Expose
    private Integer precipTotalMm;
    @SerializedName("precip_total_in")
    @Expose
    private Integer precipTotalIn;
    @SerializedName("rain_total_mm")
    @Expose
    private Integer rainTotalMm;
    @SerializedName("rain_total_in")
    @Expose
    private Integer rainTotalIn;
    @SerializedName("snow_total_mm")
    @Expose
    private Integer snowTotalMm;
    @SerializedName("snow_total_in")
    @Expose
    private Integer snowTotalIn;
    @SerializedName("prob_precip_pct")
    @Expose
    private Integer probPrecipPct;
    @SerializedName("humid_max_pct")
    @Expose
    private Integer humidMaxPct;
    @SerializedName("humid_min_pct")
    @Expose
    private Integer humidMinPct;
    @SerializedName("windspd_max_mph")
    @Expose
    private Integer windspdMaxMph;
    @SerializedName("windspd_max_kmh")
    @Expose
    private Integer windspdMaxKmh;
    @SerializedName("windspd_max_kts")
    @Expose
    private Integer windspdMaxKts;
    @SerializedName("windspd_max_ms")
    @Expose
    private Double windspdMaxMs;
    @SerializedName("windgst_max_mph")
    @Expose
    private Integer windgstMaxMph;
    @SerializedName("windgst_max_kmh")
    @Expose
    private Integer windgstMaxKmh;
    @SerializedName("windgst_max_kts")
    @Expose
    private Integer windgstMaxKts;
    @SerializedName("windgst_max_ms")
    @Expose
    private Double windgstMaxMs;
    @SerializedName("slp_max_in")
    @Expose
    private Double slpMaxIn;
    @SerializedName("slp_max_mb")
    @Expose
    private Double slpMaxMb;
    @SerializedName("slp_min_in")
    @Expose
    private Double slpMinIn;
    @SerializedName("slp_min_mb")
    @Expose
    private Double slpMinMb;
    @SerializedName("Timeframes")
    @Expose
    private List<Timeframe> timeframes = null;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(String sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public String getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(String sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    public String getMoonriseTime() {
        return moonriseTime;
    }

    public void setMoonriseTime(String moonriseTime) {
        this.moonriseTime = moonriseTime;
    }

    public String getMoonsetTime() {
        return moonsetTime;
    }

    public void setMoonsetTime(String moonsetTime) {
        this.moonsetTime = moonsetTime;
    }

    public Double getTempMaxC() {
        return tempMaxC;
    }

    public void setTempMaxC(Double tempMaxC) {
        this.tempMaxC = tempMaxC;
    }

    public Double getTempMaxF() {
        return tempMaxF;
    }

    public void setTempMaxF(Double tempMaxF) {
        this.tempMaxF = tempMaxF;
    }

    public Double getTempMinC() {
        return tempMinC;
    }

    public void setTempMinC(Double tempMinC) {
        this.tempMinC = tempMinC;
    }

    public Double getTempMinF() {
        return tempMinF;
    }

    public void setTempMinF(Double tempMinF) {
        this.tempMinF = tempMinF;
    }

    public Integer getPrecipTotalMm() {
        return precipTotalMm;
    }

    public void setPrecipTotalMm(Integer precipTotalMm) {
        this.precipTotalMm = precipTotalMm;
    }

    public Integer getPrecipTotalIn() {
        return precipTotalIn;
    }

    public void setPrecipTotalIn(Integer precipTotalIn) {
        this.precipTotalIn = precipTotalIn;
    }

    public Integer getRainTotalMm() {
        return rainTotalMm;
    }

    public void setRainTotalMm(Integer rainTotalMm) {
        this.rainTotalMm = rainTotalMm;
    }

    public Integer getRainTotalIn() {
        return rainTotalIn;
    }

    public void setRainTotalIn(Integer rainTotalIn) {
        this.rainTotalIn = rainTotalIn;
    }

    public Integer getSnowTotalMm() {
        return snowTotalMm;
    }

    public void setSnowTotalMm(Integer snowTotalMm) {
        this.snowTotalMm = snowTotalMm;
    }

    public Integer getSnowTotalIn() {
        return snowTotalIn;
    }

    public void setSnowTotalIn(Integer snowTotalIn) {
        this.snowTotalIn = snowTotalIn;
    }

    public Integer getProbPrecipPct() {
        return probPrecipPct;
    }

    public void setProbPrecipPct(Integer probPrecipPct) {
        this.probPrecipPct = probPrecipPct;
    }

    public Integer getHumidMaxPct() {
        return humidMaxPct;
    }

    public void setHumidMaxPct(Integer humidMaxPct) {
        this.humidMaxPct = humidMaxPct;
    }

    public Integer getHumidMinPct() {
        return humidMinPct;
    }

    public void setHumidMinPct(Integer humidMinPct) {
        this.humidMinPct = humidMinPct;
    }

    public Integer getWindspdMaxMph() {
        return windspdMaxMph;
    }

    public void setWindspdMaxMph(Integer windspdMaxMph) {
        this.windspdMaxMph = windspdMaxMph;
    }

    public Integer getWindspdMaxKmh() {
        return windspdMaxKmh;
    }

    public void setWindspdMaxKmh(Integer windspdMaxKmh) {
        this.windspdMaxKmh = windspdMaxKmh;
    }

    public Integer getWindspdMaxKts() {
        return windspdMaxKts;
    }

    public void setWindspdMaxKts(Integer windspdMaxKts) {
        this.windspdMaxKts = windspdMaxKts;
    }

    public Double getWindspdMaxMs() {
        return windspdMaxMs;
    }

    public void setWindspdMaxMs(Double windspdMaxMs) {
        this.windspdMaxMs = windspdMaxMs;
    }

    public Integer getWindgstMaxMph() {
        return windgstMaxMph;
    }

    public void setWindgstMaxMph(Integer windgstMaxMph) {
        this.windgstMaxMph = windgstMaxMph;
    }

    public Integer getWindgstMaxKmh() {
        return windgstMaxKmh;
    }

    public void setWindgstMaxKmh(Integer windgstMaxKmh) {
        this.windgstMaxKmh = windgstMaxKmh;
    }

    public Integer getWindgstMaxKts() {
        return windgstMaxKts;
    }

    public void setWindgstMaxKts(Integer windgstMaxKts) {
        this.windgstMaxKts = windgstMaxKts;
    }

    public Double getWindgstMaxMs() {
        return windgstMaxMs;
    }

    public void setWindgstMaxMs(Double windgstMaxMs) {
        this.windgstMaxMs = windgstMaxMs;
    }

    public Double getSlpMaxIn() {
        return slpMaxIn;
    }

    public void setSlpMaxIn(Double slpMaxIn) {
        this.slpMaxIn = slpMaxIn;
    }

    public Double getSlpMaxMb() {
        return slpMaxMb;
    }

    public void setSlpMaxMb(Double slpMaxMb) {
        this.slpMaxMb = slpMaxMb;
    }

    public Double getSlpMinIn() {
        return slpMinIn;
    }

    public void setSlpMinIn(Double slpMinIn) {
        this.slpMinIn = slpMinIn;
    }

    public Double getSlpMinMb() {
        return slpMinMb;
    }

    public void setSlpMinMb(Double slpMinMb) {
        this.slpMinMb = slpMinMb;
    }

    public List<Timeframe> getTimeframes() {
        return timeframes;
    }

    public void setTimeframes(List<Timeframe> timeframes) {
        this.timeframes = timeframes;
    }

}
