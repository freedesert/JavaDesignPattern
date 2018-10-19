package com.design.pattern.迭代.黑箱聚集与内禀迭代子;

/*******************************************************************************
 * @date 2018-10-19 上午 11:03
 * @author: <a href=mailto:huangyr@.com>黄跃然</a>
 * @Description: 黑箱聚集与内禀迭代子
 ******************************************************************************/
public class ConcreteAggregate extends Aggregate {

    private Object[] datas;

    public ConcreteAggregate(Object[] datas) {
        this.datas = datas;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator();
    }

    class ConcreteIterator implements Iterator {

        private Integer index;
        private Integer size;

        public ConcreteIterator() {
            this.size = datas.length;
            this.index = 0;
        }

        @Override
        public void first() {
            index = 0;
        }

        @Override
        public Object next() {
            return datas[index++];
        }

        @Override
        public Boolean hasNext() {
            return index < size;
        }
    }

}
