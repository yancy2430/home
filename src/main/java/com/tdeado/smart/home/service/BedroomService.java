package com.tdeado.smart.home.service;

/**
 * 卧室
 */
public interface BedroomService {
    /**
     * 获取台灯状态
     * @return
     */
    public Boolean getTableLamp();
    /**
     * 设置台灯状态
     * @param bool 开true 关false
     * @return
     */
    public Boolean setTableLamp(Boolean bool);

    /**
     * 获取顶灯状态
     * @return
     */
    public Boolean getDomeLight();

    /**
     * 设置顶灯状态
     * @param bool 开true 关false
     * @return
     */
    public Boolean setDomeLight(Boolean bool);

    /**
     * 获取暖气状态
     * @return
     */
    public Boolean getHeating();

    /**
     * 设置暖气状态
     * @param bool 开true 关false
     * @return
     */
    public Boolean setHeating(Boolean bool);

    /**
     * 获取火箱状态
     * @return
     */
    public Boolean getFireBox();

    /**
     * 设置火箱状态
     * @param bool 开true 关false
     * @return
     */
    public Boolean setFireBox(Boolean bool);
}
