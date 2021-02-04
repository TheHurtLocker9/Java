package com.lyx.demo;

import java.util.Objects;

/*
 *注意：由于 Hashcode和Equals方法常常共同使用，因此两方法需要共同重写！
 * hashcode是用于散列数据的快速存取，如利用HashSet/HashMap/Hashtable类来存储数据时，
 * 都是根据存储对象的hashcode值来进行判断是否相同的。如果我们将对象的equals方法重写而不重写hashcode，
 * 当我们再次new一个新的对象的时候，equals方法返回的是true，但是hashCode方法返回的就不一样了
 */
public class HashcodeAndEqualsOverride {
    private String testText;

    public HashcodeAndEqualsOverride(String testText) {
        this.testText = testText;
    }

    /**
     *
     * 重写equals方法：与内存去关联，只通过value值判定是否是同一对象，即成员变量相同的两个new认定为同一对象
     * 原Object的equals方法通过比较内存地址进行判断
     * 重写后equals方法通过同一类下成员变量testText的value值进行判断
     *
     * @param o 用来待比较的对象
     * @return T/F
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//通过比较内存地址判断与参数对象是否是this对象本身
        if (o == null || getClass() != o.getClass()) return false;//判断两对象的类型是否相同
        HashcodeAndEqualsOverride that = (HashcodeAndEqualsOverride) o;//预判操作，向下转向
        return testText.equals(that.testText);//调用String的equals方法比较testText的value值是否相同
    }

    /**
     * 重写hashCode方法，改变之前hashcode关联内存地址的计算方式
     * 重写后根据testText的value值进行哈希计算
     * @return hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(testText);//通过存储地址，字段等计算
    }
}
