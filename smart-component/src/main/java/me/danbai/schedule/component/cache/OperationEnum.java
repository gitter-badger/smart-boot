package me.danbai.schedule.component.cache;

/**
 * 操作枚举
 *
 * @author 三刀
 * @version v0.1 2015年11月06日 下午1:46 Seer Exp.
 */
public enum OperationEnum {

    /**
     * 读取， 需要读取和刷新缓存
     */
    READ,

    /**
     * 写， 需要清空缓存
     */
    WRITE;


}