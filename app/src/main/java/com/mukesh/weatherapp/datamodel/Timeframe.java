
package com.mukesh.weatherapp.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Timeframe {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("utcdate")
    @Expose
    private String utcdate;
    @SerializedName("utctime")
    @Expose
    private Integer utctime;
    @SerializedName("wx_desc")
    @Expose
    private String wxDesc;
    @SerializedName("wx_code")
    @Expose
    private Integer wxCode;
    @SerializedName("wx_icon")
    @Expose
    private String wxIcon;
    @SerializedName("temp_c")
    @Expose
    private Double tempC;
    @SerializedName("temp_f")
    @Expose
    private Double tempF;
    @SerializedName("feelslike_c")
    @Expose
    private Double feelslikeC;
    @SerializedName("feelslike_f")
    @Expose
    private Double feelslikeF;
    @SerializedName("winddir_deg")
    @Expose
    private Integer winddirDeg;
    @SerializedName("winddir_compass")
    @Expose
    private String winddirCompass;
    @SerializedName("windspd_mph")
    @Expose
    private Integer windspdMph;
    @SerializedName("windspd_kmh")
    @Expose
    private Integer windspdKmh;
    @SerializedName("windspd_kts")
    @Expose
    private Integer windspdKts;
    @SerializedName("windspd_ms")
    @Expose
    private Double windspdMs;
    @SerializedName("windgst_mph")
    @Expose
    private Integer windgstMph;
    @SerializedName("windgst_kmh")
    @Expose
    private Integer windgstKmh;
    @SerializedName("windgst_kts")
    @Expose
    private Integer windgstKts;
    @SerializedName("windgst_ms")
    @Expose
    private Double windgstMs;
    @SerializedName("cloud_low_pct")
    @Expose
    private Integer cloudLowPct;
    @SerializedName("cloud_mid_pct")
    @Expose
    private Integer cloudMidPct;
    @SerializedName("cloud_high_pct")
    @Expose
    private Integer cloudHighPct;
    @SerializedName("cloudtotal_pct")
    @Expose
    private Integer cloudtotalPct;
    @SerializedName("precip_mm")
    @Expose
    private Integer precipMm;
    @SerializedName("precip_in")
    @Expose
    private Integer precipIn;
    @SerializedName("rain_mm")
    @Expose
    private Integer rainMm;
    @SerializedName("rain_in")
    @Expose
    private Integer rainIn;
    @SerializedName("snow_mm")
    @Expose
    private Integer snowMm;
    @SerializedName("snow_in")
    @Expose
    private Integer snowIn;
    @SerializedName("snow_accum_cm")
    @Expose
    private Integer snowAccumCm;
    @SerializedName("snow_accum_in")
    @Expose
    private Integer snowAccumIn;
    @SerializedName("prob_precip_pct")
    @Expose
    private String probPrecipPct;
    @SerializedName("humid_pct")
    @Expose
    private Integer humidPct;
    @SerializedName("dewpoint_c")
    @Expose
    private Double dewpointC;
    @SerializedName("dewpoint_f")
    @Expose
    private Double dewpointF;
    @SerializedName("vis_km")
    @Expose
    private Integer visKm;
    @SerializedName("vis_mi")
    @Expose
    private Double visMi;
    @SerializedName("slp_mb")
    @Expose
    private Integer slpMb;
    @SerializedName("slp_in")
    @Expose
    private Double slpIn;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getUtcdate() {
        return utcdate;
    }

    public void setUtcdate(String utcdate) {
        this.utcdate = utcdate;
    }

    public Integer getUtctime() {
        return utctime;
    }

    public void setUtctime(Integer utctime) {
        this.utctime = utctime;
    }

    public String getWxDesc() {
        return wxDesc;
    }

    public void setWxDesc(String wxDesc) {
        this.wxDesc = wxDesc;
    }

    public Integer getWxCode() {
        return wxCode;
    }

    public void setWxCode(Integer wxCode) {
        this.wxCode = wxCode;
    }

    public String getWxIcon() {
        return wxIcon;
    }

    public void setWxIcon(String wxIcon) {
        this.wxIcon = wxIcon;
    }

    public Double getTempC() {
        return tempC;
    }

    public void setTempC(Double tempC) {
        this.tempC = tempC;
    }

    public Double getTempF() {
        return tempF;
    }

    public void setTempF(Double tempF) {
        this.tempF = tempF;
    }

    public Double getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(Double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public Double getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(Double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public Integer getWinddirDeg() {
        return winddirDeg;
    }

    public void setWinddirDeg(Integer winddirDeg) {
        this.winddirDeg = winddirDeg;
    }

    public String getWinddirCompass() {
        return winddirCompass;
    }

    public void setWinddirCompass(String winddirCompass) {
        this.winddirCompass = winddirCompass;
    }

    public Integer getWindspdMph() {
        return windspdMph;
    }

    public void setWindspdMph(Integer windspdMph) {
        this.windspdMph = windspdMph;
    }

    public Integer getWindspdKmh() {
        return windspdKmh;
    }

    public void setWindspdKmh(Integer windspdKmh) {
        this.windspdKmh = windspdKmh;
    }

    public Integer getWindspdKts() {
        return windspdKts;
    }

    public void setWindspdKts(Integer windspdKts) {
        this.windspdKts = windspdKts;
    }

    public Double getWindspdMs() {
        return windspdMs;
    }

    public void setWindspdMs(Double windspdMs) {
        this.windspdMs = windspdMs;
    }

    public Integer getWindgstMph() {
        return windgstMph;
    }

    public void setWindgstMph(Integer windgstMph) {
        this.windgstMph = windgstMph;
    }

    public Integer getWindgstKmh() {
        return windgstKmh;
    }

    public void setWindgstKmh(Integer windgstKmh) {
        this.windgstKmh = windgstKmh;
    }

    public Integer getWindgstKts() {
        return windgstKts;
    }

    public void setWindgstKts(Integer windgstKts) {
        this.windgstKts = windgstKts;
    }

    public Double getWindgstMs() {
        return windgstMs;
    }

    public void setWindgstMs(Double windgstMs) {
        this.windgstMs = windgstMs;
    }

    public Integer getCloudLowPct() {
        return cloudLowPct;
    }

    public void setCloudLowPct(Integer cloudLowPct) {
        this.cloudLowPct = cloudLowPct;
    }

    public Integer getCloudMidPct() {
        return cloudMidPct;
    }

    public void setCloudMidPct(Integer cloudMidPct) {
        this.cloudMidPct = cloudMidPct;
    }

    public Integer getCloudHighPct() {
        return cloudHighPct;
    }

    public void setCloudHighPct(Integer cloudHighPct) {
        this.cloudHighPct = cloudHighPct;
    }

    public Integer getCloudtotalPct() {
        return cloudtotalPct;
    }

    public void setCloudtotalPct(Integer cloudtotalPct) {
        this.cloudtotalPct = cloudtotalPct;
    }

    public Integer getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(Integer precipMm) {
        this.precipMm = precipMm;
    }

    public Integer getPrecipIn() {
        return precipIn;
    }

    public void setPrecipIn(Integer precipIn) {
        this.precipIn = precipIn;
    }

    public Integer getRainMm() {
        return rainMm;
    }

    public void setRainMm(Integer rainMm) {
        this.rainMm = rainMm;
    }

    public Integer getRainIn() {
        return rainIn;
    }

    public void setRainIn(Integer rainIn) {
        this.rainIn = rainIn;
    }

    public Integer getSnowMm() {
        return snowMm;
    }

    public void setSnowMm(Integer snowMm) {
        this.snowMm = snowMm;
    }

    public Integer getSnowIn() {
        return snowIn;
    }

    public void setSnowIn(Integer snowIn) {
        this.snowIn = snowIn;
    }

    public Integer getSnowAccumCm() {
        return snowAccumCm;
    }

    public void setSnowAccumCm(Integer snowAccumCm) {
        this.snowAccumCm = snowAccumCm;
    }

    public Integer getSnowAccumIn() {
        return snowAccumIn;
    }

    public void setSnowAccumIn(Integer snowAccumIn) {
        this.snowAccumIn = snowAccumIn;
    }

    public String getProbPrecipPct() {
        return probPrecipPct;
    }

    public void setProbPrecipPct(String probPrecipPct) {
        this.probPrecipPct = probPrecipPct;
    }

    public Integer getHumidPct() {
        return humidPct;
    }

    public void setHumidPct(Integer humidPct) {
        this.humidPct = humidPct;
    }

    public Double getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(Double dewpointC) {
        this.dewpointC = dewpointC;
    }

    public Double getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(Double dewpointF) {
        this.dewpointF = dewpointF;
    }

    public Integer getVisKm() {
        return visKm;
    }

    public void setVisKm(Integer visKm) {
        this.visKm = visKm;
    }

    public Double getVisMi() {
        return visMi;
    }

    public void setVisMi(Double visMi) {
        this.visMi = visMi;
    }

    public Integer getSlpMb() {
        return slpMb;
    }

    public void setSlpMb(Integer slpMb) {
        this.slpMb = slpMb;
    }

    public Double getSlpIn() {
        return slpIn;
    }

    public void setSlpIn(Double slpIn) {
        this.slpIn = slpIn;
    }
}
