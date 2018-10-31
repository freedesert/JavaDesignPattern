package com.design.pattern.命令.receiver;

/*******************************************************************************
 *
 * @date 2018-10-18 下午 2:59 
 * @author: <a href=mailto:huangyr>黄跃然</a>
 * @Description:
 ******************************************************************************/
public class OracleReceiver implements Receiver {

    public void createData() {
        System.out.println("create data. --Oracle");
    }

    public void deleteData() {
        System.out.println("delete data. --Oracle");
    }

    public void updateDate() {
        System.out.println("update data. --Oracle");
    }

    public void selectData() {
        System.out.println("select data. --Oracle");
    }

}
