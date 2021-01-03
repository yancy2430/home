package com.tdeado.smart.home.service;

/**
 * 鱼缸
 */
public interface FishTankService {

    /**
     * 设置加热棒
     * @param bool true开 false关
     * @return 执行结果
     */
    public Boolean setHeating(Boolean bool);

    /**
     * 获取加热棒状态
     * @return
     */
    public Boolean getHeating();

    /**
     * 设置过滤开关
     * @param bool true开 false关
     * @return 执行结果
     */
    public Boolean setFilter(Boolean bool);
    /**
     * 获取过滤开关状态
     * @return 执行结果
     */
    public Boolean getFilter(Boolean bool);

    /**
     * 设置造浪泵
     * @param bool true开 false关
     * @return 执行结果
     */
    public Boolean setMakeWaves(Boolean bool);
    /**
     * 获取造浪泵状态
     * @return 执行结果
     */
    public Boolean getMakeWaves(Boolean bool);

    /**
     * 设置水温
     * @param temperature 目标水温
     * @return 执行结果
     */
    public Boolean setWaterTemperature(int temperature);

    /**
     * 获取水温
     * @return 水温
     */
    public Double getWaterTemperature();

}
