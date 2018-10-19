package com.design.pattern.迭代.黑箱聚集与内禀迭代子;

/*******************************************************************************
 *
 * @date 2018-10-19 上午 11:00 
 * @author: <a href=mailto:huangyr@.com>黄跃然</a>
 * @Description: 迭代子抽象
 ******************************************************************************/
public interface Iterator {

    /**
     * 移动到第一个
     */
    public void first();

    /**
     * 返回当前对象，并将游标移动到下一个
     */
    public Object next();

    public Boolean hasNext();

}
